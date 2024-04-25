package br.com.seguradora.application.usecaseimpl;

import br.com.seguradora.application.gateway.CarDriversGateway;
import br.com.seguradora.core.entity.CarDrivers;
import br.com.seguradora.core.usecase.CreateCarDriversUseCase;

public class CreateCarDriversUseCaseImpl implements CreateCarDriversUseCase {

    private CarDriversGateway carDriversGateway;

    public CreateCarDriversUseCaseImpl(CarDriversGateway carDriversGateway) {
        this.carDriversGateway = carDriversGateway;
    }


    @Override
    public void execute(CarDrivers carDrivers) {

        carDriversGateway.createCarDrivers(carDrivers);
    }
}
