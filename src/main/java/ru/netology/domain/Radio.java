package ru.netology.domain;

public class Radio {
    private int radioStationNum;
    private int audioVolume;

    public int getRadioStationNum() {
        return radioStationNum;
    }

    public int getAudioVolume() {
        return audioVolume;
    }

    public void setRadioStationNum(int nextRadioStationNum) {
        if (nextRadioStationNum > 9) {
            return;
        }
        if (nextRadioStationNum < 0) {
            nextRadioStationNum = 9;
        }
        radioStationNum = nextRadioStationNum;
    }

    public void setAudioVolume(int nextAudioVolume) {
        if (nextAudioVolume > 100) {
            nextAudioVolume = 100;
        }
        if (nextAudioVolume < 0) {
            nextAudioVolume = 0;
        }
        audioVolume = nextAudioVolume;
    }

    public void setToMaxRadioStationNum() {
        radioStationNum = 9;
    }

    public void setToMaxAudioVolume() {
        audioVolume = 100;
    }

    public void setToMinRadioStationNum() {
        radioStationNum = 0;
    }

    public void setToMinAudioVolume() {
        audioVolume = 0;
    }

    public void nextRadioStationNum() {
        if (radioStationNum >= 9) {
            radioStationNum = 0;
            return;
        }
        radioStationNum = radioStationNum + 1;
    }

    public void prevRadioStationNum() {
        if (radioStationNum <= 0) {
            radioStationNum = 9;
            return;
        }
        radioStationNum = radioStationNum - 1;
    }

    public void plusAudioVolume() {
        if (audioVolume >= 100) {
            audioVolume = audioVolume;
        }
        if (audioVolume < 100) {
            audioVolume = audioVolume + 1;
        }
    }

    public void minesAudioVolume() {
        if (audioVolume <= 0) {
            audioVolume = audioVolume;
        }
        if (audioVolume > 0) {
            audioVolume = audioVolume - 1;
        }
    }


}
