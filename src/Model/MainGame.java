/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author inbox_bv8awe9
 */
public class MainGame {
    public static Field field = new Field();
    public static Computer computer = new Computer();
    public static User user = new User();
    
    public static void start() {
        field.show();
        for (int i = 0; i < 10; i++) {
            field.doShoot(computer.getShoot(), Field.Type.X);
            field.show();
            //check win
            field.doShoot(user.getShoot(), Field.Type.O);
            field.show();
            //check win
            
        }
    }
}
