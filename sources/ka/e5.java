package ka;

/* loaded from: classes2.dex */
public final class e5 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31116s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f5 f31117t;

    public e5(f5 f5Var, String str) {
        this.f31117t = f5Var;
        this.f31116s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31117t.c(this.f31116s, false);
    }
}
