import java.util.Scanner;

public class JavaGit {
    public  static void main(String[] args){
        String name;
        int score;
        int age;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter student name: ");
        name= input.nextLine();

        System.out.print("Enter your score(0-100): ");
        score=input.nextInt();

        System.out.print("Enter your age: ");
        age=input.nextInt();

        System.out.println("/n---Student Result---");
        System.out.println("Name: "+name);
        System.out.println("Score: "+score);

        if(score>=90){
            System.out.println("Grade A");
        } else if (score>=80) {
            System.out.println("Grade B");
        } else if (score>=70) {
            System.out.println("Grade C");
        } else if (score>=60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");

        }
        if (age<18){
            System.out.println("Status:Minor Student");
        }else {
            System.out.println("Status: Adult Student");

            input.close();
        }
    }
}
