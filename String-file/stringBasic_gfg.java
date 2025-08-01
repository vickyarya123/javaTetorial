
import java.util.Arrays;

public class stringBasic_gfg {

    public static void searchCharacter() {
        String s = "geeksforgeeks";
        char ch = 'k';
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ch) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("no");

        // by using of inbuilt function
        // int idx=s.indexOf(ch);
        // System.out.println(idx);
    }

    public static void insertCharacterAtPosition() {
        StringBuilder s = new StringBuilder("GeeksforGeeks");
        char ch = 'A';
        int pos = 27;
        int n = s.length();
        StringBuilder new_s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i == pos) {
                new_s.append(ch);

            }
            new_s.append(s.charAt(i));
        }
        if (pos >= n) {
            new_s.append(ch);
        }
        System.out.println(new_s.toString());

        // by using in built method
        // s.insert(pos, ch);
        // s.toString();
        // System.out.println(s);
    }

    public static void insertMultiplePositions() {
        String s = "geeksforgeeks";
        int stars[] = { 1, 5, 7, 9 };
        String ans = "";
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < stars.length && i == stars[j]) {
                ans = ans + "*";
                j++;
            }
            ans = ans + s.charAt(i);
        }
        System.out.println(ans);

    }

    public static void removeCharacterAtPosition() {
        String s = "abcde";
        StringBuilder new_s = new StringBuilder(s);
        // int n=new_s.length();
        char ch = 'c';
        for (int i = 0; i < new_s.length(); i++) {
            if (new_s.charAt(i) == ch) {
                new_s.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(new_s.toString());
        // by using of inbuilt method;
        // System.out.println(s.deleteCharAt(1));
    }

    public static void removeAllOccurences() {
        String s = "geeksforgeeks";
        StringBuilder new_s = new StringBuilder(s);
        char ch = 'e';
        // for (int i = 0; i < new_s.length(); i++) {
        // if (new_s.charAt(i) == ch) {
        // new_s.deleteCharAt(i);
        // i--;
        // }
        // }
        // System.out.println(new_s);

        // BY USING INBUILT METHOD
        s = s.replace(String.valueOf(ch), "");
        System.out.println(s);
    }

    public static void ConcatenationTwoStrings() {
        String s1 = "vikcy";
        String s2 = "arya";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            result.append(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            result.append(s2.charAt(i));
        }

        // SORT METHOD , BUT THIS METHOD IS USE EVERY WHERE;
        // String res=s1+s2;
        System.out.println(result);
    }

    public static void reverseString() {
        StringBuilder s = new StringBuilder("vicky kumar");
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            char temp = s.charAt(left);
            s.setCharAt(left, s.charAt(right));
            s.setCharAt(right, temp);
            left++;
            right--;
        }
        System.out.println(s.toString());
        // System.out.println(s.reverse());
    }

    public static void generateAllSubstrings() {
        String s = "abcd";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }

    public static void checkBinaryString() {
        String s = "011010110110";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0' && s.charAt(i) != '1') {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }

    public static void CamelCase() {
        String s = "i got intern at geeksforgeeks";
        StringBuilder res = new StringBuilder();
        boolean capitalizeNext = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                capitalizeNext = true;
            } else if (capitalizeNext == true) {
                res.append(Character.toUpperCase(s.charAt(i)));
                capitalizeNext = false;
            } else {
                res.append(s.charAt(i));
            }
        }
        System.out.println(res.toString());
    }

    public static void countSubString1_1() {
        String s = "00100101";
        char res[] = s.toCharArray();
        int n = res.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (res[i] == '1') {
                for (int j = i + 1; j < n; j++) {
                    if (res[j] == '1') {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static void CheckPangram() {
        String s = "The quick brown fox jumps over the lazy dog";
        for (char ch = 'a'; ch <= 'z'; ch++) {
            boolean found = false;
            for (int i = 0; i < s.length(); i++) {
                if (ch == Character.toLowerCase(s.charAt(i))) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }

    public static void checkpalindrome() {
        String s = "rangolilOGNAR";
        char[] rs = s.toCharArray();
        int end = s.length() - 1;
        int start = 0;
        while (start <= end) {
            if (Character.toLowerCase(rs[start]) != Character.toLowerCase(rs[end])) {
                System.out.println("false");
                return;
            }
            start++;
            end--;

        }
        System.out.println("true");

        // StringBuilder rs=new StringBuilder();
        // for(int i=0;i<s.length();i++){
        // // rs.charAt(i)=s.charAt(s.length()-1-i);
        // rs.append(s.charAt(s.length()-1-i));
        // }
        // if(s.equals(rs)){
        // System.out.println("true");
        // }else{
        // System.out.println("false");
        // }
    }

    public static void checkStringIsSubstring() {
        String txt = "geeksforgeeks";
        String pat = "for";
        int n = txt.length();
        int m = pat.length();
        // for (int i = 0; i <= n - m; i++) {
        // int j;
        // for (j = 0; j < m; j++) {
        // if (txt.charAt(i + j) != pat.charAt(j)) {
        // break;
        // }
        // }
        // if (j == m) {
        // System.out.println(i);
        // return;
        // }
        // }
        // System.out.println("no");

        // BY USING OF INBUILT FUNCTION;
        int idx = txt.indexOf(pat);
        if (idx != -1) {
            System.out.println(idx);
        } else {
            System.out.println("no");
        }

    }

    public static void checkAnagrams() {
        String s1 = "geeks";
        String s2 = "keges";
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        if (Arrays.equals(s1Array, s2Array)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void checkforSubsequence() {
        String s1 = "axy";
        String s2 = "abxhym";
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == n1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static boolean subSequenceRecursion(String s1, String s2, int n1, int n2) {
        if (n1 == 0) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        if (s1.charAt(n1 - 1) == s2.charAt(n2 - 1)) {
            return subSequenceRecursion(s1, s2, n1 - 1, n2 - 1);
        }
        return subSequenceRecursion(s1, s2, n1, n2 - 1);
    }

    public static void SubsequenceByRecursion() {
        String s1 = "axy";
        String s2 = "pamxtky";
        int n1 = s1.length();
        int n2 = s2.length();
        boolean res = subSequenceRecursion(s1, s2, n1, n2);
        if (res) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void check_K_AnagramsOrNot() {
        String s1 = "anagram";
        String s2 = "grammar";
        int k = 3;
        int n1 = s1.length();
        if (s2.length() != n1) {
            System.out.println("false");
            return;
        }
        int MAX_CHAR = 0;
        int[] s1A = new int[MAX_CHAR];
        for (int i = 0; i < n1; i++) {
            s1A[s1.charAt(i) - 'a']++;
        }
        int count = 0;
        for (int i = 0; i < n1; i++) {
            if (s1A[s2.charAt(i) - 'a'] > 0)
                s1A[s2.charAt(i) - 'a']--;
            else
                count++;
            if (count > k)
                System.out.println("false");
        }
        System.out.println("true");
    }

    public static void duplicateCharacters() {
        String s = "geeksforgeeks";
        char[] ch = s.toCharArray();
        int n = ch.length;
        Arrays.sort(ch);
        String sortS = new String(ch);

        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && sortS.charAt(i) == sortS.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count == 1) {
                System.out.println(sortS.charAt(i) + " count = " + count);
            }
        }
    }

    public static void checkForRotationOfEachOther() {
        String s1 = "abcd";
        String s2 = "cdab";
        int n = s1.length();
        // int n2=s2.length();
        for (int i = 0; i < n; i++) {
            if (s1.equals(s2)) {
                System.out.println("true");
                return;
            }
            char last = s1.charAt(s1.length() - 1);
            s1 = last + s1.substring(0, s1.length() - 1);
        }
        System.out.println("false");
    }

    public static void frequenciesInAlphabeticalOrder() {
        String s1 = "geeksforgeeks";
        int n = s1.length();
        char[] sA = s1.toCharArray();
        Arrays.sort(sA);

        s1 = new String(sA);
        StringBuilder s3 = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && s1.charAt(i) == s1.charAt(i + 1)) {
                count++;
                i++;
            }
            // s3 = s3 + s2.charAt(i) + count;
            s3.append(s1.charAt(i)).append(count);

        }
        System.out.println(s3);
    }

    public static void sortingString() {
        String s = "geeksforgeeks";
        char[] s1 = s.toCharArray();

        final int MAX_Char = 26;
        int[] charcount = new int[MAX_Char];

        char c;
        for (int i = 0; i < s1.length; i++) {
            for (int j = i + 1; j < s1.length; j++) {
                if (s1[i] > s1[j]) {
                    c = s1[i];
                    s1[i] = s1[j];
                    s1[j] = c;
                }
            }
        }
        // char[] s1=s.toCharArray();
        // Arrays.sort(s1);
        s = new String(s1);
        System.out.println(s);
    }

    public static void smallestWordInAString() {
        String s = "this is test string";
        String[] words = s.split(" ");
        String smallestword = words[0];
        for (String word : words) {
            if (word.length() < smallestword.length()) {
                smallestword = word;
            }
        }
        System.out.println("smallest word : " + smallestword);
    }

    public static void largestWordInAString() {
        String s = "this is test string in geeksforgeeks";
        String[] words = s.split(" ");
        String largestword = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > largestword.length()) {
                largestword = words[i];
            }
        }
        System.out.println("largest word is : " + largestword);
    }

    
    public static void main(String[] args) {

        // searchCharacter();
        // insertCharacterAtPosition();
        // insertMultiplePositions();
        // removeCharacterAtPosition();
        // removeAllOccurences();
        // ConcatenationTwoStrings();
        // reverseString();
        // generateAllSubstrings();
        // checkBinaryString();
        // CamelCase();
        // countSubString1_1();
        // CheckPangram();
        // checkpalindrome();
        // checkStringIsSubstring();
        // checkAnagrams();
        // checkforSubsequence();
        // SubsequenceByRecursion();
        // check_K_AnagramsOrNot();// pending
        // duplicateCharacters();
        // checkForRotationOfEachOther();
        // frequenciesInAlphabeticalOrder();
        // sortingString();
        // smallestWordInAString();
        largestWordInAString();

    }
}
