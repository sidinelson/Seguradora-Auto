package br.com.seguradora.infrastructure.gateways;

import br.com.seguradora.application.gateway.ClaimsGateway;
import br.com.seguradora.core.entity.Claims;
import br.com.seguradora.infrastructure.persistence.CarsEntity;
import br.com.seguradora.infrastructure.persistence.DriversEntity;
import br.com.seguradora.infrastructure.repository.ClaimsEntityRepository;
import org.springframework.stereotype.Component;

import static br.com.seguradora.infrastructure.utils.Util.log;

@Component
public class ClaimsRepositoryGateway implements ClaimsGateway {

    private ClaimsEntityRepository claimsEntityRepository;
    private ClaimsEntityMapper entityMapper ;

    public ClaimsRepositoryGateway(ClaimsEntityRepository claimsEntityRepository, ClaimsEntityMapper entityMapper) {
        this.claimsEntityRepository = claimsEntityRepository;
        this.entityMapper = entityMapper;
    }


    @Override
    public Boolean createClaims(Claims claims) {
        try {
            log.info("#### Inicio da criação do Claims::ClaimsRepositoryGateway");
            DriversEntity driversEntity = new DriversEntity();
            driversEntity.setId(claims.getDriversId().getId());

            CarsEntity carsEntity = new CarsEntity();
            carsEntity.setId(claims.getCarsId().getId());

            var claimsSave = claimsEntityRepository.save(entityMapper.toEntity(claims,carsEntity,driversEntity));
            log.info("#### Fim da criação do Claims::ClaimsRepositoryGateway");
            return true;
        }catch(Exception e){
            log.error("#### error da criação do Claims::ClaimsRepositoryGateway  "+e);
            return false;
        }
    }
}
