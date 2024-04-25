package br.com.seguradora.infrastructure.gateways;


import br.com.seguradora.application.gateway.CustomerGateway;
import br.com.seguradora.core.entity.Customer;
import br.com.seguradora.infrastructure.persistence.DriversEntity;
import br.com.seguradora.infrastructure.repository.CustomerEntityRepository;
import org.springframework.stereotype.Component;

import static br.com.seguradora.infrastructure.utils.Util.log;

@Component
public class CustomerRepositoryGateway implements CustomerGateway {

    private CustomerEntityRepository customerEntityRepository;
    private CustomerEntityMapper customerEntityMapper;

    public CustomerRepositoryGateway(CustomerEntityRepository customerEntityRepository,  CustomerEntityMapper customerEntityMapper ) {
        this.customerEntityRepository = customerEntityRepository;
        this.customerEntityMapper = customerEntityMapper;
    }


    @Override
    public Boolean createCustomer(Customer customer) {
        try {
            log.info("#### Inicio da criação do Customer::CustomerRepositoryGateway");
            DriversEntity driversConsult = new DriversEntity();
            driversConsult.setId(customer.getDriversId().getId());
            var customerSave = customerEntityRepository.save(customerEntityMapper.toEntity(customer,driversConsult));
            log.info("#### Fim da criação do Customer::CustomerRepositoryGateway");
            return true;
        }catch(Exception e){
            log.error("#### error da criação do Customer::CustomerRepositoryGateway  "+e);
            return false;
        }
    }
}
