package br.com.seguradora.infrastructure.repository;

import br.com.seguradora.infrastructure.persistence.ClaimsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimsEntityRepository extends JpaRepository<ClaimsEntity, Long> {
}
