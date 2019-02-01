/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ckemboi
 */
public class SearchTest {

    List<Integer> searchList = new ArrayList<Integer>();
    int searchIndex;

    public int search(ArrayList<Integer> list, int i) {
        this.searchIndex = i;
        this.searchList = list;
        //Sort List
        Collections.sort(list);
        //Perform Binary search
        int value = Collections.binarySearch(searchList, searchIndex);
        return value;
    }
}
