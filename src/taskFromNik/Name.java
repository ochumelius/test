package taskFromNik;

import java.util.Scanner;

public class Name {
    public static void main(String [] args){
        System.out.println("Please, enter your name: " );

        Scanner scanner = new Scanner(System.in);
        String enterName;
        enterName = scanner.next();

        System.out.println("Hello, " + enterName);

	//TODO: check if name contains only letters.
	//TODO: if name contains other symdols print warning and ask for proper name
    }
}
