public class Registration {

    public static void main(String[] args) {

        // Create a new object of type bachelor
        Bachelors bachelorsStudent = new Bachelors(101, "John Doe");

        // Register the student
        bachelorsStudent.register(true);


        // Ensure the student is registered
        System.out.println("Registration status:" + bachelorsStudent.isRegistered());

        BuggyDoctorate doctorate = new BuggyDoctorate(102,"Jane Doe");
        doctorate.register(true);

        System.out.println("Student is registered:"+doctorate.isRegistered());


    }
}
