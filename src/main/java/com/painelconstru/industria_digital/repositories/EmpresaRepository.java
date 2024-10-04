package com.painelconstru.industria_digital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.painelconstru.industria_digital.entities.EmpresaEntity;

public interface EmpresaRepository extends JpaRepository<EmpresaEntity, String> {
}
