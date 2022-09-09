package Homework.HW3;

public enum CRU {
    AUTRE(80), PREMIER(90), GRAND(100);

    private int quality;

    CRU(int quality) {
        this.quality = quality;
    }

public int getQuality() {
        return quality;
    }
}
