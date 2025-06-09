package ch05.sec05.method;

public class CharAtMethod {
    public static void main(String[] args) {
        String gender = checkGender("900212-1998756"); // "남자" 리턴
        String gender2 = checkGender("900212-2998756"); // "여자" 리턴

        // 8번째 문자가 '1', '3' > 남자 리턴
        // 8번째 문자가 '2', '4' > 여자 리턴
        // 8번째 문자가 '1' ~ '4' 가 아니면 null 리턴

        System.out.println("gender1: " + gender);
        System.out.println("gender2: " + gender2);
        System.out.println("gender3: " + checkGender("900212-3998756"));
        System.out.println("gender4: " + checkGender("900212-4998756"));
        System.out.println("gender5: " + checkGender("900212-6998756"));
    }

    public static String checkGender(String ssn) {
        String gender = null;

        switch (ssn.charAt(7)) {
            case '1', '3' -> gender = "남자";
            case '2', '4' -> gender = "여자";
        }

        return gender;
    }
}
