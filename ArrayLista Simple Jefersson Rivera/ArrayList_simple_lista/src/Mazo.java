import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<Carta> cartas;

    Mazo() {
    	//Agregamos al ArrayList los 8 elementos:
        cartas = new ArrayList<Carta>(8);
        cartas.add(new Carta(1, Carta.Palo.TREBOL));
        cartas.add(new Carta(2, Carta.Palo.TREBOL));
        cartas.add(new Carta(1, Carta.Palo.DIAMANTE));
        cartas.add(new Carta(2, Carta.Palo.DIAMANTE));
        cartas.add(new Carta(1, Carta.Palo.PICA));
        cartas.add(new Carta(2, Carta.Palo.PICA));
        cartas.add(new Carta(1, Carta.Palo.CORAZON));
        cartas.add(new Carta(2, Carta.Palo.CORAZON));
    }
    //Para imprimir todas las carta recorremos la colección mediante un for:


    public void imprimir() {
        for (Carta carta : cartas)
            carta.imprimir();
    }
//Para mezclar las cartas la forma más sencilla es emplear el método estático
    public void barajar() {
    	//'shuffle' que pertenece a la clase 'Collections':
        Collections.shuffle(cartas);
    }
    //El método main solo nos queda crear un objeto de la clase 'Mazo
    public static void main(String[] ar) {
        Mazo mazo = new Mazo();
//Procede a imprimir todo el mazo.
        System.out.println("Mazo de cartas ordenado");
        //Seguidamente mezclar las cartas y volver a imprimir
        mazo.imprimir();
        mazo.barajar();
        System.out.println("Mazo de cartas despues de barajar");
        mazo.imprimir();
    }

}