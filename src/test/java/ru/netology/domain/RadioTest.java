package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStationNum() {
        Radio radio = new Radio();

        radio.radioStationNum = 3;

        int expected = 3;
        int actual = radio.radioStationNum;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAudioVolume() {
        Radio radio = new Radio();

        radio.audioVolume = 5;

        int expected = 5;
        int actual = radio.audioVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxRadioStationNum() {
        Radio radio = new Radio();

        radio.setToMaxRadioStationNum();

        int expected = 9;
        int actual = radio.radioStationNum;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinRadioStationNum() {
        Radio radio = new Radio();

        radio.setToMinRadioStationNum();

        int expected = 0;
        int actual = radio.radioStationNum;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxAudioVolume() {
        Radio radio = new Radio();

        radio.setToMaxAudioVolume();

        int expected = 100;
        int actual = radio.audioVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinAudioVolume() {
        Radio radio = new Radio();

        radio.setToMinAudioVolume();

        int expected = 0;
        int actual = radio.audioVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxBorderRadioStationNum() {
        Radio radio = new Radio();

        radio.setRadioStationNum(10);

        int expected = 0;
        int actual = radio.radioStationNum;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minBorderRadioStationNum() {
        Radio radio = new Radio();

        radio.setRadioStationNum(-1);

        int expected = 9;
        int actual = radio.radioStationNum;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxBorderAudioVolume() {
        Radio radio = new Radio();

        radio.setAudioVolume(101);

        int expected = 100;
        int actual = radio.audioVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minBorderAudioVolume() {
        Radio radio = new Radio();

        radio.setAudioVolume(-1);

        int expected = 0;
        int actual = radio.audioVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationNum() {
        Radio radio = new Radio();

        radio.setRadioStationNum(4);

        radio.nextRadioStationNum();

        int expected = 5;
        int actual = radio.getRadioStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationNum() {
        Radio radio = new Radio();

        radio.setRadioStationNum(4);

        radio.prevRadioStationNum();

        int expected = 3;
        int actual = radio.getRadioStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusAdioValume() {
        Radio radio = new Radio();

        radio.setAudioVolume(40);

        radio.plusAudioVolume();

        int expected = 41;
        int actual = radio.getAudioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinesAdioValume() {
        Radio radio = new Radio();

        radio.setAudioVolume(40);

        radio.minesAudioVolume();

        int expected = 39;
        int actual = radio.getAudioVolume();

        Assertions.assertEquals(expected, actual);
    }


}
