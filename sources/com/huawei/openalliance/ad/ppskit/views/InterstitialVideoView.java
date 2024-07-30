package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.constant.ah;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import ka.e9;
import ka.eb;
import ka.f9;
import ka.g9;
import ka.h9;
import ka.hb;
import ka.hc;
import ka.i9;
import ka.ib;
import ka.n7;
import ka.n9;
import ka.p9;
import ka.w7;

/* loaded from: classes2.dex */
public class InterstitialVideoView extends AutoScaleSizeRelativeLayout implements f9, g9, h9, p9 {
    public ua.a A;
    public VideoView B;
    public long C;
    public long D;
    public int E;
    public hc F;
    public i9 G;
    public eb H;
    public n9 I;
    public boolean J;
    public final b K;

    /* renamed from: x, reason: collision with root package name */
    public boolean f23126x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f23127z;

    /* loaded from: classes2.dex */
    public class b implements i9 {
        public b() {
        }

        @Override // ka.i9
        public final void a() {
            InterstitialVideoView interstitialVideoView = InterstitialVideoView.this;
            i9 i9Var = interstitialVideoView.G;
            if (i9Var != null) {
                i9Var.a();
                interstitialVideoView.H.e(gl.Code);
            }
        }

        @Override // ka.i9
        public final void b() {
            InterstitialVideoView interstitialVideoView = InterstitialVideoView.this;
            i9 i9Var = interstitialVideoView.G;
            if (i9Var != null) {
                i9Var.b();
                interstitialVideoView.H.e(1.0f);
            }
        }
    }

