/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Homework_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        int summ = 0;
        System.out.println("Единиц: " + x % 10);
        System.out.println("Десятков: " + x / 10 % 10);
        System.out.println("Сотен: " + x / 100);
        while (x > 0) {
            summ += x % 10;
            x /= 10;
        }
        System.out.println("Сумма цифр: " + summ);
    }
}
