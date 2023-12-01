package br.com.ifpe.oxefood.api.Empresa;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;

import br.com.ifpe.oxefood.modelo.empresa.Empresa;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmpresaRequest {
       
    private String site;
    
    @NotNull(message = "O CNPJ é de preenchimento obrigatório")
    @NotBlank(message = "O CNPJ é de preenchimento obrigatório")
    @CNPJ
    private String cnpj;
    

    private String inscricaoEstadual;

    @NotNull(message = "O Nome é de preenchimento obrigatório")
    @NotBlank(message = "O Nome é de preenchimento obrigatório")
    @Length(max = 100, message = "O Nome deverá ter no máximo {max} caracteres")
    private String nomeEmpresarial;


    private String nomeFantasia;

    @Length(min = 8, max = 20, message = "O campo Fone tem que ter entre {min} e {max} caracteres")
    private String fone;


    private String foneAlternativo;

    public Empresa build() {
      
        return Empresa.builder()

             .site(site)
             .cnpj(cnpj)
             .inscricaoEstadual(inscricaoEstadual)
             .nomeEmpresarial(nomeEmpresarial)
             .nomeFantasia(nomeFantasia)
             .fone(fone)
             .foneAlternativo(foneAlternativo)
             .build();
             
      
    }
}
