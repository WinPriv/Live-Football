package com.facebook.shimmer;

import a3.k;
import a3.l;
import android.content.res.TypedArray;
import android.graphics.RectF;
import com.huawei.hms.ads.gl;

/* compiled from: Shimmer.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f19878a = new float[4];

    /* renamed from: b, reason: collision with root package name */
    public final int[] f19879b = new int[4];

    /* renamed from: c, reason: collision with root package name */
    public int f19880c;

    /* renamed from: d, reason: collision with root package name */
    public int f19881d;

    /* renamed from: e, reason: collision with root package name */
    public int f19882e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f19883g;

    /* renamed from: h, reason: collision with root package name */
    public int f19884h;

    /* renamed from: i, reason: collision with root package name */
    public float f19885i;

    /* renamed from: j, reason: collision with root package name */
    public float f19886j;

    /* renamed from: k, reason: collision with root package name */
    public float f19887k;

    /* renamed from: l, reason: collision with root package name */
    public float f19888l;

    /* renamed from: m, reason: collision with root package name */
    public float f19889m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f19890n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f19891p;

    /* renamed from: q, reason: collision with root package name */
    public int f19892q;

    /* renamed from: r, reason: collision with root package name */
    public int f19893r;

    /* renamed from: s, reason: collision with root package name */
    public long f19894s;

    /* renamed from: t, reason: collision with root package name */
    public long f19895t;

    /* compiled from: Shimmer.java */
    /* loaded from: classes.dex */
    public static abstract class b<T extends b<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final a f19896a = new a();

        public final a a() {
            a aVar = this.f19896a;
            int i10 = aVar.f;
            int[] iArr = aVar.f19879b;
            if (i10 != 1) {
                int i11 = aVar.f19882e;
                iArr[0] = i11;
                int i12 = aVar.f19881d;
                iArr[1] = i12;
                iArr[2] = i12;
                iArr[3] = i11;
            } else {
                int i13 = aVar.f19881d;
                iArr[0] = i13;
                iArr[1] = i13;
                int i14 = aVar.f19882e;
                iArr[2] = i14;
                iArr[3] = i14;
            }
            float[] fArr = aVar.f19878a;
            if (i10 != 1) {
                fArr[0] = Math.max(((1.0f - aVar.f19887k) - aVar.f19888l) / 2.0f, gl.Code);
                fArr[1] = Math.max(((1.0f - aVar.f19887k) - 0.001f) / 2.0f, gl.Code);
                fArr[2] = Math.min(((aVar.f19887k + 1.0f) + 0.001f) / 2.0f, 1.0f);
                fArr[3] = Math.min(((aVar.f19887k + 1.0f) + aVar.f19888l) / 2.0f, 1.0f);
            } else {
                fArr[0] = 0.0f;
                fArr[1] = Math.min(aVar.f19887k, 1.0f);
                fArr[2] = Math.min(aVar.f19887k + aVar.f19888l, 1.0f);
                fArr[3] = 1.0f;
            }
            return aVar;
        }

        public T b(TypedArray typedArray) {
            boolean hasValue = typedArray.hasValue(3);
            a aVar = this.f19896a;
            if (hasValue) {
                aVar.f19890n = typedArray.getBoolean(3, aVar.f19890n);
                c();
            }
            if (typedArray.hasValue(0)) {
                aVar.o = typedArray.getBoolean(0, aVar.o);
                c();
            }
            if (typedArray.hasValue(1)) {
                aVar.f19882e = (((int) (Math.min(1.0f, Math.max(gl.Code, typedArray.getFloat(1, 0.3f))) * 255.0f)) << 24) | (aVar.f19882e & 16777215);
                c();
            }
            if (typedArray.hasValue(11)) {
                aVar.f19881d = (((int) (Math.min(1.0f, Math.max(gl.Code, typedArray.getFloat(11, 1.0f))) * 255.0f)) << 24) | (aVar.f19881d & 16777215);
                c();
            }
            if (typedArray.hasValue(7)) {
                long j10 = typedArray.getInt(7, (int) aVar.f19894s);
                if (j10 >= 0) {
                    aVar.f19894s = j10;
                    c();
                } else {
                    throw new IllegalArgumentException(k.k("Given a negative duration: ", j10));
                }
            }
            if (typedArray.hasValue(14)) {
                aVar.f19892q = typedArray.getInt(14, aVar.f19892q);
                c();
            }
            if (typedArray.hasValue(15)) {
                long j11 = typedArray.getInt(15, (int) aVar.f19895t);
                if (j11 >= 0) {
                    aVar.f19895t = j11;
                    c();
                } else {
                    throw new IllegalArgumentException(k.k("Given a negative repeat delay: ", j11));
                }
            }
            if (typedArray.hasValue(16)) {
                aVar.f19893r = typedArray.getInt(16, aVar.f19893r);
                c();
            }
            if (typedArray.hasValue(5)) {
                int i10 = typedArray.getInt(5, aVar.f19880c);
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            aVar.f19880c = 0;
                            c();
                        } else {
                            aVar.f19880c = 3;
                            c();
                        }
                    } else {
                        aVar.f19880c = 2;
                        c();
                    }
                } else {
                    aVar.f19880c = 1;
                    c();
                }
            }
            if (typedArray.hasValue(17)) {
                if (typedArray.getInt(17, aVar.f) != 1) {
                    aVar.f = 0;
                    c();
                } else {
                    aVar.f = 1;
                    c();
                }
            }
            if (typedArray.hasValue(6)) {
                float f = typedArray.getFloat(6, aVar.f19888l);
                if (f >= gl.Code) {
                    aVar.f19888l = f;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid dropoff value: " + f);
                }
            }
            if (typedArray.hasValue(9)) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(9, aVar.f19883g);
                if (dimensionPixelSize >= 0) {
                    aVar.f19883g = dimensionPixelSize;
                    c();
                } else {
                    throw new IllegalArgumentException(l.i("Given invalid width: ", dimensionPixelSize));
                }
            }
            if (typedArray.hasValue(8)) {
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, aVar.f19884h);
                if (dimensionPixelSize2 >= 0) {
                    aVar.f19884h = dimensionPixelSize2;
                    c();
                } else {
                    throw new IllegalArgumentException(l.i("Given invalid height: ", dimensionPixelSize2));
                }
            }
            if (typedArray.hasValue(13)) {
                float f10 = typedArray.getFloat(13, aVar.f19887k);
                if (f10 >= gl.Code) {
                    aVar.f19887k = f10;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid intensity value: " + f10);
                }
            }
            if (typedArray.hasValue(19)) {
                float f11 = typedArray.getFloat(19, aVar.f19885i);
                if (f11 >= gl.Code) {
                    aVar.f19885i = f11;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid width ratio: " + f11);
                }
            }
            if (typedArray.hasValue(10)) {
                float f12 = typedArray.getFloat(10, aVar.f19886j);
                if (f12 >= gl.Code) {
                    aVar.f19886j = f12;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid height ratio: " + f12);
                }
            }
            if (typedArray.hasValue(18)) {
                aVar.f19889m = typedArray.getFloat(18, aVar.f19889m);
                c();
            }
            return c();
        }

        public abstract T c();
    }

    public a() {
        new RectF();
        this.f19880c = 0;
        this.f19881d = -1;
        this.f19882e = 1291845631;
        this.f = 0;
        this.f19883g = 0;
        this.f19884h = 0;
        this.f19885i = 1.0f;
        this.f19886j = 1.0f;
        this.f19887k = gl.Code;
        this.f19888l = 0.5f;
        this.f19889m = 20.0f;
        this.f19890n = true;
        this.o = true;
        this.f19891p = true;
        this.f19892q = -1;
        this.f19893r = 1;
        this.f19894s = 1000L;
    }

    /* compiled from: Shimmer.java */
    /* renamed from: com.facebook.shimmer.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0228a extends b<C0228a> {
        public C0228a() {
            this.f19896a.f19891p = true;
        }

        @Override // com.facebook.shimmer.a.b
        public final C0228a c() {
            return this;
        }
    }

    /* compiled from: Shimmer.java */
    /* loaded from: classes.dex */
    public static class c extends b<c> {
        public c() {
            this.f19896a.f19891p = false;
        }

        @Override // com.facebook.shimmer.a.b
        public final c b(TypedArray typedArray) {
            super.b(typedArray);
            boolean hasValue = typedArray.hasValue(2);
            a aVar = this.f19896a;
            if (hasValue) {
                aVar.f19882e = (typedArray.getColor(2, aVar.f19882e) & 16777215) | (aVar.f19882e & (-16777216));
            }
            if (typedArray.hasValue(12)) {
                aVar.f19881d = typedArray.getColor(12, aVar.f19881d);
            }
            return this;
        }

        @Override // com.facebook.shimmer.a.b
        public final c c() {
            return this;
        }
    }
}
