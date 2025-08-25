package selenium;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class StringNewClass {
	
	public static void main(String[] args) {
        String s="Manoj Kushwaha Sarita Kushwaha";
        Set<String> set=new LinkedHashSet<String>();
        String words[]=s.split(" ");
        for(String c:words){
            set.add(c);
        }
        StringBuffer result=new StringBuffer();
        for(String c:set){
            result.append(c).append(" ");
        }
        System.out.println("------Sarita Kushwaha-------");
        System.out.println(result);
        System.out.println("------Sarita Kushwaha End-------");     
       
	
    
	}     

}
