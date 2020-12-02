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

    @Test
    public void cuandoLaPreguntaEsPorElNombreRespondePeru () {
        //arrange
        String pregunta = "what is your name";

        //act
        String respuesta = responder.answer(pregunta);

        //assert
        assertThat(respuesta).isEqualTo("peru");

    }

    @Test
    public void cuandoLaPreguntaEsObtenerElMayorEntre263_9_871_36LaRespuestaEs871 () {
        //arrange
        String pregunta = "which of the following numbers is the largest: 263, 9, 871, 36";

        //act
        String respuesta = responder.answer(pregunta);

        //assert
        assertThat(respuesta).isEqualTo("871");

    }

    @Test
    public void cuandoLaPreguntaEsMultiplicar10y18LaRespuestaEs180 () {
        //arrange
        String pregunta = "what is 10 multiplied by 18";

        //act
        String respuesta = responder.answer(pregunta);

        //assert
        assertThat(respuesta).isEqualTo("180");

    }

    @Test
    public void cuandoLaPreguntaEsSiTieneCuboORaizCuadrada530y25LaRespuestaEs25 () {
        //arrange
        String pregunta = "which of the following numbers is both a square and a cube: 530, 25";

        //act
        String respuesta = responder.answer(pregunta);

        //assert
        assertThat(respuesta).isEqualTo("25");

    }

    @Test
    public void cuandoLaPreguntaEsSiTieneCuboORaizCuadrada276y1849LaRespuestaEs1849 () {
        //arrange
        String pregunta = "which of the following numbers is both a square and a cube: 276, 1849";

        //act
        String respuesta = responder.answer(pregunta);

        //assert
        assertThat(respuesta).isEqualTo("1849");

    }




    @Test
    public void cuandoLaPreguntaEsEnQueAnioTheresaMaySalioElegidaLaRespuestaEs2016 () {
        //arrange
        String pregunta = "which year was Theresa May first elected as the Prime Minister of Great Britain";

        //act
        String respuesta = responder.answer(pregunta);

        //assert
        assertThat(respuesta).isEqualTo("2016");

    }
}
