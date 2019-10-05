package decoratorSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortClass
{

    private List<Student> students;
    private int criteria;
    
    public SortClass(List<Student> students, int criteria) 
    {
        this.students = students;
        this.criteria = criteria;
    }
 
    public List<Student> sortingFunc()
    {
        Collections.sort(students, new Comparator<Student>()
        {
            
        	public int compare(Student student1, Student student2)
        	{

                Object object_type = student1.getStudentList().get(criteria);

                if(object_type instanceof String)
                {
                    String string1 = (String) student1.getStudentList().get(criteria);
                    String string2 = (String) student2.getStudentList().get(criteria);

                    if(string1.equals(string2)) 
                    	return 0;
                    
                    return string1.compareTo(string2);
                
                }
                
                else
                {

                    if(object_type instanceof Integer)
                    {
                        Integer num1 = (Integer) (student1.getStudentList().get(criteria));
                        Integer num2 = (Integer) (student2.getStudentList().get(criteria));
                        if(num1 == num2)
                            return 0;
                        return (num1<num2) ? -1 : 1;

                    }
                    
                    else
                    {
                        Double double_num1 = (Double) (student1.getStudentList().get(criteria));
                        Double double_num2 = (Double) (student2.getStudentList().get(criteria));

                        if(double_num1 == double_num2)
                            return 0;
                        return (double_num1<double_num2) ? -1 : 1;
                    }


                }
            }
        	
        });
        
        return students;
    }

    /*public void printStudents()
    {
        for(Student s: students)
            System.out.println(s.toString());
    }*/
}


