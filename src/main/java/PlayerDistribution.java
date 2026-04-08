package org.example;

import java.util.*;

public class PlayerDistribution {
  public static void main(String[] args) {
    int totalPlayers = 150;
    List<Integer> instanceIds = Arrays.asList(1, 2, 4, 5);
    Map<Integer, Integer> currentLoads = Map.of(
            1, 500,
            2, 400,
            4, 100,
            5, 200);

    // PriorityQueue sorts by load, then by instance id for stability
    PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt((int[] a) -> a[1])
            .thenComparingInt(a -> a[0]));

    for (int id : instanceIds) {
      pq.offer(new int[]{id, currentLoads.get(id)});
    }

    for (int i = 0; i < totalPlayers; i++) {
      int[] least = pq.poll();
      least[1]++; // assign one player
      pq.offer(least);
    }

    Map<Integer, Integer> newLoads = new HashMap<>();
    while (!pq.isEmpty()) {
      int[] entry = pq.poll();
      newLoads.put(entry[0], entry[1]);
    }

    System.out.println("New loads: " + newLoads);
  }
}
