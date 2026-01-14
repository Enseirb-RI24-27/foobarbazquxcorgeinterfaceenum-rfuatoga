package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo implements IFoo{
    private IBaz baz;
    private List<IBar> bars;
    private IQux qux;
    private ICorge corge;

    public Foo(IBaz baz) {
        this.baz = baz;
        this.qux = new Qux();
        this.bars = new ArrayList<>();
    }

    public IBaz getBaz() {
        return this.baz;
    }

    public List<IBar> getBars() {
        return this.bars;
    }

    public IQux getQux() {
        return this.qux;
    }

    public void setCorge() {
        if (this.corge != corge) {
            this.corge.setFoo(null);
        }
        this.corge = corge;
    }

    public ICorge getCorge() {
        return this.corge;
    }

    public void addBar(IBar bar) {
        this.bars.add(bar);
    }

}
