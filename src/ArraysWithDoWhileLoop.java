public class ArraysWithDoWhileLoop extends WhileAndDoWhile {
    static String[] subjects = {"math", "computer science", "history", "geography"};
    int[] numbers = {7, 8, 3, 4, 5, 6};
    char[] alphabets = {'a', 'b', 'c', 'd', 'e'};

    @Override
    public void printStringArray() {
        int i = 0;
        do {
            System.out.println(subjects[i]);
            i++;
        }
        while (i < subjects.length);
    }


    @Override
    public void printIntegerArray() {
        int i = 0;
        do {
            System.out.println(numbers[i]);
            i++;
        }
        while (i < numbers.length);
    }


    @Override
    public void printCharArray() {
        int i = 0;
        do {
            System.out.println(alphabets[i]);
            i++;
        }
        while (i < alphabets.length);
    }

    @Override
    public void searchStringArray(String word) {
        int i = 0;
        while (i <= 0) ;
        do {
            if (subjects[i] == word) {
                System.out.println("Here I am you found me, I am at " + i + "th Index.");
            } else {
                System.out.println("you entered wrong input");
            }
            i++;
        }
        while (i < subjects.length);
    }

    @Override
    public void searchIntegerArray(int number) {
        int i = 0;
        do {
            if (numbers[i] == number) {
                System.out.println("Here I am you found me, I am at " + i + "th Index.");
            } else {
                System.out.println("you entered wrong input");
            }
            i++;
        }
        while (i < numbers.length);
    }

    public void searchCharArray(char letter) {

        int i = 0;
        do {
            if (alphabets[i] == letter) {
                System.out.println("Here I am you found me, I am at " + i + "th Index.");
            } else {
                System.out.println("you entered wrong input");
            }
            i++;
        }
        while (i < alphabets.length);
    }


        public void printVowels (String[] vowelArray){
                int i=0;
                do {
                    System.out.println(vowelArray[i]);
                    i++;
                }
                while(i< vowelArray.length);
            //write code here to print vowel array using While loop

        }





    public static void main(String[] args){
        String[] vowels = {"a","e","i","o","u"};

        ArraysWithDoWhileLoop bunchOfArrays = new ArraysWithDoWhileLoop();

        bunchOfArrays.printVowels(vowels );
        bunchOfArrays.printStringArray();
        bunchOfArrays.printIntegerArray();
        bunchOfArrays.printCharArray();
        bunchOfArrays.searchStringArray("math");
        bunchOfArrays.searchIntegerArray(7);
        bunchOfArrays.searchCharArray('a');

    }
}