import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*
        HW3 Task 1
        1. Пусть дан произвольный список целых чисел,
        удалить из него четные числа (в языке уже есть что-то готовое для этого)
        */
        System.out.println("Java HW3. Task 1 - Delete even digits from random list");
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


        /*
        HW3 Task 2
        Задан целочисленный список ArrayList.
        Найти минимальное, максимальное и среднее арифметическое из этого списка.
        */
        System.out.println("Java HW3. Task 2 - Find MAX, MIN and average in random list");
        System.out.print("Enter quantity of elements of list: ");
        int sizeOfRndList = in.nextInt();
        ArrayList<Integer> rndList = new ArrayList<>();
        for (int i = 0; i < sizeOfRndList; i++) {
            rndList.add(r.nextInt(-100, 101));
        }
        System.out.println("Created list: " + rndList);
        Collections.sort(rndList);
        System.out.println("MIN = " + rndList.get(0));
        System.out.println("MAX = " + rndList.get(rndList.size() - 1));
        System.out.println("Average = " + findAverage(rndList));
        in.close();
    }

    public static double findAverage(ArrayList<Integer> lst) {
        double sum = 0;
        for (int num : lst) {
            sum += num;
        }
        return sum / lst.size();
    }
}