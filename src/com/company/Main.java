package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Scanner stdin = new Scanner(System.in);

        do {
            System.out.println("Current movie list is: " + list);
            System.out.println("Add movie? (y/n)");
            if (stdin.next().startsWith("y")) {
                System.out.println("Enter a movie name: ");
                list.add(stdin.next());
            } else {
                break;
            }
        } while (true);
        stdin.close();
        System.out.println("Movie lists " + list);
        String[] arr = list.toArray(new String[0]);
        System.out.println("Movies are " + Arrays.toString(arr));
    }
}
