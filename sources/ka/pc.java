package ka;

import com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo;

/* loaded from: classes2.dex */
public final class pc implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ VideoInfo f31649s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ qc f31650t;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            pc pcVar = pc.this;
            ((dj) ((p9) pcVar.f31650t.f32659s)).a(pcVar.f31649s, true);
        }
    }

    public pc(qc qcVar, VideoInfo videoInfo) {
        this.f31650t = qcVar;
        this.f31649s = videoInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoInfo videoInfo = this.f31649s;
        if (com.huawei.openalliance.ad.ppskit.utils.y1.t(videoInfo.getVideoDownloadUrl()) || videoInfo.a(this.f31650t.f31679v)) {
            com.huawei.openalliance.ad.ppskit.utils.d2.a(new a());
        }
    }
}
