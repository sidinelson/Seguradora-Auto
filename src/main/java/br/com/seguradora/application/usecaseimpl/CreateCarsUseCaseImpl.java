package br.com.seguradora.application.usecaseimpl;

import br.com.seguradora.application.gateway.CarsGateway;
import br.com.seguradora.core.entity.Cars;
import br.com.seguradora.core.usecase.CreateCarsUseCase;

public class CreateCarsUseCaseImpl implements CreateCarsUseCase {

    private CarsGateway carsGateway;

    public CreateCarsUseCaseImpl(CarsGateway carsGateway) {
        this.carsGateway = carsGateway;
    }


    @Override
    public Cars create(Cars cars) {
        return carsGateway.create(cars);
    }
}
