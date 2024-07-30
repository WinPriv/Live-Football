package com.applovin.exoplayer2.k;

import com.applovin.exoplayer2.k.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<a> f16227a = new Comparator() { // from class: com.applovin.exoplayer2.k.d0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int b10;
            b10 = y.b((y.a) obj, (y.a) obj2);
            return b10;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final Comparator<a> f16228b = new Comparator() { // from class: com.applovin.exoplayer2.k.e0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int a10;
            a10 = y.a((y.a) obj, (y.a) obj2);
            return a10;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final int f16229c;

    /* renamed from: g, reason: collision with root package name */
    private int f16232g;

    /* renamed from: h, reason: collision with root package name */
    private int f16233h;

    /* renamed from: i, reason: collision with root package name */
    private int f16234i;

    /* renamed from: e, reason: collision with root package name */
    private final a[] f16231e = new a[5];

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<a> f16230d = new ArrayList<>();
    private int f = -1;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f16235a;

        /* renamed from: b, reason: collision with root package name */
        public int f16236b;

        /* renamed from: c, reason: collision with root package name */
        public float f16237c;

        private a() {
        }
    }

    public y(int i10) {
        this.f16229c = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(a aVar, a aVar2) {
        return Float.compare(aVar.f16237c, aVar2.f16237c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(a aVar, a aVar2) {
        return aVar.f16235a - aVar2.f16235a;
    }

    private void b() {
        if (this.f != 1) {
            Collections.sort(this.f16230d, f16227a);
            this.f = 1;
        }
    }

    private void c() {
        if (this.f != 0) {
            Collections.sort(this.f16230d, f16228b);
            this.f = 0;
        }
    }

    public void a() {
        this.f16230d.clear();
        this.f = -1;
        this.f16232g = 0;
        this.f16233h = 0;
    }

    public void a(int i10, float f) {
        a aVar;
        b();
        int i11 = this.f16234i;
        if (i11 > 0) {
            a[] aVarArr = this.f16231e;
            int i12 = i11 - 1;
            this.f16234i = i12;
            aVar = aVarArr[i12];
        } else {
            aVar = new a();
        }
        int i13 = this.f16232g;
        this.f16232g = i13 + 1;
        aVar.f16235a = i13;
        aVar.f16236b = i10;
        aVar.f16237c = f;
        this.f16230d.add(aVar);
        this.f16233h += i10;
        while (true) {
            int i14 = this.f16233h;
            int i15 = this.f16229c;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            a aVar2 = this.f16230d.get(0);
            int i17 = aVar2.f16236b;
            if (i17 <= i16) {
                this.f16233h -= i17;
                this.f16230d.remove(0);
                int i18 = this.f16234i;
                if (i18 < 5) {
                    a[] aVarArr2 = this.f16231e;
                    this.f16234i = i18 + 1;
                    aVarArr2[i18] = aVar2;
                }
            } else {
                aVar2.f16236b = i17 - i16;
                this.f16233h -= i16;
            }
        }
    }

    public float a(float f) {
        c();
        float f10 = f * this.f16233h;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f16230d.size(); i11++) {
            a aVar = this.f16230d.get(i11);
            i10 += aVar.f16236b;
            if (i10 >= f10) {
                return aVar.f16237c;
            }
        }
        if (this.f16230d.isEmpty()) {
            return Float.NaN;
        }
        return this.f16230d.get(r5.size() - 1).f16237c;
    }
}
