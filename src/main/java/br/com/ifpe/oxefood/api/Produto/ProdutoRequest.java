package br.com.ifpe.oxefood.api.Produto;

import javax.validation.constraints.NotBlank;

import br.com.ifpe.oxefood.modelo.Produto.Produto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoRequest {
   
   private Long idCategoria;

   private String titulo;
    
@NotBlank(message = "O código do produto é de preenchimento obrigatório ")
   private String codigoProduto;
   
   private String descricao;
   
   @NotBlank(message = " O valor unitário é de preenchimento obrigatório")
   private int valorUnitario;

   private String tempoEntregaMax;
   
   private String tempoEntregaMin;

   
   public Produto build() {

       return Produto.builder()
               .titulo(titulo)
               .codigoProduto(codigoProduto)
               .descricao(descricao)
               .valorUnitario(valorUnitario)
               .tempoEntregaMin(tempoEntregaMin)
               .tempoEntregaMax(tempoEntregaMax)
               .build();
   }

}


