package com.roberto.puntuacionesjson;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Puntuacion {
    private int puntosL;
    private int puntosV;
    private Date fecha;

    public Puntuacion(int puntosL, int puntosV, Date fecha) {
        this.puntosL = puntosL;
        this.puntosV = puntosV;
        this.fecha = fecha;
    }

    public Puntuacion(int puntosL, int puntosV,String fecha) {
        this.puntosL = puntosL;
        this.puntosV = puntosV;
        try {
            this.fecha= DateFormat.getDateInstance().parse(fecha);
        } catch (ParseException e) {
           this.fecha=null;
        }
    }


    public int getPuntosL() {
        return puntosL;
    }

    public void setPuntosL(int puntosL) {
        this.puntosL = puntosL;
    }

    public int getPuntosV() {
        return puntosV;
    }

    public void setPuntosV(int puntosV) {
        this.puntosV = puntosV;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
