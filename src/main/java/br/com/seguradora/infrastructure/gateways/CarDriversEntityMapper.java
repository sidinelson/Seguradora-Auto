package br.com.seguradora.infrastructure.gateways;

import br.com.seguradora.core.entity.CarDrivers;
import br.com.seguradora.core.entity.Cars;
import br.com.seguradora.core.entity.Drivers;
import br.com.seguradora.infrastructure.persistence.CarDriversEntity;
import br.com.seguradora.infrastructure.persistence.CarsEntity;
import br.com.seguradora.infrastructure.persistence.DriversEntity;
import org.springframework.stereotype.Component;

@Component
public class CarDriversEntityMapper {

    public CarDriversEntity toEntity(CarDrivers carDrivers, DriversEntity driversEntity, CarsEntity carsEntity){

        return new CarDriversEntity(carDrivers.getId(),
                                    driversEntity,
                                    carsEntity,
                                    carDrivers.getIsMainDriver());
    }

    public CarDrivers toEntity(CarDriversEntity carDriversEntity, Drivers drivers, Cars cars){

        return new CarDrivers(carDriversEntity.getId(),
                              drivers,
                              cars,
                              carDriversEntity.getIsMainDriver());
    }
}
