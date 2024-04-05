/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 * Esta clase representa un animal acuático, que es una subclase de la clase Animal.
 * Además de las características básicas de un animal, como nombre, lugar de origen y color,
 * un animal acuático tiene un número de aletas que se utilizan para nadar.
 * También incluye métodos para obtener y establecer el número de aletas, así como para simular que el animal está nadando.
 * La clase AnimalAcuatico sobrescribe el método comer de la clase Animal para adaptarlo a su entorno acuático.
 * Además, sobrescribe el método toString() para proporcionar una representación en cadena de la información del animal acuático.
 * 
 * @author Fer Ordoñez
 */
public class AnimalAcuatico extends Animal {
    
    private int numAletas;

    /**
     * Constructor por defecto de la clase AnimalAcuatico.
     */
    public AnimalAcuatico() {
    }

    /**
     * Constructor con parámetros para inicializar todas las características del animal acuático.
     *
     * @param nombre El nombre del animal.
     * @param lugarOrigen El lugar de origen del animal.
     * @param color El color del animal.
     * @param numAletas El número de aletas del animal acuático.
     */
    public AnimalAcuatico(String nombre, String lugarOrigen, String color, int numAletas) {
        super(nombre, lugarOrigen, color);
        this.numAletas = numAletas;
    }

    /**
     * Obtiene el número de aletas del animal acuático.
     *
     * @return El número de aletas del animal acuático.
     */
    public int getNumAletas() {
        return numAletas;
    }

    /**
     * Establece el número de aletas del animal acuático.
     *
     * @param numAletas El nuevo número de aletas del animal acuático.
     */
    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }
    
    /**
     * Simula que el animal acuático está nadando.
     */
    public void nadar(){
        System.out.println("Estoy nadando");
    }
    
    /**
     * Sobrescribe el método comer de la clase Animal para simular que el animal acuático está comiendo en el agua.
     */
    @Override
    public void comer(){
        System.out.println("Estoy comiendo en el agua");
    }
    
    /**
     * Sobrescribe el método toString() para proporcionar una representación en cadena de la información del animal acuático.
     * Además, incluye el número de aletas en la representación.
     *
     * @return La información del animal acuático en una cadena de texto.
     */
    @Override
    public String toString() {
        return super.toString() + " AnimalAcuatico{" + "numAletas=" + numAletas + '}';
    }
     
}

