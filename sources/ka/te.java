package ka;

import android.content.Context;
import android.graphics.Rect;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import java.util.HashMap;
import java.util.List;
import ka.h1;

/* loaded from: classes2.dex */
public final class te {

    /* renamed from: a, reason: collision with root package name */
    public Context f31889a;

    /* renamed from: b, reason: collision with root package name */
    public a f31890b;

    /* renamed from: c, reason: collision with root package name */
    public AdContentRsp f31891c;

    /* renamed from: d, reason: collision with root package name */
    public p5 f31892d;

    /* renamed from: e, reason: collision with root package name */
    public ce f31893e;
    public com.huawei.openalliance.ad.ppskit.handlers.e0 f;

    /* renamed from: g, reason: collision with root package name */
    public p f31894g;

    /* renamed from: h, reason: collision with root package name */
    public String f31895h;

    /* renamed from: i, reason: collision with root package name */
    public com.huawei.openalliance.ad.ppskit.handlers.i0 f31896i;

    /* renamed from: j, reason: collision with root package name */
    public long f31897j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f31898k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f31899l;

    /* renamed from: m, reason: collision with root package name */
    public String f31900m;

    /* loaded from: classes2.dex */
    public interface a {
        void a(int i10);

        void a(HashMap hashMap);
    }

    public te(Context context, h1.a aVar, boolean z10) {
        a(context, aVar, z10);
    }

    public static void d(te teVar, VideoInfo videoInfo, String str, String str2, Integer num, boolean z10) {
        boolean z11;
        boolean z12;
        teVar.getClass();
        n7.c("InterstitialAdProcessor", "download interstitialAd video:%s", com.huawei.openalliance.ad.ppskit.utils.y1.j(videoInfo.a()));
        if (!z10 && videoInfo.z() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        String a10 = videoInfo.a();
        int m10 = videoInfo.m();
        if (videoInfo.w() == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        n5 n5Var = new n5(a10, m10, z12, videoInfo.u(), null, z11, 1, str, str2, 12, false);
        n5Var.f31492l = num;
        n5Var.f31493m = "insre";
        teVar.f31892d.m(n5Var);
    }

    public final void a(Context context, a aVar, boolean z10) {
        this.f31889a = context;
        this.f31890b = aVar;
        this.f31893e = new ce(context);
        this.f = new com.huawei.openalliance.ad.ppskit.handlers.e0(context);
        this.f31892d = p5.j(context);
        this.f31894g = new p(this.f31889a);
        this.f31896i = com.huawei.openalliance.ad.ppskit.handlers.i0.d(context);
        this.f31898k = z10;
        this.f31899l = Cif.a(context).d();
    }

    public final void b(ContentRecord contentRecord, List<ImageInfo> list) {
        if (list != null && list.size() > 0) {
            boolean z10 = false;
            ImageInfo imageInfo = list.get(0);
            if (imageInfo != null) {
                imageInfo.k(imageInfo.g());
                n7.c("InterstitialAdProcessor", "cache content %s image", contentRecord.h());
                SourceParam sourceParam = new SourceParam();
                sourceParam.e(contentRecord);
                sourceParam.n(imageInfo.g());
                sourceParam.c(52428800L);
                sourceParam.k(imageInfo.a());
                if (imageInfo.o() == 0) {
                    z10 = true;
                }
                sourceParam.l(z10);
                sourceParam.h("material");
                sourceParam.o(true);
                sourceParam.g(Long.valueOf(System.currentTimeMillis()));
                sourceParam.t("insre");
                e6.c f = this.f31896i.f(sourceParam);
                if (f != null && !com.huawei.openalliance.ad.ppskit.utils.y1.h(f.f27764a)) {
                    contentRecord.z2(f.f27764a);
                    String str = f.f27764a;
                    if (imageInfo.l() <= 0 || imageInfo.m() <= 0) {
                        Rect c10 = com.huawei.openalliance.ad.ppskit.utils.v0.c(str);
                        int width = c10.width();
                        int height = c10.height();
                        if (width > 0 && height > 0) {
                            imageInfo.b(width);
                            imageInfo.e(height);
                            return;
                        }
                        return;
                    }
                    return;
                }
                n7.g("InterstitialAdProcessor", "download image failed");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0303 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0416 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c5  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r36, com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp r37, com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 1269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.te.c(java.lang.String, com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp, com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam, boolean):void");
    }

    public te(Context context, nd ndVar) {
        a(context, ndVar, false);
    }
}
