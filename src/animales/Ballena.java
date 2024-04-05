/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 * Esta clase representa una ballena, que es una subclase de la clase AnimalAcuatico.
 * Además de las características básicas de un animal acuático, como nombre, lugar de origen, color y número de aletas,
 * una ballena tiene una longitud específica y puede pelear.
 * La clase Ballena sobrescribe el método toString() para proporcionar una representación en cadena de la información de la ballena.
 * Además, sobrescribe el método comer de la clase AnimalAcuatico para adaptarlo a su dieta de crill.
 * 
 * @author Fer Ordoñez
 */
public class Ballena extends AnimalAcuatico {
    private int largo;

    /**
     * Constructor por defecto de la clase Ballena.
     */
    public Ballena() {
    }

    /**
     * Constructor con parámetros para inicializar todas las características de la ballena.
     *
     * @param largo La longitud de la ballena.
     * @param nombre El nombre de la ballena.
     * @param lugarOrigen El lugar de origen de la ballena.
     * @param color El color de la ballena.
     * @param numAletas El número de aletas de la ballena.
     */
    public Ballena(int largo, String nombre, String lugarOrigen, String color, int numAletas) {
        super(nombre, lugarOrigen, color, numAletas);
        this.largo = largo;
    }

    /**
     * Obtiene la longitud de la ballena.
     *
     * @return La longitud de la ballena.
     */
    public int getLargo() {
        return largo;
    }

    /**
     * Establece la longitud de la ballena.
     *
     * @param largo La nueva longitud de la ballena.
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    /**
     * Simula que la ballena está peleando.
     */
    public void pelear(){
        System.out.println("Peleando");
    }
    
    /**
     * Sobrescribe el método comer de la clase AnimalAcuatico para adaptarlo a la dieta de crill de la ballena.
     */
    @Override
    public void comer(){
        System.out.println("Comiendo crill");
    }

    /**
     * Sobrescribe el método toString() para proporcionar una representación en cadena de la información de la ballena.
     *
     * @return La información de la ballena en una cadena de texto.
     */
    @Override
    public String toString() {
        return super.toString() + "Ballena{" + "largo=" + largo + '}';
    }
}
