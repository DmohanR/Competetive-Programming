import java.util.*;
class HammingDistance{
	
	private String convToBinary(int n)
	{
		StringBuilder sb = new StringBuilder();
		while(n>0){
			sb.append(n%2);
			n = n/2;
		}
		sb=sb.reverse();
		return sb.toString();
	}

	private int dist(String x, String y){
		String s="";
		if (x.length()<y.length()) {
			int d = y.length() - x.length();
			for (int i=0;i<d ;i++ ) {
				s=s+"0";
			}
			s=s+x;
			return cal(s,y);
		}
		else if (y.length()<x.length()) {
			int d= x.length()-y.length();
			for (int i=0;i<d ;i++ ) {
				s=s+"0";
			}
			s=s+y;
			return cal(s,x);
		}
		else return cal(x,y);
	}

	private int cal(String x,String y){
		int count=0;
		//System.out.println(x+"-"+y);
		for (int i=0;i<x.length() ;i++ ) {
			if (x.charAt(i)!=y.charAt(i)) {
				count++;
			}
		}
		return count;
	}	

	public static void main(String[] args) {
		HammingDistance hd = new HammingDistance();
		String x = hd.convToBinary(25);
		String y = hd.convToBinary(30);
		//System.out.println(y+";"+x);
		System.out.println(hd.dist(x,y));
	}
}