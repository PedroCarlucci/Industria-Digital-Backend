package com.painelconstru.industria_digital.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "estabelecimento_cnae")
public class EstabelecimentoCnaeEntity {

    @EmbeddedId
    private EstabelecimentoCnaeId id;

    @Column(nullable = false)
    private boolean primario;

    @ManyToOne
    @MapsId("estabelecimentoId")
    @JoinColumn(name = "estabelecimento_id", nullable = false)
    private EstabelecimentoEntity estabelecimento;

    @ManyToOne
    @MapsId("cnaeId")
    @JoinColumn(name = "cnae_id", nullable = false)
    private CnaeEntity cnae;
}
