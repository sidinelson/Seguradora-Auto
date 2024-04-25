package br.com.seguradora.infrastructure.config;


import br.com.seguradora.application.gateway.*;
import br.com.seguradora.application.usecaseimpl.*;
import br.com.seguradora.core.usecase.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BensConfig {

    @Bean
    public CreateDriversUseCase createDriversUseCase(DriversGateway driversGateway){
        return new CreateDriversUseCaseImpl(driversGateway);
    }


    @Bean
    public CreateCarsUseCase createCarsUseCase(CarsGateway carsGateway){
        return new CreateCarsUseCaseImpl(carsGateway);
    }

    @Bean
    public CreateCostumerUseCase createCustomerUseCase(CustomerGateway customerGateway){
        return new CreateCustomerUseCaseImpl(customerGateway);
    }

    @Bean
    public CreateInsurancesUseCase createInsurancesUseCase(InsurancesGateway insurancesGateway){
        return new CreateInsurancesUseCaseImpl(insurancesGateway);
    }

    @Bean
    public CreateCarDriversUseCase createCarDriversUseCase(CarDriversGateway carDriversGateway){
        return new CreateCarDriversUseCaseImpl(carDriversGateway);
    }

    @Bean
    public CreateClaimsUseCase createClaimsUseCase(ClaimsGateway claimsGateway){
        return new CreateClaimsUseCaseImpl(claimsGateway);
    }
}
