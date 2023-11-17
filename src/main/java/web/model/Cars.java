package web.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private static List<Car> carList() {
        List<Car> carArrayList = new ArrayList<>();
        carArrayList.add(new Car("Acura", "NSX", 2));
        carArrayList.add(new Car("Audi", "S4", 5));
        carArrayList.add(new Car("Dodge", "Caravan", 3));
        carArrayList.add(new Car("Chevrolet", "Blazer", 2));
        carArrayList.add(new Car("Cadillac", "Escalade", 4));
        return carArrayList;
    }
    public static List<Car> getCarList() {
        return new ArrayList<>(carList());
    }
}
