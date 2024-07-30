package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.huawei.hms.ads.Cif;
import com.huawei.hms.ads.bv;
import com.huawei.hms.ads.ep;
import com.huawei.hms.ads.eq;
import com.huawei.hms.ads.er;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.fg;
import com.huawei.hms.ads.fh;
import com.huawei.hms.ads.fi;
import com.huawei.hms.ads.fk;
import com.huawei.hms.ads.fl;
import com.huawei.hms.ads.fw;
import com.huawei.hms.ads.gk;
import com.huawei.hms.ads.gl;
import com.huawei.hms.ads.go;
import com.huawei.hms.ads.ha;
import com.huawei.hms.ads.jt;
import com.huawei.hms.ads.jy;
import com.huawei.hms.ads.km;
import com.huawei.hms.ads.nativead.MediaContent;
import com.huawei.hms.ads.nativead.R;
import com.huawei.openalliance.ad.views.a0;

/* loaded from: classes2.dex */
public class NativeVideoView extends NativeMediaView implements gk, jt, km {
    public static final /* synthetic */ int A0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public ha f23722g0;

    /* renamed from: h0, reason: collision with root package name */
    public g f23723h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f23724i0;

    /* renamed from: j0, reason: collision with root package name */
    public a0 f23725j0;

    /* renamed from: k0, reason: collision with root package name */
    public Cif f23726k0;

    /* renamed from: l0, reason: collision with root package name */
    public com.huawei.openalliance.ad.inter.data.p f23727l0;

    /* renamed from: m0, reason: collision with root package name */
    public com.huawei.openalliance.ad.inter.data.h f23728m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f23729n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f23730o0;

    /* renamed from: p0, reason: collision with root package name */
    public long f23731p0;

    /* renamed from: q0, reason: collision with root package name */
    public NativeVideoControlPanel f23732q0;

    /* renamed from: r0, reason: collision with root package name */
    public VideoView f23733r0;

    /* renamed from: s0, reason: collision with root package name */
    public jy f23734s0;

    /* renamed from: t0, reason: collision with root package name */
    public MediaContent f23735t0;

    /* renamed from: u0, reason: collision with root package name */
    public long f23736u0;

    /* renamed from: v0, reason: collision with root package name */
    public long f23737v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f23738w0;

    /* renamed from: x0, reason: collision with root package name */
    public fw f23739x0;
    public final c y0;

    /* renamed from: z0, reason: collision with root package name */
    public final e f23740z0;

    /* loaded from: classes2.dex */
    public class c implements fh {
        public c() {
        }

