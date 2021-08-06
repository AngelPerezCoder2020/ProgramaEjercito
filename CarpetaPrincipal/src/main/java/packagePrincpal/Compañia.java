package packagePrincpal;
import soldados.Soldado;
import java.util.List;

public class Compañia {
    public int NoCompañia;
    public String ActividadP;
    public List<Soldado> Soldados;
    public List<Cuartel> Cuarteles;

    public Compañia(int NoCompañia, String ActividadP, List<Soldado> Soldados) {
        this.NoCompañia = NoCompañia;
        this.ActividadP = ActividadP;
        this.Soldados = Soldados;
    }
}
