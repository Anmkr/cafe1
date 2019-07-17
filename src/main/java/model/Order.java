package model;

import java.util.LinkedList;

public class Order {
    private int tableNum;
    private Food food;

    public Order(int tableNum, Food food) {
        this.tableNum = tableNum;
        this.food = food;
    }

    public Order() {
    }

    public int getTableNum() {
        return tableNum;
    }

    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Order{" +
                "tableNum='" + tableNum + '\'' +
                ", food=" + food +
                '}';
    }
}