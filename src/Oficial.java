public class Oficial extends Bombero{
    private int anosexperiencia;

    public Oficial(String dni, String nombre, int anosexperiencia) {
        super(dni, nombre);
        this.anosexperiencia = anosexperiencia;
        setSueldobase(calcularsueldo());
    }

    public int calcularsueldo(){
        int sueldo=0;
        for (int i = 0; i <anosexperiencia ; i++) {
            sueldo+=30;
        }
        setSueldobase(getSueldobase()+sueldo);
        return sueldo;
    }
}
