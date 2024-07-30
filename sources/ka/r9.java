package ka;

/* loaded from: classes2.dex */
public final class r9 implements na {

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f31752s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Object f31753t;

        public a(String str, Object obj) {
            this.f31752s = str;
            this.f31753t = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            n7.f("HiAdRequestDataLogger", "upper thread name: %s request data: %s ", this.f31752s, com.huawei.openalliance.ad.ppskit.utils.y0.w(this.f31753t));
        }
    }

    @Override // ka.na
    public final void a(Object obj) {
        if (obj == null) {
            return;
        }
        com.huawei.openalliance.ad.ppskit.utils.p2.a(new a(Thread.currentThread().getName(), obj), 2);
    }
}
