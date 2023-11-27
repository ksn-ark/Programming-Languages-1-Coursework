public class Main {
    public static void main(String[] args) {

        System.out.println(StringHelper.equals("aabc", "abc") == true);
        System.out.println(StringHelper.equals("abcd", "abc") == false);
        System.out.println(StringHelper.equals("xabc", "abc") == false);
        System.out.println(StringHelper.equals("abc", "xabc") == false);

    }
}

class StringHelper {
    public static boolean equals(String a, String b) {
        if(a.length()!=b.length()){
            return false;
        }
        for(int i=0;i<a.length();i++) {
            if(a.charAt(i)!=b.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}