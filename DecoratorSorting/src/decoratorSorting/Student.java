package decoratorSorting;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private Integer age;
    private Double cgpa;
    private String session;
    private Double height;

    private List<Object> studentList;

    public Student(String name, Integer age, Double cgpa, String session,Double height) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
        this.session = session;
        this.height=height;

        studentList = new ArrayList<>();
        studentList.add(this.name);
        studentList.add(this.age);
        studentList.add(this.cgpa);
        studentList.add(this.session);
        studentList.add(this.height);
        
    }
    
    @Override
    public String toString() {
        return "name: "+this.name+", age: "+this.age+","
        		+ " cgpa: "+this.cgpa+", session: "+this.session+
        		" height: "+this.height+"\n";
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public String getSession() {
        return session;
    }
    
    public Double getHeight() {
        return height;
    }

    public List<Object> getStudentList() {
        return studentList;
    }


}


    
	    