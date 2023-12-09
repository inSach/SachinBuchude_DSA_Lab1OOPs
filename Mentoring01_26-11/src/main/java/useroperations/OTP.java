package useroperations;

import java.util.Random;

public class OTP {

	public boolean validateOTP(int OTP, int userInput) {
		return (OTP == userInput)? true : false;
	}
	
	public int generateOTP() {
		Random random = new Random();
		int OTP = new Random().nextInt(900000) + 100000;
		System.out.println("OTP for transfer is: "+ String.valueOf(OTP));
		return OTP;
	}
}
