package cs61b.day1;

public class StudentLauncher {
    public static void main(String[] args){
        StudentTest studentOne;
        studentOne = new StudentTest(3333);
        StudentTest studentTwo = new StudentTest(5555);

        studentOne.watchLecture();
        studentTwo.watchLecture();
    }
}
