package com.example.tamagochi.clases;

public class Tamagochi {
    private String nombre;
    private int nivel;
    private String estado;
    private int tiempoEnMinutos;

    public Tamagochi(){
        this.nivel = 0;
        this.tiempoEnMinutos = 0;
    }

    public void comer(){
        switch (this.estado) {
            case "hambrienta":
                this.estado = "contenta";
                break;

            case "contenta":
                this.nivel++;
                break;

            case "aburrida":
                if (this.tiempoEnMinutos > 80) {
                    this.estado = "contenta";
                }
                break;

            default:
                System.out.println("No pasa nada...");
                break;
        }
    }
    public void jugar(){
        if (this.puedeJugar()) {
            switch (this.estado) {
                case "contenta":
                    this.nivel += 2;
                    break;

                case "aburrida":
                    this.estado = "contenta";
                    break;

                default:
                    System.out.println("No pasa nada...");
                    break;
            }
        }
    }
    public Boolean puedeJugar(){
        return this.estado.equals("aburrida") ? false : true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel < 0) {
            this.nivel = 0;
        }
        this.nivel = nivel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTiempoEnMinutos() {
        return tiempoEnMinutos;
    }

    public void setTiempoEnMinutos(int tiempoEnMinutos) {
        this.tiempoEnMinutos = tiempoEnMinutos;
    }
}
