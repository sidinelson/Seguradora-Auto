package br.com.seguradora.infrastructure.mapper;

import br.com.seguradora.core.entity.Cars;
import br.com.seguradora.core.entity.Customer;
import br.com.seguradora.core.entity.Insurances;
import br.com.seguradora.infrastructure.dto.request.CreateInsurancesRequest;
import org.springframework.stereotype.Component;

@Component
public class InsurancesDtoMapper {

    public CreateInsurancesRequest toInsurancesDto(Insurances insurances){

        return new CreateInsurancesRequest(insurances.getCustomerId().getId(),
                                           insurances.getCardsId().getId(),
                                           insurances.getIsActive());
    }
    public Insurances toInsurancesDomain(CreateInsurancesRequest request){
        Customer customer = new Customer();
        Cars cars = new Cars();

        customer.setId(request.customerId());
        cars.setId(request.CarId());
        return new Insurances(customer,null,null, cars, request.tipo());
    }
}
