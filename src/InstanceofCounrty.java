import java.util.Scanner;
public class InstanceofCounrty {

	public static void main(String[] args) {
		System.out.println("What Country are you from? ");
		Scanner scan=new Scanner(System.in);
		String Country=scan.nextLine();
		
		System.out.println("How large is "+Country+" population? ");
		Double Population=scan.nextDouble();
		
		System.out.println("What year was "+Country+ " established? ");
		int Founded=scan.nextInt();
		
		System.out.println("How large is "+Country+ " volume? ");
		Double Volume=scan.nextDouble();
		Country country1=new Country(Country, Founded, Population, Volume);
		System.out.println(country1.Country+" , "+country1.Founded+" , "+country1.Population+" , "+country1.Volume);

	}

}
