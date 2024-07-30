package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.constant.ah;
import com.huawei.openalliance.ad.ppskit.beans.inner.AnalysisEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import ka.c7;
import ka.db;
import ka.dj;
import ka.e9;
import ka.eb;
import ka.f9;
import ka.h9;
import ka.hb;
import ka.i9;
import ka.ib;
import ka.n7;
import ka.n9;
import ka.pc;
import ka.qc;
import ka.r8;
import ka.t8;
import ka.u8;
import ka.w7;
import ka.w8;

/* loaded from: classes2.dex */
public class RewardVideoView extends RewardMediaView implements db, dj {
    public eb F;
    public qc G;
    public VideoView H;
    public boolean I;
    public VideoInfo J;
    public boolean K;
    public boolean L;
    public long M;
    public long N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public ImageView S;
    public n9 T;
    public e U;
    public boolean V;
    public int W;

    /* renamed from: c0, reason: collision with root package name */
    public int f23325c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f23326d0;

    /* renamed from: e0, reason: collision with root package name */
    public long f23327e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f23328f0;

    /* loaded from: classes2.dex */
    public class a implements h9 {
        public a() {
        }

        @Override // ka.h9
        public final void a(int i10, int i11) {
            RewardVideoView rewardVideoView = RewardVideoView.this;
            eb ebVar = rewardVideoView.F;
            if (ebVar != null && rewardVideoView.O) {
                ebVar.a(i10);
            }
            rewardVideoView.W = i11;
        }

        @Override // ka.h9
        public final void h(w7 w7Var, int i10) {
            RewardVideoView.u(RewardVideoView.this, i10, false);
        }

        @Override // ka.h9
        public final void j(w7 w7Var, int i10) {
            float f;
            if (n7.d()) {
                n7.c("RewardVideoView", "onMediaStart: %s", Integer.valueOf(i10));
            }
            RewardVideoView rewardVideoView = RewardVideoView.this;
            rewardVideoView.setTryPlayStartTime(-1L);
            rewardVideoView.O = true;
            rewardVideoView.N = i10;
            rewardVideoView.M = System.currentTimeMillis();
            if (i10 > 0) {
                eb ebVar = rewardVideoView.F;
                if (ebVar != null) {
                    if (!ebVar.f31128u && ebVar.f31129v) {
                        n7.g("OmPresent", "resume: Video completed");
                    } else {
                        hb hbVar = ebVar.f31126s;
                        if (hbVar instanceof ib) {
                            ((ib) hbVar).H();
                        }
                    }
                }
                qc qcVar = rewardVideoView.G;
                androidx.activity.n.x0(qcVar.f31679v, (ContentRecord) qcVar.f32660t);
                return;
            }
            if (rewardVideoView.F != null && rewardVideoView.J != null) {
                n7.e("RewardVideoView", "om start");
                String soundSwitch = rewardVideoView.J.getSoundSwitch();
                eb ebVar2 = rewardVideoView.F;
                float videoDuration = rewardVideoView.J.getVideoDuration();
                boolean z10 = !"y".equals(soundSwitch);
                if (!ebVar2.f31128u && ebVar2.f31129v) {
                    n7.g("OmPresent", "start: Video completed");
                } else {
                    hb hbVar2 = ebVar2.f31126s;
                    if (hbVar2 instanceof ib) {
                        ib ibVar = (ib) hbVar2;
                        ibVar.f31280x = 1;
                        ibVar.f31279w = z10;
                        if (z10) {
                            f = gl.Code;
                        } else {
                            f = 1.0f;
                        }
                        ibVar.s(videoDuration, f);
                    }
                }
            }
            qc qcVar2 = rewardVideoView.G;
            androidx.activity.n.q0(qcVar2.f31679v, (ContentRecord) qcVar2.f32660t);
            qc qcVar3 = rewardVideoView.G;
            n9 n9Var = rewardVideoView.T;
            long j10 = n9Var.f31500d;
            long j11 = n9Var.f31499c;
            long j12 = rewardVideoView.M;
            qcVar3.getClass();
            long j13 = 0;
            if (j10 != 0 && j10 < j12) {
                long j14 = j12 - j10;
                if (j11 != 0 && j11 < j12) {
                    j13 = j12 - j11;
                }
                a0.a.P(qcVar3.f31679v, (ContentRecord) qcVar3.f32660t, j14, j13);
            }
        }

