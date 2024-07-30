package ka;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;
import ka.qi;

/* loaded from: classes2.dex */
public final class ni implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f31517s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.huawei.openalliance.ad.ppskit.utils.q1 f31518t;

    /* loaded from: classes2.dex */
    public class a implements d7<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f31519a;

        public a(AtomicInteger atomicInteger) {
            this.f31519a = atomicInteger;
        }

        @Override // ka.d7
        public final void a(y6 y6Var) {
            AtomicInteger atomicInteger = this.f31519a;
            atomicInteger.incrementAndGet();
            if (y6Var.f32210b == 200) {
                n7.e("NonHmsOaidAccessor", "requestUuid success");
                ni niVar = ni.this;
                niVar.f31518t.P((String) y6Var.f32211c);
                if (atomicInteger.get() >= 2) {
                    niVar.f31518t.N(androidx.transition.n.Q(com.huawei.openalliance.ad.ppskit.utils.m.C() + com.huawei.openalliance.ad.ppskit.utils.m.q(niVar.f31517s)));
                    return;
                }
                return;
            }
            n7.e("NonHmsOaidAccessor", "requestUuid failed");
        }
    }

    /* loaded from: classes2.dex */
    public class b extends qi.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f31521a;

        public b(AtomicInteger atomicInteger) {
            this.f31521a = atomicInteger;
        }

        @Override // ka.qi.e
        public final void a() {
            n7.e("NonHmsOaidAccessor", "onOaidAcquireFailed");
            ni.this.f31518t.q(null, null);
        }

        @Override // ka.qi.e
        public final void b(String str, boolean z10) {
            n7.e("NonHmsOaidAccessor", "onOaidAcquired");
            ni niVar = ni.this;
            niVar.f31518t.q(str, Boolean.valueOf(z10));
            AtomicInteger atomicInteger = this.f31521a;
            atomicInteger.incrementAndGet();
            if (atomicInteger.get() >= 2) {
                niVar.f31518t.N(androidx.transition.n.Q(com.huawei.openalliance.ad.ppskit.utils.m.C() + com.huawei.openalliance.ad.ppskit.utils.m.q(niVar.f31517s)));
            }
        }
    }

    public ni(Context context, com.huawei.openalliance.ad.ppskit.utils.q1 q1Var) {
        this.f31517s = context;
        this.f31518t = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qi qiVar;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Context context = this.f31517s;
        c7.l(context).k("queryUUID", "", new a(atomicInteger), String.class);
        if (Cif.c(context)) {
            synchronized (qi.f31700l) {
                if (qi.f31699k == null) {
                    qi.f31699k = new qi(context);
                }
                qiVar = qi.f31699k;
            }
            qiVar.b(new b(atomicInteger));
            return;
        }
        String E = a0.a.E(context);
        boolean isEmpty = TextUtils.isEmpty(E);
        com.huawei.openalliance.ad.ppskit.utils.q1 q1Var = this.f31518t;
        if (!isEmpty) {
            n7.e("NonHmsOaidAccessor", "resetCloneId, oaid acquired.");
            q1Var.q(E, Boolean.FALSE);
            atomicInteger.incrementAndGet();
            if (atomicInteger.get() >= 2) {
                q1Var.N(androidx.transition.n.Q(com.huawei.openalliance.ad.ppskit.utils.m.C() + com.huawei.openalliance.ad.ppskit.utils.m.q(context)));
                return;
            }
            return;
        }
        n7.e("NonHmsOaidAccessor", "resetCloneId, oaid acquire failed.");
        q1Var.q(null, null);
    }
}
