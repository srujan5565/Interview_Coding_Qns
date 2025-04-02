public class armstrong {
    public static void main(String[] args) {
        int n=9474,k=n,arm_no=0;
        int len=(int)Math.floor(Math.log10(n))+1;
        // System.out.println(len);
        while(k!=0){
            int dig=k%10;
            arm_no+=Math.pow(dig, len);
            k=k/10;
        }
        if(arm_no==n) System.out.println("ArmStrong No");

    }
}
