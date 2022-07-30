package day6;



import java.util.Random;

public class Teacher {
   private String teacherName;
   private String subjectName;

    public Teacher(String teacherName, String subjectName){
        this.teacherName = teacherName;
        this.subjectName = subjectName;}

    public void evaluate(Student student){
        Random random = new Random();
        int number = random.nextInt(4)+2;

        String evaluateNum = "";
        switch (number){
            case 2: evaluateNum = "Неудовлетворительно";
            break;

            case 3: evaluateNum = "Удовлетворительно";
            break;

            case 4: evaluateNum = "Хорошо";
            break;

            case 5: evaluateNum = "Отлично";
            break;

        }
        System.out.println("Преподаватель "+ this.teacherName + " оценил студента с именем "+ student.getStudentName()+ " по предмету "+ this.subjectName + " на оценку "+ evaluateNum);
    }


}

