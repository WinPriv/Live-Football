package com.applovin.impl.adview.activity.b;

import a3.l;
import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.adview.j;
import com.applovin.impl.adview.m;
import com.applovin.impl.adview.t;
import com.applovin.impl.adview.u;
import com.applovin.impl.adview.v;
import com.applovin.impl.adview.w;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.k;
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
public class f extends com.applovin.impl.adview.activity.b.a implements AppLovinCommunicatorSubscriber {
    protected final ProgressBar A;
    protected ImageView B;
    protected final j C;
    protected boolean D;
    protected long E;
    protected boolean F;
    private final com.applovin.impl.adview.activity.a.c G;
    private MediaPlayer H;
    private final b I;
    private final a J;
    private final Handler K;
    private final boolean L;
    private int M;
    private int N;
    private boolean O;
    private final AtomicBoolean P;
    private final AtomicBoolean Q;
    private long R;
    private long S;

    /* renamed from: v, reason: collision with root package name */
    protected final AppLovinVideoView f17054v;

    /* renamed from: w, reason: collision with root package name */
    protected final com.applovin.impl.adview.a f17055w;

    /* renamed from: x, reason: collision with root package name */
    protected final m f17056x;
    protected final ImageView y;

    /* renamed from: z, reason: collision with root package name */
    protected v f17057z;

    /* loaded from: classes.dex */
    public class a implements w.a {
        private a() {
        }

