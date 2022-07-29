package day5;


public class Task2 {
    public static void main(String[] args) {
    Motorbike bikeOne = new Motorbike("Ducatti","red",2019);
        System.out.println("Модель мотоцикла: "+bikeOne.getModel());
        System.out.println("Цвет мотоцикла: "+bikeOne.getColor());
        System.out.println("Год выпуска: "+bikeOne.getMadeYear());
    }
}
class Motorbike{
   private String model;
   private String color;
   private int madeYear;

    public Motorbike(String model, String color, int madeYear){
        this.model = model;
        this.color = color;
        this.madeYear = madeYear;
    }
    public String getModel(){return model;}
    public String getColor(){return color;}
    public int getMadeYear(){return madeYear;}
}