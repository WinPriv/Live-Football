package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.TemplateData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentTemplateRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.TemplateStyleRecord;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class jf implements mg {

    /* renamed from: a, reason: collision with root package name */
    public final List<ContentRecord> f31334a;

    /* renamed from: b, reason: collision with root package name */
    public List<String> f31335b;

    /* renamed from: c, reason: collision with root package name */
    public List<String> f31336c;

    /* renamed from: d, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.e0 f31337d;

    /* renamed from: e, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.f0 f31338e;
    public final Context f;

    /* renamed from: g, reason: collision with root package name */
    public final ce f31339g;

    /* renamed from: h, reason: collision with root package name */
    public final lf f31340h;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f31341s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Integer f31342t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f31343u;

        public a(String str, Integer num, String str2) {
            this.f31341s = str;
            this.f31342t = num;
            this.f31343u = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.huawei.openalliance.ad.ppskit.handlers.s.n(jf.this.f).q(this.f31341s, this.f31342t.intValue(), this.f31343u);
        }
    }

    public jf(Context context, List<ContentRecord> list, boolean z10, int i10) {
        int i11;
        Object[] objArr = new Object[2];
        if (list != null) {
            i11 = list.size();
        } else {
            i11 = 0;
        }
        objArr[0] = Integer.valueOf(i11);
        objArr[1] = Boolean.valueOf(z10);
        n7.f("ResponseProcessor", "ResponseProcessor - content records size: %d isPreContent: %s", objArr);
        this.f = context.getApplicationContext();
        this.f31334a = list;
        this.f31337d = new com.huawei.openalliance.ad.ppskit.handlers.e0(context);
        this.f31338e = com.huawei.openalliance.ad.ppskit.handlers.f0.E(context);
        this.f31339g = new ce(i10, context, z10);
        this.f31340h = new lf(context, z10);
    }

    public final ContentRecord a(int i10, long j10, int i11) {
        kg kgVar;
        n7.f("ResponseProcessor", "download contents start, preload source: %s", Integer.valueOf(i11));
        List<ContentRecord> list = this.f31334a;
        String str = null;
        if (androidx.transition.n.M(list)) {
            n7.g("ResponseProcessor", "download contents, content records is empty");
            return null;
        }
        byte[] h10 = com.huawei.openalliance.ad.ppskit.utils.u1.h(this.f);
        ContentRecord contentRecord = null;
        for (ContentRecord contentRecord2 : list) {
            if (contentRecord2 != null) {
                if (contentRecord2.a1() != -1 && 2 != contentRecord2.a1()) {
                    if (3 == contentRecord2.a1()) {
                        kgVar = this.f31340h;
                    } else {
                        kgVar = null;
                    }
                } else {
                    kgVar = this.f31339g;
                }
                if (kgVar != null) {
                    contentRecord = kgVar.a(contentRecord2, i10, j10, h10, i11);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder("download contents end, showContentId:");
        if (contentRecord != null) {
            str = contentRecord.h();
        }
        sb2.append(str);
        n7.e("ResponseProcessor", sb2.toString());
        return contentRecord;
    }

    public final ContentRecord b(String str, ContentRecord contentRecord, int i10, long j10) {
        int i11;
        String str2;
        if (contentRecord.a1() != -1 && 2 != contentRecord.a1()) {
            m2.g gVar = this.f31340h.f31423m;
            ContentRecord c10 = ((h6) gVar.f32645s).c(j10, contentRecord.h1(), contentRecord.h(), contentRecord.Z0(), contentRecord.p2());
            String str3 = null;
            if (c10 == null) {
                str2 = "showContent is null";
            } else {
                ContentTemplateRecord n10 = ((com.huawei.openalliance.ad.ppskit.handlers.p) ((n6) gVar.f32646t)).n(contentRecord.h1(), contentRecord.h(), contentRecord.Z0());
                if (n10 != null && !androidx.transition.n.M(n10.C())) {
                    c10.M2(n10.C());
                    c10.D0(new TemplateData(n10.E(), n10.F(), n10.H()));
                    TemplateStyleRecord r10 = ((com.huawei.openalliance.ad.ppskit.handlers.q) ((q6) gVar.f32647u)).r(contentRecord.p2(), contentRecord.Z0());
                    if (r10 != null) {
                        str3 = r10.d();
                    }
                    c10.l0(str3);
                    return c10;
                }
                str2 = "template is null";
            }
            n7.e("TContentRecordManager", str2);
            return null;
        }
        com.huawei.openalliance.ad.ppskit.handlers.e0 e0Var = new com.huawei.openalliance.ad.ppskit.handlers.e0(this.f);
        String h10 = contentRecord.h();
        String p22 = contentRecord.p2();
        if (1 == i10) {
            i11 = 17;
        } else {
            i11 = 18;
        }
        return e0Var.v(str, i11, new String[]{str, h10, p22, String.valueOf(j10), String.valueOf(j10)});
    }

    public final void c(long j10, int i10) {
        n7.e("ResponseProcessor", "download Ar contents start");
        List<ContentRecord> list = this.f31334a;
        if (androidx.transition.n.M(list)) {
            n7.g("ResponseProcessor", "download Ar contents, content records is empty");
            return;
        }
        byte[] h10 = com.huawei.openalliance.ad.ppskit.utils.u1.h(this.f);
        Iterator<ContentRecord> it = list.iterator();
        while (it.hasNext()) {
            this.f31339g.j(it.next(), j10, h10, i10);
        }
    }

    public final void d(String str, String str2, String str3) {
        Integer q10;
        if (!com.huawei.openalliance.ad.ppskit.utils.y1.h(str) && !com.huawei.openalliance.ad.ppskit.utils.y1.h(str2) && (q10 = com.huawei.openalliance.ad.ppskit.utils.y1.q(str2)) != null) {
            com.huawei.openalliance.ad.ppskit.utils.p2.a(new a(str, q10, str3), 0);
        }
    }

    public final void e() {
        if (androidx.transition.n.M(this.f31335b)) {
            n7.e("ResponseProcessor", "invalidContentIds is empty");
            return;
        }
        for (String str : this.f31335b) {
            this.f31339g.l(str);
            this.f31340h.l(str);
        }
    }
}
