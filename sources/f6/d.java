package f6;

/* compiled from: Projection.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final a f28115a;

    /* renamed from: b, reason: collision with root package name */
    public final a f28116b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28117c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28118d;

    /* compiled from: Projection.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final b[] f28119a;

        public a(b... bVarArr) {
            this.f28119a = bVarArr;
        }
    }

    /* compiled from: Projection.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f28120a;

        /* renamed from: b, reason: collision with root package name */
        public final int f28121b;

        /* renamed from: c, reason: collision with root package name */
        public final float[] f28122c;

        /* renamed from: d, reason: collision with root package name */
        public final float[] f28123d;

        public b(int i10, float[] fArr, float[] fArr2, int i11) {
            boolean z10;
            this.f28120a = i10;
            if (fArr.length * 2 == fArr2.length * 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            d6.a.a(z10);
            this.f28122c = fArr;
            this.f28123d = fArr2;
            this.f28121b = i11;
        }
    }

    public d() {
        throw null;
    }

    public d(a aVar, a aVar2, int i10) {
        this.f28115a = aVar;
        this.f28116b = aVar2;
        this.f28117c = i10;
        this.f28118d = aVar == aVar2;
    }
}
