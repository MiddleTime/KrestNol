/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krestnoliki;

import Model.MainGame;
import View.GameWindow;

/**
 *
 * @author inbox_bv8awe9
 */
public class Main {
    public static void main(String[] args) {
        GameWindow gameWindow = new GameWindow();
        gameWindow.init();
        MainGame.start();
    }
}
