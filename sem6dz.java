import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class sem6dz {   
        
        static Map<Integer, Integer> string = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2){
                return o2.compareTo(o1);
            }           
        } );
        static Set<Integer> stringD = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2){
                return o2.compareTo(o1);
            }
            
        });
        public static void main(String[] args) {
            formPut(9);
            formPut(96);
            formPut(23);
            formPut(67);
            formPut(11);
            char[] fort;
            System.out.println(string);
            formRut(5);
            formRut(55);
            formRut(34);
            formRut(9);
            formRut(56);
            char[] rutt;
            System.out.println(stringD);
        }
    static void formPut(int s){
        Map<Integer, Integer> fort;
        string.put(s,2);
    }
    static void formRut(int s){
        Set<Integer> rutt;
        stringD.add(s);
    }
    
}
