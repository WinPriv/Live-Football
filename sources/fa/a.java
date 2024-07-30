package fa;

import android.content.Context;
import com.huawei.openalliance.ad.inter.HiAd;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f28216s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ HiAd f28217t;

    public a(HiAd hiAd, String str) {
        this.f28217t = hiAd;
        this.f28216s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object d10;
        Class a10 = androidx.transition.n.a("com.huawei.openalliance.ad.inter.n");
        if (a10 != null && (d10 = androidx.transition.n.d(null, a10, "getInstance", new Class[]{Context.class}, new Object[]{this.f28217t.f22217a})) != null) {
            androidx.transition.n.d(d10, a10, this.f28216s, null, null);
        }
    }
}
