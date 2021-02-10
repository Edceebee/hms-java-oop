package registration;

public class Registration {
    private String userId;
    private String firstName;
    private String lastName;
    private Date regDate;
    private Date birthDate;

    public Registration(){}

    public Registration(String userId, String firstName, String lastName, Date regDate, Date birthDate) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.regDate = regDate;
        this.birthDate = birthDate;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }

    public String getUserId() {
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
}
