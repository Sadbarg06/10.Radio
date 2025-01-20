package ru.netology.service;

public class Radio {
    private int numberCurrentRadioStat; // номер текущей радио станции
    private int soundVolumeRadio; // громкомкость звука радио

    public void next() {
        if (numberCurrentRadioStat != 9) {
            numberCurrentRadioStat++;
        } else {
            numberCurrentRadioStat = 0;
        }
    }

    public void prev() {
        if (numberCurrentRadioStat != 0) {
            numberCurrentRadioStat--;
        } else {
            numberCurrentRadioStat = 9;

        }
    }

    public void increaseVolume() {
        if (soundVolumeRadio < 100) {
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
        if (numberCurrentRadioStat < 0) {
            return;
        }
        if (numberCurrentRadioStat > 9) {
            return;
        }
        this.numberCurrentRadioStat = numberCurrentRadioStat;
    }

    public int getSoundVolumeRadio() {
        return soundVolumeRadio;
    }

    public void setSoundVolumeRadio(int soundVolumeRadio) {
        if (soundVolumeRadio < 0) {
            return;
        }
        if (soundVolumeRadio > 100) {
            return;
        }
        this.soundVolumeRadio = soundVolumeRadio;
    }
}
