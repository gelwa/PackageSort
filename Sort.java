package Sort;
import com.mycompany._3.Person;

public class Sort {
    
    public void sorting(Person _A, Person _B, Person _C) {
        
        Person[] array = {_A, _B, _C};
        
        boolean sorted = false;
        Person temp;
      
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < (array.length)-1; i++) {
                if (array[i].getage() > array[i+1].getage()) {
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                sorted = false;
            }
        }
        }
        
        System.out.println("\n\n===SORTED BY AGE===");
        for(Person p:array) {
            p.print();  
        }
    }
}
    
