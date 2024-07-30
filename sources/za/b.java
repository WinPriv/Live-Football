package za;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.HttpConnection;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import e0.i;
import ka.ke;
import ka.n7;
import ka.o;
import ka.u;
import ka.zh;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SourceParam f37342s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f37343t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f37344u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f37345v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f37346w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f37347x;
    public final /* synthetic */ c y;

    public b(c cVar, SourceParam sourceParam, String str, long j10, long j11, int i10, String str2) {
        this.y = cVar;
        this.f37342s = sourceParam;
        this.f37343t = str;
        this.f37344u = j10;
        this.f37345v = j11;
        this.f37346w = i10;
        this.f37347x = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        String r10;
        HttpConnection z10;
        Long l10;
        int i10;
        ContentRecord contentRecord;
        Long l11;
        String str;
        String str2;
        u uVar = this.y.f37353d;
        long j10 = this.f37345v;
        uVar.getClass();
        SourceParam sourceParam = this.f37342s;
        if (sourceParam == null) {
            n7.g("AnalysisReport", "reportAdResDownloadEvent, sourceParam is null");
            return;
        }
        String str3 = this.f37343t;
        str3.getClass();
        int hashCode = str3.hashCode();
        if (hashCode != 50) {
            if (hashCode != 51) {
                if (hashCode != 53) {
                    if (hashCode != 1755) {
                        if (hashCode == 1756 && str3.equals("73")) {
                            c10 = 4;
                        }
                        c10 = 65535;
                    } else {
                        if (str3.equals("72")) {
                            c10 = 3;
                        }
                        c10 = 65535;
                    }
                } else {
                    if (str3.equals("5")) {
                        c10 = 2;
                    }
                    c10 = 65535;
                }
            } else {
                if (str3.equals("3")) {
                    c10 = 1;
                }
                c10 = 65535;
            }
        } else {
            if (str3.equals("2")) {
                c10 = 0;
            }
            c10 = 65535;
        }
        long j11 = this.f37344u;
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 == 4) {
                            ContentRecord w10 = sourceParam.w();
                            String y = sourceParam.y();
                            try {
                                if (w10 == null) {
                                    n7.g("AnalysisReport", "onDiskSpaceInsufficient, contentRecord is null");
                                } else {
                                    int z02 = w10.z0();
                                    o f = uVar.f(w10);
                                    if (f != null) {
                                        f.f31525a = "73";
                                        f.D = y;
                                        Context context = uVar.f31722a;
                                        ke keVar = new ke(context, zh.a(z02, context), null);
                                        keVar.f31382b = w10;
                                        keVar.t(f.f31552l, f, false, true);
                                    }
                                }
                                return;
                            } catch (Throwable th) {
                                i.p(th, "onDiskSpaceInsufficient:", "AnalysisReport");
                                return;
                            }
                        }
                        return;
                    }
                    uVar.k(sourceParam.r(), sourceParam.w(), sourceParam.y(), sourceParam.z());
                    return;
                }
                uVar.l(sourceParam.r(), sourceParam.v(), Long.valueOf(j11), sourceParam.B(), Long.valueOf(j10), false, sourceParam.w(), sourceParam.y(), sourceParam.A(), sourceParam.z());
                return;
            }
            r10 = sourceParam.r();
            i10 = Integer.valueOf("3").intValue();
            Long v3 = sourceParam.v();
            Long valueOf = Long.valueOf(j11);
            ContentRecord w11 = sourceParam.w();
            String y10 = sourceParam.y();
            z10 = sourceParam.z();
            l11 = valueOf;
            str = "res check failed";
            str2 = y10;
            contentRecord = w11;
            l10 = v3;
        } else {
            r10 = sourceParam.r();
            Long v10 = sourceParam.v();
            Long valueOf2 = Long.valueOf(j11);
            ContentRecord w12 = sourceParam.w();
            String y11 = sourceParam.y();
            z10 = sourceParam.z();
            l10 = v10;
            i10 = this.f37346w;
            contentRecord = w12;
            l11 = valueOf2;
            str = this.f37347x;
            str2 = y11;
        }
        uVar.j(r10, i10, str, l10, l11, j10, contentRecord, str2, z10);
    }
}
