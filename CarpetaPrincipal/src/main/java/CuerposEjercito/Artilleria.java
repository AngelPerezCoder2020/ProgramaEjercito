package CuerposEjercito;
import java.util.List;
import soldados.Soldado;

public class Artilleria extends CuerpoEjercito{
    
    public Artilleria(String CodigoCuerpo, String Denominacion, List<Soldado> soldados) {
        super(CodigoCuerpo, Denominacion, soldados);
    }
}