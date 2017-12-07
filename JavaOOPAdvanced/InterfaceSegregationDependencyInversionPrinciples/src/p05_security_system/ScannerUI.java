package p05_security_system;

import java.util.Scanner;

public class ScannerUI implements SecurityUI {

    private Scanner scanner;

    public ScannerUI() {
        this.scanner = new Scanner(System.in);
    }
}
