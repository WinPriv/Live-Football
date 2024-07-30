package com.anythink.expressad.exoplayer.k;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<a> f9137a = new Comparator<a>() { // from class: com.anythink.expressad.exoplayer.k.y.1
        private static int a(a aVar, a aVar2) {
            return aVar.f9149a - aVar2.f9149a;
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
            return aVar.f9149a - aVar2.f9149a;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final Comparator<a> f9138b = new Comparator<a>() { // from class: com.anythink.expressad.exoplayer.k.y.2
        private static int a(a aVar, a aVar2) {
            float f10 = aVar.f9151c;
            float f11 = aVar2.f9151c;
            if (f10 < f11) {
                return -1;
            }
            if (f11 < f10) {
                return 1;
            }
            return 0;
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
            float f10 = aVar.f9151c;
            float f11 = aVar2.f9151c;
            if (f10 < f11) {
                return -1;
            }
            if (f11 < f10) {
                return 1;
            }
            return 0;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final int f9139c = -1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f9140d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final int f9141e = 1;
    private static final int f = 5;

    /* renamed from: g, reason: collision with root package name */
    private final int f9142g;

    /* renamed from: k, reason: collision with root package name */
    private int f9146k;

    /* renamed from: l, reason: collision with root package name */
    private int f9147l;

    /* renamed from: m, reason: collision with root package name */
    private int f9148m;

    /* renamed from: i, reason: collision with root package name */
    private final a[] f9144i = new a[5];

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList<a> f9143h = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    private int f9145j = -1;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f9149a;

        /* renamed from: b, reason: collision with root package name */
        public int f9150b;

        /* renamed from: c, reason: collision with root package name */
        public float f9151c;

        private a() {
        }

        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    public y(int i10) {
        this.f9142g = i10;
    }

    private void b() {
        if (this.f9145j != 1) {
            Collections.sort(this.f9143h, f9137a);
            this.f9145j = 1;
        }
    }

    private void c() {
        if (this.f9145j != 0) {
            Collections.sort(this.f9143h, f9138b);
            this.f9145j = 0;
        }
    }

    public final void a(int i10, float f10) {
        a aVar;
        if (this.f9145j != 1) {
            Collections.sort(this.f9143h, f9137a);
            this.f9145j = 1;
        }
        int i11 = this.f9148m;
        byte b10 = 0;
        if (i11 > 0) {
            a[] aVarArr = this.f9144i;
            int i12 = i11 - 1;
            this.f9148m = i12;
            aVar = aVarArr[i12];
        } else {
            aVar = new a(b10);
        }
        int i13 = this.f9146k;
        this.f9146k = i13 + 1;
        aVar.f9149a = i13;
        aVar.f9150b = i10;
        aVar.f9151c = f10;
        this.f9143h.add(aVar);
        this.f9147l += i10;
        while (true) {
            int i14 = this.f9147l;
            int i15 = this.f9142g;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            a aVar2 = this.f9143h.get(0);
            int i17 = aVar2.f9150b;
            if (i17 <= i16) {
                this.f9147l -= i17;
                this.f9143h.remove(0);
                int i18 = this.f9148m;
                if (i18 < 5) {
                    a[] aVarArr2 = this.f9144i;
                    this.f9148m = i18 + 1;
                    aVarArr2[i18] = aVar2;
                }
            } else {
                aVar2.f9150b = i17 - i16;
                this.f9147l -= i16;
            }
        }
    }

    public final float a() {
        if (this.f9145j != 0) {
            Collections.sort(this.f9143h, f9138b);
            this.f9145j = 0;
        }
        float f10 = this.f9147l * 0.5f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f9143h.size(); i11++) {
            a aVar = this.f9143h.get(i11);
            i10 += aVar.f9150b;
            if (i10 >= f10) {
                return aVar.f9151c;
            }
        }
        if (this.f9143h.isEmpty()) {
            return Float.NaN;
        }
        return this.f9143h.get(r0.size() - 1).f9151c;
    }
}
