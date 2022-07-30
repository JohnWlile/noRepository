package day6;

import java.util.Scanner;

public class MotorbikeTask{
    public static void main(String[] args) {
        Motorbike bike = new Motorbike(2000);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число от 2000 до 2500");
        int bikeYear = scanner.nextInt();
        bike.info();
        bike.setInputYear(bikeYear);
        System.out.println(bike.getInputYear());
    }


        }
class Motorbike {
   private String model;
   private String color;
   private int madeYear;
int inputYear;
public void info(){
    this.model = model;
    System.out.println("Это мотоцикл");
}
    public void setInputYear(int inputYear) {
        this.inputYear = inputYear;
    }
    public int getInputYear() {
        return inputYear-madeYear;
    }

    public Motorbike(int madeYear){
        this.madeYear = madeYear;
    }
    public String getModel(){return model;}
    public String getColor(){return color;}
    public int getMadeYear(){return madeYear;}
}