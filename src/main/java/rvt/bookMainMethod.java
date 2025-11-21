package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class bookMainMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new book(title, pages, year));
        }

        System.out.print("What information will be printed? ");
        String choice = scanner.nextLine();

        if (choice.equals("name")) {
            for (book b : books) {
                System.out.println(b.getTitle());
            }
        } else if (choice.equals("everything")) {
            for (book b : books) {
                System.out.println(b); // uses toString()
            }
        }
    }
}

