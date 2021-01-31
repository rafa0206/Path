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
import java.util.function.BiFunction;

public class Main {
  public static void main(String[] args) {
    var ls = List.of(10, 20, 30, 40, 50, 60, 70);    
    System.out.println(PartialSum.sum(ls, 1, 5));
    PSum ps = PSum.get(ls);
    System.out.println(ps.sum(1, 5));
    System.out.println(ps.sum(0, ls.size()));
    BiFunction<Integer, Integer, Integer> fn = FnPSum.get(ls);
    System.out.println(fn.apply(1, 5));
  }    
}

//aula 14
  /*public static List<List<Integer>> build(String str) {
    Scanner s = new Scanner(str);
    List<List<Integer>> graph = new ArrayList<>();
    int n = s.nextInt();
    for (int i = 0; i < n; ++i) {
      graph.add(new ArrayList<>());
    }
    //graph é a lista [[], [], [], ..., []] (n listas vazias)
    while (s.hasNext()) {
    int x = s.nextInt();
    int y = s.nextInt();
    graph.get(x).add(y);
    graph.get(y).add(x);
    }
    s.close();
    return graph;
  }
  public static void main(String[] args) {
    List<List<Integer>> graph = build ("4 0 2 0 2 1 2 2 3");
    System.out.println(graph);
  }*/
