package ka;

import com.huawei.openalliance.ad.ppskit.beans.metadata.VideoInfo;

/* loaded from: classes2.dex */
public final class re implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ VideoInfo f31762s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f31763t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f31764u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Integer f31765v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f31766w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ te f31767x;

    public re(te teVar, VideoInfo videoInfo, String str, String str2, Integer num, boolean z10) {
        this.f31767x = teVar;
        this.f31762s = videoInfo;
        this.f31763t = str;
        this.f31764u = str2;
        this.f31765v = num;
        this.f31766w = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        te.d(this.f31767x, this.f31762s, this.f31763t, this.f31764u, this.f31765v, this.f31766w);
    }
}
