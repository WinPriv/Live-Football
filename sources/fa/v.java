package fa;

import android.content.Context;
import android.location.Location;
import com.huawei.hms.ads.App;
import com.huawei.hms.ads.RequestOptions;
import com.huawei.hms.ads.cz;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.jd;
import com.huawei.openalliance.ad.beans.inner.BaseAdReqParam;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.constant.ag;
import gb.r0;
import gb.w;
import gb.z;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28321a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f28322b;

    /* renamed from: c, reason: collision with root package name */
    public int f28323c = 1;

    /* renamed from: d, reason: collision with root package name */
    public ga.m f28324d;

    /* renamed from: e, reason: collision with root package name */
    public RequestOptions f28325e;
    public Location f;

    /* renamed from: g, reason: collision with root package name */
    public int f28326g;

    /* renamed from: h, reason: collision with root package name */
    public String f28327h;

    /* renamed from: i, reason: collision with root package name */
    public String f28328i;

    /* renamed from: j, reason: collision with root package name */
    public Set<String> f28329j;

    /* renamed from: k, reason: collision with root package name */
    public String f28330k;

    /* renamed from: l, reason: collision with root package name */
    public long f28331l;

    /* renamed from: m, reason: collision with root package name */
    public long f28332m;

    /* renamed from: n, reason: collision with root package name */
    public long f28333n;
    public App o;

    /* renamed from: p, reason: collision with root package name */
    public Integer f28334p;

    /* renamed from: q, reason: collision with root package name */
    public String f28335q;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f28336s;

        public a(int i10) {
            this.f28336s = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            v vVar = v.this;
            ga.m mVar = vVar.f28324d;
            vVar.f28332m = System.currentTimeMillis();
            if (mVar != null) {
                mVar.Code(this.f28336s);
            }
            cz.Code(vVar.f28321a, this.f28336s, vVar.f28330k, 7, null, vVar.f28331l, vVar.f28332m, vVar.f28333n);
        }
    }

    public v(Context context, String[] strArr) {
        if (!r0.c(context)) {
            this.f28322b = new String[0];
            return;
        }
        this.f28321a = context.getApplicationContext();
        if (strArr != null && strArr.length > 0) {
            String[] strArr2 = new String[strArr.length];
            this.f28322b = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            return;
        }
        this.f28322b = new String[0];
    }

    public final void a(int i10) {
        this.f28331l = System.currentTimeMillis();
        ex.V("RewardAdLoader", "loadAds");
        Context context = this.f28321a;
        if (!r0.c(context)) {
            b(1001);
            return;
        }
        if (2 == this.f28323c) {
            ex.V("RewardAdLoader", "waiting for request finish");
            b(901);
            return;
        }
        String[] strArr = this.f28322b;
        if (strArr != null && strArr.length != 0) {
            if (this.o != null && !r0.g(context)) {
                ex.I("RewardAdLoader", "hms ver not support set appInfo.");
                b(ag.T);
                return;
            }
            gb.e.b(context, this.f28325e);
            this.f28323c = 2;
            AdSlotParam.a aVar = new AdSlotParam.a();
            aVar.f21964a = Arrays.asList(strArr);
            aVar.f21967d = i10;
            aVar.f21965b = 1;
            aVar.f21968e = z.k(context);
            aVar.f = z.a(context);
            aVar.f21973k = this.f;
            aVar.f21974l = this.f28325e;
            aVar.f21966c = false;
            aVar.f21975m = this.f28326g;
            aVar.f21976n = this.f28327h;
            aVar.f21977p = this.f28329j;
            aVar.f21985x = this.o;
            aVar.o = this.f28328i;
            aVar.a(this.f28335q);
            Integer num = this.f28334p;
            if (num != null) {
                aVar.B = num;
            }
            BaseAdReqParam baseAdReqParam = new BaseAdReqParam();
            baseAdReqParam.a(this.f28331l);
            jd.Code(this.f28321a, "reqRewardAd", new AdSlotParam(aVar), gb.b.p(baseAdReqParam), new t(this), String.class);
            return;
        }
        ex.I("RewardAdLoader", "empty ad ids");
        b(ag.f21990ac);
    }

    public final void b(int i10) {
        ex.V("RewardAdLoader", "onAdFailed, errorCode:" + i10);
        if (this.f28324d == null) {
            return;
        }
        w.b(new a(i10));
    }
}
