package appareil;

import java.util.Date;
import java.util.List;

public class Application {
    public static void main(String[] args) throws Exception {
    IAppareil appareit =new Appareil();
    Contact c1=new Contact(1,"C1","0659637198");
    Contact c2=new Contact(1,"C2","0659675190");
    appareit.enregistrer(c1);
    appareit.enregistrer(c2);
    Appel a1= new AppelEmet(1,new Date(), 50);
    Appel a2=new AppelEmet(2,new Date(),25);
    appareit.enregistrer(a1,"0659637198");
    appareit.enregistrer(a2,"0659675190");
    System.out.println("---------------------------------");
    System.out.println("consulter un contact sachant son numero");
       try {
         Contact c=appareit.consulter(1);
           System.out.println("le Nom de contact "+c.getNumero()+" est "+c.getNom());
           System.out.println("le Numero de tel de contact "+c.getNumero()+" est "+c.getNumTel());

         } catch (Exception e) {
           System.out.println(e.getMessage());
       }
        System.out.println("---------------------------------");
        System.out.println("consulter les contacts par mot clé");
        List<Contact> x =appareit.consulter("C");
        for (Contact c:x) {
            System.out.println("******************");
            System.out.println("le nom "+c.getNom());
            System.out.println("le numTel "+c.getNumTel());
        }
        System.out.println("---------------------------------");
        System.out.println("cout Total des appels");
        System.out.println("Cout Total "+appareit.coutTotalAppels());

        System.out.println("---------------------------------");
        System.out.println("cout Total d'un contact par numéro");
        //for (Appel a :appareit.getAppels().values())

        System.out.println(appareit.getAppels().values().size());

      System.out.println(appareit.coutTotalAppels(1));
    }
}

