package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.metadata.SpareCheckResult;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentResource;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentTemplateRecord;
import com.huawei.openalliance.ad.ppskit.provider.InnerApiProvider;
import com.huawei.openalliance.ad.ppskit.provider.a;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class lf extends ce {

    /* renamed from: l, reason: collision with root package name */
    public final Context f31422l;

    /* renamed from: m, reason: collision with root package name */
    public final m2.g f31423m;

    /* renamed from: n, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.i0 f31424n;
    public final boolean o;

    /* renamed from: p, reason: collision with root package name */
    public String f31425p;

    public lf(Context context, boolean z10) {
        super(-1, context, z10);
        this.f31425p = "3";
        this.f31422l = context;
        this.f31424n = com.huawei.openalliance.ad.ppskit.handlers.i0.d(context);
        this.f31423m = new m2.g(context);
        this.o = z10;
    }

    public static boolean y(String str) {
        try {
            if (new JSONObject(str).optInt("optional", 0) == 1) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            n7.f("TemplateContentProcessor", "isOptional err: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x014c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0134 A[SYNTHETIC] */
    @Override // ka.ce, ka.kg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord a(com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r17, int r18, long r19, byte[] r21, int r22) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.lf.a(com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord, int, long, byte[], int):com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord");
    }

    @Override // ka.ce
    public final SpareCheckResult b(ContentRecord contentRecord) {
        ContentTemplateRecord n10 = ((com.huawei.openalliance.ad.ppskit.handlers.p) ((n6) this.f31423m.f32646t)).n(contentRecord.h1(), contentRecord.h(), contentRecord.Z0());
        if (n10 != null && !androidx.transition.n.M(n10.C())) {
            for (Asset asset : n10.C()) {
                if (asset.p() != null && com.huawei.openalliance.ad.ppskit.utils.y1.h(w(asset.p().a()))) {
                    n7.e("TemplateContentProcessor", "image not exists");
                    return new SpareCheckResult("image path is null", "", false);
                }
                if (asset.q() != null && com.huawei.openalliance.ad.ppskit.utils.y1.h(w(asset.q().a()))) {
                    n7.e("TemplateContentProcessor", "video not exists");
                    return new SpareCheckResult("video path is null", "", false);
                }
            }
            n7.e("TemplateContentProcessor", "spare exists");
            return new SpareCheckResult("assets exists", "null", true);
        }
        return new SpareCheckResult("assets is null", "", false);
    }

    @Override // ka.ce
    public final void h(long j10) {
        ArrayList p10 = ((com.huawei.openalliance.ad.ppskit.handlers.e0) ((h6) this.f31423m.f32645s)).p(0, j10);
        if (androidx.transition.n.M(p10)) {
            return;
        }
        Iterator it = p10.iterator();
        while (it.hasNext()) {
            k((ContentRecord) it.next(), "deleteExpireContents");
        }
    }

    @Override // ka.ce
    public final void k(ContentRecord contentRecord, String str) {
        if (contentRecord == null) {
            n7.i("TemplateContentProcessor", "fail to delete content, content is null");
            return;
        }
        m2.g gVar = this.f31423m;
        gVar.getClass();
        n7.f("TContentRecordManager", "deleteContent: %s %s", contentRecord.h(), contentRecord.Z0());
        gVar.b(contentRecord.h1(), contentRecord.h(), contentRecord.Z0(), str);
        ((com.huawei.openalliance.ad.ppskit.handlers.e0) ((h6) gVar.f32645s)).y(contentRecord.h1(), contentRecord.h(), contentRecord.p2(), str);
    }

    @Override // ka.ce
    public final void l(String str) {
        com.huawei.openalliance.ad.ppskit.handlers.e0 e0Var = (com.huawei.openalliance.ad.ppskit.handlers.e0) ((h6) this.f31423m.f32645s);
        ArrayList h10 = e0Var.h(e0Var.B(), null, 10, new String[]{str}, null, null);
        if (androidx.transition.n.M(h10)) {
            n7.b("TemplateContentProcessor", "delete content records is empty");
            return;
        }
        Iterator it = h10.iterator();
        while (it.hasNext()) {
            k((ContentRecord) it.next(), "deleteInvalidContents");
        }
    }

    @Override // ka.ce
    public final void p() {
        m2.g gVar = this.f31423m;
        ArrayList<ContentRecord> a10 = ((h6) gVar.f32645s).a(1);
        if (!androidx.transition.n.M(a10)) {
            for (ContentRecord contentRecord : a10) {
                if (contentRecord != null && !androidx.transition.n.M(contentRecord.b1())) {
                    if (n7.d()) {
                        n7.c("TemplateContentProcessor", "begin check %s, %s", contentRecord.h(), contentRecord.Z0());
                    }
                    for (Asset asset : contentRecord.b1()) {
                        if (asset != null && (asset.p() != null || asset.q() != null)) {
                            if (n7.d()) {
                                n7.c("TemplateContentProcessor", "check asset, %s %s", asset.k(), asset.h());
                            }
                            if (y(asset.h())) {
                                n7.e("TemplateContentProcessor", "is optional");
                            } else if (asset.p() != null) {
                                if (!x(contentRecord, asset, asset.p().a(), null)) {
                                    gVar.c(contentRecord);
                                    if (n7.d()) {
                                        n7.c("TemplateContentProcessor", "img is valid: %s", asset.p().a());
                                    }
                                }
                            } else if (asset.q() != null && !x(contentRecord, asset, asset.q().a(), null)) {
                                gVar.c(contentRecord);
                                if (n7.d()) {
                                    n7.c("TemplateContentProcessor", "video is valid: %s", asset.q().a());
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        n7.e("TemplateContentProcessor", "trimAllContents, cacheContents is empty.");
    }

    public final String t(ContentRecord contentRecord, SourceParam sourceParam) {
        boolean z10;
        sourceParam.e(contentRecord);
        if (contentRecord.z0() == 16) {
            z10 = false;
        } else {
            z10 = true;
        }
        sourceParam.o(z10);
        sourceParam.t("tplate");
        e6.c f = this.f31424n.f(sourceParam);
        if (f != null) {
            return f.f27764a;
        }
        return null;
    }

    public final String u(ContentRecord contentRecord, String str, ArrayList arrayList, Asset asset, SourceParam sourceParam) {
        String t10 = t(contentRecord, sourceParam);
        if (!com.huawei.openalliance.ad.ppskit.utils.y1.h(t10)) {
            String[] strArr = InnerApiProvider.f22792v;
            asset.l(a.b.b(this.f31422l, t10, "tplate"));
        } else if (!y(asset.h())) {
            str = null;
        }
        arrayList.add(asset);
        return str;
    }

    public final String v(String str) {
        String str2 = this.f31425p;
        ArrayList r10 = com.huawei.openalliance.ad.ppskit.handlers.s.n(this.f31422l).r(androidx.transition.n.Q(str), "tplate");
        if (!androidx.transition.n.M(r10) && r10.get(0) != null) {
            return String.valueOf(((ContentResource) r10.get(0)).Y());
        }
        return str2;
    }

    public final String w(String str) {
        String f = d5.f(str);
        Context context = this.f31422l;
        String h10 = y4.a(context, "tplate").h(context, f);
        if (com.huawei.openalliance.ad.ppskit.utils.x.o(context, h10)) {
            return a.b.b(context, h10, "tplate");
        }
        return null;
    }

    public final boolean x(ContentRecord contentRecord, Asset asset, String str, SourceParam sourceParam) {
        Context context = this.f31422l;
        d5 a10 = y4.a(context, "tplate");
        String j10 = a10.j(context, str);
        if (com.huawei.openalliance.ad.ppskit.utils.x.q(a10.h(context, j10))) {
            if (contentRecord != null) {
                contentRecord.X2(v(str));
                if (sourceParam != null) {
                    sourceParam.e(contentRecord);
                }
            } else if (sourceParam != null) {
                sourceParam.f(Integer.valueOf(v(str)));
            }
            za.d.c(context, j10, a10, sourceParam, "tplate");
        } else {
            j10 = null;
        }
        if (!TextUtils.isEmpty(j10)) {
            if (asset != null) {
                String[] strArr = InnerApiProvider.f22792v;
                asset.l(a.b.b(context, j10, "tplate"));
            }
            return true;
        }
        return false;
    }
}
