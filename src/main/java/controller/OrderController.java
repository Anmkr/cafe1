package controller;

import model.Food;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OrderController {
    private Map<Integer, Food> orders = new HashMap<Integer, Food>();
    private static Random r = new Random();

    public void printOrders() throws IOException {

        System.out.println("Order by tables");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Food> map = new HashMap<Integer, Food>();
        while (true) {
            String s = reader.readLine();
            map.put(1, new Food(s, r.nextInt(10)));
            for (Map.Entry<Integer, Food> order : map.entrySet()) {

                System.out.println(order.getKey() + " - " + order.getValue());
            }
        }
    }
}
