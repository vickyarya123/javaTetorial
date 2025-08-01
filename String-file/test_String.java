public class test_String {
    public static void main(String[] args) {
        String minw = "";
        // String maxw="";
        String input = "this is the geeksforgeeks tutorial";
        input = input.trim();
        int len = input.length();
        int si = 0, ei = 0;
        int minl = len, minSi = 0;
        // int maxl=0 ,maxSi=0;
        while (ei <= len) {
            if (ei < len && input.charAt(ei) != ' ') {
                ei++;
            }
        }

    }
}
