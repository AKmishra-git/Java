import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        
        int[] marks = null;
        marks = new int[5];
        marks[0]=85;
        marks[1]=95;
        marks[2]=65;
        marks[3]=56;
        marks[4]=88;

        for(int i=0;i<5;i++){
            System.out.println(marks[i]);

        }

        //enhanced for loop

        for(int val:marks){
            System.out.println(val);
        }



    }
    
}
