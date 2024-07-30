package ka;

import com.huawei.openalliance.ad.ppskit.beans.metadata.VideoInfo;

/* loaded from: classes2.dex */
public final class td implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ VideoInfo f31883s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f31884t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f31885u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Integer f31886v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f31887w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ud f31888x;

    public td(ud udVar, VideoInfo videoInfo, String str, String str2, Integer num, boolean z10) {
        this.f31888x = udVar;
        this.f31883s = videoInfo;
        this.f31884t = str;
        this.f31885u = str2;
        this.f31886v = num;
        this.f31887w = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ud.c(this.f31888x, this.f31883s, this.f31884t, this.f31885u, this.f31886v, this.f31887w);
    }
}
