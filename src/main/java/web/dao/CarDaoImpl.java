package web.dao;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import web.model.Car;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> cars;

    static {
        cars = new ArrayList<>(List.of(
                new Car("Porsche Panamera", "Platinum Edition", 777),
                new Car("Toyota Yaris", "XP210", 555),
                new Car("Toyota Tundra", "1794 EDITION", 333),
                new Car("Ford Raptor", "F-150", 111),
                new Car("Audi 100", "C4", 999)));
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        if (count > 0) {
            return cars.stream().limit(count).toList();
        }
        return new ArrayList<>();
    }

    @Override
    public int getCountAllCars() {
        return cars.size();
    }
}