package ka;

import android.content.Context;
import android.util.Pair;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.inner.NativeAdReqParam;
import com.huawei.openalliance.ad.ppskit.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ka.af;
import ka.n1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class i1 extends c0 {

    /* loaded from: classes2.dex */
    public static class a implements af.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.huawei.android.hms.ppskit.a f31264a;

        /* renamed from: b, reason: collision with root package name */
        public final String f31265b;

        /* renamed from: c, reason: collision with root package name */
        public final DelayInfo f31266c;

        public a(com.huawei.android.hms.ppskit.a aVar, String str, DelayInfo delayInfo) {
            this.f31264a = aVar;
            this.f31265b = str;
            this.f31266c = delayInfo;
        }

        @Override // ka.af.a
        public final void a(int i10, boolean z10) {
            y.d(this.f31264a, this.f31265b, i10, String.valueOf(z10));
        }

        @Override // ka.af.a
        public final void a(HashMap hashMap) {
            AdContentData adContentData;
            DelayInfo delayInfo = this.f31266c;
            if (delayInfo != null && !a0.a.e0(hashMap)) {
                Iterator it = hashMap.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    List list = (List) ((Map.Entry) it.next()).getValue();
                    if (!androidx.transition.n.M(list) && (adContentData = (AdContentData) list.get(0)) != null) {
                        adContentData.g(delayInfo);
                        break;
                    }
                }
            }
            y.d(this.f31264a, this.f31265b, 200, com.huawei.openalliance.ad.ppskit.utils.y0.q(null, hashMap));
        }

        @Override // ka.af.a
        public final void a(List<String> list) {
            String q10 = com.huawei.openalliance.ad.ppskit.utils.y0.q(null, list);
            y.d(this.f31264a, this.f31265b, 602, q10);
        }
    }

    public i1() {
        super("reqNativeAd");
    }

    @Override // ka.c0
    public final void h(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        long j10;
        long j11;
        JSONObject jSONObject = new JSONObject(str3);
        String string = jSONObject.getString(com.huawei.openalliance.ad.constant.ba.I);
        String string2 = jSONObject.getString("content");
        AdSlotParam adSlotParam = (AdSlotParam) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, string, AdSlotParam.class, new Class[0]);
        NativeAdReqParam nativeAdReqParam = (NativeAdReqParam) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, string2, NativeAdReqParam.class, new Class[0]);
        long currentTimeMillis = System.currentTimeMillis();
        n7.e("CmdReqNativeAd", "doRequestAd " + currentTimeMillis);
        Pair c02 = androidx.activity.n.c0(context, str);
        if (c02 != null) {
            adSlotParam.C((String) c02.first);
            adSlotParam.D(((Boolean) c02.second).booleanValue());
        }
        ad adVar = new ad(context);
        DelayInfo delayInfo = adVar.f30939g;
        c0.g(delayInfo, nativeAdReqParam.a(), jSONObject.optLong(com.huawei.openalliance.ad.constant.ba.K), this.f31013b);
        adVar.f = str2;
        int T = adSlotParam.T();
        AdContentRsp e10 = adVar.e(str, adSlotParam, nativeAdReqParam.b(), T, nativeAdReqParam.f());
        n7.e("CmdReqNativeAd", "doRequestAd, ad loaded,adType is " + T);
        af afVar = new af(context, new a(aVar, this.f32203a, delayInfo));
        afVar.f30964l = T;
        afVar.f30963k = str2;
        afVar.f30960h = nativeAdReqParam.c();
        afVar.f30961i = nativeAdReqParam.d();
        afVar.f30962j = nativeAdReqParam.e();
        afVar.f30965m = adSlotParam.Z();
        delayInfo.E().j(System.currentTimeMillis());
        afVar.a(str, e10, currentTimeMillis);
        o1.i(context, str, str2);
        if (T == 3) {
            adVar.g(str, e10, new n1.a(str2), T, currentTimeMillis, false);
            AdSlotParam u2 = adSlotParam.u();
            u2.E();
            n1.f31473c.put(str, u2);
            String b10 = nativeAdReqParam.b();
            com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
            synchronized (d10.f22585a) {
                j10 = 0;
                j11 = d10.G(str).getLong("last_preload_native_time", 0L);
            }
            Long valueOf = Long.valueOf(j11);
            long A = d10.A(str) * com.huawei.openalliance.ad.constant.w.f22171t;
            if (valueOf != null) {
                j10 = valueOf.longValue();
            }
            if (System.currentTimeMillis() - j10 < A) {
                StringBuilder k10 = com.ironsource.adapters.facebook.a.k("request time limit, timeInter=", A, ", lastTime=");
                k10.append(j10);
                k10.append(" callerPkg: ");
                k10.append(str);
                n7.e("CmdReqPreNativeAd", k10.toString());
                return;
            }
            com.huawei.openalliance.ad.ppskit.utils.p2.a(new m1(context, T, str, str2, b10), 1);
        }
    }
}
