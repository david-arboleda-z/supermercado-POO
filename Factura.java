import java.util.ArrayList; // aca igual inportamos desde la libreria el array que para crear listas que se pueden espandir utiles cuando tenemos mucha informacion conmo es el caso de un supermercado 

public class Factura {  //aca definimos el nombre de la clase 

    // Atributos como ya se menciono antes esto lo traemos del analisis previo en el diagrama de UML
    private String numeroFactura;
    private String fecha;
    private double total;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<Producto> listaProductos;

    // Constructor como lo mencionamos antes este es como nuestra memoria de inicio para que pueda iniciar el programa ya con los datos que le asignamos 
    public Factura(String numeroFactura, String fecha, Cliente cliente, Vendedor vendedor) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.listaProductos = new ArrayList<>();
        this.total = 0;
    }

    // Getters nuestro sistenma de encasulamiento para traer atrivutos que son privados 
    public String obtenerNumeroFactura() {
        return numeroFactura;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public Vendedor obtenerVendedor() {
        return vendedor;
    }

    public ArrayList<Producto> obtenerProductos() {
        return listaProductos;
    }

    public double obtenerTotal() {
        return total;
    }

    // Métodos estpos no necesitan ser encasulados tambien ya los habiamos definido en nuestro diagrama UML
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto); //aca lo que asemos es agregar el producto con add a nuestra lista 
        total += producto.obtenerPrecio(); //aca lo que asemos es obtener el precio del producto y sumarlo 
    }

    public void eliminarProducto(Producto producto) {
        if (listaProductos.remove(producto)) { //aca asemos lo contrario eliminamos el producto de nuetra factura y lo restamos 
            total -= producto.obtenerPrecio();
        }
    }

    public void calcularTotal() { // aca calculamos el total de la factura utilizamos el for para que nos traiga ese listado de productos y luego obtenemos el precio y se suman
        total = 0;
        for (Producto p : listaProductos) {
            total += p.obtenerPrecio();
        }
    }

    // Mostrar información de la factura
    @Override // como se menciono antes es para que nos muestre el error si llega a ver 
    public String toString() { // esta parte es la que nos muestra la informacion en la consola en el orden asignado 
        String productosStr = "";
        for (Producto p : listaProductos) {
            productosStr += "\n - " + p.toString();
        }
        return "Factura{" +
                "numeroFactura='" + numeroFactura + '\'' +
                ", fecha='" + fecha + '\'' +
                ", cliente=" + cliente.obtenerNombre() +
                ", vendedor=" + vendedor.obtenerNombre() +
                ", total=" + total +
                ", productos=" + productosStr +
                '}';
    }
}