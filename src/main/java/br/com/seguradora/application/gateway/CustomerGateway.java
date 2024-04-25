package br.com.seguradora.application.gateway;

import br.com.seguradora.core.entity.Customer;

public interface CustomerGateway {

    Boolean createCustomer(Customer customer);
}
