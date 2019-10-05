package decoratorSorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	List<Student> finalList = new ArrayList<>();

	Scanner input = new Scanner(System.in);
	 
	finalList.add(new Student("Saaj", 21, 3.68, "2016-2017",5.2));
	finalList.add(new Student("Anika", 22, 3.78, "2017-2018",5.1));
	finalList.add(new Student("Apan", 22, 3.60, "2016-2017",5.4));
	finalList.add(new Student("Emu", 23, 3.5, "2014-2015",5.6));

    System.out.println("Enter 5 numbers:");
    System.out.println("0: If want to sort lexicographically");
    System.out.println("1: If want to sort by age");
    System.out.println("2: If want to sort by cgpa");
    System.out.println("3: If want to sort by session");
    System.out.println("4: If want to sort by height");
    
    int criteria1=input.nextInt();
    int criteria2=input.nextInt();
    int criteria3=input.nextInt();
    int criteria4=input.nextInt();
    int criteria5=input.nextInt();
    
   
    finalList =  new SortClass((new SortClass((new SortClass(new SortClass((new SortClass(finalList, criteria1).sortingFunc()),criteria2).sortingFunc(),
    		criteria3).sortingFunc()),criteria4).sortingFunc()),criteria5).sortingFunc();
 

    for(Student student : finalList)
        System.out.println(student.toString());
}	         

}
