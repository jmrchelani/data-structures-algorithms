package com.jmrchelani;

public class CollectionPractice {
    public static void main(String[] args) {
        ArrayCollection arrayCollection = new ArrayCollection();
        arrayCollection.add("HAHAHAHAHAH");
        arrayCollection.add("MILTONNNNNNN");
        System.out.println(arrayCollection.toString());
        arrayCollection.remove("HAHAHAHAHAH");
        System.out.println(arrayCollection.toString());
        arrayCollection.add("HAHAHAHAHAH");
        arrayCollection.add("MILTONNNNNNN");
        System.out.println(arrayCollection.toString());
        arrayCollection.remove("MILTONNNNNNN");
        arrayCollection.remove("MILTONNNNNNN");
        System.out.println(arrayCollection.toString());
        arrayCollection.remove("HAHAHAHAHAH");
        System.out.println(arrayCollection.toString());
        arrayCollection.add("Alright works");
        System.out.println(arrayCollection.toString());

        LinkedCollection linkedCollection = new LinkedCollection();
        linkedCollection.add("ABC");
        linkedCollection.add("HAHAHAHAA");
        linkedCollection.add("EZZZZ");
        linkedCollection.add("LOL");
        System.out.println(linkedCollection.toString());
        linkedCollection.remove("EZZZZ");
        System.out.println(linkedCollection.toString());
        linkedCollection.remove("LOL");
        System.out.println(linkedCollection.toString());
        linkedCollection.remove("ABC");
        System.out.println(linkedCollection.toString());
        linkedCollection.remove("HAHAHAHAA");
        System.out.println(linkedCollection.toString());
        linkedCollection.add("ALright works");
        System.out.println(linkedCollection.toString());
    }
}
