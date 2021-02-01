package com.jmrchelani;

class QueueTask {
    public static void main(String[] args) {

        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.insert("alright");
        arrayQueue.insert("hola");
        arrayQueue.insert(11);
        System.out.println(arrayQueue.check() + "- len: "+arrayQueue.size());
        System.out.println(arrayQueue.remove() + "- len: "+arrayQueue.size());
        System.out.println(arrayQueue.check() + "- len: "+arrayQueue.size());
        System.out.println(arrayQueue.remove() + "- len: "+arrayQueue.size());
        System.out.println(arrayQueue.check() + "- len: "+arrayQueue.size());


        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.insert("alright");
        linkedQueue.insert("hola");
        linkedQueue.insert(11);
        System.out.println(linkedQueue.check() + "- len: "+linkedQueue.size());
        System.out.println(linkedQueue.remove() + "- len: "+linkedQueue.size());
        System.out.println(linkedQueue.check() + "- len: "+linkedQueue.size());
        System.out.println(linkedQueue.remove() + "- len: "+linkedQueue.size());
        System.out.println(linkedQueue.check() + "- len: "+linkedQueue.size());
    }
}
