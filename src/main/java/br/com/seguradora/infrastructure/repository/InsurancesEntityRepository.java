package br.com.seguradora.infrastructure.repository;

import br.com.seguradora.infrastructure.persistence.InsurancesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsurancesEntityRepository extends JpaRepository<InsurancesEntity, Long> {
}
