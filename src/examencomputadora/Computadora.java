/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencomputadora;

/**
 *
 * @author siviany
 */
public class Computadora {
    private String marca;
    private double velocidadProcedador;
    private int capacidaMemoriaRam;
    private String tipoDiscoDuro;
    private String sistemaOperativo;
    private String tarjetaMadre;
    private String tarjetaSonido;
    private String unidadDVD;
    public Computadora(){
    }
    public Computadora(String marca) {
        this.marca = marca;
    }
    public Computadora(String marca, double velocidadProcedador) {
        this.marca = marca;
        this.velocidadProcedador = velocidadProcedador;
    }
    public Computadora(String marca, double velocidadProcedador, int capacidaMemoriaRam) {
        this.marca = marca;
        this.velocidadProcedador = velocidadProcedador;
        this.capacidaMemoriaRam = capacidaMemoriaRam;
    }
    public Computadora(String marca, double velocidadProcedador, int capacidaMemoriaRam, String tipoDiscoDuro) {
        this.marca = marca;
        this.velocidadProcedador = velocidadProcedador;
        this.capacidaMemoriaRam = capacidaMemoriaRam;
        this.tipoDiscoDuro = tipoDiscoDuro;
    }
    public Computadora(String marca, int capacidaMemoriaRam, String tipoDiscoDuro, String sistemaOperativo) {
        this.marca = marca;
        this.capacidaMemoriaRam = capacidaMemoriaRam;
        this.tipoDiscoDuro = tipoDiscoDuro;
        this.sistemaOperativo = sistemaOperativo;
    }
    public Computadora(String marca, double velocidadProcedador, int capacidaMemoriaRam, String tipoDiscoDuro, String sistemaOperativo, String tarjetaMadre) {
        this.marca = marca;
        this.velocidadProcedador = velocidadProcedador;
        this.capacidaMemoriaRam = capacidaMemoriaRam;
        this.tipoDiscoDuro = tipoDiscoDuro;
        this.sistemaOperativo = sistemaOperativo;
        this.tarjetaMadre = tarjetaMadre;
    }
    public Computadora(String marca, double velocidadProcedador, int capacidaMemoriaRam, String tipoDiscoDuro, String sistemaOperativo, String tarjetaMadre, String tarjetaSonido) {
        this.marca = marca;
        this.velocidadProcedador = velocidadProcedador;
        this.capacidaMemoriaRam = capacidaMemoriaRam;
        this.tipoDiscoDuro = tipoDiscoDuro;
        this.sistemaOperativo = sistemaOperativo;
        this.tarjetaMadre = tarjetaMadre;
        this.tarjetaSonido = tarjetaSonido;
    }
    public Computadora(String marca, double velocidadProcedador, int capacidaMemoriaRam, String tipoDiscoDuro, String sistemaOperativo, String tarjetaMadre, String tarjetaSonido, String unidadDVD) {
        this.marca = marca;
        this.velocidadProcedador = velocidadProcedador;
        this.capacidaMemoriaRam = capacidaMemoriaRam;
        this.tipoDiscoDuro = tipoDiscoDuro;
        this.sistemaOperativo = sistemaOperativo;
        this.tarjetaMadre = tarjetaMadre;
        this.tarjetaSonido = tarjetaSonido;
        this.unidadDVD = unidadDVD;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getVelocidadProcedador() {
        return velocidadProcedador;
    }
    public void setVelocidadProcedador(double velocidadProcedador) {
        this.velocidadProcedador = velocidadProcedador;
    }
    public int getCapacidaMemoriaRam() {
        return capacidaMemoriaRam;
    }
    public void setCapacidaMemoriaRam(int capacidaMemoriaRam) {
        this.capacidaMemoriaRam = capacidaMemoriaRam;
    }
    public String getTipoDiscoDuro() {
        return tipoDiscoDuro;
    }
    public void setTipoDiscoDuro(String tipoDiscoDuro) {
        this.tipoDiscoDuro = tipoDiscoDuro;
    }
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    public String getTarjetaMadre() {
        return tarjetaMadre;
    }
    public void setTarjetaMadre(String tarjetaMadre) {
        this.tarjetaMadre = tarjetaMadre;
    }
    public String getTarjetaSonido() {
        return tarjetaSonido;
    }
    public void setTarjetaSonido(String tarjetaSonido) {
        this.tarjetaSonido = tarjetaSonido;
    }
    public String getUnidadDVD() {
        return unidadDVD;
    }
    public void setUnidadDVD(String unidadDVD) {
        this.unidadDVD = unidadDVD;
    }
}
