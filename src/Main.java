import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    int[] array = {2, 4, 3, 3, 3, 2, 3};

        int leader = solution(array);
        System.out.println("Leader is "+ leader);
    }

    public static int solution(int[] array){
        int candidate = 0;
        int consecutiveSize = 0;

        for(int item: array) {
            if(consecutiveSize == 0){
                candidate = item;
                consecutiveSize = 1;
            }else if(item == candidate){
                consecutiveSize++;
            }else{
                consecutiveSize--;
            }
        }

        int occurrence = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == candidate) {
                occurrence++;
                index = i;
            }
        }

        return occurrence > (array.length/2.0) ? index : -1;
    }
}
