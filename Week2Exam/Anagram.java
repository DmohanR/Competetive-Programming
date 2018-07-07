import java.util.*;
class Anagram {
	int a[],b[];
	boolean flag = false;
	public boolean anagram(String t,String s){
		a = new int[256];
		b = new int[256];
		for (int i=0;i<t.length() ;i++ ) {
			int ch = (int)t.charAt(i);
			if (ch>64 && ch<91) {
				a[ch+32]++;
			}
			else if (ch>96 && ch<123) {
				a[ch]++;
			}
		}
		for (int i=0;i<s.length() ;i++ ) {
			int ch = (int)s.charAt(i);
			if (ch>64 && ch<91) {
				b[ch+32]++;
			}
			else if (ch>96 && ch<123) {
				b[ch]++;
			}
		}
		return check(a,b);
	}

	public boolean check(int[] a,int[] b){
		
		for (int i=97;i<123 ;i++ ) {
			//if (a[i]!=0) {
				if (a[i]==b[i]) {
					flag =true;
				}
				else{
				 flag = false;
				 break;
				}
			// else flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println((int)'Z'+32);
		System.out.println("enter the first string");
		String a = sc.nextLine();
		System.out.println("enter the second string");
		String b = sc.nextLine();
		Anagram ag = new Anagram();
		System.out.println(ag.anagram(a,b));
		// System.out.println(ag.anagram("anagram", "nagaram"));
		// System.out.println(ag.anagram("Keep", "Peek"));
		// System.out.println(ag.anagram("Mother In Law", "Hitler Woman"));
		// System.out.println(ag.anagram("School Master", "The Classroom"));
		// System.out.println(ag.anagram("ASTRONOMERS", "NO MORE STARS"));
		// System.out.println(ag.anagram("Toss", "Shot"));
		// System.out.println(ag.anagram("joy", "enjoy"));
		// System.out.println(ag.anagram("Debit Card", "Bad Credit"));
		// System.out.println(ag.anagram("SiLeNt CAT", "LisTen AcT"));
		// System.out.println(ag.anagram("Dormitory", "Dirty Room"));
		
		// System.out.println(Arrays.toString(ag.a));
		// System.out.println(Arrays.toString(ag.b));
	}
}