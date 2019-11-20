package com.java.easy;

public class Test {
    public void countDownA(int n){
        if(n < 0)
            return;
        else
        {        System.out.println(n + "... A");
        // do some useful work such as Thread.sleep(1000); 
        countDownA(n - 1);}
    }

    public void countDownB(int n){
        while(n > 0) {
            System.out.println(n + "... B");
            // do some useful work such as Thread.sleep(1000); 
            n -= 1;
        }
    }

    public static void main(String[] args) throws Exception {
        Test test = new Test();
        test.countDownA(-1);
        //test.countDownB(-1);
    }
}



//public void countDownA(int n) throws InterruptedException {
//    if(n < 0)
//        return;
//    else
//    {        System.out.println(n + "... A");
//    // do some useful work such as Thread.sleep(1000); 
//    countDownA(n - 1);}
//}
//
//public void countDownB(int n) throws InterruptedException {
//    while(n > 0) {
//        System.out.println(n + "... B");
//        // do some useful work such as Thread.sleep(1000); 
//        n -= 1;
//    }
//}
//
//public static void main(String[] args) throws Exception {
//    Test test = new Test();
//    test.countDownA(-1);
//    //test.countDownB(-1);
//}