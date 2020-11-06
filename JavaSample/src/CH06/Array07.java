package CH06;

import javax.swing.*;

public class Array07 {

	public static void main(String[] args) {
		int answer =(int) (Math.random() *100)+1;
		int input =0;
		String temp ="";
		int count = 0;
		
		do  {
			count++;
			temp = JOptionPane.showInputDialog("1~100 input number." +" finish input number -1 ");
			
			if(temp==null ||temp.equals("-1")) break;
		
			System.err.println("input : "+ temp);
			
			input = Integer.parseInt(temp);
		} while(true);
	}
}
