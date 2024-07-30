package com.huawei.openalliance.ad.ppskit.views;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.activity.PPSRewardActivity;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdSource;
import com.huawei.openalliance.ad.ppskit.beans.metadata.CtrlExt;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.download.app.AppStatus;
import com.huawei.openalliance.ad.ppskit.download.local.AppLocalDownloadTask;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.inter.data.ImageInfo;
import com.huawei.openalliance.ad.ppskit.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.e2;
import com.huawei.openalliance.ad.ppskit.utils.i2;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.v;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import com.huawei.openalliance.ad.ppskit.views.VideoView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import ka.aj;
import ka.cj;
import ka.d5;
import ka.db;
import ka.eb;
import ka.hb;
import ka.i9;
import ka.ib;
import ka.jj;
import ka.k9;
import ka.ke;
import ka.m9;
import ka.n7;
import ka.oc;
import ka.pc;
import ka.qc;
import ka.r8;
import ka.y4;
import ka.zh;

/* loaded from: classes2.dex */
public class PPSRewardView extends AutoScaleSizeRelativeLayout implements xa.a, k9, m9.a, db, aj, cj {
    public static final eb T0 = new eb();
    public m9 A;
    public boolean A0;
    public ua.b B;
    public int B0;
    public ContentRecord C;
    public int C0;
    public RewardVideoView D;
    public int D0;
    public TextView E;
    public int E0;
    public ImageView F;
    public int F0;
    public ImageView G;
    public long G0;
    public ViewGroup H;
    public com.huawei.openalliance.ad.ppskit.utils.q0 H0;
    public PPSAppDetailTemplateView I;
    public va.d I0;
    public TextView J;
    public va.b J0;
    public RelativeLayout K;
    public com.huawei.openalliance.ad.ppskit.utils.p0 K0;
    public LinearLayout L;
    public VideoInfo L0;
    public AlertDialog M;
    public MaterialClickInfo M0;
    public PPSRewardWebView N;
    public boolean N0;
    public Dialog O;
    public boolean O0;
    public Dialog P;
    public final d P0;
    public PPSAppDetailView Q;
    public final b Q0;
    public PPSAppDetailView R;
    public final g R0;
    public PPSExpandButtonDetailView S;
    public final i S0;
    public PPSRewardEndCardView T;
    public TextView U;
    public PPSLabelView V;
    public ChoicesView W;

    /* renamed from: c0, reason: collision with root package name */
    public ProgressBar f23247c0;

    /* renamed from: d0, reason: collision with root package name */
    public LinearLayout f23248d0;

    /* renamed from: e0, reason: collision with root package name */
    public PPSRewardPopUpView f23249e0;

    /* renamed from: f0, reason: collision with root package name */
    public MaskingView f23250f0;

    /* renamed from: g0, reason: collision with root package name */
    public PPSRewardPopUpView f23251g0;

    /* renamed from: h0, reason: collision with root package name */
    public TextView f23252h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f23253i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f23254j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f23255k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f23256l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f23257m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f23258n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f23259o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f23260p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f23261q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f23262r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f23263s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f23264t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f23265u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f23266v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f23267w0;

    /* renamed from: x, reason: collision with root package name */
    public Context f23268x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f23269x0;
    public oc y;
    public boolean y0;

