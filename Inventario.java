public class Inventario { // este es el nombre de nuestra clase 

    // Atributos previamente sacados de UML 
    private String codigoProducto;
    private String nombreProducto;
    private String categoria;
    private double cantidad;
    private double stockMinimo;
    private String fechaVencimiento;
    private String proveedor;

    // Constructor como dijimos antes nuetro precarga del programa 
    public Inventario(String codigoProducto, String nombreProducto, String categoria,
                      double cantidad, double stockMinimo, String fechaVencimiento, String proveedor) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.stockMinimo = stockMinimo;
        this.fechaVencimiento = fechaVencimiento;
        this.proveedor = proveedor;
    }

    // Getters nuestros encasulamientos (lo abrevio porque ya se esplico en otra pagina)
    public String obtenerCodigoProducto() {
        return codigoProducto;
    }

    public String obtenerNombre() {
        return nombreProducto;
    }

    public String obtenerCategoria() {
        return categoria;
    }

    public double obtenerCantidad() {
        return cantidad;
    }

    public String obtenerFechaVencimiento() {
        return fechaVencimiento;
    }

    public String obtenerProveedor() {
        return proveedor;
    }

    // Métodos igual ya traidos de nustro diagrama UML
    public void registrarIngreso(double unidades) {
        if (unidades > 0) { //aca usamos if para que se cumpla la condicion comno es ingreso que siempre sea mayor que 0 
            cantidad += unidades;
        }
    }

    public void registrarSalida(double unidades) {
        if (unidades > 0 && unidades <= cantidad) { // y aca lo contrario porque es salida 
            cantidad -= unidades;
        }
    }

    public void actualizarCantidad(double nuevaCantidad) {
        if (nuevaCantidad >= 0) {  //esto lo utilizamos por si nos llega un producto con una cantidad diferente poderlo agregar al inventario por eso pusimnos if para que se cumpla la condicion 
            cantidad = nuevaCantidad;
        }
    }

    public boolean necesitaReposicion() { //aca lo que asemos es que nos devuelva un si o no, si necesitamos mas producto o tenemos en stock
        return cantidad <= stockMinimo; 
    }

    public boolean productoVencido() {
        // Por ahora retornamos false; se puede mejorar comparando fechas ya que no las manejamos aun, lo dejamos asi para que funcione pero para tenerlo a futuro 
        return false;
    }

    public void pedirProducto() {
        System.out.println("Se ha realizado un pedido al proveedor: " + proveedor); //aca lo que asemos es imprimir que ya se realiso el mpedido y que nos traiga la informacion de que provedor es 
    }

    // Mostrar información del inventario
    @Override //como ya se menciono parea que nos muestre errores 
    public String toString() { //es el orden en que la consola nos va mostrar la informacion como va inprimir en pantalla 
        return "Inventario{" +
                "codigoProducto='" + codigoProducto + '\'' +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", categoria='" + categoria + '\'' +
                ", cantidad=" + cantidad +
                ", stockMinimo=" + stockMinimo +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                ", proveedor='" + proveedor + '\'' +
                '}';
    }
}
