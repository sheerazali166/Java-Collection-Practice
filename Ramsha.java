package com.example.kinzasharedpreferenceapp;

import java.util.Objects;

public class Ramsha implements Comparable<Ramsha> {

    String ramshaName;
    int ramshaRollNo;

    public Ramsha(String ramshaName, int ramshaRollNo) {
        this.ramshaName = ramshaName;
        this.ramshaRollNo = ramshaRollNo;
    }

    @Override
    public String toString() {
        return "Ramsha{" +
                "ramshaName='" + ramshaName + '\'' +
                ", ramshaRollNo=" + ramshaRollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ramsha ramsha = (Ramsha) o;
        return ramshaRollNo == ramsha.ramshaRollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ramshaRollNo);
    }


    @Override
    public int compareTo(Ramsha that) {
        return this.ramshaRollNo - that.ramshaRollNo;
    }
}
