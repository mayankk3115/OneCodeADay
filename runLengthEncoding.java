public class encodeString {

    public static void main(String[] args) {
        String val = "AAAAAAAAAAAAAAAAABBDCCE";
        String result = runLengthEncoding(val);
        System.out.println("Encoded Sting is :"+ result);
    }

    private static String runLengthEncoding(String val) {

        String result = "";

        char[] ch = val.toCharArray();

        int count = 1;
        int i=0;

        while(i<ch.length) {
                while(i+1 < ch.length && ch[i]==ch[i+1]){
                    count++;
                    i++;
                    if(count == 9){
                        break;
                    }
                }
                 result= result.concat(String.valueOf(count)+ch[i]);
                 count = 1;
                 i++;
        }
        System.out.println(result);
        return result;
    }
}
