import java.util.*;
public class freq{
    
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);        
        String g="aaabcgrdh";
        int l=g.length();
        int i,j,c=0,u;
        for(i=0;i<l;i=i+u){
            for(j=0;j<l;j++){
                if(g.charAt(j)==g.charAt(i)){
                    c++;
                }
                
            }System.out.print(g.charAt(i)+""+c);
            u=c;
            c=0;
        }
        
        
        
    }
    
    
    
    
    
    
}