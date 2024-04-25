package br.com.seguradora.infrastructure.controller;

import br.com.seguradora.core.usecase.CreateCarsUseCase;
import br.com.seguradora.infrastructure.dto.request.CreateCarsRequest;
import br.com.seguradora.infrastructure.dto.response.BaseResponse;
import br.com.seguradora.infrastructure.mapper.CarsDtoMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/cars")
public class CarsController {

    private CreateCarsUseCase createCarsUseCase;

    private CarsDtoMapper carsMapper;


    public CarsController(CreateCarsUseCase createCarsUseCase, CarsDtoMapper carsMapper) {
        this.createCarsUseCase = createCarsUseCase;
        this.carsMapper = carsMapper;
    }

    @PostMapping("/budget")
    public BaseResponse createCars(@RequestBody CreateCarsRequest request) throws Exception{

        createCarsUseCase.create(carsMapper.toCarsDomain(request));

        return BaseResponse.<String>builder().success(true).message("Cars criado com sucesso").build();
    }
}

