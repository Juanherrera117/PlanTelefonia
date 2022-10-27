package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame 
{
        public PanelEntradaDatos miPanelEntrada;
        public PanelOperaciones miPanelProceso;
        public PanelResultados miPanelSalida;

        public VentanaPrincipal() 
        {
                miPanelEntrada = new PanelEntradaDatos();
                miPanelEntrada.setBounds(10, 10, 530, 220);

                miPanelProceso = new PanelOperaciones();
                miPanelProceso.setBounds(10, 240, 530, 80);

                miPanelSalida = new PanelResultados();
                miPanelSalida.setBounds(10, 330, 530, 140);

                this.setTitle("Telefonía");
                this.setSize(558, 512);
                this.setResizable(false);
                this.setLocationRelativeTo(null);
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                this.setVisible(true);
                this.setLayout(null);
                this.add(miPanelEntrada);
                this.add(miPanelProceso);
                this.add(miPanelSalida);
        }
}
