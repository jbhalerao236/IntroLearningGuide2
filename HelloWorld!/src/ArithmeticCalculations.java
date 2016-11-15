import javax.swing.JOptionPane;

public class ArithmeticCalculations {

	public static void main(String[] args) {
		int num1 = 1;

		int num2 = 2;

		int answer;

		answer = num1 + num2;
		System.out.println("The answer is : "+ answer);
		
		double totalMoney = 3;

		double priceOfBurrito = 5;

		double numberOfBurritos;

		numberOfBurritos = totalMoney / priceOfBurrito;

		System.out.println("With $" + totalMoney);
		System.out.println("You can buy " + numberOfBurritos +  " burritos");

		double a= 5;
		double b= 2;
		double sum= a+b;
		double sub= a-b;
		double div= a/b;
		double mul= a*b;
		System.out.println(sum);
		System.out.println("dIV:"+ div);
		
		int realAnswer= 5;
		int guess= 2;
		int offBy = Math.abs(realAnswer-guess);
		System.out.println("The real answer was:"+realAnswer + "   and you guessed:"+guess);
		System.out.println("You were off by:"+offBy);
		
		int x1= 10;
		int y1=22;
		int x2= 4;
		int y2=8;
		int xDiff= x2-x1;
		int yDiff= y2-y1;
		double distance= Math.sqrt(xDiff*xDiff + yDiff*yDiff);
		System.out.println("The distance is: "+ distance);
		
		int c=5;
		int d=2;
		int div2=c/d;
		double div3= (double)c/d;
		System.out.println(div2+"  "+div3);
		
		double abc= 9;
	    double def= 8;
	    double ghi= 5;
	    double sum2= abc+def+ghi;
	    double count= 3;
	    double avg= (double)(sum2/count);
	    System.out.println(avg);
		
	    //try this: 10. Profit estimator When I was travelling in Indonesia I found these awesome quilts. They cost me $11 each to buy and I figured I could sell them for a lot more back in Sunnyvale. I learned it costs $250 to get a booth at the local farmer’s market. I’m not sure what price to sell them at or how many I’d sell, however. So I want a program that will let me enter..........
	    //finish program below
	    //JOptionPane.showInputDialog("How many quarters do you have?");
	    //JOptionPane.showInputDialog("How many dimes do you have?");
	    //JOptionPane.showInputDialog("How many nickels do you have?");
	    //JOptionPane.showInputDialog("How many pennies do you have?");
	    
	}
}
