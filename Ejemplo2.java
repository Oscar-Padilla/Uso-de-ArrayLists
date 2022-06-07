import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;
public class Ejemplo2 
{
    static Deque kk = new LinkedList();
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) 
    {
        Ejemplo2 e = new Ejemplo2();
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
        System.out.println("Elementos ingresados: 40, 30, 50, 10, 60");
        kk.addLast(40);
        kk.addLast(30);
        kk.addLast(50);
        kk.addLast(10);
        kk.addLast(60);
        return "";
    }
    public String Buscar()
    {
        System.out.println("El elemento a buscar es 40");
        if(kk.contains(40))
        {
            System.out.println("El elemento 40 sí está UwU");
        }else
        {
            System.out.println("El elemento 40 no está UnU");
        }
        return "";
    }
    public String Eliminar()
    {
        System.out.println("Contenido actual:"+kk.toString());
        System.out.println("Elementos a eliminar: 30, 40 y 60");
        kk.remove(30);
        kk.remove(40);
        kk.remove(60);
        System.out.println("Contenido actualizado:"+kk.toString());
        return "";
    }
    public String Recorrido()
    {
        System.out.println(kk.toString());
        return "";
    }
}
