package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp;
import java.util.HashMap;
import ka.p1;

/* loaded from: classes2.dex */
public final class ud {

    /* renamed from: a, reason: collision with root package name */
    public Context f31948a;

    /* renamed from: b, reason: collision with root package name */
    public a f31949b;

    /* renamed from: c, reason: collision with root package name */
    public AdContentRsp f31950c;

    /* renamed from: d, reason: collision with root package name */
    public p5 f31951d;

    /* renamed from: e, reason: collision with root package name */
    public ce f31952e;
    public com.huawei.openalliance.ad.ppskit.handlers.e0 f;

    /* renamed from: g, reason: collision with root package name */
    public p f31953g;

    /* renamed from: h, reason: collision with root package name */
    public String f31954h;

    /* renamed from: i, reason: collision with root package name */
    public long f31955i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f31956j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f31957k;

    /* renamed from: l, reason: collision with root package name */
    public String f31958l;

    /* loaded from: classes2.dex */
    public interface a {
        void a(int i10);

        void a(HashMap hashMap);
    }

    public ud(Context context, p1.a aVar, boolean z10) {
        a(context, aVar, z10);
    }

    public static void c(ud udVar, VideoInfo videoInfo, String str, String str2, Integer num, boolean z10) {
        boolean z11;
        boolean z12;
        udVar.getClass();
        n7.c("AwardAdProcessor", "download reward video:%s", com.huawei.openalliance.ad.ppskit.utils.y1.j(videoInfo.a()));
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
        n5 n5Var = new n5(a10, m10, z12, videoInfo.u(), null, z11, 1, str, str2, 7, false);
        n5Var.f31492l = num;
        n5Var.f31493m = "insre";
        udVar.f31951d.m(n5Var);
    }

    public final void a(Context context, a aVar, boolean z10) {
        this.f31948a = context;
        this.f31949b = aVar;
        this.f31951d = p5.j(context);
        this.f31952e = new ce(context);
        this.f = new com.huawei.openalliance.ad.ppskit.handlers.e0(context);
        this.f31953g = new p(context);
        this.f31956j = z10;
        this.f31957k = Cif.a(context).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x037a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r35, com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp r36, com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 1276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.ud.b(java.lang.String, com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp, com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam, boolean):void");
    }

    public ud(Context context, od odVar) {
        a(context, odVar, false);
    }
}
