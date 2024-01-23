public class Radio {


    private int carrentStation;

    public void next() {

        if (carrentStation != 9) {      // Если станция не 9 (максиьальная) ...
            carrentStation++;          // Прибавляем 1 к текущему номерустанции
        } else {
            carrentStation = 0;           // Иначе, идем на нулевую станцию
        }
    }

    public void prev() {
        if (carrentStation != 0) {      // Если станция не 0 ...
            carrentStation--;           // Уменьшаем ее номер на 1
        } else {
            carrentStation = 9;             // Иначе, идем на 9-ю
        }
    }

    public int getCarrentStation() {
        return carrentStation;
    }

    public void setCarrentStation(int carentStation) {
        if (carentStation < 0) {
            return;
        }
        if (carrentStation > 9) {
            return;
        }
        this.carrentStation = carentStation;
    }

    private int carrentVolume;

    public void up() {
        if (carrentVolume != 100) {      // Если громкость не 100 (Максимаиьальная) ...
            carrentVolume++;          // Прибавляем 1 к ее текущему значению
        } else {
            carrentVolume = 100;           // Иначе, стоим на 100
        }
    }
    public void down() {
        if (carrentVolume != 0) {      // Если грмкость не 0
            carrentVolume--;          // Уменьшаем на 1 от текущего значения громкости
        } else {
            carrentVolume = 0;           // Иначе, стоим на 0
        }
    }

    public int getCarrentVolume() {
        return carrentVolume;
    }
    public void setCarrentVolume(int carrentVolume) {
        if (carrentVolume < 0) {
            return;
        }
        if (carrentVolume > 100) {
            return;
        }
        this.carrentVolume = carrentVolume;
    }
}