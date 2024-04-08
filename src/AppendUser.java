import java.util.Scanner;
import java.util.zip.DataFormatException;

public  class AppendUser {
    static UserHandling uh=new UserHandling();
    static String[] userAppendInfo;


    public  User appendUserInfo(String userInfo) throws DataFormatException {
        userAppendInfo = userInfo.split("\\s+");
        if (userAppendInfo.length != 6)
            throw new DataFormatException("not enough arguments");
        String lastname = uh.handleFIO(userAppendInfo[0]);
        String firstname = uh.handleFIO(userAppendInfo[1]);
        String surname = uh.handleFIO(userAppendInfo[2]);
        String birthdate = uh.handleBirthdate(userAppendInfo[3]);
        String phoneNum = uh.handlePhoneNum(userAppendInfo[4]);
        String gender = uh.handleGender(userAppendInfo[5]);
        return new User(lastname, firstname, surname, birthdate, phoneNum, gender);

    }

    public User inputUserInfo() throws DataFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи ФИО, дата рождения(01.01.1900), номер телефона(7 цифр), пол(m или f)");
        String inputData = scanner.nextLine();
        return appendUserInfo(inputData);

    }


}
