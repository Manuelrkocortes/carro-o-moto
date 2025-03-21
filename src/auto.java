public class auto  extends Vehiculo{
    private int numeroPuertas;

    public auto(String marca , String modelo , int año , double precioBase , int numeroPuertas) {
        super(marca , modelo , año , precioBase);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "auto{" +
                "numeroPuertas=" + numeroPuertas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", precioBase=" + precioBase +
                '}';
    }
}
