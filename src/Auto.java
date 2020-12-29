//Objeto que hereda de vehiculo
public class Auto extends Vehiculo{
    private int cantPuerta;

    public Auto(String marca, String modelo, Double precio, int cantPuerta) {
        super(marca, modelo, precio);
        this.cantPuerta = cantPuerta;
    }

    public int getCantPuerta() {
        return cantPuerta;
    }

    public void setCantPuerta(int cantPuerta) {
        this.cantPuerta = cantPuerta;
    }
    @Override
    public String toString() {
        return "Marca : " + getMarca() + " // Modelo: " + getModelo() + " // Puertas: " + getCantPuerta()  + " // Precio : $"
                + getPrecio();
    }

}
