public class teachertest {
    public static void main(String[] args) {

        //constructor
        teacher teacher1 = new teacher();
        teacher1.print();

        teacher teacher2 = new teacher();
        teacher2.setsubject("Science");
        teacher2.setname("Alice"); 
        teacher2.setage(28);    
        teacher2.setsalary(5500.0);


    }
}