        @Override // com.huawei.hms.ads.fh
        public final void Code(ia.a aVar, int i10, int i11, int i12) {
            NativeVideoView nativeVideoView = NativeVideoView.this;
            NativeVideoView.a(nativeVideoView, i10, false);
            if (!nativeVideoView.f23709c0 && !a0.a.v(nativeVideoView.getContext())) {
                Toast makeText = Toast.makeText(nativeVideoView.getContext(), R.string.hiad_network_error, 0);
                makeText.setGravity(17, 0, 0);
                makeText.show();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements fl {
        public e() {
        }

        @Override // com.huawei.hms.ads.fl
        public final void Code() {
            int i10 = NativeVideoView.A0;
            ex.V("NativeVideoView", "onMute");
            NativeVideoView nativeVideoView = NativeVideoView.this;
            com.huawei.openalliance.ad.inter.data.p pVar = nativeVideoView.f23727l0;
            if (pVar != null) {
                pVar.f22309z = "n";
                if (!nativeVideoView.f23738w0 && nativeVideoView.f23724i0) {
                    nativeVideoView.f23726k0.Code(true);
                } else {
                    nativeVideoView.f23738w0 = false;
                }
                nativeVideoView.f23722g0.V(gl.Code);
            }
            nativeVideoView.f23725j0.a(true);
            g gVar = nativeVideoView.f23723h0;
            if (gVar != null) {
                gVar.Code(true);
            }
        }

        @Override // com.huawei.hms.ads.fl
        public final void V() {
            int i10 = NativeVideoView.A0;
            ex.V("NativeVideoView", "onUnmute");
            NativeVideoView nativeVideoView = NativeVideoView.this;
            com.huawei.openalliance.ad.inter.data.p pVar = nativeVideoView.f23727l0;
            if (pVar != null) {
                nativeVideoView.f23738w0 = false;
                pVar.f22309z = "y";
                nativeVideoView.f23726k0.Code(false);
                nativeVideoView.f23722g0.V(1.0f);
            }
            nativeVideoView.f23725j0.a(false);
            g gVar = nativeVideoView.f23723h0;
            if (gVar != null) {
                gVar.Code(false);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f implements a0.d {
        public f() {
        }
    }

    /* loaded from: classes2.dex */
    public interface g {
        void Code();

        void Code(boolean z10);

        void Code(boolean z10, int i10);

        void I();

        void V();

        void V(boolean z10, int i10);

        void Z();
    }

    public NativeVideoView(Context context) {
        super(context);
        this.f23722g0 = new go();
        this.f23724i0 = false;
        this.f23729n0 = false;
        this.f23730o0 = 0;
        a aVar = new a();
        b bVar = new b();
        c cVar = new c();
        this.y0 = cVar;
        d dVar = new d();
        e eVar = new e();
        this.f23740z0 = eVar;
        f fVar = new f();
        this.f23726k0 = new Cif(context, this);
        LayoutInflater.from(context).inflate(R.layout.hiad_native_video_view, this);
        this.f23733r0 = (VideoView) findViewById(R.id.hiad_id_video_view);
        this.f23732q0 = (NativeVideoControlPanel) findViewById(R.id.hiad_native_video_ctrl_panel);
        this.f23733r0.setStandalone(false);
        this.f23733r0.setScreenOnWhilePlaying(true);
        this.f23733r0.setAutoScaleResizeLayoutOnVideoSizeChange(false);
        a0 a0Var = new a0(this.f23733r0, this.f23732q0);
        this.f23725j0 = a0Var;
        a0Var.o = fVar;
        this.f23733r0.f23669j0.add(bVar);
        this.f23733r0.f23670k0.add(aVar);
        this.f23733r0.d(cVar);
        this.f23733r0.f23671l0.add(eVar);
        this.f23733r0.f23673n0.add(dVar);
        this.f23739x0 = new fw(getTAG());
    }

    public static void a(NativeVideoView nativeVideoView, int i10, boolean z10) {
        int i11;
        com.huawei.openalliance.ad.inter.data.p pVar = nativeVideoView.f23727l0;
        if (pVar != null) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = i10;
            }
            pVar.y = i11;
        }
        nativeVideoView.f23739x0.I();
        if (nativeVideoView.f23724i0) {
            nativeVideoView.f23724i0 = false;
            if (z10) {
                nativeVideoView.f23726k0.Code(nativeVideoView.f23736u0, System.currentTimeMillis(), nativeVideoView.f23737v0, i10);
                nativeVideoView.f23722g0.a();
            } else {
                nativeVideoView.f23726k0.V(nativeVideoView.f23736u0, System.currentTimeMillis(), nativeVideoView.f23737v0, i10);
                nativeVideoView.f23722g0.e();
            }
        }
    }

    private int getContinuePlayTime() {
        com.huawei.openalliance.ad.inter.data.p pVar = this.f23727l0;
        if (pVar != null) {
            int i10 = pVar.y;
            if (i10 < 5000) {
                return 0;
            }
            return i10;
        }
        ex.Code("NativeVideoView", "getContinuePlayTime other");
        return 0;
    }

    private String getTAG() {
        return "NativeVideoView_" + hashCode();
    }

    @Override // com.huawei.openalliance.ad.views.NativeMediaView
    public final void B() {
        ex.V("NativeVideoView", "onViewShownBetweenFullAndPartial");
        this.f23725j0.b(true);
        b();
    }

    @Override // com.huawei.openalliance.ad.views.NativeMediaView
    public final void Code() {
        this.f23733r0.setNeedPauseOnSurfaceDestory(true);
    }

    @Override // com.huawei.openalliance.ad.views.NativeMediaView
    public final void I() {
        ex.V("NativeVideoView", "onViewPartialHidden");
        VideoView videoView = this.f23733r0;
        c cVar = this.y0;
        if (cVar == null) {
            videoView.getClass();
        } else {
            videoView.f23672m0.remove(cVar);
        }
        VideoView videoView2 = this.f23733r0;
        e eVar = this.f23740z0;
        if (eVar == null) {
            videoView2.getClass();
        } else {
            videoView2.f23671l0.remove(eVar);
        }
        if (this.f23727l0 != null) {
            this.f23725j0.b(false);
            a0 a0Var = this.f23725j0;
            a0Var.f24117j = false;
            gb.w.d(a0Var.f24116i);
            a0 a0Var2 = this.f23725j0;
            VideoView videoView3 = a0Var2.f24109a;
            if (videoView3 != null) {
                videoView3.D();
            }
            View view = a0Var2.f24114g;
            if (view != null) {
                view.setVisibility(8);
            }
            a0Var2.i(false);
            a0Var2.e(true, false);
            a0Var2.j();
        }
    }

    @Override // com.huawei.hms.ads.jt
    public final void S() {
        a0 a0Var = this.f23725j0;
        VideoView videoView = a0Var.f24109a;
        if (videoView != null) {
            videoView.D();
        }
        View view = a0Var.f24114g;
        if (view != null) {
            view.setVisibility(8);
        }
        a0Var.i(false);
        a0Var.e(true, false);
        a0Var.j();
    }

    @Override // com.huawei.openalliance.ad.views.NativeMediaView
    public final void V() {
        this.f23731p0 = System.currentTimeMillis();
        this.f23725j0.b(true);
        com.huawei.openalliance.ad.inter.data.p pVar = this.f23727l0;
        ep Code = eq.Code();
        if (Code != null && pVar != null) {
            int Code2 = Code.Code();
            pVar.y = Code2;
            ex.V("NativeVideoView", "obtain progress from linked view " + Code2);
            eq.Code(null);
            er.Code(getContext()).V();
        }
        b();
        ex.V("NativeVideoView", "onViewFullShown hashCheckSuccess: %s", Boolean.valueOf(this.f23729n0));
        if (this.f23729n0) {
            boolean o = o();
            ex.V("NativeVideoView", "onViewFullShown autoplay: %s", Boolean.valueOf(o));
            a0 a0Var = this.f23725j0;
            a0Var.f24117j = o;
            a0Var.f(getContinuePlayTime());
            if (p()) {
                this.f23725j0.d(this.f23727l0.f22308x);
            }
        }
    }

    public final void b(boolean z10) {
        ex.V("NativeVideoView", "customToggleVideoMute, customMuteState is " + z10);
        com.huawei.openalliance.ad.inter.data.p pVar = this.f23727l0;
        if (pVar != null) {
            pVar.f22309z = z10 ? "n" : "y";
        }
    }

    public final boolean d() {
        com.huawei.openalliance.ad.inter.data.p pVar = this.f23727l0;
        if (pVar != null && TextUtils.equals(pVar.f22309z, "y")) {
            return true;
        }
        return false;
    }

    @Override // com.huawei.hms.ads.km
    public final void destroyView() {
        this.f23733r0.destroyView();
        this.f23735t0 = null;
        this.f23722g0.I();
    }

    public float getAspectRatio() {
        Float f10;
        com.huawei.openalliance.ad.inter.data.p pVar = this.f23727l0;
        if (pVar == null || (f10 = pVar.D) == null) {
            return gl.Code;
        }
        return f10.floatValue();
    }

    @Override // com.huawei.openalliance.ad.views.NativeMediaView
    public int getAutoPlayAreaPercentageThresshold() {
        com.huawei.openalliance.ad.inter.data.p pVar = this.f23727l0;
        if (pVar != null) {
            return pVar.B;
        }
        return super.getAutoPlayAreaPercentageThresshold();
    }

    @Override // com.huawei.openalliance.ad.views.NativeMediaView
    public int getHiddenAreaPercentageThreshhold() {
        com.huawei.openalliance.ad.inter.data.p pVar = this.f23727l0;
        if (pVar != null) {
            return Math.max(100 - pVar.C, 0);
        }
        return super.getHiddenAreaPercentageThreshhold();
    }

    public MediaContent getMediaContent() {
        return this.f23735t0;
    }

    public ImageView getPreviewImageView() {
        return this.f23732q0.f23717e0;
    }

    public VideoView getVideoView() {
        return this.f23733r0;
    }

    public final boolean o() {
        com.huawei.openalliance.ad.inter.data.p pVar = this.f23727l0;
        if (pVar == null) {
            return false;
        }
        if (pVar.y >= pVar.f22304t) {
            pVar.y = 0;
            ex.V("NativeVideoView", "play progress bigger than video duration, skip autoPlay.");
            return false;
        }
        return TextUtils.equals(pVar.f22306v, "y");
    }

    @Override // com.huawei.openalliance.ad.views.NativeMediaView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.huawei.openalliance.ad.views.NativeMediaView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23722g0.I();
    }

    public final boolean p() {
        if (this.f23727l0 == null || !a0.a.v(getContext()) || !o()) {
            return false;
        }
        int i10 = this.f23727l0.f22307w;
        if (i10 == 1) {
            return true;
        }
        if (i10 != 0 || !a0.a.s(getContext())) {
            return false;
        }
        return true;
    }

    @Override // com.huawei.hms.ads.km
    public final void pauseView() {
        a0 a0Var = this.f23725j0;
        a0Var.f24120m = true;
        VideoView videoView = a0Var.f24109a;
        if (videoView != null) {
            videoView.pauseView();
        }
    }

    @Override // com.huawei.hms.ads.km
    public final void resumeView() {
        a0 a0Var = this.f23725j0;
        a0Var.f24120m = false;
        VideoView videoView = a0Var.f24109a;
        if (videoView != null) {
            videoView.resumeView();
        }
        ex.V("NativeVideoView", "resumeView");
        b();
        this.y = false;
        this.f23712f0.onGlobalLayout();
        this.f23733r0.setNeedPauseOnSurfaceDestory(true);
    }

    public void setAudioFocusType(int i10) {
        this.f23733r0.setAudioFocusType(i10);
    }

    public void setCoverClickListener(View.OnClickListener onClickListener) {
        this.f23725j0.f24121n = onClickListener;
    }

    public void setMediaContent(MediaContent mediaContent) {
        this.f23735t0 = mediaContent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        if ((r1 instanceof com.huawei.hms.ads.bv) == false) goto L53;
     */
    @Override // com.huawei.openalliance.ad.views.NativeMediaView, com.huawei.hms.ads.jt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setNativeAd(com.huawei.openalliance.ad.inter.data.e r8) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.views.NativeVideoView.setNativeAd(com.huawei.openalliance.ad.inter.data.e):void");
    }

    public void setNotShowDataUsageAlert(boolean z10) {
        this.f23725j0.f24123q = z10;
    }

    @Override // com.huawei.hms.ads.jt
    public void setPpsNativeView(jy jyVar) {
        this.f23734s0 = jyVar;
    }

    public void setVideoEventListener(g gVar) {
        this.f23723h0 = gVar;
    }

    @Override // com.huawei.hms.ads.jt
    public final void Code(long j10) {
        this.f23726k0.Code(j10);
    }

    public final void b() {
        ex.V("NativeVideoView", "setInnerListener");
        this.f23733r0.d(this.y0);
        VideoView videoView = this.f23733r0;
        e eVar = this.f23740z0;
        if (eVar == null) {
            videoView.getClass();
        } else {
            videoView.f23671l0.add(eVar);
        }
        this.f23725j0.h(!d());
    }

    @Override // com.huawei.hms.ads.jt
    public final void Code(com.huawei.openalliance.ad.inter.data.h hVar, Drawable drawable) {
        com.huawei.openalliance.ad.inter.data.h hVar2 = this.f23728m0;
        if (hVar2 == null || hVar == null || !TextUtils.equals(hVar2.f22260s, hVar.f22260s)) {
            return;
        }
        com.huawei.hms.ads.u uVar = new com.huawei.hms.ads.u(this.f23728m0, false);
        uVar.Code(drawable);
        this.f23735t0 = new bv(uVar);
        ImageView imageView = this.f23725j0.f24113e;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    /* loaded from: classes2.dex */
    public class a implements fg {
        public a() {
        }

        @Override // com.huawei.hms.ads.fg
        public final void Code() {
            if (ex.Code()) {
                int i10 = NativeVideoView.A0;
                ex.Code("NativeVideoView", "onBufferingStart");
            }
            NativeVideoView nativeVideoView = NativeVideoView.this;
            nativeVideoView.f23739x0.V();
            nativeVideoView.f23722g0.b();
        }

        @Override // com.huawei.hms.ads.fg
        public final void V() {
            NativeVideoView.this.f23722g0.c();
        }

        @Override // com.huawei.hms.ads.fg
        public final void Code(int i10) {
        }
    }

    /* loaded from: classes2.dex */
    public class b implements fk {
        public b() {
        }

        @Override // com.huawei.hms.ads.fk
        public final void Code(int i10, int i11) {
            NativeVideoView nativeVideoView = NativeVideoView.this;
            if (nativeVideoView.f23724i0) {
                nativeVideoView.f23722g0.Code(i10);
                Cif cif = nativeVideoView.f23726k0;
                if (cif != null) {
                    cif.Code(nativeVideoView.getContext(), i11, nativeVideoView.f23727l0 == null ? 0L : r9.f22304t);
                }
            }
        }

        @Override // com.huawei.hms.ads.fk
        public final void I(ia.a aVar, int i10) {
            NativeVideoView nativeVideoView = NativeVideoView.this;
            NativeVideoView.a(nativeVideoView, i10, false);
            g gVar = nativeVideoView.f23723h0;
            if (gVar != null) {
                gVar.Z();
            }
        }

        @Override // com.huawei.hms.ads.fk
        public final void V(ia.a aVar, int i10) {
            NativeVideoView nativeVideoView = NativeVideoView.this;
            NativeVideoView.a(nativeVideoView, i10, false);
            g gVar = nativeVideoView.f23723h0;
            if (gVar != null) {
                gVar.V();
            }
        }

        @Override // com.huawei.hms.ads.fk
        public final void Z(ia.a aVar, int i10) {
            NativeVideoView nativeVideoView = NativeVideoView.this;
            NativeVideoView.a(nativeVideoView, i10, true);
            g gVar = nativeVideoView.f23723h0;
            if (gVar != null) {
                gVar.I();
            }
            Cif cif = nativeVideoView.f23726k0;
            if (cif != null) {
                long j10 = i10;
                cif.Code(nativeVideoView.getContext(), j10, j10);
            }
        }

        @Override // com.huawei.hms.ads.fk
        public final void Code(ia.a aVar, int i10) {
            com.huawei.openalliance.ad.inter.data.p pVar;
            if (ex.Code()) {
                int i11 = NativeVideoView.A0;
                ex.Code("NativeVideoView", "onMediaStart: %s", Integer.valueOf(i10));
            }
            NativeVideoView nativeVideoView = NativeVideoView.this;
            if (nativeVideoView.f23724i0) {
                return;
            }
            nativeVideoView.f23724i0 = true;
            nativeVideoView.f23737v0 = i10;
            nativeVideoView.f23736u0 = System.currentTimeMillis();
            g gVar = nativeVideoView.f23723h0;
            if (gVar != null) {
                gVar.Code();
            }
            if (i10 > 0) {
                nativeVideoView.f23722g0.f();
                nativeVideoView.f23726k0.V();
                return;
            }
            ha haVar = nativeVideoView.f23722g0;
            if (haVar != null && (pVar = nativeVideoView.f23727l0) != null) {
                haVar.Code(pVar.f22304t, true ^ "y".equals(pVar.f22309z));
            }
            nativeVideoView.f23726k0.Code();
            nativeVideoView.f23726k0.Code(nativeVideoView.f23739x0.B(), nativeVideoView.f23739x0.Z(), nativeVideoView.f23736u0);
        }
    }

    @Override // com.huawei.hms.ads.jt
    public final void Code(com.huawei.openalliance.ad.inter.data.p pVar, boolean z10) {
        com.huawei.openalliance.ad.inter.data.p pVar2;
        VideoView videoView;
        ex.V("NativeVideoView", "onCheckVideoResult: %s", Boolean.valueOf(z10));
        if (!z10 || (pVar2 = this.f23727l0) == null || pVar == null || !TextUtils.equals(pVar2.f22303s, pVar.f22303s)) {
            return;
        }
        this.f23729n0 = true;
        a0 a0Var = this.f23725j0;
        String str = pVar.f22303s;
        if (a0Var.f24110b != null && (videoView = a0Var.f24109a) != null) {
            videoView.setVideoFileUrl(str);
        }
        if (this.y) {
            this.f23725j0.f(getContinuePlayTime());
            boolean o = o();
            ex.V("NativeVideoView", "onCheckVideoResult - full shown, autoPlay: %s", Boolean.valueOf(o));
            this.f23725j0.f24117j = o;
            if (p()) {
                long currentTimeMillis = pVar.f22308x - (System.currentTimeMillis() - this.f23731p0);
                if (currentTimeMillis < 0) {
                    currentTimeMillis = 0;
                }
                this.f23725j0.d(currentTimeMillis);
            }
        }
    }

    @Override // com.huawei.hms.ads.jt
    public final void Code(String str) {
        this.f23726k0.Code(str);
    }

    @Override // com.huawei.hms.ads.gk
    public View getOpenMeasureView() {
        return this;
    }

    /* loaded from: classes2.dex */
    public class d implements fi {
        public d() {
        }

        @Override // com.huawei.hms.ads.fi
        public final void Code(int i10) {
            VideoView videoView = NativeVideoView.this.f23725j0.f24109a;
            if (videoView != null) {
                videoView.setDefaultDuration(i10);
            }
        }

        @Override // com.huawei.hms.ads.fi
        public final void V(int i10) {
        }
    }
}
