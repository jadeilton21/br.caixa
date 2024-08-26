package card_banco_caixa.br.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ItemDaBase {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

}
