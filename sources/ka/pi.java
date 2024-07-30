package ka;

/* loaded from: classes2.dex */
public final class pi implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ qi f31666s;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            n7.e("OAIDServiceManager", "bind timeout " + System.currentTimeMillis());
            pi piVar = pi.this;
            qi qiVar = piVar.f31666s;
            synchronized (qiVar.f31706e) {
                qiVar.f31705d = true;
            }
            piVar.f31666s.c();
        }
    }

    public pi(qi qiVar) {
        this.f31666s = qiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.huawei.openalliance.ad.ppskit.utils.p2.d(new a());
    }
}
