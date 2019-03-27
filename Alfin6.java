/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfin6;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Alfin6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input = new Scanner (System.in);

int nilai1, nilai2, hasil;

System.out.print ("masukan integer pertama:");
nilai1 = input.nextInt();

System.out.print ("masukan integer kedua:");
nilai2 = input.nextInt();

hasil = nilai1 + nilai2;
System.out.println("hasil " +nilai1+ " + " +nilai2+ "=" +hasil);
    }
    
}
