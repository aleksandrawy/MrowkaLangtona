/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrówka_langtona;

import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Aleksandra Wyszecka
 * @author Damian Winczewski
 */


public class Mrówka_Langtona {
    
    static class Frame extends JFrame implements ActionListener{
        
            JButton Start = new JButton("START");
            JButton Stop = new JButton("STOP");
            JButton AddingAnt = new JButton("ADD ANT");
            JButton GoTo = new JButton("DO STEPS");
            
            JTextField Counter = new JTextField(5);
            JTextField AddingSteps = new JTextField(5);
            
            JLabel StepLabel = new JLabel("STEP: ");
                                   
        public Frame(){
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("Mrówka Langtona");
            //FullScrean
            Toolkit kit = Toolkit.getDefaultToolkit();
            Dimension screenSize = kit.getScreenSize();
            int screenWidth = screenSize.width;         // przedtem 1000
            int screenHeight = screenSize.height;       // przedtem  700            
            setSize(screenWidth, screenHeight);
            //Tło
            setLayout(null);
            
            //Przyciski
            Start.setBounds(10, 10, 100, 40);
            Stop.setBounds(120, 10, 100, 40);            
            AddingAnt.setBounds(230, 10, 100, 40);
            
            //przeskok o liczbę kroków
            AddingSteps.setBounds(340, 15, 100, 30);           
            GoTo.setBounds(450, 10, 100, 40);
            
            //Licznik kroków
            StepLabel.setBounds(560, 10, 50, 40);                     
            Counter.setBounds(610, 15, 100, 30);
            
            
            Start.addActionListener(this);
            Stop.addActionListener(this);
            
            AddingAnt.addActionListener(this);
            
            GoTo.addActionListener(this);
            
            add(Start);
            add(Stop);
            add(AddingAnt);
            add(GoTo);
            add(AddingSteps);
            add(Counter);
            add(StepLabel);

            setVisible(true);
        } 
        
            @Override
        public void actionPerformed(ActionEvent e){
            //Object zrodlo = e.getSource();
            long aSteps, aStepsToJump;
            aSteps = 0; //Long.parseLong(Counter.getText());
            aStepsToJump = Long.parseLong(AddingSteps.getText());
            
            Counter.setText(String.valueOf(aSteps += aStepsToJump));
        }
 // NIE WIEM CZEMU NIE DZIAAAAAAAAAAAAAAAAAAŁAAAAAAAAAAAAAAA!       
        public void paintComponent(Graphics g){
            Graphics2D g2 = (Graphics2D) g;
            g2.clearRect(100, 100, 400, 400);
            
            Rectangle2D Pole = new Rectangle2D.Double(100, 100, 100, 100);
            g2.setColor(Color.RED);
            g2.draw(Pole);

        }
        

  
   
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Frame();       
        // TODO code application logic here 
    }
    
}
