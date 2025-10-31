package rvt;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ArrayListList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OnTheList(scanner);
    }

    public static void OnlyTheseNumbs(Scanner scanner) {
        List<Integer> listy = new ArrayList<>();
        while (true) {
            int numba = Integer.valueOf(scanner.nextLine());
            if (numba == -1) {
                break;
            }
            listy.add(numba);
        }
        System.out.print("From where? ");
        int from = Integer.valueOf((scanner.nextLine()));
        System.out.print("To where? ");
        int to = Integer.valueOf(scanner.nextLine());

        for (int i = from; i < to + 1; i++) {
            System.out.println(listy.get(i));
        }
    }

    public static void ListSize(Scanner scanner) {
        List<String> ListSize = new ArrayList<>();
        while (true) {
            String user = scanner.nextLine();
            if (user == "") {
                break;
            }
            ListSize.add(user);
        }
        System.out.println(ListSize.size());
    }

    public static void OnTheList(Scanner scanner) {
        List<String> CheckerList = new ArrayList<>();
        while (true) {
            String lietotajs = scanner.nextLine();
            if (lietotajs == "") {
                break;
            }
            CheckerList.add(lietotajs);
        }

        System.out.print("Search for? ");
        String name = scanner.nextLine();
        if (CheckerList.contains(name)) {
            System.out.println(name + " Was found!");
        } else {
            System.out.println(name + " Was not found!");
        }
    }

    public static void RemoveLast(String[] args) {
        List<String> LastCheck = new ArrayList<>();
        LastCheck.add("First");
        LastCheck.add("Second");
        LastCheck.add("Third");

        System.out.println(LastCheck);
        RemoveLastMethod(LastCheck);
        RemoveLastMethod(LastCheck);
        System.out.println(LastCheck);

    }

    public static void RemoveLastMethod(List<?> list) {
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
    }
}
