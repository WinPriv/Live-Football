package ka;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import com.huawei.openalliance.ad.ppskit.provider.a;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    public AdContentRsp f30954a;

    /* renamed from: b, reason: collision with root package name */
    public final a f30955b;

    /* renamed from: c, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.i0 f30956c;

    /* renamed from: d, reason: collision with root package name */
    public final ConfigSpHandler f30957d;

    /* renamed from: e, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.e0 f30958e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f30959g;

    /* renamed from: k, reason: collision with root package name */
    public String f30963k;
    public AtomicInteger o;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30960h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f30961i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f30962j = false;

    /* renamed from: l, reason: collision with root package name */
    public int f30964l = 3;

    /* renamed from: m, reason: collision with root package name */
    public boolean f30965m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f30966n = 0;

    /* loaded from: classes2.dex */
    public interface a {
        void a(int i10, boolean z10);

        void a(HashMap hashMap);

        void a(List<String> list);
    }

    public af(Context context, a aVar) {
        this.f30959g = context.getApplicationContext();
        this.f30955b = aVar;
        this.f30956c = com.huawei.openalliance.ad.ppskit.handlers.i0.d(context);
        this.f30957d = ConfigSpHandler.b(context);
        this.f30958e = new com.huawei.openalliance.ad.ppskit.handlers.e0(context);
        Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(com.huawei.openalliance.ad.ppskit.utils.w1.a(createDeviceProtectedStorageContext));
        String str = File.separator;
        e0.i.o(sb2, str, "pps", str, "material");
        sb2.append(str);
        this.f = sb2.toString();
    }

    public static boolean c(af afVar, MetaData metaData, long j10, ContentRecord contentRecord, VideoInfo videoInfo, ImageInfo imageInfo) {
        long j11;
        boolean z10;
        String str;
        boolean z11;
        ConfigSpHandler configSpHandler = afVar.f30957d;
        synchronized (configSpHandler.f22478a) {
            j11 = configSpHandler.s().getLong("last_clean_disk_time", 0L);
        }
        long j12 = j11 + 86400000;
        HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
        if (j12 < System.currentTimeMillis()) {
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (configSpHandler.f22478a) {
                configSpHandler.s().edit().putLong("last_clean_disk_time", currentTimeMillis).apply();
            }
            com.huawei.openalliance.ad.ppskit.utils.x.g(afVar.f);
        }
        List<ImageInfo> h02 = metaData.h0();
        imageInfo.k(imageInfo.g());
        SourceParam sourceParam = new SourceParam();
        sourceParam.e(contentRecord);
        sourceParam.n(imageInfo.g());
        sourceParam.c(52428800L);
        sourceParam.k(imageInfo.a());
        if (imageInfo.o() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sourceParam.l(z10);
        sourceParam.h("material");
        sourceParam.g(Long.valueOf(j10));
        sourceParam.o(true);
        com.huawei.openalliance.ad.ppskit.handlers.i0 i0Var = afVar.f30956c;
        e6.c f = i0Var.f(sourceParam);
        if (f != null && !com.huawei.openalliance.ad.ppskit.utils.y1.h(f.f27764a)) {
            String str2 = f.f27764a;
            Context context = afVar.f30959g;
            imageInfo.h(a.b.a(context, str2));
            String str3 = f.f27764a;
            if (imageInfo.l() <= 0 || imageInfo.m() <= 0) {
                Rect c10 = com.huawei.openalliance.ad.ppskit.utils.v0.c(str3);
                int width = c10.width();
                int height = c10.height();
                if (width > 0 && height > 0) {
                    imageInfo.b(width);
                    imageInfo.e(height);
                }
            }
            if (1 == videoInfo.v() || afVar.f30962j) {
                n7.b("NativeAdProcessor", "cacheVideo.");
                SourceParam sourceParam2 = new SourceParam();
                sourceParam2.e(contentRecord);
                sourceParam2.n(videoInfo.a());
                sourceParam2.c(209715200L);
                sourceParam2.k(videoInfo.u());
                if (videoInfo.w() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                sourceParam2.l(z11);
                sourceParam2.h("material");
                sourceParam2.a();
                sourceParam2.g(Long.valueOf(j10));
                sourceParam2.o(true);
                e6.c f10 = i0Var.f(sourceParam2);
                if (f10 != null && !com.huawei.openalliance.ad.ppskit.utils.y1.h(f10.f27764a)) {
                    String str4 = f10.f27764a;
                    videoInfo.e(a.b.a(context, str4));
                    contentRecord.z2(str4);
                } else {
                    str = "dealVideo, download video failed!";
                }
            }
            metaData.I(videoInfo);
            h02.set(0, imageInfo);
            metaData.N(h02);
            return true;
        }
        str = "dealVideo, download cover failed!";
        n7.g("NativeAdProcessor", str);
        afVar.e();
        return false;
    }

    public static boolean d(af afVar, VideoInfo videoInfo, ImageInfo imageInfo) {
        boolean z10;
        afVar.getClass();
        if (videoInfo != null && imageInfo != null) {
            if (1 == videoInfo.v()) {
                if (!afVar.f30960h && !afVar.f30962j && videoInfo.z() != 1 && (videoInfo.z() != 0 || !com.huawei.openalliance.ad.ppskit.utils.k1.e(afVar.f30959g))) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    n7.h("NativeAdProcessor", "cache mode video is only allowed to download in network %d", Integer.valueOf(videoInfo.z()));
                }
            }
            return true;
        }
        afVar.e();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x041e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r31, com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp r32, long r33) {
        /*
            Method dump skipped, instructions count: 1139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.af.a(java.lang.String, com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp, long):void");
    }

    public final void b(String str, ArrayList arrayList, HashMap hashMap) {
        if (!TextUtils.isEmpty(str) && !arrayList.isEmpty()) {
            List list = (List) hashMap.get(str);
            int size = arrayList.size();
            this.o.getAndAdd(size);
            if (this.f30966n == this.o.intValue()) {
                ((AdContentData) arrayList.get(size - 1)).w(true);
            }
            if (list != null) {
                list.addAll(arrayList);
            } else {
                hashMap.put(str, arrayList);
            }
        }
    }

    public final void e() {
        boolean z10;
        this.o.getAndIncrement();
        if (this.o.intValue() == this.f30966n) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30955b.a(-10, z10);
    }
}
