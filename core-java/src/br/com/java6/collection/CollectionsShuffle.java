package br.com.java6.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsShuffle {
	public static void main(String[] args) {
        User u1 = new User("Ramesh");
        User u2 = new User("Mahesh");
        User u3 = new User("Suresh");
        User u4 = new User("Nilesh");
        
        List<User> list = Arrays.asList(u1,u2,u3,u4);
        System.out.println("...before shuffle....");
        for(User u: list){
            System.out.print(u.getName()+" ");
        }
        
        System.out.println("\n...after shuffle....");
        Collections.shuffle(list);
        for(User u: list){
            System.out.print(u.getName()+" ");
        }
        
        System.out.println("\n...after re-shuffle....");
        Collections.shuffle(list);
        for(User u: list){
            System.out.print(u.getName()+" ");
        }        
    }
}
