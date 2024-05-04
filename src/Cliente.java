public abstract class Cliente {
    private String nombre;
    private int dias;

    public Cliente(String nombre, int dias) {
        this.nombre = nombre;
        this.dias = dias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDias() {
        return dias;
    }

    public abstract void cambiarDescuento(double newDescuento);

    public abstract double getDescuento();
}
