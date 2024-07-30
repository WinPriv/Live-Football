package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.fg;
import com.huawei.hms.ads.fh;
import com.huawei.hms.ads.fj;
import com.huawei.hms.ads.fk;
import com.huawei.hms.ads.fl;
import com.huawei.hms.ads.fm;
import com.huawei.hms.ads.fn;
import com.huawei.hms.ads.fw;
import com.huawei.hms.ads.gl;
import com.huawei.hms.ads.go;
import com.huawei.hms.ads.ha;
import com.huawei.hms.ads.im;
import com.huawei.hms.ads.kh;
import com.huawei.hms.ads.placement.R;

/* loaded from: classes2.dex */
public class PlacementVideoView extends PlacementMediaView implements kh {
    public static final /* synthetic */ int D0 = 0;
    public int A0;
    public fw B0;
    public ha C0;

    /* renamed from: q0, reason: collision with root package name */
    public im f24045q0;

    /* renamed from: r0, reason: collision with root package name */
    public VideoView f24046r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f24047s0;

    /* renamed from: t0, reason: collision with root package name */
    public com.huawei.openalliance.ad.inter.data.l f24048t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f24049u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f24050v0;

    /* renamed from: w0, reason: collision with root package name */
    public long f24051w0;

    /* renamed from: x0, reason: collision with root package name */
    public long f24052x0;
    public boolean y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f24053z0;

    /* loaded from: classes2.dex */
    public class b implements fk {
        public b() {
        }

        @Override // com.huawei.hms.ads.fk
        public final void Code(int i10, int i11) {
        }

        @Override // com.huawei.hms.ads.fk
        public final void I(ia.a aVar, int i10) {
            ex.V("PlacementVideoView", "onMediaStop");
            int i11 = PlacementVideoView.D0;
            PlacementVideoView.this.Code(i10, false);
        }

        @Override // com.huawei.hms.ads.fk
        public final void V(ia.a aVar, int i10) {
            ex.V("PlacementVideoView", "onMediaPause");
            int i11 = PlacementVideoView.D0;
            PlacementVideoView.this.Code(i10, false);
        }

        @Override // com.huawei.hms.ads.fk
        public final void Z(ia.a aVar, int i10) {
            ex.V("PlacementVideoView", "onMediaCompletion");
            int i11 = PlacementVideoView.D0;
            PlacementVideoView.this.Code(i10, true);
        }

