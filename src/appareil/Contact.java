package appareil;

public class Contact {
    private int numero;
    private String nom;
    private String numTel;
    private Appel appel;

    public Contact(int numero, String nom, String numTel) {
        this.numero = numero;
        this.nom = nom;
        this.numTel = numTel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }
}
