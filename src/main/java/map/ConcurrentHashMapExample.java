
import java.util.concurrent.ConcurrentHashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lnw
 */
public class ConcurrentHashMapExample {

    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> concurrentHashMap
                = new ConcurrentHashMap<>();
        concurrentHashMap.put(100, "hello");
        concurrentHashMap.put(101, "Harsh");
        concurrentHashMap.putIfAbsent(101, "lets go");
        System.out.println(concurrentHashMap);
    }

}
