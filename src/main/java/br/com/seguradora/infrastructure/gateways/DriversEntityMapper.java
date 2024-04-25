package br.com.seguradora.infrastructure.gateways;

import br.com.seguradora.core.entity.Drivers;
import br.com.seguradora.infrastructure.persistence.DriversEntity;
import org.springframework.stereotype.Component;

@Component
public class DriversEntityMapper {

    public DriversEntity toEntity(Drivers drivers){
        return new DriversEntity(drivers.getId(), drivers.getDocument(), drivers.getBirthdate());
    }

    public Drivers toDrivers(DriversEntity driversEntity){
        return new Drivers(driversEntity.getId(), driversEntity.getDocument(), driversEntity.getBirthdate());
    }
}
