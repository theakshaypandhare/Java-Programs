package ImportantPrograms;
public class aaaaaaaaaaaaaaa {

    // Function to remove the duplicates

    static int removeDuplicates(int[] array){

        int replaceIndex = 0;

        int i,j;

        for(i=0; i<array.length; i++){

            for(j=i+1; j<array.length; j++){

                if(array[j]!=array[i]){

                    break;

                }

            }

            array[replaceIndex++] = array[i];

            i = j-1;

        }

        return replaceIndex;

    }
    public static void main(String[] args) {
    	int [] arr= {1,2,11,2,1,58,4,5,4,55,45};
		int index =removeDuplicates(arr);
		System.out.println(index);
	}
}