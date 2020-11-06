package CH05;

import java.util.Date;

import java.util.concurrent.TimeUnit;

public class SubeExam {

	public static void main(String[] args) {
		
		
		
		int treeHit = 0;
		while (treeHit < 10) {
		    treeHit++;
		    
		    try{
		        Thread.sleep(1000);
		    }catch(InterruptedException e){
		        e.printStackTrace();
		    }
		    
		    System.out.println("나무를  " + treeHit + "번 찍었습니다.");
		   
		    if (treeHit == 10) {
		        System.out.println("나무 넘어갑니다.");
		        }
		}	
		
	}
}
