package dev.java10x.CadastroDeNinja.Ninjas;
import dev.java10x.CadastroDeNinja.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //tranforma uma classe em uma ENTIDADE no Banco de Dados
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) //estrategia pra gerar numeros automaticos pro ID
    private Long id;
    private String nome;
    private String email;
    private int idade;

    @ManyToOne //UM ninja tem uma unica missão
    @JoinColumn (name = "missoes_id") //FK
    private MissoesModel missoes;

}
