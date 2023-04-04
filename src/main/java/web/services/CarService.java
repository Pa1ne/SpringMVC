package web.services;

import java.util.List;

import web.model.Car;

public interface CarService {
    List<Car> getCarsByCount(int count);

    int getCountAllCars();
}