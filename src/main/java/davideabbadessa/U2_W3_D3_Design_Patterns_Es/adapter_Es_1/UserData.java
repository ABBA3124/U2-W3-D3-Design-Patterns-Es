package davideabbadessa.U2_W3_D3_Design_Patterns_Es.adapter_Es_1;


import lombok.Getter;

@Getter
public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(Datasource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }

}
