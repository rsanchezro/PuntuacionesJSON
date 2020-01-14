package com.roberto.puntuacionesjson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

public class AlmacenPuntuacionesJSON implements AlmacenPuntuaciones {
    private String formatoJson;
    private Gson gson;
    private Type type;

    public AlmacenPuntuacionesJSON( ) {
        TypeToken<List<Puntuacion>> tk;
        this.formatoJson = new String();
        this.gson =new Gson();
        //Necesario generar una clase anonima que extienda de TypeToken pero parametrizada
        tk=new TypeToken<List<Puntuacion>>(){};
        this.type=tk.getType();

    }

    @Override
    public void guardarPuntuacion(int pL, int pV, Date fecha) {

    }

    @Override
    public List<String> listaPuntuaciones(int cantidad) {
        return null;
    }
}
