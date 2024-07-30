package rc;

/* loaded from: classes2.dex */
public final class a extends c {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f34990s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Runnable f34991t;

    public a(long j10, Runnable runnable) {
        this.f34990s = j10;
        this.f34991t = runnable;
    }

    @Override // rc.c
    public final void a() {
        try {
            Thread.sleep(this.f34990s);
        } catch (InterruptedException unused) {
        }
        this.f34991t.run();
    }
}
