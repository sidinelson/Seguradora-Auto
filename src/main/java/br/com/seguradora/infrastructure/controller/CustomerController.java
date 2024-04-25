package br.com.seguradora.infrastructure.controller;

import br.com.seguradora.core.usecase.CreateCostumerUseCase;
import br.com.seguradora.infrastructure.dto.request.CreateCustomerRequest;
import br.com.seguradora.infrastructure.dto.response.BaseResponse;
import br.com.seguradora.infrastructure.mapper.CustomerDtoMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static br.com.seguradora.infrastructure.utils.Util.log;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    private CreateCostumerUseCase createCostumerUseCase;
    private CustomerDtoMapper dtoMapper;


    public CustomerController(CreateCostumerUseCase createCostumerUseCase, CustomerDtoMapper dtoMapper) {
        this.createCostumerUseCase = createCostumerUseCase;
        this.dtoMapper = dtoMapper;
    }

    @PostMapping("/budget")
    public BaseResponse createCustomer(@RequestBody CreateCustomerRequest request) throws Exception{
        log.info("Inicio da criação do Customer::CustomerController");
        createCostumerUseCase.execute(dtoMapper.toCustomerDomain(request));
        log.info("Customer criado com sucesso::CustomerController");
        return BaseResponse.<String>builder().success(true).message("Customer criado com sucesso").build();
    }



}
