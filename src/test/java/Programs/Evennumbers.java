package Programs;

public class Evennumbers {
	public static void main(String[] args) {
		even();
	}
	public static void even() {
		String str="Zensapro";
	StringBuffer ev=new StringBuffer();
	StringBuffer odd=new StringBuffer();
	for(int i=0;i<str.length();i++) {
		if(i%2==0) {
			ev.append(str.charAt(i));
		}else {
			odd.append(str.charAt(i));
		}
	}
	System.out.println(ev+""+odd);
}
}
