package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class dateInJava {

	public static void main(String[] args) {
//		Date d1=new Date();
//		System.out.println(d1);
//		Date d2=new Date(2019, 10, 23);
//		System.out.println(d2);
//		Date d3=new Date("2019/09/23");
//		System.out.println(d3);
//		LocalDate ld1=LocalDate.now();
//		System.out.println(ld1);
//		System.out.println(ld1.minusDays(3));
//		System.out.println(ld1.minusMonths(2));
//		//localDate is immutable
//		System.out.println(ld1.getDayOfYear());
//	LocalDateTime ldt	= LocalDateTime.now();
	
		  
		        // Parses the date 
//		        LocalDate dt = LocalDate.now(); 
//		        System.out.println(dt); 
//		  
//		        // Function call 
//		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY"); 
//		        System.out.println(formatter.format(dt)); 
		
//**************************************************************
		//I love cofee
		String str="I love apple and maple syrop";
		String [] array=str.split(" ");
		System.out.println(Arrays.toString(array));
		
		for (int i = 0; i < array.length; i++) {
			if(array[i].endsWith("le")) {
				System.out.println(array[i]);
			}
		}
		List <String> list=new ArrayList<>(Arrays.asList(array));
		System.out.println(list);
		list.forEach(x -> System.out.println(x));
		
		
		
		
} 
	}		


