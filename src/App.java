
public class App {

        public static void main(String[] args) {

                Muppet animal = new Muppet("Animal", 9);// Object van Muppet
                Muppet beaker = new Muppet("Beaker", 4); // Object van Muppet
                Muppet gonzo = new Muppet("Gonzo", 21); // Object van Muppet
                Muppet kermit = new Muppet("Kermit", 1); // Object van Muppet
                Muppet missPiggy = new Muppet("Miss Piggy", 16); // Object van Muppet
                Muppet swedishChef = new Muppet("Swedish Chef", 7); // Object van Muppet

                LinkedList list = new LinkedList(); // Object of LinkedList
                Stack stack = new Stack(); // Stack Object
                Queue que = new Queue();

                System.out.println("Linked List:");
                list.push(animal, 1);
                list.push(beaker, 2);
                list.push(gonzo, 3);
                list.push(kermit, 7);
                list.push(missPiggy, 5);
                list.push(swedishChef, 6);

                list.pop(4);
                list.pop(2);
                list.pop(6);
                list.pop(7);
                //
                list.pop(3);
                list.pop(5);
                list.pop(1);
                System.out.println("end pop");
                list.print();

                list.pop("Gonzo");
                list.push(list.pop(6), 1);
                list.peek("Aniimal");
                list.peek(1);
                list.print();

                System.out.println("Stack:");
                // list.pop(4);
                // list.pop(2);
                list.pop(6);
                // stack.push(kermit);
                stack.push(beaker);
                // stack.push(swedishChef);
                // stack.pop();
                list.push(stack.pop(), 1);
                // list.push(stack.pop(),1);
                // list.push(stack.pop(),1);
                // list.push(stack.pop(),1);
                stack.print();

                System.out.println("Queue:");
                // list.pop(3);
                list.pop(5);
                // list.pop(1);
                que.push(gonzo);
                // que.push(missPiggy);
                // que.push(animal);
                // que.pop();
                // list.push(que.pop(), 1);
                // list.push(que.pop(),1);
                // list.push(que.pop(),1);
                // list.push(que.pop(),1);
                que.print();

                System.out.println("New Linked List:");
                list.print();

                /*
                 * // Muppet popped = list.pop("Gonzo");
                 * // popped.print();
                 * // list.push(popped, 1);
                 * 
                 */

                /*--Auto--*/
                // animal.next = beaker; //Points to another Puppet.
                // beaker.next = gonzo;
                // gonzo.next = kermit;
                // missPiggy.next = swedishChef;

        }
}
