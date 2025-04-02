class Rev_Str{
    public static void main(String[] args) {
        String str="String";
        char[] strchr=str.toCharArray();
        for(int i=0;i<str.length()/2;i++){
            char temp=strchr[i];
            strchr[i]=strchr[str.length()-i-1];
            strchr[str.length()-i-1]=temp;
        }
        System.out.println(new String(strchr));
    }
}