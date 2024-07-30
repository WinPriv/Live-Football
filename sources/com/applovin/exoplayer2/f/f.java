package com.applovin.exoplayer2.f;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private int f15018a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f15019b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f15020c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int[] f15021d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    private int f15022e;

    public f() {
        this.f15022e = r0.length - 1;
    }

    private void d() {
        int[] iArr = this.f15021d;
        int length = iArr.length << 1;
        if (length >= 0) {
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i10 = this.f15018a;
            int i11 = length2 - i10;
            System.arraycopy(iArr, i10, iArr2, 0, i11);
            System.arraycopy(this.f15021d, 0, iArr2, i11, i10);
            this.f15018a = 0;
            this.f15019b = this.f15020c - 1;
            this.f15021d = iArr2;
            this.f15022e = iArr2.length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    public void a(int i10) {
        if (this.f15020c == this.f15021d.length) {
            d();
        }
        int i11 = (this.f15019b + 1) & this.f15022e;
        this.f15019b = i11;
        this.f15021d[i11] = i10;
        this.f15020c++;
    }

    public boolean b() {
        if (this.f15020c == 0) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f15018a = 0;
        this.f15019b = -1;
        this.f15020c = 0;
    }

    public int a() {
        int i10 = this.f15020c;
        if (i10 != 0) {
            int[] iArr = this.f15021d;
            int i11 = this.f15018a;
            int i12 = iArr[i11];
            this.f15018a = (i11 + 1) & this.f15022e;
            this.f15020c = i10 - 1;
            return i12;
        }
        throw new NoSuchElementException();
    }
}
