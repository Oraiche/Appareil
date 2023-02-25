package appareil;

import java.util.Date;

public class AppelRecu extends Appel{
    @Override
    public double cout() {
        return 0;
    }

    public AppelRecu() {
    }

    public AppelRecu(int numeroAppel, Date appelDate, double dureeAppel) {
        super(numeroAppel, appelDate, dureeAppel);
    }

}
