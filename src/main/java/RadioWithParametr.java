public class RadioWithParametr {

    private int maxCarrentStation = 10;
    private int minCarrentStation = 1;
    private int carrentStation = minCarrentStation;


    public RadioWithParametr(int size) {

        maxCarrentStation = minCarrentStation + size -1;

        this.carrentStation = minCarrentStation;
        this.minCarrentStation = minCarrentStation;
        this.maxCarrentStation = maxCarrentStation;


        System.out.println("Заданное Число Станций    " + maxCarrentStation);
    }

    public int getMaxCarrentStation() {
        return maxCarrentStation ;
    }
    public int getMinCarrentStation () {
        return minCarrentStation ;
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
            carrentStation = minCarrentStation;
        }
    }
    public void prev() {
        if (carrentStation >= minCarrentStation) {
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