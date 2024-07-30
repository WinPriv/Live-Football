package fa;

import android.content.Context;
import android.location.Location;
import com.huawei.hms.ads.App;
import com.huawei.hms.ads.RequestOptions;
import com.huawei.hms.ads.cz;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.nativead.NativeAdConfiguration;
import com.huawei.openalliance.ad.beans.inner.NativeAdReqParam;
import com.huawei.openalliance.ad.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.constant.ag;
import gb.c0;
import gb.r0;
import gb.w;
import gb.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class o implements k {
    public static final /* synthetic */ int J = 0;
    public long A;
    public long B;
    public String C;
    public App D;
    public List<Integer> E;
    public Integer F;
    public String G;
    public boolean H;
    public final DelayInfo I;

    /* renamed from: a, reason: collision with root package name */
    public final List<String> f28261a;

    /* renamed from: b, reason: collision with root package name */
    public ga.d f28262b;

    /* renamed from: c, reason: collision with root package name */
    public int f28263c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f28264d;

    /* renamed from: e, reason: collision with root package name */
    public ga.j f28265e;
    public ga.h f;

    /* renamed from: g, reason: collision with root package name */
    public String f28266g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f28267h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f28268i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f28269j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f28270k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f28271l;

    /* renamed from: m, reason: collision with root package name */
    public int f28272m;

    /* renamed from: n, reason: collision with root package name */
    public RequestOptions f28273n;
    public Location o;

    /* renamed from: p, reason: collision with root package name */
    public Integer f28274p;

    /* renamed from: q, reason: collision with root package name */
    public int f28275q;

    /* renamed from: r, reason: collision with root package name */
    public String f28276r;

    /* renamed from: s, reason: collision with root package name */
    public String f28277s;

    /* renamed from: t, reason: collision with root package name */
    public Set<String> f28278t;

    /* renamed from: u, reason: collision with root package name */
    public int f28279u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f28280v;

    /* renamed from: w, reason: collision with root package name */
    public Integer f28281w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f28282x;
    public NativeAdConfiguration y;

    /* renamed from: z, reason: collision with root package name */
    public long f28283z;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ long f28284s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f28285t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f28286u;

        public a(long j10, int i10, boolean z10) {
            this.f28284s = j10;
            this.f28285t = i10;
            this.f28286u = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            o oVar = o.this;
            ga.j jVar = oVar.f28265e;
            oVar.A = System.currentTimeMillis();
            oVar.I.b0().q(oVar.A);
            long j10 = oVar.A - this.f28284s;
            oVar.I.w(j10);
            int i10 = o.J;
            ex.V("o", "onAdFailed main thread switch: %s ms", Long.valueOf(j10));
            int i11 = this.f28285t;
            if (jVar != null) {
                jVar.Code(i11);
            }
            ga.h hVar = oVar.f;
            if (hVar != null) {
                hVar.Code(i11, this.f28286u);
            }
            cz.Code(oVar.f28271l, this.f28285t, oVar.C, oVar.f28272m, null, oVar.A - oVar.f28283z, oVar.I);
        }
    }

    public o(Context context, String[] strArr) {
        this.f28263c = 1;
        this.f28270k = false;
        this.f28272m = 3;
        this.I = new DelayInfo();
        if (!r0.c(context)) {
            this.f28264d = new String[0];
            return;
        }
        this.f28271l = context.getApplicationContext();
        if (strArr.length > 0) {
            String[] strArr2 = new String[strArr.length];
            this.f28264d = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        } else {
            this.f28264d = new String[0];
        }
        this.f28267h = false;
    }

    public final void a(int i10) {
        Integer num;
        this.f28283z = System.currentTimeMillis();
        this.I.b0().l(this.f28283z);
        ex.V("o", "loadAds");
        Context context = this.f28271l;
        if (!r0.c(context)) {
            b(1001, true);
            return;
        }
        if (2 == this.f28263c) {
            ex.V("o", "waiting for request finish");
            b(ag.N, true);
            return;
        }
        String[] strArr = this.f28264d;
        if (strArr != null && strArr.length != 0) {
            if (this.D != null && !r0.g(context)) {
                ex.I("o", "hms ver not support set appInfo.");
                b(ag.T, true);
                return;
            }
            gb.e.b(context, this.f28273n);
            this.f28263c = 2;
            AdSlotParam.a aVar = new AdSlotParam.a();
            aVar.f21964a = Arrays.asList(strArr);
            aVar.f21967d = i10;
            aVar.f21969g = null;
            aVar.f21965b = 1;
            aVar.f21968e = z.k(context);
            aVar.f = z.a(context);
            aVar.f21966c = false;
            aVar.f21974l = this.f28273n;
            aVar.f21973k = this.o;
            aVar.f21972j = this.f28272m;
            aVar.f21975m = this.f28275q;
            aVar.f21976n = this.f28276r;
            aVar.f21978q = this.f28279u;
            aVar.f21977p = this.f28278t;
            aVar.o = this.f28277s;
            aVar.f21979r = this.f28280v;
            aVar.f21985x = this.D;
            aVar.f21986z = this.f28274p;
            aVar.f21981t = null;
            List<Integer> list = this.E;
            if (list != null) {
                if (list.size() > 100) {
                    list = list.subList(0, 100);
                }
                aVar.A = new ArrayList(list.size());
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    aVar.A.add(Integer.toString(it.next().intValue()));
                }
            }
            aVar.a(this.G);
            aVar.E = this.f28270k;
            Integer num2 = this.f28281w;
            if (num2 != null && (num = this.f28282x) != null) {
                aVar.f21983v = num2;
                aVar.f21984w = num;
            }
            Integer num3 = this.F;
            if (num3 != null) {
                aVar.B = num3;
            }
            if (this.y != null) {
                aVar.f21980s = !r12.isReturnUrlsForImages();
                aVar.f21982u = this.y.isRequestMultiImages();
            }
            NativeAdReqParam nativeAdReqParam = new NativeAdReqParam();
            nativeAdReqParam.b(this.f28266g);
            nativeAdReqParam.f(this.f28268i);
            nativeAdReqParam.d(this.f28267h);
            nativeAdReqParam.e(this.f28269j);
            nativeAdReqParam.c(this.f28261a);
            nativeAdReqParam.a(this.f28283z);
            c0.a(new l(this, System.currentTimeMillis(), aVar, nativeAdReqParam));
            return;
        }
        ex.I("o", "empty ad ids");
        b(ag.O, true);
    }

    public final void b(int i10, boolean z10) {
        ex.V("o", "onAdFailed, errorCode:" + i10);
        long currentTimeMillis = System.currentTimeMillis();
        this.I.b0().m(currentTimeMillis);
        if (!this.H) {
            w.b(new a(currentTimeMillis, i10, z10));
            return;
        }
        ex.V("o", "onAdFailed thread");
        ga.j jVar = this.f28265e;
        if (jVar != null) {
            jVar.Code(i10);
        }
        ga.h hVar = this.f;
        if (hVar != null) {
            hVar.Code(i10, z10);
        }
        cz.Code(this.f28271l, i10, this.C, this.f28272m, null, this.f28283z, currentTimeMillis, this.B);
    }

    public o(Context context, String[] strArr, int i10, List<String> list) {
        this(context, strArr);
        this.f28272m = i10;
        this.f28261a = list;
    }
}
