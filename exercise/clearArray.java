import java.util.ArrayList;

public class clearArray {

	// in: array
	// return: array whitout doubles
	static int[] distinct(int[] inArray){
	    // checkt if incomming array has one or more numbers
	    if(inArray.length < 1){
	        System.out.println("Array has no numbers");
	        int[] ret = new int [1];
	        ret[0] = 0;
	        return ret;
	    }

	    // creat an list to save numbers temporary
	    ArrayList<Integer> tmpArray = new ArrayList<Integer>();
	    for(int i=0;i<inArray.length;i++){
	        if(tmpArray.contains(inArray[i])){
	            continue;
	        } else {
	            tmpArray.add(inArray[i]);
	        }
	    }

	    // creat return Array
	    int[] retArray = new int [tmpArray.size()];
	    for(int j=0; j<tmpArray.size();j++){
	        retArray[j] = tmpArray.get(j);
	    }

	    return retArray;
	}

	public static void main(String[] args) {
		int[] out = distinct(new int[] {7, 1, 3, 5, 3, 9, 3, 1, 1, 5});
		for(int asdf : out) {
			System.out.println(asdf);
		}
	}

}