    /* renamed from: z, reason: collision with root package name */
    public va.e f23270z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f23271z0;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            n7.e("PPSRewardView", "pauseView");
            PPSRewardView pPSRewardView = PPSRewardView.this;
            RewardVideoView rewardVideoView = pPSRewardView.D;
            if (rewardVideoView != null) {
                rewardVideoView.y();
                pPSRewardView.D.H.c();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            eb ebVar = PPSRewardView.T0;
            PPSRewardView.this.z();
        }
    }

    /* loaded from: classes2.dex */
    public class d implements i9 {
        public d() {
        }

        @Override // ka.i9
        public final void a() {
            PPSRewardView pPSRewardView = PPSRewardView.this;
            pPSRewardView.f23263s0 = true;
            pPSRewardView.t();
        }

        @Override // ka.i9
        public final void b() {
            PPSRewardView pPSRewardView = PPSRewardView.this;
            pPSRewardView.f23263s0 = false;
            pPSRewardView.t();
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            eb ebVar = PPSRewardView.T0;
            PPSRewardView pPSRewardView = PPSRewardView.this;
            pPSRewardView.u();
            if (pPSRewardView.F0 >= pPSRewardView.B0 / 1000) {
                pPSRewardView.y();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            eb ebVar = PPSRewardView.T0;
            PPSRewardView.this.z();
        }
    }

    /* loaded from: classes2.dex */
    public class g implements ta.b {
        public g() {
        }

        @Override // ta.b
        public final void a(AppLocalDownloadTask appLocalDownloadTask) {
            PPSRewardView.T(PPSRewardView.this);
        }

        @Override // ta.b
        public final void b(AppLocalDownloadTask appLocalDownloadTask) {
            n7.e("PPSRewardView", "onStatusChanged");
            PPSRewardView pPSRewardView = PPSRewardView.this;
            if (appLocalDownloadTask != null) {
                int status = appLocalDownloadTask.getStatus();
                n7.e("PPSRewardView", "status:" + status);
                if (2 == status) {
                    eb ebVar = PPSRewardView.T0;
                    pPSRewardView.Q("3");
                }
            }
            PPSRewardView.T(pPSRewardView);
        }

        @Override // ta.b
        public final void a(String str) {
        }

        @Override // ta.b
        public final void b(String str) {
            PPSRewardView.T(PPSRewardView.this);
        }

        @Override // ta.b
        public final void c(String str) {
        }
    }

    /* loaded from: classes2.dex */
    public class h {
    }

    /* loaded from: classes2.dex */
    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int id2 = view.getId();
            PPSRewardView pPSRewardView = PPSRewardView.this;
            if (R.id.reward_close == id2) {
                PPSRewardView.P(pPSRewardView, true);
                return;
            }
            if (R.id.reward_mute_icon == view.getId()) {
                if (pPSRewardView.f23263s0) {
                    pPSRewardView.getClass();
                    d2.a(new w0(pPSRewardView));
                } else {
                    pPSRewardView.getClass();
                    d2.a(new v0(pPSRewardView));
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            n7.e("PPSRewardView", "resumeView");
            PPSRewardView pPSRewardView = PPSRewardView.this;
            if (!PPSRewardView.L(pPSRewardView, pPSRewardView.O) && !PPSRewardView.L(pPSRewardView, pPSRewardView.P) && !PPSRewardView.L(pPSRewardView, pPSRewardView.M)) {
                PPSRewardWebView pPSRewardWebView = pPSRewardView.N;
                if (pPSRewardWebView != null && pPSRewardWebView.getVisibility() == 0) {
                    str = "do not resume when landing page is showing";
                } else {
                    RewardVideoView rewardVideoView = pPSRewardView.D;
                    if (rewardVideoView != null && !pPSRewardView.f23256l0) {
                        n7.e("RewardVideoView", "resumeView");
                        VideoView videoView = rewardVideoView.H;
                        videoView.M = false;
                        videoView.setNeedPauseOnSurfaceDestory(true);
                        ua.b bVar = pPSRewardView.B;
                        if (bVar != null && bVar.f35824g) {
                            pPSRewardView.z();
                        }
                        if (pPSRewardView.f23257m0) {
                            pPSRewardView.D.v(true, pPSRewardView.f23263s0);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                str = "do not resume when dialog is showing";
            }
            n7.e("PPSRewardView", str);
        }
    }

    /* loaded from: classes2.dex */
    public static class k implements DialogInterface.OnCancelListener {

        /* renamed from: s, reason: collision with root package name */
        public final WeakReference<PPSRewardView> f23281s;

        public k(PPSRewardView pPSRewardView) {
            this.f23281s = new WeakReference<>(pPSRewardView);
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            PPSRewardView pPSRewardView = this.f23281s.get();
            if (pPSRewardView != null) {
                pPSRewardView.X();
                pPSRewardView.b("130");
                pPSRewardView.M = null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class l implements v.d {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<PPSRewardView> f23282a;

        public l(PPSRewardView pPSRewardView) {
            this.f23282a = new WeakReference<>(pPSRewardView);
        }

        @Override // com.huawei.openalliance.ad.ppskit.utils.v.d
        public final void a() {
            PPSRewardView pPSRewardView = this.f23282a.get();
            if (pPSRewardView != null) {
                pPSRewardView.O = null;
                pPSRewardView.X();
            }
        }

        @Override // com.huawei.openalliance.ad.ppskit.utils.v.d
        public final void b() {
            PPSRewardView pPSRewardView = this.f23282a.get();
            if (pPSRewardView != null) {
                pPSRewardView.O = null;
                if (pPSRewardView.f23258n0) {
                    pPSRewardView.J(3);
                }
                hb hbVar = PPSRewardView.T0.f31126s;
                if (hbVar instanceof ib) {
                    ((ib) hbVar).F();
                }
                pPSRewardView.s();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class m implements DialogInterface.OnCancelListener {

        /* renamed from: s, reason: collision with root package name */
        public final WeakReference<PPSRewardView> f23283s;

        public m(PPSRewardView pPSRewardView) {
            this.f23283s = new WeakReference<>(pPSRewardView);
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            PPSRewardView pPSRewardView = this.f23283s.get();
            if (pPSRewardView != null) {
                pPSRewardView.O = null;
                pPSRewardView.X();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class n implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final WeakReference<PPSRewardView> f23284s;

        public n(PPSRewardView pPSRewardView) {
            this.f23284s = new WeakReference<>(pPSRewardView);
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppDownloadButton appDownloadButton;
            PPSRewardView pPSRewardView = this.f23284s.get();
            if (pPSRewardView != null && !pPSRewardView.O0 && (appDownloadButton = pPSRewardView.Q.getAppDownloadButton()) != null && !appDownloadButton.f23091i0) {
                if ((!i2.h(pPSRewardView.C) || !pPSRewardView.f23260p0) && !pPSRewardView.y0 && appDownloadButton.getStatus() == AppStatus.DOWNLOAD) {
                    pPSRewardView.y0 = true;
                    if (pPSRewardView.H0 != null) {
                        pPSRewardView.O0 = true;
                    }
                    if (pPSRewardView.f23251g0 == null) {
                        PPSRewardPopUpView pPSRewardPopUpView = new PPSRewardPopUpView(pPSRewardView.getContext());
                        pPSRewardView.f23251g0 = pPSRewardPopUpView;
                        pPSRewardPopUpView.setPopUpClickListener(new n0(pPSRewardView));
                        pPSRewardView.f23251g0.getDialog().setOnCancelListener(new o0(pPSRewardView));
                    }
                    pPSRewardView.f23251g0.setAdPopupData(pPSRewardView.C);
                    pPSRewardView.f23251g0.a();
                    oc ocVar = pPSRewardView.y;
                    if (ocVar != null) {
                        ocVar.s("127");
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class o implements v.d {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<PPSRewardView> f23285a;

        public o(PPSRewardView pPSRewardView) {
            this.f23285a = new WeakReference<>(pPSRewardView);
        }

        @Override // com.huawei.openalliance.ad.ppskit.utils.v.d
        public final void a() {
            PPSRewardView pPSRewardView = this.f23285a.get();
            if (pPSRewardView != null) {
                pPSRewardView.P = null;
                pPSRewardView.f23257m0 = true;
                pPSRewardView.f23266v0 = false;
                RewardVideoView rewardVideoView = pPSRewardView.D;
                rewardVideoView.getClass();
                n7.e("RewardVideoView", "resumeView");
                VideoView videoView = rewardVideoView.H;
                videoView.M = false;
                videoView.setNeedPauseOnSurfaceDestory(true);
                pPSRewardView.D.g();
                pPSRewardView.D.v(true, pPSRewardView.f23263s0);
            }
        }

        @Override // com.huawei.openalliance.ad.ppskit.utils.v.d
        public final void b() {
            PPSRewardView pPSRewardView = this.f23285a.get();
            if (pPSRewardView != null) {
                pPSRewardView.P = null;
                pPSRewardView.f23257m0 = true;
                pPSRewardView.s();
            }
        }
    }

    public PPSRewardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String str;
        this.M = null;
        this.f23253i0 = false;
        this.f23254j0 = false;
        this.f23255k0 = false;
        this.f23256l0 = false;
        this.f23257m0 = true;
        this.f23258n0 = false;
        this.f23259o0 = false;
        this.f23260p0 = false;
        this.f23261q0 = false;
        this.f23262r0 = false;
        this.f23263s0 = true;
        this.f23264t0 = false;
        this.f23265u0 = true;
        this.f23266v0 = true;
        this.f23267w0 = true;
        this.f23269x0 = false;
        this.y0 = false;
        this.f23271z0 = false;
        this.A0 = true;
        this.C0 = 1;
        this.E0 = -1;
        this.F0 = 0;
        this.G0 = -1L;
        this.N0 = false;
        this.O0 = false;
        this.P0 = new d();
        this.Q0 = new b();
        this.R0 = new g();
        new h();
        this.S0 = new i();
        try {
            this.f23268x = context.getApplicationContext();
            this.y = new oc(context, this);
            this.A = new m9(this, this);
        } catch (RuntimeException unused) {
            str = "init RuntimeException";
            n7.g("PPSRewardView", str);
        } catch (Exception unused2) {
            str = "init error";
            n7.g("PPSRewardView", str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A(com.huawei.openalliance.ad.ppskit.views.PPSRewardView r5) {
        /*
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            android.content.Context r2 = r5.f23268x
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r3 = r5.C
            boolean r2 = com.huawei.openalliance.ad.ppskit.utils.i2.g(r2, r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "PPSRewardView"
            java.lang.String r4 = "handleMaskingClick, isDownloadAd: %s"
            ka.n7.f(r2, r4, r1)
            r1 = 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.J(r1)
            android.content.Context r1 = r5.f23268x
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r2 = r5.C
            boolean r1 = com.huawei.openalliance.ad.ppskit.utils.i2.g(r1, r2)
            r2 = 22
            if (r1 == 0) goto L66
            ua.b r1 = r5.B
            if (r1 != 0) goto L34
            r1 = r3
            goto L3c
        L34:
            int r1 = r1.b()
            boolean r1 = a0.a.s0(r1)
        L3c:
            if (r1 != 0) goto L3f
            goto L55
        L3f:
            com.huawei.openalliance.ad.ppskit.views.PPSAppDetailView r1 = r5.Q
            if (r1 != 0) goto L44
            goto L55
        L44:
            com.huawei.openalliance.ad.ppskit.views.AppDownloadButton r1 = r1.getAppDownloadButton()
            if (r1 != 0) goto L4b
            goto L55
        L4b:
            com.huawei.openalliance.ad.ppskit.download.app.AppStatus r4 = com.huawei.openalliance.ad.ppskit.download.app.AppStatus.INSTALLED
            com.huawei.openalliance.ad.ppskit.download.app.AppStatus r1 = r1.l()
            if (r4 != r1) goto L55
            r1 = r0
            goto L56
        L55:
            r1 = r3
        L56:
            if (r1 == 0) goto L59
            goto L66
        L59:
            r5.b(r0)
            ka.oc r0 = r5.y
            if (r0 == 0) goto L6f
            com.huawei.openalliance.ad.ppskit.inter.data.MaterialClickInfo r1 = r5.M0
            r0.q(r2, r1)
            goto L6f
        L66:
            ka.oc r0 = r5.y
            if (r0 == 0) goto L6f
            com.huawei.openalliance.ad.ppskit.inter.data.MaterialClickInfo r1 = r5.M0
            r0.p(r2, r1)
        L6f:
            com.huawei.openalliance.ad.ppskit.views.MaskingView r0 = r5.f23250f0
            r1 = 8
            if (r0 == 0) goto L99
            android.view.animation.Animation r2 = r0.f23131t
            if (r2 == 0) goto L7c
            r2.cancel()
        L7c:
            android.view.animation.Animation r2 = r0.f23130s
            if (r2 == 0) goto L83
            r2.cancel()
        L83:
            android.view.animation.Animation r2 = r0.f23133v
            if (r2 == 0) goto L8a
            r2.cancel()
        L8a:
            android.view.animation.Animation r2 = r0.f23132u
            if (r2 == 0) goto L91
            r2.cancel()
        L91:
            r0.setVisibility(r1)
            com.huawei.openalliance.ad.ppskit.views.MaskingView r0 = r5.f23250f0
            r5.removeView(r0)
        L99:
            com.huawei.openalliance.ad.ppskit.views.PPSRewardEndCardView r0 = r5.T
            if (r0 == 0) goto La4
            android.view.View r0 = r0.y
            if (r0 == 0) goto La4
            r0.setVisibility(r1)
        La4:
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r0 = r5.C
            boolean r0 = com.huawei.openalliance.ad.ppskit.utils.i2.h(r0)
            if (r0 != 0) goto Laf
            r5.setBottomViewVisibility(r3)
        Laf:
            r5.f23259o0 = r3
            r5.f23267w0 = r3
            r0 = 0
            r5.M0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.PPSRewardView.A(com.huawei.openalliance.ad.ppskit.views.PPSRewardView):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ed, code lost:
    
        if (r2 > r0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0225, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0222, code lost:
    
        if (r2 > r0) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02dc A[Catch: all -> 0x0306, TRY_LEAVE, TryCatch #0 {all -> 0x0306, blocks: (B:62:0x02c2, B:64:0x02d0, B:70:0x02dc), top: B:61:0x02c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void F(com.huawei.openalliance.ad.ppskit.views.PPSRewardView r12, android.content.Context r13, com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r14) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.PPSRewardView.F(com.huawei.openalliance.ad.ppskit.views.PPSRewardView, android.content.Context, com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord):void");
    }

    public static void G(PPSRewardView pPSRewardView, String str, String str2) {
        String str3;
        boolean z10;
        PPSAppDetailView pPSAppDetailView;
        boolean z11;
        ContentRecord contentRecord;
        AdContentData adContentData;
        MetaData g6;
        int i10;
        MetaData g10;
        Object obj;
        MetaData g11;
        AppDownloadButton appDownloadButton;
        MetaData g12;
        int i11;
        n7.e("PPSRewardView", "initContentView, interactionType:" + pPSRewardView.B.b());
        if (pPSRewardView.S(pPSRewardView.C) && ((i11 = pPSRewardView.D0) == 4 || i11 == 5)) {
            PPSExpandButtonDetailView pPSExpandButtonDetailView = pPSRewardView.S;
            pPSRewardView.Q = pPSExpandButtonDetailView;
            pPSExpandButtonDetailView.setExtraViewVisibility(8);
        } else {
            AdContentData adContentData2 = pPSRewardView.B.f35820b;
            if (adContentData2 != null) {
                str3 = adContentData2.c();
            } else {
                str3 = null;
            }
            if (androidx.transition.n.X(str3) != 2 && !com.huawei.openalliance.ad.ppskit.utils.d0.v(pPSRewardView.f23268x)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                pPSAppDetailView = pPSRewardView.S;
            } else {
                pPSAppDetailView = pPSRewardView.R;
            }
            pPSRewardView.Q = pPSAppDetailView;
            pPSAppDetailView.setBackgroundColor(pPSRewardView.getResources().getColor(R.color.hiad_90_percent_white));
        }
        pPSRewardView.Q.setVisibility(0);
        pPSRewardView.f23263s0 = pPSRewardView.B.f35837u;
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(pPSRewardView.f23268x);
        synchronized (d10.f22585a) {
            Map<String, String> K = d10.K(str, true);
            if (K != null) {
                if (!TextUtils.equals(K.get("preloadDetail"), "0")) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = true;
            }
        }
        pPSRewardView.A0 = z11;
        if (i2.h(pPSRewardView.C) || pPSRewardView.r()) {
            pPSRewardView.A0 = false;
        }
        if (pPSRewardView.r()) {
            ((RelativeLayout.LayoutParams) pPSRewardView.K.getLayoutParams()).addRule(2, R.id.reward_download_container);
        }
        pPSRewardView.t();
        PPSRewardWebView pPSRewardWebView = pPSRewardView.N;
        if (pPSRewardWebView != null) {
            pPSRewardWebView.setVisibility(8);
            pPSRewardView.N.setAdLandingPageData(pPSRewardView.C);
            pPSRewardView.getContext();
            pPSRewardView.Q.getAppDownloadButton();
            PPSRewardWebView pPSRewardWebView2 = pPSRewardView.N;
            com.huawei.openalliance.ad.ppskit.utils.q0 q0Var = new com.huawei.openalliance.ad.ppskit.utils.q0();
            pPSRewardView.H0 = q0Var;
            pPSRewardWebView2.a(q0Var, "HwPPS");
            pPSRewardView.N.a(new com.huawei.openalliance.ad.ppskit.utils.j0(pPSRewardView.getContext(), pPSRewardView.C), "HwLandingPage");
            com.huawei.openalliance.ad.ppskit.utils.p0 p0Var = new com.huawei.openalliance.ad.ppskit.utils.p0(pPSRewardView.getContext(), str, pPSRewardView.C, pPSRewardView.N);
            pPSRewardView.K0 = p0Var;
            pPSRewardView.N.a(p0Var, "HwPPSAppoint");
            if (i2.g(pPSRewardView.f23268x, pPSRewardView.C) && pPSRewardView.A0) {
                pPSRewardView.N.q();
                pPSRewardView.f23261q0 = true;
            }
            if (pPSRewardView.N.getAppDownloadButton() != null) {
                pPSRewardView.N.getAppDownloadButton().setCallerPackageName(str);
                pPSRewardView.N.getAppDownloadButton().setSdkVersion(str2);
            }
        }
        if (!a0.a.s0(pPSRewardView.B.b())) {
            AppInfo appInfo = new AppInfo();
            appInfo.P(pPSRewardView.B.c());
            ua.b bVar = pPSRewardView.B;
            if (bVar.f35828k == null && (g12 = bVar.g()) != null) {
                bVar.f35828k = ua.b.e(g12.U());
            }
            ArrayList arrayList = bVar.f35828k;
            if (!androidx.transition.n.M(arrayList) && !TextUtils.isEmpty(((ImageInfo) arrayList.get(0)).getUrl())) {
                obj = arrayList.get(0);
            } else {
                ua.b bVar2 = pPSRewardView.B;
                if (bVar2.f35827j == null && (g11 = bVar2.g()) != null) {
                    bVar2.f35827j = ua.b.e(g11.h0());
                }
                ArrayList arrayList2 = bVar2.f35827j;
                if (!androidx.transition.n.M(arrayList2)) {
                    obj = arrayList2.get(0);
                }
                pPSRewardView.Q.setAppRelated(false);
                pPSRewardView.C.E0(appInfo);
                pPSRewardView.f23269x0 = true;
                if (pPSRewardView.B.b() == 0 && (appDownloadButton = pPSRewardView.Q.f23141t) != null) {
                    appDownloadButton.setVisibility(8);
                }
            }
            appInfo.F(((ImageInfo) obj).getUrl());
            pPSRewardView.Q.setAppRelated(false);
            pPSRewardView.C.E0(appInfo);
            pPSRewardView.f23269x0 = true;
            if (pPSRewardView.B.b() == 0) {
                appDownloadButton.setVisibility(8);
            }
        } else {
            pPSRewardView.C.b();
            pPSRewardView.C.m5c();
            sa.b.q().s(pPSRewardView.B.i(), pPSRewardView.R0);
        }
        pPSRewardView.Q.setAppDetailClickListener(new n0(pPSRewardView));
        pPSRewardView.Q.setNeedPerBeforDownload(true);
        int i12 = pPSRewardView.D0;
        if (i12 == 1 || i12 == 3 || i12 == 4 || i12 == 5) {
            pPSRewardView.Q.setLoadAppIconSelf(false);
        }
        pPSRewardView.Q.setAdLandingData(pPSRewardView.C);
        pPSRewardView.Q.setInterType(pPSRewardView.B.b());
        TextView textView = pPSRewardView.U;
        ua.b bVar3 = pPSRewardView.B;
        if (bVar3.f35821c == null && (g10 = bVar3.g()) != null) {
            bVar3.f35821c = y1.p(g10.i());
        }
        String str4 = bVar3.f35821c;
        if (textView != null) {
            if (!TextUtils.isEmpty(str4)) {
                textView.setVisibility(0);
                textView.setText(str4);
            } else {
                textView.setVisibility(8);
            }
        }
        androidx.activity.n.W(pPSRewardView.f23248d0);
        if (pPSRewardView.Q.getAppDownloadButton() != null) {
            pPSRewardView.Q.getAppDownloadButton().setCallerPackageName(str);
            pPSRewardView.Q.getAppDownloadButton().setSdkVersion(str2);
        }
        AppInfo j02 = pPSRewardView.C.j0();
        if (j02 != null && !TextUtils.isEmpty(j02.getIconUrl()) && pPSRewardView.S(pPSRewardView.C) && ((i10 = pPSRewardView.D0) == 1 || i10 == 3 || i10 == 5)) {
            pPSRewardView.Q.d(new ImageView(pPSRewardView.getContext()), j02.getIconUrl(), new m0(pPSRewardView));
        }
        ua.b bVar4 = pPSRewardView.B;
        if (bVar4.f35822d == null && (g6 = bVar4.g()) != null) {
            bVar4.f35822d = g6.C();
        }
        AdSource a10 = AdSource.a(bVar4.f35822d);
        PPSLabelView pPSLabelView = pPSRewardView.V;
        ua.b bVar5 = pPSRewardView.B;
        if (bVar5.f35823e == null && (adContentData = bVar5.f35820b) != null) {
            bVar5.f35823e = adContentData.b();
        }
        String str5 = bVar5.f35823e;
        pPSLabelView.getClass();
        if (a10 != null && !TextUtils.isEmpty(str5)) {
            pPSLabelView.c(a10, str5);
        } else {
            n7.e("PPSLabelView", "setTextWithDspInfo, use default adSign");
        }
        if (z1.u() && (contentRecord = pPSRewardView.C) != null && "3".equalsIgnoreCase(contentRecord.f1())) {
            pPSRewardView.N0 = true;
        }
    }

    public static void H(PPSRewardView pPSRewardView, String str, boolean z10) {
        int i10;
        int i11;
        VideoInfo videoInfo;
        int i12;
        int i13;
        pPSRewardView.getClass();
        n7.e("PPSRewardView", "initVideoView");
        d5 a10 = y4.a(pPSRewardView.f23268x, "insre");
        String j10 = a10.j(pPSRewardView.getContext(), pPSRewardView.L0.getVideoDownloadUrl());
        String h10 = a10.h(pPSRewardView.getContext(), j10);
        if (n7.d()) {
            n7.c("PPSRewardView", "videourl: %s fileCachedUri: %s path: %s", y1.j(pPSRewardView.L0.getVideoDownloadUrl()), y1.j(j10), y1.j(h10));
        }
        if (com.huawei.openalliance.ad.ppskit.utils.x.q(h10)) {
            n7.e("PPSRewardView", "change path to local");
            pPSRewardView.L0.f22645s = h10;
            i10 = 0;
        } else {
            i10 = 1;
        }
        oc ocVar = pPSRewardView.y;
        if (ocVar != null) {
            ocVar.y.h(i10, pPSRewardView.C, str);
        }
        m9 m9Var = pPSRewardView.A;
        if (m9Var != null) {
            long h11 = pPSRewardView.B.h();
            MetaData g6 = pPSRewardView.B.g();
            if (g6 != null) {
                i13 = g6.d0();
            } else {
                i13 = 50;
            }
            m9Var.E = i13;
            m9Var.D = h11;
        }
        oc ocVar2 = pPSRewardView.y;
        if (ocVar2 != null) {
            ua.b bVar = pPSRewardView.B;
            ContentRecord contentRecord = pPSRewardView.C;
            ocVar2.f31608w = bVar;
            ocVar2.f32660t = contentRecord;
        }
        pPSRewardView.D.setAudioFocusType(pPSRewardView.B.f35833q);
        RewardVideoView rewardVideoView = pPSRewardView.D;
        rewardVideoView.f23323z.add(pPSRewardView);
        rewardVideoView.H.K.add(pPSRewardView);
        pPSRewardView.D.H.w(pPSRewardView.P0);
        ContentRecord contentRecord2 = pPSRewardView.C;
        pPSRewardView.D.setVideoScaleMode(1);
        pPSRewardView.D.setVideoBackgroundColor(pPSRewardView.getResources().getColor(R.color.hiad_black));
        pPSRewardView.D.setBackgroundColor(pPSRewardView.getResources().getColor(R.color.hiad_black));
        if (pPSRewardView.S(contentRecord2) && ((i12 = pPSRewardView.D0) == 3 || i12 == 4 || i12 == 5)) {
            pPSRewardView.D.setUnUseDefault(false);
            pPSRewardView.D.setAutoScaleResizeLayoutOnVideoSizeChange(true);
        } else {
            pPSRewardView.D.setAutoScaleResizeLayoutOnVideoSizeChange(false);
        }
        RewardVideoView rewardVideoView2 = pPSRewardView.D;
        ua.b bVar2 = pPSRewardView.B;
        ContentRecord contentRecord3 = pPSRewardView.C;
        r8 currentState = rewardVideoView2.H.getCurrentState();
        if (rewardVideoView2.f23322x == bVar2 && currentState.c(r8.b.IDLE) && currentState.c(r8.b.ERROR)) {
            n7.e("RewardVideoView", "setRewardVideoAd - has the same ad");
        } else {
            rewardVideoView2.D = 0L;
            rewardVideoView2.A = 0;
            rewardVideoView2.B = false;
            rewardVideoView2.f23322x = bVar2;
            rewardVideoView2.y = bVar2.a();
            rewardVideoView2.D = r2.getVideoDuration();
            rewardVideoView2.C = rewardVideoView2.y.getVideoDownloadUrl();
            n7.e("RewardVideoView", "set reward ad:" + bVar2.f());
            n7.e("RewardVideoView", "resetVideoView");
            rewardVideoView2.setPreferStartPlayTime(0);
            rewardVideoView2.I = false;
            rewardVideoView2.K = false;
            rewardVideoView2.L = true;
            rewardVideoView2.f23328f0 = false;
            rewardVideoView2.G.f32660t = contentRecord3;
            if (rewardVideoView2.f23322x != null) {
                n7.e("RewardVideoView", "loadVideoInfo");
                VideoInfo a11 = rewardVideoView2.f23322x.a();
                if (a11 != null) {
                    rewardVideoView2.J = a11;
                    Float videoRatio = a11.getVideoRatio();
                    if (videoRatio != null && rewardVideoView2.V) {
                        rewardVideoView2.setRatio(videoRatio);
                        rewardVideoView2.H.setRatio(videoRatio);
                    }
                    rewardVideoView2.H.setDefaultDuration(rewardVideoView2.J.getVideoDuration());
                    if (!rewardVideoView2.x()) {
                        qc qcVar = rewardVideoView2.G;
                        VideoInfo videoInfo2 = rewardVideoView2.J;
                        qcVar.getClass();
                        if (videoInfo2 != null) {
                            n7.e("RewardVideoViewPresenter", "checkVideoHash");
                            p2.d(new pc(qcVar, videoInfo2));
                        }
                    }
                    rewardVideoView2.K = false;
                    rewardVideoView2.L = true;
                }
                com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(rewardVideoView2.getContext().getApplicationContext());
                String str2 = rewardVideoView2.f23322x.f35832p;
                synchronized (d10.f22585a) {
                    Map<String, String> K = d10.K(str2, true);
                    i11 = 5000;
                    if (K != null) {
                        i11 = y1.l(5000, K.get("videoTimeout"));
                    }
                }
                rewardVideoView2.f23326d0 = i11;
            } else {
                rewardVideoView2.J = null;
            }
        }
        pPSRewardView.D.setVisibility(0);
        RewardVideoView rewardVideoView3 = pPSRewardView.D;
        b bVar3 = pPSRewardView.Q0;
        VideoView videoView = rewardVideoView3.H;
        if (bVar3 == null) {
            videoView.getClass();
        } else {
            videoView.D.add(bVar3);
        }
        pPSRewardView.B0 = (int) pPSRewardView.B.d();
        jj.a().f31354e.add(pPSRewardView);
        if (jj.a().f31351b == 0) {
            pPSRewardView.z();
        }
        int i14 = pPSRewardView.F0;
        if (i14 < 0) {
            pPSRewardView.F0 = i14 + 1;
            jj.a().b();
        }
        if (z10 && (videoInfo = pPSRewardView.L0) != null) {
            boolean Y = pPSRewardView.Y();
            if (!Y && !com.huawei.openalliance.ad.ppskit.utils.k1.e(pPSRewardView.getContext())) {
                if (!com.huawei.openalliance.ad.ppskit.utils.k1.g(pPSRewardView.getContext())) {
                    Toast makeText = Toast.makeText(pPSRewardView.getContext(), R.string.hiad_network_error, 0);
                    makeText.setGravity(17, 0, 0);
                    makeText.show();
                    return;
                } else {
                    n7.e("PPSRewardView", "video not cached, stop");
                    pPSRewardView.f23257m0 = false;
                    RewardVideoView rewardVideoView4 = pPSRewardView.D;
                    if (rewardVideoView4 != null) {
                        rewardVideoView4.H.b();
                    }
                    p2.a(new s0(pPSRewardView, videoInfo), 2);
                    return;
                }
            }
            n7.e("PPSRewardView", "video is cached or is wifi network");
            RewardVideoView rewardVideoView5 = pPSRewardView.D;
            if (rewardVideoView5 != null) {
                rewardVideoView5.g();
                if (Y) {
                    pPSRewardView.f23266v0 = false;
                }
                pPSRewardView.D.v(true, pPSRewardView.f23263s0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void I(com.huawei.openalliance.ad.ppskit.views.PPSRewardView r5, ka.wi r6) {
        /*
            r5.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onClick, isAppRelated:"
            r0.<init>(r1)
            boolean r1 = r6.f32147a
            r0.append(r1)
            java.lang.String r1 = ", isHandled:"
            r0.append(r1)
            boolean r1 = r6.f32148b
            r0.append(r1)
            java.lang.String r2 = ", destination:"
            r0.append(r2)
            java.lang.String r2 = r6.f32149c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "PPSRewardView"
            ka.n7.e(r3, r0)
            long r3 = java.lang.System.currentTimeMillis()
            a0.a.f12i0 = r3
            ua.b r0 = r5.B
            r0.getClass()
            java.lang.String r0 = "web"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L4a
            ua.b r0 = r5.B
            int r0 = r0.b()
            if (r0 == 0) goto L4a
            java.lang.String r0 = "2"
            goto L5c
        L4a:
            java.lang.String r0 = "app"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5a
            java.lang.String r0 = "harmonyService"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L5f
        L5a:
            java.lang.String r0 = "4"
        L5c:
            r5.Q(r0)
        L5f:
            va.d r0 = r5.I0
            if (r0 == 0) goto L6c
            com.huawei.openalliance.ad.ppskit.activity.PPSRewardActivity$l r0 = (com.huawei.openalliance.ad.ppskit.activity.PPSRewardActivity.l) r0
            r2 = 2
            r3 = -1
            com.huawei.openalliance.ad.ppskit.activity.PPSRewardActivity r0 = com.huawei.openalliance.ad.ppskit.activity.PPSRewardActivity.this
            com.huawei.openalliance.ad.ppskit.activity.PPSRewardActivity.l(r0, r2, r3, r3)
        L6c:
            ua.b r0 = r5.B
            if (r0 == 0) goto L8e
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            ua.b r2 = r5.B
            long r2 = r2.h()
            ka.m9 r4 = r5.A
            if (r4 == 0) goto L8e
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            ka.m9 r3 = r5.A
            int r3 = r3.H
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.K(r2, r3, r0)
        L8e:
            ka.eb r0 = com.huawei.openalliance.ad.ppskit.views.PPSRewardView.T0
            boolean r2 = ka.vb.f31997t
            ka.hb r0 = r0.f31126s
            boolean r2 = r0 instanceof ka.ib
            if (r2 == 0) goto Laa
            ka.ib r0 = (ka.ib) r0
            r0.getClass()
            boolean r2 = ka.vb.f31997t
            if (r2 == 0) goto Laa
            com.iab.omid.library.huawei.adsession.media.InteractionType r2 = ka.vb.k()
            if (r2 == 0) goto Laa
            r0.t(r2)
        Laa:
            if (r1 != 0) goto Lc4
            ka.oc r0 = r5.y
            if (r0 == 0) goto Lc4
            java.lang.Integer r6 = r6.f32150d
            if (r6 != 0) goto Lb9
            r6 = 7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
        Lb9:
            ka.oc r0 = r5.y
            int r6 = r6.intValue()
            com.huawei.openalliance.ad.ppskit.inter.data.MaterialClickInfo r5 = r5.M0
            r0.p(r6, r5)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.PPSRewardView.I(com.huawei.openalliance.ad.ppskit.views.PPSRewardView, ka.wi):void");
    }

    public static boolean L(PPSRewardView pPSRewardView, Dialog dialog) {
        pPSRewardView.getClass();
        if (dialog != null && dialog.isShowing()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void M(com.huawei.openalliance.ad.ppskit.views.PPSRewardView r8, java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.PPSRewardView.M(com.huawei.openalliance.ad.ppskit.views.PPSRewardView, java.lang.String, java.lang.String):void");
    }

    public static void O(PPSRewardView pPSRewardView, String str) {
        oc ocVar;
        boolean z10 = false;
        if (!i2.h(pPSRewardView.C)) {
            pPSRewardView.setBottomViewVisibility(0);
        }
        View view = pPSRewardView.T.y;
        if (view != null) {
            view.setVisibility(8);
        }
        pPSRewardView.f23259o0 = false;
        pPSRewardView.f23267w0 = false;
        pPSRewardView.v();
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(pPSRewardView.f23268x);
        synchronized (d10.f22585a) {
            Map<String, String> K = d10.K(str, true);
            if (K != null) {
                String str2 = K.get("rptEndCardClick");
                if (!TextUtils.equals(str2, "0") && TextUtils.equals(str2, "1")) {
                }
            }
            z10 = true;
        }
        if (z10 && pPSRewardView.x() && (ocVar = pPSRewardView.y) != null) {
            ocVar.q(20, pPSRewardView.M0);
            pPSRewardView.M0 = null;
        }
    }

    public static void P(PPSRewardView pPSRewardView, boolean z10) {
        WebView webView;
        ProgressBar progressBar;
        ua.b bVar;
        ImageView imageView;
        ((PPSRewardActivity) pPSRewardView.getContext()).setRequestedOrientation(pPSRewardView.C0);
        pPSRewardView.setAppDetailViewType(0);
        if (z10) {
            if (pPSRewardView.f23258n0) {
                pPSRewardView.J(3);
            }
        } else {
            if (pPSRewardView.f23253i0) {
                pPSRewardView.f23253i0 = false;
                RewardVideoView rewardVideoView = pPSRewardView.D;
                if (rewardVideoView != null) {
                    rewardVideoView.setVisibility(0);
                }
                pPSRewardView.w();
                PPSRewardWebView pPSRewardWebView = pPSRewardView.N;
                if (pPSRewardWebView != null) {
                    pPSRewardWebView.setVisibility(8);
                    pPSRewardView.f23260p0 = false;
                }
                if (!pPSRewardView.f23262r0 && (((bVar = pPSRewardView.B) == null || !bVar.f35824g) && (imageView = pPSRewardView.G) != null)) {
                    imageView.setVisibility(8);
                }
                if (!pPSRewardView.f23264t0 && !pPSRewardView.f23262r0 && (progressBar = pPSRewardView.f23247c0) != null) {
                    progressBar.setVisibility(0);
                }
                ImageView imageView2 = pPSRewardView.F;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                pPSRewardView.X();
                if (i2.h(pPSRewardView.C)) {
                    pPSRewardView.f23252h0.setVisibility(0);
                    WebView webView2 = pPSRewardView.N.getWebView();
                    if (webView2 != null) {
                        webView2.loadUrl(com.anythink.core.common.res.d.f6477a);
                    }
                }
                if (pPSRewardView.r() && (webView = pPSRewardView.N.getWebView()) != null) {
                    webView.loadUrl(com.anythink.core.common.res.d.f6477a);
                }
                pPSRewardView.setBottomViewVisibility(0);
                return;
            }
            if (com.huawei.openalliance.ad.ppskit.utils.k1.g(pPSRewardView.getContext()) || pPSRewardView.Y()) {
                if (pPSRewardView.B.f35824g) {
                    if (!pPSRewardView.f23260p0 && (pPSRewardView.f23267w0 || pPSRewardView.x())) {
                        pPSRewardView.W();
                        pPSRewardView.y();
                        return;
                    }
                } else {
                    if (i2.h(pPSRewardView.C) && pPSRewardView.f23260p0) {
                        PPSRewardWebView pPSRewardWebView2 = pPSRewardView.N;
                        if (pPSRewardWebView2 != null) {
                            pPSRewardWebView2.setVisibility(8);
                            pPSRewardView.f23260p0 = false;
                            WebView webView3 = pPSRewardView.N.getWebView();
                            if (webView3 != null) {
                                webView3.loadUrl(com.anythink.core.common.res.d.f6477a);
                            }
                        }
                        RewardVideoView rewardVideoView2 = pPSRewardView.D;
                        if (rewardVideoView2 != null) {
                            rewardVideoView2.setVisibility(0);
                        }
                        pPSRewardView.X();
                        pPSRewardView.F.setVisibility(0);
                        pPSRewardView.f23252h0.setVisibility(0);
                        pPSRewardView.setBottomViewVisibility(0);
                        pPSRewardView.w();
                        return;
                    }
                    pPSRewardView.W();
                    if (pPSRewardView.O == null) {
                        AlertDialog b10 = com.huawei.openalliance.ad.ppskit.utils.v.b(pPSRewardView.getContext(), null, pPSRewardView.getResources().getQuantityString(R.plurals.hiad_reward_close_dialog_message, jj.a().f31350a, Integer.valueOf(jj.a().f31350a)), pPSRewardView.getResources().getString(R.string.hiad_reward_close_dialog_continue), pPSRewardView.getResources().getString(R.string.hiad_reward_close_dialog_close), new l(pPSRewardView));
                        pPSRewardView.O = b10;
                        b10.setOnCancelListener(new m(pPSRewardView));
                        return;
                    }
                    return;
                }
            }
        }
        pPSRewardView.s();
    }

    public static void T(PPSRewardView pPSRewardView) {
        boolean z10;
        if (!pPSRewardView.f23259o0 && !i2.h(pPSRewardView.C)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && pPSRewardView.Q != null) {
            d2.a(new p0(pPSRewardView));
        }
    }

    public static void U(PPSRewardView pPSRewardView) {
        PPSAppDetailTemplateView pPSAppDetailTemplateView;
        String str;
        TextView textView;
        pPSRewardView.getClass();
        n7.e("PPSRewardView", "initTemplateView");
        if (pPSRewardView.S(pPSRewardView.C)) {
            int i10 = pPSRewardView.D0;
            if ((i10 == 3 || i10 == 4 || i10 == 5) && (pPSAppDetailTemplateView = pPSRewardView.I) != null && pPSRewardView.J != null) {
                boolean z10 = false;
                pPSAppDetailTemplateView.setVisibility(0);
                pPSRewardView.I.setAdLandingData(pPSRewardView.C);
                ua.b bVar = pPSRewardView.B;
                if (bVar != null && bVar.i() != null && !TextUtils.isEmpty(pPSRewardView.B.i().getAppDesc())) {
                    pPSRewardView.J.setVisibility(0);
                    pPSRewardView.J.setText(pPSRewardView.B.i().getAppDesc());
                } else {
                    pPSRewardView.J.setVisibility(4);
                }
                Context context = pPSRewardView.f23268x;
                if (com.huawei.openalliance.ad.ppskit.utils.d0.v(context)) {
                    pPSRewardView.J.setTextSize(1, 21.0f);
                    int i11 = pPSRewardView.D0;
                    if (i11 == 3) {
                        pPSRewardView.J.setVisibility(8);
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) pPSRewardView.I.getLayoutParams();
                        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin - ((int) e2.a(14, context)));
                        pPSRewardView.I.setLayoutParams(layoutParams);
                    } else {
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) pPSRewardView.I.getLayoutParams();
                        if (i11 == 4) {
                            layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin - ((int) e2.a(8, context)), layoutParams2.rightMargin, layoutParams2.bottomMargin);
                        } else {
                            layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin + ((int) e2.a(2, context)));
                        }
                        pPSRewardView.I.setLayoutParams(layoutParams2);
                        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) pPSRewardView.J.getLayoutParams();
                        layoutParams3.setMargins(layoutParams3.leftMargin, layoutParams3.topMargin, layoutParams3.rightMargin, layoutParams3.bottomMargin);
                        pPSRewardView.J.setLayoutParams(layoutParams3);
                    }
                }
                AdContentData adContentData = pPSRewardView.B.f35820b;
                if (adContentData != null) {
                    str = adContentData.c();
                } else {
                    str = null;
                }
                if (androidx.transition.n.X(str) == 2 || com.huawei.openalliance.ad.ppskit.utils.d0.v(pPSRewardView.f23268x)) {
                    z10 = true;
                }
                if (z10 && (textView = pPSRewardView.J) != null && pPSRewardView.D0 == 3) {
                    textView.setVisibility(8);
                }
            }
        }
    }

    public static void V(PPSRewardView pPSRewardView) {
        boolean z10;
        String str;
        boolean z11;
        String str2;
        String str3;
        pPSRewardView.getClass();
        n7.e("PPSRewardView", "init pop-up");
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(pPSRewardView.f23268x);
        String str4 = pPSRewardView.B.f35832p;
        synchronized (d10.f22585a) {
            Map<String, String> K = d10.K(str4, true);
            if (K != null) {
                z10 = TextUtils.equals(K.get("dlConfirmClickable"), "1");
            } else {
                z10 = false;
            }
        }
        AdContentData adContentData = pPSRewardView.B.f35820b;
        if (adContentData != null) {
            str = adContentData.c();
        } else {
            str = null;
        }
        Integer q10 = androidx.transition.n.q(19, 0, str);
        if (q10 != null && 1 == q10.intValue()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            str2 = "PPSRewardView";
            str3 = "switch is off, skip init popup.";
        } else {
            if (!a0.a.E0(pPSRewardView.B.b()) && pPSRewardView.B.i() != null) {
                Context context = pPSRewardView.getContext();
                pPSRewardView.getOrientation();
                PPSRewardPopUpView pPSRewardPopUpView = new PPSRewardPopUpView(context);
                pPSRewardView.f23249e0 = pPSRewardPopUpView;
                pPSRewardPopUpView.setAdPopupData(pPSRewardView.C);
                pPSRewardView.f23249e0.setPopUpClickListener(new l0(pPSRewardView, z10));
                View findViewById = pPSRewardView.findViewById(R.id.reward_content_area);
                findViewById.setClickable(true);
                findViewById.setOnTouchListener(new k0(pPSRewardView));
                PPSAppDetailTemplateView pPSAppDetailTemplateView = pPSRewardView.I;
                if (pPSAppDetailTemplateView != null) {
                    pPSAppDetailTemplateView.setEnabled(false);
                    return;
                }
                return;
            }
            str2 = "PPSRewardView";
            str3 = "appInfo is null or web, skip init popup";
        }
        n7.e(str2, str3);
    }

    public static boolean Z(PPSRewardView pPSRewardView) {
        PPSAppDetailView pPSAppDetailView;
        if (i2.g(pPSRewardView.f23268x, pPSRewardView.C) && (pPSAppDetailView = pPSRewardView.Q) != null && pPSAppDetailView.getAppDownloadButton().getStatus() == AppStatus.DOWNLOAD) {
            return true;
        }
        return false;
    }

    public static void a0(PPSRewardView pPSRewardView) {
        if (pPSRewardView.M == null && pPSRewardView.f23249e0 != null && !pPSRewardView.B.f35824g) {
            n7.e("PPSRewardView", "show ad dialog");
            pPSRewardView.M = pPSRewardView.f23249e0.getDialog();
            pPSRewardView.f23249e0.a();
            pPSRewardView.b("127");
            pPSRewardView.W();
            pPSRewardView.M.setOnCancelListener(new k(pPSRewardView));
        }
    }

    private int getRewardCountDownTime() {
        return jj.a().f31352c;
    }

    private int getVideoCountDownTime() {
        int i10;
        if (this.f23260p0 || (i10 = (this.B0 / 1000) - this.F0) < 0) {
            return 0;
        }
        return i10;
    }

    private void setAppDetailViewType(int i10) {
        PPSAppDetailView pPSAppDetailView = this.Q;
        if (pPSAppDetailView != null) {
            pPSAppDetailView.setDetailViewType(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomViewVisibility(int i10) {
        PPSAppDetailView pPSAppDetailView;
        MetaData g6;
        if ((this.f23269x0 || this.B.i() != null) && (pPSAppDetailView = this.Q) != null) {
            pPSAppDetailView.setVisibility(i10);
        }
        PPSLabelView pPSLabelView = this.V;
        if (pPSLabelView != null) {
            pPSLabelView.setVisibility(i10);
        }
        if (this.U != null) {
            ua.b bVar = this.B;
            if (bVar.f35821c == null && (g6 = bVar.g()) != null) {
                bVar.f35821c = y1.p(g6.i());
            }
            if (!y1.h(bVar.f35821c)) {
                this.U.setVisibility(i10);
            }
        }
        androidx.activity.n.W(this.f23248d0);
    }

    public final void B(Context context, int i10, int i11) {
        View.inflate(context, i10, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.reward_layout);
        this.H = viewGroup;
        viewGroup.setBackgroundColor(getResources().getColor(i11));
    }

    public final void C(PPSRewardActivity.k kVar) {
        this.J0 = kVar;
        PPSAppDetailView pPSAppDetailView = this.Q;
        if (pPSAppDetailView != null) {
            pPSAppDetailView.setOnNonWifiDownloadListener(kVar);
        }
        PPSRewardEndCardView pPSRewardEndCardView = this.T;
        if (pPSRewardEndCardView != null) {
            pPSRewardEndCardView.A = kVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
    
        if (r0 != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r13, java.lang.String r14, java.lang.String r15, int r16, boolean r17) {
        /*
            r12 = this;
            r8 = r12
            ua.b r0 = r8.B
            java.lang.String r9 = "PPSRewardView"
            if (r0 == 0) goto Lb
            java.lang.String r0 = "has been registered"
            goto Lac
        Lb:
            java.lang.String r0 = "register om"
            ka.n7.e(r9, r0)
            android.content.Context r0 = r12.getContext()
            r6 = r13
            com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData r10 = com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData.f(r0, r13)
            java.lang.String r0 = "registerWrapper"
            ka.n7.b(r9, r0)
            com.huawei.openalliance.ad.ppskit.views.q0 r11 = new com.huawei.openalliance.ad.ppskit.views.q0
            r0 = r11
            r1 = r12
            r2 = r10
            r3 = r14
            r4 = r16
            r5 = r17
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.huawei.openalliance.ad.ppskit.utils.d2.a(r11)
            if (r10 == 0) goto Laa
            java.util.List r0 = r10.k()
            if (r0 != 0) goto L39
            goto Laa
        L39:
            java.lang.String r0 = "init om"
            ka.n7.e(r9, r0)
            ka.eb r0 = com.huawei.openalliance.ad.ppskit.views.PPSRewardView.T0
            android.content.Context r1 = r12.getContext()
            r0.b(r1, r10, r12)
            r0.b()
            com.huawei.openalliance.ad.ppskit.views.RewardVideoView r1 = r8.D
            if (r1 == 0) goto La9
            r1.F = r0
            com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo r0 = r1.J
            r2 = 0
            if (r0 != 0) goto L56
            goto L9e
        L56:
            android.content.Context r0 = r1.getContext()
            boolean r0 = com.huawei.openalliance.ad.ppskit.utils.k1.g(r0)
            if (r0 != 0) goto L61
            goto L9e
        L61:
            android.content.Context r0 = r1.getContext()
            boolean r0 = com.huawei.openalliance.ad.ppskit.utils.k1.c(r0)
            r3 = 1
            if (r0 == 0) goto L6d
            goto L9d
        L6d:
            android.content.Context r0 = r1.getContext()
            java.lang.String r4 = "insre"
            ka.d5 r0 = ka.y4.a(r0, r4)
            com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo r4 = r1.J
            java.lang.String r4 = r4.getVideoDownloadUrl()
            boolean r4 = com.huawei.openalliance.ad.ppskit.utils.y1.t(r4)
            if (r4 == 0) goto L9a
            android.content.Context r4 = r1.getContext()
            com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo r5 = r1.J
            java.lang.String r5 = r5.getVideoDownloadUrl()
            java.lang.String r0 = r0.j(r4, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L98
            goto L9a
        L98:
            r0 = r2
            goto L9b
        L9a:
            r0 = r3
        L9b:
            if (r0 == 0) goto L9e
        L9d:
            r2 = r3
        L9e:
            boolean r0 = ka.wb.f32132t
            ka.xb r0 = ka.xb.a(r2)
            ka.eb r1 = r1.F
            r1.c(r0)
        La9:
            return
        Laa:
            java.lang.String r0 = "there is no reward ad or om is null"
        Lac:
            ka.n7.g(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.PPSRewardView.D(com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord, java.lang.String, java.lang.String, int, boolean):void");
    }

    public final void J(Integer num) {
        if (this.A != null) {
            K(Long.valueOf(System.currentTimeMillis() - this.A.G), Integer.valueOf(this.A.H), num);
        }
    }

    public final void K(Long l10, Integer num, Integer num2) {
        CtrlExt ctrlExt;
        boolean equals;
        boolean z10;
        ua.b bVar = this.B;
        if (bVar == null) {
            return;
        }
        AdContentData adContentData = bVar.f35820b;
        String str = null;
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
        ua.b bVar2 = this.B;
        if (bVar2.f35830m && (!z10 || bVar2.f35831n)) {
            return;
        }
        oc ocVar = this.y;
        if (ocVar != null) {
            long longValue = l10.longValue();
            int intValue = num.intValue();
            String o6 = ocVar.o();
            ua.b bVar3 = ocVar.f31608w;
            if (bVar3 != null) {
                Object[] objArr = new Object[3];
                AdContentData adContentData2 = bVar3.f35820b;
                if (adContentData2 != null) {
                    str = adContentData2.A();
                }
                objArr[0] = str;
                objArr[1] = ocVar.f31608w.f();
                objArr[2] = o6;
                n7.c("RewardAdPresenter", "slotId: %s, contentId: %s, slot pos: %s", objArr);
            }
            androidx.activity.n.H(ocVar.f31607v, (ContentRecord) ocVar.f32660t, Long.valueOf(longValue), Integer.valueOf(intValue), num2, "", o6);
        }
        if (z10) {
            this.B.f35831n = true;
        }
        ua.b bVar4 = this.B;
        if (bVar4.f35830m) {
            return;
        }
        bVar4.f35830m = true;
        T0.f();
    }

    public final void N(int i10, long j10) {
        ua.b bVar = this.B;
        if (bVar != null && !this.f23254j0 && j10 > bVar.h()) {
            this.f23254j0 = true;
            K(Long.valueOf(j10), Integer.valueOf(i10), null);
        }
    }

    public final void Q(String str) {
        TextView textView;
        MetaData g6;
        MetaData g10;
        if (this.B != null && !TextUtils.isEmpty(str)) {
            StringBuilder s10 = a3.l.s("notifyReward, condition:", str, ", ad condition:");
            ua.b bVar = this.B;
            if (bVar.o == null && (g10 = bVar.g()) != null) {
                bVar.o = g10.s0();
            }
            s10.append(bVar.o);
            n7.e("PPSRewardView", s10.toString());
            if (!this.B.f35824g) {
                if (!"1".equals(str)) {
                    ua.b bVar2 = this.B;
                    if (bVar2.o == null && (g6 = bVar2.g()) != null) {
                        bVar2.o = g6.s0();
                    }
                    if (!str.equals(bVar2.o) && !"-1".equals(str)) {
                        return;
                    }
                }
                n7.b("PPSRewardView", "Rewarded");
                va.d dVar = this.I0;
                if (dVar != null) {
                    PPSRewardActivity pPSRewardActivity = PPSRewardActivity.this;
                    ka.p pVar = new ka.p(pPSRewardActivity.getApplicationContext());
                    ContentRecord contentRecord = pPSRewardActivity.f22400w;
                    if (contentRecord != null) {
                        try {
                            ka.o f10 = pVar.f(contentRecord);
                            if (f10 != null) {
                                f10.f31525a = "166";
                                Context context = pVar.f31722a;
                                new ke(context, zh.a(f10.f31569u.intValue(), context), contentRecord).t(f10.f31552l, f10, true, false);
                            }
                        } catch (Throwable th) {
                            n7.h("AnalysisReport", "onNotifyReward ex: %s", th.getClass().getSimpleName());
                        }
                    }
                    PPSRewardActivity.l(pPSRewardActivity, 5, -1, -1);
                    this.B.f35824g = true;
                }
                if ("-1".equals(str) && (textView = this.E) != null) {
                    textView.setVisibility(8);
                }
                d2.a(new c());
                return;
            }
            return;
        }
        n7.g("PPSRewardView", "invalid status");
    }

    public final void R(boolean z10) {
        AlertDialog alertDialog = this.M;
        if (alertDialog != null) {
            alertDialog.dismiss();
            if (z10) {
                X();
            }
            this.M = null;
        }
    }

    public final boolean S(ContentRecord contentRecord) {
        if (contentRecord == null) {
            return false;
        }
        return a0.a.Z(contentRecord.s3(), new int[]{2, 3, 5, 8});
    }

    public final void W() {
        d2.a(new a());
    }

    public final void X() {
        d2.a(new j());
    }

    public final boolean Y() {
        boolean z10;
        VideoInfo videoInfo = this.L0;
        if (videoInfo == null) {
            return false;
        }
        String videoDownloadUrl = videoInfo.getVideoDownloadUrl();
        d5 a10 = y4.a(this.f23268x, "insre");
        int i10 = 1;
        if (y1.t(videoDownloadUrl) && TextUtils.isEmpty(a10.j(getContext(), videoDownloadUrl))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && y1.t(videoDownloadUrl)) {
            if (TextUtils.isEmpty(videoDownloadUrl)) {
                z10 = false;
            } else {
                z10 = !TextUtils.isEmpty(new a4.l(i10, new androidx.appcompat.app.r(this.f23268x), new com.huawei.openalliance.ad.ppskit.utils.h(this.f23268x, "normal")).a(videoDownloadUrl));
            }
            n7.f("PPSRewardView", "online video, isCached: %s", Boolean.valueOf(z10));
        }
        return z10;
    }

    @Override // ka.m9.a
    public final void a(long j10, int i10) {
        N(i10, this.G0);
    }

    public final void b(int i10) {
        int i11;
        if (this.f23264t0 && (i11 = this.E0) >= 0) {
            this.G0 = i10 - i11;
            this.f23264t0 = false;
        }
        this.E0 = -1;
    }

    @Override // ka.m9.a
    public final void c() {
        this.E0 = -1;
        this.f23264t0 = false;
    }

    @Override // ka.m9.a
    public final void d() {
        ContentRecord contentRecord;
        ContentRecord contentRecord2;
        this.f23254j0 = false;
        this.f23255k0 = false;
        HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf(currentTimeMillis);
        ua.b bVar = this.B;
        if (bVar != null) {
            bVar.f35830m = false;
            bVar.f35831n = false;
            AdContentData adContentData = bVar.f35820b;
            if (adContentData != null) {
                adContentData.v(valueOf);
            }
            AdContentData adContentData2 = this.B.f35820b;
            if (adContentData2 != null) {
                adContentData2.y(currentTimeMillis);
            }
        }
        oc ocVar = this.y;
        if (ocVar != null) {
            ContentRecord contentRecord3 = (ContentRecord) ocVar.f32660t;
            if (contentRecord3 != null) {
                contentRecord3.V1(valueOf);
            }
            this.y.i(currentTimeMillis);
        }
        RewardVideoView rewardVideoView = this.D;
        if (rewardVideoView != null) {
            ContentRecord contentRecord4 = (ContentRecord) rewardVideoView.G.f32660t;
            if (contentRecord4 != null) {
                contentRecord4.V1(valueOf);
            }
            this.D.G.i(currentTimeMillis);
        }
        PPSRewardEndCardView pPSRewardEndCardView = this.T;
        if (pPSRewardEndCardView != null) {
            AppDownloadButton appDownloadButton = pPSRewardEndCardView.f23234z;
            if (appDownloadButton != null && (contentRecord2 = appDownloadButton.P) != null) {
                contentRecord2.V1(valueOf);
            }
            AppDownloadButton appDownloadButton2 = this.T.f23234z;
            if (appDownloadButton2 != null && (contentRecord = appDownloadButton2.P) != null) {
                contentRecord.s2(currentTimeMillis);
            }
        }
        oc ocVar2 = this.y;
        if (ocVar2 != null) {
            androidx.activity.n.P(ocVar2.f31607v, com.huawei.openalliance.ad.constant.s.I, androidx.activity.n.y((ContentRecord) ocVar2.f32660t));
        }
        if (this.N != null && i2.g(this.f23268x, this.C) && this.f23261q0) {
            this.N.n();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction() & com.anythink.expressad.exoplayer.k.p.f9095b;
            if (action == 0) {
                this.M0 = a0.a.z(this, motionEvent);
                PPSRewardEndCardView pPSRewardEndCardView = this.T;
                if (pPSRewardEndCardView != null && pPSRewardEndCardView.getVisibility() == 0) {
                    PPSRewardEndCardView pPSRewardEndCardView2 = this.T;
                    MaterialClickInfo materialClickInfo = this.M0;
                    AppDownloadButton appDownloadButton = pPSRewardEndCardView2.f23234z;
                    if (appDownloadButton != null) {
                        appDownloadButton.setClickInfo(materialClickInfo);
                    }
                }
            }
            if (1 == action) {
                a0.a.T(this, motionEvent, this.M0);
                PPSRewardEndCardView pPSRewardEndCardView3 = this.T;
                if (pPSRewardEndCardView3 != null && pPSRewardEndCardView3.getVisibility() == 0) {
                    PPSRewardEndCardView pPSRewardEndCardView4 = this.T;
                    MaterialClickInfo materialClickInfo2 = this.M0;
                    AppDownloadButton appDownloadButton2 = pPSRewardEndCardView4.f23234z;
                    if (appDownloadButton2 != null) {
                        appDownloadButton2.setClickInfo(materialClickInfo2);
                    }
                }
            }
        } catch (Throwable th) {
            n7.h("PPSRewardView", "dispatchTouchEvent exception : %s", th.getClass().getSimpleName());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    @Override // ka.k9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r8, java.lang.String r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.PPSRewardView.f(int, java.lang.String, int, int):void");
    }

    @Override // ka.cj
    public final void g() {
        if (n7.d()) {
            n7.b("PPSRewardView", "onRewardTimeGained");
        }
        Q("1");
    }

    public PPSAppDetailView getAppDetailView() {
        return this.Q;
    }

    public com.huawei.openalliance.ad.ppskit.utils.p0 getAppointJs() {
        return this.K0;
    }

    public int getOrientation() {
        return this.C0;
    }

    public WebSettings getWebViewSettings() {
        PPSRewardWebView pPSRewardWebView = this.N;
        if (pPSRewardWebView != null) {
            return pPSRewardWebView.getSettings();
        }
        return null;
    }

    public int getmInsreTemplate() {
        return this.D0;
    }

    @Override // ka.cj
    public final void h() {
        if (n7.d()) {
            n7.b("PPSRewardView", "show close btn");
        }
        d2.a(new f());
    }

    @Override // ka.k9
    public final void i(String str, int i10) {
        n7.e("PPSRewardView", "onSegmentMediaStop:" + y1.j(str));
        if (!this.f23256l0) {
            b(i10);
        }
    }

    @Override // ka.k9
    public final void k(int i10, String str) {
        n7.e("PPSRewardView", "onSegmentMediaCompletion:" + y1.j(str));
        if (!this.f23256l0) {
            this.f23256l0 = true;
            b(i10);
            Q("-1");
            y();
            oc ocVar = this.y;
            if (ocVar != null) {
                long j10 = i10;
                ocVar.j(this.f23268x, j10, j10);
            }
        }
    }

    @Override // ka.k9
    public final void l(String str, int i10) {
        va.e eVar;
        n7.e("PPSRewardView", "onSegmentMediaStart:" + y1.j(str));
        ProgressBar progressBar = this.f23247c0;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        if (!this.f23264t0 && (eVar = this.f23270z) != null) {
            PPSRewardActivity.l(PPSRewardActivity.this, 9, -1, -1);
        }
        this.f23264t0 = true;
        this.f23258n0 = true;
        this.E0 = i10;
        u();
    }

    @Override // xa.a
    public final void n(String str, Intent intent) {
        if (!TextUtils.isEmpty(str) && intent != null) {
            n7.c("PPSRewardView", "onMessageNotify msgName:%s", str);
            try {
                String action = intent.getAction();
                n7.c("PPSRewardView", "appRe action: %s", action);
                if (action.equals("com.huawei.hms.pps.action.OPEN_IN_ADREWARD")) {
                    Q("4");
                    return;
                }
                return;
            } catch (IllegalStateException | Exception e10) {
                n7.g("PPSRewardView", "appRe ".concat(e10.getClass().getSimpleName()));
                return;
            }
        }
        n7.e("PPSRewardView", "msgName or msgData is empty!");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.b("PPSRewardView", "onAttachedToWindow");
        m9 m9Var = this.A;
        if (m9Var != null) {
            m9Var.d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n7.e("PPSRewardView", "onDetachedFromWindow");
        m9 m9Var = this.A;
        if (m9Var != null) {
            m9Var.e();
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        m9 m9Var = this.A;
        if (m9Var != null) {
            n7.e(m9Var.f31599s, "onViewVisibilityChanged");
            m9Var.f();
        }
    }

    public final boolean r() {
        ContentRecord contentRecord = this.C;
        if (contentRecord == null || contentRecord.X1() == null || !"1".equals(this.C.f1()) || !"4".equals(this.C.X1().k())) {
            return false;
        }
        return true;
    }

    public final void s() {
        d2.a(new u0(this));
        T0.d();
        va.d dVar = this.I0;
        if (dVar != null) {
            PPSRewardActivity pPSRewardActivity = PPSRewardActivity.this;
            PPSRewardActivity.l(pPSRewardActivity, 4, -1, -1);
            pPSRewardActivity.finishAndRemoveTask();
        }
        oc ocVar = this.y;
        if (ocVar != null) {
            ContentRecord contentRecord = (ContentRecord) ocVar.f32660t;
            Boolean bool = Boolean.TRUE;
            AdEventReport y = androidx.activity.n.y(contentRecord);
            y.H(0);
            y.O(0);
            y.I(bool);
            androidx.activity.n.P(ocVar.f31607v, com.huawei.openalliance.ad.constant.s.C, y);
        }
    }

    public void setOrientation(int i10) {
        if (i10 == 0 || 1 == i10) {
            this.C0 = i10;
        }
    }

    public final void t() {
        if (this.F == null) {
            return;
        }
        this.F.setImageResource(z1.m(this.D0, this.f23263s0));
        z1.t(this.F);
    }

    public final void u() {
        String quantityString;
        int videoCountDownTime = getVideoCountDownTime();
        int rewardCountDownTime = getRewardCountDownTime();
        Resources resources = getResources();
        if (this.B.f35824g) {
            quantityString = resources.getString(R.string.hiad_reward_awarded_success);
            if (this.f23260p0 && i2.h(this.C) && this.B.c() != null) {
                quantityString = this.B.c();
            } else if (videoCountDownTime > 0) {
                quantityString = String.format(Locale.ENGLISH, "%s | %s", resources.getQuantityString(R.plurals.hiad_reward_countdown, videoCountDownTime, Integer.valueOf(videoCountDownTime)), quantityString);
            }
        } else if (videoCountDownTime > 0) {
            quantityString = String.format(Locale.ENGLISH, "%s | %s", resources.getQuantityString(R.plurals.hiad_reward_countdown, videoCountDownTime, Integer.valueOf(videoCountDownTime)), resources.getQuantityString(R.plurals.hiad_reward_before_rw_time_countdown, rewardCountDownTime, Integer.valueOf(rewardCountDownTime)));
        } else {
            quantityString = resources.getQuantityString(R.plurals.hiad_reward_before_rw_time_countdown, rewardCountDownTime, Integer.valueOf(rewardCountDownTime));
        }
        this.E.setText(quantityString);
        if (this.E.getVisibility() != 0) {
            this.E.setVisibility(0);
        }
    }

    public final boolean v() {
        String str;
        if (this.f23267w0) {
            setBottomViewVisibility(8);
            PPSRewardEndCardView pPSRewardEndCardView = this.T;
            if (pPSRewardEndCardView != null) {
                ImageView imageView = pPSRewardEndCardView.B;
                String str2 = pPSRewardEndCardView.f23232w;
                if (!TextUtils.isEmpty(str2) && imageView != null) {
                    n7.e("PPSRewardEndCardView", "load app icon:" + y1.j(str2));
                    p2.a(new c0(pPSRewardEndCardView, str2, imageView), 4);
                }
                View view = pPSRewardEndCardView.y;
                if (view != null) {
                    view.setVisibility(0);
                }
                SixElementsView sixElementsView = pPSRewardEndCardView.L;
                if (sixElementsView != null) {
                    sixElementsView.c();
                }
            }
            if (this.f23271z0) {
                AdContentData adContentData = this.B.f35820b;
                if (adContentData != null) {
                    str = adContentData.L();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    this.f23250f0 = new MaskingView(this.f23268x);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    RelativeLayout relativeLayout = this.K;
                    if (relativeLayout != null) {
                        relativeLayout.addView(this.f23250f0, layoutParams);
                    }
                    LinearLayout linearLayout = this.L;
                    if (linearLayout != null) {
                        linearLayout.bringToFront();
                    }
                    this.f23250f0.setOnClickListener(new i0(this));
                }
            }
            this.f23259o0 = true;
        } else {
            if (!x()) {
                return false;
            }
            b(true);
        }
        return true;
    }

    public final void w() {
        String str;
        TextView textView;
        int i10;
        PPSAppDetailTemplateView pPSAppDetailTemplateView = this.I;
        boolean z10 = false;
        if (pPSAppDetailTemplateView != null) {
            pPSAppDetailTemplateView.setVisibility(0);
        }
        TextView textView2 = this.J;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        if (this.S != null && S(this.C) && ((i10 = this.D0) == 4 || i10 == 5)) {
            this.S.setExtraViewVisibility(8);
        }
        AdContentData adContentData = this.B.f35820b;
        if (adContentData != null) {
            str = adContentData.c();
        } else {
            str = null;
        }
        if (androidx.transition.n.X(str) == 2 || com.huawei.openalliance.ad.ppskit.utils.d0.v(this.f23268x)) {
            z10 = true;
        }
        if (z10 && (textView = this.J) != null && this.D0 == 3) {
            textView.setVisibility(8);
        }
    }

    public final boolean x() {
        String str;
        if (i2.g(this.f23268x, this.C)) {
            AdContentData adContentData = this.B.f35820b;
            if (adContentData != null) {
                str = adContentData.L();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                return true;
            }
        }
        return false;
    }

    public final void y() {
        if (!this.f23260p0 && v()) {
            this.f23260p0 = true;
        }
        if (this.E != null) {
            if (i2.h(this.C)) {
                u();
            } else {
                this.E.setVisibility(8);
            }
        }
        ImageView imageView = this.F;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        RewardVideoView rewardVideoView = this.D;
        if (rewardVideoView != null) {
            Bitmap surfaceBitmap = rewardVideoView.H.getSurfaceBitmap();
            n7.c("RewardVideoView", "last frame %s", surfaceBitmap);
            if (surfaceBitmap != null) {
                if (rewardVideoView.S == null) {
                    ImageView imageView2 = new ImageView(rewardVideoView.getContext());
                    rewardVideoView.S = imageView2;
                    imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(13);
                    rewardVideoView.addView(rewardVideoView.S, layoutParams);
                }
                rewardVideoView.S.setImageBitmap(surfaceBitmap);
                rewardVideoView.H.setVisibility(4);
            }
        }
        va.d dVar = this.I0;
        if (dVar != null && this.f23256l0) {
            PPSRewardActivity pPSRewardActivity = PPSRewardActivity.this;
            pPSRewardActivity.f22402z = true;
            PPSRewardActivity.l(pPSRewardActivity, 3, -1, -1);
        }
    }

    public final void z() {
        ImageView imageView = this.G;
        if (imageView != null && imageView.getVisibility() != 0) {
            n7.e("PPSRewardView", "showCloseBtn");
            this.G.setVisibility(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    @Override // ka.k9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r11, int r12) {
        /*
            r10 = this;
            boolean r0 = r10.f23256l0
            if (r0 != 0) goto Lbd
            boolean r0 = r10.f23264t0
            r1 = 1
            if (r0 != 0) goto L12
            int r2 = r10.E0
            if (r2 >= 0) goto L12
            r10.E0 = r12
            r10.f23264t0 = r1
            goto L33
        L12:
            if (r0 == 0) goto L33
            int r0 = r10.E0
            if (r0 < 0) goto L33
            int r0 = r12 - r0
            long r2 = (long) r0
            r10.G0 = r2
            ka.m9 r0 = r10.A
            if (r0 == 0) goto L26
            int r0 = r0.H
            r10.N(r0, r2)
        L26:
            ka.oc r4 = r10.y
            if (r4 == 0) goto L33
            android.content.Context r5 = r10.f23268x
            long r6 = (long) r12
            int r0 = r10.B0
            long r8 = (long) r0
            r4.j(r5, r6, r8)
        L33:
            ka.oc r0 = r10.y
            r2 = 0
            java.lang.String r3 = "PPSRewardView"
            if (r0 == 0) goto L6d
            boolean r4 = android.text.TextUtils.isEmpty(r11)
            if (r4 != 0) goto L5d
            boolean r4 = com.huawei.openalliance.ad.ppskit.utils.y1.t(r11)
            if (r4 == 0) goto L47
            goto L5d
        L47:
            int r4 = r0.C
            if (r4 != r12) goto L51
            int r4 = r0.D
            int r4 = r4 + r1
            r0.D = r4
            goto L55
        L51:
            r0.D = r2
            r0.C = r12
        L55:
            int r0 = r0.D
            r4 = 25
            if (r0 <= r4) goto L5f
            r0 = r1
            goto L60
        L5d:
            r0.D = r2
        L5f:
            r0 = r2
        L60:
            if (r0 == 0) goto L6d
            java.lang.String r0 = "play localFile timeout."
            ka.n7.g(r3, r0)
            r0 = -5
            r1 = -1
            r10.f(r12, r11, r0, r1)
            return
        L6d:
            int r0 = r10.B0
            if (r12 <= r0) goto L74
            if (r0 <= 0) goto L74
            r12 = r0
        L74:
            int r0 = r12 / 1000
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r4[r2] = r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r4[r1] = r2
            java.lang.String r2 = "onSegmentProgress: %d, originTime: %d"
            ka.n7.c(r3, r2, r4)
            ka.jj r2 = ka.jj.a()
            int r2 = r2.f31351b
            if (r2 != 0) goto L95
            r10.z()
        L95:
            int r2 = r10.F0
            if (r0 <= r2) goto La3
            int r2 = r2 + r1
            r10.F0 = r2
            ka.jj r0 = ka.jj.a()
            r0.b()
        La3:
            int r0 = r10.B0
            if (r12 < r0) goto Lbd
            java.lang.String r0 = "time countdown finish, manually stop"
            ka.n7.e(r3, r0)
            com.huawei.openalliance.ad.ppskit.views.RewardVideoView r0 = r10.D
            if (r0 == 0) goto Lbd
            r0.setVideoFinish(r1)
            r10.k(r12, r11)
            com.huawei.openalliance.ad.ppskit.views.RewardVideoView r11 = r10.D
            com.huawei.openalliance.ad.ppskit.views.VideoView r11 = r11.H
            r11.b()
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.PPSRewardView.a(java.lang.String, int):void");
    }

    @Override // ka.m9.a
    public final void b(long j10, int i10) {
        if (this.f23255k0) {
            return;
        }
        this.f23255k0 = true;
        if (this.y != null) {
            int videoDuration = this.f23256l0 ? this.L0.getVideoDuration() : this.D.getPlayedTime();
            int playedProgress = this.f23256l0 ? 100 : this.D.getPlayedProgress();
            oc ocVar = this.y;
            Integer valueOf = Integer.valueOf(videoDuration);
            Integer valueOf2 = Integer.valueOf(playedProgress);
            ContentRecord contentRecord = (ContentRecord) ocVar.f32660t;
            Long valueOf3 = Long.valueOf(j10);
            Integer valueOf4 = Integer.valueOf(i10);
            if (contentRecord == null) {
                n7.g("event", "on ad show, ad data is null");
                return;
            }
            AdEventReport y = androidx.activity.n.y(contentRecord);
            y.F(true);
            y.D(valueOf3);
            y.C(valueOf4);
            if (valueOf != null) {
                y.t0(valueOf);
                y.w0(valueOf2);
            }
            if (!y1.h(null)) {
                y.D0(null);
            }
            y.p0(null);
            androidx.activity.n.P(ocVar.f31607v, com.huawei.openalliance.ad.constant.s.V, y);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f A[Catch: all -> 0x00aa, TryCatch #0 {all -> 0x00aa, blocks: (B:11:0x002c, B:16:0x0034, B:20:0x004c, B:28:0x0081, B:31:0x0076, B:32:0x0079, B:33:0x007c, B:34:0x007f, B:35:0x0054, B:38:0x005c, B:42:0x0064), top: B:10:0x002c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r15) {
        /*
            r14 = this;
            ua.b r0 = r14.B
            if (r0 == 0) goto Lb1
            android.content.Context r0 = r14.f23268x
            if (r0 == 0) goto Lb1
            com.huawei.openalliance.ad.ppskit.views.PPSRewardPopUpView r0 = r14.f23249e0
            if (r0 == 0) goto Lb1
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 == 0) goto L14
            goto Lb1
        L14:
            android.content.Context r0 = r14.f23268x
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r1 = r14.C
            java.lang.String r2 = "report Type is "
            java.lang.String r2 = r2.concat(r15)
            java.lang.String r3 = "PPSRewardPopUpView"
            ka.n7.e(r3, r2)
            ka.v r2 = new ka.v
            r2.<init>(r0)
            java.lang.String r0 = "AnalysisReport"
            java.lang.String r3 = "adType is "
            ka.o r4 = r2.f(r1)     // Catch: java.lang.Throwable -> Laa
            if (r4 != 0) goto L34
            goto Lb0
        L34:
            int r5 = r15.hashCode()     // Catch: java.lang.Throwable -> Laa
            r6 = 48718(0xbe4e, float:6.8268E-41)
            java.lang.String r7 = "130"
            java.lang.String r8 = "129"
            java.lang.String r9 = "128"
            java.lang.String r10 = "127"
            r11 = 3
            r12 = 2
            r13 = 1
            if (r5 == r6) goto L64
            switch(r5) {
                case 48694: goto L5c;
                case 48695: goto L54;
                case 48696: goto L4c;
                default: goto L4b;
            }
        L4b:
            goto L6c
        L4c:
            boolean r15 = r15.equals(r8)     // Catch: java.lang.Throwable -> Laa
            if (r15 == 0) goto L6c
            r15 = r12
            goto L6d
        L54:
            boolean r15 = r15.equals(r9)     // Catch: java.lang.Throwable -> Laa
            if (r15 == 0) goto L6c
            r15 = r13
            goto L6d
        L5c:
            boolean r15 = r15.equals(r10)     // Catch: java.lang.Throwable -> Laa
            if (r15 == 0) goto L6c
            r15 = 0
            goto L6d
        L64:
            boolean r15 = r15.equals(r7)     // Catch: java.lang.Throwable -> Laa
            if (r15 == 0) goto L6c
            r15 = r11
            goto L6d
        L6c:
            r15 = -1
        L6d:
            if (r15 == 0) goto L7f
            if (r15 == r13) goto L7c
            if (r15 == r12) goto L79
            if (r15 == r11) goto L76
            goto L81
        L76:
            r4.f31525a = r7     // Catch: java.lang.Throwable -> Laa
            goto L81
        L79:
            r4.f31525a = r8     // Catch: java.lang.Throwable -> Laa
            goto L81
        L7c:
            r4.f31525a = r9     // Catch: java.lang.Throwable -> Laa
            goto L81
        L7f:
            r4.f31525a = r10     // Catch: java.lang.Throwable -> Laa
        L81:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laa
            r15.<init>(r3)     // Catch: java.lang.Throwable -> Laa
            java.lang.Integer r3 = r4.f31569u     // Catch: java.lang.Throwable -> Laa
            r15.append(r3)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r15 = r15.toString()     // Catch: java.lang.Throwable -> Laa
            ka.n7.e(r0, r15)     // Catch: java.lang.Throwable -> Laa
            ka.ke r15 = new ka.ke     // Catch: java.lang.Throwable -> Laa
            android.content.Context r2 = r2.f31722a     // Catch: java.lang.Throwable -> Laa
            java.lang.Integer r3 = r4.f31569u     // Catch: java.lang.Throwable -> Laa
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> Laa
            ka.gi r3 = ka.zh.a(r3, r2)     // Catch: java.lang.Throwable -> Laa
            r15.<init>(r2, r3, r1)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r1 = r4.f31552l     // Catch: java.lang.Throwable -> Laa
            r2 = 0
            r15.t(r1, r4, r2, r13)     // Catch: java.lang.Throwable -> Laa
            goto Lb0
        Laa:
            r15 = move-exception
            java.lang.String r1 = "onRewardAdPopUpReport:"
            e0.i.p(r15, r1, r0)
        Lb0:
            return
        Lb1:
            java.lang.String r15 = "PPSRewardView"
            java.lang.String r0 = "invalid parameter"
            ka.n7.g(r15, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.PPSRewardView.b(java.lang.String):void");
    }

    /* loaded from: classes2.dex */
    public class b implements VideoView.n {
        public b() {
        }

        @Override // com.huawei.openalliance.ad.ppskit.views.VideoView.n
        public final void b(boolean z10) {
            ua.b bVar;
            if (!z10) {
                PPSRewardView pPSRewardView = PPSRewardView.this;
                if (pPSRewardView.f23266v0 && (bVar = pPSRewardView.B) != null && bVar.f35838v) {
                    pPSRewardView.W();
                    d2.a(new t0(pPSRewardView));
                }
            }
        }

        @Override // com.huawei.openalliance.ad.ppskit.views.VideoView.n
        public final void l() {
        }
    }

    @Override // ka.cj
    public final void f() {
        if (n7.d()) {
            n7.b("PPSRewardView", "one second passed");
        }
        d2.a(new e());
    }

    @Override // ka.db
    public View getOpenMeasureView() {
        return this;
    }

    @Override // ka.k9
    public final void b(String str, int i10) {
        n7.e("PPSRewardView", "onSegmentMediaPause:" + y1.j(str));
        b(i10);
    }

    public final void b(boolean z10) {
        String str;
        int i10;
        ProgressBar progressBar;
        setAppDetailViewType(1);
        PPSRewardWebView pPSRewardWebView = this.N;
        if (pPSRewardWebView != null) {
            if (!this.A0) {
                pPSRewardWebView.q();
                this.f23261q0 = true;
                this.N.n();
            }
            if (!this.f23264t0 && (progressBar = this.f23247c0) != null) {
                progressBar.setVisibility(8);
            }
            Q("2");
            this.D.setVisibility(4);
            PPSAppDetailTemplateView pPSAppDetailTemplateView = this.I;
            if (pPSAppDetailTemplateView != null) {
                pPSAppDetailTemplateView.setVisibility(4);
            }
            TextView textView = this.J;
            if (textView != null) {
                textView.setVisibility(4);
            }
            if (this.S != null && S(this.C) && ((i10 = this.D0) == 4 || i10 == 5)) {
                this.S.setExtraViewVisibility(0);
            }
            this.N.setVisibility(0);
            this.N.setRealOpenTime(System.currentTimeMillis());
            this.f23260p0 = true;
            this.f23252h0.setVisibility(8);
        }
        AdContentData adContentData = this.B.f35820b;
        if ("1".equals(adContentData != null ? adContentData.d() : "3")) {
            AdContentData adContentData2 = this.B.f35820b;
            Integer q10 = androidx.transition.n.q(10, 0, adContentData2 != null ? adContentData2.c() : null);
            if (q10 != null && 1 == q10.intValue()) {
                this.Q.setVisibility(8);
            }
        }
        if (i2.h(this.C)) {
            setBottomViewVisibility(8);
            this.F.setVisibility(8);
            u();
            ((PPSRewardActivity) getContext()).setRequestedOrientation(1);
        }
        if (r()) {
            ((PPSRewardActivity) getContext()).setRequestedOrientation(1);
        }
        if (this.N0) {
            this.N0 = false;
            Toast.makeText(getContext(), R.string.hiad_third_party_page_hint, 0).show();
        }
        ContentRecord contentRecord = this.C;
        if (contentRecord == null) {
            return;
        }
        if (androidx.transition.n.f0(contentRecord.q0()) != 2) {
            n7.c("PPSRewardView", "no need popup strategy %s.", Integer.valueOf(androidx.transition.n.f0(this.C.q0())));
            return;
        }
        if (this.C.j0() == null || this.C.f1() == null) {
            str = "app or pageType para error.";
        } else if (!"1".equals(this.C.f1()) && !"2".equals(this.C.f1())) {
            str = "landing type no need pop.";
        } else {
            if (i2.g(this.f23268x, this.C)) {
                long x10 = this.C.j0().x();
                Object[] objArr = new Object[1];
                if (x10 < 0) {
                    objArr[0] = Long.valueOf(x10);
                    n7.h("PPSRewardView", "delay time error:%s", objArr);
                    return;
                } else {
                    objArr[0] = Long.valueOf(x10);
                    n7.f("PPSRewardView", "show app download dialog start delayTime %s", objArr);
                    d2.b(new n(this), x10);
                    return;
                }
            }
            str = "not download related no need pop.";
        }
        n7.b("PPSRewardView", str);
    }
}
