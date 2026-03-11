public class Producto {  //este es el nombre de la clase 
    //atrivutos (estos salieron despues de analizar nuestro diagrama UML)
    private String nombre;
    private String codigoProducto;
    private String categoria;
    private double tamanoOCantidad;
    private double precio;

    //costructor este nos sirve para cuando iniciamos el programa se precarge o inicie ya con una informacion como si fuera un bacap
    public Producto(String nombre, String codigoProducto, String categoria, double tamanoOCantidad, double precio) {
    this.nombre = nombre;
    this.codigoProducto = codigoProducto;
    this.categoria = categoria;
    this.tamanoOCantidad = tamanoOCantidad;
    this.precio = precio;
}
    // Getters esto es el encasulamiento que es lo que nos permite acceder a los atributos privados por eso inician con obtener para que me traigan ese dato.
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCodigoProducto() {
        return codigoProducto;
    }

    public String obtenerCategoria() {
        return categoria;
    }

    public double obtenerCantidad() {
        return tamanoOCantidad;
    }

    public double obtenerPrecio() {
        return precio;
    }


    // Métodos  en este punto metemos los demas metodos que teniamos en UML que no nesesitan ser encasulados
    public void bajarPrecio(double monto) {
        if (monto > 0 && monto <= precio) { //aca utilisamos la condicion if para que se no actualice el precio cuando cuando demos la orden en nesta linea seria para bajar el precio 
            precio -= monto;
        }
    }

    public void subirPrecio(double monto) {   //y aca tenemos una inversa patra poder subir el precio 
        if (monto > 0) {
            precio += monto;
        }
    }

    public void cambiarCantidad(double unidades) {
        if (unidades >= 0) {               // aca utilizamos tambien if para varir la cantidad de productos que tenemos 
            tamanoOCantidad = unidades;
        }
    }

    public boolean esVencido() {   //en este caso asumimos como si los productos no vencieran porque no manejamos las fechas de vencimieno entonces solo decimos que nada vence retornando un falso
        return false;
    }

    @Override  // esto lo utilizamos ya que en una lectura me decia que sirve para que java me detecte errores y me diaga como hay un error no es un metodo, escomo un seguro para que nos detecte errores
    public String toString() { //esta parte lo que hace es escribir en la consola lo que ya tenemos mas arriba que nos de la informacion en el orden que se le asigno
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", codigoProducto='" + codigoProducto + '\'' +
                ", categoria='" + categoria + '\'' +
                ", cantidad=" + tamanoOCantidad +
                ", precio=" + precio +
                '}';
    }

   
}
