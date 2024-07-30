package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MediaFile;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class d0 extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f31074c = new ConcurrentHashMap(4);

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f31075d = new ConcurrentHashMap(4);

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f31076e = false;

    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ MediaFile f31077s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f31078t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f31079u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f31080v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f31081w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Integer f31082x;
        public final /* synthetic */ Context y;

        public a(MediaFile mediaFile, boolean z10, int i10, String str, String str2, Integer num, Context context) {
            this.f31077s = mediaFile;
            this.f31078t = z10;
            this.f31079u = i10;
            this.f31080v = str;
            this.f31081w = str2;
            this.f31082x = num;
            this.y = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            boolean z11;
            MediaFile mediaFile = this.f31077s;
            n7.c("CmdBasePlacementReq", "download media:%s", com.huawei.openalliance.ad.ppskit.utils.y1.j(mediaFile.p()));
            if (this.f31078t && 1 != mediaFile.u()) {
                z10 = false;
            } else {
                z10 = true;
            }
            String p10 = mediaFile.p();
            int k10 = (int) mediaFile.k();
            if (mediaFile.r() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            n5 n5Var = new n5(p10, k10, z11, mediaFile.q(), Integer.valueOf(this.f31079u), z10, 0, this.f31080v, this.f31081w, 60, this.f31078t);
            n5Var.f31492l = this.f31082x;
            p5.j(this.y).m(n5Var);
        }
    }

    public d0(String str) {
        super(str);
    }

    public static void i(Context context, String str, int i10, AbstractMap abstractMap, AbstractMap abstractMap2) {
        n7.e("CmdBasePlacementReq", "startCache:" + i10);
        p5 j10 = p5.j(context);
        j10.f = Integer.valueOf(i10);
        j10.p();
        if ((abstractMap != null && !abstractMap.isEmpty()) || (abstractMap2 != null && !abstractMap2.isEmpty())) {
            k(context, str, abstractMap, i10, false);
            k(context, str, abstractMap2, i10, true);
        } else {
            f31076e = true;
        }
    }

    public static void j(Context context, String str, MediaFile mediaFile, int i10, boolean z10, String str2, String str3, Integer num) {
        String k10;
        if (mediaFile != null && !TextUtils.isEmpty(mediaFile.p()) && mediaFile.k() > 0) {
            if (mediaFile.p().startsWith("content://")) {
                k10 = "don't download local file path";
            } else {
                long O = com.huawei.openalliance.ad.ppskit.handlers.l.d(context).O(str) * 1024;
                if (mediaFile.x() && mediaFile.k() > O) {
                    k10 = a3.k.k("don't download image file size bigger than:", O);
                } else {
                    com.huawei.openalliance.ad.ppskit.utils.p2.a(new a(mediaFile, z10, i10, str2, str3, num, context), 2);
                    return;
                }
            }
            n7.g("CmdBasePlacementReq", k10);
        }
    }

    public static void k(Context context, String str, AbstractMap abstractMap, int i10, boolean z10) {
        if (abstractMap != null && !abstractMap.isEmpty()) {
            for (Map.Entry entry : abstractMap.entrySet()) {
                ArrayList arrayList = new ArrayList((Collection) entry.getValue());
                String str2 = (String) entry.getKey();
                if (!androidx.transition.n.M(arrayList)) {
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        AdContentData adContentData = (AdContentData) arrayList.get(i11);
                        if (adContentData != null) {
                            String B = adContentData.B();
                            MetaData x10 = adContentData.x();
                            if (x10 != null) {
                                if (z10) {
                                    List<MediaFile> q02 = x10.q0();
                                    List<MediaFile> list = q02;
                                    if (q02 == null) {
                                        ArrayList arrayList2 = new ArrayList();
                                        MediaFile o02 = x10.o0();
                                        list = arrayList2;
                                        if (o02 != null) {
                                            arrayList2.add(o02);
                                            list = arrayList2;
                                        }
                                    }
                                    List<MediaFile> list2 = list;
                                    if (!androidx.transition.n.M(list2)) {
                                        int size2 = list2.size();
                                        int i12 = 0;
                                        while (i12 < size2) {
                                            j(context, str, list2.get(i12), i10, z10, B, str2, adContentData.l());
                                            i12++;
                                            size2 = size2;
                                            list2 = list2;
                                        }
                                    }
                                } else {
                                    j(context, str, x10.o0(), i10, z10, B, str2, adContentData.l());
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void l() {
        f31074c.clear();
        f31075d.clear();
    }
}
