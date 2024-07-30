package ka;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class t1 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f31863s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f31864t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f31865u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f31866v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f31867w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f31868x;

    public t1(int i10, int i11, Context context, String str, ArrayList arrayList, boolean z10) {
        this.f31863s = arrayList;
        this.f31864t = context;
        this.f31865u = i10;
        this.f31866v = i11;
        this.f31867w = str;
        this.f31868x = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x000f A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            java.util.List r0 = r9.f31863s
            if (r0 == 0) goto L98
            ka.p r7 = new ka.p
            android.content.Context r1 = r9.f31864t
            r7.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L98
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r2 = (com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord) r2
            if (r2 == 0) goto Lf
            com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo r1 = r2.f0()
            r3 = 1
            int r4 = r9.f31865u
            if (r1 == 0) goto L50
            if (r4 != 0) goto L3b
            com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo r1 = r2.f0()
            int r1 = r1.m()
            com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo r5 = r2.f0()
            int r5 = r5.l()
            if (r1 >= r5) goto L8a
        L3b:
            if (r4 != r3) goto Lf
            com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo r1 = r2.f0()
            int r1 = r1.m()
            com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo r3 = r2.f0()
            int r3 = r3.l()
            if (r1 >= r3) goto Lf
            goto L8a
        L50:
            com.huawei.openalliance.ad.ppskit.beans.metadata.VideoInfo r1 = r2.h0()
            if (r1 == 0) goto Lf
            com.huawei.openalliance.ad.ppskit.beans.metadata.VideoInfo r1 = r2.h0()
            java.lang.Float r1 = r1.A()
            if (r1 != 0) goto L63
            if (r4 != 0) goto L86
            goto L88
        L63:
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r4 != 0) goto L70
            float r6 = r1.floatValue()
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 >= 0) goto L70
            goto L88
        L70:
            int r6 = r2.z()
            r8 = 12
            if (r6 != r8) goto L7b
            if (r4 != 0) goto L86
            goto L88
        L7b:
            if (r4 != r3) goto L86
            float r1 = r1.floatValue()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L86
            goto L88
        L86:
            r1 = 0
            r3 = r1
        L88:
            if (r3 == 0) goto Lf
        L8a:
            int r3 = r9.f31865u
            int r4 = r9.f31866v
            java.lang.String r5 = r9.f31867w
            boolean r6 = r9.f31868x
            r1 = r7
            r1.k(r2, r3, r4, r5, r6)
            goto Lf
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.t1.run():void");
    }
}
