package br.com.ifpe.oxefood.api.Produto;

import br.com.ifpe.oxefood.modelo.Produto.CategoriaProduto;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaProdutoRequest {

    private String descricao;

    public CategoriaProduto build() {

       return CategoriaProduto.builder()
               .descricao(descricao)
               .build();
             
   }

}
    
