package com.huawei.openalliance.ad.ppskit.linked.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.activity.n;
import com.anythink.expressad.video.module.a.a.m;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.es;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.constant.bi;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.linked.view.LinkedLandVideoView;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import com.huawei.openalliance.ad.ppskit.views.VideoView;
import ka.e9;
import ka.f7;
import ka.f9;
import ka.g7;
import ka.h9;
import ka.j7;
import ka.k7;
import ka.l7;
import ka.n7;
import ka.r8;
import ka.w7;

/* loaded from: classes2.dex */
public final class d implements e9, f9, h9, VideoView.n, VideoView.p {

    /* renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ int f22685f0 = 0;
    public ImageView A;
    public TextView B;
    public TextView C;
    public final Context D;
    public int E;
    public View F;
    public ImageView G;
    public View H;
    public LinkedWifiAlertPlayButton I;
    public k7 J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public int P;
    public int R;
    public g7 T;
    public View.OnClickListener X;
    public h Y;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f22688e0;

    /* renamed from: v, reason: collision with root package name */
    public VideoView f22692v;

    /* renamed from: w, reason: collision with root package name */
    public SeekBar f22693w;

    /* renamed from: x, reason: collision with root package name */
    public LinkedNativeViewControlPanel f22694x;
    public ImageView y;

    /* renamed from: z, reason: collision with root package name */
    public ImageView f22695z;

    /* renamed from: s, reason: collision with root package name */
    public final String f22689s = "hPlT" + hashCode();

    /* renamed from: t, reason: collision with root package name */
    public final String f22690t = "hBPlT" + hashCode();

    /* renamed from: u, reason: collision with root package name */
    public final String f22691u = "aPT" + hashCode();
    public boolean O = true;
    public int Q = 0;
    public int S = 0;
    public String U = "n";
    public boolean V = false;
    public final a W = new a();
    public androidx.appcompat.widget.g Z = new androidx.appcompat.widget.g(5);

    /* renamed from: c0, reason: collision with root package name */
    public final c f22686c0 = new c();

    /* renamed from: d0, reason: collision with root package name */
    public final RunnableC0290d f22687d0 = new RunnableC0290d();

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar = d.this;
            if (dVar.f22692v != null && dVar.K) {
                dVar.B(dVar.J.a(2, dVar.O));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements SeekBar.OnSeekBarChangeListener {
        public b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                int i11 = d.f22685f0;
                n7.c("d", "onProgressChanged %s", Integer.valueOf(i10));
                d.this.f22692v.A.g(i10, 0);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            d.this.f22688e0 = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            d.this.f22688e0 = false;
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.this.c();
        }
    }

