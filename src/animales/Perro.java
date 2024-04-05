/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 * Esta clase representa un perro, que es una subclase de la clase AnimalTerrestre.
 * Además de las características básicas de un animal terrestre, como nombre, lugar de origen y color,
 * un perro puede tener un collar de un color específico y puede realizar trucos.
 * La clase Perro sobrescribe el método toString() para proporcionar una representación en cadena de la información del perro.
 * 
 * @author Fer Ordoñez
 */
public class Perro extends AnimalTerrestre {
    private String colorCollar;

    /**
     * Constructor por defecto de la clase Perro.
     */
    public Perro() {
    }

    /**
     * Constructor con parámetros para inicializar el color del collar del perro.
     *
     * @param colorCollar El color del collar del perro.
     */
    public Perro(String colorCollar) {
        this.colorCollar = colorCollar;
    }

    /**
     * Obtiene el color del collar del perro.
     *
     * @return El color del collar del perro.
     */
    public String getColorCollar() {
        return colorCollar;
    }

    /**
     * Establece el color del collar del perro.
     *
     * @param colorCollar El nuevo color del collar del perro.
     */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
    /**
     * Simula que el perro está haciendo trucos.
     */
    public void hacerTrucos(){
        System.out.println("Haciendo trucos");
    }

    /**
     * Sobrescribe el método toString() para proporcionar una representación en cadena de la información del perro.
     *
     * @return La información del perro en una cadena de texto.
     */
    @Override
    public String toString() {
        return super.toString() + "Perro{" + "colorCollar=" + colorCollar + '}';
    }
}
