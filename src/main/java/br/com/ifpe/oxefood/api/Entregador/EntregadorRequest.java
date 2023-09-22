package br.com.ifpe.oxefood.api.Entregador;
import java.time.LocalDate;

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
    private String nome;
    
   @JsonFormat(pattern = "dd/MM/yyyy")
   private LocalDate dataNascimento;
   
   private String cpf;
   
   private String rg;

   private String foneCelular;
   
   private String foneFixo;
   
   private String qtdEntregas;

   private String valorFrete;

   private String rua;

   private String numero;

   private String bairro;

   private String cidade;

   private String cep;

   private String uf;
   
   public Entregador build() {

       return Entregador.builder()
               .nome(nome)
               .dataNascimento(dataNascimento)
               .cpf(cpf)
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
