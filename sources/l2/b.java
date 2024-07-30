package l2;

import android.graphics.PointF;
import e0.i;

/* compiled from: DocumentData.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f32320a;

    /* renamed from: b, reason: collision with root package name */
    public String f32321b;

    /* renamed from: c, reason: collision with root package name */
    public float f32322c;

    /* renamed from: d, reason: collision with root package name */
    public int f32323d;

    /* renamed from: e, reason: collision with root package name */
    public int f32324e;
    public float f;

    /* renamed from: g, reason: collision with root package name */
    public float f32325g;

    /* renamed from: h, reason: collision with root package name */
    public int f32326h;

    /* renamed from: i, reason: collision with root package name */
    public int f32327i;

    /* renamed from: j, reason: collision with root package name */
    public float f32328j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f32329k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f32330l;

    /* renamed from: m, reason: collision with root package name */
    public PointF f32331m;

    public b(String str, String str2, float f, int i10, int i11, float f10, float f11, int i12, int i13, float f12, boolean z10, PointF pointF, PointF pointF2) {
        this.f32320a = str;
        this.f32321b = str2;
        this.f32322c = f;
        this.f32323d = i10;
        this.f32324e = i11;
        this.f = f10;
        this.f32325g = f11;
        this.f32326h = i12;
        this.f32327i = i13;
        this.f32328j = f12;
        this.f32329k = z10;
        this.f32330l = pointF;
        this.f32331m = pointF2;
    }

    public final int hashCode() {
        int c10 = ((s.f.c(this.f32323d) + (((int) (i.b(this.f32321b, this.f32320a.hashCode() * 31, 31) + this.f32322c)) * 31)) * 31) + this.f32324e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f);
        return (((c10 * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f32326h;
    }

    public b() {
    }
}
