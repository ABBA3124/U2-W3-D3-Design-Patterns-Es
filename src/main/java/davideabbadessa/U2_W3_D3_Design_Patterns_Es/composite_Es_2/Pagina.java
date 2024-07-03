package davideabbadessa.U2_W3_D3_Design_Patterns_Es.composite_Es_2;


public class Pagina implements ComponenteLibro {
    private int numero;

    public Pagina(int numero) {
        this.numero = numero;
    }

    @Override
    public void stampa() {
        System.out.println("Pagina " + numero);
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }
}
