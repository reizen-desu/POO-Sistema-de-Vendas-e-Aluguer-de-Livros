
package teste;

import connection.ConnectionFactory;
import controller.ClienteController;
import dao.ClienteJpaController;
import dao.FuncionarioJpaController;
import dao.LivroJpaController;
import dao.UsuarioJpaController;
import java.util.List;
import model.Cliente;
import static model.Cliente_.email;
import static model.Cliente_.nome;
import model.Funcionario;
import model.Livro;
import model.Usuario;


public class Livraria {

    public static void main(String[] args) {
        FuncionarioJpaController controller = new FuncionarioJpaController(ConnectionFactory.getemf());
        Funcionario funcionario = new Funcionario();
        
        funcionario.setNome("Bruce Naife");
        funcionario.setEmail("naifykevin@hotmail.com");
        funcionario.setNomeDeusuario("Bruce");
        funcionario.setSenha("0027");
        funcionario.setGenero("Masculino");
        funcionario.setContacto("845700752");
        funcionario.setEndereco("Matola");
        funcionario.setNrBi("1000157234175");
        funcionario.setAcesso("Gestor"); 
        controller.create(funcionario);
     
    }   
}
