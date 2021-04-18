package com.jmrchelani;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class PrinterTasks {
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        Scanner scan = new Scanner(System.in);
        String tmp = "Y";
        String fileName = "";
        while(!tmp.equalsIgnoreCase("N")) {
            System.out.println("Enter the filename to print: ");
            fileName = scan.nextLine();
            queue.insert(fileName);
            System.out.println("Press N to stop printing, Y to continue");
            tmp = scan.nextLine();
        }
        while(queue.size() != 0) {
            System.out.println("Printing "+queue.remove());
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Printed");
        }
    }
}
