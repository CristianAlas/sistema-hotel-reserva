public abstract class Habitacion {
    private int id;
    private boolean ocupada;
    private double precio;

    public Habitacion(int id, double precio) {
        this.id = id;
        this.ocupada = false;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public double getPrecio() {
        return precio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void cambiarPrecio(double newPrecio) {
        this.precio = newPrecio;
    }

    public abstract void dibujarFoto();

    @Override
    public String toString() {
        return " Habitacion " +
                " id = " + id +
                ", ocupada = " + ocupada +
                ", precio = " + precio ;
    }
}
