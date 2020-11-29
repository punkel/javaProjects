public class palindrom {

	// in: string
	// func: check if word is palindrom
	// out: boolean

	static boolean isPalindrom(String word){
	    boolean ret = true; // return value
	    if(word.length() < 1){
	        System.out.println("no string incoming");
	        return false;
	    }

	    int i = 0;
	    int j = word.length();
	    j--;
	    while(i<=j && ret){

	        //check char
	        int first = word.charAt(i);
	        int last = word.charAt(j);
	        // space = 32, A=65, Z=90, a=97, z=122
	        // check char is space or a letter

	        if( (first > 64 && first < 91) ||
	            (first > 96 && first < 123) ||
	            first == 32
	          ){
	              if( (last > 64 && last < 91) ||
	                  (last > 96 && last < 123) ||
	                  last == 32
	                ){
	                    // check chars are same
	                    if(first == last){
	                        // same char
	                    } else if( first > 96 &&
	                               (first-32) == last
	                             ){
	                         // first char is small letter
	                    } else if( last > 96 &&
	                               first == (last-32)
	                             ){
	                         // last char is small letter
	                     } else {
	                         ret = false;
	                     }
	                } else {
	                    ret = false;
	                }
	          } else {
	            ret = false;
	          }

	        i++;
	        j--;
	    }

	    return ret;
	}

	public static void testPalledromFunction() {
	    boolean[] results  = { false,  true, true        , true      , false,           false,                        true,  false, false};
	    String[] testWords = {"hello", "  ", "Lagerregal", "RentNer" , "world is good", "i don't have java experice", "OtTo", "",   "§§"};

	    boolean check = true;

	    for(int i=0; i<results.length; i++){
	    	System.out.println("Erwartet " + results[i] + " bekommen " + isPalindrom(testWords[i]));
	        if(results[i] == isPalindrom(testWords[i])){
	            // seems ok
	            continue;
	        } else {
	            check=false;
	            break;
	        }
	    }

	    System.out.println("Function is " + (check? "ok": "is wrong"));

	}

	public static void main(String[] args) {
		testPalledromFunction();

	}

}
