class Prime_No{
    public static void main(String[] args) {
        int n=79;
        if(n==1){
            System.out.println("Neither prime nor composite");
            return;
        }
        else if (n==2){
            System.out.println("Prime number");
            return;
        }
        else{
            for(int i=2;i<n-1;i++){
                if(n%i==0) {
                    System.out.println("Composite"); 
                    return;
                }

            }
            System.out.println("Prime");
        }
    }
}