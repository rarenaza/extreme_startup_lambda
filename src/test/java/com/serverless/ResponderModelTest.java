package com.serverless;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
public class ResponderModelTest {

    ResponderModel responder= new ResponderModel();

    @Test
    public void cuandoLaPreguntaSea () {
        //arrange
        String pregunta = "";

        //act
        String respuesta = responder.answer(pregunta);

        //assert
        assertThat(respuesta).isEqualTo("peru");

    }

    @Test
    public void cuandoLaPreguntaSuma15y2Responde17 () {
        //arrange
        String pregunta = "what is the sum of 15 and 2";

        //act
        String respuesta = responder.answer(pregunta);

        //assert
        assertThat(respuesta).isEqualTo("17");

    }

    @Test
    public void cuandoLaPreguntaSumaPlus15y2Responde17 () {
        //arrange
        String pregunta = "what is 15 plus 2";

        //act
        String respuesta = responder.answer(pregunta);

        //assert
        assertThat(respuesta).isEqualTo("17");

    }

    @Test
    public void cuandoLaPreguntaCompara80y870Responde870 () {
        //arrange
        String pregunta = "which of the following numbers is the largest: 80, 870";

        //act
        String respuesta = responder.answer(pregunta);

        //assert
        assertThat(respuesta).isEqualTo("870");

    }
}
