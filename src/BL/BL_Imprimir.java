/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author michael
 */
public class BL_Imprimir implements Printable {

    private BL_Factura factura;
    SimpleDateFormat df;
    
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        
        df = new SimpleDateFormat("dd-MM-yyyy");
        
        if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        }

        
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        
        Calendar calendario = Calendar.getInstance();  
        calendario.setTime(factura.getFechaFactura());
        
        graphics.drawString(String.valueOf(calendario.get(Calendar.DAY_OF_MONTH)), 420, 60); // Dia factura
        graphics.drawString(String.valueOf(calendario.get(Calendar.MONTH)+1), 480, 60);  // Mes Factura
        graphics.drawString(String.valueOf(calendario.get(Calendar.YEAR)), 540, 60);  // Año Factura
        graphics.drawString(factura.getNombreCliente(), 80, 80);  // Nombre Cliente
        graphics.drawString(factura.getDireccionCliente(), 80, 100);  // Direccion

        graphics.drawString(df.format(factura.getFechaExpiracion()), 440, 100);  // Fecha Vencimiento
        graphics.drawString(factura.getTelefonoCliente(), 440, 80);  // Telefono
       
        graphics.drawString(String.valueOf(factura.getSubtotal()), 520, 280);  // Subtotal
        graphics.drawString(String.valueOf(factura.getImpVenta()), 520, 300);  // Imp Ventas
        graphics.drawString(String.valueOf(factura.getPrecioTotal()), 520, 320);  // Total
        
        int i=0;
        for (BL_LineaFactura linea : factura.getListaLineaFactura()) {
            graphics.drawString(String.valueOf(linea.getCantidad()), 40, 140+(i*20));  // Cantidad
            graphics.drawString(linea.getDetalle(), 80, 140+(i*20));  // Detalle
            graphics.drawString(String.valueOf(linea.getPrecioUnitario()), 420, 140+(i*20));  // Precio Unitario
            graphics.drawString(String.valueOf(linea.getPrecioTotalLinea()), 520, 140+(i*20));  // Precio Linea
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
