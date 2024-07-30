package y5;

import android.text.Layout;

/* compiled from: TtmlStyle.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public String f36747a;

    /* renamed from: b, reason: collision with root package name */
    public int f36748b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f36749c;

    /* renamed from: d, reason: collision with root package name */
    public int f36750d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f36751e;

    /* renamed from: k, reason: collision with root package name */
    public float f36756k;

    /* renamed from: l, reason: collision with root package name */
    public String f36757l;
    public Layout.Alignment o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f36760p;

    /* renamed from: r, reason: collision with root package name */
    public b f36762r;
    public int f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f36752g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f36753h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f36754i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f36755j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f36758m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f36759n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f36761q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f36763s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f36749c && fVar.f36749c) {
                this.f36748b = fVar.f36748b;
                this.f36749c = true;
            }
            if (this.f36753h == -1) {
                this.f36753h = fVar.f36753h;
            }
            if (this.f36754i == -1) {
                this.f36754i = fVar.f36754i;
            }
            if (this.f36747a == null && (str = fVar.f36747a) != null) {
                this.f36747a = str;
            }
            if (this.f == -1) {
                this.f = fVar.f;
            }
            if (this.f36752g == -1) {
                this.f36752g = fVar.f36752g;
            }
            if (this.f36759n == -1) {
                this.f36759n = fVar.f36759n;
            }
            if (this.o == null && (alignment2 = fVar.o) != null) {
                this.o = alignment2;
            }
            if (this.f36760p == null && (alignment = fVar.f36760p) != null) {
                this.f36760p = alignment;
            }
            if (this.f36761q == -1) {
                this.f36761q = fVar.f36761q;
            }
            if (this.f36755j == -1) {
                this.f36755j = fVar.f36755j;
                this.f36756k = fVar.f36756k;
            }
            if (this.f36762r == null) {
                this.f36762r = fVar.f36762r;
            }
            if (this.f36763s == Float.MAX_VALUE) {
                this.f36763s = fVar.f36763s;
            }
            if (!this.f36751e && fVar.f36751e) {
                this.f36750d = fVar.f36750d;
                this.f36751e = true;
            }
            if (this.f36758m == -1 && (i10 = fVar.f36758m) != -1) {
                this.f36758m = i10;
            }
        }
    }
}
