package androidx.appcompat.widget;

/* compiled from: RtlSpacingHelper.java */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public int f1166a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1167b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1168c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f1169d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f1170e = 0;
    public int f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1171g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1172h = false;

    public final void a(int i10, int i11) {
        this.f1168c = i10;
        this.f1169d = i11;
        this.f1172h = true;
        if (this.f1171g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1166a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1167b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1166a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1167b = i11;
        }
    }
}
