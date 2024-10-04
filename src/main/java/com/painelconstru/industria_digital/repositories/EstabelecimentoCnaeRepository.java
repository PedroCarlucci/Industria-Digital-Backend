package com.painelconstru.industria_digital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.painelconstru.industria_digital.entities.EstabelecimentoCnaeEntity;
import com.painelconstru.industria_digital.entities.EstabelecimentoCnaeId;

public interface EstabelecimentoCnaeRepository extends JpaRepository<EstabelecimentoCnaeEntity, EstabelecimentoCnaeId> {
}
