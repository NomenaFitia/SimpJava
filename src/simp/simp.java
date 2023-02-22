package simp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class simp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		List<Integer> list = new ArrayList<Integer>();
		
		Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNum = random.nextInt(100);
            list.add(randomNum);
        }

        System.out.println(list);
        
        for (int n : list) {
            
        	if ((n % 3 == 0) && (n % 5 == 0) ) {
        		System.out.println(" FluzzGratz");
        	}
        	else if (n % 3 == 0) {
        		System.out.println(" Fluzz");
        	}
            else if (n % 5 == 0){
                System.out.println("Gratz");
            }
            else {
            	System.out.println(n);
            }
        }

	}

}
