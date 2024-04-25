package br.com.seguradora.infrastructure.controller;


import br.com.seguradora.core.usecase.CreateClaimsUseCase;
import br.com.seguradora.infrastructure.dto.request.CreateClaimsRequest;
import br.com.seguradora.infrastructure.dto.response.BaseResponse;
import br.com.seguradora.infrastructure.mapper.ClaimsDtoMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static br.com.seguradora.infrastructure.utils.Util.log;

@RestController
@RequestMapping("api/v1/claims")
public class ClaimsController {

    private CreateClaimsUseCase createClaimsUseCase;
    private ClaimsDtoMapper dtoMapper;

    public ClaimsController(CreateClaimsUseCase createClaimsUseCase, ClaimsDtoMapper dtoMapper) {
        this.createClaimsUseCase = createClaimsUseCase;
        this.dtoMapper = dtoMapper;
    }


    @PostMapping("/budget")
    public BaseResponse createClaims(@RequestBody CreateClaimsRequest request) throws Exception{
        log.info("Inicio da criação do Claims::InsurancesController");
        createClaimsUseCase.execute(dtoMapper.toClaimsDomain(request));
        log.info("Claims criado com sucesso::InsurancesController");
        return BaseResponse.<String>builder().success(true).message("Claims criado com sucesso").build();
    }
}
