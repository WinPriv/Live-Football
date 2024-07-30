package ka;

import com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo;

/* loaded from: classes2.dex */
public final class h7 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31231s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ VideoInfo f31232t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f31233u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j7 f31234v;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f31235s;

        public a(boolean z10) {
            this.f31235s = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h7 h7Var = h7.this;
            ((wa.e) ((p9) h7Var.f31234v.f32659s)).a(h7Var.f31232t, this.f31235s);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            h7 h7Var = h7.this;
            ((wa.e) ((p9) h7Var.f31234v.f32659s)).a(h7Var.f31232t, h7Var.f31233u);
        }
    }

    public h7(j7 j7Var, String str, VideoInfo videoInfo, boolean z10) {
        this.f31234v = j7Var;
        this.f31231s = str;
        this.f31232t = videoInfo;
        this.f31233u = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String f = d5.f(this.f31231s);
        j7 j7Var = this.f31234v;
        if (com.huawei.openalliance.ad.ppskit.utils.x.o(j7Var.f31322v, y4.a(j7Var.f31322v, "normal").h(j7Var.f31322v, f))) {
            if (n7.d()) {
                n7.c("NativeVideoP", "video has cached: %s", f);
            }
            VideoInfo videoInfo = this.f31232t;
            videoInfo.f22645s = f;
            com.huawei.openalliance.ad.ppskit.utils.d2.a(new a(videoInfo.a(j7Var.f31322v)));
            return;
        }
        n7.b("NativeVideoP", "video not cached, play from net.");
        com.huawei.openalliance.ad.ppskit.utils.d2.a(new b());
    }
}
