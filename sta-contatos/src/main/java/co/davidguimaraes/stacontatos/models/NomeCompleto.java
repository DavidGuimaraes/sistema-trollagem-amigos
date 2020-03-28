package co.davidguimaraes.stacontatos.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NomeCompleto {

    @NotNull
    private String primeiroNome;

    @NotNull
    private String sobrenome;
}
