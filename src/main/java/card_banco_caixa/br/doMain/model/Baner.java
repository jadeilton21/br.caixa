package card_banco_caixa.br.doMain.model;


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

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroDoBaner() {
        return numeroDoBaner;
    }

    public void setNumeroDoBaner(String numeroDoBaner) {
        this.numeroDoBaner = numeroDoBaner;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }
}
