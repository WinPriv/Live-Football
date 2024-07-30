package ka;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.inner.SplashAdReqParam;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Content;
import com.huawei.openalliance.ad.ppskit.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class r1 extends c0 {

    /* loaded from: classes2.dex */
    public class a implements jg {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f31724a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DelayInfo f31725b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f31726c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f31727d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.huawei.android.hms.ppskit.a f31728e;

        public a(Context context, DelayInfo delayInfo, String str, String str2, com.huawei.android.hms.ppskit.a aVar) {
            this.f31724a = context;
            this.f31725b = delayInfo;
            this.f31726c = str;
            this.f31727d = str2;
            this.f31728e = aVar;
        }

        public final void a(ContentRecord contentRecord) {
            boolean z10;
            long j10;
            int i10;
            StringBuilder sb2 = new StringBuilder("onDownloaded content is null ? ");
            boolean z11 = false;
            if (contentRecord == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            n7.e("CmdReqSplashAd", sb2.toString());
            String str = "";
            if (contentRecord != null) {
                AdContentData f = AdContentData.f(this.f31724a, contentRecord);
                if (f != null) {
                    this.f31725b.E().p(System.currentTimeMillis());
                    f.g(this.f31725b);
                }
                str = com.huawei.openalliance.ad.ppskit.utils.y0.q(null, f);
            }
            com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(this.f31724a);
            if (TextUtils.equals(String.valueOf(2), this.f31726c) || TextUtils.equals(String.valueOf(3), this.f31726c)) {
                String str2 = this.f31727d;
                HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (d10.f22585a) {
                    j10 = d10.G(str2).getLong("no_show_ad_time", 0L);
                }
                if (j10 >= currentTimeMillis) {
                    n7.e("AppDayFcRule", "disturb is triggered");
                    z11 = true;
                }
                if (z11) {
                    n7.g("CmdReqSplashAd", "isTriggerDisturb, ignore");
                    if (contentRecord != null) {
                        this.f31725b.f(496);
                    }
                    str = "";
                }
            }
            Integer G = this.f31725b.G();
            if (TextUtils.isEmpty(str)) {
                if (G == null) {
                    i10 = -1;
                } else {
                    i10 = G.intValue();
                }
            } else {
                i10 = 200;
            }
            y.d(this.f31728e, r1.this.f32203a, i10, str);
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements ng {

        /* renamed from: a, reason: collision with root package name */
        public final String f31729a;

        /* renamed from: b, reason: collision with root package name */
        public final int f31730b;

        /* renamed from: c, reason: collision with root package name */
        public final Context f31731c;

        public b(Context context, String str, int i10) {
            this.f31729a = str;
            this.f31730b = i10;
            this.f31731c = context.getApplicationContext();
        }

        @Override // ka.ng
        public final ArrayList a(String str, AdContentRsp adContentRsp, int i10) {
            return androidx.transition.n.T(str, this.f31729a, adContentRsp, i10);
        }

        @Override // ka.ng
        public final ArrayList b(String str, AdContentRsp adContentRsp, int i10) {
            ArrayList y = androidx.transition.n.y(str, this.f31729a, adContentRsp, i10);
            if (i10 != 16) {
                com.huawei.openalliance.ad.ppskit.utils.p2.a(new t1(this.f31730b, 1, this.f31731c, adContentRsp.n(), y, false), 5);
            }
            return y;
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements ng {

        /* renamed from: a, reason: collision with root package name */
        public final Context f31732a;

        /* renamed from: b, reason: collision with root package name */
        public final String f31733b;

        /* renamed from: c, reason: collision with root package name */
        public final int f31734c;

        /* renamed from: d, reason: collision with root package name */
        public final int f31735d;

        public c(Context context, String str, int i10, int i11) {
            this.f31732a = context.getApplicationContext();
            this.f31733b = str;
            this.f31734c = i10;
            this.f31735d = i11;
        }

        @Override // ka.ng
        public final ArrayList a(String str, AdContentRsp adContentRsp, int i10) {
            return androidx.transition.n.T(str, this.f31733b, adContentRsp, i10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
        
            if (r2.o0() == 12) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
        
            if (r2.A() == 0) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00a6, code lost:
        
            r6 = r2;
            r13 = true;
         */
        @Override // ka.ng
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.ArrayList b(java.lang.String r22, com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp r23, int r24) {
            /*
                Method dump skipped, instructions count: 330
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ka.r1.c.b(java.lang.String, com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp, int):java.util.ArrayList");
        }

        public final ArrayList c(String str, AdContentRsp adContentRsp, Content content, Content content2, String str2, String str3, int i10) {
            r4.a(str, null);
            if (content != null) {
                content.g0(adContentRsp.C(), i10);
                r4.c(bf.c(str, this.f31733b, str2, content, i10, str3), str);
            } else {
                r4.c(null, str);
            }
            if (content2 == null) {
                return null;
            }
            String str4 = this.f31733b;
            ArrayList arrayList = new ArrayList();
            arrayList.add(r1.i(adContentRsp, str2, content2, str, str4, str3, i10));
            return arrayList;
        }
    }

    public r1() {
        super(com.huawei.openalliance.ad.constant.w.cg);
    }

    public static ContentRecord i(AdContentRsp adContentRsp, String str, Content content, String str2, String str3, String str4, int i10) {
        if (content != null) {
            content.g0(adContentRsp.C(), i10);
            ContentRecord c10 = bf.c(str2, str3, str, content, i10, str4);
            if (c10 != null) {
                c10.P(adContentRsp.K());
                c10.W(adContentRsp.O());
                c10.D(adContentRsp.n());
            }
            return c10;
        }
        return null;
    }

    @Override // ka.c0, ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        long j10;
        int i10;
        long currentTimeMillis = System.currentTimeMillis();
        com.huawei.openalliance.ad.ppskit.handlers.d a10 = com.huawei.openalliance.ad.ppskit.handlers.d.a(context);
        a10.getClass();
        com.huawei.openalliance.ad.ppskit.utils.p2.g(new com.huawei.openalliance.ad.ppskit.handlers.c(a10, str));
        n7.e("CmdReqSplashAd", "doAdRequest " + currentTimeMillis);
        JSONObject jSONObject = new JSONObject(str3);
        String string = jSONObject.getString(com.huawei.openalliance.ad.constant.ba.I);
        String string2 = jSONObject.getString("content");
        SplashAdReqParam splashAdReqParam = (SplashAdReqParam) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, string2, SplashAdReqParam.class, new Class[0]);
        if (splashAdReqParam != null) {
            string2 = splashAdReqParam.b();
            j10 = splashAdReqParam.a();
        } else {
            j10 = 0;
        }
        String str4 = string2;
        AdSlotParam adSlotParam = (AdSlotParam) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, string, AdSlotParam.class, new Class[0]);
        String valueOf = adSlotParam.c0() != null ? String.valueOf(adSlotParam.c0()) : null;
        if (adSlotParam.T() != 1 && adSlotParam.T() != 18) {
            adSlotParam.J(1);
        }
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
        synchronized (d10.f22585a) {
            d10.G(str).edit().putString("allow_mobile_traffic", valueOf).commit();
        }
        LruCache<String, AdSlotParam> lruCache = o1.f31582c;
        lruCache.put(str, adSlotParam.u());
        Pair c02 = androidx.activity.n.c0(context, str);
        if (c02 != null) {
            adSlotParam.C((String) c02.first);
            adSlotParam.D(((Boolean) c02.second).booleanValue());
        }
        int A = com.huawei.openalliance.ad.ppskit.utils.z1.A(str2);
        if (A == 0) {
            n7.i("CmdReqSplashAd", "doAdRequest, callerSdkVersion is wrong, please check it!");
            return;
        }
        if (A < 33) {
            adSlotParam.w();
        }
        if (n7.d()) {
            i10 = 0;
            n7.c("CmdReqSplashAd", "doAdRequest, orientation %s", Integer.valueOf(adSlotParam.B()));
        } else {
            i10 = 0;
        }
        if (adSlotParam.b() != null) {
            i10 = adSlotParam.b().intValue();
        }
        ng bVar = TextUtils.equals(String.valueOf(1), str4) ? new b(context, str2, adSlotParam.B()) : new c(context, str2, i10, adSlotParam.B());
        ad adVar = new ad(context);
        DelayInfo delayInfo = adVar.f30939g;
        c0.g(delayInfo, j10, jSONObject.optLong(com.huawei.openalliance.ad.constant.ba.K), currentTimeMillis);
        adVar.f = str2;
        r4.a(str, null);
        r4.c(null, str);
        adVar.f(str, adVar.b(adSlotParam.T(), adSlotParam, str), adSlotParam, bVar, new a(context, delayInfo, str4, str, aVar), currentTimeMillis, 0);
        AdSlotParam u2 = adSlotParam.u();
        u2.E();
        lruCache.put(str, u2);
        o1.i(context, str, str2);
    }

    @Override // ka.c0, ka.y, ka.b2
    public final int b() {
        return 7;
    }
}
