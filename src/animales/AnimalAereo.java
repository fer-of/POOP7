/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 * Esta clase representa un animal aéreo, que es una subclase de la clase Animal.
 * Además de las características básicas de un animal, como nombre, lugar de origen y color,
 * un animal aéreo tiene un número de alas que se utilizan para volar.
 * También incluye métodos para obtener y establecer el número de alas, así como para simular que el animal está volando.
 * La clase AnimalAereo sobrescribe el método comer de la clase Animal para adaptarlo a su capacidad de vuelo.
 * 
 * @author Fer Ordoñez
 */
public class AnimalAereo extends Animal {
    
    private int numAlas;

    /**
     * Constructor por defecto de la clase AnimalAereo.
     */
    public AnimalAereo() {
    }

    /**
     * Constructor con parámetros para inicializar todas las características del animal aéreo.
     *
     * @param numAlas El número de alas del animal aéreo.
     * @param nombre El nombre del animal.
     * @param lugarOrigen El lugar de origen del animal.
     * @param color El color del animal.
     */
    public AnimalAereo(int numAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numAlas = numAlas;
    }

    /**
     * Obtiene el número de alas del animal aéreo.
     *
     * @return El número de alas del animal aéreo.
     */
    public int getNumAlas() {
        return numAlas;
    }

    /**
     * Establece el número de alas del animal aéreo.
     *
     * @param numAlas El nuevo número de alas del animal aéreo.
     */
    public void setNumAlas(int numAlas) {
        this.numAlas = numAlas;
    }

    /**
     * Simula que el animal aéreo está volando.
     */
    public void volar(){
        System.out.println("Volando ...");
    }
    
    /**
     * Sobrescribe el método comer de la clase Animal para simular que el animal aéreo está comiendo mientras vuela.
     */
    @Override
    public void comer(){
        System.out.println("Estoy comiendo mientras vuelo");
    }

    /**
     * Sobrescribe el método toString() para proporcionar una representación en cadena de la información del animal aéreo.
     *
     * @return La información del animal aéreo en una cadena de texto.
     */
    @Override
    public String toString() {
        return super.toString() + "AnimalAereo{" + "numAlas=" + numAlas + '}';
    }
}
