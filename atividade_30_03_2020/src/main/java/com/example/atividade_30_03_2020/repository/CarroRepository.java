package com.example.atividade_30_03_2020.repository;

import java.util.Collection;
import java.util.HashMap;

import com.example.atividade_30_03_2020.model.Carro;

import org.springframework.stereotype.Repository;

/**
 * CarroRepository
 */
@Repository
public class CarroRepository {

    public HashMap<Integer, Carro> hm = new HashMap<Integer, Carro>();

    public CarroRepository(){
        hm.put(0, new Carro(0, "Volkswagen", "Gol", 2009, "Preto"));
        hm.put(1, new Carro(1, "Ford", "Mustang", 1970, "Azul"));
        hm.put(2, new Carro(2, "Chevrolet", "Opala", 1980, "Branco"));
        hm.put(3, new Carro(3, "Volkswagen", "Fusca", 1964, "Verde"));
        hm.put(4, new Carro(4, "Ferrari", "SF90", 2019, "Vermelho"));
    }

    public  Carro getCarroById(int id) {
        return hm.get(id);
    }

    public Collection<Carro> getCarros() {
        return hm.values();
    }
}