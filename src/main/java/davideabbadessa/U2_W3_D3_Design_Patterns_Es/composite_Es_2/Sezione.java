package davideabbadessa.U2_W3_D3_Design_Patterns_Es.composite_Es_2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements ComponenteLibro {
    private String titolo;
    private List<ComponenteLibro> sottoElementi;

    public Sezione(String titolo) {
        this.titolo = titolo;
        this.sottoElementi = new ArrayList<>();
    }

    public void aggiungi(ComponenteLibro componente) {
        sottoElementi.add(componente);
    }

    public void rimuovi(ComponenteLibro componente) {
        sottoElementi.remove(componente);
    }

    @Override
    public void stampa() {
        System.out.println("Sezione: " + titolo);
        for (ComponenteLibro componente : sottoElementi) {
            componente.stampa();
        }
    }

    @Override
    public int getNumeroPagine() {
        int numeroPagine = 0;
        for (ComponenteLibro componente : sottoElementi) {
            numeroPagine += componente.getNumeroPagine();
        }
        return numeroPagine;
    }
}
