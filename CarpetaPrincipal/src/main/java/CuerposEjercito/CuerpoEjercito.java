package CuerposEjercito;
import soldados.Soldado;
import java.util.List;

public class CuerpoEjercito {
    public String CodigoCuerpo;
    public String Denominacion;
    public List<Soldado> soldados;

    public CuerpoEjercito(String CodigoCuerpo, String Denominacion, List<Soldado> soldados) {
        this.CodigoCuerpo = CodigoCuerpo;
        this.Denominacion = Denominacion;
        this.soldados = soldados;
    }
}
