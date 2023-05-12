package cs61b.day1;

public class StudentTest {
    public int idNumber;
    public int grade;
    public static String professor = "Self";
    public StudentTest(int id){
        this.idNumber = id;
        this.grade = 100;
    }

    public void watchLecture(){
        System.out.println("Watching...");
    }
}
