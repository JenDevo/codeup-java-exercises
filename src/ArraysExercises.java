import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person person){
        people = Arrays.copyOf(people, people.length + 1);
        people[people.length - 1] = person;
        return people;
    }



    public static void main (String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person reese = new Person("Reese");
        Person tehya = new Person("Tehya");
        Person easton = new Person("Easton");
        Person[] people = {reese, tehya, easton};
        for (Person siblings : people) {
            System.out.println(siblings.getName() + " is one of my siblings.");
        }

    }


}
