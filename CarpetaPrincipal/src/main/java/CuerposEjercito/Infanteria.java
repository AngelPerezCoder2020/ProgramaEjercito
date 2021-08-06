package CuerposEjercito;
import java.util.List;
import soldados.Soldado;

public class Infanteria extends CuerpoEjercito{
    public Infanteria(String CodigoCuerpo, String Denominacion, List<Soldado> soldados) {
        super(CodigoCuerpo, Denominacion, soldados);
    }
    
}