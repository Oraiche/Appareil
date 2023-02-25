package appareil;

import java.util.Date;

public abstract class Appel {
    protected int numeroAppel;
    protected Date appelDate;
    protected double dureeAppel;
   private Contact contact;

    public  abstract double cout();

    public Appel() {
    }

    public Appel(int numeroAppel, Date appelDate, double dureeAppel) {
        this.numeroAppel = numeroAppel;
        this.appelDate = appelDate;
        this.dureeAppel = dureeAppel;

    }

    public int getNumeroAppel() {
        return numeroAppel;
    }

    public void setNumeroAppel(int numeroAppel) {
        this.numeroAppel = numeroAppel;
    }

    public Date getAppelDate() {
        return appelDate;
    }

    public void setAppelDate(Date appelDate) {
        this.appelDate = appelDate;
    }

    public double getDureeAppel() {
        return dureeAppel;
    }

    public void setDureeAppel(double dureeAppel) {
        this.dureeAppel = dureeAppel;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}

