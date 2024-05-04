public class Esporadico extends Cliente{
    public Esporadico(String nombre, int dias) {
        super(nombre, dias);
    }

    @Override
    public void cambiarDescuento(double newDescuento) {

    }

    @Override
    public double getDescuento() {
        return 0;
    }

    @Override
    public String toString() {
        return " Esporadico, " +
                " Nombre = " + getNombre()
//                " Dias = " + getNombre()
                ;
    }
}
