package card_banco_caixa.br.model;

import jakarta.persistence.*;

import java.util.List;
@Entity(name = "tb_usuario")
public class Usuario {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    private Conta conta;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)

    private List<Fatura> faturas;
    @OneToOne(cascade = CascadeType.ALL)
    private Baner baner;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Novos> novos;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public List<Fatura> getFaturas() {
        return faturas;
    }

    public void setFaturas(List<Fatura> faturas) {
        this.faturas = faturas;
    }

    public Baner getBaner() {
        return baner;
    }

    public void setBaner(Baner baner) {
        this.baner = baner;
    }

    public List<Novos> getNovos() {
        return novos;
    }

    public void setNovos(List<Novos> novos) {
        this.novos = novos;
    }
}
