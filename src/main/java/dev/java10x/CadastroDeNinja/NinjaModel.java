package dev.java10x.CadastroDeNinja;


import jakarta.persistence.*;

@Entity //tranforma uma classe em uma ENTIDADE no Banco de Dados
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) //estrategia pra gerar numeros automaticos pro ID
    Long id;
    String nome;
    String email;
    int idade;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
