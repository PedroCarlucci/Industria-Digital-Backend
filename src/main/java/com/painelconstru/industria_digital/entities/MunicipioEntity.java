package com.painelconstru.industria_digital.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "municipio")
public class MunicipioEntity {

    @Id
    @Column(name = "municipio_id", length = 36, nullable = false)
    private String municipioId;

    @Column(length = 35, nullable = false)
    private String nome;

    @OneToMany(mappedBy = "municipio")
    private List<EstabelecimentoEntity> estabelecimentos;
}
