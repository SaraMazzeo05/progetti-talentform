package com.inner.classes;

public class Rettangolo {

    private long base;
    private long altezza;
    
    public Rettangolo(long base, long altezza) {
        super();
        this.base = base;
        this.altezza = altezza;
    }

    class Area {
        
        public long getArea() {
            return base*altezza;
        }
        
    }
}