        @Override // ka.h9
        public final void m(w7 w7Var, int i10) {
            RewardVideoView.u(RewardVideoView.this, i10, true);
        }

        @Override // ka.h9
        public final void o(w7 w7Var, int i10) {
            RewardVideoView.u(RewardVideoView.this, i10, false);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements i9 {
        public b() {
        }

        @Override // ka.i9
        public final void a() {
            RewardVideoView rewardVideoView = RewardVideoView.this;
            VideoInfo videoInfo = rewardVideoView.J;
            if (videoInfo != null) {
                videoInfo.C = "n";
                rewardVideoView.F.e(gl.Code);
            }
        }

        @Override // ka.i9
        public final void b() {
            RewardVideoView rewardVideoView = RewardVideoView.this;
            VideoInfo videoInfo = rewardVideoView.J;
            if (videoInfo != null) {
                videoInfo.C = "y";
                rewardVideoView.F.e(1.0f);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements f9 {
        public c() {
        }

        @Override // ka.f9
        public final void g(w7 w7Var, int i10, int i11, int i12) {
            RewardVideoView.u(RewardVideoView.this, i10, false);
        }
    }

    /* loaded from: classes2.dex */
    public static class e implements f {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<RewardVideoView> f23333a;

        public e(RewardVideoView rewardVideoView) {
            this.f23333a = new WeakReference<>(rewardVideoView);
        }
    }

    /* loaded from: classes2.dex */
    public interface f {
    }

    public RewardVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = new eb();
        this.L = true;
        this.R = false;
        this.V = true;
        this.W = 0;
        this.f23325c0 = 0;
        this.f23326d0 = 5000;
        this.f23327e0 = -1L;
        this.f23328f0 = false;
        a aVar = new a();
        b bVar = new b();
        c cVar = new c();
        d dVar = new d();
        LayoutInflater.from(context).inflate(R.layout.hiad_adscore_reward_pure_video_view, this);
        this.G = new qc(context, this);
        this.T = new n9("RewardVideoView");
        this.U = new e(this);
        VideoView videoView = (VideoView) findViewById(R.id.hiad_id_video_view);
        this.H = videoView;
        videoView.setScreenOnWhilePlaying(true);
        this.H.setAutoScaleResizeLayoutOnVideoSizeChange(false);
        this.H.E.add(aVar);
        this.H.v(cVar);
        this.H.w(bVar);
        this.H.F.add(dVar);
        this.H.setMuteOnlyOnLostAudioFocus(true);
        this.H.setCacheType("insre");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTryPlayStartTime(long j10) {
        this.f23327e0 = j10;
    }

    public static void u(RewardVideoView rewardVideoView, int i10, boolean z10) {
        rewardVideoView.T.c();
        if (rewardVideoView.O) {
            rewardVideoView.O = false;
            rewardVideoView.setPreferStartPlayTime(i10);
            if (!z10 && !rewardVideoView.R) {
                qc qcVar = rewardVideoView.G;
                androidx.activity.n.J(qcVar.f31679v, (ContentRecord) qcVar.f32660t, ah.C, rewardVideoView.M, System.currentTimeMillis(), (int) rewardVideoView.N, i10);
                rewardVideoView.F.h();
                return;
            }
            qc qcVar2 = rewardVideoView.G;
            androidx.activity.n.J(qcVar2.f31679v, (ContentRecord) qcVar2.f32660t, ah.Z, rewardVideoView.M, System.currentTimeMillis(), (int) rewardVideoView.N, i10);
            rewardVideoView.F.g();
        }
    }

    public final void a(int i10, int i11) {
        qc qcVar = this.G;
        if (qcVar == null || i10 != 1 || i10 == i11) {
            return;
        }
        AnalysisEventReport y = a0.a.y((ContentRecord) qcVar.f32660t);
        y.c(i11);
        c7.l(qcVar.f31679v).k("reportNoCachePlayInCacheMode", com.huawei.openalliance.ad.ppskit.utils.y0.q(null, y), null, null);
    }

    public final void g() {
        if (!x()) {
            return;
        }
        qc qcVar = this.G;
        VideoInfo videoInfo = this.J;
        qcVar.getClass();
        if (videoInfo != null) {
            n7.e("RewardVideoViewPresenter", "checkVideoHash");
            p2.d(new pc(qcVar, videoInfo));
        }
    }

    public r8 getCurrentState() {
        return this.H.getCurrentState();
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.RewardMediaView
    public int getPlayedProgress() {
        VideoInfo videoInfo = this.J;
        if (videoInfo != null && videoInfo.getVideoDuration() > 0) {
            this.f23325c0 = (int) ((getPlayedTime() / this.J.getVideoDuration()) * 100.0f);
        }
        return this.f23325c0;
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.RewardMediaView
    public int getPlayedTime() {
        return this.W;
    }

    public void setAudioFocusType(int i10) {
        this.H.setAudioFocusType(i10);
    }

    public void setAutoScaleResizeLayoutOnVideoSizeChange(boolean z10) {
        VideoView videoView = this.H;
        if (videoView != null) {
            videoView.setAutoScaleResizeLayoutOnVideoSizeChange(z10);
        }
    }

    public void setPreferStartPlayTime(int i10) {
        this.Q = i10;
        this.H.setPreferStartPlayTime(i10);
    }

    public void setUnUseDefault(boolean z10) {
        this.V = z10;
    }

    public void setVideoBackgroundColor(int i10) {
        VideoView videoView = this.H;
        if (videoView != null) {
            videoView.setBackgroundColor(i10);
        }
    }

    public void setVideoFinish(boolean z10) {
        this.R = z10;
    }

    public void setVideoScaleMode(int i10) {
        VideoView videoView = this.H;
        if (videoView != null) {
            videoView.setVideoScaleMode(i10);
        }
    }

    public final void v(boolean z10, boolean z11) {
        n7.e("RewardVideoView", "play, auto:true, isMute:" + z11);
        if (this.I) {
            w(z11);
        } else {
            this.K = true;
            this.P = z11;
        }
    }

    public final void w(boolean z10) {
        n7.f("RewardVideoView", "doRealPlay, auto:%s, isMute:%s", Boolean.TRUE, Boolean.valueOf(z10));
        this.T.a();
        if (z10) {
            this.H.E();
        } else {
            this.H.f();
        }
        if (this.H.getCurrentState().b(r8.b.PLAYBACK_COMPLETED)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.H.A.g(this.Q, 1);
            } else {
                this.H.A.g(this.Q, 0);
            }
        } else {
            this.H.setPreferStartPlayTime(this.Q);
        }
        this.H.x(true);
        HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
        setTryPlayStartTime(System.currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x() {
        /*
            r5 = this;
            android.content.Context r0 = r5.getContext()
            boolean r0 = com.huawei.openalliance.ad.ppskit.utils.d0.m(r0)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            ka.qc r0 = r5.G
            java.lang.Object r2 = r0.f32660t
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r2 = (com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord) r2
            r3 = 1
            if (r2 != 0) goto L16
            goto L47
        L16:
            android.content.Context r2 = r0.f31679v
            com.huawei.openalliance.ad.ppskit.handlers.l r2 = com.huawei.openalliance.ad.ppskit.handlers.l.d(r2)
            java.lang.Object r0 = r0.f32660t
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r0 = (com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord) r0
            java.lang.String r0 = r0.h1()
            byte[] r4 = r2.f22585a
            monitor-enter(r4)
            java.util.Map r0 = r2.K(r0, r3)     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L49
            java.lang.String r2 = "cacheOnLineStream"
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = "1"
            boolean r2 = android.text.TextUtils.equals(r0, r2)     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L3e
            goto L49
        L3e:
            java.lang.String r2 = "0"
            boolean r0 = android.text.TextUtils.equals(r0, r2)     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L49
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L56
        L47:
            r0 = r1
            goto L4b
        L49:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L56
            r0 = r3
        L4b:
            if (r0 != 0) goto L55
            java.lang.String r0 = "RewardVideoView"
            java.lang.String r2 = "cacheOnlineStream switch off"
            ka.n7.e(r0, r2)
            return r1
        L55:
            return r3
        L56:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L56
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.RewardVideoView.x():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y() {
        /*
            r14 = this;
            java.lang.String r0 = "RewardVideoView"
            java.lang.String r1 = "pauseView"
            ka.n7.e(r0, r1)
            ka.qc r1 = r14.G
            r2 = 1
            if (r1 == 0) goto Lba
            ka.n9 r1 = r14.T
            if (r1 == 0) goto Lba
            com.huawei.openalliance.ad.ppskit.views.VideoView r1 = r14.H
            if (r1 == 0) goto Lba
            boolean r3 = r14.f23328f0
            if (r3 != 0) goto Lba
            ka.r8 r1 = r1.getCurrentState()
            ka.r8$b r3 = ka.r8.b.ERROR
            boolean r4 = r1.b(r3)
            r5 = -2
            r6 = 0
            r7 = 0
            r8 = 0
            if (r4 == 0) goto L2e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            goto L54
        L2e:
            long r10 = r14.f23327e0
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 <= 0) goto L4a
            boolean r4 = r14.O
            if (r4 != 0) goto L4a
            java.util.HashMap r4 = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a
            long r10 = java.lang.System.currentTimeMillis()
            long r12 = r14.f23327e0
            long r10 = r10 - r12
            int r4 = r14.f23326d0
            long r12 = (long) r4
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 <= 0) goto L4a
            r4 = r2
            goto L4b
        L4a:
            r4 = r7
        L4b:
            if (r4 == 0) goto L53
            r4 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L54
        L53:
            r4 = r6
        L54:
            boolean r1 = r1.b(r3)
            if (r1 == 0) goto L5e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
        L5e:
            if (r4 == 0) goto Lba
            r14.f23328f0 = r2
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r7] = r4
            java.lang.String r3 = "video error: %s"
            ka.n7.f(r0, r3, r1)
            long r10 = r14.f23327e0
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 <= 0) goto L7a
            java.util.HashMap r1 = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a
            long r8 = java.lang.System.currentTimeMillis()
            long r10 = r14.f23327e0
            long r8 = r8 - r10
        L7a:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            r1[r7] = r3
            java.lang.String r3 = "do play time: %s"
            ka.n7.c(r0, r3, r1)
            ka.qc r0 = r14.G
            android.content.Context r1 = r14.getContext()
            android.content.Context r1 = r1.getApplicationContext()
            int r3 = r14.W
            long r10 = (long) r3
            int r3 = r4.intValue()
            java.lang.Object r0 = r0.f32660t
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r0 = (com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord) r0
            com.huawei.openalliance.ad.ppskit.beans.inner.AnalysisEventReport r0 = a0.a.y(r0)
            r0.d(r8)
            r0.g(r10)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.h(r3)
            ka.c7 r1 = ka.c7.l(r1)
            java.lang.String r0 = com.huawei.openalliance.ad.ppskit.utils.y0.q(r6, r0)
            java.lang.String r3 = "reportVideoPlayException"
            r1.k(r3, r0, r6, r6)
        Lba:
            r0 = -1
            r14.setTryPlayStartTime(r0)
            com.huawei.openalliance.ad.ppskit.views.VideoView r0 = r14.H
            r0.M = r2
            ka.w7 r0 = r0.A
            r0.C()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.RewardVideoView.y():void");
    }

    /* loaded from: classes2.dex */
    public class d implements e9 {
        public d() {
        }

        @Override // ka.e9
        public final void a() {
            RewardVideoView rewardVideoView = RewardVideoView.this;
            eb ebVar = rewardVideoView.F;
            if (ebVar.f31128u || !ebVar.f31129v) {
                hb hbVar = ebVar.f31126s;
                if (hbVar instanceof ib) {
                    ((ib) hbVar).C();
                }
            }
            if (n7.d()) {
                n7.b("RewardVideoView", "onBufferingStart");
            }
            rewardVideoView.T.b();
        }

        @Override // ka.e9
        public final void b() {
            eb ebVar = RewardVideoView.this.F;
            if (ebVar.f31128u || !ebVar.f31129v) {
                hb hbVar = ebVar.f31126s;
                if (hbVar instanceof ib) {
                    ((ib) hbVar).E();
                }
            }
        }

        @Override // ka.e9
        public final void a(int i10) {
        }
    }

    @Override // ka.dj
    public final void a(VideoInfo videoInfo, boolean z10) {
        t8 t8Var;
        int i10 = 1;
        n7.f("RewardVideoView", "onCheckVideoHashResult sucess: %s", Boolean.TRUE);
        if (this.J == null || videoInfo == null) {
            return;
        }
        this.J = videoInfo;
        this.I = true;
        String videoDownloadUrl = videoInfo.getVideoDownloadUrl();
        this.C = videoDownloadUrl;
        int videoPlayMode = videoInfo.getVideoPlayMode();
        boolean t10 = y1.t(videoDownloadUrl);
        if (t10) {
            videoPlayMode = 2;
        }
        if (t10 && x() && com.huawei.openalliance.ad.ppskit.utils.g.f22851c != null) {
            Context applicationContext = getContext().getApplicationContext();
            String str = null;
            try {
                w8.b().getClass();
                synchronized (w8.f32129c) {
                    w8.f32130d.clear();
                }
                a4.l lVar = new a4.l(i10, new androidx.appcompat.app.r(applicationContext), new com.huawei.openalliance.ad.ppskit.utils.h(applicationContext, "normal"));
                u8 u8Var = new u8(lVar, com.huawei.openalliance.ad.ppskit.utils.g.f22851c, this.U);
                u8Var.a(applicationContext);
                t8Var = new t8(applicationContext, lVar, u8Var);
            } catch (Exception e10) {
                n7.j("RewardVideoView", "CreativeHttpServer boot failed ,erorr:%s", e10.getClass().getSimpleName());
                t8Var = null;
            }
            if (t8Var != null) {
                String a10 = t8Var.f31879a.a(videoInfo.f22646t);
                if (!(!y1.h(a10))) {
                    a10 = videoInfo.f22646t;
                    u8 u8Var2 = t8Var.f31880b;
                    if (u8Var2 != null && u8Var2.f) {
                        try {
                            a10 = t8Var.a(videoInfo);
                        } catch (Throwable unused) {
                            n7.i("CreativeHttpProxy", "Url encode failed,use origin url");
                        }
                    }
                }
                str = a10;
            }
            if (!TextUtils.isEmpty(str)) {
                n7.e("RewardVideoView", "use local proxy");
                videoPlayMode = 3;
                videoDownloadUrl = str;
            }
        }
        n7.f("RewardVideoView", "videoUrl: %s", y1.j(videoDownloadUrl));
        a(videoInfo.getVideoPlayMode(), videoPlayMode);
        this.H.setVideoFileUrl(videoDownloadUrl);
        if (this.K) {
            n7.e("RewardVideoView", "play when hash check success");
            w(this.P);
        }
        if (this.L) {
            n7.e("RewardVideoView", "prefect when hash check success");
            this.H.A.m();
        }
    }

    @Override // ka.db
    public View getOpenMeasureView() {
        return this;
    }
}
