package web.services;

import org.springframework.stereotype.Service;

import java.util.List;

import web.dao.CarDao;
import web.model.Car;


@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public int getCountAllCars() {
        return carDao.getCountAllCars();
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        return carDao.getCarsByCount(count);
    }
}
