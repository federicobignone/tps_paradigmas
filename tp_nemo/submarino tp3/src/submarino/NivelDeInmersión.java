package submarino;

public class NivelDeInmersión {
    public int z = 0;
    public abstract NivelDeInmersión Bajar(Character movimientos);
    public abstract NivelDeInmersión Subir(Character movimientos);
    public abstract NivelDeInmersión Capsula(Character movimientos);


}
