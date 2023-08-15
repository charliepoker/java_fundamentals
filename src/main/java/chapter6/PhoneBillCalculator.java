package chapter6;

public class PhoneBillCalculator {
    public static void main(String[] args){
        PhoneBill bill = new PhoneBill(123456, 90, 2000,2300);
        bill.printItemizedBill();
    }
}
