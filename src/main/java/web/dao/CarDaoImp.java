package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao{
    @Override
    public List<Car> getCars(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Car1","MT", 2001));
        cars.add(new Car("Car2","AT", 2013));
        cars.add(new Car("Car3", "MT", 2003));
        cars.add(new Car("Car4", "NT", 2024));
        cars.add(new Car("Car5", "AT", 2021));
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
