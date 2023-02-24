package Lab1.Q4;

import java.util.ArrayList;
public class Order {
    ArrayList<Item> items = new ArrayList<Item>();

    public double calculateAverageCost(ArrayList<Item> arr) {
        double sum = 0; //function to calculate average
        int n = arr.size();
        for(Item i : arr) {
            System.out.println(i.name); //iterate over the Ecommerces list
            sum = sum + i.price;
        }
        return sum/n;
    }
}