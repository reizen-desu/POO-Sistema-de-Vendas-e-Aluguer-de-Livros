package controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import connection.ConnectionFactory;
import dao.ClienteJpaController;
import dao.LivroJpaController;
import dao.VendaJpaController;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.Date;
import model.Cliente;
import model.Livro;
import model.Venda;

/**
 * Esta classe é responsavel pelas operações CRUD da tabela venda na base de dados
 * @author kevin
 */
public class VendaController {

    private static VendaJpaController controller;
    private static Venda venda;
    private static Cliente cliente = new Cliente();
    private static ClienteJpaController controllerCliente = new ClienteJpaController(ConnectionFactory.getemf());
    private static Livro livro = new Livro();
    private static  LivroJpaController controllerLivro = new LivroJpaController(ConnectionFactory.getemf());

    /**
     * cadastra venda de livro usuarios 
     * @param idCliente
     * @param idLivro
     * @param valor
     * @param dataVenda
     * @param quantidade
     * @return 
     */
    public static boolean cadastrar(Long idCliente, Long idLivro, Double valor, LocalDate dataVenda, Integer quantidade) {
        controller = new VendaJpaController(ConnectionFactory.getemf());
        venda = new Venda();

        venda.setDataDeVenda(dataVenda);
        venda.setIdCliente(idCliente);
        venda.setIdLivro(idLivro);
        venda.setValor(valor);
        venda.setQuantidade(quantidade);
        
        // Chamada do metodo que diminui os livros do stock no acto de venda
        LivroController.diminuir(idLivro, quantidade); 
                                                     
        gerarComprovativo(idCliente, idLivro, valor, quantidade, dataVenda);
        //Chamada do metodo que que gera recido de venda efectuada 
        
        try {
            controller.create(venda);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    /**
     * Gera Recibo de venda efectuada
     * @param idCliente
     * @param idLivro
     * @param valor
     * @param quantidade
     * @param data 
     */
    public static void gerarComprovativo(Long idCliente, Long idLivro, Double valor, Integer quantidade, LocalDate data) {
        cliente = controllerCliente.findCliente(idCliente);
        livro = controllerLivro.findLivro(idLivro);

        String arquivo = "Comprovativo.pdf";
        Document document = new Document();
        Date date = new Date();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(arquivo));
            document.open();
            Paragraph p1 = new Paragraph("LIVRARIA DUARTE");
            Paragraph p2 = new Paragraph("Maputo-Cidade");
            Paragraph p3 = new Paragraph("Comprovativo");
            Paragraph p4 = new Paragraph(date.toString());
            Paragraph p5 = new Paragraph(" ");
            Paragraph p6 = new Paragraph(" ");
            Paragraph p7 = new Paragraph(" ");
            Paragraph p8 = new Paragraph("Nome:              "+" "+ cliente.getNome());
            Paragraph p9 = new Paragraph("Titulo do livro:   "+" "+livro.getTitulo());
            Paragraph p10 = new Paragraph("Data da venda:    "+" "+ data);
            Paragraph p11 = new Paragraph("Quantidade:       "+" "+ quantidade);
            Paragraph p12 = new Paragraph("Valor total:      "+" "+ valor);
            
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
            p12.setAlignment(0);
            
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
            document.add(p12);

            document.close();
            Desktop.getDesktop().open(new File(arquivo));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
