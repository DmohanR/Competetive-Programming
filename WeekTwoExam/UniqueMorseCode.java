
import java.util.*;
class UniqueMorseCode{
	
    String chars[] ={".-","-...","-.-.","-..",".","..-.", "--.","....","..",".---", "-.-",".-..","--","-.", "---",".--.", "--.-",".-.","...","-","..-","...-",".--", "-..-","-.--", "--.." };

    public int transformation(String[] words){
    	String code[] = new String[words.length];
    	ArrayList<String> al = new ArrayList<>();
    	for (int i =0;i<words.length ;i++ ) {
    		StringBuilder sb = new StringBuilder();
    		for (int j=0;j<words[i].length() ;j++ ) {
    			 int c = (int)words[i].charAt(j)-97;
    			 sb.append(chars[c]);	
    		}
    		code[i]=sb.toString();
    		if (!al.contains(sb.toString())) {
    			al.add(sb.toString());
    		}
    		sb=null;
    	}
    	System.out.println(Arrays.toString(code));
    	System.out.println(al);
    	return al.size();
    }

	public static void main(String[] args) {
		UniqueMorseCode un = new UniqueMorseCode();
	    System.out.println(un.transformation(new String[]{"gin","zen","gig","msg"}));
	    System.out.println(un.transformation(new String[]{"a","z","g","m"}));
	    System.out.println(un.transformation(new String[]{"bhi","vsv","sgh","vbi"}));
	    System.out.println(un.transformation(new String[]{"a","b","c","d"}));
	    System.out.println(un.transformation(new String[]{"hig","sip","pot"}));
	}
}
