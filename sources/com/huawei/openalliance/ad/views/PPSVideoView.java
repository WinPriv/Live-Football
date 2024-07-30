package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.hms.ads.base.R;
import com.huawei.hms.ads.cl;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.fg;
import com.huawei.hms.ads.fh;
import com.huawei.hms.ads.fk;
import com.huawei.hms.ads.fl;
import com.huawei.hms.ads.fm;
import com.huawei.hms.ads.gl;
import com.huawei.hms.ads.ha;
import com.huawei.hms.ads.ij;
import com.huawei.hms.ads.iv;
import com.huawei.hms.ads.iw;
import com.huawei.hms.ads.kb;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;

/* loaded from: classes2.dex */
public class PPSVideoView extends PPSBaseView<iv> implements kb {

    /* renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ int f23998o0 = 0;
    public VideoView J;
    public ImageView K;
    public boolean L;
    public boolean M;
    public VideoInfo N;
    public int O;
    public int P;
    public long Q;
    public long R;
    public boolean S;
    public boolean T;
    public int U;
    public final int V;
    public final int W;

    /* renamed from: c0, reason: collision with root package name */
    public final int f23999c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f24000d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f24001e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f24002f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f24003g0;

    /* renamed from: h0, reason: collision with root package name */
    public float f24004h0;

    /* renamed from: i0, reason: collision with root package name */
    public final a f24005i0;

    /* renamed from: j0, reason: collision with root package name */
    public final b f24006j0;

    /* renamed from: k0, reason: collision with root package name */
    public final c f24007k0;

    /* renamed from: l0, reason: collision with root package name */
    public final d f24008l0;

    /* renamed from: m0, reason: collision with root package name */
    public final e f24009m0;

