package ka;

import com.huawei.openalliance.ad.ppskit.beans.metadata.VideoInfo;

/* loaded from: classes2.dex */
public final class se implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ VideoInfo f31844s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f31845t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f31846u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Integer f31847v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f31848w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ te f31849x;

    public se(te teVar, VideoInfo videoInfo, String str, String str2, Integer num, boolean z10) {
        this.f31849x = teVar;
        this.f31844s = videoInfo;
        this.f31845t = str;
        this.f31846u = str2;
        this.f31847v = num;
        this.f31848w = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        te.d(this.f31849x, this.f31844s, this.f31845t, this.f31846u, this.f31847v, this.f31848w);
    }
}
