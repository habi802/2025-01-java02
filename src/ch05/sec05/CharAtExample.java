package ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "950624-1230123";
        char gender = ssn.charAt(7);
        System.out.println("gender: " + gender);

        if (gender == '1' || gender == '3') {
            System.out.println("이 사람은 남자입니다.");
        } else if (gender == '2' || gender == '4') {
            System.out.println("이 사람은 여자입니다.");
        }

        int intGender = Character.getNumericValue(gender);
        System.out.println(intGender);
    }
}
