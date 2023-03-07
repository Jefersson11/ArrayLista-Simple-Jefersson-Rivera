public class Carta {
    public enum Palo {
        TREBOL, DIAMANTE, CORAZON, PICA
    };
    
    //Definimos un ArrayList llamado cartas:


    private int numero;
    private Palo palo;
//En el constructor creamos el ArrayList pasando el valor 8 ya que ese será el número de cartas
    Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }
    //ArrayList automáticamente pasara a un valor conveniente
    public void imprimir() {
        System.out.println(numero + " - " + palo.toString().toLowerCase());
    }

    public Palo retornarPalo() {
        return palo;
    }

}