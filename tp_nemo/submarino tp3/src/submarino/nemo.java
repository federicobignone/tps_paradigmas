package submarino;

public class nemo {
    private int x = 0;
    private int y = 0;
    private int z = 0;
    private String direccion = "NORTE";

    public String posicionActual() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public String direccionActual() {
        return direccion;
    }
    public void Mover(String movimientos) {}


    public String Mover(Character movimientos) {
        if (movimientos.equals('m')) {
            if (y>=-1){
                return "Nemo libera la cápsula";
            }
            else {
                throw new RuntimeException("Nemo explota");
            }
        }
        if (movimientos.equals('d')) {
            z -= 1;
        }
        if (movimientos.equals('u')) {
            z += 1;
            if (z > 0) {
                z = 0;
            }
        }
        if (movimientos.equals('f')) {
            if (direccion.equals("NORTE")) {
                y += 1;
            }
            if (direccion.equals("SUR")) {
                y -= 1;
            }
            if (direccion.equals("ESTE")) {
                x += 1;
            }
            if (direccion.equals("OESTE")) {
                x -= 1;
            }

        }
        if (movimientos.equals('l')) {
            if (direccion.equals("NORTE")) {
                direccion = "OESTE";
            } else if (direccion.equals("OESTE")) {
                direccion = "SUR";
            } else if (direccion.equals("SUR")) {
                direccion = "ESTE";
            } else if (direccion.equals("ESTE")) {
                direccion = "NORTE";
            }
        }
        if (movimientos.equals('r')) {
            if (direccion.equals("NORTE")) {
                direccion = "ESTE";
            } else if (direccion.equals("ESTE")) {
                direccion = "SUR";
            } else if (direccion.equals("SUR")) {
                direccion = "OESTE";
            } else if (direccion.equals("OESTE")) {
                direccion = "NORTE";
            }
        }

        return null;
    }

}


