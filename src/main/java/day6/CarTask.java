package day6;

import java.util.Scanner;

public class CarTask{
    public static void main(String[] args) {
        Car car1 = new Car();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число от 2000 до 2500");
        int carYear = scanner.nextInt();

        car1.info();
        car1.setMadeYear(2000);
        car1.setInputYear(carYear);
        System.out.println(car1.getImputYear());
    }
}


class Car {
   private String model;
   private String color;
   private int madeYear;


   public void info(){
       this.model = model;
           System.out.println("Это автомобиль");
       }
       int inputYear;

    public void setInputYear(int inputYear) {
        this.inputYear = inputYear;
    }

    public int getImputYear() {
        return inputYear-madeYear;
    }

    public void setModel(String modelName){
       if(modelName.isEmpty()){
           System.out.println("Вы не указали модель авто, попробуйте еще раз: ");
       }else{
           model = modelName;}
   }
        public void setColor(String colorName) {
        if(colorName.isEmpty()){
            System.out.println("Вы не указали цвет авто, попробуйте еще раз:");
        }else{
           color = colorName;}
   }
        public void setMadeYear(int madeYearIdx) {
        if(madeYearIdx<=1767){
            System.out.println("Автомобили еще не изобрели:( попробуйте еще раз:");
        }else{
           madeYear = madeYearIdx;}
    }

    public String getModel(){
           return model;
    }
    public String getColor(){
           return color;
    }
    public int getMadeYear(){
           return madeYear;
    }
}