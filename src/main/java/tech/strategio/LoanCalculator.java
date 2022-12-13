package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     *
     * @param ???
     * @return ???
     */
    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Rewrite this method
        int x=amount- (10*amount)/100;
        int y=x-(10*x)/100;
        int result=y-(y*10)/100;


        return result;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
