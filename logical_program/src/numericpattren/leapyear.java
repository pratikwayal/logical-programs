package numericpattren;

public class leapyear {
public static void main(String[] args) {
	
	int year =2000;
	boolean leap=false;
	if (year % 4 == 0) {  //if the year is divided by 4

		if (year % 100==0) { //if the year is century

			if (year % 400==0)   //if year is divided by 400 then its leap year
		         
				leap= true;
		}
		else
			leap=true;
	}
	else
		leap=false;
	
	if (leap)
		System.out.println(year +  "  is leap year");
	else
		System.out.println(year +  "  is  not leap year");
			}
		
	}


