package Servicios;
import Entidad.Coche;

public class CocheService {
    
    public Coche CrearCoche(){
        return new Coche();
    }
    
    public void numeroPuertas(Coche coche){
        int puertas = coche.getPuertas() + 1;
        coche.setPuertas(puertas);
    }

}

