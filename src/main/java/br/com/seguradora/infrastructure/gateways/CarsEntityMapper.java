package br.com.seguradora.infrastructure.gateways;

import br.com.seguradora.core.entity.Cars;
import br.com.seguradora.infrastructure.persistence.CarsEntity;
import org.springframework.stereotype.Component;

@Component
public class CarsEntityMapper {

    public CarsEntity toEntity(Cars cars){

        return new CarsEntity(cars.getId(), cars.getModel(),cars.getManufacturer(),cars.getYears(),cars.getFipeValue());
    }

    public Cars toEntity(CarsEntity carsEntity){

        return new Cars(carsEntity.getId(), carsEntity.getModel(), carsEntity.getManufacture(), carsEntity.getYears(), carsEntity.getFipeValeu());
    }
}
