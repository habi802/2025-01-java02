package ch13.sec01;

public class BoxObjExample {
    public static void main(String[] args) {
        BoxObj obj = new BoxObj();
        obj.setObj(10);
        int result = (int) obj.getObj();
        System.out.println("result = " + result);

        obj.setObj("문자열");
        String strValue = (String) obj.getObj();
        System.out.println("strValue = " + strValue);

        int intValue = (int) obj.getObj(); // Error
        System.out.println("intValue = " + intValue);

        obj.setObj(true);
        boolean bool = (boolean) obj.getObj();
    }
}
