package br.com.ifpe.oxefood.modelo.Entregador;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Entregador")
@Where(clause = "habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Entregador extends EntidadeAuditavel{
    
    @Column(nullable = false, length = 100)
   private String nome;
    
   @Column
   private LocalDate dataNascimento;
   
   @Column(unique = true)
   private String cpf;
   
   @Column
   private String foneCelular;
   
   @Column
   private String foneFixo;

   @Column
   private String rg;

   @Column
   private String qtdEntregas;

   @Column
   private String valorFrete;

   @Column
   private String rua;

   @Column
   private String numero;

   @Column
   private String bairro;

   @Column
   private String cidade;

   @Column
   private String cep;

   @Column
   private String uf;

   @Column
   private String complemento;

}
