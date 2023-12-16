package com.example.activity_main.Dao;

import com.example.activity_main.Model.Pais;

import java.util.ArrayList;

public interface IGeneric <Object>{
    long insert(Pais obj);
    long update(Pais obj);
    long delete(Pais obj);
    ArrayList<Pais> getAll();
    Pais getById(int id);
}
