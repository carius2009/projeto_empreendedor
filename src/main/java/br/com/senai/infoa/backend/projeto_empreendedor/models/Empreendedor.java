package br.com.senai.infoa.backend.projeto_empreendedor.models;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity 
@Table(name = "empreendedor")


public class Empreendedor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column (name = "Cpf")
    private String Cpf;

    @Column (name = "Data_Nascimento")
    private String dataNascimento;

    @ManyToMany
    @JoinTable(
        name = "empreendedor_produto",
        joinColumns = @JoinColumn(name = "empreendedor_id"),
        inverseJoinColumns = @JoinColumn(name = "produto_id")
    )

    private java.util.List<Produto> produtos;

    public Empreendedor() {
    }

    public Empreendedor(String Cpf, String dataNascimento, Integer id, String nome, List<Produto> produtos) {
        this.Cpf = Cpf;
        this.dataNascimento = dataNascimento;
        this.id = id;
        this.nome = nome;
        this.produtos = produtos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public java.util.List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(java.util.List<Produto> produtos) {
        this.produtos = produtos;
    }

}
