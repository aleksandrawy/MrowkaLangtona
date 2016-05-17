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
import java.util.TimerTask;

/**
 *
 * @author Aleksandra Wyszecka
 * @author Damian Winczewski
 */


public class Mrówka_Langtona{

    public static void main(String[] args) {
         Window Frame = new Window();
         DrawingPanel panel = new DrawingPanel(Frame);
    }
}
 
class Window extends JFrame implements ActionListener{
            JButton Start = new JButton("START");
            JButton Stop = new JButton("STOP");
            JButton AddingAnt = new JButton("ADD ANT");
            JButton GoTo = new JButton("DO STEPS");
            
            JTextField Counter = new JTextField(10); 
            JTextField AddingSteps = new JTextField(10);
            
            JLabel StepLabel = new JLabel("STEPS: ");
                                
        Window(){
            Frame();
            Buttons();
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
}

class DrawingPanel extends JPanel{

    DrawingPanel(mrówka_langtona.Window Frame){
            JPanel panel = new JPanel();
           // panel.setLayout(null);
            panel.setBounds(200, 10, 1700, 1000);
            panel.setBackground(Color.BLACK);
            Frame.add(panel);
          //  setContentPane(panel);
            setVisible(true);
    }
}

class AddAnt extends TimerTask{
    
    private int         position[];

    
        AddAnt(Graphics g){
            Graphics2D g2d = (Graphics2D)g;
            position[0] = 20;
            position[1] = 40;
            g2d.setColor(Color.PINK);
        }
    
        public void run(){
    //        Color c = getColor(position[0], position[1]);    
            
        }

}

