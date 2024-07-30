package db;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import ka.d5;
import ka.n7;

/* loaded from: classes2.dex */
public final class c implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f27576s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f27577t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d5 f27578u;

    public c(String str, Context context, d5 d5Var) {
        this.f27576s = str;
        this.f27577t = context;
        this.f27578u = d5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SourceParam sourceParam = new SourceParam();
        sourceParam.l(false);
        sourceParam.o(true);
        sourceParam.t("webview_preload");
        sourceParam.j();
        sourceParam.m();
        String str = this.f27576s;
        sourceParam.n(str);
        Context context = this.f27577t;
        e6.c e10 = new za.c(context, sourceParam).e();
        if (e10 != null) {
            String str2 = e10.f27764a;
            if (!TextUtils.isEmpty(str2)) {
                n7.c("PreloadWebView", "download url is : %s , filePath is : %s", y1.j(str), y1.j(this.f27578u.h(context, str2)));
            }
        }
    }
}
