/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 * Esta clase representa un pájaro, que es una subclase de la clase AnimalAereo.
 * Además de las características básicas de un animal aéreo, como número de alas, nombre, lugar de origen y color,
 * un pájaro tiene un tipo de pico específico y puede recolectar ramas.
 * La clase Pajaro sobrescribe el método toString() para proporcionar una representación en cadena de la información del pájaro.
 * 
 * @author Fer Ordoñez
 */
public class Pajaro extends AnimalAereo {
    private String tipoDePico;
    
    /**
     * Constructor por defecto de la clase Pajaro.
     */
    public Pajaro() {
    }

    /**
     * Constructor con parámetros para inicializar todas las características del pájaro.
     *
     * @param tipoDePico El tipo de pico del pájaro.
     * @param numAlas El número de alas del pájaro.
     * @param nombre El nombre del pájaro.
     * @param lugarOrigen El lugar de origen del pájaro.
     * @param color El color del pájaro.
     */
    public Pajaro(String tipoDePico, int numAlas, String nombre, String lugarOrigen, String color) {
        super(numAlas, nombre, lugarOrigen, color);
        this.tipoDePico = tipoDePico;
    }

    /**
     * Obtiene el tipo de pico del pájaro.
     *
     * @return El tipo de pico del pájaro.
     */
    public String getTipoDePico() {
        return tipoDePico;
    }

    /**
     * Establece el tipo de pico del pájaro.
     *
     * @param tipoDePico El nuevo tipo de pico del pájaro.
     */
    public void setTipoDePico(String tipoDePico) {
        this.tipoDePico = tipoDePico;
    }
    
    /**
     * Simula que el pájaro está recolectando ramas.
     */
    public void recolectarRamas(){
        System.out.println("Recolectando ramas");
    }

    /**
     * Sobrescribe el método toString() para proporcionar una representación en cadena de la información del pájaro.
     *
     * @return La información del pájaro en una cadena de texto.
     */
    @Override
    public String toString() {
        return super.toString() + "Pajaro{" + "tipoDePico=" + tipoDePico + '}';
    }
 
}
