package com.roberto.puntuacionesjson;

import java.util.Date;
import java.util.List;

public interface AlmacenPuntuaciones {
    public void guardarPuntuacion(int pL, int pV, Date fecha);
    public List<String> listaPuntuaciones(int cantidad);
}
