package br.com.ifpe.oxefood.api.Produto;

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
    
   private String codigoProduto;
   
   private String descricao;
   
   private String valorUnitario;

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


