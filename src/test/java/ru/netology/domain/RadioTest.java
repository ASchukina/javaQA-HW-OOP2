package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void shouldGetRadioStationNum() {
        Radio radio = new Radio();

        radio.setRadioStationNum(3);

        Assertions.assertEquals(0, radio.getMinRadioStationNum());
        Assertions.assertEquals(9, radio.getMaxRadioStationNum());
        Assertions.assertEquals(3, radio.getRadioStationNum());
//        System.out.println(radio.getRadioStationNum());
    }

    @Test
    void paramTestRadioStation() {
        Radio radio = new Radio(3);

        radio.setRadioStationNum(2);

        Assertions.assertEquals(0, radio.getMinRadioStationNum());
        Assertions.assertEquals(2, radio.getMaxRadioStationNum());
        Assertions.assertEquals(2, radio.getRadioStationNum());
    }

    @Test
    void paramTestRadioStation2() {
        Radio radio = new Radio(15);

        radio.setRadioStationNum(10);

        Assertions.assertEquals(0, radio.getMinRadioStationNum());
        Assertions.assertEquals(14, radio.getMaxRadioStationNum());
        Assertions.assertEquals(10, radio.getRadioStationNum());
    }

    @Test
    void paramTestRadioStationHighBorder() {
        Radio radio = new Radio(3);

        radio.setRadioStationNum(radio.getMaxRadioStationNum());

        Assertions.assertEquals(0, radio.getMinRadioStationNum());
        Assertions.assertEquals(2, radio.getMaxRadioStationNum());
        Assertions.assertEquals(2, radio.getRadioStationNum());
    }

    @Test
    void paramTestRadioStationMinBorder() {
        Radio radio = new Radio(3);

        radio.setRadioStationNum(radio.getMinRadioStationNum());

        Assertions.assertEquals(0, radio.getMinRadioStationNum());
        Assertions.assertEquals(2, radio.getMaxRadioStationNum());
        Assertions.assertEquals(0, radio.getRadioStationNum());
    }

    @Test
    void shouldGetAudioVolume() {
        Radio radio = new Radio();

        radio.setAudioVolume(25);

        Assertions.assertEquals(0, radio.getMinAudioVolume());
        Assertions.assertEquals(100, radio.getMaxAudioVolume());
        Assertions.assertEquals(25, radio.getAudioVolume());
//        System.out.println(radio.getAudioVolume());
    }

    @Test
    void shouldSetToMaxRadioStationNum() {
        Radio radio = new Radio();

        radio.setRadioStationNum(9);

        Assertions.assertEquals(0, radio.getMinRadioStationNum());
        Assertions.assertEquals(9, radio.getMaxRadioStationNum());
        Assertions.assertEquals(9, radio.getRadioStationNum());
//        System.out.println(radio.getRadioStationNum());
    }

    @Test
    void shouldSetToMinRadioStationNum() {
        Radio radio = new Radio();

        radio.setRadioStationNum(0);

        Assertions.assertEquals(0, radio.getMinRadioStationNum());
        Assertions.assertEquals(9, radio.getMaxRadioStationNum());
        Assertions.assertEquals(0, radio.getRadioStationNum());
//        System.out.println(radio.getRadioStationNum());
    }

    @Test
    void shouldSetToMaxAudioVolume() {
        Radio radio = new Radio();

        radio.setAudioVolume(100);
        radio.setToMaxAudioVolume(100);

        Assertions.assertEquals(0, radio.getMinAudioVolume());
        Assertions.assertEquals(100, radio.getMaxAudioVolume());
        Assertions.assertEquals(100, radio.getAudioVolume());
//        System.out.println(radio.getAudioVolume());
    }

    @Test
    void shouldSetToMinAudioVolume() {
        Radio radio = new Radio();

        radio.setAudioVolume(0);
        radio.setToMinAudioVolume(0);

        Assertions.assertEquals(0, radio.getMinAudioVolume());
        Assertions.assertEquals(100, radio.getMaxAudioVolume());
        Assertions.assertEquals(0, radio.getAudioVolume());
//        System.out.println(radio.getAudioVolume());
    }

    @Test
    void maxBorderRadioStationNum() {
        Radio radio = new Radio(10);

        radio.setRadioStationNum(11);

        Assertions.assertEquals(0, radio.getMinRadioStationNum());
        Assertions.assertEquals(9, radio.getMaxRadioStationNum());
        Assertions.assertEquals(0, radio.getRadioStationNum());
//        System.out.println(radio.getRadioStationNum());
    }

    @Test
    void minBorderRadioStationNum() {
        Radio radio = new Radio();

        radio.setRadioStationNum(-1);

        Assertions.assertEquals(0, radio.getMinRadioStationNum());
        Assertions.assertEquals(9, radio.getMaxRadioStationNum());
        Assertions.assertEquals(9, radio.getRadioStationNum());
//        System.out.println(radio.getRadioStationNum());
    }

    @Test
    public void maxBorderAudioVolume() {
        Radio radio = new Radio();

        radio.setAudioVolume(101);

        Assertions.assertEquals(0, radio.getMinAudioVolume());
        Assertions.assertEquals(100, radio.getMaxAudioVolume());
        Assertions.assertEquals(100, radio.getAudioVolume());
//        System.out.println(radio.getAudioVolume());
    }

    @Test
    public void minBorderAudioVolume() {
        Radio radio = new Radio();

        radio.setAudioVolume(-1);

        Assertions.assertEquals(0, radio.getMinAudioVolume());
        Assertions.assertEquals(100, radio.getMaxAudioVolume());
        Assertions.assertEquals(0, radio.getAudioVolume());
//        System.out.println(radio.getAudioVolume());
    }

    @Test
    public void shouldIncreaseRadioStationNum() {
        Radio radio = new Radio();

        radio.setRadioStationNum(4);

        radio.nextRadioStationNum();

        Assertions.assertEquals(0, radio.getMinRadioStationNum());
        Assertions.assertEquals(9, radio.getMaxRadioStationNum());
        Assertions.assertEquals(5, radio.getRadioStationNum());
//        System.out.println(radio.getRadioStationNum());
    }

    @Test
    public void shouldCircleIncreaseRadioStationNum() {
        Radio radio = new Radio();

        radio.setRadioStationNum(9);

        radio.nextRadioStationNum();

        Assertions.assertEquals(0, radio.getMinRadioStationNum());
        Assertions.assertEquals(9, radio.getMaxRadioStationNum());
        Assertions.assertEquals(0, radio.getRadioStationNum());
//        System.out.println(radio.getRadioStationNum());
    }

    @Test
    public void shouldDecreaseRadioStationNum() {
        Radio radio = new Radio();

        radio.setRadioStationNum(4);

        radio.prevRadioStationNum();

        Assertions.assertEquals(0, radio.getMinRadioStationNum());
        Assertions.assertEquals(9, radio.getMaxRadioStationNum());
        Assertions.assertEquals(3, radio.getRadioStationNum());
//        System.out.println(radio.getRadioStationNum());
    }

    @Test
    public void shouldCircleDecreaseRadioStationNum() {
        Radio radio = new Radio();

        radio.setRadioStationNum(0);

        radio.prevRadioStationNum();

        Assertions.assertEquals(0, radio.getMinRadioStationNum());
        Assertions.assertEquals(9, radio.getMaxRadioStationNum());
        Assertions.assertEquals(9, radio.getRadioStationNum());
//        System.out.println(radio.getRadioStationNum());
    }

    @Test
    public void shouldPlusAudioVolume() {
        Radio radio = new Radio();

        radio.setAudioVolume(40);

        radio.plusAudioVolume();

        Assertions.assertEquals(0, radio.getMinAudioVolume());
        Assertions.assertEquals(100, radio.getMaxAudioVolume());
        Assertions.assertEquals(41, radio.getAudioVolume());
//        System.out.println(radio.getAudioVolume());
    }

    @Test
    public void shouldNotPlusAudioVolume() {
        Radio radio = new Radio();

        radio.setAudioVolume(100);

        radio.plusAudioVolume();

        Assertions.assertEquals(0, radio.getMinAudioVolume());
        Assertions.assertEquals(100, radio.getMaxAudioVolume());
        Assertions.assertEquals(100, radio.getAudioVolume());
//        System.out.println(radio.getAudioVolume());
    }

    @Test
    public void shouldMinesAudioVolume() {
        Radio radio = new Radio();

        radio.setAudioVolume(40);

        radio.minesAudioVolume();

        Assertions.assertEquals(0, radio.getMinAudioVolume());
        Assertions.assertEquals(100, radio.getMaxAudioVolume());
        Assertions.assertEquals(39, radio.getAudioVolume());
//        System.out.println(radio.getAudioVolume());
    }

    @Test
    public void shouldNotMinesAudioVolume() {
        Radio radio = new Radio();

        radio.setAudioVolume(0);

        radio.minesAudioVolume();

        Assertions.assertEquals(0, radio.getMinAudioVolume());
        Assertions.assertEquals(100, radio.getMaxAudioVolume());
        Assertions.assertEquals(0, radio.getAudioVolume());
//        System.out.println(radio.getAudioVolume());
    }


}
