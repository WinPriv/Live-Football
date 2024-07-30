package com.anythink.expressad.exoplayer.j;

import com.anythink.expressad.exoplayer.k.af;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l implements b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f8821a = 100;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8822b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8823c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f8824d;

    /* renamed from: e, reason: collision with root package name */
    private final a[] f8825e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f8826g;

    /* renamed from: h, reason: collision with root package name */
    private int f8827h;

    /* renamed from: i, reason: collision with root package name */
    private a[] f8828i;

    public l(byte b10) {
        this();
    }

    public final synchronized void a(int i10) {
        boolean z10 = i10 < this.f;
        this.f = i10;
        if (z10) {
            b();
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.b
    public final synchronized void b() {
        int i10 = 0;
        int max = Math.max(0, af.a(this.f, this.f8823c) - this.f8826g);
        int i11 = this.f8827h;
        if (max >= i11) {
            return;
        }
        if (this.f8824d != null) {
            int i12 = i11 - 1;
            while (i10 <= i12) {
                a[] aVarArr = this.f8828i;
                a aVar = aVarArr[i10];
                byte[] bArr = aVar.f8695a;
                byte[] bArr2 = this.f8824d;
                if (bArr == bArr2) {
                    i10++;
                } else {
                    a aVar2 = aVarArr[i12];
                    if (aVar2.f8695a != bArr2) {
                        i12--;
                    } else {
                        aVarArr[i10] = aVar2;
                        aVarArr[i12] = aVar;
                        i12--;
                        i10++;
                    }
                }
            }
            max = Math.max(max, i10);
            if (max >= this.f8827h) {
                return;
            }
        }
        Arrays.fill(this.f8828i, max, this.f8827h, (Object) null);
        this.f8827h = max;
    }

    @Override // com.anythink.expressad.exoplayer.j.b
    public final synchronized int c() {
        return this.f8826g * this.f8823c;
    }

    @Override // com.anythink.expressad.exoplayer.j.b
    public final int d() {
        return this.f8823c;
    }

    public final synchronized void e() {
        if (this.f8822b) {
            a(0);
        }
    }

    private l() {
        com.anythink.expressad.exoplayer.k.a.a(true);
        com.anythink.expressad.exoplayer.k.a.a(true);
        this.f8822b = true;
        this.f8823c = com.anythink.expressad.exoplayer.b.aX;
        this.f8827h = 0;
        this.f8828i = new a[100];
        this.f8824d = null;
        this.f8825e = new a[1];
    }

    @Override // com.anythink.expressad.exoplayer.j.b
    public final synchronized a a() {
        a aVar;
        this.f8826g++;
        int i10 = this.f8827h;
        if (i10 > 0) {
            a[] aVarArr = this.f8828i;
            int i11 = i10 - 1;
            this.f8827h = i11;
            aVar = aVarArr[i11];
            aVarArr[i11] = null;
        } else {
            aVar = new a(new byte[this.f8823c]);
        }
        return aVar;
    }

    @Override // com.anythink.expressad.exoplayer.j.b
    public final synchronized void a(a aVar) {
        a[] aVarArr = this.f8825e;
        aVarArr[0] = aVar;
        a(aVarArr);
    }

    @Override // com.anythink.expressad.exoplayer.j.b
    public final synchronized void a(a[] aVarArr) {
        int i10 = this.f8827h;
        int length = aVarArr.length + i10;
        a[] aVarArr2 = this.f8828i;
        if (length >= aVarArr2.length) {
            this.f8828i = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i10 + aVarArr.length));
        }
        for (a aVar : aVarArr) {
            byte[] bArr = aVar.f8695a;
            if (bArr != this.f8824d && bArr.length != this.f8823c) {
                throw new IllegalArgumentException("Unexpected allocation: " + System.identityHashCode(aVar.f8695a) + ", " + System.identityHashCode(this.f8824d) + ", " + aVar.f8695a.length + ", " + this.f8823c);
            }
            a[] aVarArr3 = this.f8828i;
            int i11 = this.f8827h;
            this.f8827h = i11 + 1;
            aVarArr3[i11] = aVar;
        }
        this.f8826g -= aVarArr.length;
        notifyAll();
    }
}
