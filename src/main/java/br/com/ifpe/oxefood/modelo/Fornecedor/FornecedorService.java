package br.com.ifpe.oxefood.modelo.Fornecedor;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FornecedorService {
     @Autowired
   private FornecedorRepository repository;

   @Transactional
   public Fornecedor save(Fornecedor fornecedor) {

       fornecedor.setHabilitado(Boolean.TRUE);
       fornecedor.setVersao(1L);
       fornecedor.setDataCriacao(LocalDate.now());
       return repository.save(fornecedor);
   }
   public List<Fornecedor> findAll() {
  
    return repository.findAll();
}

public Fornecedor findById(Long id) {

    return repository.findById(id).get();
}

@Transactional
public void delete(Long id){
    
    Fornecedor fornecedor= repository.findById(id).get();
    fornecedor.setHabilitado(Boolean.FALSE);
    fornecedor.setVersao(fornecedor.getVersao()+ 1);
}
}

