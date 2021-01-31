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

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class FnPSum {
    public static BiFunction<Integer, Integer, Integer> get(List<Integer> xs) {
    if (xs == null) throw new IllegalArgumentException();
    List<Integer>partialSums = new ArrayList<>();
    partialSums.add(0);
    int sum = 0;
    for (int x: xs) {
      sum += x;
      partialSums.add(sum);
    }
    return (i, k) -> {
      if (i < 0 || k < i || partialSums.size() <= k)
        throw new IllegalArgumentException("o intervalo de " + i + " ate " + k + "e invalido");
      return partialSums.get(k) - partialSums.get(i);      
    };
  }    
}
