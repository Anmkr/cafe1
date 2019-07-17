import controller.FoodController;
import controller.OrderController;

import java.io.IOException;

public class Cafe {
        public static void main(String[] args) throws IOException {
            FoodController foodController = new FoodController();
            foodController.addFood();
            OrderController orderController = new OrderController();
            orderController.printOrders();
        }  }


