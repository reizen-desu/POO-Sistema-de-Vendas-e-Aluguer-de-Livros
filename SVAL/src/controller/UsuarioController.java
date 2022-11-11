package controller;

import connection.ConnectionFactory;
import dao.UsuarioJpaController;
import java.util.List;
import model.Usuario;

/**
 * Esta classe é responsavel pelas operações CRUD da tabela Usuario na base de dados
 * @author kevin
 */
public class UsuarioController {

    private static UsuarioJpaController controller;
    private static List<Usuario> usuarios;
    
    /**
     * Autenticacao dos usuarios base de dados
     * @param nome
     * @param senha
     * @return 
     */
    public static boolean login(String nome, String senha) {
        controller = new UsuarioJpaController(ConnectionFactory.getemf());
        usuarios = controller.findUsuarioEntities();

        for (Usuario iterador : usuarios) {
            if (iterador.getUsuario().equalsIgnoreCase(nome)&&iterador.getSenha().equalsIgnoreCase(senha)) {
                return true;
            }
        }
        return false;
    }

}
