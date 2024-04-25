package br.com.seguradora.infrastructure.controller;


import br.com.seguradora.core.usecase.CreateDriversUseCase;
import br.com.seguradora.infrastructure.dto.request.CreateDriversRequest;
import br.com.seguradora.infrastructure.dto.response.BaseResponse;
import br.com.seguradora.infrastructure.mapper.DriversDtoMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static br.com.seguradora.infrastructure.utils.Util.log;

@RestController
@RequestMapping("api/v1/drivers")
public class DriverController {

    private CreateDriversUseCase createDriversUseCase;
    private DriversDtoMapper dtoMapper;

    public DriverController(CreateDriversUseCase createDriversUseCase, DriversDtoMapper dtoMapper) {
        this.createDriversUseCase = createDriversUseCase;
        this.dtoMapper = dtoMapper;
    }


    @PostMapping("/budget")
    public BaseResponse createDrivers(@RequestBody CreateDriversRequest request) throws Exception{
        log.info("Inicio da criação do Drivers::DriverController");
        createDriversUseCase.execute(dtoMapper.toDriversDomain(request));
        log.info("Drivers criado com sucesso::DriverController");
        return BaseResponse.<String>builder().success(true).message("Drivers criado com sucesso").build();
    }
}
