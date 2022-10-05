import java.util.Scanner;


class A3{

public static void main(String args[]){

System.out.println("entered marks of subject");


 Scanner s = new Scanner(System.in);
 int math = s.nextInt();
 int sci = s.nextInt();
 int hindi = s.nextInt();
 int english = s.nextInt();
 int computer = s.nextInt();
 
 int O  = ( math + sci + hindi + english + computer );
 //obtained = O;
 int T = 500 ;
// T = 500;
 
 System.out.println(O);
 
double P = ((O *100)/T) ;

 //System.out.println(percentage);
 System.out.println("percentage marks"+" "+"="+ " "+ P +"%");
 
}
}