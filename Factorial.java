class Main{
    public static void main (String[] args) {
        System.out.println(Fact(5));
    }
    
    
    
    
public static int Fact(int x){
    

//     if(x == 1){
//         return 1;
//     }
//     else{
        
        
//         return x*Fact(x-1);
//     }
    
    
    return (x==0)?1:x*Fact(x-1);
}    
}
