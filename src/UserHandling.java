import java.util.zip.DataFormatException;

public class UserHandling {



    public static String handleFIO(String str) throws DataFormatException {
        if(!str.matches("[a-zA-Z]+"))
            throw new DataFormatException("FIO is not correct");
        return str;
    }
    public String handleBirthdate(String birthDate) throws DataFormatException {
        if(!birthDate.matches("\\d{2}\\.\\d{2}\\.\\d{4}"))
            throw new DataFormatException("not correct birthdate");
        return birthDate;
    }
    public String handlePhoneNum(String phoneNum) throws DataFormatException {
        if(!phoneNum.matches("\\d{7}"))
            throw new DataFormatException("phone number is not correct");
        return phoneNum;
    }
    public String handleGender(String gender) throws DataFormatException {
        if(!gender.equals("m")&&!gender.equals("f"))
            throw new DataFormatException("gender is not correct");
        return gender;
    }

}
