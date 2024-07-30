package ka;

/* loaded from: classes2.dex */
public final class ne implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31512s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ke f31513t;

    public ne(ke keVar, String str) {
        this.f31513t = keVar;
        this.f31512s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ke keVar = this.f31513t;
        if (keVar.f31382b == null) {
            n7.i("EventProcessor", "contentRecord is null, can't report HA show event");
        } else {
            a0.a.S(keVar.f31386g, ke.w(keVar), "$ClickAd", keVar.f31382b.p2(), this.f31512s);
        }
    }
}
