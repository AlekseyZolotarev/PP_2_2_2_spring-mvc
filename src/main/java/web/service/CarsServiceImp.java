package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarsServiceImp implements CarsService {
    private final CarsDao carsDao;

    @Autowired
    public CarsServiceImp(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    @Override
    public List<Car> getCarsByCount(int value) {
        if (value >= carsDao.getCars().size() || value <= 0) {
            value = 5;
        }
        return carsDao.getCars().stream().limit(value).collect(Collectors.toList());
    }
}
