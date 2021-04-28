package com.jmrchelani;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ChallanQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        String tmp = "";
        int yes = 0;
        Scanner scan = new Scanner(System.in);
        while(yes >= 0) {
            if(yes == 0){
                System.out.println("Press E to enter challan details");
                System.out.println("Press P to process all orders");
                System.out.println("Enter the cmd:");
            }
            if(yes == 1) {
                System.out.println("Enter your challan details:");
                tmp = scan.nextLine();
                queue.add(tmp);
                yes = 0;
                continue;
            }
            tmp = scan.nextLine();
            if(tmp.equalsIgnoreCase("E")) yes = 1;
            if(tmp.equalsIgnoreCase("P")) yes = -1;
        }

        while(!queue.isEmpty()) {
            System.out.println("Processing challan: " + queue.remove());
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Processed all challans");
    }
}
