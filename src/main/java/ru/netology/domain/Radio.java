package ru.netology.domain;

public class Radio {
    private int maxRadioStationNum = 9;
    private int minRadioStationNum = 0;
    private int maxAudioVolume = 100;
    private int minAudioVolume = 0;
    private int radioStationNum;
    private int audioVolume;

    public Radio(int radioStationNum, int audioVolume, int maxRadioStationNum, int minRadioStationNum, int maxAudioVolume, int minAudioVolume) {
        this.maxRadioStationNum = maxRadioStationNum;
        this.minRadioStationNum = minRadioStationNum;
        this.maxAudioVolume = maxAudioVolume;
        this.minAudioVolume = minAudioVolume;
        this.radioStationNum = radioStationNum;
        this.audioVolume = audioVolume;
    }

    public Radio() {

    }

    public int getRadioStationNum() {
        return radioStationNum;
    }

    public int getAudioVolume() {
        return audioVolume;
    }

    public int getMaxRadioStationNum() {
        return maxRadioStationNum;
    }

    public int getMinRadioStationNum() {
        return minRadioStationNum;
    }

    public int getMaxAudioVolume() {
        return maxAudioVolume;
    }

    public int getMinAudioVolume() {
        return minAudioVolume;
    }

    public void setRadioStationNum(int radioStationNum) {
        if (radioStationNum > maxRadioStationNum) {
            this.radioStationNum = minRadioStationNum;
            return;
        }
        if (radioStationNum < minRadioStationNum) {
            this.radioStationNum = maxRadioStationNum;
            return;
        }
        this.radioStationNum = radioStationNum;
    }

    public void setAudioVolume(int audioVolume) {
        if (audioVolume > maxAudioVolume) {
            this.audioVolume = maxAudioVolume;
            return;
        }
        if (audioVolume < minAudioVolume) {
            this.audioVolume = minAudioVolume;
            return;
        }
        this.audioVolume = audioVolume;
    }

    public void setToMaxRadioStationNum(int maxRadioStationNum) {
        this.maxRadioStationNum = maxRadioStationNum;
    }

    public void setToMaxAudioVolume(int maxAudioVolume) {
        this.maxAudioVolume = maxAudioVolume;
    }

    public void setToMinRadioStationNum(int minRadioStationNum) {
        this.minRadioStationNum = minRadioStationNum;
    }

    public void setToMinAudioVolume(int minAudioVolume) {
        this.minAudioVolume = minAudioVolume;
    }

    public void nextRadioStationNum() {
        if (radioStationNum >= maxRadioStationNum) {
            this.radioStationNum = minRadioStationNum;
            return;
        }
        radioStationNum = radioStationNum + 1;
    }

    public void prevRadioStationNum() {
        if (radioStationNum <= minRadioStationNum) {
            this.radioStationNum = maxRadioStationNum;
            return;
        }
        radioStationNum = radioStationNum - 1;
    }

    public void plusAudioVolume() {
        if (audioVolume >= maxAudioVolume) {
            this.audioVolume = maxAudioVolume;
            return;
        }
        audioVolume = audioVolume + 1;
    }

    public void minesAudioVolume() {
        if (audioVolume <= minAudioVolume) {
            this.audioVolume = minAudioVolume;
            return;
        }
        audioVolume = audioVolume - 1;
    }


}
