import java.util.ArrayList;
import java.util.List;

public class nexientHackerRank {
	public static void main(String[] args) throws Exception {
//		List<Integer> arr = new ArrayList<Integer>();
//		arr.add(0);
//		arr.add(1);
//		arr.add(2);
//		arr.add(3);
//	
//		boolean containsInt = false;
//		int k = 2;
//		System.out.println(k);
//        for (int i = 0; i < arr.size(); ++i) {
//        	System.out.println(arr.get(i));
//        	if ((arr.get(i)) == k) {
//        		containsInt = true;
//        	}
//        }
//        
//        if (containsInt == true) {
//        	System.out.println("YES");
//        } else {
//        	System.out.println("NO");
//        }
		int l = 0;
		int r = 6;
		
		List<Integer> intList = new ArrayList<Integer>();
        for (int i = l; i < r; ++i) {
        	
            if (!(i % 2 == 0)) {
            	intList.add(i);
            } 
            }
        System.out.println(intList);
        }
	
	}


