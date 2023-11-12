package linea;

public abstract class Turno {



    public abstract void playRedkAt(Linea linea, int position) ;


    public abstract void playBlueAt(Linea linea, int position);


    public abstract Turno nextTurn() ;

}
