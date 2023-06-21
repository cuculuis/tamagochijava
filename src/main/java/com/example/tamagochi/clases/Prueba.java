package com.example.tamagochi.clases;

public class Prueba {
    public static void main(String[] args) {
        Tamagochi tamatama = new Tamagochi();

        tamatama.setNombre("Manguito");
        tamatama.setEstado("hambrienta");

        //Consultamos el estado de Manguito.
        System.out.println("El estado de Manguito es: " + tamatama.getEstado());
        //Le damos de comer a Manguito
        tamatama.comer();
        //Consultamos el estado de Manguito luego de comer.
        System.out.println("El estado de Manguito luego de comer es: " + tamatama.getEstado());


    }
}
