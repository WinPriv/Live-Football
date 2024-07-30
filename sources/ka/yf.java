package ka;

/* loaded from: classes2.dex */
public final class yf implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f32230s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zf f32231t;

    public yf(zf zfVar, String str) {
        this.f32231t = zfVar;
        this.f32230s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zf.g(this.f32231t, this.f32230s);
    }
}
