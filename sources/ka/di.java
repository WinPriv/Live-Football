package ka;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;

/* loaded from: classes2.dex */
public final class di implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Asset f31107s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o6 f31108t;

    public di(Asset asset, com.huawei.openalliance.ad.ppskit.handlers.i0 i0Var) {
        this.f31107s = asset;
        this.f31108t = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SourceParam sourceParam;
        boolean z10;
        Asset asset = this.f31107s;
        if (asset != null && asset.q() != null) {
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
            sourceParam.h("tmaterial");
            sourceParam.a();
        } else {
            sourceParam = null;
        }
        if (sourceParam != null) {
            sourceParam.o(true);
            sourceParam.t("tplate");
            e6.c f = ((com.huawei.openalliance.ad.ppskit.handlers.i0) this.f31108t).f(sourceParam);
            if (f == null || TextUtils.isEmpty(f.f27764a)) {
                n7.e("TDownloadUtil", "down asset failed");
            }
        }
    }
}
