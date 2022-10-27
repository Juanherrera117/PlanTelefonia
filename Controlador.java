package controlador;

import modelo.PlanTelefonia;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener 
{
        private VentanaPrincipal miVentanaPrincipal;
        private PlanTelefonia modelo;

        public Controlador(VentanaPrincipal miVentanaPrincipal, PlanTelefonia modelo) 
        {
                this.miVentanaPrincipal = miVentanaPrincipal;
                this.modelo = modelo;
                this.miVentanaPrincipal.miPanelProceso.btnCalcular.addActionListener(this);
                this.miVentanaPrincipal.miPanelProceso.btnBorrar.addActionListener(this);
                this.miVentanaPrincipal.miPanelProceso.btnSalir.addActionListener(this);
        }

        public void actionPerformed(ActionEvent ae) 
        {
                String comando = ae.getActionCommand();

                if (comando.equals("calcularMayor")) 
                {
                        try 
                        {
                                this.modelo.setNumeroCelular(vista.PanelEntradaDatos.getTfNumero());
                                this.modelo.setOperadorCelular(vista.PanelEntradaDatos.getTfOperador());
                                this.modelo.setCantidadMinutos(Integer.parseInt(vista.PanelEntradaDatos.getTfMinutos()));
                                this.modelo.setCostoMinuto(Double.parseDouble(vista.PanelEntradaDatos.getTfCosto()));
                                this.modelo.calcularCostoTotal();
                                if (this.modelo.getOperadorCelular().equals("Movilujo")) 
                                {
                                        this.miVentanaPrincipal.miPanelSalida
                                                        .mostrarResultados(this.modelo.toString()
                                                                        + "\nCantidad de descuento: 50%");
                                } 
                                else 
                                {
                                        this.miVentanaPrincipal.miPanelSalida
                                                        .mostrarResultados(this.modelo.toString()
                                                                        + "\nCantidad de descuento: 0%");
                                }
                        }
                        catch (Exception ex) 
                        {
                                JOptionPane.showMessageDialog(null, "Datos incorrectos.\nLos datos deben ser enteros!",
                                                "Suma 3 Enteros", JOptionPane.ERROR_MESSAGE);
                                vista.PanelEntradaDatos.borrarTf();
                        }
                } 
                else if (comando.equals("borrarTexto")) 
                {
                        vista.PanelEntradaDatos.borrarTf();
                        this.miVentanaPrincipal.miPanelSalida.borrarTa();
                } 
                else if (comando.equals("cerrarVentana")) 
                {
                        JOptionPane.showMessageDialog(null, "El programa se cerrará...", "Suma 3 Enteros",
                                        JOptionPane.WARNING_MESSAGE);
                        System.exit(0);
                }
        }
}
