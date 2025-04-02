class Palindrome{
    public static void main(String[] args) {
        String str="nitin";
        char[] strchr=str.toCharArray();
        for(int i=0;i<str.length()/2;i++){
            char temp=strchr[i];
            strchr[i]=strchr[str.length()-i-1];
            strchr[str.length()-i-1]=temp;
        }
        String rev=new String(strchr);
        if(str.equals(rev)) System.out.println("Equal");
        else System.out.println("Not equal");
    }
}