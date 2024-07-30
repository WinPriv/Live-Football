package ka;

import com.huawei.openalliance.ad.ppskit.beans.metadata.VideoInfo;

/* loaded from: classes2.dex */
public final class sd implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ VideoInfo f31838s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f31839t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f31840u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Integer f31841v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f31842w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ud f31843x;

    public sd(ud udVar, VideoInfo videoInfo, String str, String str2, Integer num, boolean z10) {
        this.f31843x = udVar;
        this.f31838s = videoInfo;
        this.f31839t = str;
        this.f31840u = str2;
        this.f31841v = num;
        this.f31842w = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ud.c(this.f31843x, this.f31838s, this.f31839t, this.f31840u, this.f31841v, this.f31842w);
    }
}
