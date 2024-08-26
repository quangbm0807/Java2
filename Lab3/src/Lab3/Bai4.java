package Lab3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Bai4 {

    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>();

        Student sv1 = new Student();
        sv1.name = "Tuấn";
        sv1.major = "CNTT";
        sv1.marks = 7.0;
        map.put(sv1.name, sv1);

        Student sv2 = new Student();
        sv2.name = "Anh";
        sv2.major = "Finance";
        sv2.marks = 8.5;
        map.put(sv2.name, sv2);

        Student sv3 = new Student();
        sv3.name = "Hương";
        sv3.major = "Marketing";
        sv3.marks = 9.8;
        map.put(sv3.name, sv3);

        Set<String> keys = map.keySet();
        for (String name : keys) {          
            Student sv = map.get(name);
            System.out.println(">Họ và tên: " + sv.name);
            System.out.println(">Học lực: " + sv.getGrade());
            System.out.println("--------------------");
        }
    }
}
