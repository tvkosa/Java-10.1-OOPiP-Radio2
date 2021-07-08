package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldUseRadio() {
        Radio radio = new Radio(10, 100);
        assertEquals(10, radio.getCurrentStation());
        assertEquals(100, radio.getMaxVolume());
    }

    Radio radio = new Radio();
    @Test
    public void shouldInitField() {
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getCurrentVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(100, radio.getMaxVolume());
    }

     @Test
    public void numberCurrentStationRangesFromTo() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(10);
        assertEquals(10, radio.getCurrentStation());

        radio.setCurrentStation(11);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void pressedNextButtonStation0() {
        radio.setCurrentStation(10);
        radio.nextButtonStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void pressedNextButtonStation9() {
        radio.setCurrentStation(8);
        radio.nextButtonStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void pressedPrevButtonStation0() {
        radio.setCurrentStation(0);
        radio.prevButtonStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void pressedPrevButtonStation5() {
        radio.setCurrentStation(5);
        radio.prevButtonStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void increaseSoundVolume() {
        radio.setCurrentVolume(99);
        radio.nextBattonPlus();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void increaseSoundVolumeMax() {
        radio.setCurrentVolume(100);
        radio.nextBattonPlus();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseSoundVolume() {
        radio.setCurrentVolume(100);
        radio.nextBattonMinus();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void decreaseSoundVolumeMin() {
        radio.setCurrentVolume(0);
        radio.nextBattonMinus();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void maximumVolumeReached() {
        radio.setCurrentVolume(100);
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void minimumVolumeReached() {
        radio.setCurrentVolume(0);
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }
}

