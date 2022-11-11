package controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import connection.ConnectionFactory;
import dao.ClienteJpaController;
import dao.EmprestimoJpaController;
import dao.LivroJpaController;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.Date;
import model.Cliente;
import model.Emprestimo;
import model.Livro;

/**
 * Esta classe é responsavel pelas operações CRUD da tabela emprestimo na base de dados
 * @author kevin
 */
public class EmprestimoController {

    private static Cliente cliente = new Cliente();
    private static ClienteJpaController controllerCliente = new ClienteJpaController(ConnectionFactory.getemf());
    private static Livro livro = new Livro();
    private static LivroJpaController controllerLivro = new LivroJpaController(ConnectionFactory.getemf());
    private static EmprestimoJpaController controller;
    private static Emprestimo emprestimo;
    
    /**
     * Grava registros na base de dados
     * @param idCliente
     * @param idLivro
     * @param dataEmprestimo
     * @param dataPrevista
     * @return 
     */
    public static boolean salvar(Long idCliente, Long idLivro, LocalDate dataEmprestimo, LocalDate dataPrevista) {
        controller = new EmprestimoJpaController(ConnectionFactory.getemf());
        emprestimo = new Emprestimo();

        emprestimo.setIdCliente(idCliente);
        emprestimo.setIdLivro(idLivro);
        emprestimo.setDataEmprestimo(dataEmprestimo);
        emprestimo.setDataPrevista(dataPrevista);

        LivroController.mudarStatusAlugado(idLivro);
        gerarComprovativo(idCliente, idLivro, dataEmprestimo, dataPrevista);
        try {
            controller.create(emprestimo);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    /**
     * 
     * @param id
     * @param dataEntrega
     * @return 
     */
    public static boolean devolucao(Long id, LocalDate dataEntrega) {
        controller = new EmprestimoJpaController(ConnectionFactory.getemf());
        emprestimo = controller.findEmprestimo(id);
        return false;
        
    }
    /**
     * Este Metodo visa gerar um recibo apos o emprestimo de um livro
     * @param idCliente
     * @param idLivro
     * @param dataEmprestimo
     * @param dataDevolucao 
     */
    public static void gerarComprovativo(Long idCliente, Long idLivro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        cliente = controllerCliente.findCliente(idCliente);
        livro = controllerLivro.findLivro(idLivro);

        String arquivo = "Comprovativo.pdf";
        Document document = new Document();
        Date date = new Date();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(arquivo));
            document.open();
            Paragraph p1 = new Paragraph("LIVRARIA PRO");
            Paragraph p2 = new Paragraph("Maputo-Cidade");
            Paragraph p3 = new Paragraph("Comprovativo");
            Paragraph p4 = new Paragraph(date.toString());
            Paragraph p5 = new Paragraph(" ");
            Paragraph p6 = new Paragraph(" ");
            Paragraph p7 = new Paragraph(" ");
            Paragraph p8 = new Paragraph("Nome:              " + " " + cliente.getNome());
            Paragraph p9 = new Paragraph("Titulo do livro:   " + " " + livro.getTitulo());
            Paragraph p10 = new Paragraph("Data de emprestimo:    " + " " + dataEmprestimo);
            Paragraph p11 = new Paragraph("Data de devolucao:    " + " " + dataDevolucao);

            p1.setAlignment(1);
            p2.setAlignment(1);
            p3.setAlignment(1);
            p4.setAlignment(1);
            p5.setAlignment(0);
            p6.setAlignment(0);
            p7.setAlignment(0);
            p8.setAlignment(0);
            p9.setAlignment(0);
            p10.setAlignment(0);
            p11.setAlignment(0);

            document.add(p1);
            document.add(p2);
            document.add(p3);
            document.add(p4);
            document.add(p5);
            document.add(p6);
            document.add(p7);
            document.add(p8);
            document.add(p9);
            document.add(p10);
            document.add(p11);

            document.close();
            Desktop.getDesktop().open(new File(arquivo));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
