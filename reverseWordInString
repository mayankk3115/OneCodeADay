public class reverseWordInString {

    public static void main(String[] args) {
        String str = "my name is Mayank";
        String result = reverseWordInString(str);
        System.out.println(result);
    }

    public static String reverseWordInString(String str) {
        String result = "";
        String[] s = str.split(" ");
        for(int i=s.length-1;i>=0;i--){
            result = result.concat(s[i] + " ");
        }
        return result;
    }
}
