package fa;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.huawei.hms.ads.RequestOptions;
import com.huawei.hms.ads.cj;
import com.huawei.hms.ads.cz;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.beans.inner.PlacementAdReqParam;
import com.huawei.openalliance.ad.beans.metadata.Video;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.constant.ag;
import gb.c0;
import gb.r0;
import gb.w;
import gb.z;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public int f28294a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Context f28295b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f28296c;

    /* renamed from: d, reason: collision with root package name */
    public ga.l f28297d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28298e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f28299g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f28300h;

    /* renamed from: i, reason: collision with root package name */
    public final RequestOptions f28301i;

    /* renamed from: j, reason: collision with root package name */
    public final Location f28302j;

    /* renamed from: k, reason: collision with root package name */
    public String f28303k;

    /* renamed from: l, reason: collision with root package name */
    public long f28304l;

    /* renamed from: m, reason: collision with root package name */
    public long f28305m;

    /* renamed from: n, reason: collision with root package name */
    public long f28306n;
    public final Integer o;

    /* renamed from: p, reason: collision with root package name */
    public String f28307p;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f28308s;

        public a(int i10) {
            this.f28308s = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            s sVar = s.this;
            ga.l lVar = sVar.f28297d;
            sVar.f28305m = System.currentTimeMillis();
            if (lVar != null) {
                lVar.I(this.f28308s);
            }
            cz.Code(sVar.f28295b, this.f28308s, sVar.f28303k, 60, null, sVar.f28304l, sVar.f28305m, sVar.f28306n);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f28310a;

        /* renamed from: b, reason: collision with root package name */
        public String[] f28311b;

        /* renamed from: c, reason: collision with root package name */
        public int f28312c = 4;

        /* renamed from: d, reason: collision with root package name */
        public String f28313d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f28314e;
        public boolean f;

        /* renamed from: g, reason: collision with root package name */
        public RequestOptions f28315g;

        /* renamed from: h, reason: collision with root package name */
        public Location f28316h;

        /* renamed from: i, reason: collision with root package name */
        public Integer f28317i;

        public b(Context context) {
            this.f28310a = context.getApplicationContext();
        }
    }

    public s(b bVar) {
        String[] strArr;
        boolean z10 = true;
        if (!r0.c(bVar.f28310a)) {
            this.f28296c = new String[0];
            return;
        }
        this.f28295b = bVar.f28310a;
        String[] strArr2 = bVar.f28311b;
        if (strArr2 != null) {
            strArr = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            strArr = new String[0];
        }
        if (strArr != null && strArr.length != 0) {
            z10 = false;
        }
        if (!z10) {
            String[] strArr3 = new String[strArr.length];
            this.f28296c = strArr3;
            System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        } else {
            this.f28296c = new String[0];
        }
        this.f28298e = bVar.f28312c;
        this.f = bVar.f28313d;
        this.f28299g = bVar.f28314e;
        this.f28300h = bVar.f;
        this.f28302j = bVar.f28316h;
        this.f28301i = bVar.f28315g;
        this.o = bVar.f28317i;
        this.f28307p = null;
    }

    public final void a(int i10, int i11) {
        boolean z10;
        this.f28304l = System.currentTimeMillis();
        ex.V("PlacementAdLoader", "loadAds");
        Context context = this.f28295b;
        if (!r0.c(context)) {
            ex.I("PlacementAdLoader", "api level too low");
            b(1001);
            return;
        }
        String str = this.f;
        if (!TextUtils.isEmpty(str)) {
            try {
                new JSONObject(str);
            } catch (JSONException unused) {
                ex.I("PlacementAdLoader", "extra info is not json string");
                z10 = false;
            }
        }
        z10 = true;
        if (!z10) {
            ex.I("PlacementAdLoader", "extra info is invalid");
            b(ag.Y);
            return;
        }
        if (2 == this.f28294a) {
            ex.V("PlacementAdLoader", "waiting for request finish");
            b(ag.W);
            return;
        }
        String[] strArr = this.f28296c;
        if (strArr != null && strArr.length != 0) {
            if (i10 <= 0) {
                ex.I("PlacementAdLoader", "invalid totalDuration.");
                b(ag.Y);
                return;
            }
            if (i11 < 0) {
                ex.I("PlacementAdLoader", "invalid maxCount");
                b(ag.Y);
                return;
            }
            this.f28294a = 2;
            RequestOptions requestOptions = this.f28301i;
            gb.e.b(context, requestOptions);
            Video video = new Video(0);
            AdSlotParam.a aVar = new AdSlotParam.a();
            aVar.f21964a = Arrays.asList(strArr);
            aVar.f21967d = this.f28298e;
            aVar.f21970h = false;
            aVar.f21965b = 1;
            aVar.f21968e = z.k(context);
            aVar.f = z.a(context);
            aVar.f21966c = this.f28299g;
            aVar.f21974l = cj.Code(requestOptions);
            aVar.f21973k = this.f28302j;
            aVar.f21978q = i11;
            aVar.y = i10;
            aVar.a(this.f28307p);
            aVar.f21971i = video;
            Integer num = this.o;
            if (num != null) {
                aVar.B = num;
            }
            PlacementAdReqParam placementAdReqParam = new PlacementAdReqParam();
            placementAdReqParam.b(str);
            placementAdReqParam.c(this.f28300h);
            placementAdReqParam.a(this.f28304l);
            c0.a(new p(this, aVar, placementAdReqParam));
            return;
        }
        ex.I("PlacementAdLoader", "empty ad ids");
        b(802);
    }

    public final void b(int i10) {
        ex.V("PlacementAdLoader", "onAdFailed, errorCode:" + i10);
        if (this.f28297d != null) {
            w.b(new a(i10));
        }
    }
}
