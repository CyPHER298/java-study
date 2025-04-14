package com.main;

import com.beans.Carro.Carro;

public class TesteCarro {

    public static void main(String[] args) {
        Carro objCarro = new Carro();
        System.out.println("Modelo: " + objCarro.modelo + "\n" +
                "Marca: " + objCarro.marca + "\n" +
                "Cor: " + objCarro.cor + "\n" +
                "Ano: " + objCarro.ano_carro);
    }
}
