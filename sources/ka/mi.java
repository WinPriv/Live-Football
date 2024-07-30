package ka;

import android.content.Context;
import ka.qi;

/* loaded from: classes2.dex */
public final class mi implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f31468s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.huawei.openalliance.ad.ppskit.utils.q1 f31469t;

    /* loaded from: classes2.dex */
    public class a extends qi.e {
        public a() {
        }

        @Override // ka.qi.e
        public final void a() {
            n7.e("NonHmsOaidAccessor", "onOaidAcquireFailed");
            com.huawei.openalliance.ad.ppskit.utils.q1 q1Var = mi.this.f31469t;
            if (q1Var != null) {
                q1Var.q(null, null);
            }
        }

        @Override // ka.qi.e
        public final void b(String str, boolean z10) {
            n7.e("NonHmsOaidAccessor", "onOaidAcquired");
            com.huawei.openalliance.ad.ppskit.utils.q1 q1Var = mi.this.f31469t;
            if (q1Var != null) {
                q1Var.q(str, Boolean.valueOf(z10));
            }
        }
    }

    public mi(Context context, com.huawei.openalliance.ad.ppskit.utils.q1 q1Var) {
        this.f31468s = context;
        this.f31469t = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qi qiVar;
        Context context = this.f31468s;
        synchronized (qi.f31700l) {
            if (qi.f31699k == null) {
                qi.f31699k = new qi(context);
            }
            qiVar = qi.f31699k;
        }
        qiVar.b(new a());
    }
}
