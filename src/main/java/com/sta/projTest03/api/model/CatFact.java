package com.sta.projTest03.api.model;

public class CatFact {
    String fact;
    int length;

    public CatFact() {
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "CatFact{" +
                "fact='" + fact + '\'' +
                ", length=" + length +
                '}';
    }
}
