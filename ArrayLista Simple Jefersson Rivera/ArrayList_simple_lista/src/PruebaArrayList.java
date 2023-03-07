import java.util.ArrayList;

//Creamos un objeto de la clase ArrayList
public class PruebaArrayList {
    public static void imprimir(ArrayList<String> lista) {
        for (String elemento : lista)
            System.out.print(elemento + "-");
        System.out.println();
    }
    
    //Para recuperar el dato de un nodo sin eliminarlo podemos hace uso del método 'get' 
    public static void main(String[] args) {
    	//En un ArrayList no dependera de la cantidad de elementos lo que hara sea mas rapido
        ArrayList<String> lista1 = new ArrayList<String>();
        

        //La lista administra objetos de la clase String.
        lista1.add("juan");
        lista1.add("Luis");
        //Para conocer si la lista almacena cierto valor disponemos del método 'contains':
        lista1.add("Carlos");
        //Mediante el método 'add' añadimos componentes al final:
        imprimir(lista1);
        //Llamamos al método estático 'imprimir' para mostrar todos los elementos del ArrayList:
        lista1.add(1, "ana");
        imprimir(lista1);
        //El método estático recibe la lista
        lista1.remove(0);
        imprimir(lista1);
        //Mediante un for recorre la colección mostrando sus elementos:
        lista1.remove("Carlos");
        imprimir(lista1);
        //Para eliminar un nodo de la lista debemos llamar al método 'remove'
        //Pasara a la posición del nodo a eliminar:
        System.out.println("Cantidad de elementos en la lista:" + lista1.size());
        if (lista1.contains("ana"))
        //Eliminamos todos los nodos de la lista mediante el método 'clear':
            System.out.println("El nombre 'ana' si esta almacenado en la lista");
        else
            System.out.println("El nombre 'ana' no esta almacenado en la lista");
        System.out.println("El segundo elemento de la lista es:" + lista1.get(1));
        lista1.clear();
        if (lista1.isEmpty())
            System.out.println("La lista se encuentra vacía");
    }

}