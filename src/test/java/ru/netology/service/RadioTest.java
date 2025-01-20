package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetMaxRadioStations() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStat(10);
        int expected = 0;
        int actual = rad.getNumberCurrentRadioStat();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinRadioStations() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStat(5);
        rad.setNumberCurrentRadioStat(0);
        int expected = 0;
        int actual = rad.getNumberCurrentRadioStat();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStat(-1);
        int expected = 0;
        int actual = rad.getNumberCurrentRadioStat();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPickNumber() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStat(8);
        int expected = 8;
        int actual = rad.getNumberCurrentRadioStat();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReductionRadioStationMin() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStat(-6);
        int expected = 0;
        int actual = rad.getNumberCurrentRadioStat();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReductionRadioStationMax() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStat(15);
        int expected = 0;
        int actual = rad.getNumberCurrentRadioStat();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAcceptableRadioStation() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStat(1);
        int expected = 1;
        int actual = rad.getNumberCurrentRadioStat();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNotMaxAcceptableRadioStation() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStat(9);
        int expected = 9;
        int actual = rad.getNumberCurrentRadioStat();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumber() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStat(1);
        rad.next();
        int expected = 2;
        int actual = rad.getNumberCurrentRadioStat();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberAfterMax() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStat(9);
        rad.next();
        int expected = 0;
        int actual = rad.getNumberCurrentRadioStat();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberAfterMin() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStat(0);
        rad.next();
        int expected = 1;
        int actual = rad.getNumberCurrentRadioStat();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumber() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStat(7);
        rad.prev();
        int expected = 6;
        int actual = rad.getNumberCurrentRadioStat();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumberBeforeMin() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStat(0);
        rad.prev();
        int expected = 9;
        int actual = rad.getNumberCurrentRadioStat();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setSoundVolumeRadio(35);
        rad.increaseVolume();
        int expected = 36;
        int actual = rad.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReductionVolume() {
        Radio rad = new Radio();
        rad.setSoundVolumeRadio(35);
        rad.reductionVolume();
        int expected = 34;
        int actual = rad.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio rad = new Radio();
        rad.setSoundVolumeRadio(100);
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio rad = new Radio();
        rad.setSoundVolumeRadio(0);
        rad.reductionVolume();
        int expected = 0;
        int actual = rad.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setSoundVolumeRadio(101);

        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReductionVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setSoundVolumeRadio(-1);
        rad.reductionVolume();
        int expected = 0;
        int actual = rad.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

}
