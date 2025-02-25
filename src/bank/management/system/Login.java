package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1, button2, button3;
    
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

        label1 = new JLabel("BEM-VINDO AO CAIXA ELETRÔNICO");
        label1.setForeground(Color.white);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(230, 125, 450, 40);
        add(label1);
        
        label2 = new JLabel("Cartão: ");
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.white);
        label2.setBounds(150, 190,375,30);
        add(label2);
        
        
        
        
        textField2 = new JTextField(15); 
        textField2.setBounds(300, 190, 230, 30);
        textField2.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField2);
        
        label3 = new JLabel("Senha: ");
        label3.setFont(new Font("Ralway", Font.BOLD, 28));
        label3.setForeground(Color.white);
        label3.setBounds(150, 250,375,30);
        add(label3);
        
        passwordField3 = new JPasswordField();
        passwordField3.setBounds(300, 250, 230, 30);
        passwordField3.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField3);
        
        button1 = new JButton("Entrar");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setForeground(Color.white);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300,300,100,30);
        button1.getActionListeners(this);
        add(button1);

        button2 = new JButton("Limpar");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setForeground(Color.white);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430,300,100,30);
        button2.getActionListeners(this);
        add(button2);
        
        button3 = new JButton("Criar Conta");
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setForeground(Color.white);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300,350,230,30);
        button3.getActionListeners(this);
        add(button3);
        
        
        ImageIcon image8 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image image9 = image8.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon image10 = new ImageIcon(image9);
        JLabel image11 = new JLabel(image10);
        image11.setBounds(0,0,850,480);
        add(image11);
        
        setLayout(null);
        setSize(850, 480);
        setLocation(450,200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == button1) {
                
            } else if (e.getSource() == button2){
                textField2.setText(" ");
                passwordField3.setText(" ");
            } else if (e.getSource() == button3){
                
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
