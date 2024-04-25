package br.com.seguradora.infrastructure.mapper;

import br.com.seguradora.core.entity.Customer;
import br.com.seguradora.core.entity.Drivers;
import br.com.seguradora.infrastructure.dto.request.CreateCustomerRequest;
import org.springframework.stereotype.Component;

import java.sql.Driver;

@Component
public class CustomerDtoMapper {

    public CreateCustomerRequest toCurtomerDto(Customer customer){

        return new CreateCustomerRequest(customer.getName(),customer.getDriversId().getId());
    }
    public Customer toCustomerDomain(CreateCustomerRequest request){
        Drivers drv = new Drivers();
        drv.setId(request.driversId());
        return new Customer(request.name(), drv);
    }
}
