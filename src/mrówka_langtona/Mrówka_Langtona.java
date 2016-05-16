/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrówka_langtona;

import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
//import java.util.TimerTask;
import javax.swing.*;
import java.awt.image.BufferStrategy;

/**
 *
 * @author Aleksandra Wyszecka
 * @author Damian Winczewski
 */


public class Mrówka_Langtona extends JFrame implements ActionListener{

    
//    class AntTimer extends TimerTask{
//        public void run(){
//            
//        }
//    }     
            JButton Start = new JButton("START");
            JButton Stop = new JButton("STOP");
            JButton AddingAnt = new JButton("ADD ANT");
            JButton GoTo = new JButton("DO STEPS");
            
            JTextField Counter = new JTextField(10); 
            JTextField AddingSteps = new JTextField(10);
            
            JLabel StepLabel = new JLabel("STEPS: ");
                                
        Mrówka_Langtona(){
            Frame();
            Buttons();
            DrawingPanel();
        }
        
        public void Frame(){
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("Mrówka Langtona");
        //FullScrean
            Toolkit kit = Toolkit.getDefaultToolkit();
            Dimension screenSize = kit.getScreenSize();
            final int screenWidth = screenSize.width;       
            final int screenHeight = screenSize.height;                
            setSize(screenWidth, screenHeight);
        }

        public void Buttons(){
              setLayout(null);
         
        //Przyciski
            Start.setBounds(10, 10, 100, 40);
            Stop.setBounds(10, 60, 100, 40);
        //Licznik kroków
            StepLabel.setBounds(40, 100, 50, 30);                     
            Counter.setBounds(10, 130, 100, 30);
        //Dodawanie mrówki    
            AddingAnt.setBounds(10, 170, 100, 40);
            
        //przeskok o liczbę kroków
            AddingSteps.setBounds(10, 220, 100, 30);           
            GoTo.setBounds(10, 260, 100, 40);
              
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
            Counter.setText(String.valueOf(0));
            
            setVisible(true);
 //           createBufferStrategy(2); 
        } 
        
            @Override
        public void actionPerformed(ActionEvent e){
            Object click = e.getSource();
            long aSteps;
            long aStepsToJump;
            
            if(click==Start);
            if(click==Stop);
            if(click==AddingAnt);
            if(click==GoTo){
            aSteps = Long.parseLong(Counter.getText());    
            aStepsToJump = Long.parseLong(AddingSteps.getText());
            Counter.setText(String.valueOf(aSteps += aStepsToJump));
            }
        }
        
        public void DrawingPanel(){
            JPanel panel = new JPanel();
           // panel.setLayout(null);
            panel.setBounds(200, 10, 1700, 1000);
            panel.setBackground(Color.BLACK);
            add(panel);
          //  setContentPane(panel);
            setVisible(true);
        }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Mrówka_Langtona Frame = new Mrówka_Langtona();
    }
}