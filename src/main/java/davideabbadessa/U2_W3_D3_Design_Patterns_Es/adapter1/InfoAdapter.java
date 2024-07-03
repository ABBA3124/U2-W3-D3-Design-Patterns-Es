package davideabbadessa.U2_W3_D3_Design_Patterns_Es.adapter1;

import java.util.Calendar;

public class InfoAdapter implements Datasource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        Calendar birthCalendar = Calendar.getInstance();
        birthCalendar.setTime(info.getDataDiNascita());
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - birthCalendar.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < birthCalendar.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }
}
