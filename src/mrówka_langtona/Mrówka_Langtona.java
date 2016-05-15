/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrówka_langtona;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Aleksandra Wyszecka
 * @author Damian Winczewski
 */


public class Mrówka_Langtona {
    
    static class Okno extends JFrame implements ActionListener{
        
            JButton Start = new JButton("START");
            JButton Stop = new JButton("STOP");
            JButton Tworzenie = new JButton("Dodaj mrówkę");
            JButton Skakanie = new JButton("Wykonaj kroki");
            
            JTextField licznik = new JTextField(5);
            JTextField kroki = new JTextField(5);
            
            JLabel LicznikLabel = new JLabel("Ilość kroków");
            
        public Okno(){
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(1000,700);
         //   setState(ICONIFIED);
         
            setTitle("Mrówka Langtona");
            setLayout(null);
            
            Start.setBounds(10, 10, 100, 40);
            Stop.setBounds(10, 60, 100, 40);
            Tworzenie.setBounds(10, 110, 130, 40);
            Skakanie.setBounds(10, 240, 150, 40);
            kroki.setBounds(30, 210, 100, 30);
            licznik.setBounds(500, 10, 100, 50);
            LicznikLabel.setBounds(410, 10, 100, 40);
            
            Start.addActionListener(this);
            Stop.addActionListener(this);
            Tworzenie.addActionListener(this);
            Skakanie.addActionListener(this);
            
            add(Start);
            add(Stop);
            add(Tworzenie);
            add(Skakanie);
            add(kroki);
            add(licznik);
            add(LicznikLabel);
            
            setVisible(true);
        } 
        
        public void actionPerformed(ActionEvent e){
            //Object zrodlo = e.getSource();
            long a, b;
            a = 0;
            b = Long.parseLong(kroki.getText());
            
            licznik.setText(String.valueOf(a = a + b));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Okno();
        // TODO code application logic here 
    }
    
  }
