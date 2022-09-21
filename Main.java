import java.util.HashSet;
import java.util.Iterator;

class Main {
  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    // insert
    set.add(1);
    set.add(2);
    set.add(3);

    // to print set
    System.out.println(set);
    
    // search
      System.out.println(set.contains(2));
    
    // another way
    if(set.contains(2)){
      System.out.println("set contains 2");
    }

    // delete
    set.remove(2);

    
    set.contains(2);
    // another way to print
    if(!set.contains(2)){
      System.out.println("Does not contain 2");
    }

    // to print set size
    int n= set.size();
    System.out.println(n);

    // this is how we can iterate over sets
    Iterator it=set.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }

    // updated this for git check
  }
}