package registration;

import java.time.LocalTime;


// change te class to abstract later
public class Registration {


    private int userId;
    private String firstName;
    private String lastName;
    private Date regDate;
    private Date birthDate;
    private LocalTime regTime;

    public Registration(){}

    public Registration(int userId, String firstName, String lastName, Date regDate, Date birthDate, LocalTime regTime) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.regDate = regDate;
        this.birthDate = birthDate;
        this.regTime = regTime;
    }

    public void setUserId(int userId){
        this.userId = userId++;
    }

    public int getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public Date BirthDate(Date birthDate) {
//        this.birthDate = birthDate;
//        return birthDate;
//    }

//    public Date RegDate(Date regDate) {
//        this.regDate = regDate;
//        return regDate;
//    }
}
