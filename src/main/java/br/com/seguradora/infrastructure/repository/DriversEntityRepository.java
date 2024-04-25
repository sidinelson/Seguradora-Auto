package br.com.seguradora.infrastructure.repository;

import br.com.seguradora.infrastructure.persistence.DriversEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriversEntityRepository extends JpaRepository<DriversEntity, Long> {


   DriversEntity findById(long id);
}
