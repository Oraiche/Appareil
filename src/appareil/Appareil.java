package appareil;

import java.util.*;

public class Appareil implements IAppareil{
    private List<Contact> contacts=new ArrayList<Contact>();
    private Map<Integer,Appel> appels=new HashMap<Integer,Appel>();

    public List<Contact> getContacts() {
        return contacts;
    }

    public Map<Integer, Appel> getAppels() {
        return appels;
    }

    @Override
    public void enregistrer(Contact s) {
              contacts.add(s);
    }

    @Override
     public void enregistrer(Appel a, String numTel) {
              Contact c=null;
              for (Contact x: contacts)
              {  if (x.getNumTel().contains(numTel)){
                      c=x;
                  break;}}
              if (c!=null)
              { a.setContact(c);appels.put(a.numeroAppel,a);}
    }
    /*@Override
    public void enregistrer(Appel a, String numTel) {
        if (a == null || numTel == null || numTel.isBlank()) {
            System.out.println("Error");
        }
        for (Contact x: contacts) {
            if (numTel.equals(x.getNumTel())) {
                a.setContact(x);
                appels.put(a.numeroAppel, a);
                break;
            }
        }
    }*/

    @Override
    public Contact consulter(int numero) throws Exception {
        for (Contact x:contacts)
            if (x.getNumero()==numero)
                return x;
        throw new Exception("Contact "+numero+" Introuvable");
    }

    @Override
    public List<Contact> consulter(String mc) {
        List<Contact> c=new ArrayList<Contact>();
        for (Contact x: contacts)
            if (x.getNom().contains(mc))
                c.add(x);
        return c;
    }

    @Override
    public double coutTotalAppels() {
      double total=0;
      for (Appel a :appels.values())
          total+=a.cout();
        return total;
    }

    @Override
    public double coutAppels(Date d1, Date d2) {
        double total=0;
        for (Appel a :appels.values())
            if (a.getAppelDate().getTime()>d1.getTime() && a.getAppelDate().getTime()<d2.getTime())
                    total+=a.cout();
        return total;
    }

    @Override
    public double coutTotalAppels(int numero) {
        double total = 0;
          for (Appel a : appels.values())
            if (a.getContact().getNumero() == numero)
                total+= a.cout();
          return total;

    }

}
