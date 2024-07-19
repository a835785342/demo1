package com.zhouyu.user.bean;

import java.lang.ref.WeakReference;

public class B {
    private WeakReference<A> a;

    public B(A a) {
        this.a = new WeakReference<>(a);
    }

    public A getA() {
        return a.get();
    }
    
}
