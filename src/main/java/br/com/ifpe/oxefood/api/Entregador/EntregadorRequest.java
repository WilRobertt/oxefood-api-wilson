package br.com.ifpe.oxefood.api.Entregador;
import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.modelo.Entregador.Entregador;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EntregadorRequest {
   
   @NotBlank(message = "O Nome é de preenchimento obrigatório")
   @Length(max = 100, message = "O Nome deverá ter no máximo {max} caracteres")
   private String nome;
    
   @JsonFormat(pattern = "dd/MM/yyyy")
   private LocalDate dataNascimento;
   
   @NotBlank(message = "O CPF é de preenchimento obrigatório")
   @CPF
   private String cpf;
   
   @NotBlank(message = "O RG é de preenchimento obrigatório")
   private String rg;
   
   @NotBlank(message = "Celular é de preenchimento obrigatório")
   private String foneCelular;
   
   private String foneFixo;
   
   @NotBlank(message = "Quantidade de entregas é de preenchimento obrigatório")
   private String qtdEntregas;
   
   @NotBlank(message = "O valor do frete é de preenchimento obrigatório")
   private String valorFrete;
   

   private String rua;

   private String numero;

   private String bairro;
   
   private String cidade;
   
   @NotBlank(message = "O cep é de preenchimento obrigatório")
   private String cep;

   private String uf;
   
   public Entregador build() {

       return Entregador.builder()
               .nome(nome)
               .dataNascimento(dataNascimento)
               .cpf(cpf)
               .rg(rg)
               .foneCelular(foneCelular)
               .foneFixo(foneFixo)
               .qtdEntregas(qtdEntregas)
               .valorFrete(valorFrete)
               .rua(rua)
               .numero(numero)
               .bairro(bairro)
               .cidade(cidade)
               .cep(cep)
               .uf(uf)
               .build();
   }

}
