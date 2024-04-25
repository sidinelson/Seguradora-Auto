package br.com.seguradora.infrastructure.repository;

import br.com.seguradora.infrastructure.persistence.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerEntityRepository extends JpaRepository<CustomerEntity, Long> {
}
