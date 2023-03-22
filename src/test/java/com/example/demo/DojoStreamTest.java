package com.example.demo;


import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class DojoStreamTest {

    @Test
    void converterData(){
        List<Player> list = CsvUtilFile.getPlayers();
        assert list.size() == 18207;
    }

    @Test
    void jugadoresMayoresA35SegunClub(){
        List<Player> list = CsvUtilFile.getPlayers();
         list.parallelStream().filter(player -> player.age >= 35)
                .flatMap(player1 -> list.parallelStream()
                        .filter(player2 -> player1.club.equals(player2.club))
                ).distinct()
                .collect(Collectors.groupingBy(Player::getClub));
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
