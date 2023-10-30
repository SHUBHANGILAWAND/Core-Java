package tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import custom.LicenseExpiryException;
import methods.VehicleValidationRule;

public class TesterLiscence {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("In try-with-resources...");
			System.out.println("Enter Liscence Date");
			Date dat1 = sdf.parse(sc.next());

			VehicleValidationRule.checkExpiry(dat1);
		} catch (LicenseExpiryException e) {
			System.out.println("In catch ");
			System.out.println(e.getMessage());
		}
		System.out.println("End of main()");

	}

}
