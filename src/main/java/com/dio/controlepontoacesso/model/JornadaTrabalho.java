package com.dio.controlepontoacesso.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Audited
public class JornadaTrabalho {

    @Id
    @Generated
    private long id;
    private String descricao;

}


