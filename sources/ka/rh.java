package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;

/* loaded from: classes2.dex */
public final class rh implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f31775s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f31776t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f31777u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ qh f31778v;

    public rh(qh qhVar, int i10, String str, String str2) {
        this.f31778v = qhVar;
        this.f31775s = i10;
        this.f31776t = str;
        this.f31777u = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o c10;
        boolean isEmpty = TextUtils.isEmpty(this.f31776t);
        int i10 = this.f31775s;
        if (isEmpty && i10 == 0) {
            i10 = -2;
        }
        p pVar = new p(this.f31778v.f31696b);
        String str = this.f31777u;
        Context context = pVar.f31722a;
        try {
            if (ConfigSpHandler.b(context).m() && (c10 = pVar.c(str, true)) != null) {
                c10.f31525a = "125";
                c10.L = i10;
                new ke(context, new sh(context, 0), null).t(str, c10, false, true);
            }
        } catch (Throwable th) {
            n7.h("AnalysisReport", "onUserDetect：%s", th.getClass().getSimpleName());
        }
    }
}
