package br.com.seguradora.infrastructure.repository;

import br.com.seguradora.infrastructure.persistence.CarsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarsEntityRepository extends JpaRepository<CarsEntity, Long> {
}
