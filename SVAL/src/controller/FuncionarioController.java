/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connection.ConnectionFactory;
import dao.FuncionarioJpaController;
import model.Funcionario;

/**
 *Esta classe é responsavel pelas operações CRUD da tabela Funcionario na base de dados
 * @author kevin
 */
public class FuncionarioController {

    private static FuncionarioJpaController controller = new FuncionarioJpaController(ConnectionFactory.getemf());
    private static Funcionario funcionario = new Funcionario();

    public static boolean salvar(String nome, String email, String nomeDeUsuario, String senha, String genero, String contacto, String endereco, String nrBi) {
        funcionario.setNome(nome);
        funcionario.setEmail(email);
        funcionario.setNomeDeusuario(nomeDeUsuario);
        funcionario.setSenha(senha);
        funcionario.setGenero(genero);
        funcionario.setContacto(contacto);
        funcionario.setEndereco(endereco);
        funcionario.setNrBi(nrBi);
        
        try {
            controller.create(funcionario);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    /**
     * Altera registros na base de dados
     * @param id
     * @param nome
     * @param email
     * @param nomeDeUsuario
     * @param senha
     * @param genero
     * @param contacto
     * @param endereco
     * @param nrBi
     * @return 
     */
    public static boolean alterar(Long id, String nome, String email, String nomeDeUsuario, String senha, String genero, String contacto, String endereco, String nrBi) {
        funcionario = controller.findFuncionario(id);
        funcionario.setNome(nome);
        funcionario.setEmail(email);
        funcionario.setNomeDeusuario(nomeDeUsuario);
        funcionario.setSenha(senha);
        funcionario.setGenero(genero);
        funcionario.setContacto(contacto);
        funcionario.setEndereco(endereco);
        funcionario.setNrBi(nrBi);
        
        try {
            controller.edit(funcionario);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    /**
     * Exclui registros na base de dados
     * @param id
     * @return 
     */
    public static boolean excluir(Long id){
        
        try {
            controller.destroy(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
