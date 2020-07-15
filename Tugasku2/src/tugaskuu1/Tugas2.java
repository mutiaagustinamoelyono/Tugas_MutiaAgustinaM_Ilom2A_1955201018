/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaskuu1;

/**
 *
 * @author ACER
 */
public class Tugas2 {
    public static void main(String[] args) {
        int matrik [][] = {{1,2},{3,4}};
                
        for(int a = 0 ; a < matrik.length ; a++) {
            for (int b = 0 ; b < matrik[0].length ; b++){
                System.out.print(matrik[a][b] + "  ");
            }
            System.out.println("     ");
        }
    }
}
