package io.github.tthiadoads.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty (message = "{campo.usuario.obrigatorio}")
    @Column
    private String login;
    @NotEmpty (message = "{campo.senha.obrigatorio}")
    @Column
    private String senha;
    @Column
    private boolean admin;

}
