package ka;

/* loaded from: classes2.dex */
public final class n9 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f31497a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31498b = false;

    /* renamed from: c, reason: collision with root package name */
    public long f31499c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f31500d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final String f31501e;

    public n9(String str) {
        this.f31501e = "VideoMonitor_".concat(str);
    }

    public final void a() {
        if (n7.d()) {
            n7.b(this.f31501e, "onPlayStart");
        }
        if (!this.f31498b) {
            this.f31498b = true;
            this.f31500d = System.currentTimeMillis();
        }
    }

    public final void b() {
        if (n7.d()) {
            n7.b(this.f31501e, "onBufferStart");
        }
        if (!this.f31497a) {
            this.f31497a = true;
            this.f31499c = System.currentTimeMillis();
        }
    }

    public final void c() {
        if (n7.d()) {
            n7.b(this.f31501e, "onVideoEnd");
        }
        this.f31498b = false;
        this.f31497a = false;
        this.f31499c = 0L;
        this.f31500d = 0L;
    }
}
