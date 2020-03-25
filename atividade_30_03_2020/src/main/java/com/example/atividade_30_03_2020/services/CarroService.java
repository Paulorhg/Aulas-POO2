package com.example.atividade_30_03_2020.services;

import java.util.Collection;

import com.example.atividade_30_03_2020.model.Carro;
import com.example.atividade_30_03_2020.repository.CarroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CarroService
 */
@Service
public class CarroService {

    @Autowired
    private CarroRepository cr;

    public Collection<Carro> getCarros(){
        return cr.getCarros();
    }

    public Carro getCarroById(int id){

        Carro Carro = cr.getCarroById(id);

        return Carro;

    }
    
}