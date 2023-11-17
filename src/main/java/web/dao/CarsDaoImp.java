package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import web.model.Cars;

import java.util.List;
@Repository
public class CarsDaoImp implements CarsDao {

    @Override
    public List<Car> getCars() {
        return Cars.getCarList();
    }
}
