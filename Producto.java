import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Producto
{
    Scanner sc = new Scanner(System.in);
    private String codigoBarras;
    private String temporal;
    private String nombreProducto;
    private String calorias;
    private String colesterol;
    private String azucar;
    private String grasa;

    public Producto(){
        System.out.println("Ingrese el nombre del producto");
        nombreProducto = sc.next();
        System.out.println("Ingrese el código de barras");
        try { 
            File miProducto = new File(nombreProducto +".txt");
            File miCodigo = new File(temporal = sc.next());
            if(miProducto.createNewFile() && miCodigo.createNewFile()){
                System.out.println("Nuevo producto creado");
                codigoBarras = temporal;

                System.out.println("¿Cuántas calorías tiene el producto?");
                calorias = sc.next();
                System.out.println("¿Cuánto colesterol tiene el producto?");
                colesterol = sc.next();
                System.out.println("¿Cuánta azúcar tiene el producto?");
                azucar = sc.next();
                System.out.println("¿Cuánta grasa total tiene el producto?");
                grasa = sc.next(); 

                FileWriter myWriter = new FileWriter(nombreProducto + ".txt");
                myWriter.write(nombreProducto);
                myWriter.write('\n');
                myWriter.write("Código de barras: " + codigoBarras);
                myWriter.write('\n');
                myWriter.write("Tiene " + calorias + " calorías.");
                myWriter.write('\n');
                myWriter.write("Tiene un colesterol de " + colesterol + " miligramos.");
                myWriter.write('\n');
                myWriter.write("Tiene " + azucar + " gramos de azúcar.");
                myWriter.write('\n');
                myWriter.write("Tiene una grasa total de " + grasa + " gramos.");
                myWriter.close();
                System.out.println("Se ha terminado de registrar el producto");
            } else {
                System.out.println("Este producto ya existe");
            }
        } catch(IOException e) {
            System.out.println("Ha ocurrido un error.");
        }

    }
}
