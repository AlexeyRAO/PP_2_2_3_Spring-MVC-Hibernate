package web.servise;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServisImpl implements CarServise{

    private List<Car> carList = new ArrayList<>();

    public CarServisImpl() {
        carList.add(new Car("model1", "cale1", 1));
        carList.add(new Car("model2", "cale2", 2));
        carList.add(new Car("model3", "cale3", 3));
        carList.add(new Car("model4", "cale4", 4));
        carList.add(new Car("model5", "cale5", 5));
    }

    @Override
    public List<Car> getCountCar(Integer count) {
        if(count>=5){
            return carList;
        }
        return carList.subList(0,count);
    }
}
