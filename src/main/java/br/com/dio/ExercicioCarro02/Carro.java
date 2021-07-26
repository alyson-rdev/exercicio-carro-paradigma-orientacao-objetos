package br.com.dio.ExercicioCarro02;

public class Carro {

    public String marca;
    public String modelo;
    public String variante;
    public Integer ano;

    public String caracteristicas(){
        return " A marca do veículo é: " + marca + "\n Modelo: " + modelo + "\n Variante: " + variante + "\n ano: " + ano;
    }

    public Carro(Integer ano, String marca, String modelo) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
    }


}
