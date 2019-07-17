package controller;
import model.Food;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class FoodController {
    private static ArrayList<Food> foods = new ArrayList<Food>();
    private static Random r = new Random();

    public void addFood() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = " ";
        System.out.println("Please make order");
        while (true) {
            s = reader.readLine();
            if (s.equals("end"))

                break;
            foods.add(new Food(s, r.nextInt(10)));
        }
        System.out.println(" your bills are ");
        for (Food food : foods) {
            System.out.println(food.getName() + " " + food.getPrice());

        }
    }
}


