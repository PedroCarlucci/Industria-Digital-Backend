package com.painelconstru.industria_digital.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "estabelecimento")
public class EstabelecimentoEntity {

    @Id
    @Column(name = "estabelecimento_id", length = 36, nullable = false)
    private String estabelecimentoId;

    @Column(length = 4, nullable = false)
    private String id;

    @Column(length = 2, nullable = false)
    private String dv;

    @Column(nullable = false)
    private boolean matriz;

    @Column(length = 50)
    private String nomeFantasia;

    @Column(length = 20)
    private String pais;

    @Temporal(TemporalType.DATE)
    private Date dataInicioAtividade;

    @Column(length = 1)
    private String situacaoCadastral;

    @Column(length = 20)
    private String tipoLogradouro;

    @Column(length = 30)
    private String logradouro;

    @Column(length = 15)
    private String numero;

    @Column(length = 10)
    private String complemento;

    @Column(length = 20)
    private String bairro;

    @Column(length = 8, nullable = false)
    private String cep;

    @Column(length = 2, nullable = false)
    private String uf;

    @Column(name = "ddd_1")
    private int ddd1;

    @Column(name = "telefone_1")
    private int telefone1;

    @Column(length = 50)
    private String email;

    @Column
    private float latitude;

    @Column
    private float longitude;

    @ManyToOne
    @JoinColumn(name = "municipio_id", nullable = false)
    private MunicipioEntity municipio;

    @ManyToOne
    @JoinColumn(name = "cnpj", nullable = false)
    private EmpresaEntity empresa;

    @OneToMany(mappedBy = "estabelecimento")
    private List<EstabelecimentoCnaeEntity> estabelecimentosCnaes;
}