        @Override // com.applovin.impl.adview.w.a
        public void a(v vVar) {
            y yVar = f.this.f16984c;
            if (y.a()) {
                f.this.f16984c.b("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            f.this.a(vVar.getAndClearLastClickLocation());
        }

        @Override // com.applovin.impl.adview.w.a
        public void b(v vVar) {
            y yVar = f.this.f16984c;
            if (y.a()) {
                f.this.f16984c.b("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            f.this.h();
        }

        @Override // com.applovin.impl.adview.w.a
        public void c(v vVar) {
            y yVar = f.this.f16984c;
            if (y.a()) {
                f.this.f16984c.b("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            f.this.c();
        }
    }

    /* loaded from: classes.dex */
    public class b implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, AppLovinTouchToClickListener.OnClickListener {
        private b() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, PointF pointF) {
            f.this.a(pointF);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            y yVar = f.this.f16984c;
            if (y.a()) {
                f.this.f16984c.b("AppLovinFullscreenActivity", "Video completed");
            }
            f.this.O = true;
            f fVar = f.this;
            if (!fVar.f16992l) {
                fVar.A();
            } else if (fVar.t()) {
                f.this.F();
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            f.this.c("Video view error (" + i10 + "," + i11 + ")");
            f.this.f17054v.start();
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            y yVar = f.this.f16984c;
            if (y.a()) {
                f.this.f16984c.b("AppLovinFullscreenActivity", "MediaPlayer Info: (" + i10 + ", " + i11 + ")");
            }
            if (i10 == 701) {
                f.this.x();
                f.this.f16985d.g();
                return false;
            }
            if (i10 == 3) {
                f.this.C.a();
                f fVar = f.this;
                if (fVar.f17056x != null) {
                    fVar.C();
                }
                f.this.y();
                if (f.this.f16999t.c()) {
                    f.this.e();
                    return false;
                }
                return false;
            }
            if (i10 == 702) {
                f.this.y();
                return false;
            }
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            f.this.H = mediaPlayer;
            mediaPlayer.setOnInfoListener(f.this.I);
            mediaPlayer.setOnErrorListener(f.this.I);
            float f = !f.this.D ? 1 : 0;
            mediaPlayer.setVolume(f, f);
            f.this.c(mediaPlayer.getDuration());
            f.this.u();
            y yVar = f.this.f16984c;
            if (y.a()) {
                f.this.f16984c.b("AppLovinFullscreenActivity", "MediaPlayer prepared: " + f.this.H);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f fVar = f.this;
            if (view == fVar.f17056x) {
                if (fVar.s()) {
                    f.this.e();
                    f.this.p();
                    f.this.f16999t.b();
                    return;
                }
                f.this.c();
                return;
            }
            if (view == fVar.y) {
                fVar.z();
                return;
            }
            y yVar = fVar.f16984c;
            if (y.a()) {
                f.this.f16984c.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public f(com.applovin.impl.sdk.ad.e eVar, Activity activity, Map<String, Object> map, p pVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.G = new com.applovin.impl.adview.activity.a.c(this.f16982a, this.f16986e, this.f16983b);
        this.B = null;
        b bVar = new b();
        this.I = bVar;
        a aVar = new a();
        this.J = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.K = handler;
        j jVar = new j(handler, this.f16983b);
        this.C = jVar;
        boolean f = this.f16982a.f();
        this.L = f;
        this.D = Utils.isVideoMutedInitially(this.f16983b);
        this.N = -1;
        this.P = new AtomicBoolean();
        this.Q = new AtomicBoolean();
        this.R = -2L;
        this.S = 0L;
        if (eVar.hasVideoUrl()) {
            AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
            this.f17054v = appLovinVideoView;
            appLovinVideoView.setOnPreparedListener(bVar);
            appLovinVideoView.setOnCompletionListener(bVar);
            appLovinVideoView.setOnErrorListener(bVar);
            appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(pVar, com.applovin.impl.sdk.c.b.aZ, activity, bVar));
            c cVar = new c();
            if (eVar.r() >= 0) {
                m mVar = new m(eVar.x(), activity);
                this.f17056x = mVar;
                mVar.setVisibility(8);
                mVar.setOnClickListener(cVar);
            } else {
                this.f17056x = null;
            }
            if (a(this.D, pVar)) {
                ImageView imageView = new ImageView(activity);
                this.y = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setClickable(true);
                imageView.setOnClickListener(cVar);
                e(this.D);
            } else {
                this.y = null;
            }
            String C = eVar.C();
            if (StringUtils.isValidString(C)) {
                w wVar = new w(pVar);
                wVar.a(new WeakReference<>(aVar));
                v vVar = new v(wVar, activity);
                this.f17057z = vVar;
                vVar.a(C);
            } else {
                this.f17057z = null;
            }
            if (f) {
                com.applovin.impl.adview.a aVar2 = new com.applovin.impl.adview.a(activity, ((Integer) pVar.a(com.applovin.impl.sdk.c.b.cP)).intValue(), R.attr.progressBarStyleLarge);
                this.f17055w = aVar2;
                aVar2.setColor(Color.parseColor("#75FFFFFF"));
                aVar2.setBackgroundColor(Color.parseColor("#00000000"));
                aVar2.setVisibility(8);
                AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
            } else {
                this.f17055w = null;
            }
            if (eVar.O()) {
                ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
                this.A = progressBar;
                progressBar.setMax(10000);
                progressBar.setPadding(0, 0, 0, 0);
                if (h.d()) {
                    progressBar.setProgressTintList(ColorStateList.valueOf(eVar.P()));
                }
                jVar.a("PROGRESS_BAR", ((Long) pVar.a(com.applovin.impl.sdk.c.b.cM)).longValue(), new j.a() { // from class: com.applovin.impl.adview.activity.b.f.1
                    @Override // com.applovin.impl.adview.j.a
                    public void a() {
                        f fVar = f.this;
                        if (fVar.F) {
                            fVar.A.setVisibility(8);
                            return;
                        }
                        float currentPosition = fVar.f17054v.getCurrentPosition();
                        f fVar2 = f.this;
                        fVar2.A.setProgress((int) ((currentPosition / ((float) fVar2.E)) * 10000.0f));
                    }

                    @Override // com.applovin.impl.adview.j.a
                    public boolean b() {
                        return !f.this.F;
                    }
                });
                return;
            }
            this.A = null;
            return;
        }
        throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (this.Q.compareAndSet(false, true)) {
            a(this.f17056x, this.f16982a.r(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.5
                @Override // java.lang.Runnable
                public void run() {
                    f.this.R = -1L;
                    f.this.S = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    private void D() {
        v vVar;
        final boolean z10;
        t D = this.f16982a.D();
        if (D != null && D.e() && !this.F && (vVar = this.f17057z) != null) {
            if (vVar.getVisibility() == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            final long f = D.f();
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.6
                @Override // java.lang.Runnable
                public void run() {
                    if (z10) {
                        r.a(f.this.f17057z, f, (Runnable) null);
                    } else {
                        r.b(f.this.f17057z, f, null);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        if (this.F) {
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
        if (this.N >= 0) {
            if (y.a()) {
                this.f16984c.b("AppLovinFullscreenActivity", "Resuming video at position " + this.N + "ms for MediaPlayer: " + this.H);
            }
            this.f17054v.seekTo(this.N);
            this.f17054v.start();
            this.C.a();
            this.N = -1;
            a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.8
                @Override // java.lang.Runnable
                public void run() {
                    com.applovin.impl.adview.a aVar = f.this.f17055w;
                    if (aVar != null) {
                        aVar.a();
                        f.this.a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.8.1
                            @Override // java.lang.Runnable
                            public void run() {
                                f.this.f17055w.b();
                            }
                        }, 2000L);
                    }
                }
            }, 250L);
            return;
        }
        if (y.a()) {
            this.f16984c.b("AppLovinFullscreenActivity", "Invalid last video position");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        this.G.a(this.f16989i);
        this.f16991k = SystemClock.elapsedRealtime();
    }

    public void A() {
        if (y.a()) {
            this.f16984c.b("AppLovinFullscreenActivity", "Showing postitial...");
        }
        d(this.f16982a.aL());
        this.G.a(this.f16988h, this.f16987g, this.f);
        StringBuilder sb2 = new StringBuilder("javascript:al_onPoststitialShow(");
        sb2.append(this.f16993m);
        sb2.append(",");
        a(com.ironsource.adapters.facebook.a.i(sb2, this.f16994n, ");"), this.f16982a.S());
        if (this.f16988h != null) {
            if (this.f16982a.t() >= 0) {
                a(this.f16988h, this.f16982a.t(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.2
                    @Override // java.lang.Runnable
                    public void run() {
                        f.this.f16991k = SystemClock.elapsedRealtime();
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
        this.F = true;
    }

    public int B() {
        long currentPosition = this.f17054v.getCurrentPosition();
        if (this.O) {
            return 100;
        }
        if (currentPosition > 0) {
            return (int) ((((float) currentPosition) / ((float) this.E)) * 100.0f);
        }
        return this.M;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void h() {
        this.C.b();
        this.K.removeCallbacksAndMessages(null);
        m();
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    @SuppressLint({"LongLogTag"})
    public void k() {
        if (y.a()) {
            this.f16984c.c("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (((Boolean) this.f16983b.a(com.applovin.impl.sdk.c.b.fR)).booleanValue()) {
                s.a(this.f17057z);
                this.f17057z = null;
            }
            if (this.L) {
                AppLovinCommunicator.getInstance(this.f16986e).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.f17054v;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.f17054v.stopPlayback();
            }
            MediaPlayer mediaPlayer = this.H;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th) {
            Log.e("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.k();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void m() {
        super.a(B(), this.L, r(), this.R);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j10 = messageData.getLong("ad_id");
            if (((Boolean) this.f16983b.a(com.applovin.impl.sdk.c.b.fy)).booleanValue() && j10 == this.f16982a.getAdIdNumber() && this.L) {
                int i10 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string != null || i10 < 200 || i10 >= 300) && !this.O && !this.f17054v.isPlaying()) {
                    c("Video cache error during stream. ResponseCode=" + i10 + ", exception=" + string);
                }
            }
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public boolean r() {
        if (B() >= this.f16982a.Q()) {
            return true;
        }
        return false;
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
        this.G.a(this.f17057z);
        this.G.a((View) this.f17056x);
        if (!t() || this.F) {
            F();
        }
    }

    public void x() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.9
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.adview.a aVar = f.this.f17055w;
                if (aVar != null) {
                    aVar.a();
                }
            }
        });
    }

    public void y() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.10
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.adview.a aVar = f.this.f17055w;
                if (aVar != null) {
                    aVar.b();
                }
            }
        });
    }

    public void z() {
        int i10;
        MediaPlayer mediaPlayer = this.H;
        if (mediaPlayer == null) {
            return;
        }
        try {
            boolean z10 = false;
            if (!this.D) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            float f = i10;
            mediaPlayer.setVolume(f, f);
            if (!this.D) {
                z10 = true;
            }
            this.D = z10;
            e(z10);
            a(this.D, 0L);
        } catch (Throwable unused) {
        }
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
        this.N = this.f17054v.getCurrentPosition();
        this.f17054v.pause();
        this.C.c();
        if (y.a()) {
            this.f16984c.b("AppLovinFullscreenActivity", "Paused video at position " + this.N + "ms");
        }
    }

    private void d(boolean z10) {
        this.M = B();
        if (z10) {
            this.f17054v.pause();
        } else {
            this.f17054v.stopPlayback();
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
            if (this.F) {
                return;
            }
            e();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        String str;
        this.G.a(this.y, this.f17056x, this.f17057z, this.f17055w, this.A, this.f17054v, this.f, this.f16987g, this.B, viewGroup);
        if (h.g() && (str = this.f16983b.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.AUDIO_FOCUS_REQUEST)) != null) {
            this.f17054v.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        a(!this.L);
        this.f17054v.setVideoURI(this.f16982a.h());
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (this.f16982a.am()) {
            this.f16999t.a(this.f16982a, new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.3
                @Override // java.lang.Runnable
                public void run() {
                    f.this.a(250L);
                }
            });
        }
        u uVar = this.f16987g;
        if (uVar != null) {
            uVar.a();
        }
        this.f17054v.start();
        if (this.L) {
            x();
        }
        this.f.renderAd(this.f16982a);
        this.f16985d.b(this.L ? 1L : 0L);
        if (this.f17056x != null) {
            this.f16983b.M().a(new z(this.f16983b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.4
                @Override // java.lang.Runnable
                public void run() {
                    f.this.C();
                }
            }), o.a.MAIN, this.f16982a.s(), true);
        }
        super.b(this.D);
    }

    private void e(boolean z10) {
        if (h.d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f16986e.getDrawable(z10 ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.y.setScaleType(ImageView.ScaleType.FIT_XY);
                this.y.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aE = z10 ? this.f16982a.aE() : this.f16982a.aF();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.y.setImageURI(aE);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public void c() {
        this.R = SystemClock.elapsedRealtime() - this.S;
        if (y.a()) {
            this.f16984c.b("AppLovinFullscreenActivity", l.n(new StringBuilder("Skipping video with skip time: "), this.R, "ms"));
        }
        this.f16985d.f();
        this.f16993m++;
        if (this.f16982a.y()) {
            h();
        } else {
            A();
        }
    }

    public void c(String str) {
        if (y.a()) {
            y yVar = this.f16984c;
            StringBuilder s10 = l.s("Encountered media error: ", str, " for ad: ");
            s10.append(this.f16982a);
            yVar.e("AppLovinFullscreenActivity", s10.toString());
        }
        if (this.P.compareAndSet(false, true)) {
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.f16997r;
            if (appLovinAdDisplayListener instanceof com.applovin.impl.sdk.ad.h) {
                ((com.applovin.impl.sdk.ad.h) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            h();
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
                k.a(this.f16996q, this.f16982a);
                this.f16985d.b();
                this.f16994n++;
                return;
            }
            return;
        }
        D();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(long j10) {
        a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.7
            @Override // java.lang.Runnable
            public void run() {
                f.this.E();
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
