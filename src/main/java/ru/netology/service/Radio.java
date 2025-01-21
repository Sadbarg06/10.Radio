package ru.netology.service;

public class Radio {
    private int numberCurrentRadioStat; // номер текущей радио станции
    private int maxNumberCurrentRadioStat;
    private int minNumberCurrentRadioStat = 0;
    private int soundVolumeRadio; // громкомкость звука радио
    private int maxSoundVolumeRadio = 100;
    private int minSoundVolumeRadio = 0;

    public Radio() {
        this.maxNumberCurrentRadioStat = 9;
    }

    public Radio(int quantityRadioStations) {
        this.maxNumberCurrentRadioStat = quantityRadioStations - 1;

    }

    public int getMaxNumberCurrentRadioStat() {
        return maxNumberCurrentRadioStat;
    }

    public int getMinNumberCurrentRadioStat() {
        return minNumberCurrentRadioStat;
    }

    public int getMaxSoundVolumeRadio() {
        return maxSoundVolumeRadio;
    }

    public int getMinSoundVolumeRadio() {
        return minSoundVolumeRadio;
    }

    public void next() {
        if (numberCurrentRadioStat != maxNumberCurrentRadioStat) {
            numberCurrentRadioStat++;
        } else {
            numberCurrentRadioStat = minNumberCurrentRadioStat;
        }
    }

    public void prev() {
        if (numberCurrentRadioStat != minNumberCurrentRadioStat) {
            numberCurrentRadioStat--;
        } else {
            numberCurrentRadioStat = maxNumberCurrentRadioStat;

        }
    }

    public void increaseVolume() {
        if (soundVolumeRadio < maxSoundVolumeRadio) {
            soundVolumeRadio = soundVolumeRadio + 1;
        }
    }

    public void reductionVolume() {
        if (soundVolumeRadio > 0) {
            soundVolumeRadio = soundVolumeRadio - 1;
        }
    }


    public int getNumberCurrentRadioStat() {
        return numberCurrentRadioStat;
    }

    public void setNumberCurrentRadioStat(int numberCurrentRadioStat) {
        if (numberCurrentRadioStat < minNumberCurrentRadioStat) {
            return;
        }
        if (numberCurrentRadioStat > maxNumberCurrentRadioStat) {
            return;
        }
        this.numberCurrentRadioStat = numberCurrentRadioStat;
    }

    public int getSoundVolumeRadio() {
        return soundVolumeRadio;
    }

    public void setSoundVolumeRadio(int soundVolumeRadio) {
        if (soundVolumeRadio < minSoundVolumeRadio) {
            return;
        }
        if (soundVolumeRadio > maxSoundVolumeRadio) {
            return;
        }
        this.soundVolumeRadio = soundVolumeRadio;
    }
}
