package com.applovin.exoplayer2.k;

import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m implements b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16114a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16115b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f16116c;

    /* renamed from: d, reason: collision with root package name */
    private final a[] f16117d;

    /* renamed from: e, reason: collision with root package name */
    private int f16118e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f16119g;

    /* renamed from: h, reason: collision with root package name */
    private a[] f16120h;

    public m(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public synchronized void a(int i10) {
        boolean z10 = i10 < this.f16118e;
        this.f16118e = i10;
        if (z10) {
            b();
        }
    }

    @Override // com.applovin.exoplayer2.k.b
    public synchronized void b() {
        int i10 = 0;
        int max = Math.max(0, ai.a(this.f16118e, this.f16115b) - this.f);
        int i11 = this.f16119g;
        if (max >= i11) {
            return;
        }
        if (this.f16116c != null) {
            int i12 = i11 - 1;
            while (i10 <= i12) {
                a aVar = (a) com.applovin.exoplayer2.l.a.b(this.f16120h[i10]);
                if (aVar.f16051a == this.f16116c) {
                    i10++;
                } else {
                    a aVar2 = (a) com.applovin.exoplayer2.l.a.b(this.f16120h[i12]);
                    if (aVar2.f16051a != this.f16116c) {
                        i12--;
                    } else {
                        a[] aVarArr = this.f16120h;
                        aVarArr[i10] = aVar2;
                        aVarArr[i12] = aVar;
                        i12--;
                        i10++;
                    }
                }
            }
            max = Math.max(max, i10);
            if (max >= this.f16119g) {
                return;
            }
        }
        Arrays.fill(this.f16120h, max, this.f16119g, (Object) null);
        this.f16119g = max;
    }

    @Override // com.applovin.exoplayer2.k.b
    public int c() {
        return this.f16115b;
    }

    public synchronized void d() {
        if (this.f16114a) {
            a(0);
        }
    }

    public synchronized int e() {
        return this.f * this.f16115b;
    }

    public m(boolean z10, int i10, int i11) {
        com.applovin.exoplayer2.l.a.a(i10 > 0);
        com.applovin.exoplayer2.l.a.a(i11 >= 0);
        this.f16114a = z10;
        this.f16115b = i10;
        this.f16119g = i11;
        this.f16120h = new a[i11 + 100];
        if (i11 > 0) {
            this.f16116c = new byte[i11 * i10];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f16120h[i12] = new a(this.f16116c, i12 * i10);
            }
        } else {
            this.f16116c = null;
        }
        this.f16117d = new a[1];
    }

    @Override // com.applovin.exoplayer2.k.b
    public synchronized a a() {
        a aVar;
        this.f++;
        int i10 = this.f16119g;
        if (i10 > 0) {
            a[] aVarArr = this.f16120h;
            int i11 = i10 - 1;
            this.f16119g = i11;
            aVar = (a) com.applovin.exoplayer2.l.a.b(aVarArr[i11]);
            this.f16120h[this.f16119g] = null;
        } else {
            aVar = new a(new byte[this.f16115b], 0);
        }
        return aVar;
    }

    @Override // com.applovin.exoplayer2.k.b
    public synchronized void a(a aVar) {
        a[] aVarArr = this.f16117d;
        aVarArr[0] = aVar;
        a(aVarArr);
    }

    @Override // com.applovin.exoplayer2.k.b
    public synchronized void a(a[] aVarArr) {
        int i10 = this.f16119g;
        int length = aVarArr.length + i10;
        a[] aVarArr2 = this.f16120h;
        if (length >= aVarArr2.length) {
            this.f16120h = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i10 + aVarArr.length));
        }
        for (a aVar : aVarArr) {
            a[] aVarArr3 = this.f16120h;
            int i11 = this.f16119g;
            this.f16119g = i11 + 1;
            aVarArr3[i11] = aVar;
        }
        this.f -= aVarArr.length;
        notifyAll();
    }
}
