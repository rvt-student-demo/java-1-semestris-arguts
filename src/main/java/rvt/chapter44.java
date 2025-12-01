package rvt;


import java.util.Scanner; 

public class chapter44 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ex7(scanner);
    }

    public static void ex1(Scanner scanner) {
        String name = scanner.nextLine();

        int start = name.indexOf(" ");
        String lastName = name.substring(start + 1);
        lastName = lastName.toUpperCase();
        System.out.println(lastName);
    }
    public static void ex2(Scanner scanner) {
        System.out.println("Enter a string:");
        String word = scanner.nextLine();
    for(int i = 0; i < word.length(); i++){
        char letter = word.charAt(i);
        System.out.println(letter);
    }
    }
    public static void ex3(Scanner scanner) {
        System.out.println("Enter a name:");
        String name = scanner.nextLine();
        
        while(name.length() > 0){  // Test the length instead of isEmpty()
            if (name.startsWith("Amy") || name.startsWith("Buffy") || name.startsWith("Cathy")){
                System.out.println("Ms. " + name);
            }
            else if (name.startsWith("Elroy") || name.startsWith("Fred") || name.startsWith("Graham")){
                System.out.println("Mr. " + name);
            }
            else{
                System.out.println(name);
            }
            
            System.out.println("Enter a name:");
            name = scanner.nextLine();
        }
    }
    public static void ex4(Scanner scanner) {
        System.out.print("Enter cook time-> ");
        String input = scanner.nextLine();
        
        String minutes;
        String seconds;
        
        if (input.length() <= 2) {
            
            minutes = "0";
            seconds = input;
            
            if (seconds.length() == 1) {
                seconds = "0" + seconds;
            }
        } else {
            
            minutes = input.substring(0, input.length() - 2);
            seconds = input.substring(input.length() - 2);
        }
        
        System.out.println("Your time->  " + minutes + ":" + seconds);
    }
    public static void ex5(Scanner scanner) {
        boolean inBlockComment = false;
        
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String trimmed = line.trim();
            
            if (trimmed.startsWith("//")) {
                System.out.println(line);
            }
            else if (trimmed.startsWith("/*")) {
                inBlockComment = true;
                System.out.println(line);
            }
            else if (trimmed.startsWith("*/")) {
                System.out.println(line);
                inBlockComment = false;
            }
            else if (inBlockComment) {
                System.out.println(line);
            }
        }
    }
    public static void ex6(Scanner scanner) {
        boolean acceptable = false;
        
        while(!acceptable) {
            System.out.println("Enter your password:");
            String password = scanner.nextLine();
            
            if (password.length() >= 7) {
                boolean hasUpper = !password.equals(password.toLowerCase());
                boolean hasLower = !password.equals(password.toUpperCase());
                boolean hasDigit = false;
                
                for(int i = 0; i < password.length(); i++) {
                    if (Character.isDigit(password.charAt(i))) {
                        hasDigit = true;
                        break;
                    }
                }
                
                if (hasUpper && hasLower && hasDigit) {
                    acceptable = true;
                    System.out.println("Acceptable password.");
                } else {
                    System.out.println("That password is not acceptable.");
                }
            } else {
                System.out.println("That password is not acceptable.");
            }
        }
    }
    public static void ex7(Scanner scanner) {
        System.out.print("Enter a word -->");
        String word = scanner.nextLine();
        
        int spaces = 0;
        
        while(word.length() > 0) {
            for(int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            System.out.println(word);
            
            if (word.length() < 2) {
                break;
            }
            
            word = word.substring(1, word.length() - 1);
            spaces++;
        }
    }

}

