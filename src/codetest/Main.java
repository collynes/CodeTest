/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetest;

//import static codetest.PrimeTest.isPrime;
import java.util.ArrayList;

/**
 *
 * @author ckemboi
 */
public class Main {

    public static void main(String[] args) {
        // boolean prime = isPrime(11);
        SearchTest st = new SearchTest();
        ArrayList test = new ArrayList();
        test.add(1);
        test.add(3);
        test.add(2);
        test.add(0);
        // PrimeTest pt = new PrimeTest();
        System.out.println(st.search(test, 2));

    }
}
