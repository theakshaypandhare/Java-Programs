package Array;

import java.util.Iterator;

public class DuplicateChar {
	public static void main(String[] args) {
		String str="engineering"	;	
		char[] strarr=str.toCharArray();
				for (int i = 0; i < strarr.length; i++) {
					int count=1;
					for (int j =i+1; j < strarr.length; j++) {
						if (str.charAt(i)==str.charAt(j) && str.charAt(j)!=' ') 
						{
							count++;
							strarr[j]='0'; // for mark as traval
						}
					}
					if(count>1&& strarr[i]!='0')
					{
						System.out.println("count "+count);
						System.out.println(str.charAt(i));
					}
				}
				
		}
	}

