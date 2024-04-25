package br.com.seguradora.infrastructure.mapper;

import br.com.seguradora.core.entity.Drivers;
import br.com.seguradora.infrastructure.dto.request.CreateDriversRequest;
import org.springframework.stereotype.Component;

@Component
public class DriversDtoMapper {

    public CreateDriversRequest toDriversDto(Drivers drivers){
        return new CreateDriversRequest(drivers.getDocument(), drivers.getBirthdate());
    }

    public Drivers toDriversDomain(CreateDriversRequest request){
        return new Drivers(request.document(), request.birthdate());
    }
}
