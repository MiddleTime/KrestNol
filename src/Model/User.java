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
public class User implements ShootPoint{
    public static Point point;
    public volatile static boolean isShoot;
    
    @Override
    public Point getShoot() {
        isShoot = false;
        while(!isShoot);  //не идеальный вариант, так как ест ресурсы. Но нужно знатть многопоточность чтобы решить это
        return point;
        }
        
    
}
