package com.huawei.openalliance.ad.views;

import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.fg;
import com.huawei.hms.ads.fh;
import com.huawei.hms.ads.fk;
import com.huawei.hms.ads.gl;
import com.huawei.hms.ads.nativead.R;
import com.huawei.openalliance.ad.views.BaseVideoView;
import com.huawei.openalliance.ad.views.NativeVideoView;

/* loaded from: classes2.dex */
public final class a0 implements fg, fh, fk, BaseVideoView.o, v {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f24108v = 0;

    /* renamed from: a, reason: collision with root package name */
    public VideoView f24109a;

    /* renamed from: b, reason: collision with root package name */
    public NativeVideoControlPanel f24110b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f24111c;

    /* renamed from: d, reason: collision with root package name */
    public View f24112d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f24113e;
    public View f;

    /* renamed from: g, reason: collision with root package name */
    public View f24114g;

    /* renamed from: j, reason: collision with root package name */
    public boolean f24117j;

    /* renamed from: l, reason: collision with root package name */
    public int f24119l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f24120m;

    /* renamed from: n, reason: collision with root package name */
    public View.OnClickListener f24121n;
    public d o;

    /* renamed from: p, reason: collision with root package name */
    public int f24122p;

    /* renamed from: r, reason: collision with root package name */
    public com.huawei.openalliance.ad.inter.data.p f24124r;

    /* renamed from: u, reason: collision with root package name */
    public final c f24127u;

    /* renamed from: h, reason: collision with root package name */
    public final String f24115h = "hPlT" + hashCode();

    /* renamed from: i, reason: collision with root package name */
    public final String f24116i = "aPT" + hashCode();

    /* renamed from: k, reason: collision with root package name */
    public boolean f24118k = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f24123q = false;

