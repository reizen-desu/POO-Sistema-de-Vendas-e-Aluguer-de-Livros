package controller;

import connection.ConnectionFactory;
import dao.ClienteJpaController;
import java.time.LocalDate;
import model.Cliente;


/**
 * Esta classe é responsavel pelas operações CRUD da tabela cliente na base de dados
 * @author kevin
 */
public class ClienteController {
    private static ClienteJpaController controller;
    private static Cliente cliente;

    /**
     * Grava registros na base de dados
     * @param nome
     * @param contacto
     * @param sexo
     * @param endereco
     * @param email
     * @param nrBi
     * @return 
     */
    public static boolean Gravar(String nome, String contacto, String sexo, String endereco, String email, String nrBi) {
        controller = new ClienteJpaController(ConnectionFactory.getemf());

        cliente = new Cliente();

        cliente.setNome(nome);
        cliente.setContacto(contacto);
        cliente.setSexo(sexo);
        cliente.setEndereco(endereco);
        cliente.setEmail(email);
        cliente.setNrBi(nrBi);

        try {
            controller.create(cliente);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    /**
     * Actualizar os registros na base de dados
     * @param id
     * @param nome
     * @param contacto
     * @param sexo
     * @param endereco
     * @param email
     * @param nrBi
     * @return 
     */
    public static boolean actualizar(Long id,String nome, String contacto, String sexo, String endereco, String email, String nrBi) {
        controller = new ClienteJpaController(ConnectionFactory.getemf());

        cliente = controller.findCliente(id);
        cliente.setNome(nome);
        cliente.setContacto(contacto);
        cliente.setSexo(sexo);
        cliente.setEndereco(endereco);
        cliente.setEmail(email);
        cliente.setNrBi(nrBi);

        try {
            controller.edit(cliente);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    /**
     * Apagar registros na base de dados
     * @param id
     * @return 
     */
    public static boolean excluir(Long id) {
        controller = new ClienteJpaController(ConnectionFactory.getemf());

        try {
            controller.destroy(id);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
