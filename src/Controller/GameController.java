/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;

/**
 *
 * @author inbox_bv8awe9
 */
public class GameController {
  public static void doShoot(Point point, Field.Type type) {
      User.point = point;
      User.isShoot = true;
  }  
          
}
