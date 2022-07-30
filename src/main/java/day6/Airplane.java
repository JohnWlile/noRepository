package day6;

public class Airplane {
    private String manufacturer;
    private int year;
    private int lenght;
    private int weight;
    private int fuel;

    public Airplane(String manufacturer, int year, int lenght,int weight){
        this.manufacturer = manufacturer;
        this.year = year;
        this.lenght = lenght;
        this.weight = weight;
        this.fuel = 0;
    }
    public void info() {
        System.out.println("Изготовитель: " + manufacturer);
        System.out.println("Год выпуска : " + year);
        System.out.println("Длина самолета : " + lenght);
        System.out.println("Вес самолета : " + weight);
        System.out.println("Кол-во топлива : " + fuel);
    }
    public void FillUp(int n) {
        fuel += n;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getFuel() {
        return fuel;
    }
    public void setFuel(int fuel) {this.fuel = fuel; }
}

