package br.com.ifpe.oxefood.modelo.empresa;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifpe.oxefood.modelo.acesso.UsuarioService;
import br.com.ifpe.oxefood.modelo.mensagens.EmailService;
import br.com.ifpe.oxefood.util.exception.EntidadeNaoEncontradaException;

@Service
public class EmpresaService {
     @Autowired
    private EmailService emailService;

   @Autowired
   private EmpresaRepository repository;

   @Autowired
   private UsuarioService usuarioService;


   @Transactional
   public Empresa save(Empresa empresa) {

       usuarioService.save(empresa.getUsuario());

       empresa.setHabilitado(Boolean.TRUE);
       empresa.setVersao(1L);
       empresa.setDataCriacao(LocalDate.now());
       Empresa empresaSalva = repository.save(empresa);

       //emailService.enviarEmailConfirmacaoCadastroEmpresa(empresaSalva);
       
       return empresaSalva;

   }
   
   public List<Empresa> findAll() {
  
    return repository.findAll();
}
  

public Empresa findById(Long id) {
  
    Optional<Empresa> consulta = repository.findById(id);
  
       if (consulta.isPresent()) {
           return consulta.get();
       } else {
           throw new EntidadeNaoEncontradaException("Empresa", id);
       }

    /*return repository.findById(id).get();*/
}

@Transactional
   public void update(Long id, Empresa empresaAlterada) {

      Empresa empresa = repository.findById(id).get();
      
      empresa.setSite(empresaAlterada.getSite());
      empresa.setNomeEmpresarial(empresaAlterada.getNomeEmpresarial());
      empresa.setNomeFantasia(empresaAlterada.getNomeFantasia());
      empresa.setInscricaoEstadual(empresaAlterada.getInscricaoEstadual());
      empresa.setCnpj(empresaAlterada.getCnpj());
      empresa.setFone(empresaAlterada.getFone());
      empresa.setFoneAlternativo(empresaAlterada.getFoneAlternativo());
	    
      empresa.setVersao(empresa.getVersao() + 1);
      repository.save(empresa);
  }
  @Transactional
  public void delete(Long id) {

      Empresa empresa = repository.findById(id).get();
      empresa.setHabilitado(Boolean.FALSE);
      empresa.setVersao(empresa.getVersao() + 1);

      repository.save(empresa);
  }

}

