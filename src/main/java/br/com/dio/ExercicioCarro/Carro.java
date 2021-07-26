package br.com.dio.ExercicioCarro;

public class Carro {

    int qtdPessoas = 4;
    public void aumentarQtdPessoas(){
        qtdPessoas++;
    }

    public void diminuirQtdPessoas(){
        qtdPessoas--;
    }

    public int getQtdPessoas(){return qtdPessoas;
    }

    public String PessoasNoCarro() {
        return "A quantidade de pessoas no carro é: " + getQtdPessoas();
    }

    public static class aumentarQtdPessoas extends Carro {
    }

    public static class diminuirQtdPessoas extends Carro {
    }
}
