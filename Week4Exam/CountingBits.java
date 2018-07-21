import java.util.*;
class Counting1Bits {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(countOnes(15)));
	}

	public static int[] countOnes(int n){
		int ones[] = new int[n+1];
		for (int i=0;i<=n;i++ ) {
			ones[i]=count(i);
		}
		return ones;
	}
	public static int count(int n){ 
		ArrayList<Integer> al = new ArrayList<>();
		int count=0;
		while(n>0){
			al.add(n%2);
			n=n/2;
		}
		//System.out.println(al);
		for (int i=0;i<al.size();i++ ) {
			if (al.get(i)!=0) {
				count++;
			}
		}
		return count;
	}
}
