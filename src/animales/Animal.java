/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 * Esta clase representa un animal genérico con características básicas como nombre, lugar de origen y color.
 * También incluye métodos para obtener y establecer estas características, así como métodos para hacer que el animal emita un sonido y coma.
 * Además, sobrescribe el método toString() para proporcionar una representación en cadena de la información del animal.
 * 
 * @author Fer Ordoñez
 */
public class Animal {
    private String nombre, lugarOrigen, color;

    /**
     * Constructor por defecto de la clase Animal.
     */
    public Animal() {
    }

    /**
     * Constructor con parámetros para inicializar todas las características del animal.
     *
     * @param nombre El nombre del animal.
     * @param lugarOrigen El lugar de origen del animal.
     * @param color El color del animal.
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }

    /**
     * Obtiene el nombre del animal.
     *
     * @return El nombre del animal.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del animal.
     *
     * @param nombre El nuevo nombre del animal.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el lugar de origen del animal.
     *
     * @return El lugar de origen del animal.
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }

    /**
     * Establece el lugar de origen del animal.
     *
     * @param lugarOrigen El nuevo lugar de origen del animal.
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    /**
     * Obtiene el color del animal.
     *
     * @return El color del animal.
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color del animal.
     *
     * @param color El nuevo color del animal.
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Hace que el animal emita un sonido específico.
     *
     * @param sonido El sonido que emite el animal.
     */
    public void sonido(String sonido){
        System.out.println(sonido);
    }
    
    /**
     * Simula que el animal está comiendo.
     */
    public void comer(){
        System.out.println("Estoy comiendo");
    }

    /**
     * Retorna una representación en cadena de la información del animal.
     *
     * @return La información del animal en una cadena de texto.
     */
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
    
    
}
