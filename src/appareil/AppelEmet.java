package appareil;

import java.util.Date;

public class AppelEmet extends Appel{
    @Override
    public double cout() {
        return dureeAppel*2;
    }

    public AppelEmet() {
    }

    public AppelEmet(int numeroAppel, Date appelDate, double dureeAppel) {
        super(numeroAppel, appelDate, dureeAppel);
    }
}
