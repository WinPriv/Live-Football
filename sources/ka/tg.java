package ka;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import com.huawei.openalliance.ad.ppskit.provider.InnerApiProvider;
import com.huawei.openalliance.ad.ppskit.provider.a;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import ka.af;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class tg {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31901a;

    /* renamed from: b, reason: collision with root package name */
    public final ConfigSpHandler f31902b;

    /* renamed from: c, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.i0 f31903c;

    /* renamed from: d, reason: collision with root package name */
    public final m2.g f31904d;

    /* renamed from: e, reason: collision with root package name */
    public final String f31905e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f31906g;

    /* renamed from: h, reason: collision with root package name */
    public int f31907h = 1;

    /* renamed from: i, reason: collision with root package name */
    public int f31908i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final int f31909j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f31910k;

    public tg(Context context, boolean z10, boolean z11, boolean z12, AtomicInteger atomicInteger, int i10) {
        this.f31909j = 0;
        this.f31901a = context;
        this.f = z11;
        this.f31906g = z12;
        this.f31902b = ConfigSpHandler.b(context);
        this.f31903c = com.huawei.openalliance.ad.ppskit.handlers.i0.d(context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(com.huawei.openalliance.ad.ppskit.utils.w1.a(context));
        String str = File.separator;
        e0.i.o(sb2, str, "pps", str, "tmaterial");
        sb2.append(str);
        this.f31905e = sb2.toString();
        this.f31904d = new m2.g(context);
        this.f31910k = atomicInteger;
        this.f31909j = i10;
    }

    public static void a(tg tgVar, ContentRecord contentRecord) {
        tgVar.getClass();
        try {
            JSONArray jSONArray = new JSONArray(contentRecord.c1().a());
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if (!jSONObject.isNull("videoDwnNetwork")) {
                    tgVar.f31908i = jSONObject.optInt("videoDwnNetwork");
                } else if (!jSONObject.isNull("videoPlayMode")) {
                    tgVar.f31907h = jSONObject.optInt("videoPlayMode");
                }
            }
        } catch (Throwable th) {
            n7.f("NativeAdParser3", "getTemplateContext err: %s", th.getClass().getSimpleName());
        }
    }

    public static boolean b(String str) {
        try {
            if (new JSONObject(str).optInt("optional", 0) == 1) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            n7.f("NativeAdParser3", "isOptional err: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    public static boolean c(tg tgVar, ContentRecord contentRecord, AdContentData adContentData, long j10, af.a aVar) {
        long j11;
        SourceParam sourceParam;
        boolean z10;
        boolean z11;
        SourceParam sourceParam2;
        String str;
        boolean z12;
        boolean z13;
        ConfigSpHandler configSpHandler = tgVar.f31902b;
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
            com.huawei.openalliance.ad.ppskit.utils.x.g(tgVar.f31905e);
        }
        if (contentRecord == null || androidx.transition.n.M(contentRecord.b1())) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        boolean z14 = true;
        for (Asset asset : contentRecord.b1()) {
            if (asset != null) {
                String str2 = null;
                if (asset.p() != null) {
                    if (asset.p() == null) {
                        sourceParam2 = null;
                    } else {
                        sourceParam2 = new SourceParam();
                        sourceParam2.n(asset.p().a());
                        if (asset.p().p() != null) {
                            str = asset.p().p().k();
                        } else {
                            str = null;
                        }
                        sourceParam2.k(str);
                        if (asset.p().p() != null && asset.p().p().p() != 0) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        sourceParam2.l(z12);
                        sourceParam2.o(true);
                        sourceParam2.g(Long.valueOf(j10));
                        sourceParam2.h("tmaterial");
                    }
                    String e10 = tgVar.e(contentRecord, sourceParam2);
                    String[] strArr = InnerApiProvider.f22792v;
                    String b10 = a.b.b(tgVar.f31901a, e10, "tplate");
                    if (com.huawei.openalliance.ad.ppskit.utils.y1.h(b10)) {
                        b10 = null;
                    }
                    if (!TextUtils.isEmpty(b10)) {
                        asset.p().d(b10);
                        if (asset.p().b() <= 0 || asset.p().k() <= 0) {
                            Rect c10 = com.huawei.openalliance.ad.ppskit.utils.v0.c(b10);
                            int width = c10.width();
                            int height = c10.height();
                            if (width > 0 && height > 0) {
                                asset.p().a(width);
                                asset.p().c(height);
                            }
                        }
                    } else {
                        n7.h("NativeAdParser3", "download img: %s failed", asset.k());
                        if (!b(asset.h())) {
                            AtomicInteger atomicInteger = tgVar.f31910k;
                            atomicInteger.getAndIncrement();
                            if (atomicInteger.intValue() == tgVar.f31909j) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            aVar.a(-10, z13);
                            z14 = false;
                        }
                    }
                }
                if (asset.q() != null) {
                    if (!tgVar.d()) {
                        z14 = false;
                    } else if (1 == tgVar.f31907h || tgVar.f) {
                        n7.e("NativeAdParser3", "cacheVideo");
                        if (asset.q() == null) {
                            sourceParam = null;
                        } else {
                            sourceParam = new SourceParam();
                            sourceParam.n(asset.q().a());
                            sourceParam.k(asset.q().k());
                            if (asset.q().p() == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            sourceParam.l(z10);
                            sourceParam.o(true);
                            sourceParam.g(Long.valueOf(j10));
                            sourceParam.h("tmaterial");
                            sourceParam.a();
                        }
                        String e11 = tgVar.e(contentRecord, sourceParam);
                        String[] strArr2 = InnerApiProvider.f22792v;
                        String b11 = a.b.b(tgVar.f31901a, e11, "tplate");
                        if (!com.huawei.openalliance.ad.ppskit.utils.y1.h(b11)) {
                            str2 = b11;
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            asset.q().b(str2);
                        } else {
                            n7.g("NativeAdParser3", "dealVideo, download video failed!");
                            if (!b(asset.h())) {
                                AtomicInteger atomicInteger2 = tgVar.f31910k;
                                atomicInteger2.getAndIncrement();
                                if (atomicInteger2.intValue() == tgVar.f31909j) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                aVar.a(-10, z11);
                                z14 = false;
                            }
                        }
                    }
                }
                arrayList.add(asset);
            }
        }
        if (z14) {
            adContentData.D(arrayList);
            contentRecord.M2(arrayList);
        }
        com.huawei.openalliance.ad.ppskit.utils.p2.a(new sg(tgVar, contentRecord, j10), 4);
        return z14;
    }

    public final boolean d() {
        boolean z10;
        int i10;
        if (1 == this.f31907h) {
            if (!this.f31906g && !this.f && (i10 = this.f31908i) != 1 && (i10 != 0 || !com.huawei.openalliance.ad.ppskit.utils.k1.e(this.f31901a))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                n7.h("NativeAdParser3", "cache mode video is not allowed to download in network %d", Integer.valueOf(this.f31908i));
                return false;
            }
        }
        return true;
    }

    public final String e(ContentRecord contentRecord, SourceParam sourceParam) {
        if (sourceParam != null) {
            sourceParam.e(contentRecord);
            sourceParam.o(true);
            sourceParam.t("tplate");
            e6.c f = this.f31903c.f(sourceParam);
            if (f != null) {
                return f.f27764a;
            }
        }
        return null;
    }
}
