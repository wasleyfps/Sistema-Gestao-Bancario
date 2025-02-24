package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    JLabel jLabel1, jLabel2, jLabel3;
    Login(){
        super("Sistema de Gestão Bancário");
        
        setLayout(null);
        setSize(850,480);
        setLocation(450,200);

        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image image2 = image1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel image = new JLabel(image3);
        image.setBounds(350,10,100,100);
        add(image);
        
        ImageIcon image4 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image image5 = image4.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon image6 = new ImageIcon(image5);
        JLabel image7 = new JLabel(image6);
        image7.setBounds(630,350,100,100);
        add(image7);

        jLabel1 = new JLabel("BEM-VINDO AO CAIXA ELETRÔNICO");
        jLabel1.setForeground(Color.white);
        jLabel1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        jLabel1.setBounds(230, 125, 450, 40);
        add(jLabel1);
        
        jLabel2 = new JLabel("Cartão: ");
        jLabel2.setFont(new Font("Ralway", Font.BOLD, 28));
        jLabel2.setForeground(Color.white);
        jLabel2.setBounds(150, 190,375,30);
        add(jLabel2);

        ImageIcon image8 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image image9 = image8.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon image10 = new ImageIcon(image9);
        JLabel image11 = new JLabel(image10);
        image11.setBounds(0,0,850,480);
        add(image11);
        
        setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }
}
