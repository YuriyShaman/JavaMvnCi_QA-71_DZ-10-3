public class RadioWithParametr {


    private int usMaxCarrentStation = 10;
    private int usMinCarrentStation = 1;

    int maxCarrentStation = usMaxCarrentStation -1;
    int minCarrentStation = usMinCarrentStation -1;
    private int carrentStation = usMinCarrentStation -1;

    public RadioWithParametr(int size) {

        maxCarrentStation = minCarrentStation + size;

        this.maxCarrentStation = maxCarrentStation;
        this.minCarrentStation = minCarrentStation;
        this.carrentStation = minCarrentStation;

        System.out.println("Заданное Число Станций        " + maxCarrentStation);
    }

      public int getCarrentStation() {
        return carrentStation;
    }

    public void setCarrentStation(int carrentStation) {
        if (carrentStation < minCarrentStation) {
            return;
        }
        if (carrentStation > maxCarrentStation) {
            return;
        }

        this.carrentStation = carrentStation;

        System.out.println("Переключение с Радиостанции   " + carrentStation);
    }

    public void next() {
        if (carrentStation != maxCarrentStation) {
            carrentStation++;
        } else {
            carrentStation = usMinCarrentStation;
        }
    }

    public void prev() {
        if (carrentStation != usMinCarrentStation) {
            carrentStation--;
        } else {
            carrentStation = maxCarrentStation;
        }
    }

    private int carrentVolume;

    public void up() {
        if (carrentVolume < 100) {
            carrentVolume++;
        } else {
            carrentVolume = 100;
        }
    }

    public void down() {
        if (carrentVolume > 0) {
            carrentVolume--;
        } else {
            carrentVolume = 0;
        }
    }

    public int getCarrentVolume() {
        return carrentVolume;
    }

    public void setCarrentVolume(int carrentVolume) {
        if (carrentVolume > 100) {
            return;
        }
        if (carrentVolume < 0) {
            return;
        }
        this.carrentVolume = carrentVolume;
    }
}