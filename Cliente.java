import java.util.ArrayList; //esta parte del codigo es para decirle a java que me importe de su libreria el tipo de lista array que es para generar listas
public class Cliente {  //esta es nuestra clase 
    // Atributos (estos salieron despues de analizar nuestro diagrama UML)
    private String nombre;
    private int edad;
    private String numeroCliente;
    private String metodoDePago;

    // Historial de compras aca es donde utilizamos las litas de la libreria para poder ver a futuro todas las compras que ha hecho el cliente 
    private ArrayList<String> historialCompras;

    // Constructor este nos sirve para cuando iniciamos el programa se precarge o inicie ya con una informacion como si fuera un bacap
    public Cliente(String nombre, int edad, String numeroCliente, String metodoDePago) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroCliente = numeroCliente;
        this.metodoDePago = metodoDePago;
        this.historialCompras = new ArrayList<>();
    }

    // Getters to es el encasulamiento que es lo que nos permite acceder a los atributos privados por eso inician con obtener para que me traigan ese dato.
    public String obtenerNombre() {
    return nombre;
    }

    public String obtenerNumeroCliente() {
    return numeroCliente;
    }

    //metodos en este punto metemos los demas metodos que teniamos en UML que no nesesitan ser encasulados
    public void actualizarDatos(String nuevoNombre, int nuevaEdad, String nuevoMetodoPago) {
    this.nombre = nuevoNombre;
    this.edad = nuevaEdad;
    this.metodoDePago = nuevoMetodoPago;
    }

    public void cambiarMetodoPago(String nuevoMetodo) { //aca solo utilizamos string para cambiar el nombre de metodo de pago 
    this.metodoDePago = nuevoMetodo;
    }

    public void pagar(double monto) { // aca ya utilizamos un double para poder mostara con decimales el dinero que pago el cliente 
    System.out.println(nombre + " ha pagado $" + monto + " usando " + metodoDePago);
    }

    public void verHistorialCompras() {  //aca lo que asemos es imprimir en la consola nuestra informacion y utilizamos un for para que nos traiga ese hostotial de compras 
    System.out.println("Historial de compras de " + nombre + ":");
    for (String compra : historialCompras) { 
        System.out.println("- " + compra);
    }
    }

     // Método para mostrar info del cliente
    @Override // esto lo utilizamos ya que en una lectura me decia que sirve para que java me detecte errores y me diaga como hay un error no es un metodo, escomo un seguro para que nos detecte errores
    public String toString() { //esta parte lo que hace es escribir en la consola lo que ya tenemos mas arriba que nos de la informacion en el orden que se le asigno
    return "Cliente{" +
           "nombre='" + nombre + '\'' +
           ", edad=" + edad +
           ", numeroCliente='" + numeroCliente + '\'' +
           ", metodoDePago='" + metodoDePago + '\'' +
           '}';
}


}
