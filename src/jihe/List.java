package jihe;

import java.util.List;

public class List {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add("周");
        for ( int i=0 ; i<list.size() ; i++){
             System.out.println(list.get(1));
        }
    }
}