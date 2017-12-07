package p05_security_system;

import java.util.Scanner;

public class KeyCardCheck extends SecurityCheck implements KeyCardUi {

    private SecurityUI securityUI;

    private Scanner scanner;

    public KeyCardCheck(SecurityUI securityUI) {
        this.securityUI = securityUI;
        this.scanner = new Scanner(System.in);
    }


    public boolean validateUser() {
        String code = this.requestKeyCard();
        if (isValid(code)) {
            return true;
        }

        return false;
    }
    @Override
    public String requestKeyCard() {
        System.out.println("slide your key card");
        return this.scanner.nextLine();
    }

    private boolean isValid(String code) {
        return true;
    }


}
