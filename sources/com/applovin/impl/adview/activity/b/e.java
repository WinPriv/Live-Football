package com.applovin.impl.adview.activity.b;

import a3.k;
import a3.l;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ak;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.aw;
import com.applovin.exoplayer2.h.u;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.ui.f;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.j;
import com.applovin.impl.adview.m;
import com.applovin.impl.adview.t;
import com.applovin.impl.adview.u;
import com.applovin.impl.adview.v;
import com.applovin.impl.adview.w;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.utils.s;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class e extends com.applovin.impl.adview.activity.b.a implements AppLovinCommunicatorSubscriber {
    protected v A;
    protected final ProgressBar B;
    protected final j C;
    protected boolean D;
    protected long E;
    protected int F;
    protected boolean G;
    protected boolean H;
    private final com.applovin.impl.adview.activity.a.c I;
    private final a J;
    private final Handler K;
    private final boolean L;
    private long M;
    private final AtomicBoolean N;
    private final AtomicBoolean O;
    private long P;
    private long Q;

    /* renamed from: v, reason: collision with root package name */
    protected final com.applovin.exoplayer2.ui.g f17036v;

    /* renamed from: w, reason: collision with root package name */
    protected final aw f17037w;

    /* renamed from: x, reason: collision with root package name */
    protected final com.applovin.impl.adview.a f17038x;
    protected final m y;

    /* renamed from: z, reason: collision with root package name */
    protected final ImageView f17039z;

    /* loaded from: classes.dex */
    public class a implements w.a {
        private a() {
        }

        @Override // com.applovin.impl.adview.w.a
        public void a(v vVar) {
            y yVar = e.this.f16984c;
            if (y.a()) {
                e.this.f16984c.b("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            e.this.a(vVar.getAndClearLastClickLocation());
        }

        @Override // com.applovin.impl.adview.w.a
        public void b(v vVar) {
            y yVar = e.this.f16984c;
            if (y.a()) {
                e.this.f16984c.b("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            e.this.h();
        }

        @Override // com.applovin.impl.adview.w.a
        public void c(v vVar) {
            y yVar = e.this.f16984c;
            if (y.a()) {
                e.this.f16984c.b("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            e.this.c();
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e eVar = e.this;
            if (view == eVar.y) {
                if (eVar.s()) {
                    e.this.e();
                    e.this.p();
                    e.this.f16999t.b();
                    return;
                }
                e.this.c();
                return;
            }
            if (view == eVar.f17039z) {
                eVar.z();
                return;
            }
            y yVar = eVar.f16984c;
            if (y.a()) {
                e.this.f16984c.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public e(com.applovin.impl.sdk.ad.e eVar, Activity activity, Map<String, Object> map, p pVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.I = new com.applovin.impl.adview.activity.a.c(this.f16982a, this.f16986e, this.f16983b);
        a aVar = new a();
        this.J = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.K = handler;
        j jVar = new j(handler, this.f16983b);
        this.C = jVar;
        boolean f = this.f16982a.f();
        this.L = f;
        this.D = Utils.isVideoMutedInitially(this.f16983b);
        this.M = -1L;
        this.N = new AtomicBoolean();
        this.O = new AtomicBoolean();
        this.P = -2L;
        this.Q = 0L;
        if (eVar.hasVideoUrl()) {
            c cVar = new c();
            if (eVar.r() >= 0) {
                m mVar = new m(eVar.x(), activity);
                this.y = mVar;
                mVar.setVisibility(8);
                mVar.setOnClickListener(cVar);
            } else {
                this.y = null;
            }
            if (a(this.D, pVar)) {
                ImageView imageView = new ImageView(activity);
                this.f17039z = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setClickable(true);
                imageView.setOnClickListener(cVar);
                d(this.D);
            } else {
                this.f17039z = null;
            }
            String C = eVar.C();
            if (StringUtils.isValidString(C)) {
                w wVar = new w(pVar);
                wVar.a(new WeakReference<>(aVar));
                v vVar = new v(wVar, activity);
                this.A = vVar;
                vVar.a(C);
            } else {
                this.A = null;
            }
            if (f) {
                com.applovin.impl.adview.a aVar2 = new com.applovin.impl.adview.a(activity, ((Integer) pVar.a(com.applovin.impl.sdk.c.b.cP)).intValue(), R.attr.progressBarStyleLarge);
                this.f17038x = aVar2;
                aVar2.setColor(Color.parseColor("#75FFFFFF"));
                aVar2.setBackgroundColor(Color.parseColor("#00000000"));
                aVar2.setVisibility(8);
                AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
            } else {
                this.f17038x = null;
            }
            if (eVar.O()) {
                ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
                this.B = progressBar;
                progressBar.setMax(10000);
                progressBar.setPadding(0, 0, 0, 0);
                if (h.d()) {
                    progressBar.setProgressTintList(ColorStateList.valueOf(eVar.P()));
                }
                jVar.a("PROGRESS_BAR", ((Long) pVar.a(com.applovin.impl.sdk.c.b.cM)).longValue(), new j.a() { // from class: com.applovin.impl.adview.activity.b.e.1
                    @Override // com.applovin.impl.adview.j.a
                    public void a() {
                        e eVar2 = e.this;
                        if (eVar2.G) {
                            eVar2.B.setVisibility(8);
                            return;
                        }
                        float I = (float) eVar2.f17037w.I();
                        e eVar3 = e.this;
                        eVar3.B.setProgress((int) ((I / ((float) eVar3.E)) * 10000.0f));
                    }

                    @Override // com.applovin.impl.adview.j.a
                    public boolean b() {
                        return !e.this.G;
                    }
                });
            } else {
                this.B = null;
            }
            aw a10 = new aw.a(activity).a();
            this.f17037w = a10;
            b bVar = new b();
            a10.a((an.b) bVar);
            a10.c(0);
            com.applovin.exoplayer2.ui.g gVar = new com.applovin.exoplayer2.ui.g(activity);
            this.f17036v = gVar;
            gVar.b();
            gVar.setControllerVisibilityListener(bVar);
            gVar.setPlayer(a10);
            gVar.setOnTouchListener(new AppLovinTouchToClickListener(pVar, com.applovin.impl.sdk.c.b.aZ, activity, bVar));
            B();
            return;
        }
        throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
    }

    private void G() {
        v vVar;
        final boolean z10;
        t D = this.f16982a.D();
        if (D != null && D.e() && !this.G && (vVar = this.A) != null) {
            if (vVar.getVisibility() == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            final long f = D.f();
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.5
                @Override // java.lang.Runnable
                public void run() {
                    if (z10) {
                        r.a(e.this.A, f, (Runnable) null);
                    } else {
                        r.b(e.this.A, f, null);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        this.I.a(this.f16989i);
        this.f16991k = SystemClock.elapsedRealtime();
    }

    public void A() {
        D();
        this.I.a(this.f16988h, this.f16987g, this.f);
        StringBuilder sb2 = new StringBuilder("javascript:al_onPoststitialShow(");
        sb2.append(this.f16993m);
        sb2.append(",");
        a(com.ironsource.adapters.facebook.a.i(sb2, this.f16994n, ");"), this.f16982a.S());
        if (this.f16988h != null) {
            if (this.f16982a.t() >= 0) {
                a(this.f16988h, this.f16982a.t(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.9
                    @Override // java.lang.Runnable
                    public void run() {
                        e.this.f16991k = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.f16988h.setVisibility(0);
            }
        }
        ArrayList arrayList = new ArrayList();
        m mVar = this.f16988h;
        if (mVar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(mVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        u uVar = this.f16987g;
        if (uVar != null && uVar.b()) {
            u uVar2 = this.f16987g;
            arrayList.add(new com.applovin.impl.sdk.a.d(uVar2, FriendlyObstructionPurpose.NOT_VISIBLE, uVar2.getIdentifier()));
        }
        this.f16982a.o().a(this.f, arrayList);
        v();
        this.G = true;
    }

    public void B() {
        a(!this.L);
        Activity activity = this.f16986e;
        com.applovin.exoplayer2.h.u a10 = new u.a(new com.applovin.exoplayer2.k.p(activity, ai.a((Context) activity, "com.applovin.sdk"))).a(ab.a(this.f16982a.h()));
        this.f17037w.a(!this.D ? 1 : 0);
        this.f17037w.a((com.applovin.exoplayer2.h.p) a10);
        this.f17037w.w();
        this.f17037w.a(false);
    }

    public void C() {
        if (this.O.compareAndSet(false, true)) {
            a(this.y, this.f16982a.r(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.4
                @Override // java.lang.Runnable
                public void run() {
                    e.this.P = -1L;
                    e.this.Q = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    public void D() {
        this.F = F();
        this.f17037w.a(false);
    }

    public void E() {
        if (this.G) {
            if (y.a()) {
                this.f16984c.d("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
                return;
            }
            return;
        }
        if (this.f16983b.Y().isApplicationPaused()) {
            if (y.a()) {
                this.f16984c.d("AppLovinFullscreenActivity", "Skip video resume - app paused");
                return;
            }
            return;
        }
        long j10 = this.M;
        if (j10 >= 0) {
            if (y.a()) {
                y yVar = this.f16984c;
                StringBuilder k10 = com.ironsource.adapters.facebook.a.k("Resuming video at position ", j10, "ms for MediaPlayer: ");
                k10.append(this.f17037w);
                yVar.b("AppLovinFullscreenActivity", k10.toString());
            }
            this.f17037w.a(true);
            this.C.a();
            this.M = -1L;
            if (!this.f17037w.a()) {
                x();
                return;
            }
            return;
        }
        if (y.a()) {
            this.f16984c.b("AppLovinFullscreenActivity", "Invalid last video position, isVideoPlaying=" + this.f17037w.a());
        }
    }

    public int F() {
        aw awVar = this.f17037w;
        if (awVar == null) {
            return 0;
        }
        long I = awVar.I();
        if (this.H) {
            return 100;
        }
        if (I > 0) {
            return (int) ((((float) I) / ((float) this.E)) * 100.0f);
        }
        return this.F;
    }

    public void c(long j10) {
        this.E = j10;
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void e() {
        if (y.a()) {
            this.f16984c.b("AppLovinFullscreenActivity", "Pausing video");
        }
        if (this.f17037w.a()) {
            this.M = this.f17037w.I();
            this.f17037w.a(false);
            this.C.c();
            if (y.a()) {
                this.f16984c.b("AppLovinFullscreenActivity", l.n(new StringBuilder("Paused video at position "), this.M, "ms"));
                return;
            }
            return;
        }
        if (y.a()) {
            this.f16984c.b("AppLovinFullscreenActivity", "Nothing to pause");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdExoPlayerPresenter";
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void h() {
        this.C.b();
        this.K.removeCallbacksAndMessages(null);
        m();
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void k() {
        if (((Boolean) this.f16983b.a(com.applovin.impl.sdk.c.b.fR)).booleanValue()) {
            s.a(this.A);
            this.A = null;
        }
        this.f17037w.E();
        if (this.L) {
            AppLovinCommunicator.getInstance(this.f16986e).unsubscribe(this, "video_caching_failed");
        }
        super.k();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void m() {
        super.a(F(), this.L, r(), this.P);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j10 = messageData.getLong("ad_id");
            if (((Boolean) this.f16983b.a(com.applovin.impl.sdk.c.b.fy)).booleanValue() && j10 == this.f16982a.getAdIdNumber() && this.L) {
                int i10 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string != null || i10 < 200 || i10 >= 300) && !this.H && !this.f17037w.a()) {
                    c("Video cache error during stream. ResponseCode=" + i10 + ", exception=" + string);
                }
            }
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public boolean r() {
        if (this.f16982a == null || F() < this.f16982a.Q()) {
            return false;
        }
        return true;
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public boolean s() {
        if (t() && !r()) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void u() {
        long ae;
        long millis;
        long j10 = 0;
        if (this.f16982a.ad() >= 0 || this.f16982a.ae() >= 0) {
            if (this.f16982a.ad() >= 0) {
                ae = this.f16982a.ad();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f16982a;
                long j11 = this.E;
                if (j11 > 0) {
                    j10 = 0 + j11;
                }
                if (aVar.af()) {
                    int l10 = (int) ((com.applovin.impl.sdk.ad.a) this.f16982a).l();
                    if (l10 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(l10);
                    } else {
                        int t10 = (int) aVar.t();
                        if (t10 > 0) {
                            millis = TimeUnit.SECONDS.toMillis(t10);
                        }
                    }
                    j10 += millis;
                }
                ae = (long) ((this.f16982a.ae() / 100.0d) * j10);
            }
            b(ae);
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void w() {
        super.w();
        this.I.a(this.A);
        this.I.a((View) this.y);
        if (!t() || this.G) {
            H();
        }
    }

    public void x() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.7
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.adview.a aVar = e.this.f17038x;
                if (aVar != null) {
                    aVar.a();
                }
            }
        });
    }

    public void y() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.8
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.adview.a aVar = e.this.f17038x;
                if (aVar != null) {
                    aVar.b();
                }
            }
        });
    }

    public void z() {
        boolean z10 = !this.D;
        this.D = z10;
        this.f17037w.a(!z10 ? 1 : 0);
        d(this.D);
        a(this.D, 0L);
    }

    /* loaded from: classes.dex */
    public class b implements an.b, f.d, AppLovinTouchToClickListener.OnClickListener {
        private b() {
        }

        @Override // com.applovin.exoplayer2.an.b
        public void a(ak akVar) {
            e.this.c("Video view error (" + akVar + ")");
            e.this.h();
        }

        @Override // com.applovin.exoplayer2.an.b
        public void b(int i10) {
            y yVar = e.this.f16984c;
            if (y.a()) {
                y yVar2 = e.this.f16984c;
                StringBuilder n10 = k.n("Player state changed to state ", i10, " and will play when ready: ");
                n10.append(e.this.f17037w.x());
                yVar2.b("AppLovinFullscreenActivity", n10.toString());
            }
            if (i10 == 2) {
                e.this.x();
                e.this.f16985d.g();
                return;
            }
            if (i10 == 3) {
                e eVar = e.this;
                eVar.f17037w.a(!eVar.D ? 1 : 0);
                e eVar2 = e.this;
                eVar2.c(eVar2.f17037w.H());
                e.this.u();
                y yVar3 = e.this.f16984c;
                if (y.a()) {
                    e.this.f16984c.b("AppLovinFullscreenActivity", "MediaPlayer prepared: " + e.this.f17037w);
                }
                e.this.C.a();
                e eVar3 = e.this;
                if (eVar3.y != null) {
                    eVar3.C();
                }
                e.this.y();
                if (e.this.f16999t.c()) {
                    e.this.e();
                    return;
                }
                return;
            }
            if (i10 == 4) {
                y yVar4 = e.this.f16984c;
                if (y.a()) {
                    e.this.f16984c.b("AppLovinFullscreenActivity", "Video completed");
                }
                e eVar4 = e.this;
                eVar4.H = true;
                if (!eVar4.f16992l) {
                    eVar4.A();
                } else if (eVar4.t()) {
                    e.this.H();
                }
            }
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, PointF pointF) {
            e.this.a(pointF);
        }

        @Override // com.applovin.exoplayer2.ui.f.d
        public void a(int i10) {
            if (i10 == 0) {
                e.this.f17036v.b();
            }
        }
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void b() {
        if (y.a()) {
            this.f16984c.b("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        c();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void c(boolean z10) {
        super.c(z10);
        if (z10) {
            a(0L);
        } else {
            if (this.G) {
                return;
            }
            e();
        }
    }

    public void d(boolean z10) {
        if (h.d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f16986e.getDrawable(z10 ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f17039z.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f17039z.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aE = z10 ? this.f16982a.aE() : this.f16982a.aF();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.f17039z.setImageURI(aE);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        this.I.a(this.f17039z, this.y, this.A, this.f17038x, this.B, this.f17036v, this.f, this.f16987g, null, viewGroup);
        com.applovin.impl.adview.u uVar = this.f16987g;
        if (uVar != null) {
            uVar.a();
        }
        this.f17037w.a(true);
        if (this.f16982a.am()) {
            this.f16999t.a(this.f16982a, new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.2
                @Override // java.lang.Runnable
                public void run() {
                    e.this.a(250L);
                }
            });
        }
        if (this.L) {
            x();
        }
        this.f.renderAd(this.f16982a);
        this.f16985d.b(this.L ? 1L : 0L);
        if (this.y != null) {
            this.f16983b.M().a(new z(this.f16983b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.3
                @Override // java.lang.Runnable
                public void run() {
                    e.this.C();
                }
            }), o.a.MAIN, this.f16982a.s(), true);
        }
        super.b(this.D);
    }

    public void c() {
        this.P = SystemClock.elapsedRealtime() - this.Q;
        if (y.a()) {
            this.f16984c.b("AppLovinFullscreenActivity", l.n(new StringBuilder("Skipping video with skip time: "), this.P, "ms"));
        }
        this.f16985d.f();
        this.f16993m++;
        if (this.f16982a.y()) {
            h();
        } else {
            A();
        }
    }

    public void a(PointF pointF) {
        if (this.f16982a.E()) {
            if (y.a()) {
                this.f16984c.b("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri k10 = this.f16982a.k();
            if (k10 != null) {
                AppLovinAdView appLovinAdView = this.f;
                this.f16983b.E().trackAndLaunchVideoClick(this.f16982a, k10, pointF, this, appLovinAdView != null ? appLovinAdView.getContext() : p.y());
                com.applovin.impl.sdk.utils.k.a(this.f16996q, this.f16982a);
                this.f16985d.b();
                this.f16994n++;
                return;
            }
            return;
        }
        G();
    }

    public void c(String str) {
        if (y.a()) {
            y yVar = this.f16984c;
            StringBuilder s10 = l.s("Encountered media error: ", str, " for ad: ");
            s10.append(this.f16982a);
            yVar.e("AppLovinFullscreenActivity", s10.toString());
        }
        if (this.N.compareAndSet(false, true)) {
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.f16997r;
            if (appLovinAdDisplayListener instanceof com.applovin.impl.sdk.ad.h) {
                ((com.applovin.impl.sdk.ad.h) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            h();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(long j10) {
        a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.6
            @Override // java.lang.Runnable
            public void run() {
                e.this.E();
            }
        }, j10);
    }

    private static boolean a(boolean z10, p pVar) {
        if (!((Boolean) pVar.a(com.applovin.impl.sdk.c.b.cE)).booleanValue()) {
            return false;
        }
        if (!((Boolean) pVar.a(com.applovin.impl.sdk.c.b.cF)).booleanValue() || z10) {
            return true;
        }
        return ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.cH)).booleanValue();
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void a() {
        if (y.a()) {
            this.f16984c.b("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }
}