    /* renamed from: s, reason: collision with root package name */
    public int f24125s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final a f24126t = new a();

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a0 a0Var = a0.this;
            if (a0Var.f24109a != null && a0Var.f24117j) {
                a0Var.g(true);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z10 = !view.isSelected();
            a0 a0Var = a0.this;
            a0Var.getClass();
            ex.V("a0", "switchSound: " + z10);
            VideoView videoView = a0Var.f24109a;
            if (videoView != null) {
                if (z10) {
                    videoView.c();
                } else {
                    videoView.b();
                }
                String str = a0Var.f24115h;
                gb.w.d(str);
                if (a0Var.f24109a.o()) {
                    gb.w.d(str);
                    gb.w.c(a0Var.f24127u, str, com.anythink.expressad.video.module.a.a.m.ag);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a0.this.e(false, true);
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
    }

    public a0(VideoView videoView, NativeVideoControlPanel nativeVideoControlPanel) {
        NativeVideoControlPanel nativeVideoControlPanel2;
        b bVar = new b();
        this.f24127u = new c();
        this.f24109a = videoView;
        this.f24110b = nativeVideoControlPanel;
        if (nativeVideoControlPanel != null) {
            this.f24112d = nativeVideoControlPanel.f23716d0;
            this.f = nativeVideoControlPanel.f23718f0;
            View view = nativeVideoControlPanel.f23719g0;
            this.f24114g = view;
            if (view != null) {
                view.setClickable(true);
            }
            ImageView imageView = this.f24110b.f23717e0;
            this.f24113e = imageView;
            if (imageView != null) {
                imageView.setOnClickListener(new b0(this));
            }
            ImageView imageView2 = this.f24110b.f23715c0;
            if (imageView2 != null) {
                imageView2.setOnClickListener(bVar);
            }
            VideoView videoView2 = this.f24109a;
            if (videoView2 != null) {
                videoView2.f23669j0.add(this);
                this.f24109a.f23670k0.add(this);
                this.f24109a.d(this);
                this.f24109a.f23668i0.add(this);
                this.f24109a.setSurfaceListener(this);
                this.f24109a.setOnClickListener(new d0(this));
            }
            ImageView imageView3 = this.f24110b.y;
            this.f24111c = imageView3;
            if (imageView3 != null) {
                imageView3.setOnClickListener(new f0(this));
                int i10 = R.drawable.hiad_play;
                if (i10 > 0) {
                    this.f24111c.setImageResource(i10);
                    gb.u.g(this.f24111c);
                }
            }
            View view2 = this.f24110b.f23720h0;
            if (view2 != null) {
                view2.setOnClickListener(new c0(this));
            }
            if (this.f24125s == 10 && (nativeVideoControlPanel2 = this.f24110b) != null) {
                nativeVideoControlPanel2.setOnClickListener(new e0(this));
            }
            View view3 = this.f24114g;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            i(false);
            e(true, false);
        }
    }

    @Override // com.huawei.hms.ads.fg
    public final void Code() {
        View view = this.f24112d;
        if (view == null || view.getVisibility() == 0) {
            return;
        }
        this.f24112d.setVisibility(0);
        ImageView imageView = this.f24111c;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    @Override // com.huawei.hms.ads.fk
    public final void I(ia.a aVar, int i10) {
        c(i10, false, false);
    }

    @Override // com.huawei.hms.ads.fg
    public final void V() {
        View view = this.f24112d;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        this.f24112d.setVisibility(8);
    }

    @Override // com.huawei.openalliance.ad.views.v
    public final void Z() {
        VideoView videoView = this.f24109a;
        if (videoView != null) {
            if (videoView.getCurrentState().b(ia.d.PREPARING) || this.f24109a.o()) {
                this.f24109a.L();
            }
        }
    }

    public final void a(boolean z10) {
        ex.V("a0", "setMuteBtn: " + z10);
        ImageView imageView = this.f24110b.f23715c0;
        if (imageView != null) {
            imageView.setSelected(!z10);
        }
    }

    public final void b(boolean z10) {
        if (ex.Code()) {
            ex.Code("a0", "setPlayBtn: %s", Boolean.valueOf(z10));
        }
        ImageView imageView = this.f24111c;
        if (imageView != null) {
            imageView.setEnabled(z10);
        }
    }

    public final void c(int i10, boolean z10, boolean z11) {
        NativeVideoControlPanel nativeVideoControlPanel;
        int i11;
        gb.w.d(this.f24116i);
        if (z11) {
            i10 = 0;
        }
        this.f24119l = i10;
        gb.w.d(this.f24115h);
        ImageView imageView = this.f24111c;
        if (imageView != null && (nativeVideoControlPanel = this.f24110b) != null && (i11 = R.drawable.hiad_play) != 0) {
            nativeVideoControlPanel.getClass();
            imageView.setImageResource(i11);
            gb.u.g(this.f24111c);
        }
        if (!z10) {
            j();
            i(false);
        }
        View view = this.f24114g;
        if (view == null || view.getVisibility() != 0) {
            e(true, true);
        }
        ImageView imageView2 = this.f24111c;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
    }

    public final void d(long j10) {
        VideoView videoView;
        ex.V("a0", "autoPlay - delayMs: %d", Long.valueOf(j10));
        String str = this.f24116i;
        gb.w.d(str);
        if (this.f24117j && (videoView = this.f24109a) != null) {
            if (videoView.o()) {
                ex.Code("a0", "autoPlay - video is playing");
                g(true);
            } else {
                ex.Code("a0", "autoPlay - start delay runnable");
                this.f24109a.f23665f0.I();
                gb.w.c(this.f24126t, str, j10);
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        boolean q10;
        VideoView videoView;
        int i10;
        VideoView videoView2;
        int i11;
        int i12;
        View view = this.f;
        if (z11) {
            if (z10) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            q10 = androidx.activity.n.p(view, i12, 0);
        } else {
            q10 = androidx.activity.n.q(view, z10);
        }
        if (q10) {
            if (z10) {
                d dVar = this.o;
                if (dVar != null && (videoView2 = this.f24109a) != null) {
                    ia.b currentState = videoView2.getCurrentState();
                    synchronized (currentState.f29442b) {
                        i11 = currentState.f29441a.f29461s;
                    }
                    NativeVideoView.g gVar = NativeVideoView.this.f23723h0;
                    if (gVar != null) {
                        gVar.Code(z11, i11);
                        return;
                    }
                    return;
                }
                return;
            }
            d dVar2 = this.o;
            if (dVar2 != null && (videoView = this.f24109a) != null) {
                ia.b currentState2 = videoView.getCurrentState();
                synchronized (currentState2.f29442b) {
                    i10 = currentState2.f29441a.f29461s;
                }
                NativeVideoView.g gVar2 = NativeVideoView.this.f23723h0;
                if (gVar2 != null) {
                    gVar2.V(z11, i10);
                }
            }
        }
    }

    public final void f(int i10) {
        ex.Code("a0", "setPreferStartPlayTime " + i10);
        this.f24119l = i10;
        VideoView videoView = this.f24109a;
        if (videoView != null) {
            videoView.setPreferStartPlayTime(i10);
        }
    }

    public final void g(boolean z10) {
        if (this.f24109a != null) {
            d dVar = this.o;
            if (dVar != null) {
                int i10 = NativeVideoView.A0;
                ex.V("NativeVideoView", "doRealPlay, auto:" + z10);
                NativeVideoView.this.f23739x0.Code();
            }
            this.f24109a.setPreferStartPlayTime(this.f24119l);
            this.f24109a.h(z10);
        }
    }

    public final void h(boolean z10) {
        ex.V("a0", "toggleMute: " + z10);
        if (this.f24109a != null && this.f24110b != null) {
            a(z10);
            if (z10) {
                this.f24109a.b();
            } else {
                this.f24109a.c();
            }
        }
    }

    public final void i(boolean z10) {
        int i10;
        this.f24118k = !z10;
        NativeVideoControlPanel nativeVideoControlPanel = this.f24110b;
        if (nativeVideoControlPanel != null) {
            nativeVideoControlPanel.getClass();
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            nativeVideoControlPanel.f23715c0.setVisibility(i10);
        }
    }

    public final void j() {
        if (this.f24113e == null) {
            return;
        }
        ex.Code("a0", "showPreviewView");
        Animation animation = this.f24113e.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        androidx.activity.n.q(this.f24113e, true);
        VideoView videoView = this.f24109a;
        if (videoView != null) {
            videoView.setAlpha(gl.Code);
        }
    }

    public final void k() {
        View.OnClickListener onClickListener;
        if (this.f24109a != null && (onClickListener = this.f24121n) != null) {
            onClickListener.onClick(this.f24110b);
        }
    }

    @Override // com.huawei.hms.ads.fg
    public final void Code(int i10) {
    }

    @Override // com.huawei.hms.ads.fk
    public final void V(ia.a aVar, int i10) {
        c(i10, true, false);
    }

    @Override // com.huawei.hms.ads.fk
    public final void Z(ia.a aVar, int i10) {
        c(i10, false, true);
    }

    @Override // com.huawei.hms.ads.fk
    public final void Code(int i10, int i11) {
        com.huawei.openalliance.ad.inter.data.p pVar;
        if (i11 <= 0 || (pVar = this.f24124r) == null) {
            return;
        }
        pVar.y = i11;
    }

    @Override // com.huawei.hms.ads.fk
    public final void Code(ia.a aVar, int i10) {
        VideoView videoView;
        NativeVideoControlPanel nativeVideoControlPanel;
        int i11;
        ImageView imageView = this.f24111c;
        if (imageView != null && (nativeVideoControlPanel = this.f24110b) != null && (i11 = R.drawable.hiad_pause) != 0) {
            nativeVideoControlPanel.getClass();
            imageView.setImageResource(i11);
        }
        ex.Code("a0", "hidePreviewView");
        androidx.activity.n.p(this.f24113e, 8, 300);
        if (this.f24113e != null && (videoView = this.f24109a) != null) {
            videoView.setAlpha(1.0f);
        }
        if (this.f24118k) {
            e(false, false);
        } else {
            String str = this.f24115h;
            gb.w.d(str);
            gb.w.c(this.f24127u, str, com.anythink.expressad.video.module.a.a.m.ag);
        }
        i(true);
    }

    @Override // com.huawei.hms.ads.fh
    public final void Code(ia.a aVar, int i10, int i11, int i12) {
        c(i10, false, false);
    }

    @Override // com.huawei.openalliance.ad.views.v
    public final void Code(boolean z10) {
        VideoView videoView = this.f24109a;
        if (videoView == null) {
            return;
        }
        if (!z10 && this.f24122p != 1 && !this.f24123q) {
            if ((!videoView.getCurrentState().b(ia.d.PREPARING) && !this.f24109a.o()) || this.f24123q || this.f24122p == 1) {
                return;
            }
            this.f24109a.D();
            View view = this.f24114g;
            if (view != null) {
                if (view != null) {
                    view.setVisibility(0);
                }
                e(false, false);
                return;
            }
            return;
        }
        View view2 = this.f24114g;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        if (!this.f24109a.getCurrentState().a()) {
            j();
        }
        if (this.f24117j && !this.f24120m) {
            g(true);
        } else {
            if (this.f24109a.o()) {
                return;
            }
            e(true, false);
        }
    }
}
