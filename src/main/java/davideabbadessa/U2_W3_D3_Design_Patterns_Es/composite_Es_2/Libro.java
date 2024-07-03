package davideabbadessa.U2_W3_D3_Design_Patterns_Es.composite_Es_2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@Setter
@Getter
public class Libro {
    private List<ComponenteLibro> contenuto;
    private List<String> autori;
    private double prezzo;

    public Libro() {
        this.contenuto = new ArrayList<>();
        this.autori = new ArrayList<>();
    }

    public void aggiungiAutore(String autore) {
        autori.add(autore);
    }

    public void rimuoviAutore(String autore) {
        autori.remove(autore);
    }

    public void aggiungiComponente(ComponenteLibro componente) {
        contenuto.add(componente);
    }

    public void rimuoviComponente(ComponenteLibro componente) {
        contenuto.remove(componente);
    }

    public void stampa() {
        System.out.println("Libro:");
        for (String autore : autori) {
            System.out.println("Autore: " + autore);
        }
        for (ComponenteLibro componente : contenuto) {
            componente.stampa();
        }
    }

    public int getNumeroPagine() {
        int numeroPagine = 0;
        for (ComponenteLibro componente : contenuto) {
            numeroPagine += componente.getNumeroPagine();
        }
        return numeroPagine;
    }

}
