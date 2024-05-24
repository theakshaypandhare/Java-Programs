package ImportantPrograms;

public class DuplicateCharInString {
public static void main(String[] args) 
{
	String str="Akshay Popat Pandhare";
	char [] charArr=str.toLowerCase().toCharArray();
	for (int i = 0; i < charArr.length; i++) {
		int count=1;
		for (int j = i+1; j < charArr.length; j++) {
	
			if (charArr[i]==charArr[j]&&charArr[i]!=' ') {
				count++;
				charArr[j]='0';
			}
		}
		if (count>1 &&charArr[i]!='0') {
			System.out.println(charArr[i] +" "+count);
		}
		
}
	for (char c : charArr) 
	{
		System.out.print(c);
	}
	}
}
