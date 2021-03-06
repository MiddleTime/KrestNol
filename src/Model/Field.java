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
public class Field {

    public enum Type {
        X, O, NotSet
    };
    Type[][] cells;

    public Field() {
        cells = new Type[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cells[i][j] = Type.NotSet;
            }
        }
    }

    public void show() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (cells[i][j]) {
                    case X:
                        System.out.print("X");
                        break;
                    case O:
                        System.out.print("O");
                        break;
                    case NotSet:
                        System.out.print(".");
                        break;
                }

            }
            System.out.println();

        }
        System.out.println();
    }

    public void doShoot(Point point, Type type) {
        //todo еще сделать проверку, чтобы не стрелять в уже стрелянную ячейку
       if (cells[point.getX()][point.getY()] == Type.NotSet){
        cells[point.getX()][point.getY()] = type;
       }
    }

    public boolean checkWin(Type t) {
        boolean isWin = false;
        //пример победы - линия по диагонали
        if (cells[0][0] == t && cells[1][1] == t && cells[2][2] == t) {
            isWin = true;
        }
        return isWin;
    }
    
}
