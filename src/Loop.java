public class Loop {
    public void printStringArray(){
        //Write code to move through array and print all elements of array using for loop
        String [] subjects= {"math","computer science","history","geography"};
        for(int i=0; i<subjects.length; i++) {
            System.out.println(subjects[i]);
        }
    }

    public void printIntegerArray(){
        //Write code to move through array and print all elements of array using for loop
        int [] numbers= {7, 8, 3, 4, 5, 6};
        for(int i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

    public void printCharArray(){
        //Write code to move through array and print all elements of array using for loop
        char [] alphabets= {'a','b','c','d','e'};
        for(int i=0; i< alphabets.length; i++) {
            System.out.println(alphabets[i]);
        }

    }

    public void printStringArray2(){
        //Write code to move through array and print all elements of array using foreach loop
        String [] subjects= {"math","computer science","history","geograpghy"};
        for(String each : subjects) {
            System.out.println(each);
        }
    }

    public void printIntegarArray2(){
        //Write code to move through array and print all elements of array using foreach loop
        int [] numbers= {3,7,9,4,2};
        for(int each : numbers) {
            System.out.println(each);
        }

    }

    public void printCharArray2(){
        //Write code to move through array and print all elements of array using foreach loop
        char [] alphabets= {'a','c','e'};
        for(char each: alphabets) {
            System.out.println(each);
        }

    }





    public static void main(String [] args){
        Loop practice = new Loop();
        System.out.println("Printing String array using for loop");
        practice.printStringArray();
        System.out.println("Printing int array using for loop");
        practice.printIntegerArray();
        System.out.println("Printing char array using for loop");
        practice.printCharArray();
        System.out.println("Printing String array using foreach loop");
        practice.printStringArray2();
        System.out.println("Printing int array using foreach loop");// write similar message for all methods calling them
        practice.printIntegarArray2();
        System.out.println("Printing char array using foreach loop");
        practice.printCharArray2();
        // write similar message for all methods calling them

        // call all above methods here one by one
    }
}


