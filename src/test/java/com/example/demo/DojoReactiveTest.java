package com.example.demo;


import org.junit.jupiter.api.Test;

import java.util.List;

public class DojoReactiveTest {

    @Test
    void converterData(){
        List<Player> list = CsvUtilFile.getPlayers();
        assert list.size() == 18207;
    }



    @Test
    void jugadoresMayoresA35(){

    }

    @Test
    void mejorJugadorConNacionalidadFrancia(){

    }

    @Test
    void clubsAgrupadosPorNacionalidad(){

    }

    @Test
    void clubConElMejorJugador(){

    }


    @Test
    void mejorJugadorSegunNacionalidad(){

    }



}
