public class Person {

    /* Object Basics */
    private String name;

    /* Constructor */
    public Person(String name){
        this.name = name;
    }

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
   System.out.println("Hello " + this.name + "!");
    }

    /* Test in console */
    public static void main(String[] args){
        Person Person1 = new Person("Jenna");

        String Person1Name = Person1.getName();
        System.out.println("The name of the first person is " + Person1Name);
    }

}
