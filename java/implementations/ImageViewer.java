package com.jmrchelani;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ImageViewer {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        File file = new File("images.txt");
        Scanner scan;
        try {
            scan = new Scanner(file);
            while(scan.hasNext()) {
                list.add(scan.nextLine());
                System.out.println(list.peekLast());
            }
            System.out.println("Loaded Images successfully.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        scan = new Scanner(System.in);
        int yes = 0;
        String temp = "";
        LinkedList.Node node = list.first;
        while(yes == 0 || yes == 1 || yes == 2 || yes == 4) {
            if(node != null) {
                if(yes == 0) {
                    System.out.println("============================================================");
                    System.out.println("Type \"exit\" to exit this program.");
                    System.out.println("Type \"N\" to move to next image");
                    System.out.println("Type \"P\" to go to previous image");
                    System.out.println("Type \"R\" to remove the image");
                    System.out.println("============================================================");
                }
                if(yes == 1) {
                    if(node.prev == null) {
                        System.out.println("You pressed previous but there is no more images backwards.");
                    } else node = node.prev;
                }
                if(yes == 2) {
                    if(node.next == null) {
                        System.out.println("You pressed next but there is no more images forward.");
                    } else node = node.next;
                }
                if(yes == 4) {
                    Object tmp = node.data;
                    if(node.prev == null) node = node.next;
                    else if(node.next == null) node = node.prev;
                    else node = node.next;
                    list.remove(tmp);
                }
            }
            System.out.println("You are currently at image: "+ ((node != null) ? node.data : "Empty Image") );
            System.out.print("Type the command: ");
            temp = scan.nextLine();
            if(temp.equalsIgnoreCase("N")) yes = 2;
            else if(temp.equalsIgnoreCase("P")) yes = 1;
            else if(temp.equalsIgnoreCase("exit")) yes = 3;
            else if(temp.equalsIgnoreCase("R")) yes = 4;
            else yes = 3;
        }
    }
}
