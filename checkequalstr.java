public class checkequalstr {
    public static int checkstr(String s1, String s2) {
        if (s1.length() == s2.length()) {
            System.out.println("equal in length.");
            return 1;
        } else
            System.out.println("not equal in length");
        return 0;
    }

    public static void main(String[] args) {
        String s1 = "glasses";
        String s2 = "Plate";
        String s3 = "Plate";
        System.out.println("checking str1 and str2: They are ");
        checkstr(s1, s2);
        System.out.println("checking str2 and str3: They are ");
        checkstr(s2, s3);
    }
}