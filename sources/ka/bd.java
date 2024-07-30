package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp;
import java.util.Map;
import ka.r1;

/* loaded from: classes2.dex */
public final class bd implements Runnable {
    public final /* synthetic */ jg A;
    public final /* synthetic */ ad B;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ng f30986s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f30987t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AdContentRsp f30988u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AdSlotParam f30989v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f30990w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f30991x;
    public final /* synthetic */ int y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ mg f30992z;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: ka.bd$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0420a implements Runnable {
            public RunnableC0420a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    int i10 = ad.f30933i;
                    n7.b("ad", "deleteInvalidContents");
                    ((jf) bd.this.f30992z).e();
                } catch (Throwable th) {
                    int i11 = ad.f30933i;
                    n7.h("ad", "deleteInvalidContents err: %s", th.getClass().getSimpleName());
                }
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long longValue;
            Long s10;
            com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(bd.this.B.f30934a);
            String str = bd.this.f30987t;
            synchronized (d10.f22585a) {
                Long l10 = 20L;
                Map<String, String> K = d10.K(str, false);
                if (K != null && K.get("deleteInvalidContentsDelay") != null && (s10 = com.huawei.openalliance.ad.ppskit.utils.y1.s(K.get("deleteInvalidContentsDelay"))) != null && s10.longValue() > 0) {
                    l10 = s10;
                }
                longValue = l10.longValue() * 1000;
            }
            com.huawei.openalliance.ad.ppskit.utils.f1.a(new RunnableC0420a(), longValue);
            if (bd.this.f30989v.T() == 16) {
                jf jfVar = (jf) bd.this.f30992z;
                jfVar.f31339g.h(0L);
                jfVar.f31340h.h(0L);
            } else {
                bd bdVar = bd.this;
                mg mgVar = bdVar.f30992z;
                long H = com.huawei.openalliance.ad.ppskit.handlers.l.d(bdVar.B.f30934a).H(bd.this.f30987t);
                jf jfVar2 = (jf) mgVar;
                jfVar2.f31339g.h(H);
                jfVar2.f31340h.h(H);
            }
            bd bdVar2 = bd.this;
            if (bdVar2.A == null) {
                jf jfVar3 = (jf) bdVar2.f30992z;
                jfVar3.f31339g.p();
                jfVar3.f31340h.p();
            }
        }
    }

    public bd(ad adVar, ng ngVar, String str, AdContentRsp adContentRsp, AdSlotParam adSlotParam, long j10, int i10, int i11, jf jfVar, r1.a aVar) {
        this.B = adVar;
        this.f30986s = ngVar;
        this.f30987t = str;
        this.f30988u = adContentRsp;
        this.f30989v = adSlotParam;
        this.f30990w = j10;
        this.f30991x = i10;
        this.y = i11;
        this.f30992z = jfVar;
        this.A = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.B.f30934a;
        AdSlotParam adSlotParam = this.f30989v;
        jf jfVar = new jf(context, this.f30986s.a(this.f30987t, this.f30988u, adSlotParam.T()), true, adSlotParam.T());
        int i10 = this.f30991x;
        long j10 = this.f30990w;
        int i11 = this.y;
        jfVar.a(i10, j10, i11);
        jfVar.c(j10, i11);
        ((jf) this.f30992z).c(j10, i11);
        com.huawei.openalliance.ad.ppskit.utils.p2.a(new a(), 10);
    }
}
