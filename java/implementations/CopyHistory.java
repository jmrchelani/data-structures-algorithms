import java.util.Scanner;

public class CopyHistory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedStack stack = new LinkedStack();
        int lel = 1;
        String tempo;
        while(lel > 0) {
            if(lel == 1) {
                System.out.println("Press C to Copy Text");
                System.out.println("Press P to Paste Last Copied Text");
                System.out.println("Press R to remove last saved text");
                System.out.println("Press F to show copied history");
                System.out.println("Press E to exit");
            }
            if(lel == 2) {
                System.out.println("Enter the text to copy:");
                tempo = scan.nextLine();
                if(!tempo.isEmpty()) stack.push(tempo);
                System.out.println("Copied \""+tempo+"\" into the clipboard");
            }
            if(lel == 3) {
                if(stack.isEmpty()) System.out.println("You havent copied anything yet.");
                else System.out.println("Pasted: "+stack.peek());
            }
            if(lel == 4) {
                if(stack.isEmpty()) System.out.println("You havent copied anything yet.");
                else System.out.println(stack);
            }
            if(lel == 5) {
                if(stack.isEmpty()) System.out.println("You havent copied anything yet.");
                else {
                    System.out.println("Removed: "+stack.pop());
                }
            }
            System.out.println("Type the command: ");
            tempo = scan.nextLine();
            if(tempo.equalsIgnoreCase("C")) lel = 2;
            else if(tempo.equalsIgnoreCase("P")) lel = 3;
            else if(tempo.equalsIgnoreCase("F")) lel = 4;
            else if(tempo.equalsIgnoreCase("R")) lel = 5;
            else lel = -1;
        }
    }
}
