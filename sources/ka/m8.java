package ka;

/* loaded from: classes2.dex */
public final class m8 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f31458s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w7 f31459t;

    public m8(w7 w7Var, boolean z10) {
        this.f31459t = w7Var;
        this.f31458s = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31459t.p(this.f31458s);
    }
}
