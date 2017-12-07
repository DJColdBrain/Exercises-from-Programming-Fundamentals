package p05_security_system;

import java.util.Scanner;

public class PinCodeCheck extends SecurityCheck implements PinCodeUi {

    private SecurityUI securityUI;

    private Scanner scanner;

    public PinCodeCheck(SecurityUI securityUI) {
        this.securityUI = securityUI;
        this.scanner = new Scanner(System.in);
    }

    public boolean validateUser() {
        int pin = this.requestPinCode();
        if (isValid(pin)) {
            return true;
        }

        return false;
    }

    private boolean isValid(int pin) {
        return true;
    }


    @Override
    public int requestPinCode() {
        System.out.println("enter your pin code");
        return Integer.parseInt(this.scanner.nextLine());
    }
}
