package card_banco_caixa.br.model;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_baner")
public class Baner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String numeroDoBaner;
    @Column(name = "available_limit", precision = 13, scale = 2)
    private BigDecimal limite;
}
