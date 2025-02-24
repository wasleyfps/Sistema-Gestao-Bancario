package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    Login(){
        super("Sistema de Gestão Bancário");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        
        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }
}
