public class perfect_no {
    public static void main(String[] args) {
        int n=6,sum=0;
        for(int i=1;i<n-1;i++){
            if(n%i==0) sum+=i;
        }
        if(sum==n) System.out.println("Perfect");
    }
}
