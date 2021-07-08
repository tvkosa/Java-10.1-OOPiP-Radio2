package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void numberCurrentStationRangesFromTo() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());

        radio.setCurrentStation(10);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void pressedNextButtonStation0() {
        radio.setCurrentStation(9);
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
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void pressedPrevButtonStation8() {
        radio.setCurrentStation(9);
        radio.prevButtonStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void increaseSoundVolume() {
        radio.setCurrentVolume(9);
        radio.nextBattonPlus();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void increaseSoundVolumeMax() {
        radio.setCurrentVolume(10);
        radio.nextBattonPlus();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void decreaseSoundVolume() {
        radio.setCurrentVolume(10);
        radio.nextBattonMinus();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void decreaseSoundVolumeMin() {
        radio.setCurrentVolume(0);
        radio.nextBattonMinus();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void maximumVolumeReached() {
        radio.setCurrentVolume(10);
        radio.setCurrentVolume(11);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void minimumVolumeReached() {
        radio.setCurrentVolume(0);
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }
}

