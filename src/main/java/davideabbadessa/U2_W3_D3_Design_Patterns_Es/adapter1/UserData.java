package davideabbadessa.U2_W3_D3_Design_Patterns_Es.adapter1;

public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(Datasource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public int getEta() {
        return eta;
    }
}
