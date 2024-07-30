package y3;

import com.applovin.sdk.AppLovinEventTypes;
import com.huawei.openalliance.ad.constant.bj;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.io.IOException;

/* compiled from: AutoBatchedLogRequestEncoder.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f36570a = new b();

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    public static final class a implements v7.d<y3.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36571a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final v7.c f36572b = v7.c.a(bj.f.Code);

        /* renamed from: c, reason: collision with root package name */
        public static final v7.c f36573c = v7.c.a("model");

        /* renamed from: d, reason: collision with root package name */
        public static final v7.c f36574d = v7.c.a("hardware");

        /* renamed from: e, reason: collision with root package name */
        public static final v7.c f36575e = v7.c.a("device");
        public static final v7.c f = v7.c.a(AppLovinEventTypes.USER_VIEWED_PRODUCT);

        /* renamed from: g, reason: collision with root package name */
        public static final v7.c f36576g = v7.c.a("osBuild");

        /* renamed from: h, reason: collision with root package name */
        public static final v7.c f36577h = v7.c.a("manufacturer");

        /* renamed from: i, reason: collision with root package name */
        public static final v7.c f36578i = v7.c.a("fingerprint");

        /* renamed from: j, reason: collision with root package name */
        public static final v7.c f36579j = v7.c.a("locale");

        /* renamed from: k, reason: collision with root package name */
        public static final v7.c f36580k = v7.c.a(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY);

        /* renamed from: l, reason: collision with root package name */
        public static final v7.c f36581l = v7.c.a("mccMnc");

        /* renamed from: m, reason: collision with root package name */
        public static final v7.c f36582m = v7.c.a("applicationBuild");

        @Override // v7.a
        public final void a(Object obj, v7.e eVar) throws IOException {
            y3.a aVar = (y3.a) obj;
            v7.e eVar2 = eVar;
            eVar2.a(f36572b, aVar.l());
            eVar2.a(f36573c, aVar.i());
            eVar2.a(f36574d, aVar.e());
            eVar2.a(f36575e, aVar.c());
            eVar2.a(f, aVar.k());
            eVar2.a(f36576g, aVar.j());
            eVar2.a(f36577h, aVar.g());
            eVar2.a(f36578i, aVar.d());
            eVar2.a(f36579j, aVar.f());
            eVar2.a(f36580k, aVar.b());
            eVar2.a(f36581l, aVar.h());
            eVar2.a(f36582m, aVar.a());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: y3.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0510b implements v7.d<j> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0510b f36583a = new C0510b();

        /* renamed from: b, reason: collision with root package name */
        public static final v7.c f36584b = v7.c.a("logRequest");

        @Override // v7.a
        public final void a(Object obj, v7.e eVar) throws IOException {
            eVar.a(f36584b, ((j) obj).a());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    public static final class c implements v7.d<k> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f36585a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final v7.c f36586b = v7.c.a("clientType");

        /* renamed from: c, reason: collision with root package name */
        public static final v7.c f36587c = v7.c.a("androidClientInfo");

        @Override // v7.a
        public final void a(Object obj, v7.e eVar) throws IOException {
            k kVar = (k) obj;
            v7.e eVar2 = eVar;
            eVar2.a(f36586b, kVar.b());
            eVar2.a(f36587c, kVar.a());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    public static final class d implements v7.d<l> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f36588a = new d();

        /* renamed from: b, reason: collision with root package name */
        public static final v7.c f36589b = v7.c.a("eventTimeMs");

        /* renamed from: c, reason: collision with root package name */
        public static final v7.c f36590c = v7.c.a("eventCode");

        /* renamed from: d, reason: collision with root package name */
        public static final v7.c f36591d = v7.c.a("eventUptimeMs");

        /* renamed from: e, reason: collision with root package name */
        public static final v7.c f36592e = v7.c.a("sourceExtension");
        public static final v7.c f = v7.c.a("sourceExtensionJsonProto3");

        /* renamed from: g, reason: collision with root package name */
        public static final v7.c f36593g = v7.c.a("timezoneOffsetSeconds");

        /* renamed from: h, reason: collision with root package name */
        public static final v7.c f36594h = v7.c.a("networkConnectionInfo");

        @Override // v7.a
        public final void a(Object obj, v7.e eVar) throws IOException {
            l lVar = (l) obj;
            v7.e eVar2 = eVar;
            eVar2.c(f36589b, lVar.b());
            eVar2.a(f36590c, lVar.a());
            eVar2.c(f36591d, lVar.c());
            eVar2.a(f36592e, lVar.e());
            eVar2.a(f, lVar.f());
            eVar2.c(f36593g, lVar.g());
            eVar2.a(f36594h, lVar.d());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    public static final class e implements v7.d<m> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f36595a = new e();

        /* renamed from: b, reason: collision with root package name */
        public static final v7.c f36596b = v7.c.a("requestTimeMs");

        /* renamed from: c, reason: collision with root package name */
        public static final v7.c f36597c = v7.c.a("requestUptimeMs");

        /* renamed from: d, reason: collision with root package name */
        public static final v7.c f36598d = v7.c.a("clientInfo");

        /* renamed from: e, reason: collision with root package name */
        public static final v7.c f36599e = v7.c.a("logSource");
        public static final v7.c f = v7.c.a("logSourceName");

        /* renamed from: g, reason: collision with root package name */
        public static final v7.c f36600g = v7.c.a("logEvent");

        /* renamed from: h, reason: collision with root package name */
        public static final v7.c f36601h = v7.c.a("qosTier");

        @Override // v7.a
        public final void a(Object obj, v7.e eVar) throws IOException {
            m mVar = (m) obj;
            v7.e eVar2 = eVar;
            eVar2.c(f36596b, mVar.f());
            eVar2.c(f36597c, mVar.g());
            eVar2.a(f36598d, mVar.a());
            eVar2.a(f36599e, mVar.c());
            eVar2.a(f, mVar.d());
            eVar2.a(f36600g, mVar.b());
            eVar2.a(f36601h, mVar.e());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    public static final class f implements v7.d<o> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f36602a = new f();

        /* renamed from: b, reason: collision with root package name */
        public static final v7.c f36603b = v7.c.a("networkType");

        /* renamed from: c, reason: collision with root package name */
        public static final v7.c f36604c = v7.c.a("mobileSubtype");

        @Override // v7.a
        public final void a(Object obj, v7.e eVar) throws IOException {
            o oVar = (o) obj;
            v7.e eVar2 = eVar;
            eVar2.a(f36603b, oVar.b());
            eVar2.a(f36604c, oVar.a());
        }
    }

    public final void a(w7.a<?> aVar) {
        C0510b c0510b = C0510b.f36583a;
        x7.e eVar = (x7.e) aVar;
        eVar.a(j.class, c0510b);
        eVar.a(y3.d.class, c0510b);
        e eVar2 = e.f36595a;
        eVar.a(m.class, eVar2);
        eVar.a(g.class, eVar2);
        c cVar = c.f36585a;
        eVar.a(k.class, cVar);
        eVar.a(y3.e.class, cVar);
        a aVar2 = a.f36571a;
        eVar.a(y3.a.class, aVar2);
        eVar.a(y3.c.class, aVar2);
        d dVar = d.f36588a;
        eVar.a(l.class, dVar);
        eVar.a(y3.f.class, dVar);
        f fVar = f.f36602a;
        eVar.a(o.class, fVar);
        eVar.a(i.class, fVar);
    }
}
