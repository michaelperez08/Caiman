/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author michael
 */
public class BL_Imprimir implements Printable {

    private BL_Factura factura;
    SimpleDateFormat df;
    String os = System.getProperty("os.name").toLowerCase();
    
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        
        df = new SimpleDateFormat("dd-MM-yyyy");
        
        if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        }

        
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        if (os.equals("linux")) {
            g2d.setFont(new Font("Droid Sans Mono", Font.PLAIN, 10));
        }else{
            g2d.setFont(new Font("Monaco", Font.PLAIN, 10));
        }
        
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(factura.getFechaFactura());
        
        graphics.drawString(String.valueOf(calendario.get(Calendar.DAY_OF_MONTH)), 430, 50); // Dia factura
        graphics.drawString(String.valueOf(calendario.get(Calendar.MONTH)+1), 490, 50);  // Mes Factura
        graphics.drawString(String.valueOf(calendario.get(Calendar.YEAR)), 545, 50);  // Año Factura
        graphics.drawString(factura.getNombreCliente(), 80, 70);  // Nombre Cliente
        graphics.drawString(factura.getDireccionCliente(), 80, 85);  // Direccion

        graphics.drawString(df.format(factura.getFechaExpiracion()), 450, 85);  // Fecha Vencimiento
        graphics.drawString(factura.getTelefonoCliente(), 440, 70);  // Telefono
       
        graphics.drawString(String.valueOf(String.format(Locale.ROOT,"%1$,12.2f", factura.getSubtotal())), 500, 265);  // Subtotal
        graphics.drawString(String.valueOf(String.format(Locale.ROOT,"%1$,12.2f", factura.getImpVenta())), 500, 285);  // Imp Ventas
        graphics.drawString(String.valueOf(String.format(Locale.ROOT,"%1$,12.2f", factura.getPrecioTotal())), 500, 305);  // Total
        
        int i=0;
        for (BL_LineaFactura linea : factura.getListaLineaFactura()) {
            graphics.drawString(String.valueOf(linea.getCantidad()), 40, 130+(i*20));  // Cantidad
            graphics.drawString(linea.getDetalle(), 90, 130+(i*20));  // Detalle
            graphics.drawString(String.valueOf(String.format(Locale.ROOT,"%1$,12.2f", linea.getPrecioUnitario())), 410, 130+(i*20));  // Precio Unitario
            graphics.drawString(String.valueOf(String.format(Locale.ROOT,"%1$,12.2f", linea.getPrecioTotalLinea())), 500, 130+(i*20));  // Precio Linea
            i++;
        }
        
        return PAGE_EXISTS;
    }
    
    public void imprimirFactura(BL_Factura factura) {
        this.factura = factura;
        PrinterJob pj = PrinterJob.getPrinterJob();
        PageFormat format = pj.getPageFormat(null);
        Paper paper = format.getPaper();
        paper.setImageableArea(0.0, 0.0, format.getPaper().getWidth(), format.getPaper().getHeight());
        format.setPaper(paper);
        pj.setPrintable(this, format);
        
        boolean ok = pj.printDialog();
        if (ok) {
            try {
                pj.print();
            } catch (PrinterException ex) {
                
            }
        }
    }

    public void imprimir() {
        PrinterJob pj = PrinterJob.getPrinterJob();
        PageFormat format = pj.getPageFormat(null);
        Paper paper = format.getPaper();
//Remove borders from the paper
        paper.setImageableArea(0.0, 0.0, format.getPaper().getWidth(), format.getPaper().getHeight());
        format.setPaper(paper);
        pj.setPrintable(this, format);
//        for (int i = 0; i < 400; i+=20) {
//            for (int j = 0; j < 600; j+=20) {
//                System.out.print((i+j)/20+"=("+(j)+", "+i+") ");
//            }
//            System.out.println("\n");
//        }
        boolean ok = pj.printDialog();
        if (ok) {
            try {
                pj.print();
            } catch (PrinterException ex) {
                /* The job did not successfully complete */
            }
        }
        
    }

}
