//package Muppet;

public class Muppet {

    private String name; // Name of Puppet
    private int age; // Age of Puppet
    Muppet next; //Pointer to next Muppet

    /* Points to the following Puppet*/

    /* Muppet Public Constructor*/
    public Muppet(String name , int age){
        this.name = name; //this name Point to String name
        this.age = age; // this age Point to int age
//        this.next = null;
    }
        /*Set*/
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNext(Muppet next) {
        this.next = next;
    }

    /*Get*/
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Muppet getNext() {
        return next;
    }

    /*Print Method*/
    public void print(){
        System.out.print(name + " " + age);// Print Name
        System.out.println();// Print New Line
//        System.out.println();// Print New line
    }

}
