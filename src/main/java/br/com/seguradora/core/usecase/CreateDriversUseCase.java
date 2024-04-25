package br.com.seguradora.core.usecase;

import br.com.seguradora.core.entity.Drivers;
import br.com.seguradora.infrastructure.persistence.DriversEntity;

public interface CreateDriversUseCase {

    public void execute(Drivers drivers);
}
