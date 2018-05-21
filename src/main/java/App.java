import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import models.Triangle;

public class App {
    public static void main(String[] args) {
        try {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Let's make a triangle. First, please put enter the length of the first side.");
        int userSideA = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Please put enter the length of the second side.");
        int userSideB = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Please put enter the length of the third side.");
        int userSideC = Integer.parseInt(bufferedReader.readLine());

        Triangle userTriangle = new Triangle(userSideA, userSideB, userSideC);
        System.out.println("Alright, here's your triangle.");
        System.out.println("___________________");
        System.out.println("Side A: " + userSideA);
        System.out.println("Side B: " + userSideB);
        System.out.println("Side C: " + userSideC);

        String triangleResult = userTriangle.triangleChecker();
        System.out.println("Your triangle is " + triangleResult);

        } catch (IOException e) {
        e.printStackTrace();
        }
    }
}
