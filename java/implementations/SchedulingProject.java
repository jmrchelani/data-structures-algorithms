package com.jmrchelani;

import java.util.Timer;
import java.util.TimerTask;

class Task {
    int ID;
    String taskName;
    boolean done = false;
    Task(int id) {
        ID = id;
        taskName = "Task "+ID;
        done = false;
    }
}

public class SchedulingProject {
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        for(int i = 1; i <= 10; ++i) {
            Task tsk = new Task(i);
            queue.insert(tsk);
            schedule(tsk, (int)(10000*Math.random()));
        }
        boolean tmp = true;
        Outer:while(tmp) {
            for(LinkedQueue.Node i = queue.main.next; i != null; i = i.next) {
                Task op = (Task)i.data;
                if(op.done) {
                    System.out.println(""+op.taskName+" Done");
                } else {
                    System.out.println("Next task in queue is not done yet, rechecking in 2 seconds!");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    continue Outer;
                }
                if(i.next == null) {
                    tmp = false;
                }
            }
        }
        System.exit(1);
    }

    public static void schedule(Task tsk, int interval) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        tsk.done = true;
                    }
                },
                interval);
    }
}

