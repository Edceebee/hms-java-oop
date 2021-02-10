package registration;

import java.time.LocalTime;


// change te class to abstract later
public class Registration {


    private int userId;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String email;


    public Registration(){}

    public Registration(int userId, String firstName, String lastName, Date birthDate, String email) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;

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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
