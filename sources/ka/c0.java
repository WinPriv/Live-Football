package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdTimeStatistics;
import com.huawei.openalliance.ad.ppskit.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c0 extends y {

    /* renamed from: b, reason: collision with root package name */
    public long f31013b;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f31014s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f31015t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f31016u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f31017v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ com.huawei.android.hms.ppskit.a f31018w;

        public a(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
            this.f31014s = context;
            this.f31015t = str;
            this.f31016u = str2;
            this.f31017v = str3;
            this.f31018w = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                c0.this.h(this.f31014s, this.f31015t, this.f31016u, this.f31017v, this.f31018w);
            } catch (Throwable th) {
                n7.f31494a.getClass();
                y.d(this.f31018w, c0.this.f32203a, -1, th.getClass().getSimpleName() + com.huawei.openalliance.ad.constant.w.bE + th.getMessage());
            }
        }
    }

    public c0(String str) {
        super(str);
    }

    public static void g(DelayInfo delayInfo, long j10, long j11, long j12) {
        if (delayInfo == null) {
            return;
        }
        AdTimeStatistics E = delayInfo.E();
        E.b(j10);
        E.m(j11);
        E.o(j12);
    }

    @Override // ka.y, ka.b2
    public void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        this.f31013b = System.currentTimeMillis();
        com.huawei.openalliance.ad.ppskit.handlers.d a10 = com.huawei.openalliance.ad.ppskit.handlers.d.a(context);
        a10.getClass();
        com.huawei.openalliance.ad.ppskit.utils.p2.g(new com.huawei.openalliance.ad.ppskit.handlers.c(a10, str));
        com.huawei.openalliance.ad.ppskit.utils.p2.a(new a(context, str, str2, str3, aVar), 1);
    }

    public final void f(com.huawei.android.hms.ppskit.a aVar, AdContentRsp adContentRsp) {
        if (adContentRsp != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.huawei.openalliance.ad.constant.ba.f22055c, adContentRsp.E());
                y.d(aVar, this.f32203a, 201, jSONObject.toString());
            } catch (Throwable th) {
                e0.i.p(th, "responseAdConfig ", "CmdBaseAdRequest");
            }
        }
    }

    @Override // ka.y, ka.b2
    public int b() {
        return 12;
    }

    public void h(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
    }
}
