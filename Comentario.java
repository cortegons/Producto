import java.util.Scanner;
import java.io.*;

public class Comentario {
    private String comentario;
    private String usuario;
    private String nombreProducto;
    Scanner sc = new Scanner(System.in);

    public Comentario(String nombreProducto){
        this.nombreProducto = nombreProducto;
        File producto = new File(nombreProducto + ".txt");
        if(producto.exists()){
            System.out.println("Ingresa tu nombre");
            setUsuario(sc.next());
            System.out.println("Ingresa tu comentario");
            sc.nextLine();
            setComentario(sc.nextLine());
            

            File nuevoComentario = new File(nombreProducto + "-C.txt");
            try {
                FileWriter escribir = new FileWriter(nombreProducto + "-C.txt", true);
                escribir.write("\n");
                escribir.write("\n");
                escribir.write(usuario + " dice: ");
                escribir.write("\n");
                escribir.write("\n");
                escribir.write(comentario);
                escribir.close();
                
                System.out.println("Se ha registrado tu comentario");
                
            } catch(IOException e) {
            System.out.println("Ha ocurrido un error.");
        }
        }

    }

    
    public void setUsuario(String u){
        usuario = u;
    }

    public void setComentario(String c){
        comentario = c;
    }

    public void setNP(String np){
        nombreProducto = np;
    }

}
