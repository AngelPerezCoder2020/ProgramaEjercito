package CuerposEjercito;
import java.util.List;
import soldados.Soldado;

public class Armada extends CuerpoEjercito{
    
    public Armada(String CodigoCuerpo, String Denominacion, List<Soldado> soldados) {
        super(CodigoCuerpo, Denominacion, soldados);
    }   
}