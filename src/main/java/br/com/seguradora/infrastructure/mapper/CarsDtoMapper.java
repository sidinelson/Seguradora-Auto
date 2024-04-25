package br.com.seguradora.infrastructure.mapper;


import br.com.seguradora.core.entity.Cars;
import br.com.seguradora.infrastructure.dto.request.CreateCarsRequest;
import org.springframework.stereotype.Component;

@Component
public class CarsDtoMapper {

    public CreateCarsRequest toCarsDto(Cars cars){
        return new CreateCarsRequest(cars.getModel(), cars.getManufacturer(), cars.getYears(), cars.getFipeValue());
    }

    public Cars toCarsDomain(CreateCarsRequest request){
        return new Cars(request.model(), request.manufacturer(), request.years(), request.fipeValue());
    }
}
