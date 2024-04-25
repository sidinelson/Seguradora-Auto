package br.com.seguradora.infrastructure.mapper;


import br.com.seguradora.core.entity.CarDrivers;
import br.com.seguradora.core.entity.Cars;
import br.com.seguradora.core.entity.Drivers;
import br.com.seguradora.infrastructure.dto.request.CreateCarDriversRequest;
import org.springframework.stereotype.Component;

@Component
public class CarDriversDtoMapper {

    public CreateCarDriversRequest toCarDriversDto(CarDrivers cardDrivers){

        return new CreateCarDriversRequest(cardDrivers.getDriversId().getId(),
                                           cardDrivers.getCarsId().getId(),
                                           cardDrivers.getIsMainDriver());
    }
    public CarDrivers toCarDriversDomain(CreateCarDriversRequest request){
        Drivers drives = new Drivers();
        Cars cars = new Cars();

        drives.setId(request.driverId());
        cars.setId(request.carsId());
        return new CarDrivers(drives, cars, request.isMainDriver());
    }
}
