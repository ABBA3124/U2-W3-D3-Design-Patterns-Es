package davideabbadessa.U2_W3_D3_Design_Patterns_Es.adapter1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;


@ToString
@Getter
@Setter
public class Info {
    private String nome;
    private String cognome;
    private Date dataDiNascita;

    
}
