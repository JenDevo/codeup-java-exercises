public class Person {

    /* Object Basics */
    private String name;

    /* Constructor */
    public Person(String name){
        this.name = name;
    }

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public String sayHello(){
//TODO: print a message to the console using the person's name
   return String.format("Hello " + this.name + "!");
    }

    /* Test in console */
    public static void main(String[] args){
        Person Person1 = new Person("Jenna");
        Person student = new Person ("Jacob");
        Person student2 = new Person("Anna");

        String Person1Name = Person1.getName();
        String newStudent = student.getName();
        String secondNewStudent = student2.getName();
        System.out.println("The name of the student is " + newStudent);
        System.out.println("The name of the first person is " + Person1Name);
        System.out.println("We have a new student, their name is " + secondNewStudent);
        System.out.println(student2.sayHello());
    }

}
