/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author abdir
 */
public class Assignment4Q11 {
    public static void main(String[] arg) {
        int number = 2;

        System.out.println("Prime number between 0 and 100:");

        while (number <= 100) {
            if (isPrime(number)) {
                System.out.println(number + "");

            }
            number++;

        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
