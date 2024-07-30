package ka;

/* loaded from: classes2.dex */
public final class wi {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f32147a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32148b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32149c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f32150d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f32151e;

    public wi(String str, boolean z10, boolean z11) {
        this.f32151e = 0;
        this.f32147a = z10;
        this.f32148b = z11;
        this.f32149c = str;
    }

    public wi(boolean z10, boolean z11, String str, int i10) {
        this(str, z10, z11);
        this.f32150d = Integer.valueOf(i10);
    }
}
