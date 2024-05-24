import java.util.Arrays;
import java.util.Iterator;
//1  3 4 5 7
public class sortSmall {
	static int sortarr(int A[]) {
		Arrays.sort(A);
		int xx = 1;
		System.out.println(A[0]);
		for (int i = 0; i <A.length-1; i++) {
			//System.out.println((A[i+1]-1));
			if (A[i]==1|| A[i]==(A[i+1]-2)) {
				xx=A[i]+1;
				break;
			}
		}
		System.out.println(xx);
		return -1;

	}
public static void main(String[] args) {
	int A[]= {3,4,6,4,2,1};
	System.out.println(sortarr(A));;
	
}
}
