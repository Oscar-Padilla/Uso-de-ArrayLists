import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;
public class Ejemplo3 
{
    static Deque kk = new LinkedList();
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) 
    {
        Ejemplo3 e = new Ejemplo3();
        boolean i = true;
        while(i==true)
        {
            System.out.println("\nBuenas xd \nMenú principal");
            System.out.println("Elija la opcion que desee q(≧▽≦q)");
            System.out.println("1) Insertar \n2) Buscar \n3) Eliminar"
                    + "\n4) Recorrido \n5) Salir");
            int m = leer.nextInt();
            switch(m)
            {
                case 1:
                    e.Insertar();
                    break;
                case 2:
                    e.Buscar();
                    break;
                case 3:
                    e.Eliminar();
                    break;
                case 4:
                    e.Recorrido();
                    break;
                case 5:
                    System.out.println("Que diosito me lo cuide mucho ~(￣▽￣)~*");
                    System.exit(0);
                    break;
            }
        }
    }
    public String Insertar()
    {
        System.out.println("Elementos ingresados: Karla, Juanito, "
                + "Esteban, Raul y Yojaja");
        kk.addLast("Karla");
        kk.addLast("Juanito");
        kk.addLast("Esteban");
        kk.addLast("Raul");
        kk.addLast("Yojaja"); //:)
        return "";
    }
    public String Buscar()
    {
        System.out.println("Los elementos a buscar son: Esteban y Petunia");
        if(kk.contains("Esteban"))
        {
            System.out.println("Esteban sí está UwU");
        }else
        {
            System.out.println("Esteban no está UnU");
        }
        if(kk.contains("Petunia"))
        {
            System.out.println("Petunia sí está UwU");
        }else
        {
            System.out.println("Petunia no está UnU");
        }
        return "";
    }
    public String Eliminar()
    {
        System.out.println("Contenido actual: "+kk.toString());
        System.out.println("Los elementos a eliminar son: Yojaja y Juanito"); //:(
        kk.remove("Yojaja");
        kk.remove("Juanito");
        System.out.println("Contenido actualizado: "+kk.toString());
        return "";
    }
    public String Recorrido()
    {
        System.out.println(kk.toString());
        return "";
    }
}
