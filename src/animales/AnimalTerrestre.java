/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 * Esta clase representa un animal terrestre, que es una subclase de la clase Animal.
 * Además de las características básicas de un animal, como nombre, lugar de origen y color,
 * un animal terrestre tiene un número de patas que se utiliza para correr.
 * También incluye métodos para obtener y establecer el número de patas, así como para simular que el animal está corriendo.
 * La clase AnimalTerrestre sobrescribe el método comer de la clase Animal para adaptarlo a su entorno terrestre.
 * 
 * @author Fer Ordoñez
 */
public class AnimalTerrestre extends Animal {
     
    private int numeroDePatas;

    /**
     * Constructor por defecto de la clase AnimalTerrestre.
     */
    public AnimalTerrestre() {
    }

    /**
     * Constructor con parámetros para inicializar todas las características del animal terrestre.
     *
     * @param numeroDePatas El número de patas del animal terrestre.
     * @param nombre El nombre del animal.
     * @param lugarOrigen El lugar de origen del animal.
     * @param color El color del animal.
     */
    public AnimalTerrestre(int numeroDePatas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroDePatas = numeroDePatas;
    }

    /**
     * Obtiene el número de patas del animal terrestre.
     *
     * @return El número de patas del animal terrestre.
     */
    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    /**
     * Establece el número de patas del animal terrestre.
     *
     * @param numeroDePatas El nuevo número de patas del animal terrestre.
     */
    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }
    
    
    /**
     * Simula que el animal terrestre está corriendo.
     */
    public void correr(){
        System.out.println("Corriendo ...");
    }
    
    /**
     * Sobrescribe el método comer de la clase Animal para simular que el animal terrestre está comiendo en tierra.
     */
    @Override
    public void comer(){
        System.out.println("Estoy comiendo en tierra");
    }
}
