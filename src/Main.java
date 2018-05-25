import java.util.Scanner;
public class Main{

        public static void main(String[] args){
            Student stu001 = new Student("Ram", 90, 80, 70);
            Student stu002 = new Student("Mohan", 84,32,90);
            Student stu003 = new Student("Hari", 84,27,90);
            printStudent(stu001);
            printStudent(stu002);
            printStudent(stu003);
        }
            private static void printStudent (Student Student){
                System.out.println(Student.getName());
                System.out.println("Math : " + Student.getMath());
                System.out.println("Science : " + Student.getScience());
                System.out.println("Nepali : " + Student.getNepali());
                System.out.println("Total : " + Student.getTotal());
                System.out.println("Percentage : " + Student.getPercentage());
                boolean isFail = Student.isFail();
                if (isFail) {
                    System.out.println("Failed");
                } else {
                    System.out.println("Passed");
                }
                System.out.println("-----------------------------------");
            }

        }


