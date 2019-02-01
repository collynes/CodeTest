/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetest;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/**
 *
 * @author ckemboi
 */
public class PrimeTest {

    /**
     * @param args the command line arguments
     */
    //a.Write a function is Prime that returns true if a number is prime.
    //This unctions returns true if a number is prime
    public static boolean isPrime(int n) {
        //a prime number has to be a positive number.
        if (n <= 1) {
            return false;
        }
        //the number should not be divided by any number in the range
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        //Returns true if numner is prime
        return true;
    }

    //b.Write a function called memorize that takes any other function as input and returns a memorized version of that function
    public Object memorize(Callable<Boolean> testPrime) throws Exception {

        return testPrime.call();
    }
  
   //c.Use the function in 3 above to memorize the is Prime function you wrote for problem 2
    public void memorize(int number) throws Exception{
        ArrayList test = new ArrayList();
        memorize(new Callable<Boolean>() {

            @Override
            public Boolean call() throws Exception {
                return PrimeTest.isPrime(number);
            }
        });
    }

}
