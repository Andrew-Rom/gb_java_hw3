import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        HW3 Task 1
        1. Пусть дан произвольный список целых чисел,
        удалить из него четные числа (в языке уже есть что-то готовое для этого)
        */
        System.out.println("Java HW3. Task 1 - Delete even digits from on random list");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter quantity of elements of list: ");
        int quantityOfElements = in.nextInt();
        Random r = new Random();
        ArrayList<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < quantityOfElements; i++) {
            randomList.add(r.nextInt(-100, 101));
        }
        System.out.println("Original list: " + randomList);
        randomList.removeIf(num -> (num % 2 == 0));
        System.out.println("Modified list: " + randomList);





    }


}