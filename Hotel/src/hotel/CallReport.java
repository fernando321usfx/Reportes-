/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Fernando
 */
public final class CallReport {
    //Metodo abrir Reporte jasper
    public void abrirReporte(String ruta_archivo, Connection cnx){
       try{
           JasperReport report = JasperCompileManager.compileReport(ruta_archivo);
           JasperPrint print = JasperFillManager.fillReport(report, new HashMap(), cnx);
           JasperViewer.viewReport(print, false);
       } catch (JRException jRException){
           System.err.println(jRException.getMessage());
           JOptionPane.showMessageDialog(null, "Error al intentar abrir el reporte");
       }
    }
    //Metodo abrir reporte jasper con parametros
    public void abrirReporte(String ruta_archivo, Connection cnx, Map parametros){
       try{
           JasperReport report = JasperCompileManager.compileReport(ruta_archivo);
           JasperPrint print = JasperFillManager.fillReport(report, parametros, cnx);
           JasperViewer.viewReport(print, false);
       } catch (JRException jRException){
           System.err.println(jRException.getMessage());
           JOptionPane.showMessageDialog(null, "Error al intentar abrir el reporte");
       }
    }
}