    public InterstitialVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23126x = false;
        this.y = false;
        this.f23127z = false;
        this.H = new eb();
        this.J = true;
        a aVar = new a();
        this.K = new b();
        LayoutInflater.from(context).inflate(R.layout.hiad_adscore_reward_pure_video_view, this);
        this.F = new hc(context, this);
        this.I = new n9("InterstitialVideoView");
        VideoView videoView = (VideoView) findViewById(R.id.hiad_id_video_view);
        this.B = videoView;
        videoView.J.add(this);
        this.B.setScreenOnWhilePlaying(true);
        this.B.setAudioFocusType(1);
        this.B.setAutoScaleResizeLayoutOnVideoSizeChange(false);
        this.B.setMuteOnlyOnLostAudioFocus(true);
        this.B.E.add(this);
        this.B.v(this);
        this.B.F.add(aVar);
        this.B.setCacheType("insre");
    }

    private int getMediaDuration() {
        if (this.E <= 0 && this.A.b() != null) {
            this.E = this.A.b().getVideoDuration();
        }
        return this.E;
    }

    @Override // ka.g9
    public final void a(int i10) {
        n7.c("InterstitialVideoView", "onDurationReady %s", Integer.valueOf(i10));
        if (i10 > 0) {
            this.E = i10;
        }
    }

    @Override // ka.f9
    public final void g(w7 w7Var, int i10, int i11, int i12) {
        r(i10, false);
    }

    @Override // ka.h9
    public final void h(w7 w7Var, int i10) {
        r(i10, false);
    }

    @Override // ka.h9
    public final void j(w7 w7Var, int i10) {
        float f;
        if (n7.d()) {
            n7.c("InterstitialVideoView", "onMediaStart: %s", Integer.valueOf(i10));
        }
        this.D = i10;
        this.C = System.currentTimeMillis();
        if (i10 > 0) {
            eb ebVar = this.H;
            if (!ebVar.f31128u && ebVar.f31129v) {
                n7.g("OmPresent", "resume: Video completed");
            } else {
                hb hbVar = ebVar.f31126s;
                if (hbVar instanceof ib) {
                    ((ib) hbVar).H();
                }
            }
            hc hcVar = this.F;
            androidx.activity.n.x0(hcVar.f31240w, (ContentRecord) hcVar.f32660t);
        } else {
            if (this.H != null && this.A.b() != null) {
                String soundSwitch = this.A.b().getSoundSwitch();
                eb ebVar2 = this.H;
                float mediaDuration = getMediaDuration();
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
                        ibVar.s(mediaDuration, f);
                    }
                }
            }
            if (!this.f23127z) {
                hc hcVar2 = this.F;
                androidx.activity.n.q0(hcVar2.f31240w, (ContentRecord) hcVar2.f32660t);
                hc hcVar3 = this.F;
                n9 n9Var = this.I;
                long j10 = n9Var.f31500d;
                long j11 = n9Var.f31499c;
                long j12 = this.C;
                hcVar3.getClass();
                long j13 = 0;
                if (j10 != 0 && j10 < j12) {
                    long j14 = j12 - j10;
                    if (j11 != 0 && j11 < j12) {
                        j13 = j12 - j11;
                    }
                    a0.a.P(hcVar3.f31240w, (ContentRecord) hcVar3.f32660t, j14, j13);
                }
            }
        }
        this.f23127z = true;
    }

    @Override // ka.h9
    public final void m(w7 w7Var, int i10) {
        r(i10, true);
    }

    @Override // ka.h9
    public final void o(w7 w7Var, int i10) {
        r(i10, false);
    }

    public final void r(int i10, boolean z10) {
        n7.c("InterstitialVideoView", "onVideoStop, videoComplete: %s", Boolean.valueOf(z10));
        this.I.c();
        if (this.f23127z) {
            this.f23127z = false;
            if (z10) {
                hc hcVar = this.F;
                androidx.activity.n.J(hcVar.f31240w, (ContentRecord) hcVar.f32660t, ah.Z, this.C, System.currentTimeMillis(), (int) this.D, i10);
                this.H.g();
            } else {
                hc hcVar2 = this.F;
                androidx.activity.n.J(hcVar2.f31240w, (ContentRecord) hcVar2.f32660t, ah.C, this.C, System.currentTimeMillis(), (int) this.D, i10);
                this.H.h();
            }
        }
    }

    public final void s(boolean z10) {
        if (n7.d()) {
            n7.c("InterstitialVideoView", "mIsVideoReady:%s, isPlaying:%s", Boolean.valueOf(this.f23126x), Boolean.valueOf(this.B.D()));
        }
        if (this.f23126x && !this.B.D()) {
            n7.f("InterstitialVideoView", "doRealPlay, auto: %s", Boolean.TRUE);
            this.I.a();
            this.B.x(true);
            return;
        }
        this.y = true;
    }

    public void setAutoScaleResizeLayoutOnVideoSizeChange(boolean z10) {
        VideoView videoView = this.B;
        if (videoView != null) {
            videoView.setAutoScaleResizeLayoutOnVideoSizeChange(z10);
        }
    }

    public void setUnUseDefault(boolean z10) {
        this.J = z10;
    }

    public void setVideoBackgroundColor(int i10) {
        VideoView videoView = this.B;
        if (videoView != null) {
            videoView.setBackgroundColor(i10);
        }
    }

    public void setVideoScaleMode(int i10) {
        VideoView videoView = this.B;
        if (videoView != null) {
            videoView.setVideoScaleMode(i10);
        }
    }

    @Override // ka.h9
    public final void a(int i10, int i11) {
        if (this.f23127z) {
            this.H.a(i10);
        }
    }

    /* loaded from: classes2.dex */
    public class a implements e9 {
        public a() {
        }

        @Override // ka.e9
        public final void a() {
            if (n7.d()) {
                n7.b("InterstitialVideoView", "onBufferingStart");
            }
            InterstitialVideoView interstitialVideoView = InterstitialVideoView.this;
            interstitialVideoView.I.b();
            eb ebVar = interstitialVideoView.H;
            if (ebVar.f31128u || !ebVar.f31129v) {
                hb hbVar = ebVar.f31126s;
                if (hbVar instanceof ib) {
                    ((ib) hbVar).C();
                }
            }
        }

        @Override // ka.e9
        public final void b() {
            eb ebVar = InterstitialVideoView.this.H;
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

    @Override // ka.g9
    public final void b(int i10) {
    }
}
