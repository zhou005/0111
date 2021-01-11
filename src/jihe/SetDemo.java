package jihe;

import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(1);
        set.add("周");
        for ( int i=0 ; i<set.size() ; i++){
            System.out.println(set.get(1));
        }
    }
}
