public class Assignment {

    /*
    * We will leverage the Person class we created for this assignment
    * Given two arrays: one containing ages, one containing names
    * Create objects of type person and output the year they were born
    *
    * If they were born before 1990 print "Baby boomer" other wise print "Millennial"
    * */


    public static void main(String[] args){

        String [] names = {"Abby","Beth","Charles","Daniel","Eve","Emma","Francis","Fred"}; // Do not modify
        int [] ages = {23,30,23,34,21,29,26,27}; // Do not modify


        for(int i=0;i<names.length;i++){ // to loop through an array we make sure we never get to it's length

            System.out.println(names[i]+" "+ages[i]); // To access an element in an array we set the index

        }

    }
}
