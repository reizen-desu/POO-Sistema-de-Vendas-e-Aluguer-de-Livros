package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Funcionarios")
@Getter
@Setter
@NoArgsConstructor
@Data
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String contacto;
    private String email;
    private String senha;
    private String genero;
    private String endereco;
    private String nomeDeusuario;
    private String acesso = "Funcionario";
    private String nrBi;

}
