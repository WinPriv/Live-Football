package ka;

/* loaded from: classes2.dex */
public final class je implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31332s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ke f31333t;

    public je(ke keVar, String str) {
        this.f31333t = keVar;
        this.f31332s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ke keVar = this.f31333t;
        if (keVar.f31382b == null) {
            n7.i("EventProcessor", "contentRecord is null, can't report HA show event");
        } else {
            a0.a.S(keVar.f31386g, ke.w(keVar), "$DisplayAd", keVar.f31382b.p2(), this.f31332s);
        }
    }
}
