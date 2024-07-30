package com.applovin.impl.adview.activity.b;

import a3.l;
import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.applovin.impl.adview.m;
import com.applovin.impl.adview.u;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class g extends com.applovin.impl.adview.activity.b.a implements com.applovin.impl.adview.g {
    private double A;
    private double B;
    private final AtomicBoolean C;
    private final AtomicBoolean D;
    private boolean E;
    private long F;
    private long G;

    /* renamed from: v, reason: collision with root package name */
    private final com.applovin.impl.adview.activity.a.d f17074v;

    /* renamed from: w, reason: collision with root package name */
    private final m f17075w;

    /* renamed from: x, reason: collision with root package name */
    private final ImageView f17076x;
    private final com.applovin.impl.adview.a y;

    /* renamed from: z, reason: collision with root package name */
    private final boolean f17077z;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        private a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == g.this.f17075w) {
                if (g.this.s()) {
                    g.this.p();
                    g.this.f16999t.b();
                    return;
                } else {
                    g.this.x();
                    return;
                }
            }
            if (view == g.this.f17076x) {
                g.this.z();
                return;
            }
            y yVar = g.this.f16984c;
            if (y.a()) {
                g.this.f16984c.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public g(com.applovin.impl.sdk.ad.e eVar, Activity activity, Map<String, Object> map, p pVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f17074v = new com.applovin.impl.adview.activity.a.d(this.f16982a, this.f16986e, this.f16983b);
        boolean f = this.f16982a.f();
        this.f17077z = f;
        this.C = new AtomicBoolean();
        this.D = new AtomicBoolean();
        this.E = Utils.isVideoMutedInitially(this.f16983b);
        this.F = -2L;
        this.G = 0L;
        a aVar = new a();
        if (eVar.r() >= 0) {
            m mVar = new m(eVar.x(), activity);
            this.f17075w = mVar;
            mVar.setVisibility(8);
            mVar.setOnClickListener(aVar);
        } else {
            this.f17075w = null;
        }
        if (a(this.E, pVar)) {
            ImageView imageView = new ImageView(activity);
            this.f17076x = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(aVar);
            d(this.E);
        } else {
            this.f17076x = null;
        }
        if (f) {
            com.applovin.impl.adview.a aVar2 = new com.applovin.impl.adview.a(activity, ((Integer) pVar.a(com.applovin.impl.sdk.c.b.cP)).intValue(), R.attr.progressBarStyleLarge);
            this.y = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            aVar2.setBackgroundColor(Color.parseColor("#00000000"));
            aVar2.setVisibility(8);
            return;
        }
        this.y = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        if (this.D.compareAndSet(false, true)) {
            a(this.f17075w, this.f16982a.r(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.3
                @Override // java.lang.Runnable
                public void run() {
                    g.this.F = -1L;
                    g.this.G = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(long j10) {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.g
    public void g_() {
        y();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void h() {
        m();
        super.h();
    }

    @Override // com.applovin.impl.adview.g
    public void h_() {
        com.applovin.impl.adview.a aVar = this.y;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void m() {
        super.a((int) this.A, this.f17077z, r(), this.F);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public boolean r() {
        if (this.A >= this.f16982a.Q()) {
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
                double d10 = this.B;
                if (d10 > 0.0d) {
                    j10 = 0 + TimeUnit.SECONDS.toMillis((long) d10);
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
        this.f17074v.a(this.f16989i);
        this.f16991k = SystemClock.elapsedRealtime();
        this.A = 100.0d;
    }

    public void x() {
        this.F = SystemClock.elapsedRealtime() - this.G;
        if (y.a()) {
            this.f16984c.b("AppLovinFullscreenActivity", l.n(new StringBuilder("Skipping video with skip time: "), this.F, "ms"));
        }
        this.f16985d.f();
        this.f16993m++;
        if (this.f16982a.y()) {
            h();
        } else {
            y();
        }
    }

    public void y() {
        if (this.C.compareAndSet(false, true)) {
            if (y.a()) {
                this.f16984c.b("AppLovinFullscreenActivity", "Showing postitial...");
            }
            b("javascript:al_showPostitial();");
            m mVar = this.f17075w;
            if (mVar != null) {
                mVar.setVisibility(8);
            }
            ImageView imageView = this.f17076x;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            com.applovin.impl.adview.a aVar = this.y;
            if (aVar != null) {
                aVar.b();
            }
            if (this.f16988h != null) {
                if (this.f16982a.t() >= 0) {
                    a(this.f16988h, this.f16982a.t(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.4
                        @Override // java.lang.Runnable
                        public void run() {
                            g.this.f16991k = SystemClock.elapsedRealtime();
                        }
                    });
                } else {
                    this.f16988h.setVisibility(0);
                }
            }
            this.f.getController().n();
            v();
        }
    }

    public void z() {
        this.E = !this.E;
        b("javascript:al_setVideoMuted(" + this.E + ");");
        d(this.E);
        a(this.E, 0L);
    }

    private void d(boolean z10) {
        if (h.d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f16986e.getDrawable(z10 ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f17076x.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f17076x.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aE = z10 ? this.f16982a.aE() : this.f16982a.aF();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.f17076x.setImageURI(aE);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    @Override // com.applovin.impl.adview.g
    public void c() {
        com.applovin.impl.adview.a aVar = this.y;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.applovin.impl.adview.g
    public void b(double d10) {
        this.A = d10;
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        this.f17074v.a(this.f17076x, this.f17075w, this.f16988h, this.y, this.f16987g, this.f, viewGroup);
        this.f.getController().a(this);
        a(false);
        com.applovin.impl.adview.a aVar = this.y;
        if (aVar != null) {
            aVar.a();
        }
        u uVar = this.f16987g;
        if (uVar != null) {
            uVar.a();
        }
        this.f.renderAd(this.f16982a);
        if (this.f17075w != null) {
            this.f16983b.M().a(new z(this.f16983b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.1
                @Override // java.lang.Runnable
                public void run() {
                    g.this.A();
                }
            }), o.a.MAIN, this.f16982a.s(), true);
        }
        this.f16983b.M().a(new z(this.f16983b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.2
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                m mVar = g.this.f16988h;
                if (mVar != null) {
                    arrayList.add(new com.applovin.impl.sdk.a.d(mVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
                }
                u uVar2 = g.this.f16987g;
                if (uVar2 != null && uVar2.b()) {
                    u uVar3 = g.this.f16987g;
                    arrayList.add(new com.applovin.impl.sdk.a.d(uVar3, FriendlyObstructionPurpose.NOT_VISIBLE, uVar3.getIdentifier()));
                }
                g.this.f16982a.o().a(g.this.f, arrayList);
            }
        }), o.a.MAIN, 500L);
        super.b(this.E);
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void b() {
        if (y.a()) {
            this.f16984c.b("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        x();
    }

    @Override // com.applovin.impl.adview.g
    public void a(double d10) {
        b("javascript:al_setVideoMuted(" + this.E + ");");
        com.applovin.impl.adview.a aVar = this.y;
        if (aVar != null) {
            aVar.b();
        }
        if (this.f17075w != null) {
            A();
        }
        this.f.getController().m();
        this.B = d10;
        u();
        if (this.f16982a.am()) {
            this.f16999t.a(this.f16982a, (Runnable) null);
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void e() {
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void a() {
        if (y.a()) {
            this.f16984c.b("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
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
}
