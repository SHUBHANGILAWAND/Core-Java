package methods;

import java.util.Date;

import custom.LicenseExpiryException;

public class VehicleValidationRule {
	static Date d1;
	static {
		d1 = new Date();
	}

	public static void checkExpiry(Date date) throws LicenseExpiryException {
		if (date.before(d1)) {
			throw new LicenseExpiryException("Liscence is Expired....");
		}
		System.out.println("Valid Liscence");

	}

}
