package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class duplicatenumbers_map_stream {
	public static void main(String[] args) {
		duplicateArray();
		intDuplicate();
	}

	public static void duplicateArray() {
String [] str= {"apple","banana","apple","coconut","apple"};

Map<String,Long>duplicare=Arrays.stream(str).collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
duplicare.entrySet().stream().filter(p->p.getValue()>1).forEach(p->System.out.println(p.getKey()));
	}
	

	public static void intDuplicate() {
	List<Integer> liint=	Arrays.asList(1,2,12,9,6,6,2,9);
Map<Integer,Long> min=	liint.stream().collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()));
min.entrySet().stream().filter(p->p.getValue()>1).forEach(p->System.out.println(p.getKey()));

		
		
		
	}
	
}
