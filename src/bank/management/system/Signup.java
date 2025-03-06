package bank.management.system;

import com.sun.source.tree.NewArrayTree;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Signup extends JFrame {
    JTextField textName, textFName;
    
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "  " + Math.abs(first4);
    Signup(){
        super("Formulário de Cadastro");
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image image2 = image1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel image = new JLabel(image3);
        image.setBounds(25,10,100,100);
        add(image);
        
        JLabel label1 = new JLabel("Formulário de Inscrição nº" + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);
        
        JLabel label2 = new JLabel("Página 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Dados Pessoais");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);
        
        JLabel labelName = new JLabel("Nome:");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100,190,100,30);
        add(labelName);
        
        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelFName = new JLabel("Nome do Pai:");
        labelFName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelFName.setBounds(100,240,200,30);
        add(labelFName);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway", Font.BOLD, 14));
        textFName.setBounds(300,240,400,30);
        add(textFName);
        
        JLabel DOB = new JLabel("Data de Nascimento");
        DOB.setFont(new Font("Raleway", Font.BOLD, 30));
        DOB.setBounds(100, 240, 200, 30);
        add(DOB);
        
        
        
        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        new Signup();
    }
}
