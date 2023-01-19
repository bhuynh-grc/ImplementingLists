import edu.greenriver.sdev333.*;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        List<String> friends = new ArrayList<String>();
        System.out.println("initial size is " + friends.size());

        friends.add("Jess");
        friends.add("Tina");
        friends.add("Josh");
        friends.add("Susan");
        friends.add("Tyler");
        friends.add("Usman");
        friends.add("Dee");
        friends.add("Rose");
        friends.add("Blanche");
        friends.add("Dorothy");
        friends.add("Susan");
        friends.add("Sophia");
        friends.add(2, "Wednesday");
        System.out.println("size is now " + friends.size());

        System.out.println("The last index of Sussan " + friends.lastIndexOf("Susan"));

//        for (int i = 0; i < friends.size(); i++){
//            System.out.println(friends.get(i));
//        }

        Iterator<String> itr = friends.iterator();
        while (itr.hasNext()){
            String name = itr.next();
            System.out.println(name);
        }



        for(String name : friends){
            System.out.println(name);
        }

    }
}