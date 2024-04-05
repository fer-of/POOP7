/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

import animales.Animal;
import animales.AnimalAcuatico;
import animales.AnimalTerrestre;
import animales.Perro;

/**
 * Esta clase contiene el método principal para probar la jerarquía de clases de animales.
 * Además, se muestra cómo crear instancias de diferentes tipos de animales y llamar a métodos específicos de cada uno.
 *
 * @author Fer Ordoñez
 */
public class POOP7 {

    /**
     * El método principal que crea instancias de diferentes tipos de animales y llama a sus métodos.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este ejemplo).
     */
    public static void main(String[] args) {
        //Crear un objeto de la clase Animal
        Animal animal = new Animal("Jaguar", "Selva de Brasil", "Pardo");
        //Imprimir los detalles del animal
        System.out.println(animal);
        //Emitir el sonido del animal
        animal.sonido("Raawr"); 
        
        //Crear un objeto de la clase AnimalAcuatico
        AnimalAcuatico animalAcuatico = new AnimalAcuatico("Delfin", "Atlantico", "Gris", 3);
        //Imprimir los detalles del animal acuático
        System.out.println(animalAcuatico); 
        // Emitir el sonido del animal acuático
        animalAcuatico.sonido("iiiii iii iiii "); 
        
        // Crear un objeto de la clase AnimalTerrestre (No se especifican detalles)
        AnimalTerrestre animalTerrestre = new AnimalTerrestre();
    }
    
}
