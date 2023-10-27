package br.com.ifpe.oxefood.api.Fornecedor;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.modelo.Fornecedor.Fornecedor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FornecedorRequest {
    private String nome;
   
   @JsonFormat(pattern = "dd/MM/yyyy")
   private LocalDate dataFundacao;
   
   private String endereco;
   
   private double valorMercado; 

   private String contatoVendedor;
   
   private String paginaWeb;
   
   public Fornecedor build() {

       return Fornecedor.builder()
               .nome(nome)
               .endereco(endereco)
               .dataFundacao(dataFundacao)
               .valorMercado(valorMercado)
               .contatoVendedor(contatoVendedor)
               .paginaWeb(paginaWeb)
               .build();
   }

}
