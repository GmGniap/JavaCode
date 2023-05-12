public class Circle_Constructor {
    public static int sum(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++)
            result += i;
        return result;
    }

    public static void main(String[] args){
        System.out.println("Sum from 36 and 56 is " + sum(36, 56));
    }
}