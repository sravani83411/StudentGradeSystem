import java.util.Scanner;

public class StudentGradeSystem 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter oops marks: ");
        int oops = sc.nextInt();
                System.out.print("Enter daa marks:");
                 int daa = sc.nextInt();
                System.out.print("Enter dbms marks:");
                 int dbms = sc.nextInt();
                System.out.print("Enter se marks:");
                     int se = sc.nextInt();
                System.out.print("Enter wt marks:");
                     int wt = sc.nextInt();
                    int total = oops + daa + dbms + se + wt;
                    double average = total/5.0;
                System.out.println("total marks:" + average);
                System.out.println("average:" + average);
        if (average >= 90) 
            {
            System.out.println("Grade: A+");
        } else if (average >= 80) 
            {
            System.out.println("Grade: A");
        } else if (average >= 70) 
            {
            System.out.println("Grade: B");
        } else if (average >= 60) 
            {
            System.out.println("Grade: C");
        } else if (average >=50)
            {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
    }
    if (oops>=40 && daa>=40 && dbms>=40 && se>=40 && wt>=40)
    {
        System.out.println("result: pass");
    }
    else{
        System.out.println("result: fail");
    }
        sc.close();
    }
}