/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author inbox_bv8awe9
 */
public class GameWindowTest extends JFrame{
    public void init(){
        setSize(400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton jbutton1 = new JButton("Hello");
        JButton jbutton2 = new JButton("Bye");
        add(jbutton1, BorderLayout.CENTER);
        add(jbutton2, BorderLayout.NORTH);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("West"), BorderLayout.WEST);
        
        setVisible(true);
    }
}
