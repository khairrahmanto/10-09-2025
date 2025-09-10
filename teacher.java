public class teacher {
    private String subject;
    private String name;
    private int age;
    private double salary;
    //constructor

    public teacher(){
        subject ="Math";
        name ="John";
        age=30;
        salary=5000.0;
    }
    public teacher(String subject, String name, int age, double salary){
    }
//getter
    public String getsubject(){
        return subject;
    }

    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public double getsalary(){
        return salary;
    }
    //setter
    public void setsubject(String subject){
        this.subject=subject;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setage(int age){
        this.age=age;
    }
    public void setsalary(double salary){
        this.salary=salary;
    }
    //method
    public void print(){
        System.out.println("Subject: "+subject);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
    
}

