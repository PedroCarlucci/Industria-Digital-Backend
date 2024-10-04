package com.painelconstru.industria_digital.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "empresa")
public class EmpresaEntity {

    @Id
    @Column(length = 8, nullable = false)
    private String cnpj;

    @Column(name = "razao_social", length = 50, nullable = false)
    private String razaoSocial;

    @Column(nullable = false)
    private int porte;

    @Column(name = "natureza_juridica", nullable = false)
    private int naturezaJuridica;

    @OneToMany(mappedBy = "empresa")
    private List<EstabelecimentoEntity> estabelecimentos;
}
