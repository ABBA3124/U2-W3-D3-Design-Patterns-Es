package davideabbadessa.U2_W3_D3_Design_Patterns_Es;

import davideabbadessa.U2_W3_D3_Design_Patterns_Es.adapter1.Info;
import davideabbadessa.U2_W3_D3_Design_Patterns_Es.adapter1.InfoAdapter;
import davideabbadessa.U2_W3_D3_Design_Patterns_Es.adapter1.UserData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;

@SpringBootApplication
public class U2W3D3DesignPatternsEsApplication {

    public static void main(String[] args) {
        SpringApplication.run(U2W3D3DesignPatternsEsApplication.class, args);

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
