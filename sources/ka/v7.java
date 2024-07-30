package ka;

/* loaded from: classes2.dex */
public final class v7 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f31992s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w7 f31993t;

    public v7(w7 w7Var, float f) {
        this.f31993t = w7Var;
        this.f31992s = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w7 w7Var = this.f31993t;
        float f = this.f31992s;
        n7.c("MediaPlayerAgent", "setSoundVolume %f result: %s", Float.valueOf(f), Boolean.valueOf(w7Var.n(f)));
    }
}
