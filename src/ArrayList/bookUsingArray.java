package ArrayList;

import java.util.ArrayList;

public class bookUsingArray {
	int id;
	String queDis;
	int AccYEar;
	String concept;

	public bookUsingArray(int id, String queDis, int accYEar, String concept) {
		super();
		this.id = id;
		this.queDis = queDis;
		AccYEar = accYEar;
		this.concept = concept;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getQueDis() {
		return queDis;
	}


	public void setQueDis(String queDis) {
		this.queDis = queDis;
	}


	public int getAccYEar() {
		return AccYEar;
	}


	public void setAccYEar(int accYEar) {
		AccYEar = accYEar;
	}


	public String getConcept() {
		return concept;
	}


	public void setConcept(String concept) {
		this.concept = concept;
	}

	
	public static void main(String[] args) {
		ArrayList<bookUsingArray> qp=new ArrayList<bookUsingArray>();
		qp.add(new bookUsingArray(1, "oops", 2022, "string"));
		qp.add(new bookUsingArray(1, "oops", 2022, "string"));
		qp.add(new bookUsingArray(1, "oops", 202, "string"));
		for (bookUsingArray b : qp) {
			if(b.getAccYEar()==2022)
			System.out.println(b.getAccYEar());
		}
	}
}
