package web.service;

import web.dao.Cars;
import web.model.Car;

import java.util.ArrayList;

public class CarsServiceImp implements CarsService{
    @Override
    public ArrayList<Car> printCars(int value) {
        if (value >= Cars.list().size() || value <= 0) {
            value = 5;
        }
        ArrayList<Car> carArrayList = new ArrayList<>(value);
        for (int i = 0; i < value; i++){
            carArrayList.add(Cars.list().get(i));
        }
        return carArrayList;
    }
}
