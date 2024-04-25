package br.com.seguradora.application.usecaseimpl;
import br.com.seguradora.application.gateway.CustomerGateway;
import br.com.seguradora.core.entity.Customer;
import br.com.seguradora.core.usecase.CreateCostumerUseCase;
public class CreateCustomerUseCaseImpl implements CreateCostumerUseCase{

    private CustomerGateway customerGateway;

    public CreateCustomerUseCaseImpl(CustomerGateway customerGateway) {
        this.customerGateway = customerGateway;
    }


    @Override
    public void execute(Customer customer) {
        customerGateway.createCustomer(customer);
    }
}
