
class Student {
    int rollno;
    String name;
    String city;

    Student(int rollno,String name, String city){
        this.rollno=rollno;
        this.name=name;
        this.city=city;
       }

    @Override
    public String toString() {
        return rollno + " " + name + " " +city;
    }
}

public class firstString {

    public static void StringCase(String str1, String str2) {
        System.out.println(str1.toUpperCase());
        str2 = str2.toLowerCase();
        System.out.println(str2);
    }

    public static void sizeOfString(String str1, String str2) {
        System.out.println(str1.length());
        System.out.println(str2.length());
    }

    public static void countvowel_concenent(String str1) {
        int v_count = 0;
        int c_count = 0;
        for (int i = 0; i < str1.length(); i++) {
            char str = str1.charAt(i);
            if (str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u')
                v_count++;
            else
                c_count++;
        }
        System.out.println(v_count);
        System.out.println(c_count);
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("vicky");
        str.append(1.2);
        String str1 = "amAnAryA";

        // String s=str.concat(str1);
        str.insert(1, "ji");
        str.replace(1, 2, "arya");
        str.delete(1, 6);
        // str.reverse();
        // System.out.println(str.capacity());
        // StringCase(str, str1);
        // sizeOfString(str, str1);
        // countvowel_concenent(str);
        // System.out.println(str);

        Student student=new Student(101, "vicky", "haridwar");
        System.out.println(student);

    }
}
