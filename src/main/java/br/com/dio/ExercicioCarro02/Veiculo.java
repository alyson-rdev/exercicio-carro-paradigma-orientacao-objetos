package br.com.dio.ExercicioCarro02;

public class Veiculo {
    public static void main(String[] args) {
        Carro carro = new Carro(1995,"Fiesta","Ford");
        carro.variante = "New Fiesta";

        System.out.println(carro.caracteristicas());
    }
}
