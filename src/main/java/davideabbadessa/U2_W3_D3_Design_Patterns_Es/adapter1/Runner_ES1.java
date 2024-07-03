package davideabbadessa.U2_W3_D3_Design_Patterns_Es.adapter1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
public class Runner_ES1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        // <<-------------------------------ES1------------------------------->>
        System.out.println("<<-------------------------------ES1------------------------------->>");
        Info info = new Info();
        info.setNome("Davide");
        info.setCognome("abbadessa");

        System.out.println("Dovrebbe risultare data null in questo stato: " + info);

        Calendar calendar = Calendar.getInstance();
        calendar.set(1999, Calendar.MARCH, 2);
        info.setDataDiNascita(calendar.getTime());
        System.out.println("Dovrebbe risultare data compilato in questo stato: " + info);

        InfoAdapter adapter = new InfoAdapter(info);
        UserData userData = new UserData();
        userData.getData(adapter);

        System.out.println("Nome Completo: " + userData.getNomeCompleto());
        System.out.println("Età: " + userData.getEta());

    }
}
