
//package Stack;
//import LinkedList.LinkedList;
//import Muppet.Muppet;

public class Stack {
    /*
    L.i.f.o = Last in First out
     */
    private LinkedList stack = new LinkedList();
    public Stack(){

    }

    void push(Muppet m){
        //  Plaats een muppet op de stack
        stack.push(m,1);
    }
    Muppet pop(){
        //  Verwijdert een muppet van de stack
        return  stack.pop(1 );
    }
    void print(){
        //Print de inhoud van de stack
        stack.print();
    }

    int size(){
        //Geeft het huidige aantal muppets dat in de stack staat terug
        return stack.getSize();
    }

}
