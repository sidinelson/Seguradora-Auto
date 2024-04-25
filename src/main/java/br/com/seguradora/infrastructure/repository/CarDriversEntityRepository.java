package br.com.seguradora.infrastructure.repository;

import br.com.seguradora.infrastructure.persistence.CarDriversEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDriversEntityRepository extends JpaRepository<CarDriversEntity, Long> {
}
