//package LinkedList;

public class LinkedList {
    private int size;
    private Muppet start;

    //        Muppet currentMuppet = start; //currentMuppet defined as start
     public  Muppet push(Muppet m, int p){
        /*
         * If the list is null, then size will be incremented and set to null.
         * Else if p equals 1, start will be set to m's next.*/
        if(m !=null){
            //Check if the list is full
            if(p <= size + 1) {
                size++; //if list is full increment size

                if (this.start == null) { // start will be set to null
                    this.start = m;
                }
                else if(p == 1){ // Else if p equals 1, start will be set to m
                    Muppet temp = start;
                    start = m; //start is set to m
                    start.setNext(temp); // Temp will become the new head of the list
                }
                else{
                    Muppet currentMuppet = start; // Else currentMuppet becomes the new head of the list
                    p--; // p decreases until either a null or a 1 are reached

                    /*If the currentMuppet is not null, keep checking for a new head of the list until either a 1 or null reached.
                     * As long as there is another Muppet on this list, and p does not equal to 1,
                     * then continue checking for more heads of this list until one becomes null or equals to 1.*/
                    while((currentMuppet.getNext() != null) && (p != 1)){ //currentMuppet becomes null (currentMuppet not equal to null && p not equal to 1)
                        currentMuppet = currentMuppet.getNext(); // currentMuppet next becomes m's next.
                        p--; // p decreases until either null or a 1 are reached.
                    }
                    /*currentMuppet becomes null again and then set's It's next as m's next.
                     *#SETS THE CURRENTMUPPET TO THE NEXT MUPPET#
                     * When executed for the first time it will sign whatever is currently stored in "curent""Muppets'list.*/
                    Muppet temp =  currentMuppet.getNext(); // declare variable temp with an initializer expression of currentMuppet.getNext()
                    currentMuppet.setNext(m); //assigns the value of currentMuppet to temp & sets it equal to the next Muppet in line.
                    currentMuppet = currentMuppet.getNext(); //changes currentMuppet value from it's previous value(temp) into new value.
                    currentMuppet.setNext(temp);//
                }
            }
            else{
                System.out.println("List is " + size + " Muppet needs to be on another spot!");
            }
        }

        return null;
    }

//    Muppet currentMuppet = start;
//    Muppet previousMuppet = start;

    public  Muppet pop(int p){

          Muppet currentMuppet = start;
          Muppet previousMuppet = start;


            if (p < size + 1) { //Loop through each item in the list & checks if p is less than size + 1 (the maximum number of items)
                size--; // Size decrease by 1 (If there is any item left)
                while ((currentMuppet.getNext() != null) && (p != 1)) {
                    //currentMuppet becomes previousMuppet until p equals 1
                    previousMuppet = currentMuppet;
                    currentMuppet = currentMuppet.getNext();
                    p--;//decreases with 1
                }
                //(All other elements have been processed)
                if (currentMuppet == start) {
                    start = currentMuppet.getNext();//Start becomes current's next element
                }
                //Either currenMuppet not equal to null or p equals to 1 (Meaning that there are still elements left on the list)
                else if (p == 1) { //NOTE!:(curentMuppet != null && p == 1)
                    previousMuppet.setNext(currentMuppet.getNext());//previousMuppet gets set as it's next element
                } else {
                    return null;
                }
                return currentMuppet;//Why return curretnMuppet?
            }
            return null;
    }

    public Muppet pop(String s) {

            Muppet currentMuppet = start;
            Muppet previousMuppet = start; //Store the last Muppet that was checked (before loop)
        if (s != null) {
            if (size != 1) {
                return null;
            } else {
                size--;
                while ((currentMuppet.getNext() != null) && (currentMuppet.getName() != s)) {
                    previousMuppet = currentMuppet; //Store the last Muppet that was checked (before loop)
                    currentMuppet = currentMuppet.getNext(); //Store the next Muppet in line after checking if there are any more left in the list or not
                }
            }
            if (currentMuppet == start) {
                start = currentMuppet.getNext();
            }
            //if
            else if (currentMuppet.getName() == s) {
                previousMuppet.setNext(currentMuppet.getNext());
            } else {
                return null;
            }
            return currentMuppet;
        }
        return null;
    }

    public Muppet peek (String s){

         Muppet currentMuppet = start;
         if(s != null){
             return null;
         }else{
             while (currentMuppet.getNext() != null && currentMuppet.getName() != s) {
                 currentMuppet = currentMuppet.getNext();
             }
             if (currentMuppet.getName() == s) {
                 return currentMuppet;
             } else {
                 System.out.println("Please check. \nMuppet name does not exist in the Muppet list.");
                 return null;
             }
         }
        }

        public Muppet peek ( int n){

                /*Takes an integer argument of how many items you want in your list
                 * It then goes through each item iteration until n becomes 0 & returning current as its value
                 * Code is used to iterate through a list of Muppets*/
                Muppet currentMuppet = start;

                //Check if list is less than size
                if (n > size) {
                    System.out.println("List is: " + size);
                }
                //Check if list is less than 1
                else if (n < 1) {
                    System.out.println("List starts with 1.");
                } else {
                    n--;//increment n until n equals 0
                    while (n == 1) {
                        currentMuppet = currentMuppet.getNext();
                        n--;
                    }
                    return null;
                }
                return currentMuppet; //return currentMuppet as it value
            }


            public int getSize () {
                return size;
            }

            void print () {
                Muppet currentMuppet = start;
                //Check if currentMuppet is null, if null ("List is empty")
                if (currentMuppet == null) {
                    System.out.println("List is Empty");
                }
//        else{
//            //While currentMuppet is not null print currentMuppet. currentMuppet become currentMuppet.getNext()
//            while(currentMuppet != null){
//                currentMuppet.print();
//                currentMuppet = currentMuppet.getNext();
//            }
                else {
                    for (int i = 0; i < size; i++) {
                        currentMuppet.print();
                        currentMuppet = currentMuppet.getNext();
                    }
                }
                System.out.println("Size: " + size + " Muppets");
                System.out.println();
            }

        }


