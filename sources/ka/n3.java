package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.download.app.AppDownloadTask;

/* loaded from: classes2.dex */
public final class n3 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31475s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f31476t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AppDownloadTask f31477u = null;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f31478v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f31479w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f31480x;
    public final /* synthetic */ int y;

    public n3(String str, String str2, Context context, String str3, String str4, int i10) {
        this.f31475s = str;
        this.f31476t = str2;
        this.f31478v = context;
        this.f31479w = str3;
        this.f31480x = str4;
        this.y = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ContentRecord contentRecord;
        String str;
        String str2;
        String str3;
        String str4;
        ContentRecord contentRecord2 = null;
        AppDownloadTask appDownloadTask = this.f31477u;
        if (appDownloadTask != null) {
            lg g02 = appDownloadTask.g0();
            if (g02 != null) {
                contentRecord2 = ((ke) g02).f31382b;
            }
            String d02 = appDownloadTask.d0();
            String W = appDownloadTask.W();
            String F0 = appDownloadTask.F0();
            contentRecord = contentRecord2;
            str2 = appDownloadTask.i0();
            str3 = d02;
            str4 = W;
            str = F0;
        } else {
            contentRecord = null;
            str = null;
            str2 = null;
            str3 = this.f31475s;
            str4 = this.f31476t;
        }
        p pVar = new p(this.f31478v);
        pVar.f31723b = this.f31479w;
        pVar.p(str3, str4, contentRecord, this.f31480x, this.y, "syncAgStatus", str, str2);
    }
}