    /* renamed from: n0, reason: collision with root package name */
    public final f f24010n0;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z10 = !view.isSelected();
            int i10 = PPSVideoView.f23998o0;
            PPSVideoView pPSVideoView = PPSVideoView.this;
            pPSVideoView.getClass();
            ex.V("PPSVideoView", "switchSound enableSound: " + z10);
            VideoView videoView = pPSVideoView.J;
            if (videoView != null) {
                if (z10) {
                    videoView.c();
                } else {
                    videoView.b();
                }
                ((iv) pPSVideoView.f23814s).Code(!z10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements fm {
        public b() {
        }

        @Override // com.huawei.hms.ads.fm
        public final void Code() {
            PPSVideoView pPSVideoView = PPSVideoView.this;
            ex.Code("PPSVideoView", "onVideoRenderStart, alreadyNotified: %s", Boolean.valueOf(pPSVideoView.f24000d0));
            if (!pPSVideoView.f24000d0) {
                pPSVideoView.f24000d0 = true;
                VideoView videoView = pPSVideoView.J;
                if (videoView != null) {
                    videoView.setAlpha(1.0f);
                }
                pPSVideoView.Z();
                if (pPSVideoView.f24001e0) {
                    pPSVideoView.M = false;
                }
                PPSVideoView.a(pPSVideoView);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements fh {
        public d() {
        }

        @Override // com.huawei.hms.ads.fh
        public final void Code(ia.a aVar, int i10, int i11, int i12) {
            PPSVideoView pPSVideoView = PPSVideoView.this;
            pPSVideoView.f23818w.I(-302);
            pPSVideoView.f23818w.m();
        }
    }

    /* loaded from: classes2.dex */
    public class e implements fg {
        public e() {
        }

        @Override // com.huawei.hms.ads.fg
        public final void Code() {
            PPSVideoView.this.f23815t.b();
        }

        @Override // com.huawei.hms.ads.fg
        public final void V() {
            PPSVideoView.this.f23815t.c();
        }

        @Override // com.huawei.hms.ads.fg
        public final void Code(int i10) {
        }
    }

    /* loaded from: classes2.dex */
    public class f implements fl {
        public f() {
        }

        @Override // com.huawei.hms.ads.fl
        public final void Code() {
            PPSVideoView pPSVideoView = PPSVideoView.this;
            pPSVideoView.setMuteButtonState(true);
            pPSVideoView.f23815t.V(gl.Code);
        }

        @Override // com.huawei.hms.ads.fl
        public final void V() {
            PPSVideoView pPSVideoView = PPSVideoView.this;
            pPSVideoView.setMuteButtonState(false);
            pPSVideoView.f23815t.V(1.0f);
        }
    }

    public PPSVideoView(Context context, int i10, int i11, int i12) {
        super(context);
        this.L = true;
        this.M = true;
        this.O = 0;
        this.P = Integer.MAX_VALUE;
        this.S = false;
        this.T = false;
        this.U = 1;
        this.f24000d0 = false;
        this.f24001e0 = false;
        this.f24002f0 = true;
        this.f24003g0 = false;
        this.f24004h0 = gl.Code;
        this.f24005i0 = new a();
        this.f24006j0 = new b();
        this.f24007k0 = new c();
        this.f24008l0 = new d();
        this.f24009m0 = new e();
        this.f24010n0 = new f();
        this.W = i11;
        this.V = i10;
        this.f23999c0 = i12;
        cl.Code(context).B();
        this.f23814s = new ij(context, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ba, code lost:
    
        if (gb.h0.d() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e2, code lost:
    
        if (r6.f23816u.b() != 1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.huawei.openalliance.ad.views.PPSVideoView r6) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.views.PPSVideoView.a(com.huawei.openalliance.ad.views.PPSVideoView):void");
    }

    @Override // com.huawei.openalliance.ad.views.PPSBaseView, com.huawei.hms.ads.kc
    public final boolean C() {
        if (this.O > 0) {
            return true;
        }
        return false;
    }

    @Override // com.huawei.openalliance.ad.views.PPSBaseView, com.huawei.hms.ads.kc
    public final void Code(int i10, int i11) {
        super.Code(i10, i11);
        VideoView videoView = this.J;
        if (videoView != null) {
            videoView.D();
        }
    }

    @Override // com.huawei.openalliance.ad.views.PPSBaseView, com.huawei.hms.ads.kc
    public final void D() {
        super.D();
        VideoView videoView = this.J;
        if (videoView != null) {
            videoView.D();
        }
    }

    @Override // com.huawei.openalliance.ad.views.PPSBaseView, com.huawei.hms.ads.kc
    public final void F() {
        super.F();
        VideoView videoView = this.J;
        if (videoView != null) {
            videoView.D();
        }
    }

    @Override // com.huawei.openalliance.ad.views.PPSBaseView
    public final void S() {
        pauseView();
    }

    @Override // com.huawei.openalliance.ad.views.PPSBaseView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VideoView videoView = this.J;
        if (videoView != null) {
            removeView(videoView);
            this.J.destroyView();
            this.J = null;
        }
        this.P = Integer.MAX_VALUE;
    }

    @Override // com.huawei.openalliance.ad.views.PPSBaseView, com.huawei.hms.ads.km
    public final void pauseView() {
        VideoView videoView = this.J;
        if (videoView != null) {
            videoView.pauseView();
            this.J.L();
        }
    }

    @Override // com.huawei.openalliance.ad.views.PPSBaseView, com.huawei.hms.ads.kc
    public void setAudioFocusType(int i10) {
        this.U = i10;
        VideoView videoView = this.J;
        if (videoView != null) {
            videoView.setAudioFocusType(i10);
        }
    }

    public void setHideSoundIcon(boolean z10) {
        this.f24001e0 = z10;
    }

    public void setIgnoreSoundCtrl(boolean z10) {
        this.f24002f0 = z10;
    }

    public void setMuteButtonState(boolean z10) {
        int i10;
        this.L = z10;
        ImageView imageView = this.K;
        if (imageView != null) {
            int i11 = gb.u.f28631a;
            if (z10) {
                i10 = R.drawable.hiad_video_mute;
            } else {
                i10 = R.drawable.hiad_video_unmute;
            }
            imageView.setImageResource(i10);
            this.K.setSelected(!z10);
            gb.u.g(this.K);
        }
    }

    public void setStartVol(float f10) {
        this.f24004h0 = f10;
    }

    @Override // com.huawei.hms.ads.kb
    public final void Code(String str) {
        VideoInfo Y0 = this.f23816u.Y0();
        this.N = Y0;
        if (Y0 != null) {
            if (TextUtils.equals("n", Y0.F()) || this.f24001e0) {
                this.M = false;
            }
            this.O = this.N.u();
            this.f24003g0 = TextUtils.equals("y", this.N.p());
        }
        MetaData K = this.f23816u.K();
        if (K != null && K.U() > 0) {
            this.O = (int) K.U();
        }
        if (this.J == null) {
            VideoView videoView = new VideoView(getContext());
            this.J = videoView;
            videoView.setScreenOnWhilePlaying(true);
            this.J.setStandalone(true);
            this.J.setAutoScaleResizeLayoutOnVideoSizeChange(false);
            this.J.setVideoScaleMode(2);
            this.J.setMuteOnlyOnLostAudioFocus(true);
            VideoView videoView2 = this.J;
            b bVar = this.f24006j0;
            if (bVar == null) {
                videoView2.getClass();
            } else {
                videoView2.f23676q0.add(bVar);
            }
            VideoView videoView3 = this.J;
            c cVar = this.f24007k0;
            if (cVar == null) {
                videoView3.getClass();
            } else {
                videoView3.f23669j0.add(cVar);
            }
            this.J.d(this.f24008l0);
            VideoView videoView4 = this.J;
            f fVar = this.f24010n0;
            if (fVar == null) {
                videoView4.getClass();
            } else {
                videoView4.f23671l0.add(fVar);
            }
            VideoView videoView5 = this.J;
            e eVar = this.f24009m0;
            if (eVar == null) {
                videoView5.getClass();
            } else {
                videoView5.f23670k0.add(eVar);
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            addView(this.J, layoutParams);
        }
        this.J.setAudioFocusType(this.U);
        this.J.setAlpha(gl.Code);
        this.J.setVideoFileUrl(str);
        if (this.f24002f0 || !this.f24003g0) {
            this.J.b();
        } else {
            this.J.c();
        }
        this.J.h(true);
    }

    /* loaded from: classes2.dex */
    public class c implements fk {

        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ int f24014s;

            public a(int i10) {
                this.f24014s = i10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                c.this.a(this.f24014s, false);
            }
        }

        public c() {
        }

        @Override // com.huawei.hms.ads.fk
        public final void Code(int i10, int i11) {
            int i12;
            PPSVideoView pPSVideoView = PPSVideoView.this;
            ex.Code("PPSVideoView", "onProgress, playTime: %d, alreadyNotified: %s", Integer.valueOf(i11), Boolean.valueOf(pPSVideoView.f24000d0));
            if (i11 > 0 && !pPSVideoView.f24000d0) {
                pPSVideoView.f24000d0 = true;
                VideoView videoView = pPSVideoView.J;
                if (videoView != null) {
                    videoView.setAlpha(1.0f);
                }
                pPSVideoView.Z();
                PPSVideoView.a(pPSVideoView);
            }
            VideoView videoView2 = pPSVideoView.J;
            if (videoView2 != null && videoView2.getCurrentState().a() && (i12 = pPSVideoView.O) > 0) {
                int i13 = i12 - i11;
                if (i13 < 0) {
                    i13 = 0;
                }
                int max = Math.max(1, (int) Math.ceil((i13 * 1.0f) / 1000.0f));
                ex.Code("PPSVideoView", "left seconds: %d", Integer.valueOf(max));
                if (max < pPSVideoView.P) {
                    pPSVideoView.P = max;
                    pPSVideoView.I(max);
                }
            }
            if (pPSVideoView.S) {
                pPSVideoView.f23815t.Code(i10);
                iw iwVar = pPSVideoView.f23814s;
                if (iwVar != null) {
                    ((iv) iwVar).Code(pPSVideoView.getContext(), i11, pPSVideoView.O);
                }
            }
        }

        @Override // com.huawei.hms.ads.fk
        public final void I(ia.a aVar, int i10) {
            a(i10, false);
        }

        @Override // com.huawei.hms.ads.fk
        public final void V(ia.a aVar, int i10) {
            gb.w.a(1000L, new a(i10));
        }

        @Override // com.huawei.hms.ads.fk
        public final void Z(ia.a aVar, int i10) {
            a(i10, true);
            PPSVideoView pPSVideoView = PPSVideoView.this;
            iw iwVar = pPSVideoView.f23814s;
            if (iwVar != null) {
                long j10 = i10;
                ((iv) iwVar).Code(pPSVideoView.getContext(), j10, j10);
            }
        }

        public final void a(int i10, boolean z10) {
            PPSVideoView pPSVideoView = PPSVideoView.this;
            if (pPSVideoView.S) {
                pPSVideoView.S = false;
                if (pPSVideoView.T) {
                    ex.V("PPSVideoView", "has reported play end event");
                } else {
                    pPSVideoView.T = true;
                    ((iv) pPSVideoView.f23814s).Code(pPSVideoView.Q, System.currentTimeMillis(), pPSVideoView.R, i10);
                }
                ((iv) pPSVideoView.f23814s).V();
                ha haVar = pPSVideoView.f23815t;
                if (z10) {
                    haVar.a();
                } else {
                    haVar.e();
                }
            }
        }

        @Override // com.huawei.hms.ads.fk
        public final void Code(ia.a aVar, int i10) {
            PPSVideoView pPSVideoView = PPSVideoView.this;
            if (pPSVideoView.S) {
                return;
            }
            if (!pPSVideoView.f24002f0 && pPSVideoView.f24003g0) {
                float f = pPSVideoView.f24004h0;
                if (f > gl.Code) {
                    pPSVideoView.J.setSoundVolume(f);
                }
            }
            pPSVideoView.S = true;
            pPSVideoView.R = i10;
            pPSVideoView.Q = System.currentTimeMillis();
            if (i10 > 0) {
                pPSVideoView.f23815t.f();
            } else {
                if (pPSVideoView.N != null) {
                    pPSVideoView.f23815t.Code(r4.u(), pPSVideoView.L);
                }
            }
            ((iv) pPSVideoView.f23814s).Code(pPSVideoView.Q);
            pPSVideoView.f23818w.Code(pPSVideoView.Q);
            ((iv) pPSVideoView.f23814s).S();
        }
    }
}
