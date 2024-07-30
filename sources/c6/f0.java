package c6;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: SlidingPercentile.java */
/* loaded from: classes2.dex */
public final class f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.applovin.exoplayer2.g.f.e f3338h = new com.applovin.exoplayer2.g.f.e(7);

    /* renamed from: i, reason: collision with root package name */
    public static final com.applovin.exoplayer2.j.l f3339i = new com.applovin.exoplayer2.j.l(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f3340a;

    /* renamed from: e, reason: collision with root package name */
    public int f3344e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f3345g;

    /* renamed from: c, reason: collision with root package name */
    public final a[] f3342c = new a[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<a> f3341b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public int f3343d = -1;

    /* compiled from: SlidingPercentile.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f3346a;

        /* renamed from: b, reason: collision with root package name */
        public int f3347b;

        /* renamed from: c, reason: collision with root package name */
        public float f3348c;
    }

    public f0(int i10) {
        this.f3340a = i10;
    }

    public final void a(float f, int i10) {
        a aVar;
        int i11 = this.f3343d;
        ArrayList<a> arrayList = this.f3341b;
        if (i11 != 1) {
            Collections.sort(arrayList, f3338h);
            this.f3343d = 1;
        }
        int i12 = this.f3345g;
        a[] aVarArr = this.f3342c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f3345g = i13;
            aVar = aVarArr[i13];
        } else {
            aVar = new a();
        }
        int i14 = this.f3344e;
        this.f3344e = i14 + 1;
        aVar.f3346a = i14;
        aVar.f3347b = i10;
        aVar.f3348c = f;
        arrayList.add(aVar);
        this.f += i10;
        while (true) {
            int i15 = this.f;
            int i16 = this.f3340a;
            if (i15 > i16) {
                int i17 = i15 - i16;
                a aVar2 = arrayList.get(0);
                int i18 = aVar2.f3347b;
                if (i18 <= i17) {
                    this.f -= i18;
                    arrayList.remove(0);
                    int i19 = this.f3345g;
                    if (i19 < 5) {
                        this.f3345g = i19 + 1;
                        aVarArr[i19] = aVar2;
                    }
                } else {
                    aVar2.f3347b = i18 - i17;
                    this.f -= i17;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f3343d;
        ArrayList<a> arrayList = this.f3341b;
        if (i10 != 0) {
            Collections.sort(arrayList, f3339i);
            this.f3343d = 0;
        }
        float f = 0.5f * this.f;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            a aVar = arrayList.get(i12);
            i11 += aVar.f3347b;
            if (i11 >= f) {
                return aVar.f3348c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return arrayList.get(arrayList.size() - 1).f3348c;
    }
}
