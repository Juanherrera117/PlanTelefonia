package vista;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class PanelEntradaDatos extends JPanel 
{
        private JLabel lbTitulo;
        private JLabel lbNumero;
        private JLabel lbOperador;
        private JLabel lbMinutos;
        private JLabel lbCosto;
        private static JTextField tfNumero;
        private static JComboBox<String> cbOperador;
        private static JTextField tfMinutos;
        private static JTextField tfCosto;

        public PanelEntradaDatos() 
        {
                lbTitulo = new JLabel("PLAN DE TELEFONÍA", SwingConstants.CENTER);
                lbTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
                lbTitulo.setForeground(Color.BLACK);
                lbTitulo.setBounds(0, 10, 558, 30);

                lbNumero = new JLabel("Número =");
                lbNumero.setFont(new Font("Times New Roman", Font.PLAIN, 18));
                lbNumero.setForeground(Color.BLACK);
                lbNumero.setBounds(80, 55, 480, 30);

                tfNumero = new JTextField();
                tfNumero.setFont(new Font("Times New Roman", Font.PLAIN, 18));
                tfNumero.setForeground(Color.BLACK);
                tfNumero.setBounds(200, 55, 220, 30);

                lbOperador = new JLabel("Operador =");
                lbOperador.setFont(new Font("Times New Roman", Font.PLAIN, 18));
                lbOperador.setForeground(Color.BLACK);
                lbOperador.setBounds(80, 95, 480, 30);

                String[] empresasOperadores = { "Avantel", "Claro", "Movilujo", "Tigo", "WOM" };
                cbOperador = new JComboBox<>(empresasOperadores);
                cbOperador.setSelectedIndex(0);
                cbOperador.setFont(new Font("Times New Roman", Font.PLAIN, 18));
                cbOperador.setForeground(Color.BLACK);
                cbOperador.setBounds(200, 95, 220, 30);

                lbMinutos = new JLabel("Minutos =");
                lbMinutos.setFont(new Font("Times New Roman", Font.PLAIN, 18));
                lbMinutos.setForeground(Color.BLACK);
                lbMinutos.setBounds(80, 135, 480, 30);

                tfMinutos = new JTextField();
                tfMinutos.setFont(new Font("Times New Roman", Font.PLAIN, 18));
                tfMinutos.setForeground(Color.BLACK);
                tfMinutos.setBounds(200, 135, 220, 30);

                lbCosto = new JLabel("Costo =");
                lbCosto.setFont(new Font("Times New Roman", Font.PLAIN, 18));
                lbCosto.setForeground(Color.BLACK);
                lbCosto.setBounds(80, 175, 480, 30);

                tfCosto = new JTextField();
                tfCosto.setFont(new Font("Times New Roman", Font.PLAIN, 18));
                tfCosto.setForeground(Color.BLACK);
                tfCosto.setBounds(200, 175, 220, 30);

                this.setLayout(null);
                this.setBackground(Color.decode("#216bb0"));
                this.setVisible(true);
                this.add(lbTitulo);
                this.add(lbNumero);
                this.add(tfNumero);
                this.add(lbOperador);
                this.add(cbOperador);
                this.add(lbMinutos);
                this.add(tfMinutos);
                this.add(lbCosto);
                this.add(tfCosto);
        }

        public static String getTfNumero() 
        {
                return tfNumero.getText();
        }

        public static String getTfOperador() 
        {
                return cbOperador.getSelectedItem().toString();
        }

        public static String getTfMinutos() 
        {
                return tfMinutos.getText();
        }

        public static String getTfCosto() 
        {
                return tfCosto.getText();
        }

        public static void borrarTf() 
        {
                JOptionPane.showMessageDialog(null, "Los datos serán borrados...", "Suma 3 Enteros",
                                JOptionPane.WARNING_MESSAGE);
                tfNumero.setText("");
                cbOperador.setSelectedIndex(0);
                tfMinutos.setText("");
                tfCosto.setText("");
                PanelResultados.taResultados.setText("");
        }
}
