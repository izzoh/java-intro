public class Student {

    private int studentId;
    private String studentName;
    private boolean registered = false;

    public Student(int studentId,String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void register(boolean feePaid){

        if(feePaid){
            registered = true;
        }else {
            registered = false;
        }
    }

    public boolean isRegistered(){
        return registered;
    }
}
