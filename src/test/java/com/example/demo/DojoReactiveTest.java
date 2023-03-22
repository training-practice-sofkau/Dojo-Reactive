package com.example.demo;


import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

import java.util.List;

public class DojoReactiveTest {

    @Test
    void converterData(){
        List<Player> list = CsvUtilFile.getPlayers();
        assert list.size() == 18207;
    }



    @Test
    void jugadoresMayoresA35SegunClub(){
        var list = Flux.fromStream(CsvUtilFile.getPlayers().parallelStream()).cache();
        list.filter(player -> player.age >= 35)
                .buffer(10)
                .flatMap(player1 -> list.filter(player2 -> player1.parallelStream().anyMatch(a -> player2.club.equals(a.club))))
                        .distinct()
                        .collectMultimap(Player::getClub);

        list.collectList().block();
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
