package Mini_Project;

import java.lang.reflect.Array;
import java.util.*;

public class UserManagementDemo {
    public static void main(String [] args){
        //Set<String> user1roles = new HashSet<>(Arrays.asList("Admin","User"));
        //Users user1 = new Users("Arshad",true, user1roles);
        List<Users> user = new ArrayList<>();
        user.add(new Users("Arshad",true,new HashSet<>(Arrays.asList("Admin","User"))));
        user.add(new Users("Sahil",false,new HashSet<>(Arrays.asList("Admin","User"))));
        user.add(new Users("Noman",true,new HashSet<>(Arrays.asList("Admin","User"))));
        user.add(new Users("Saad",false,new HashSet<>(Arrays.asList("Admin","User"))));

        //Remove Inactivr user
        Iterator<Users> iterator = user.iterator();
        while (iterator.hasNext()){
            if(!iterator.next().isActive())
                iterator.remove();
        }
        System.out.println("Active");
        for(Users users : user)
            System.out.println(users.getName());

        //count user
        Map<String , Integer> rolecount = new HashMap<>();
        for(Users users : user){
            for(String role : users.getRoles()){
                rolecount.put(role,rolecount.getOrDefault(role,0)+1);
            }
        }
        System.out.println("All User");
        for (Map.Entry<String,Integer> entry:rolecount.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
