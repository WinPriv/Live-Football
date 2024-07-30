package ka;

import com.huawei.openalliance.ad.ppskit.beans.metadata.Location;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;

/* loaded from: classes2.dex */
public final class wc implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Location f32136s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ad f32137t;

    public wc(ad adVar, Location location) {
        this.f32137t = adVar;
        this.f32136s = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConfigSpHandler.b(this.f32137t.f30934a).h(this.f32136s);
    }
}
