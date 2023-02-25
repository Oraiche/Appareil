package appareil;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface IAppareil {
    public void enregistrer(Contact s);
    public void enregistrer(Appel a,String numTel);
    public Contact consulter(int numero) throws Exception;
    public List<Contact> consulter(String mc);
    public double coutTotalAppels();
    public double coutAppels(Date d1, Date t2);
    public double coutTotalAppels(int numero) throws Exception;
    public Map<Integer, Appel> getAppels();
    public List <Contact> getContacts();

}
