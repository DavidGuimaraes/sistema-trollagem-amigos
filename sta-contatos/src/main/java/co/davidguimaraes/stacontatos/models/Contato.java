package co.davidguimaraes.stacontatos.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;

@Entity
@Table(name="contato")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contato {

    @Id
    @GeneratedValue
    @Column(name="id_contato")
    private BigInteger idContato;

    @Embedded
    private NomeCompleto nomeCompleto;

    @Embedded
    private TelefoneCompleto telefoneCompleto;

    @Column(name="email")
    @NotNull
    private String email;
}
