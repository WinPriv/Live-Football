package ha;

import com.huawei.hms.ads.ex;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f28790s;

    public a(b bVar) {
        this.f28790s = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = this.f28790s;
        ex.V(bVar.a(), "unbindService");
        try {
            d dVar = (d) bVar.f28791a;
            synchronized (dVar) {
                dVar.f28804d.unbindService(dVar.f);
                dVar.f28802b = null;
            }
        } catch (Throwable th) {
            ex.I("Monitor", "unbindService err: %s", th.getClass().getSimpleName());
        }
    }
}
