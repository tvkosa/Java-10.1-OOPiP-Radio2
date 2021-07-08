package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 10;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;


    public Radio(int currentStation, int currentVolume) {
        this.currentStation = maxStation;
        this.currentVolume = maxVolume;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextButtonStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void prevButtonStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            this.currentStation = currentStation - 1;
        }
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextBattonPlus() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void nextBattonMinus() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}

