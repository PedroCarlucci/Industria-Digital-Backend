package com.painelconstru.industria_digital.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Embeddable
public class EstabelecimentoCnaeId implements Serializable {

    @Column(name = "estabelecimento_id", length = 36)
    private String estabelecimentoId;

    @Column(name = "cnae_id", length = 7)
    private String cnaeId;
}
