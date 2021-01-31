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

public class PSum {
    private final List<Integer> partialSums = new ArrayList<>();

  private PSum(List<Integer> xs) {
    partialSums.add(0);
    int sum = 0;
    for (int x: xs) {
      sum += x;
      partialSums.add(sum);
    }
  }

  public int sum(int i, int k) {
    if (i < 0 || k < i || partialSums.size() <= k)
      throw new IllegalArgumentException("o intervalo de " + i + " ate " + k + "e invalido");
    return partialSums.get(k) - partialSums.get(i);
  }

  public int sum() {
    return partialSums.get(partialSums.size()-1);
  }

  public static PSum get(List<Integer> xs) {
    if(xs == null) throw new IllegalArgumentException("xs deve ser diferente de null");
    return new PSum(xs);
  }    
}
