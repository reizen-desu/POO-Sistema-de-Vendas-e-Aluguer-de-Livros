package model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
    @Table(name = "Clientes")
    @Data                          //Gera os metodos geTras os metodos getteres e setters 
    @AllArgsConstructor
    @NoArgsConstructor


public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String contacto;
    private String sexo;
    private String morada;
    private String email;
    private String nrBi;
    private LocalDate dataCompra;
    private LocalDate dataDevolucao;
    private String endereco;
    private Double cliente;
}
