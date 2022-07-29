package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Honda s2000");
        car1.setColor("black");
        car1.setMadeYear(1997);

        System.out.println("Модель авто: "+car1.getModel());
        System.out.println("Цвет авто: "+car1.getColor());
        System.out.println("Год выпуска: "+car1.getMadeYear());
    }
}
class Car{
   private String model;
   private String color;
   private int madeYear;

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