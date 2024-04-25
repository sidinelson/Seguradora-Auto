package br.com.seguradora.infrastructure.gateways;


import br.com.seguradora.core.entity.Cars;
import br.com.seguradora.core.entity.Claims;
import br.com.seguradora.core.entity.Drivers;
import br.com.seguradora.infrastructure.persistence.CarsEntity;
import br.com.seguradora.infrastructure.persistence.ClaimsEntity;
import br.com.seguradora.infrastructure.persistence.DriversEntity;
import org.springframework.stereotype.Component;

@Component
public class ClaimsEntityMapper {


    public ClaimsEntity toEntity(Claims claims, CarsEntity carsEntity, DriversEntity driversEntity){
        return new ClaimsEntity(claims.getId(),
                                carsEntity,
                                driversEntity,
                                claims.getEventDate());
    }

    public Claims toClaims(ClaimsEntity claimsEntity, Cars cars, Drivers drivers){


        return new Claims(claimsEntity.getId(),
                          cars,
                          drivers,
                          claimsEntity.getEventDate());
    }
}
