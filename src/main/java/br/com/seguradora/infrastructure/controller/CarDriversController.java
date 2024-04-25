package br.com.seguradora.infrastructure.controller;

import br.com.seguradora.core.usecase.CreateCarDriversUseCase;
import br.com.seguradora.infrastructure.dto.request.CreateCarDriversRequest;
import br.com.seguradora.infrastructure.dto.response.BaseResponse;
import br.com.seguradora.infrastructure.mapper.CarDriversDtoMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static br.com.seguradora.infrastructure.utils.Util.log;

@RestController
@RequestMapping("api/v1/cardrivers")
public class CarDriversController {

    private CreateCarDriversUseCase createCarDriversUseCase;
    private CarDriversDtoMapper dtoMapper;


    public CarDriversController(CreateCarDriversUseCase createCarDriversUseCase, CarDriversDtoMapper dtoMapper) {
        this.createCarDriversUseCase = createCarDriversUseCase;
        this.dtoMapper = dtoMapper;
    }

    @PostMapping("/budget")
    public BaseResponse createCarDrivers(@RequestBody CreateCarDriversRequest request) throws Exception{
        log.info("Inicio da criação do CarDrivers::DriverController");
        createCarDriversUseCase.execute(dtoMapper.toCarDriversDomain(request));
        log.info("CarDrivers criado com sucesso::DriverController");
        return BaseResponse.<String>builder().success(true).message("CarDrivers criado com sucesso").build();
    }
}
