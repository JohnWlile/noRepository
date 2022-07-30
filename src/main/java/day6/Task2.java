package day6;



public class Task2 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Boeing",2015,70,162);
        plane1.setYear(2017);
        plane1.setLenght(80);

        plane1.FillUp(190);
        plane1.FillUp(264);

        plane1.info();


    }
}

