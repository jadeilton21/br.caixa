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





}
