package br.com.seguradora.infrastructure.controller;

import br.com.seguradora.core.usecase.CreateInsurancesUseCase;
import br.com.seguradora.infrastructure.dto.request.CreateInsurancesRequest;
import br.com.seguradora.infrastructure.dto.response.BaseResponse;
import br.com.seguradora.infrastructure.mapper.InsurancesDtoMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static br.com.seguradora.infrastructure.utils.Util.log;

@RestController
@RequestMapping("api/v1/insurance")
public class InsurancesController {

    private CreateInsurancesUseCase createInsurancesUseCase;
    private InsurancesDtoMapper dtoMapper;


    public InsurancesController(CreateInsurancesUseCase createInsurancesUseCase, InsurancesDtoMapper dtoMapper) {
        this.createInsurancesUseCase = createInsurancesUseCase;
        this.dtoMapper = dtoMapper;
    }


    @PostMapping("/budget")
    public BaseResponse createInsurances(@RequestBody CreateInsurancesRequest request) throws Exception{
        log.info("Inicio da criação do Insurances::InsurancesController");
        createInsurancesUseCase.execute(dtoMapper.toInsurancesDomain(request));
        log.info("Insurances criado com sucesso::InsurancesController");
        return BaseResponse.<String>builder().success(true).message("Insurances criado com sucesso").build();
    }
}
