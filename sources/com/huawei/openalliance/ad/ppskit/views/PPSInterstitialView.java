package com.huawei.openalliance.ad.ppskit.views;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.activity.ComplianceActivity;
import com.huawei.openalliance.ad.ppskit.activity.InterstitialAdActivity;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdSource;
import com.huawei.openalliance.ad.ppskit.beans.metadata.CtrlExt;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import com.huawei.openalliance.ad.ppskit.views.VideoView;
import com.iab.omid.library.huawei.adsession.media.InteractionType;
import java.util.HashMap;
import ka.d5;
import ka.db;
import ka.eb;
import ka.f6;
import ka.g9;
import ka.gc;
import ka.hb;
import ka.i9;
import ka.ib;
import ka.ii;
import ka.k9;
import ka.m9;
import ka.n7;
import ka.p9;
import ka.vb;
import ka.vf;
import ka.y4;

/* loaded from: classes2.dex */
public class PPSInterstitialView extends AutoScaleSizeRelativeLayout implements View.OnClickListener, g9, i9, k9, m9.a, p9, db, VideoView.n {
    public static final /* synthetic */ int D0 = 0;
    public ua.a A;
    public MaterialClickInfo A0;
    public String B;
    public boolean B0;
    public String C;
    public boolean C0;
    public InterstitialVideoView D;
    public ImageView E;
    public int F;
    public View G;
    public PPSAppDetailView H;
    public PPSAppDetailView I;
    public PPSExpandButtonDetailView J;
    public ImageView K;
    public ImageView L;
    public t M;
    public ViewGroup N;
    public LinearLayout O;
    public PPSLabelView P;
    public TextView Q;
    public boolean R;
    public e S;
    public gc T;
    public ChoicesView U;
    public TextView V;
    public boolean W;

    /* renamed from: c0, reason: collision with root package name */
    public Dialog f23188c0;

    /* renamed from: d0, reason: collision with root package name */
    public ProgressBar f23189d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f23190e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f23191f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f23192g0;

    /* renamed from: h0, reason: collision with root package name */
    public final int f23193h0;

    /* renamed from: i0, reason: collision with root package name */
    public long f23194i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f23195j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f23196k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f23197l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f23198m0;

    /* renamed from: n0, reason: collision with root package name */
    public long f23199n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f23200o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f23201p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f23202q0;

    /* renamed from: r0, reason: collision with root package name */
    public Context f23203r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f23204s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f23205t0;

    /* renamed from: u0, reason: collision with root package name */
    public m9 f23206u0;

    /* renamed from: v0, reason: collision with root package name */
    public va.a f23207v0;

    /* renamed from: w0, reason: collision with root package name */
    public final String f23208w0;

    /* renamed from: x, reason: collision with root package name */
    public final eb f23209x;

    /* renamed from: x0, reason: collision with root package name */
    public PPSAppDetailTemplateView f23210x0;
    public int y;
    public TextView y0;

    /* renamed from: z, reason: collision with root package name */
    public ContentRecord f23211z;

    /* renamed from: z0, reason: collision with root package name */
    public PPSAppDownLoadWithAnimationView f23212z0;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AdContentData f23213s;

