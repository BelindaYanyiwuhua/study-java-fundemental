import javax.swing.event.AncestorEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Generics {
    public class Animal{}
    public class Dog extends Animal{}
//    ArrayList<Dog> dogs1 = new ArrayList<Animal>();
//    ArrayList<Animal> animals1 = new ArrayList<Dog>();
    List<Animal> list = new ArrayList<Animal>();
    ArrayList<Dog> dogs = new ArrayList<Dog>();
//    ArrayList<Animal> animals = dogs;
    List<Dog> dogList = dogs;
    ArrayList<Object> objects = new ArrayList<Object>();
    List<Object> objectList = objects;
//    ArrayList<Object> objs = new ArrayList<Dog>();
}
