public class User {
    String lastname;
    String firstname;
    String surname;
    String birthdate;
    String phoneNum;
    String gender;

    public User(String lastname, String firstname, String surname, String birthdate, String phoneNum, String gender) {
        this.birthdate = birthdate;
        this.firstname = firstname;
        this.gender = gender;
        this.lastname = lastname;
        this.phoneNum = phoneNum;
        this.surname = surname;
    }

    public User() {

    }

    @Override
    public String toString() {
        return String.format("<%s> <%s> <%s> <%s> <%s> <%s>",lastname,firstname,surname,birthdate,phoneNum,gender);
    }

    public String getLastname() {
        return lastname;
    }
}
