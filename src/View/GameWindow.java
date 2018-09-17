/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.GameController;
import Model.Field;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Model.Point;

/**
 *
 * @author inbox_bv8awe9
 */
public class GameWindow extends JFrame{
    JPanel jpanel = new JPanel();
    JButton[][] buttons = new JButton[3][3];
    
    
    public void init(){ 
        setSize(400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("XO Game!");
        //jpanel.setLayout(new FlowLayout()); //по умолчанию для Jpanel
        jpanel.setLayout(new GridLayout(3,3));
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton jbutton = new JButton();
                jbutton.setText(j%2 == 0 ? "X" : "O");
                buttons[i][j] = jbutton;
                jpanel.add(jbutton);
                
                final int finalJ = j; //"слушатели для кнопок" могут быть только константами в этом случае
                final int finalI = i; //так как это анонимный класс, можно только если лямбда
                
                jbutton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String buttonText = e.getActionCommand();
                        System.out.printf("Button: %s, x: %d, y: %d\n", buttonText, finalJ, finalI);
                        GameController.doShoot(new Point(finalI,finalJ), buttonText.equals("X")? Field.Type.X: Field.Type.O);
                    }
                });
                
                
            }
        }
        
        
        add(jpanel);
        
        
        
        
        setVisible(true);
    }
}
