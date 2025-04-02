import java.util.Arrays;

public class Rotating_Array {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int[] b=new int[nums.length];
        int k=5;
        k=k%nums.length;
        for(int i=0;i<nums.length;i++)
        b[i]=nums[(nums.length-k+i)%(nums.length)];
        System.out.println(Arrays.toString(b));
    }
}
