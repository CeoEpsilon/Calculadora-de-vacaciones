import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Bienvenida extends JFrame implements ActionListener
{
    private JLabel label1, label2, label3, label4;
    private JTextField textfield1;
    private JButton boton1;
    public static String texto = "";

    public Bienvenida()
    {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Diseño de barra
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color (255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        //Diseño label con logo de cocacola 
        ImageIcon imagen = new ImageIcon("images/logo-coca.png");
        label1= new JLabel(imagen);
        label1.setBounds(25,15,300,150);
        add(label1);
        //Diseño nombre del sistema
        label2 = new JLabel("Sistema de Control Vacacional");
        label2.setBounds(35,135,300,30);
        label2.setFont(new Font("Andale Mono", 3,18));
        label2.setForeground(new Color(255,255,255));
        add(label2);
        // Diseño label ingreso de nombre
        label3 = new JLabel("Ingrese su nombre");
        label3.setBounds(45,212,200,30);
        label3.setFont(new Font("Andale Mono", 1,12));
        label3.setForeground(new Color(255,255,255));
        add(label3);
        //Diseño de label patente Coca Cola
        label4 = new JLabel("©2017 The Coca-Cola Company");
        label4.setBounds(85,375,300,30);
        label4.setFont(new Font("Andale Mono", 1,12));
        label4.setForeground(new Color(255,255,255));
        add(label4);
        //Diseño caja de texto
        textfield1 = new JTextField ();
        textfield1.setBounds(45,240,255,25);
        textfield1.setBackground(new Color(224,224,224));
        textfield1.setFont(new Font("Andale Mono", 1, 14));
        textfield1.setForeground(new Color(255,0,0));
        add(textfield1);
        //Diseño de boton ingreso
        boton1 = new JButton("ingresar");
        boton1.setBounds(125,280,100,30);
        boton1.setBackground(new Color (255,255,255));
        boton1.setFont(new Font("Andale Mono",1,14));
        boton1.setForeground(new Color(255,0,0));
        boton1.addActionListener(this);
        add(boton1);      
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == boton1){
            texto = textfield1.getText().trim();
            if(texto.equals("")){
                JOptionPane.showMessageDialog(null,"Debes ingresar tu nombre");        
            }else{
                Licencia ventanaLicencia = new Licencia ();
                ventanaLicencia.setBounds(0,0,600,360);
                ventanaLicencia.setVisible(true);
                ventanaLicencia.setResizable(false);
                ventanaLicencia.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }
    }

    public static void main(String args[]){
        Bienvenida ventanaBienvenida = new Bienvenida();
        ventanaBienvenida.setBounds(0,0,350,450);
        ventanaBienvenida.setVisible(true);
        ventanaBienvenida.setResizable(false);
        ventanaBienvenida.setLocationRelativeTo(null);            
    }
}
