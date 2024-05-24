public class PositiveEven_OR_NegativeEven_OR_PositiveOdd_OR_NegativeOdd_usingConditionalOp {
	//********************************DONE**********************************
	public static void main(String[] args) {
		int a=11;
		String res=a>0?(a%2==0?"positive even":"positve odd"):(a%2!=0?"negative even":"negatve odd");
		System.out.println(res);
	}

}
