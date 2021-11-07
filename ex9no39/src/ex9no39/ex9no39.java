package ex9no39;

import java.util.*;

public class ex9no39 {  //  515p
	public static void main(String[] args) {
		String expression = "x=100*(200+300)/2";
		StringTokenizer st = new StringTokenizer(expression, "+-*/=()", true);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
