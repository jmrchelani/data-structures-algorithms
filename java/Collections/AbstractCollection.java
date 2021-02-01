package com.jmrchelani;

public abstract class AbstractCollection implements Collection {
    public AbstractCollection() {}
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("[ ");
        Iterator a = iterator();
        if(a.hasNext()) buffer.append(a.next());
        while(a.hasNext()) {
            buffer.append(", ").append(a.next());
        }
        buffer.append(" ]");
        return buffer.toString();
    }
    public void clear() {
        Iterator a = iterator();
        while(a.hasNext()) {
            a.next();
            try {
                a.remove();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
    public abstract Iterator iterator();
    public abstract int size();
    public boolean isEmpty() {
        return size()==0;
    }
    public boolean remove(Object object) {
        Iterator iter = iterator();
        while(iter.hasNext()) {
            if(object.equals(iter.next())) {
                try {
                    iter.remove();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                return true;
            }
        }
        return false;
    }
}
