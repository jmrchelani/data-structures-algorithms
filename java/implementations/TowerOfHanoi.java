package com.jmrchelani;

public class TowerOfHanoi {
    static int count = 0;
    public static void main(String[] args) {
        ArrayStack source = new ArrayStack("source");
        ArrayStack main = new ArrayStack("main");
        ArrayStack aux = new ArrayStack("aux");

        source.push(5);
        source.push(4);
        source.push(3);
        source.push(2);

        tower(source.size, source, main, aux);

        System.out.println(main);
        System.out.println(count);
    }
    public static void tower(int n, ArrayStack s, ArrayStack m, ArrayStack a) {
        if(n > 0) {
            count++;
            tower(n-1, s, a, m);
            System.out.println("Move "+n+" disk("+s.peek()+") from "+s.name+""+s+" to "+m.name + "" +m);
            m.push(s.pop());
            tower(n-1, a, m, s);
        }
    }
}
