class Main{
    public static void main (String[] args) {
        System.out.println(Fact(5));
    }
    
    
    
    
public static int Fact(int x){
    

    if(x == 1){
        return 1;
    }
    else{
        
        
        return x*Fact(x-1);
    }
}    
}
