import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;




public class KentApplicationDeveloperTest {
	
	
	public String multiplyNumbers(String numberString){
		String delimiters = "\\,|\\:";
		String splitValues[]=numberString.split(delimiters);
		int result=1;
		ArrayList negativeValues = new ArrayList();
		ArrayList greaterHundered = new ArrayList();
		for(String value : splitValues){
			
			if(value.startsWith("-")){
				value.replaceAll("-","");
				negativeValues.add(Integer.parseInt(value));
			}else if(value.equalsIgnoreCase("")){
				return "0";
			}
			else if(Integer.parseInt(value)<=100){
				result = result * Integer.parseInt(value);
			}
			else if(Integer.parseInt(value)>100){
				greaterHundered.add(Integer.parseInt(value));
			}
		}
		
		if(splitValues.length==0){
			return "0";
		}
		else if(splitValues.length== greaterHundered.size()){
			return "0";
		}
		else if(negativeValues.size()>0){
			Collections.sort(negativeValues);
			String temp="Negatives not Allowed:";
			for(int i=negativeValues.size();i>0;i--){
				temp = temp+negativeValues.get(i-1)+",";
			}
			return temp;
		}
		else {
		return result+"";}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      KentApplicationDeveloperTest test = new KentApplicationDeveloperTest();
      Scanner scan = new Scanner(System.in);
      String input= scan.nextLine();
      String result=test.multiplyNumbers(input);
      System.out.println(result);
	}

}
