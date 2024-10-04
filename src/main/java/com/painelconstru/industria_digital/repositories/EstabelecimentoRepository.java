package com.painelconstru.industria_digital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.painelconstru.industria_digital.entities.EstabelecimentoEntity;

public interface EstabelecimentoRepository extends JpaRepository<EstabelecimentoEntity, String> {
}
