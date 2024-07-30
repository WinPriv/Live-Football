package ka;

/* loaded from: classes2.dex */
public final class tb implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ub f31882s;

    public tb(ub ubVar, String str) {
        this.f31882s = ubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ub ubVar = this.f31882s;
        synchronized (ubVar) {
            n7.e("AppDataCollectionManager", "report App Install List to Ads Server");
            new rd(ubVar.f31945a).b(com.huawei.openalliance.ad.ppskit.utils.m.G());
        }
    }
}
