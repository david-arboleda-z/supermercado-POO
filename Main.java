public class Main {  //aca esta clase le pusimos main para poder hacer pruevas 
    public static void main(String[] args) { // lo que asemos aca es que java entre al  la clase main y empoeize a ejecutar el args es por si llega a ver optra entrada 

        // ---------------------------
        // 1. Crear productos
        // ---------------------------
        Producto p1 = new Producto("Arroz", "A001", "Granos", 1000, 2500);  // aca le damos informacion de cada producto le asignamos cada atributo pero ya con su dato espesifico
        Producto p2 = new Producto("Leche", "B001", "Lácteos", 500, 1500);

        p1.subirPrecio(300);   // Subir precio aca lo que asemos es ejecutar unba accion que suba el precio
        p2.bajarPrecio(200);   // Bajar precio

        System.out.println("=== Productos ===");  //esto es para que imprima la informacion 
        System.out.println(p1);
        System.out.println(p2); 

        // ---------------------------
        // 2. Crear cliente
        // ---------------------------
        Cliente c1 = new Cliente("Juan", 30, "C001", "Tarjeta"); //aca es lo mismo de arriba le damos datos especificos a los atrivutos 
        c1.cambiarMetodoPago("Efectivo");
        c1.pagar(2800);

        System.out.println("\n=== Cliente ==="); // imprimimos esa informacion 
        System.out.println(c1);

        // ---------------------------
        // 3. Crear vendedor
        // ---------------------------
        Vendedor v1 = new Vendedor("Pedro", 28, "V001", 0, 0); // aca igual pero para el vendedor 
        v1.registrarVentas(2800);
        v1.registrarHoras(8);

        System.out.println("\n=== Vendedor ==="); // imprimimos esa informacion 
        System.out.println(v1);

        // ---------------------------
        // 4. Crear factura
        // ---------------------------
        Factura f1 = new Factura("F001", "01/12/2025", c1, v1); // aca lo que asemos es crear essa factura 
        f1.agregarProducto(p1); // y aca agregamos los productos a la factura con sus ajustes ya realisados 
        f1.agregarProducto(p2);

        System.out.println("\n=== Factura ===");
        System.out.println(f1);

        // ---------------------------
        // 5. Crear inventario
        // ---------------------------
        Inventario inv1 = new Inventario("A001", "Arroz", "Granos", 1000, 200, "31/12/2025", "Proveedor A"); //aca lo que estamos mostrando son los productos que salieron del sistema para despues poderlos pedir 
        Inventario inv2 = new Inventario("B001", "Leche", "Lácteos", 500, 100, "15/12/2025", "Proveedor B");

        inv1.registrarSalida(100);
        inv2.registrarIngreso(200);

        System.out.println("\n=== Inventario ===");
        System.out.println(inv1);
        System.out.println(inv2);
    }
}
