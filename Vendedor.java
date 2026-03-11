public class Vendedor { // esta es nuestra clase 

    // Atributos estos los asignamos desde nuestro diagrama UML
    private String nombre;
    private int edad;
    private String numeroVendedor;
    private double ventas;
    private double horasTrabajadas;

    // Constructor este nos sirve para cuando iniciamos el programa se precarge o inicie ya con una informacion como si fuera un bacap
    public Vendedor(String nombre, int edad, String numeroVendedor, double ventas, double horasTrabajadas) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroVendedor = numeroVendedor;
        this.ventas = ventas;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Getters esto es el encasulamiento que es lo que nos permite acceder a los atributos privados por eso inician con obtener para que me traigan ese dato.
    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerEdad() {
    return edad;
    }

    public String obtenerNumeroVendedor() {
        return numeroVendedor;
    }

    public double obtenerVentas() {
        return ventas;
    }

    public double obtenerHorasTrabajadas() {
        return horasTrabajadas;
    }

    // Métodos en este punto metemos los demas metodos que teniamos en UML que no nesesitan ser encasulados
    public void actualizarDatos(String nuevoNombre, int nuevaEdad) { //aca utilisamos string y int para poder digitar el nombre y la edad 
        this.nombre = nuevoNombre;
        this.edad = nuevaEdad;
    }

    public void registrarVentas(double monto) { // aca utilisamos la condicion if para que se nos cumpla cuando el vendedor registre una venta 
        if (monto > 0) {  
            this.ventas += monto; 
        }
    }

    public void registrarHoras(double horas) { // igual aca la utilizamos if para registar las horas de trabajo del vendedor 
        if (horas > 0) {
            this.horasTrabajadas += horas;
        }
    }

    // Método para mostrar info del vendedor
    @Override // esto lo utilizamos ya que en una lectura me decia que sirve para que java me detecte errores y me diaga como hay un error no es un metodo, escomo un seguro para que nos detecte errores
    public String toString() {  //esta parte lo que hace es escribir en la consola lo que ya tenemos mas arriba que nos de la informacion en el orden que se le asigno
        return "Vendedor{" +
                "nombre='" + nombre + '\'' +
                ", numeroVendedor='" + numeroVendedor + '\'' +
                ", ventas=" + ventas +
                ", horasTrabajadas=" + horasTrabajadas +
                '}';
    }
}
