/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula14_mario_path;

/**
 *
 * @author JFernandes
 */

import java.util.List;
import java.util.ArrayList;

public class PartialSum {
    // recebe uma lista xs (!=null) e ints i e k tais que 0 <= i <= k <= x.size()
  // e devolve xs.get(i) + xs.get(i+1) + ... + xs.get(k-1)
  public static int sum(List<Integer> xs, int i, int k) {
    if (xs == null || i < 0 || k < i || xs.size() < k)
      throw new IllegalArgumentException();
    int sum = 0;
    for (int p = i; p < k; ++p) {
      sum += xs.get(p);      
    }
    return sum;
  }

  public static void main(String[] args) {
    var ls = List.of(10, 20, 30, 40, 50, 60, 70);
    System.out.println(sum(ls, 1, 5));
    System.out.println(sum(ls, 1, 5));
    System.out.println(sum(ls, 1, 5));    
  }    
}