    /* renamed from: com.huawei.openalliance.ad.ppskit.linked.view.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0290d implements Runnable {
        public RunnableC0290d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar = d.this;
            dVar.E();
            dVar.c();
        }
    }

    /* loaded from: classes2.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            boolean z10 = !view.isSelected();
            d dVar = d.this;
            dVar.getClass();
            n7.e("d", "switchSound: " + z10);
            VideoView videoView = dVar.f22692v;
            if (videoView != null) {
                if (z10) {
                    videoView.f();
                    str = "y";
                } else {
                    videoView.E();
                    str = "n";
                }
                dVar.U = str;
                String str2 = dVar.f22689s;
                d2.d(str2);
                if (dVar.f22692v.D()) {
                    d2.d(str2);
                    d2.c(dVar.f22686c0, str2, 200L);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d.this.getClass();
        }
    }

    /* loaded from: classes2.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LinkedAppDetailView linkedAppDetailView;
            d dVar = d.this;
            androidx.appcompat.widget.g gVar = dVar.Z;
            if (gVar != null && gVar.c() && (linkedAppDetailView = (LinkedAppDetailView) dVar.Z.f1174b) != null) {
                linkedAppDetailView.setVisibility(8);
            }
            View view2 = dVar.H;
            if (view2 == null || view2.getVisibility() != 0) {
                dVar.H();
            }
            dVar.c();
            if (dVar.f22693w != null) {
                dVar.y(true);
            }
            dVar.F();
            dVar.f();
            int i10 = dVar.E;
            if (i10 != 0) {
                if (i10 != 1) {
                    j7 j7Var = LinkedLandVideoView.this.E;
                    if (j7Var != null) {
                        n.J(j7Var.f31322v, (ContentRecord) j7Var.f32660t, "rePlay", -111111L, -111111L, -111111, -111111);
                    }
                } else {
                    LinkedLandVideoView.c cVar = (LinkedLandVideoView.c) dVar.Y;
                    if (LinkedLandVideoView.this.E != null) {
                        p2.a(new com.huawei.openalliance.ad.ppskit.linked.view.a(cVar), 5);
                    }
                }
            } else {
                ((LinkedLandVideoView.c) dVar.Y).a();
            }
            d.C(dVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface h {
    }

    public d(Context context, VideoView videoView, LinkedNativeViewControlPanel linkedNativeViewControlPanel) {
        ImageView imageView;
        this.L = true;
        e eVar = new e();
        f fVar = new f();
        g gVar = new g();
        b bVar = new b();
        this.D = context;
        this.f22692v = videoView;
        this.f22694x = linkedNativeViewControlPanel;
        if (linkedNativeViewControlPanel != null) {
            d();
            LinkedNativeViewControlPanel linkedNativeViewControlPanel2 = this.f22694x;
            this.F = linkedNativeViewControlPanel2.E;
            View view = linkedNativeViewControlPanel2.G;
            this.H = view;
            if (view != null) {
                view.setClickable(true);
            }
            ImageView imageView2 = this.f22694x.F;
            this.G = imageView2;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new wa.g(this));
            }
            VideoView videoView2 = this.f22692v;
            if (videoView2 != null) {
                videoView2.setOnClickListener(new wa.f(this));
            }
            ImageView imageView3 = this.f22694x.f22678x;
            this.y = imageView3;
            if (imageView3 != null) {
                imageView3.setClickable(true);
                this.y.setOnClickListener(new com.huawei.openalliance.ad.ppskit.linked.view.e(this));
                int i10 = LinkedNativeViewControlPanel.J;
                this.y.setImageResource(R.drawable.hiad_linked_video_play);
                z1.t(this.y);
                H();
            }
            ImageView imageView4 = this.f22694x.y;
            this.f22695z = imageView4;
            if (imageView4 != null) {
                s(imageView4);
                this.f22695z.setOnClickListener(eVar);
            }
            LinkedNativeViewControlPanel linkedNativeViewControlPanel3 = this.f22694x;
            if (linkedNativeViewControlPanel3 != null && (imageView = linkedNativeViewControlPanel3.f22679z) != null) {
                imageView.setOnClickListener(fVar);
            }
            LinkedNativeViewControlPanel linkedNativeViewControlPanel4 = this.f22694x;
            SeekBar seekBar = linkedNativeViewControlPanel4.A;
            this.f22693w = seekBar;
            if (seekBar != null) {
                G();
                this.f22693w.setOnSeekBarChangeListener(bVar);
            }
            this.B = linkedNativeViewControlPanel4.C;
            this.C = linkedNativeViewControlPanel4.D;
            ImageView imageView5 = this.f22694x.B;
            this.A = imageView5;
            if (imageView5 != null) {
                imageView5.setOnClickListener(gVar);
            }
            VideoView videoView3 = this.f22692v;
            if (videoView3 != null) {
                videoView3.E.add(this);
                this.f22692v.F.add(this);
                this.f22692v.v(this);
                this.f22692v.D.add(this);
                this.f22692v.setSurfaceListener(this);
            }
            LinkedWifiAlertPlayButton linkedWifiAlertPlayButton = this.f22694x.H;
            this.I = linkedWifiAlertPlayButton;
            if (linkedWifiAlertPlayButton != null) {
                linkedWifiAlertPlayButton.setOnClickListener(new com.huawei.openalliance.ad.ppskit.linked.view.c(this));
            }
            n(this.H);
            this.L = true;
            H();
        }
    }

    public static void C(d dVar) {
        if (dVar.f22692v != null) {
            dVar.y(true);
            d2.d(dVar.f22691u);
            if (dVar.f22692v.D()) {
                d2.d(dVar.f22689s);
                dVar.f22692v.c();
                dVar.x(0);
            } else {
                k7 k7Var = dVar.J;
                if (k7Var != null) {
                    dVar.B(k7Var.a(1, dVar.O));
                }
            }
        }
    }

    @SuppressLint({"DefaultLocale"})
    public static void p(TextView textView, int i10) {
        if (textView == null) {
            return;
        }
        int i11 = i10 / 1000;
        textView.setText(String.format("%02d:%02d", Integer.valueOf((i11 % com.anythink.expressad.d.a.b.ck) / 60), Integer.valueOf(i11 % 60)));
    }

    public static void s(View view) {
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void A() {
        if (this.Z.c()) {
            this.Z.a();
        }
        if (this.E == 1) {
            x(0);
        }
        this.f22694x.setNonWifiAlertMsg(R.string.hiad_network_disconnect_to_try);
        this.I.setText(R.string.hiad_click_to_try_again);
        d();
        s(this.H);
    }

    public final void B(int i10) {
        n7.c("d", "strategyMode is %s", Integer.valueOf(i10));
        if (i10 != 1) {
            if (i10 != 101) {
                if (i10 != 102) {
                    if (i10 == 201 || i10 == 202) {
                        D();
                        return;
                    }
                    return;
                }
                q(true, false);
                return;
            }
            q(false, true);
            return;
        }
        VideoView videoView = this.f22692v;
        if (videoView != null) {
            if (videoView.getCurrentState().a()) {
                this.f22692v.c();
            }
            n(this.H);
            A();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            r10 = this;
            com.huawei.openalliance.ad.ppskit.views.VideoView r0 = r10.f22692v
            if (r0 != 0) goto L5
            return
        L5:
            ka.r8 r0 = r0.getCurrentState()
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = r0.toString()
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "currentState %s"
            java.lang.String r5 = "d"
            ka.n7.c(r5, r3, r2)
            ka.r8$b r2 = ka.r8.b.PLAYING
            boolean r2 = r0.b(r2)
            if (r2 == 0) goto L28
            com.huawei.openalliance.ad.ppskit.views.VideoView r0 = r10.f22692v
            r0.c()
            goto L38
        L28:
            ka.r8$b r2 = ka.r8.b.PREPARING
            boolean r0 = r0.b(r2)
            if (r0 == 0) goto L38
            com.huawei.openalliance.ad.ppskit.views.VideoView r0 = r10.f22692v
            r0.b()
            r10.e()
        L38:
            android.view.View r0 = r10.H
            r10.n(r0)
            r10.x(r4)
            android.view.View r0 = r10.H
            if (r0 == 0) goto Lc4
            int r0 = r10.R
            android.content.Context r2 = r10.D
            if (r0 != 0) goto L4b
            goto L66
        L4b:
            int r3 = r10.N
            int r3 = 100 - r3
            int r3 = r3 * r0
            int r3 = r3 / 100
            long r6 = (long) r3
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r0[r4] = r3
            java.lang.String r3 = " left data is %s"
            ka.n7.c(r5, r3, r0)
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L68
        L66:
            r0 = 0
            goto L7e
        L68:
            java.util.regex.Pattern r0 = com.huawei.openalliance.ad.ppskit.utils.y1.f23070a
            if (r2 != 0) goto L6f
            java.lang.String r0 = ""
            goto L7e
        L6f:
            java.lang.String r0 = com.huawei.openalliance.ad.ppskit.utils.x.b(r6)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r3[r4] = r0
            r0 = 2131951978(0x7f13016a, float:1.9540386E38)
            java.lang.String r0 = r2.getString(r0, r3)
        L7e:
            if (r0 == 0) goto L90
            android.content.res.Resources r2 = r2.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r0
            r0 = 2131951972(0x7f130164, float:1.9540374E38)
            java.lang.String r0 = r2.getString(r0, r1)
            goto L9b
        L90:
            android.content.res.Resources r0 = r2.getResources()
            r1 = 2131951971(0x7f130163, float:1.9540372E38)
            java.lang.String r0 = r0.getString(r1)
        L9b:
            com.huawei.openalliance.ad.ppskit.linked.view.LinkedNativeViewControlPanel r1 = r10.f22694x
            r1.setNonWifiAlertMsg(r0)
            com.huawei.openalliance.ad.ppskit.linked.view.LinkedWifiAlertPlayButton r0 = r10.I
            r1 = 2131951976(0x7f130168, float:1.9540382E38)
            r0.setText(r1)
            r10.d()
            androidx.appcompat.widget.g r0 = r10.Z
            java.lang.Object r0 = r0.f1174b
            com.huawei.openalliance.ad.ppskit.linked.view.LinkedAppDetailView r0 = (com.huawei.openalliance.ad.ppskit.linked.view.LinkedAppDetailView) r0
            if (r0 == 0) goto Lb8
            r1 = 8
            r0.setVisibility(r1)
        Lb8:
            android.view.View r0 = r10.H
            s(r0)
            com.huawei.openalliance.ad.ppskit.views.VideoView r0 = r10.f22692v
            ka.w7 r0 = r0.A
            r0.C()
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.linked.view.d.D():void");
    }

    public final void E() {
        n(this.f22693w);
        n(this.B);
        n(this.C);
        n(this.A);
        n(this.f22695z);
        c();
    }

    public final void F() {
        View view = this.H;
        if (view != null && view.getVisibility() == 0) {
            E();
            return;
        }
        if (this.E != 2) {
            G();
        }
        s(this.A);
        s(this.f22695z);
    }

    public final void G() {
        n7.b("d", "showProgressControlPanel: ");
        s(this.f22693w);
        s(this.B);
        s(this.C);
    }

    public final void H() {
        View view = this.H;
        if (view != null && view.getVisibility() == 0) {
            c();
            return;
        }
        View view2 = this.F;
        if (view2 != null && view2.getVisibility() == 0) {
            c();
        } else if (this.Z.c()) {
            c();
        } else {
            s(this.y);
        }
    }

    @Override // ka.e9
    public final void a() {
        View view = this.F;
        if (view == null || view.getVisibility() == 0) {
            return;
        }
        this.F.setVisibility(0);
        c();
    }

    @Override // ka.e9
    public final void b() {
        View view = this.F;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        this.F.setVisibility(8);
    }

    public final void c() {
        n7.b("d", "hidePlayButton");
        n(this.y);
    }

    public final void d() {
        n7.b("d", "hideAllControlPanelDirectly");
        c();
        d2.d(this.f22690t);
        E();
    }

    public final void e() {
        if (this.G == null) {
            return;
        }
        n7.b("d", "showPreviewView");
        Animation animation = this.G.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        n.V(this.G, true);
        VideoView videoView = this.f22692v;
        if (videoView != null) {
            videoView.setAlpha(gl.Code);
        }
    }

    public final void f() {
        String str = this.f22690t;
        d2.d(str);
        d2.c(this.f22687d0, str, m.ag);
    }

    @Override // ka.f9
    public final void g(w7 w7Var, int i10, int i11, int i12) {
        k(i10, false, false);
    }

    @Override // ka.h9
    public final void h(w7 w7Var, int i10) {
        k(i10, true, false);
    }

    public final void i(int i10, String str, boolean z10) {
        String str2;
        int i11 = this.S;
        if (i11 >= 1000 || i11 == 0 || z10) {
            n7.e("d", "set progress from linked view " + i10);
            this.S = 0;
            Intent intent = new Intent(es.Code);
            intent.putExtra(es.I, true);
            intent.putExtra(es.Z, i10);
            intent.putExtra(es.B, str);
            l7 l7Var = ((f7) this.T).f31167c;
            String str3 = "";
            if (l7Var == null) {
                str2 = "";
            } else {
                str2 = l7Var.f;
            }
            intent.putExtra("caller_package", str2);
            Context context = this.D;
            if (d0.m(context)) {
                l7 l7Var2 = ((f7) this.T).f31167c;
                if (l7Var2 != null) {
                    str3 = l7Var2.f;
                }
                intent.setPackage(str3);
                context.sendBroadcast(intent);
                return;
            }
            l7 l7Var3 = ((f7) this.T).f31167c;
            if (l7Var3 != null) {
                str3 = l7Var3.f;
            }
            androidx.transition.n.B(context, str3, bi.I, intent);
        }
    }

    @Override // ka.h9
    public final void j(w7 w7Var, int i10) {
        VideoView videoView;
        ImageView imageView = this.y;
        if (imageView != null && this.f22694x != null) {
            int i11 = LinkedNativeViewControlPanel.J;
            imageView.setImageResource(R.drawable.hiad_linked_video_pause);
        }
        this.V = false;
        c();
        ImageView imageView2 = this.G;
        if (imageView2 != null && imageView2.getVisibility() != 8) {
            imageView2.setVisibility(8);
            Animation animation = imageView2.getAnimation();
            if (animation != null) {
                animation.cancel();
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, gl.Code);
            long j10 = 300;
            alphaAnimation.setDuration(j10);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            alphaAnimation.setStartOffset(j10);
            imageView2.startAnimation(alphaAnimation);
        }
        if (this.G != null && (videoView = this.f22692v) != null) {
            videoView.setAlpha(1.0f);
        }
        x(1);
        if (this.L) {
            c();
        } else {
            String str = this.f22689s;
            d2.d(str);
            d2.c(this.f22686c0, str, 200L);
        }
        this.L = false;
        F();
        f();
        i(i10, this.U, true);
    }

    public final void k(int i10, boolean z10, boolean z11) {
        if (!z11 && !this.Z.c()) {
            x(0);
        } else {
            x(2);
        }
        z(i10);
        d2.d(this.f22691u);
        if (z11) {
            i10 = 0;
        }
        this.M = i10;
        d2.d(this.f22689s);
        ImageView imageView = this.y;
        if (imageView != null) {
            int i11 = LinkedNativeViewControlPanel.J;
            imageView.setImageResource(R.drawable.hiad_linked_video_play);
            z1.t(this.y);
        }
        if (!z10) {
            e();
            this.L = true;
        }
        if (!z11) {
            H();
        }
        F();
    }

    public final void l(long j10) {
        VideoView videoView;
        n7.f("d", "autoPlay - delayMs: %d", Long.valueOf(j10));
        String str = this.f22691u;
        d2.d(str);
        if (!this.K || (videoView = this.f22692v) == null) {
            return;
        }
        if (!videoView.D()) {
            n7.b("d", "autoPlay - start delay runnable");
            d2.c(this.W, str, j10);
            return;
        }
        n7.b("d", "autoPlay - video is playing");
        k7 k7Var = this.J;
        if (k7Var != null) {
            B(k7Var.a(2, this.O));
        }
    }

    @Override // ka.h9
    public final void m(w7 w7Var, int i10) {
        boolean z10;
        ContentRecord contentRecord;
        n7.b("d", "onMediaCompletion");
        this.V = true;
        k(i10, false, true);
        f7 f7Var = (f7) this.Z.f1175c;
        if (f7Var != null && (contentRecord = f7Var.f31166b) != null && contentRecord.j0() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.L = true;
            c();
            this.Z.a();
            x(2);
            F();
        } else {
            View view = this.H;
            if (view == null || view.getVisibility() != 0) {
                H();
            }
            c();
            if (this.f22693w != null) {
                y(true);
            }
            x(2);
        }
        i(i10, this.U, true);
        this.N = 0;
        y(false);
        k7 k7Var = this.J;
        if (k7Var != null) {
            k7Var.f31369c = 0;
        }
    }

    public final void n(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // ka.h9
    public final void o(w7 w7Var, int i10) {
        n7.c("d", "onMediaStop playtime is %s", Integer.valueOf(i10));
        k(i10, false, false);
    }

    public final void q(boolean z10, boolean z11) {
        VideoView videoView = this.f22692v;
        if (videoView == null || videoView.D()) {
            return;
        }
        n(this.H);
        r8 currentState = this.f22692v.getCurrentState();
        n7.c("d", "currentState %s", currentState.toString());
        if (!z11 && currentState.b(r8.b.PLAYBACK_COMPLETED)) {
            return;
        }
        if (!currentState.a()) {
            e();
        }
        if (!z10) {
            d2.d(this.f22691u);
        }
        n7.c("d", "playVideo, viewPaused is %s", Boolean.FALSE);
        if (!this.K && !z11) {
            if (!this.f22692v.D()) {
                H();
            } else {
                return;
            }
        } else {
            if (this.f22692v != null) {
                h hVar = this.Y;
                if (hVar != null) {
                    int i10 = LinkedLandVideoView.U;
                    n7.e("LinkedLandVideoView", "doRealPlay, auto:" + z10);
                    LinkedLandVideoView.this.N.a();
                }
                if (this.E == 2 || this.N == 0) {
                    this.M = 0;
                    this.N = 0;
                    SeekBar seekBar = this.f22693w;
                    if (seekBar != null) {
                        seekBar.setProgress(0);
                        this.f22692v.A.g(this.N, 0);
                    }
                }
                LinkedAppDetailView linkedAppDetailView = (LinkedAppDetailView) this.Z.f1174b;
                if (linkedAppDetailView != null) {
                    linkedAppDetailView.setVisibility(8);
                }
                this.f22692v.setPreferStartPlayTime(this.M);
                this.f22692v.x(z10);
            }
            x(1);
        }
        F();
        f();
    }

    public final void r(int i10) {
        n7.c("d", "setPreferStartPlayTime %s", Integer.valueOf(i10));
        this.M = i10;
        z(i10);
        VideoView videoView = this.f22692v;
        if (videoView != null) {
            videoView.setPreferStartPlayTime(i10);
        }
    }

    public final void t(boolean z10) {
        n7.c("d", "setCanAutoPlay %s", Boolean.valueOf(z10));
        this.K = z10;
    }

    public final void u(boolean z10) {
        String str;
        n7.e("d", "toggleMute: " + z10);
        if (this.f22692v != null && this.f22694x != null) {
            v(z10);
            if (z10) {
                this.f22692v.E();
                str = "n";
            } else {
                this.f22692v.f();
                str = "y";
            }
            this.U = str;
        }
    }

    public final void v(boolean z10) {
        n7.e("d", "setMuteBtn: " + z10);
        ImageView imageView = this.f22694x.y;
        if (imageView != null) {
            imageView.setImageResource(z1.n(true, z10));
            imageView.setSelected(!z10);
            z1.t(imageView);
        }
    }

    public final void w(boolean z10) {
        if (n7.d()) {
            n7.c("d", "setPlayBtn: %s", Boolean.valueOf(z10));
        }
        if (this.y == null) {
            return;
        }
        n7.c("d", "isDetailViewVisible %s", Boolean.valueOf(this.Z.c()));
        if (this.Z.c()) {
            c();
        } else {
            this.y.setEnabled(z10);
        }
    }

    public final void x(int i10) {
        int i11;
        n7.c("d", "updateButtonState: %s", Integer.valueOf(i10));
        this.E = i10;
        ImageView imageView = this.A;
        if (imageView == null) {
            return;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    int i12 = LinkedNativeViewControlPanel.J;
                    i11 = R.drawable.hiad_linked_video_refresh;
                } else {
                    return;
                }
            } else {
                int i13 = LinkedNativeViewControlPanel.J;
                imageView.setImageResource(R.drawable.hiad_linked_video_pause);
                return;
            }
        } else {
            int i14 = LinkedNativeViewControlPanel.J;
            i11 = R.drawable.hiad_linked_video_play;
        }
        imageView.setImageResource(i11);
        z1.t(this.A);
    }

    public final void y(boolean z10) {
        SeekBar seekBar = this.f22693w;
        if (seekBar != null) {
            if (z10 && seekBar.getVisibility() != 0) {
                G();
            } else if (!z10 && this.f22693w.getVisibility() != 8) {
                n(this.f22693w);
                n(this.B);
                n(this.C);
            }
        }
    }

    public final void z(int i10) {
        int i11 = this.P;
        if (i11 != 0) {
            int i12 = (i10 * 100) / i11;
            this.N = i12;
            n7.c("d", " currentProgress is %s", Integer.valueOf(i12));
        } else {
            int i13 = this.Q;
            if (i13 != 0) {
                n7.c("d", "calculateCurrentProgress defaultVideoDuration %s", Integer.valueOf(i13));
                int i14 = (i10 * 100) / this.Q;
                this.N = i14;
                n7.c("d", " currentProgress is %s", Integer.valueOf(i14));
            }
        }
        if (this.N >= 100) {
            n7.e("d", "progress bigger than 100, play from start.");
            this.N = 0;
        }
    }

    @Override // ka.e9
    public final void a(int i10) {
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.VideoView.n
    public final void b(boolean z10) {
        androidx.appcompat.widget.g gVar;
        int i10;
        int i11;
        if (this.J == null || this.f22692v == null || this.V || (gVar = this.Z) == null || gVar.c()) {
            return;
        }
        k7 k7Var = this.J;
        boolean z11 = this.O;
        k7Var.getClass();
        n7.b("LinkedAlertAndPlayStrategy", "switchToNetworkConnected, wifi is " + z10 + ", notShowDataUsageAlert is " + z11);
        if (k7Var.f31368b == null) {
            i11 = -1;
        } else {
            if (z10) {
                n7.c("LinkedAlertAndPlayStrategy", "switchWifi, mManualOrAuto is %s", Integer.valueOf(k7Var.f31369c));
                if (k7Var.f31369c == 0) {
                    k7Var.f31369c = 2;
                }
                i10 = k7Var.f31369c;
            } else {
                n7.c("LinkedAlertAndPlayStrategy", "switchData, notShowDataUsageAlert is %s", Boolean.valueOf(z11));
                if (z11 && k7Var.f31367a != 1) {
                    String str = k7Var.f31371e;
                    if (TextUtils.isEmpty(str) || y1.t(str)) {
                        if (k7Var.f31369c == 0) {
                            k7Var.f31369c = 1;
                        }
                        i11 = k7Var.f31369c + 200;
                    }
                }
                i10 = k7Var.f31369c;
            }
            i11 = i10 + 100;
        }
        B(i11);
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.VideoView.n
    public final void l() {
        androidx.appcompat.widget.g gVar;
        k7 k7Var;
        int i10;
        if (this.f22692v == null || this.V || (gVar = this.Z) == null || gVar.c() || (k7Var = this.J) == null) {
            return;
        }
        n7.b("LinkedAlertAndPlayStrategy", "switchToNoNetwork");
        if (k7Var.f31368b == null) {
            i10 = -1;
        } else {
            String str = k7Var.f31371e;
            i10 = (TextUtils.isEmpty(str) || y1.t(str)) ? 1 : k7Var.f31369c == 0 ? 102 : 0;
        }
        B(i10);
    }

    @Override // ka.h9
    public final void a(int i10, int i11) {
        SeekBar seekBar;
        if (!this.f22688e0 && (seekBar = this.f22693w) != null && i11 > 0) {
            seekBar.setProgress(i10);
            p(this.B, i11);
        }
        if (i11 > 0) {
            this.N = i10;
            this.S += 200;
            i(i11, this.U, false);
        }
    }
}
