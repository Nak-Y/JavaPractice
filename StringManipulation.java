public class StringManipulation {
    public static void main(String[] args) {
        String originalString = "Hello, Java!";
        System.out.println("Original String: " + originalString);

        //文字列の長さを取得する
        int length = originalString.length();
        System.out.println("Length: " + length);

        //大文字に変換する
        String upperCaseString = originalString.toUpperCase();
        System.out.println("UpperCase: " + upperCaseString);

        //文字列の一部を取得する
        String substring = originalString.substring(7, 11);//文字列を取得なので空白と記号は無視？
        System.out.println("Substring: " + substring);
    }
}
