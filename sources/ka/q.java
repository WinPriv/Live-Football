package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public final class q implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f31668s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ContentRecord f31669t;

    public q(Context context, ContentRecord contentRecord) {
        this.f31668s = context;
        this.f31669t = contentRecord;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = new p(this.f31668s);
        ContentRecord contentRecord = this.f31669t;
        try {
            if (contentRecord == null) {
                n7.g("AnalysisReport", "onVideoNotDownloadInNonWifi, contentRecord is null");
            } else {
                String h12 = contentRecord.h1();
                o f = pVar.f(contentRecord);
                if (f != null) {
                    f.f31525a = "121";
                    f.H = contentRecord.n1();
                    Context context = pVar.f31722a;
                    new ke(context, zh.a(f.f31569u.intValue(), context), contentRecord).p(h12, f, false, true);
                }
            }
        } catch (Throwable th) {
            e0.i.p(th, "onVideoNotDownloadInNonWifi:", "AnalysisReport");
        }
    }
}
