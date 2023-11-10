package web.dao;

import web.model.Car;

import java.util.ArrayList;

public class Cars {
    public static ArrayList<Car> list() {
        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(new Car("Acura", "NSX", 2));
        carArrayList.add(new Car("Audi", "S4", 5));
        carArrayList.add(new Car("Dodge", "Caravan", 3));
        carArrayList.add(new Car("Chevrolet", "Blazer", 2));
        carArrayList.add(new Car("Cadillac", "Escalade", 4));
        return carArrayList;
    }
}
