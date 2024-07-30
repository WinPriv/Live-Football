package h3;

/* compiled from: DownsampleStrategy.java */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final e f28702a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f28703b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f28704c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f28705d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f28706e;
    public static final y2.f<l> f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f28707g;

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes.dex */
    public static class a extends l {
        @Override // h3.l
        public final int a(int i10, int i11, int i12, int i13) {
            return 2;
        }

        @Override // h3.l
        public final float b(int i10, int i11, int i12, int i13) {
            if (Math.min(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes.dex */
    public static class b extends l {
        @Override // h3.l
        public final int a(int i10, int i11, int i12, int i13) {
            return 1;
        }

        @Override // h3.l
        public final float b(int i10, int i11, int i12, int i13) {
            int ceil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            int i14 = 1;
            if (Math.max(1, Integer.highestOneBit(ceil)) >= ceil) {
                i14 = 0;
            }
            return 1.0f / (r2 << i14);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes.dex */
    public static class c extends l {
        @Override // h3.l
        public final int a(int i10, int i11, int i12, int i13) {
            if (b(i10, i11, i12, i13) == 1.0f) {
                return 2;
            }
            return l.f28702a.a(i10, i11, i12, i13);
        }

        @Override // h3.l
        public final float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, l.f28702a.b(i10, i11, i12, i13));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes.dex */
    public static class d extends l {
        @Override // h3.l
        public final int a(int i10, int i11, int i12, int i13) {
            return 2;
        }

        @Override // h3.l
        public final float b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes.dex */
    public static class e extends l {
        @Override // h3.l
        public final int a(int i10, int i11, int i12, int i13) {
            if (l.f28707g) {
                return 2;
            }
            return 1;
        }

        @Override // h3.l
        public final float b(int i10, int i11, int i12, int i13) {
            if (l.f28707g) {
                return Math.min(i12 / i10, i13 / i11);
            }
            if (Math.max(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes.dex */
    public static class f extends l {
        @Override // h3.l
        public final int a(int i10, int i11, int i12, int i13) {
            return 2;
        }

        @Override // h3.l
        public final float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    static {
        new a();
        new b();
        f28702a = new e();
        f28703b = new c();
        d dVar = new d();
        f28704c = dVar;
        f28705d = new f();
        f28706e = dVar;
        f = y2.f.a(dVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f28707g = true;
    }

    public abstract int a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
