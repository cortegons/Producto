import java.util.Scanner;
import java.io.*;

public class Main 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args) throws java.io.FileNotFoundException {

        int decision;
        String nombreProducto;

        System.out.println("¿Qué desea hacer?");
        System.out.println("Presione 1 para buscar un producto");
        System.out.println("Presiona 2 para registrar un nuevo producto");
        decision = sc.nextInt();

        if(decision == 2) {
            Producto nuevo = new Producto();

        }
        if (decision == 1) {
            System.out.println("Ingrese el nombre del producto a buscar");
            nombreProducto = sc.next();
            buscar(nombreProducto);

        }
    }

    public static void buscar(String nombre) throws FileNotFoundException{
        FileReader leer = new FileReader(nombre + ".txt");
        try{
            int valor=leer.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor = leer.read();
            }
            }catch(IOException e){
            System.out.println("Ha ocurrido un error.");
        }
        
        System.out.println("¿Qué desea hacer?");
        System.out.println("1 para leer comentarios, 2 para comentar sobre este producto, 3 para salir");
        int decision = sc.nextInt();
        if(decision == 1) {
            FileReader leerc = new FileReader(nombre + "-C.txt");
        try{
            int valor=leerc.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor = leerc.read();
            }
            }catch(IOException e){
            System.out.println("Ha ocurrido un error.");
        }
    }
    if(decision == 2){
        Comentario nuevoc = new Comentario(nombre);
    }
    return;
}
}


