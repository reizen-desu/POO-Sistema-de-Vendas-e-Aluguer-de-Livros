package controller;

import connection.ConnectionFactory;
import dao.LivroJpaController;
import java.time.LocalDate;
import model.Livro;

/**
 * Esta classe é responsavel pelas operações CRUD da tabela livro na base de dados
 * @author kevin
 */
public class LivroController {

    private static LivroJpaController controller;
    private static Livro livro;
    
    /**
     * Salva registros na base de dados
     * @param titulo
     * @param autor
     * @param edicao
     * @param sbn
     * @param ano
     * @param preco
     * @param quantidade
     * @return 
     */
    public static boolean salvar(String titulo, String autor, String edicao, Integer sbn, LocalDate ano, Double preco, Integer quantidade) {
        controller = new LivroJpaController(ConnectionFactory.getemf());
        livro = new Livro();

        livro.setTitulo(titulo);
        livro.setSbn(sbn);
        livro.setQuantidade(quantidade);
        livro.setPreco(preco);
        livro.setEdicao(edicao);
        livro.setAutor(autor);
        livro.setAno(ano);

        try {
            controller.create(livro);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    /**
     * Actualiza registros na base de dados
     * @param id
     * @param titulo
     * @param autor
     * @param edicao
     * @param sbn
     * @param ano
     * @param preco
     * @param quantidade
     * @return 
     */
    public static boolean actualizar(Long id, String titulo, String autor, String edicao, Integer sbn, LocalDate ano, Double preco, Integer quantidade) {
        controller = new LivroJpaController(ConnectionFactory.getemf());
        livro = controller.findLivro(id);

        livro.setTitulo(titulo);
        livro.setSbn(sbn);
        livro.setQuantidade(quantidade);
        livro.setPreco(preco);
        livro.setEdicao(edicao);
        livro.setAutor(autor);
        livro.setAno(ano);

        try {
            controller.edit(livro);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    /**
     * Elimina registros na base de dados
     * @param id
     * @return 
     */
    public static boolean eliminar(Long id) {
        controller = new LivroJpaController(ConnectionFactory.getemf());

        try {
            controller.destroy(id);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    /**
     * Muda o status para alugado
     * @param id 
     */
    public static void mudarStatusAlugado(Long id){
        controller = new LivroJpaController(ConnectionFactory.getemf());
        livro = new Livro();
        
        livro = controller.findLivro(id);
        livro.setStatus("Alugado");
        try {
            controller.edit(livro);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    /**
     * Dminui os livros do stock apos serem comprados ou alugados
     * @param id
     * @param quantidade 
     */
    public static void diminuir(Long id, Integer quantidade){
        controller = new LivroJpaController(ConnectionFactory.getemf());
        livro = new Livro();
        livro = controller.findLivro(id);
        int actual = livro.getQuantidade() - quantidade;
        livro.setQuantidade(actual);
        
        try {
            controller.edit(livro);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
