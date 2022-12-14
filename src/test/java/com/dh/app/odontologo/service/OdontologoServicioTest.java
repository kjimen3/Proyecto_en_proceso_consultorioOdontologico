package com.dh.app.odontologo.service;

import com.dh.app.odontologo.model.Odontologo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class OdontologoServicioTest {

    @Test
    void CrearOdontologoConParametros() {
        Odontologo odontologo1 = new Odontologo(1L, "Alvarez", "Julian", "201818");
        Odontologo odontologo2 = new Odontologo(2L, "Arboleda", "Ivan", "102055");


        Assertions.assertEquals("Julian", odontologo1.getNombre());
        Assertions.assertEquals("Ivan", odontologo2.getNombre());

    }

    @Test
    void ProbarListadoOdontologos(){

        List<Odontologo>
        Odontologo odontologo1 = new Odontologo(1L, "Alvarez", "Julian", "201818");
        Odontologo odontologo2 = new Odontologo(2L, "Arboleda", "Ivan", "102055");



    }
}