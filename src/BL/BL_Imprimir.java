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

/**
 *
 * @author michael
 */
public class BL_Imprimir implements Printable {

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        // We have only one page, and 'page'
        // is zero-based
        if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        }

        // User (0,0) is typically outside the
        // imageable area, so we must translate
        // by the X and Y values in the PageFormat
        // to avoid clipping.
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

        // Now we perform our rendering
        //graphics.drawString("Hello world!", j, i);
        for (int i = 0; i < 450; i+=20) {
            for (int j = 0; j < 400; j+=20) {
                System.out.println((i+j)/20+"=("+(j)+", "+i+") ");
            }
        }
        // tell the caller that this page is part
        // of the printed document
        return PAGE_EXISTS;
    }

    public void imprimir() {
        PrinterJob pj = PrinterJob.getPrinterJob();
        PageFormat format = pj.getPageFormat(null);
        Paper paper = format.getPaper();
//Remove borders from the paper
        paper.setImageableArea(0.0, 0.0, format.getPaper().getWidth(), format.getPaper().getHeight());
        format.setPaper(paper);
        pj.setPrintable(this, format);
        for (int i = 0; i < 400; i+=20) {
            for (int j = 0; j < 600; j+=20) {
                System.out.print((i+j)/20+"=("+(j)+", "+i+") ");
            }
            System.out.println("\n");
        }
//        boolean ok = pj.printDialog();
//        if (ok) {
//            try {
//                pj.print();
//            } catch (PrinterException ex) {
//                /* The job did not successfully complete */
//            }
//        }
        
    }

}
