import java.util.ArrayList;
import java.util.List;

public class Cabo extends Bombero{
    List<Bombero> grupobombero=new ArrayList<>();

    public Cabo(String dni, String nombre, List<Bombero> grupobombero) {
        super(dni, nombre);
        this.grupobombero = grupobombero;
         setSueldobase(getSueldobase()+600);
    }

    public void anadirbom(Bombero e){
        grupobombero.add(e);
    }
    public void mostrarbom(){
        System.out.println("Mostrando Bomberos a cargo de "+ getNombre());
        for (Bombero b: grupobombero){
            System.out.println(b);
        }
    }
}
