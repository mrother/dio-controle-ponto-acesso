package com.dio.controlepontoacesso.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Localidade {

    @Id
    private Long id;
    @ManyToOne //Várias localidades tem apenas uma Localidade
    private NivelAcesso nivelAcesso;
    private String descricao;

}
