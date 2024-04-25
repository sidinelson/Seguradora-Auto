package br.com.seguradora.infrastructure.gateways;

import br.com.seguradora.core.entity.Customer;
import br.com.seguradora.core.entity.Drivers;
import br.com.seguradora.infrastructure.persistence.CustomerEntity;
import br.com.seguradora.infrastructure.persistence.DriversEntity;
import org.springframework.stereotype.Component;

@Component
public class CustomerEntityMapper {

    public CustomerEntity toEntity(Customer customer, DriversEntity driversEntity){
        return new CustomerEntity(customer.getId(), customer.getName(), driversEntity);
    }


    public Customer toCustomer(CustomerEntity customerEntity, Drivers drivers){

        return new Customer(customerEntity.getId(), customerEntity.getName(), drivers);
    }

}
