import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;
public class Ejemplo1
{
    public Object x;                                                                    //Declarar x como objeto para almacenar los datos dentro de un arraylist
    static Deque kk = new LinkedList();                                                 //Declarar el array usando la libreria deque junto con la libreria linkedlist
    static Scanner leer = new Scanner(System.in);                                       //Usé static para tener la misma variable en cada metodo que instancíe, así puedo guardar datos estando en otros metodos sin sobreescribir el contenido, es decir, se va agregando al array segun vaya navegando por el menú
    public static void main(String[] args) 
    {
        Ejemplo1 e = new Ejemplo1();                                                    //Declaramos e como un objeto para acceder a los diferentes metodos
        boolean i = true;                                                               //Realicé un menú con opciones de los metodos y una opcion para salir
        while(i==true)
        {
            System.out.println("\nBuenas xd \nMenú principal");
            System.out.println("Elija la opcion que desee q(≧▽≦q)");
            System.out.println("1) Insertar \n2) Buscar \n3) Eliminar"
                    + "\n4) Recorrido \n5) Salir");
            int m = leer.nextInt();
            switch(m)                                                                   //El metodo más facild de hacer un menú es utilizando un switch dentro de un ciclo booleano en el que hasta que se presione un caso del switch este cambie el estado del ciclo para salir
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
        System.out.println("Inserta los elementos:");
        x = leer.next();
        kk.addLast(x);                                                                  //Dentro de la libreria de Deque hay una opcion para agregar hasta el final del array, esta es la opcion que utilicé en la que el valor ingresado para el objeto sea el que se agregue al array
        return "";
    }
    public String Buscar()
    {
        System.out.println("Inserta el elemento a buscar");
        x = leer.next();
        if(kk.contains(x))                                                              //El .contains se utiliza cuando necesitas saber si está el contenido dentro de un array, este te regresa un true o false segun la instancia
        {
            System.out.println("El elemento "+x+" sí está UwU");                        //Decimos que si el elemento está en la array, imprimirá en consola que el elemento sí está
        }else
        {
            System.out.println("El elemento "+x+" no está UnU");                        //Para la inversa ponemos un else en dado caso que el elemento a buscar no se encuentre
        }
        return "";
    }
    public String Eliminar()
    {
        System.out.println("Contenido actual: "+kk.toString());                         //Para darle dinamismo al usuario del programa, este te imprime los elementos actuales dentro del array para decidir cual es que vamos a eliminar
        System.out.println("Inserta el elemento a eliminar:");
        x = leer.next();
        kk.remove(x);                                                                   //Se usa el .remove de la libreria de Deque para elimnar un elemento especifico, el cual se lo estamos instanciando con el objeto x
        System.out.println("Contenido actualizado: "+kk.toString());                    //Al finalizar muestra como es que quedó la array despues de eliminar el elemento
        return "";
    }
    public String Recorrido()
    {
        System.out.println(kk.toString());                                              //Para el recorrido, Deque cuenta con dos metodos, un .toString que es el que estamos utiliznado para facilitar el codigo y un .toArray, para otros usos
        return "";
    }
}
