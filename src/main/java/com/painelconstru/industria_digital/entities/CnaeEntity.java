package com.painelconstru.industria_digital.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "cnae")
public class CnaeEntity {

    @Id
    @Column(name = "cnae_id", length = 7, nullable = false)
    private String cnaeId;

    @Column(length = 80, nullable = false)
    private String descricao;

    @Column(name = "macro_categoria", length = 2, nullable = false)
    private String macroCategoria;

    @OneToMany(mappedBy = "cnae")
    private List<EstabelecimentoCnaeEntity> estabelecimentosCnaes;
}

