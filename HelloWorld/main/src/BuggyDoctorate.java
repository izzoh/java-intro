import java.util.Date;

public class BuggyDoctorate extends Student {

    private Date defenseDate;
    private String supervisor;
    private String room;

    public BuggyDoctorate(int studentId, String studentName) {
        super(studentId, studentName);
    }

    public void register(boolean feePaid) { // Method overriding
        supervisor = "Dr. Jane Doe";
    }

    public void setThesisDefense() {
        defenseDate = new Date();
    }

    public void setThesisDefense(Date defenseDate) { // Overloading the arguments
        this.defenseDate = defenseDate;
    }

    public Date setThesisDefense(Date defenseDate, String room) { // Overloading the arguments and the return type
        this.defenseDate = defenseDate;
        this.room = room;
        return defenseDate;
    }
}