        @Override // com.huawei.hms.ads.fk
        public final void Code(ia.a aVar, int i10) {
            boolean Code = ex.Code();
            PlacementVideoView placementVideoView = PlacementVideoView.this;
            if (Code) {
                ex.Code(placementVideoView.getTAG(), "contentId: %s onMediaStart:  %s", placementVideoView.f24039l0, Integer.valueOf(i10));
            }
            placementVideoView.y0 = true;
            placementVideoView.f24052x0 = i10;
            placementVideoView.f24051w0 = System.currentTimeMillis();
            if (i10 > 0) {
                placementVideoView.f24045q0.V();
            } else {
                placementVideoView.f24045q0.Code();
                placementVideoView.f24045q0.Code(placementVideoView.B0.B(), placementVideoView.B0.Z(), placementVideoView.f24051w0);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements fl {
        public c() {
        }

        @Override // com.huawei.hms.ads.fl
        public final void Code() {
            PlacementVideoView placementVideoView = PlacementVideoView.this;
            com.huawei.openalliance.ad.inter.data.l lVar = placementVideoView.f24048t0;
            if (lVar != null) {
                lVar.f22287x = "n";
                placementVideoView.C0.V(gl.Code);
            }
        }

        @Override // com.huawei.hms.ads.fl
        public final void V() {
            PlacementVideoView placementVideoView = PlacementVideoView.this;
            com.huawei.openalliance.ad.inter.data.l lVar = placementVideoView.f24048t0;
            if (lVar != null) {
                lVar.f22287x = "y";
                placementVideoView.C0.V(1.0f);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements fh {
        public d() {
        }

        @Override // com.huawei.hms.ads.fh
        public final void Code(ia.a aVar, int i10, int i11, int i12) {
            int i13 = PlacementVideoView.D0;
            PlacementVideoView.this.Code(i10, false);
        }
    }

    public PlacementVideoView(Context context) {
        super(context);
        this.f24050v0 = true;
        this.C0 = new go();
        a aVar = new a();
        b bVar = new b();
        c cVar = new c();
        d dVar = new d();
        LayoutInflater.from(context).inflate(R.layout.hiad_placement_pure_video_view, this);
        this.f24045q0 = new im(context, this);
        this.B0 = new fw(getTAG());
        VideoView videoView = (VideoView) findViewById(R.id.hiad_id_video_view);
        this.f24046r0 = videoView;
        videoView.setScreenOnWhilePlaying(true);
        this.f24046r0.setAutoScaleResizeLayoutOnVideoSizeChange(false);
        this.f24046r0.f23669j0.add(bVar);
        this.f24046r0.f23670k0.add(aVar);
        this.f24046r0.d(dVar);
        this.f24046r0.f23671l0.add(cVar);
        this.f24046r0.setMuteOnlyOnLostAudioFocus(true);
        this.f24046r0.setRemediate(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getTAG() {
        return "PlacementVideoView_" + hashCode();
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void B() {
        this.f24053z0 = false;
        this.f24046r0.c();
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void C() {
        this.f24046r0.L();
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void Code() {
        this.f24046r0.B();
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void I() {
        this.f24053z0 = true;
        this.f24046r0.b();
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void S() {
        this.f24046r0.D();
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void V() {
        if (this.f24046r0 != null) {
            ex.V("PlacementVideoView", "release player");
            ia.a aVar = this.f24046r0.f23665f0;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void b(fg fgVar) {
        VideoView videoView = this.f24046r0;
        if (fgVar == null) {
            videoView.getClass();
        } else {
            videoView.f23670k0.add(fgVar);
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void c(fh fhVar) {
        this.f24046r0.d(fhVar);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void d(fm fmVar) {
        VideoView videoView = this.f24046r0;
        if (fmVar == null) {
            videoView.getClass();
        } else {
            videoView.f23676q0.add(fmVar);
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView, com.huawei.hms.ads.km
    public final void destroyView() {
        ex.V(getTAG(), "destroyView");
        this.f24046r0.destroyView();
        this.C0.I();
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void e(fn fnVar) {
        VideoView videoView = this.f24046r0;
        if (fnVar != null) {
            videoView.f23674o0.add(fnVar);
        } else {
            videoView.getClass();
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void f(boolean z10) {
        ex.V(getTAG(), "play, auto:true, isMute:" + z10);
        if (this.f24047s0) {
            s(z10);
        } else {
            this.f24049u0 = true;
            this.f24053z0 = z10;
        }
    }

    public ia.b getCurrentState() {
        return this.f24046r0.getCurrentState();
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public ImageView getLastFrame() {
        if (this.f24046r0 != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageBitmap(this.f24046r0.getSurfaceBitmap());
            return imageView;
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public ia.b getMediaState() {
        VideoView videoView = this.f24046r0;
        if (videoView != null) {
            return videoView.getMediaState();
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final boolean o() {
        return this.f24046r0.o();
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void p(fn fnVar) {
        VideoView videoView = this.f24046r0;
        if (fnVar != null) {
            videoView.f23675p0.add(fnVar);
        } else {
            videoView.getClass();
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView, com.huawei.hms.ads.km
    public final void pauseView() {
        ex.V(getTAG(), "pauseView");
        this.f24046r0.pauseView();
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView, com.huawei.hms.ads.km
    public final void resumeView() {
        ex.V(getTAG(), "resumeView");
        this.f24046r0.resumeView();
        this.f24046r0.setNeedPauseOnSurfaceDestory(true);
    }

    public final void s(boolean z10) {
        ex.V(getTAG(), "doRealPlay, auto:true, isMute:" + z10);
        this.B0.Code();
        if (z10) {
            this.f24046r0.b();
        } else {
            this.f24046r0.c();
        }
        if (this.f24046r0.getCurrentState().b(ia.d.PLAYBACK_COMPLETED)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f24046r0.f23665f0.V(this.A0, 1);
            } else {
                this.f24046r0.f23665f0.Code(this.A0);
            }
        } else {
            this.f24046r0.setPreferStartPlayTime(this.A0);
        }
        this.f24046r0.h(true);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void setAudioFocusType(int i10) {
        this.f24046r0.setAudioFocusType(i10);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void setMediaPlayerReleaseListener(fj fjVar) {
        VideoView videoView = this.f24046r0;
        if (videoView != null) {
            videoView.setMediaPlayerReleaseListener(fjVar);
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void setPlacementAd(com.huawei.openalliance.ad.inter.data.f fVar) {
        String L;
        int i10;
        ia.b currentState = this.f24046r0.getCurrentState();
        if (this.y == fVar && currentState.d(ia.d.IDLE) && currentState.d(ia.d.ERROR)) {
            ex.V(getTAG(), "setPlacementVideoAd - has the same ad");
            return;
        }
        super.setPlacementAd(fVar);
        String tag = getTAG();
        StringBuilder sb2 = new StringBuilder("set placement ad:");
        if (fVar == null) {
            L = "null";
        } else {
            L = fVar.L();
        }
        sb2.append(L);
        ex.V(tag, sb2.toString());
        ex.V(getTAG(), "resetVideoView");
        setPreferStartPlayTime(0);
        this.f24047s0 = false;
        this.f24049u0 = false;
        this.f24050v0 = true;
        this.f24045q0.Code(this.y);
        Float f = null;
        if (this.y != null) {
            ex.V(getTAG(), "loadVideoInfo");
            com.huawei.openalliance.ad.inter.data.l S = this.y.S();
            if (S != null && "video/mp4".equals(S.f22282s)) {
                this.f24048t0 = S;
                int i11 = S.f22284u;
                if (i11 > 0 && (i10 = S.f22285v) > 0) {
                    f = Float.valueOf(i11 / i10);
                }
                if (f != null) {
                    setRatio(f);
                    this.f24046r0.setRatio(f);
                }
                this.f24046r0.setDefaultDuration((int) this.f24048t0.A);
                this.f24045q0.Code(this.f24048t0);
                this.f24049u0 = false;
                this.f24050v0 = true;
                return;
            }
            return;
        }
        this.f24048t0 = null;
    }

    public void setPreferStartPlayTime(int i10) {
        this.A0 = i10;
        this.f24046r0.setPreferStartPlayTime(i10);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void setSoundVolume(float f) {
        this.f24046r0.setSoundVolume(f);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void Code(int i10) {
        Code(i10, true);
        this.f24046r0.B();
    }

    public final void Code(int i10, boolean z10) {
        ex.V("PlacementVideoView", "onVideoEnd, videoComplete: %s", Boolean.valueOf(z10));
        this.B0.I();
        if (this.y0) {
            this.y0 = false;
            setPreferStartPlayTime(i10);
            if (z10) {
                this.f24045q0.Code(this.f24051w0, System.currentTimeMillis(), this.f24052x0, i10);
            } else {
                this.f24045q0.V(this.f24051w0, System.currentTimeMillis(), this.f24052x0, i10);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void V(fl flVar) {
        VideoView videoView = this.f24046r0;
        if (flVar == null) {
            videoView.getClass();
        } else {
            videoView.f23671l0.remove(flVar);
        }
    }

    /* loaded from: classes2.dex */
    public class a implements fg {
        public a() {
        }

        @Override // com.huawei.hms.ads.fg
        public final void Code() {
            boolean Code = ex.Code();
            PlacementVideoView placementVideoView = PlacementVideoView.this;
            if (Code) {
                ex.Code(placementVideoView.getTAG(), "contentId: %s onBufferingStart", placementVideoView.f24039l0);
            }
            placementVideoView.B0.V();
            placementVideoView.C0.b();
        }

        @Override // com.huawei.hms.ads.fg
        public final void V() {
            PlacementVideoView.this.C0.c();
        }

        @Override // com.huawei.hms.ads.fg
        public final void Code(int i10) {
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void Code(long j10) {
        this.f24045q0.Code(j10);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void Code(fl flVar) {
        VideoView videoView = this.f24046r0;
        if (flVar == null) {
            videoView.getClass();
        } else {
            videoView.f23671l0.add(flVar);
        }
    }

    @Override // com.huawei.hms.ads.kh
    public final void Code(com.huawei.openalliance.ad.inter.data.l lVar, boolean z10) {
        ex.V(getTAG(), "onCheckVideoHashResult sucess: %s", Boolean.valueOf(z10));
        if (!z10 || this.f24048t0 == null || lVar == null) {
            return;
        }
        this.f24048t0 = lVar;
        this.f24047s0 = true;
        String p10 = lVar.p();
        if (TextUtils.isEmpty(p10)) {
            p10 = lVar.f22283t;
        }
        this.f24038k0 = p10;
        this.f24046r0.setVideoFileUrl(p10);
        VideoView videoView = this.f24046r0;
        com.huawei.openalliance.ad.inter.data.k kVar = this.y;
        videoView.setContentId(kVar == null ? null : kVar.L());
        if (this.f24049u0) {
            ex.V(getTAG(), "play when hash check success");
            s(this.f24053z0);
        }
        if (this.f24050v0) {
            ex.V(getTAG(), "prefect when hash check success");
            this.f24046r0.f23665f0.I();
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public final void Code(String str) {
        this.f24045q0.Code(str);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView, com.huawei.hms.ads.gk
    public View getOpenMeasureView() {
        return this;
    }
}
