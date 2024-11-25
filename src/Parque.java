import java.util.ArrayList;
import java.util.List;

enum Aviso{
    FUEGO,ACCIDENTE,INUNDACION,OTROS
}
public class Parque {
    private String id;
    List<Aviso> Listaavisos=new ArrayList<>();
    List<Bombero> Listaabombe=new ArrayList<>();

    public Parque(String id ) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Aviso> getListaavisos() {
        return Listaavisos;
    }

    public void setListaavisos(List<Aviso> listaavisos) {
        Listaavisos = listaavisos;
    }

    public void anb(Bombero e){
        Listaabombe.add(e);
    }
    public void anv(Aviso e){
        Listaavisos.add(e);
    }
    public void mosbo(){
        System.out.println("Mostrando Bomberos a cargo de ");
        for (Bombero b: Listaabombe){
            System.out.println(b);
        }
    }

    public void atenderaviso(){
        int i=0;
        int e=0;


        while (i < Listaavisos.size()){
            Aviso aviso1=Listaavisos.get(i);

            while (e < Listaabombe.size()){
                Bombero bombero1=Listaabombe.get(e);
                if (aviso1.equals("ACCIDENTE") && bombero1 instanceof Cabo){
                    System.out.println("El bombero"+bombero1+"Atiende"+aviso1);
                    Listaabombe.remove(e);

                } else if (aviso1.equals("FUEGO") && bombero1 instanceof Cabo) {
                    System.out.println("El bombero"+bombero1+"Atiende"+aviso1);
                    Listaabombe.remove(e);

                } else if (aviso1.equals("INUNDACION") && bombero1 instanceof Oficial) {
                    System.out.println("El bombero"+bombero1+"Atiende"+aviso1);
                    Listaabombe.remove(e);

                } else if (aviso1.equals("ACCIDENTE") && bombero1 instanceof Bombero) {
                    System.out.println("El bombero"+bombero1+"Atiende"+aviso1);
                    Listaabombe.remove(e);
                }
                e++;
            }
            Listaavisos.remove(i);
            i++;
        }
    }

    public void gestionarAVISOS(){
        int i=0;
        boolean enc;
        while (!Listaavisos.isEmpty()|| i < Listaavisos.size()){
            enc=falsa;
            for (int j = 0; j <Listaabombe.size() && !enc ; j++) {
                switch (Listaavisos.get(í)){
                    case OTROS:
                        if
                    break;
                    case ;
                        break;
                    case ;
                        break;
                    case ;
                        break;
                    default:
                        break;
                }
            }
        }
    }

}


