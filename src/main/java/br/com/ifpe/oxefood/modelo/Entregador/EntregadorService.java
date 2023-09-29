package br.com.ifpe.oxefood.modelo.Entregador;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*import br.com.ifpe.oxefood.modelo.cliente.Cliente;*/

@Service
public class EntregadorService {
     @Autowired
   private EntregadorRepository repository;

   @Transactional
   public Entregador save(Entregador entregador) {

       entregador.setHabilitado(Boolean.TRUE);
       entregador.setVersao(1L);
       entregador.setDataCriacao(LocalDate.now());
       return repository.save(entregador);
   }
   public List<Entregador> findAll() {
  
    return repository.findAll();
}

public Entregador findById(Long id) {

    return repository.findById(id).get();
}
@Transactional
   public void update(Long id, Entregador entregadorAlterado) {

      Entregador entregador = repository.findById(id).get();
      entregador.setNome(entregadorAlterado.getNome());
      entregador.setDataNascimento(entregadorAlterado.getDataNascimento());
      entregador.setCpf(entregadorAlterado.getCpf());
      entregador.setRg(entregadorAlterado.getRg());
      entregador.setFoneCelular(entregadorAlterado.getFoneCelular());
      entregador.setFoneFixo(entregadorAlterado.getFoneFixo());
      entregador.setQtdEntregas(entregadorAlterado.getQtdEntregas());
      entregador.setValorFrete(entregadorAlterado.getValorFrete());
      entregador.setRua(entregadorAlterado.getRua());
      entregador.setNumero(entregadorAlterado.getNumero());
      entregador.setCidade(entregadorAlterado.getCidade());
      entregador.setCep(entregadorAlterado.getCep());
      entregador.setUf(entregadorAlterado.getUf());
	    
      entregador.setVersao(entregador.getVersao() + 1);
      repository.save(entregador);
  }

}
