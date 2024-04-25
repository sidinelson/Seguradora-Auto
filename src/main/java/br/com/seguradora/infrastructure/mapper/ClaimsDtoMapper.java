package br.com.seguradora.infrastructure.mapper;

import br.com.seguradora.core.entity.Cars;
import br.com.seguradora.core.entity.Claims;
import br.com.seguradora.core.entity.Drivers;
import br.com.seguradora.infrastructure.dto.request.CreateClaimsRequest;
import org.springframework.stereotype.Component;

@Component
public class ClaimsDtoMapper {

    public CreateClaimsRequest toClaimsDto(Claims claims){

        return new CreateClaimsRequest(claims.getCarsId().getId(),
                claims.getDriversId().getId(),
                claims.getEventDate());
    }
    public Claims toClaimsDomain(CreateClaimsRequest request){
        Drivers drivers = new Drivers();
        Cars cars = new Cars();

        drivers.setId(request.carsId());
        cars.setId(request.driverId());
        return new Claims(cars, drivers, request.eventDate());
    }
}
