package com.applovin.exoplayer2;

import android.annotation.SuppressLint;

/* loaded from: classes.dex */
public interface as {
    @SuppressLint({"WrongConstant"})
    static int a(int i10, int i11, int i12) {
        return i10 | i11 | i12;
    }

    static int b(int i10) {
        return a(i10, 0, 0);
    }

    @SuppressLint({"WrongConstant"})
    static int c(int i10) {
        return i10 & 7;
    }

    @SuppressLint({"WrongConstant"})
    static int d(int i10) {
        return i10 & 32;
    }

    int a();

    int a(v vVar) throws p;

    int o() throws p;

    String y();
}
