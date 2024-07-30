package ka;

/* loaded from: classes2.dex */
public final class yc implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f32217s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ad f32218t;

    public yc(ad adVar, String str) {
        this.f32218t = adVar;
        this.f32217s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fc.a(this.f32218t.f30934a, this.f32217s, "appInstallList");
    }
}
