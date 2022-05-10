/* Q10. WAP in Java Program To Survey Four Different Car Models For Four
		Different Cities:
		Your job is to find out the total number of cars sold of each model in all
		the cities. Use Array of objects or multiple objects of class name City
*/

package Assignment_01;
import java.util.Scanner;

public class Q_10 {

	public static void main(String[] args) {
		Survey obj = new Survey();
		int[][] arr = new int[4][4];
		obj.read_survey(arr);
		obj.cars_survey(arr);

	}

}

class Survey {
	void read_survey(int arr[][]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				arr[j][i]=sc.nextInt();
				sc.nextLine();
			}
		}
		sc.close();
	}
	
	void cars_survey(int arr[][]) {
		int sum;
		for(int i=0;i<4;i++) {
			sum=0;
			for(int j=0;j<4;j++) {
				sum+=arr[j][i];
			}
			if(i==0) System.out.println("Maruti-k10::"+sum);
			if(i==1) System.out.println("Zen-Astelo::"+sum);
			if(i==2) System.out.println("Wagnor::"+sum);
			if(i==3) System.out.println("Maruti-SX4::"+sum);
		}
	}
}


/* ############################         METHOD_2     ############################# 
   
   package Assignment_01;
	import java.util.Scanner;
	public class Ques10 {
	public static void main(String[] args) {
		City arr[]=new City[4];
		Scanner obj= new Scanner(System.in);
		String p;
		int l,m,n,o;
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter the name of the city");
			p=obj.nextLine();
			System.out.println("enter no of maruti_k10 foollowed by zen_astelo,wagnor and maruti_sx4");
			l=obj.nextInt();
			m=obj.nextInt();
			n=obj.nextInt();
			o=obj.nextInt();
			obj.nextLine();
			arr[i]= new City(p,l,m,n,o);
		}
		l=m=n=o=0;
		for(int i=0;i<4;i++)
		{
			l+=arr[i].maruti_k10;
			m+=arr[i].zen_astelo;
			n+=arr[i].wagnor;
			o+=arr[i].maruti_sx4;
			}
		System.out.println("No of maruti_k10="+l);
		System.out.println("No of zen_aastelo="+m);
		System.out.println("No of wagnor="+n);
		System.out.println("No of marut_sx4="+o);
		obj.close();
	}
	}
	class City{
		 String city_name;
		 int maruti_k10;
		 int zen_astelo;
		 int wagnor;
		 int maruti_sx4;
		 City(String city_name,int maruti_k10,int zen_astelo,int wagnor,int maruti_sx4)
		 {
			 this.city_name=city_name;
			 this.maruti_k10=maruti_k10;
			 this.zen_astelo=zen_astelo;
			 this.wagnor=wagnor;
			 this.maruti_sx4=maruti_sx4;
		 }
	}
*/