        /* renamed from: com.huawei.openalliance.ad.ppskit.views.PPSInterstitialView$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class ViewOnClickListenerC0297a implements View.OnClickListener {
            public ViewOnClickListenerC0297a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdContentData adContentData;
                a aVar = a.this;
                ua.a aVar2 = PPSInterstitialView.this.A;
                if (aVar2 != null && (adContentData = aVar2.f35809b) != null) {
                    boolean M = androidx.transition.n.M(adContentData.q());
                    PPSInterstitialView pPSInterstitialView = PPSInterstitialView.this;
                    if (M) {
                        String i10 = adContentData.i();
                        if (TextUtils.isEmpty(i10)) {
                            i10 = adContentData.h();
                        }
                        com.huawei.openalliance.ad.ppskit.utils.d0.n(pPSInterstitialView.getContext(), i10);
                        return;
                    }
                    ComplianceActivity.v(pPSInterstitialView.getContext(), view, adContentData);
                    return;
                }
                n7.g("PPSInterstitialView", "AdInfo is null or contentData is null");
            }
        }

        public a(AdContentData adContentData) {
            this.f23213s = adContentData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:215:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0184  */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v109 */
        /* JADX WARN: Type inference failed for: r2v110 */
        /* JADX WARN: Type inference failed for: r2v115 */
        /* JADX WARN: Type inference failed for: r2v162 */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v21 */
        /* JADX WARN: Type inference failed for: r2v28 */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v22 */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 1472
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.PPSInterstitialView.a.run():void");
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        
            if (r4 == 4) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r6 = this;
                com.huawei.openalliance.ad.ppskit.views.PPSInterstitialView r0 = com.huawei.openalliance.ad.ppskit.views.PPSInterstitialView.this
                ua.a r1 = r0.A
                boolean r2 = r0.f23200o0
                if (r2 == 0) goto L4b
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L1b
                com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData r4 = r1.f35809b
                if (r4 == 0) goto L15
                int r4 = r4.O()
                goto L16
            L15:
                r4 = r3
            L16:
                r5 = 2
                if (r4 != r5) goto L1b
                r4 = r2
                goto L1c
            L1b:
                r4 = r3
            L1c:
                if (r4 != 0) goto L33
                ua.a r4 = r0.A
                if (r4 == 0) goto L30
                com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData r4 = r4.f35809b
                if (r4 == 0) goto L2b
                int r4 = r4.O()
                goto L2c
            L2b:
                r4 = r3
            L2c:
                r5 = 4
                if (r4 != r5) goto L30
                goto L31
            L30:
                r2 = r3
            L31:
                if (r2 == 0) goto L4b
            L33:
                ka.m9 r2 = r0.f23206u0
                if (r2 == 0) goto L4b
                long r1 = r1.d()
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                ka.m9 r2 = r0.f23206u0
                int r2 = r2.H
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 0
                r0.y(r1, r2, r3)
            L4b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.PPSInterstitialView.b.run():void");
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSInterstitialView.this.B0 = true;
        }
    }

    /* loaded from: classes2.dex */
    public class d implements f6 {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable f23218a;

        public d(Drawable drawable) {
            this.f23218a = drawable;
        }
    }

    /* loaded from: classes2.dex */
    public interface e {
    }

    public PPSInterstitialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes;
        this.f23209x = new eb();
        this.R = true;
        this.W = true;
        this.f23190e0 = true;
        this.f23191f0 = -1;
        this.f23192g0 = false;
        this.f23193h0 = -1;
        this.f23194i0 = 0L;
        this.f23195j0 = false;
        this.f23196k0 = false;
        this.f23197l0 = false;
        this.f23200o0 = false;
        this.f23201p0 = false;
        this.f23202q0 = 0;
        this.f23205t0 = false;
        this.f23208w0 = "interstitial_imp_monitor_" + hashCode();
        this.B0 = true;
        this.C0 = false;
        if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.f20q0)) != null) {
            try {
                int integer = obtainStyledAttributes.getInteger(0, 0);
                this.f23202q0 = integer;
                n7.c("PPSInterstitialView", "mFullScreen %s", Integer.valueOf(integer));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f23203r0 = context;
        this.T = new gc(context, this);
        this.f23206u0 = new m9(this, this);
        this.f23204s0 = true;
    }

    private void setAdInfoWrapper(AdContentData adContentData) {
        d2.a(new a(adContentData));
    }

    private void setTryResumeVideoView(boolean z10) {
        this.C0 = z10;
    }

    public final void A(boolean z10) {
        int m10 = z1.m(this.F, z10);
        ImageView imageView = this.E;
        if (imageView != null) {
            imageView.setImageResource(m10);
            z1.t(this.E);
        }
    }

    public final String B(int i10, boolean z10) {
        if (z10) {
            return getResources().getQuantityString(R.plurals.hiad_reward_countdown, i10, Integer.valueOf(i10));
        }
        return getResources().getQuantityString(R.plurals.hiad_interstitial_time_countdown, i10, Integer.valueOf(i10));
    }

    public final void C(Integer num) {
        ii N = a0.a.N(getContext(), this.f23211z, r(), true);
        if (N.a()) {
            va.a aVar = this.f23207v0;
            if (aVar != null) {
                ((InterstitialAdActivity) aVar).k(8, -1, -1);
            }
            gc gcVar = this.T;
            if (gcVar != null) {
                MaterialClickInfo materialClickInfo = this.A0;
                if (num == null) {
                    num = 7;
                }
                vf.a aVar2 = new vf.a();
                aVar2.f32023c = N.d();
                aVar2.f32024d = num;
                aVar2.f32025e = materialClickInfo;
                ContentRecord contentRecord = (ContentRecord) gcVar.f32660t;
                View view = gcVar.y;
                if (view == null) {
                    view = gcVar.f31212v;
                }
                androidx.activity.n.N(gcVar.f31213w, contentRecord, z1.v(view), new vf(aVar2));
                this.A0 = null;
            }
            x(1);
        }
    }

    public final void D(int i10) {
        if (this.f23192g0 && this.f23191f0 >= 0) {
            this.f23192g0 = false;
        }
        this.f23191f0 = -1;
    }

    public final void E(int i10, long j10) {
        int i11;
        ua.a aVar = this.A;
        if (aVar != null && !this.f23195j0 && j10 > aVar.d()) {
            MetaData c10 = this.A.c();
            if (c10 != null) {
                i11 = c10.d0();
            } else {
                i11 = 50;
            }
            if (i10 >= i11) {
                this.f23195j0 = true;
                y(Long.valueOf(j10), Integer.valueOf(i10), null);
            }
        }
    }

    public final void F(Integer num) {
        if (this.f23206u0 != null) {
            y(Long.valueOf(System.currentTimeMillis() - this.f23206u0.G), Integer.valueOf(this.f23206u0.H), num);
        }
    }

    public final void G(boolean z10) {
        n7.f("PPSInterstitialView", "resume %s", Boolean.valueOf(z10));
        if (!N()) {
            return;
        }
        if (z10 && this.C0) {
            return;
        }
        this.C0 = true;
        InterstitialVideoView interstitialVideoView = this.D;
        if (interstitialVideoView != null) {
            VideoView videoView = interstitialVideoView.B;
            videoView.M = false;
            videoView.setNeedPauseOnSurfaceDestory(true);
            J();
            if (this.R) {
                this.D.B.E();
            } else {
                this.D.B.f();
            }
        }
        A(this.R);
    }

    public final boolean H(ContentRecord contentRecord) {
        if (contentRecord == null) {
            return false;
        }
        return a0.a.Z(contentRecord.s3(), new int[]{2, 3, 5, 8});
    }

    public final void I() {
        e eVar = this.S;
        if (eVar != null) {
            ((InterstitialAdActivity) eVar).finishAndRemoveTask();
        }
        F(3);
        x(3);
        va.a aVar = this.f23207v0;
        if (aVar != null) {
            InterstitialAdActivity interstitialAdActivity = (InterstitialAdActivity) aVar;
            interstitialAdActivity.k(4, -1, -1);
            interstitialAdActivity.finish();
        }
        t tVar = this.M;
        if (tVar != null) {
            tVar.cancel();
            this.M = null;
        }
    }

    public final void J() {
        boolean z10 = true;
        if (L()) {
            n7.e("PPSInterstitialView", "in play");
        } else if (!N() || (!K() && !com.huawei.openalliance.ad.ppskit.utils.k1.e(getContext()))) {
            z10 = false;
        }
        if (!z10) {
            if (!com.huawei.openalliance.ad.ppskit.utils.k1.g(getContext())) {
                Toast.makeText(getContext().getApplicationContext(), R.string.hiad_network_error, 0).show();
                return;
            } else if (this.f23190e0) {
                d2.a(new u(this));
                return;
            }
        }
        M();
    }

    public final boolean K() {
        boolean z10;
        if (!N()) {
            return false;
        }
        String a10 = this.f23211z.h0().a();
        d5 a11 = y4.a(this.f23203r0, "insre");
        if (y1.t(a10) && TextUtils.isEmpty(a11.j(getContext(), a10))) {
            z10 = false;
        } else {
            z10 = true;
        }
        n7.f("PPSInterstitialView", "cache %s", Boolean.valueOf(z10));
        return z10;
    }

    public final boolean L() {
        if (this.D == null || !N() || !this.D.B.D()) {
            return false;
        }
        return true;
    }

    public final void M() {
        if (L()) {
            n7.e("PPSInterstitialView", "played");
            return;
        }
        View view = this.G;
        if (view != null) {
            view.setVisibility(8);
        }
        InterstitialVideoView interstitialVideoView = this.D;
        if (interstitialVideoView != null) {
            interstitialVideoView.s(true);
        }
    }

    public final boolean N() {
        ContentRecord contentRecord = this.f23211z;
        if (contentRecord != null && contentRecord.h0() != null && this.f23211z.z() == 9) {
            return true;
        }
        return false;
    }

    @Override // ka.i9
    public final void a() {
        this.R = true;
        A(true);
    }

    @Override // ka.i9
    public final void b() {
        this.R = false;
        A(false);
    }

    @Override // ka.m9.a
    public final void c() {
        this.f23191f0 = -1;
        this.f23192g0 = false;
        this.f23194i0 = 0L;
        if (this.f23200o0) {
            s();
        }
    }

    @Override // ka.m9.a
    public final void d() {
        this.f23195j0 = false;
        this.f23196k0 = false;
        HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf(currentTimeMillis);
        ua.a aVar = this.A;
        if (aVar != null) {
            aVar.f35815i = false;
            aVar.f35816j = false;
        }
        gc gcVar = this.T;
        if (gcVar != null) {
            ContentRecord contentRecord = (ContentRecord) gcVar.f32660t;
            if (contentRecord != null) {
                contentRecord.V1(valueOf);
            }
            this.T.i(currentTimeMillis);
        }
        InterstitialVideoView interstitialVideoView = this.D;
        if (interstitialVideoView != null) {
            ContentRecord contentRecord2 = (ContentRecord) interstitialVideoView.F.f32660t;
            if (contentRecord2 != null) {
                contentRecord2.V1(valueOf);
            }
            this.D.F.i(currentTimeMillis);
        }
        gc gcVar2 = this.T;
        if (gcVar2 != null) {
            androidx.activity.n.P(gcVar2.f31213w, com.huawei.openalliance.ad.constant.s.I, androidx.activity.n.y((ContentRecord) gcVar2.f32660t));
        }
        G(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction() & com.anythink.expressad.exoplayer.k.p.f9095b;
            if (action == 0) {
                this.A0 = a0.a.z(this, motionEvent);
            }
            if (1 == action) {
                a0.a.T(this, motionEvent, this.A0);
            }
        } catch (Throwable th) {
            n7.h("PPSInterstitialView", "dispatchTouchEvent exception : %s", th.getClass().getSimpleName());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // ka.k9
    public final void f(int i10, String str, int i11, int i12) {
        TextView textView = this.Q;
        if (textView != null) {
            textView.setVisibility(8);
        }
        ImageView imageView = this.K;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (!com.huawei.openalliance.ad.ppskit.utils.k1.g(getContext())) {
            Toast.makeText(getContext().getApplicationContext(), R.string.hiad_network_error, 0).show();
        }
        D(i10);
        va.a aVar = this.f23207v0;
        if (aVar != null) {
            ((InterstitialAdActivity) aVar).k(1, i11, i12);
        }
    }

    public final void g() {
        n7.e("PPSInterstitialView", "pauseView");
        setTryResumeVideoView(false);
        InterstitialVideoView interstitialVideoView = this.D;
        if (interstitialVideoView != null) {
            VideoView videoView = interstitialVideoView.B;
            videoView.M = true;
            videoView.A.C();
        }
        if (N()) {
            View view = this.G;
            if (view != null) {
                view.setVisibility(0);
            }
            InterstitialVideoView interstitialVideoView2 = this.D;
            if (interstitialVideoView2 != null) {
                interstitialVideoView2.B.c();
            }
        }
    }

    public int getmInsreTemplate() {
        return this.F;
    }

    public final void h() {
        d2.d(this.f23208w0);
        m9 m9Var = this.f23206u0;
        if (m9Var != null) {
            m9Var.E = 50;
            m9Var.D = 500L;
        }
        if (this.D != null) {
            setTryResumeVideoView(false);
            if (N()) {
                this.D.B.b();
            }
            this.D.B.l();
        }
        this.f23209x.d();
    }

    @Override // ka.k9
    public final void i(String str, int i10) {
        if (!this.f23197l0) {
            D(i10);
        }
    }

    @Override // ka.k9
    public final void k(int i10, String str) {
        boolean z10;
        if (!this.f23197l0) {
            this.f23197l0 = true;
            D(i10);
            TextView textView = this.Q;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.K;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            va.a aVar = this.f23207v0;
            if (aVar != null) {
                ((InterstitialAdActivity) aVar).k(3, -1, -1);
            }
            gc gcVar = this.T;
            if (gcVar != null) {
                long j10 = i10;
                gcVar.j(this.f23203r0, j10, j10);
            }
        }
        n7.e("PPSInterstitialView", "loop");
        if (!N() || (!K() && !com.huawei.openalliance.ad.ppskit.utils.k1.e(getContext()))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            M();
            return;
        }
        if (L()) {
            this.D.B.c();
        }
        this.f23190e0 = true;
        View view = this.G;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // ka.k9
    public final void l(String str, int i10) {
        va.a aVar;
        if (n7.d()) {
            n7.b("PPSInterstitialView", "video start");
        }
        if (this.f23204s0) {
            TextView textView = this.Q;
            if (textView != null) {
                textView.setVisibility(0);
            }
            this.f23204s0 = false;
        }
        ProgressBar progressBar = this.f23189d0;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        if (!this.f23192g0 && (aVar = this.f23207v0) != null) {
            ((InterstitialAdActivity) aVar).k(9, -1, -1);
        }
        this.f23192g0 = true;
        this.f23191f0 = i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.b("PPSInterstitialView", "onAttachedToWindow");
        m9 m9Var = this.f23206u0;
        if (m9Var != null) {
            m9Var.d();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.B0) {
            return;
        }
        this.B0 = false;
        int id2 = view.getId();
        a0.a.f12i0 = System.currentTimeMillis();
        if (id2 == R.id.interstitial_close) {
            I();
        } else if (id2 != R.id.interstitial_video_view && id2 != R.id.interstitial_image_view && id2 != R.id.interstitial_content_view) {
            n7.i("PPSInterstitialView", "un handle action");
        } else {
            va.a aVar = this.f23207v0;
            if (aVar != null) {
                ((InterstitialAdActivity) aVar).k(2, -1, -1);
            }
            F(1);
            C(null);
        }
        d2.b(new c(), 500L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n7.e("PPSInterstitialView", "onDetechedFromWindow");
        m9 m9Var = this.f23206u0;
        if (m9Var != null) {
            m9Var.e();
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        m9 m9Var = this.f23206u0;
        if (m9Var != null) {
            n7.e(m9Var.f31599s, "onViewVisibilityChanged");
            m9Var.f();
        }
    }

    public final HashMap r() {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        ua.a aVar = this.A;
        if (aVar != null) {
            MetaData c10 = aVar.c();
            String str3 = "";
            if (c10 == null) {
                str = "";
            } else {
                str = c10.f0();
            }
            hashMap.put("appId", str);
            MetaData c11 = this.A.c();
            if (c11 != null) {
                str3 = c11.j();
            }
            hashMap.put("thirdId", str3);
            if (com.huawei.openalliance.ad.ppskit.utils.d0.m(getContext())) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            hashMap.put("is_allow_gp_action", str2);
        }
        return hashMap;
    }

    public final void s() {
        ua.a aVar = this.A;
        if (aVar != null) {
            d2.c(new b(), this.f23208w0, aVar.d());
        }
    }

    public void setOnCloseListener(e eVar) {
        this.S = eVar;
    }

    public final void t(int i10, boolean z10) {
        String B;
        TextView textView = this.Q;
        if (textView == null) {
            return;
        }
        if (z10) {
            int i11 = (this.f23198m0 / 1000) - i10;
            if (i11 < 0) {
                i11 = 0;
            }
            if (i11 == 0) {
                textView.setVisibility(8);
            }
            B = B(i11, z10);
        } else {
            B = B(i10, z10);
        }
        this.Q.setText(B);
    }

    public final void u(Context context, int i10, int i11) {
        View.inflate(context, i10, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.interstitial_content_view);
        this.N = viewGroup;
        viewGroup.setBackgroundColor(getResources().getColor(i11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0246, code lost:
    
        if (r13 > r12) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0249, code lost:
    
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x027f, code lost:
    
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x027c, code lost:
    
        if (r13 > r12) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(android.content.Context r12, com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r13) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.PPSInterstitialView.v(android.content.Context, com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord):void");
    }

    public final void w(ContentRecord contentRecord, String str, String str2) {
        int i10;
        AdContentData adContentData;
        MetaData c10;
        ImageView imageView;
        int i11;
        eb ebVar = this.f23209x;
        this.f23211z = contentRecord;
        this.B = str;
        this.C = str2;
        try {
            v(this.f23203r0, contentRecord);
            gc gcVar = this.T;
            if (gcVar != null) {
                gcVar.y = this.N;
            }
            AdContentData f = AdContentData.f(getContext(), contentRecord);
            setAdInfoWrapper(f);
            com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(this.f23203r0);
            synchronized (d10.f22585a) {
                i10 = d10.G(str).getInt("ite_ad_close_tm", 3);
                if (i10 < 0) {
                    i10 = 3;
                }
            }
            this.y = i10;
            if (f != null && f.k() != null) {
                ebVar.b(getContext(), f, this);
                ebVar.f31128u = false;
                ebVar.b();
                z(ebVar, contentRecord);
            }
            if (com.huawei.openalliance.ad.ppskit.handlers.l.d(this.f23203r0).B(this.B) == 1 && (imageView = this.L) != null && (i11 = this.F) != 3 && i11 != 4 && i11 != 5) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                this.L.setLayoutParams(layoutParams);
            }
            androidx.activity.n.W(this.O);
            ua.a aVar = this.A;
            if (aVar.f35817k == null && (c10 = aVar.c()) != null) {
                aVar.f35817k = c10.C();
            }
            AdSource a10 = AdSource.a(aVar.f35817k);
            PPSLabelView pPSLabelView = this.P;
            ua.a aVar2 = this.A;
            if (aVar2.f35818l == null && (adContentData = aVar2.f35809b) != null) {
                aVar2.f35818l = adContentData.b();
            }
            String str3 = aVar2.f35818l;
            pPSLabelView.getClass();
            if (a10 != null && !TextUtils.isEmpty(str3)) {
                pPSLabelView.c(a10, str3);
                return;
            }
            n7.e("PPSLabelView", "setTextWithDspInfo, use default adSign");
        } catch (RuntimeException | Exception unused) {
            n7.i("PPSInterstitialView", "refresh ui error");
        }
    }

    public final void x(Integer num) {
        InteractionType k10;
        eb ebVar = this.f23209x;
        if (ebVar != null && num != null) {
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue == 3 && !this.f23197l0) {
                    hb hbVar = ebVar.f31126s;
                    if (hbVar instanceof ib) {
                        ((ib) hbVar).F();
                    }
                    ebVar.d();
                    return;
                }
                return;
            }
            boolean z10 = vb.f31997t;
            hb hbVar2 = ebVar.f31126s;
            if (hbVar2 instanceof ib) {
                ib ibVar = (ib) hbVar2;
                ibVar.getClass();
                if (vb.f31997t && (k10 = vb.k()) != null) {
                    ibVar.t(k10);
                }
            }
        }
    }

    public final void y(Long l10, Integer num, Integer num2) {
        gc gcVar;
        CtrlExt ctrlExt;
        boolean equals;
        boolean z10;
        String str;
        ua.a aVar = this.A;
        if (aVar != null) {
            String str2 = null;
            AdContentData adContentData = aVar.f35809b;
            if (adContentData != null) {
                ctrlExt = adContentData.r();
            } else {
                ctrlExt = null;
            }
            if (ctrlExt == null) {
                equals = false;
            } else {
                equals = "1".equals(ctrlExt.a());
            }
            if (equals && a0.a.d0(num2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            ua.a aVar2 = this.A;
            if (aVar2.f35815i && (!z10 || aVar2.f35816j)) {
                return;
            }
            gc gcVar2 = this.T;
            if (gcVar2 != null) {
                long longValue = l10.longValue();
                int intValue = num.intValue();
                String o = gcVar2.o();
                ua.a aVar3 = gcVar2.f31214x;
                if (aVar3 != null) {
                    Object[] objArr = new Object[3];
                    AdContentData adContentData2 = aVar3.f35809b;
                    if (adContentData2 != null) {
                        str = adContentData2.A();
                    } else {
                        str = null;
                    }
                    objArr[0] = str;
                    AdContentData adContentData3 = gcVar2.f31214x.f35809b;
                    if (adContentData3 != null) {
                        str2 = adContentData3.B();
                    }
                    objArr[1] = str2;
                    objArr[2] = o;
                    n7.c("InterstitialAdPresenter", "slotId: %s, contentId: %s, slot pos: %s", objArr);
                }
                androidx.activity.n.H(gcVar2.f31213w, (ContentRecord) gcVar2.f32660t, Long.valueOf(longValue), Integer.valueOf(intValue), num2, "", o);
            }
            if (z10) {
                this.A.f35816j = true;
            }
            ua.a aVar4 = this.A;
            if (aVar4.f35815i) {
                return;
            }
            aVar4.f35815i = true;
            eb ebVar = this.f23209x;
            if (ebVar != null) {
                ebVar.f();
            }
        }
        if (num2 != null && num2.intValue() == 3 && (gcVar = this.T) != null) {
            ContentRecord contentRecord = (ContentRecord) gcVar.f32660t;
            Boolean bool = Boolean.TRUE;
            AdEventReport y = androidx.activity.n.y(contentRecord);
            y.H(0);
            y.O(0);
            y.I(bool);
            androidx.activity.n.P(gcVar.f31213w, com.huawei.openalliance.ad.constant.s.C, y);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r5 != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(ka.eb r5, com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r6) {
        /*
            r4 = this;
            com.huawei.openalliance.ad.ppskit.views.InterstitialVideoView r0 = r4.D
            if (r0 == 0) goto L76
            com.huawei.openalliance.ad.ppskit.beans.metadata.VideoInfo r0 = r6.h0()
            if (r0 == 0) goto L76
            com.huawei.openalliance.ad.ppskit.views.InterstitialVideoView r6 = r4.D
            r6.H = r5
            ua.a r5 = r6.A
            r0 = 0
            if (r5 == 0) goto L6a
            com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo r5 = r5.b()
            if (r5 != 0) goto L1a
            goto L6a
        L1a:
            android.content.Context r5 = r6.getContext()
            boolean r5 = com.huawei.openalliance.ad.ppskit.utils.k1.g(r5)
            if (r5 != 0) goto L25
            goto L6a
        L25:
            android.content.Context r5 = r6.getContext()
            boolean r5 = com.huawei.openalliance.ad.ppskit.utils.k1.c(r5)
            r1 = 1
            if (r5 == 0) goto L31
            goto L69
        L31:
            android.content.Context r5 = r6.getContext()
            java.lang.String r2 = "insre"
            ka.d5 r5 = ka.y4.a(r5, r2)
            ua.a r2 = r6.A
            com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo r2 = r2.b()
            java.lang.String r2 = r2.getVideoDownloadUrl()
            boolean r2 = com.huawei.openalliance.ad.ppskit.utils.y1.t(r2)
            if (r2 == 0) goto L66
            android.content.Context r2 = r6.getContext()
            ua.a r3 = r6.A
            com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo r3 = r3.b()
            java.lang.String r3 = r3.getVideoDownloadUrl()
            java.lang.String r5 = r5.j(r2, r3)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L64
            goto L66
        L64:
            r5 = r0
            goto L67
        L66:
            r5 = r1
        L67:
            if (r5 == 0) goto L6a
        L69:
            r0 = r1
        L6a:
            boolean r5 = ka.wb.f32132t
            ka.xb r5 = ka.xb.a(r0)
            ka.eb r6 = r6.H
            r6.c(r5)
            goto La2
        L76:
            android.widget.ImageView r0 = r4.L
            if (r0 == 0) goto La2
            java.lang.String r6 = r6.m3()
            boolean r6 = com.huawei.openalliance.ad.ppskit.utils.y1.h(r6)
            if (r6 != 0) goto La2
            r5.getClass()
            java.lang.String r6 = "OmPresent"
            java.lang.String r0 = "load"
            ka.n7.e(r6, r0)
            boolean r6 = r5.f31128u
            if (r6 != 0) goto L97
            boolean r6 = r5.f31130w
            if (r6 == 0) goto L97
            goto La2
        L97:
            ka.hb r5 = r5.f31126s
            boolean r6 = r5 instanceof ka.gb
            if (r6 == 0) goto La2
            ka.gb r5 = (ka.gb) r5
            r5.j()
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.PPSInterstitialView.z(ka.eb, com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord):void");
    }

    @Override // ka.g9
    public final void a(int i10) {
        n7.c("PPSInterstitialView", "onDurationReady %s", Integer.valueOf(i10));
        if (i10 > 0) {
            this.f23198m0 = i10;
        }
    }

    @Override // ka.g9
    public final void b(int i10) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if ((r0 != null ? r0.O() : 0) == 4) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // ka.m9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r6, int r8) {
        /*
            r5 = this;
            java.lang.String r0 = r5.f23208w0
            com.huawei.openalliance.ad.ppskit.utils.d2.d(r0)
            boolean r0 = r5.f23200o0
            if (r0 == 0) goto L43
            ua.a r0 = r5.A
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1e
            com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData r0 = r0.f35809b
            if (r0 == 0) goto L18
            int r0 = r0.O()
            goto L19
        L18:
            r0 = r2
        L19:
            r3 = 2
            if (r0 != r3) goto L1e
            r0 = r1
            goto L1f
        L1e:
            r0 = r2
        L1f:
            if (r0 != 0) goto L36
            ua.a r0 = r5.A
            if (r0 == 0) goto L33
            com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData r0 = r0.f35809b
            if (r0 == 0) goto L2e
            int r0 = r0.O()
            goto L2f
        L2e:
            r0 = r2
        L2f:
            r3 = 4
            if (r0 != r3) goto L33
            goto L34
        L33:
            r1 = r2
        L34:
            if (r1 == 0) goto L43
        L36:
            ka.m9 r0 = r5.f23206u0
            if (r0 == 0) goto L43
            long r1 = r5.f23199n0
            long r3 = r0.G
            long r1 = r1 - r3
            long r6 = r6 - r1
            r5.E(r8, r6)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.PPSInterstitialView.a(long, int):void");
    }

    @Override // ka.m9.a
    public final void b(long j10, int i10) {
        d2.d(this.f23208w0);
        if (!this.f23196k0) {
            this.f23196k0 = true;
            gc gcVar = this.T;
            if (gcVar != null) {
                androidx.activity.n.M(gcVar.f31213w, (ContentRecord) gcVar.f32660t, true, Long.valueOf(j10), Integer.valueOf(i10), null, null, null);
            }
        }
        g();
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.VideoView.n
    public final void l() {
    }

    @Override // ka.k9
    public final void b(String str, int i10) {
        D(i10);
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.VideoView.n
    public final void b(boolean z10) {
        this.f23190e0 = !z10;
        if (z10 || !L() || K()) {
            return;
        }
        g();
        d2.a(new u(this));
    }

    @Override // ka.k9
    public final void a(String str, int i10) {
        int i11;
        boolean z10 = this.f23192g0;
        if (!z10 && this.f23191f0 < 0) {
            this.f23191f0 = i10;
            this.f23192g0 = true;
        } else if (z10 && (i11 = this.f23191f0) >= 0) {
            long j10 = i10 - i11;
            m9 m9Var = this.f23206u0;
            if (m9Var != null) {
                E(m9Var.H, this.f23194i0 + j10);
            }
            gc gcVar = this.T;
            if (gcVar != null) {
                gcVar.j(this.f23203r0, i10, this.f23198m0);
            }
        }
        int i12 = this.f23198m0;
        if (i10 > i12 && i12 > 0) {
            i10 = i12;
        }
        int i13 = i10 / 1000;
        if (this.y * 1000 >= i12) {
            this.y = i12 / 1000;
        }
        int i14 = this.y - i13;
        if (i14 > 0) {
            t(i14, false);
        } else {
            ImageView imageView = this.K;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            t(i13, true);
        }
        if (i10 >= this.f23198m0) {
            this.f23194i0 += i10 - this.f23191f0;
            InterstitialVideoView interstitialVideoView = this.D;
            if (interstitialVideoView != null) {
                interstitialVideoView.B.A.g(0, 0);
                interstitialVideoView.r(i10, true);
            }
            TextView textView = this.Q;
            if (textView != null) {
                textView.setVisibility(8);
            }
            n7.e("PPSInterstitialView", "check end");
            k(i10, str);
        }
    }

    @Override // ka.db
    public View getOpenMeasureView() {
        return this;
    }
}
