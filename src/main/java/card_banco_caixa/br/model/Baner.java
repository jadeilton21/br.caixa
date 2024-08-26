package card_banco_caixa.br.model;


import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity(name = "tb_baner")
public class Baner {


    private Long id;

    private String numeroDoBaner;

    private BigDecimal limite;
}
