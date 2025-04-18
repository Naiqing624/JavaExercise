import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void  main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("Welcome to Student's System");
            System.out.println("1: AddStudent");
            System.out.println("2: DeleteStudent");
            System.out.println("3: ModifyInfo");
            System.out.println("4: FindStudent");
            System.out.println("5: Exit");
            System.out.println("Please entre the number of the task");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" :
                    addStudent(list);
                    break;
                case "2" :
                    deleteStudent(list);
                    break;
                case "3" :
                    modifyInfo(list);
                    break;
                case "4" :
                    findInfo(list);
                    break;
                case "5" : {
                    System.out.println("Exiting");
                    System.exit(0);
                }
                default :
                    System.out.println("Please at least choose one task");
                    break;
            }
        }

    }

    public static void addStudent(ArrayList<Student> list) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please entre the id number");
        while (true) {
            String  idNumber = sc.nextLine();
            if (contain(list, idNumber)) {
                System.out.println("ID number existed, please entre it again");
            } else {
                s.setId(idNumber);
                System.out.println("Set Id number success");
                break;
            }
        }
        System.out.println("Now please entre student's name");
        String  name = sc.nextLine();
        s.setName(name);

        System.out.println("Set name success.\nPlease entre student's age");
        int age = sc.nextInt();
        s.setAge(age);

        sc.nextLine();
        System.out.println("Set age success.\nPlease entre student's address");
        String add = sc.nextLine();
        s.setAddress(add);
        list.add(s);
        System.out.println("Student add successfully");
    }

    public static void  deleteStudent(ArrayList<Student> list) {
        System.out.println("You are now in DELETE mode.");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please entre the student's id number to delete");
            String idNumber = sc.nextLine();
            int index = getIndex(list, idNumber);
            if (index >= 0) {
                list.remove(index);
                System.out.println("Id number: " + idNumber + " is deleted");
                break;
            } else {
                System.out.println("Id number is not existed. Please try again.");
            }
        }
    }

    public static void modifyInfo(ArrayList<Student> list) {
        System.out.println("Which student's information you want to modify?\nPlease entre the student's id number");
        Scanner sc = new Scanner(System.in);
        String idNumber = sc.nextLine();
        int index = getIndex(list, idNumber);
        if (index == -1) {
            System.out.println("Id number is not existed");
            return ;
        }
        Student stu = list.get(index);
        System.out.println("Here is all the information about this student.");
        System.out.println("Here is the information: \nId: " + stu.getId() + "\nName: " + stu.getName() + "\nAge: " + stu.getAge() + "\nAddress: " + stu.getAddress());
        System.out.println("Please entre what you want to modify.");
        String input = sc.nextLine();
        switch (input) {
            case "name" :{
                System.out.println("Please enter the name to be modified");
                String  newName = sc.nextLine();
                stu.setName(newName);
                break;
            }
            case "age" :{
                System.out.println("Please enter the age to be modified");
                int newAge = sc.nextInt();
                stu.setAge(newAge);
                sc.nextLine();
                break;
            }
            case "address" :{
                System.out.println("Please enter the address to be modified");
                String  newAdd = sc.nextLine();
                stu.setAddress(newAdd);
                break;
            }
        }
        System.out.println("Modify successfully\nBack to main menu");
    }

    public static void findInfo(ArrayList<Student> list) {
        System.out.println("Please enter the id number of student which you are looking for");
        Scanner sc = new Scanner(System.in);
        String idNumber = sc.nextLine();
        int index = getIndex(list, idNumber);
        if (index == -1) {
            System.out.println("Id number is not existed");
            return ;
        }
        Student stu = list.get(index);
        System.out.println("Here is the information: \nId: " + stu.getId() + "\nName: " + stu.getName() + "\nAge: " + stu.getAge() + "\nAddress: " + stu.getAddress());
        System.out.println("Back to main menu");
    }

    public static boolean contain(ArrayList<Student> list, String id) {
        return getIndex(list, id) >= 0;
    }

    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if (sid.equals(id)) {
                return (i);
            }
        }
        return (-1);
    }
}

