package com.hamkho.livefoot.Activities.SoccerLive;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import b9.m;
import b9.o;
import b9.p;
import b9.q;
import b9.r;
import b9.s;
import b9.t;
import com.anythink.nativead.api.ATNative;
import com.anythink.nativead.api.ATNativeAdView;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.sdk.AppLovinMediationProvider;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.VideoConfiguration;
import com.huawei.hms.ads.nativead.NativeAd;
import com.huawei.hms.ads.nativead.NativeAdConfiguration;
import com.huawei.hms.ads.nativead.NativeAdLoader;
import com.huawei.hms.ads.reward.RewardAd;
import m9.j;
import p3.f;
import t8.l;

/* loaded from: classes2.dex */
public class EventDetailActivity extends AppCompatActivity {
    public static final /* synthetic */ int B = 0;
    public NativeAd A;

    /* renamed from: s, reason: collision with root package name */
    public m9.b f21481s;

    /* renamed from: t, reason: collision with root package name */
    public RewardAd f21482t;

    /* renamed from: u, reason: collision with root package name */
    public String f21483u;

    /* renamed from: v, reason: collision with root package name */
    public com.anythink.nativead.api.NativeAd f21484v;

    /* renamed from: w, reason: collision with root package name */
    public ATNative f21485w;

    /* renamed from: x, reason: collision with root package name */
    public ATNativePrepareInfo f21486x;
    public MaxNativeAdLoader y;

    /* renamed from: z, reason: collision with root package name */
    public MaxAd f21487z;

    /* loaded from: classes2.dex */
    public class a implements f<Drawable> {
        public a() {
        }

        @Override // p3.f
        public final /* bridge */ /* synthetic */ void a(Object obj) {
        }

        @Override // p3.f
        public final void b() {
            EventDetailActivity.this.f21481s.f.setImageResource(R.drawable.teamlogoholder);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements f<Drawable> {
        public b() {
        }

        @Override // p3.f
        public final /* bridge */ /* synthetic */ void a(Object obj) {
        }

        @Override // p3.f
        public final void b() {
            EventDetailActivity.this.f21481s.f.setImageResource(R.drawable.teamlogoholder);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finishAndRemoveTask();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = 0;
        View inflate = getLayoutInflater().inflate(R.layout.activity_event_detail, (ViewGroup) null, false);
        int i11 = R.id.Back;
        ImageView imageView = (ImageView) a0.a.H0(R.id.Back, inflate);
        if (imageView != null) {
            i11 = R.id.Banner;
            LinearLayout linearLayout = (LinearLayout) a0.a.H0(R.id.Banner, inflate);
            if (linearLayout != null) {
                i11 = R.id.EventDescription;
                TextView textView = (TextView) a0.a.H0(R.id.EventDescription, inflate);
                if (textView != null) {
                    i11 = R.id.MatchTime;
                    if (((TextView) a0.a.H0(R.id.MatchTime, inflate)) != null) {
                        i11 = R.id.NativeContainer;
                        FrameLayout frameLayout = (FrameLayout) a0.a.H0(R.id.NativeContainer, inflate);
                        if (frameLayout != null) {
                            i11 = R.id.Shimmer;
                            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) a0.a.H0(R.id.Shimmer, inflate);
                            if (shimmerFrameLayout != null) {
                                i11 = R.id.Team1Logo;
                                ImageView imageView2 = (ImageView) a0.a.H0(R.id.Team1Logo, inflate);
                                if (imageView2 != null) {
                                    i11 = R.id.Team1Name;
                                    TextView textView2 = (TextView) a0.a.H0(R.id.Team1Name, inflate);
                                    if (textView2 != null) {
                                        i11 = R.id.Team2Logo;
                                        ImageView imageView3 = (ImageView) a0.a.H0(R.id.Team2Logo, inflate);
                                        if (imageView3 != null) {
                                            i11 = R.id.Team2Name;
                                            TextView textView3 = (TextView) a0.a.H0(R.id.Team2Name, inflate);
                                            if (textView3 != null) {
                                                i11 = R.id.linearLayout;
                                                if (((LinearLayout) a0.a.H0(R.id.linearLayout, inflate)) != null) {
                                                    i11 = R.id.native_ad_view;
                                                    ATNativeAdView aTNativeAdView = (ATNativeAdView) a0.a.H0(R.id.native_ad_view, inflate);
                                                    if (aTNativeAdView != null) {
                                                        i11 = R.id.native_selfrender_view;
                                                        View H0 = a0.a.H0(R.id.native_selfrender_view, inflate);
                                                        if (H0 != null) {
                                                            j a10 = j.a(H0);
                                                            i11 = R.id.ntv;
                                                            CardView cardView = (CardView) a0.a.H0(R.id.ntv, inflate);
                                                            if (cardView != null) {
                                                                i11 = R.id.play;
                                                                RelativeLayout relativeLayout = (RelativeLayout) a0.a.H0(R.id.play, inflate);
                                                                if (relativeLayout != null) {
                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) inflate;
                                                                    this.f21481s = new m9.b(relativeLayout2, imageView, linearLayout, textView, frameLayout, shimmerFrameLayout, imageView2, textView2, imageView3, textView3, aTNativeAdView, a10, cardView, relativeLayout);
                                                                    setContentView(relativeLayout2);
                                                                    if (this.f21482t == null) {
                                                                        this.f21482t = new RewardAd(this, l.f35591b.e());
                                                                    }
                                                                    this.f21482t.loadAd(new AdParam.Builder().build(), new t());
                                                                    this.f21481s.f32960a.setOnClickListener(new b7.a(this, 4));
                                                                    m9.b bVar = this.f21481s;
                                                                    FrameLayout frameLayout2 = bVar.f32963d;
                                                                    i9.a aVar = l.f35591b;
                                                                    if (aVar != null) {
                                                                        if (aVar.t()) {
                                                                            String n10 = l.f35591b.n();
                                                                            n10.getClass();
                                                                            char c10 = 65535;
                                                                            switch (n10.hashCode()) {
                                                                                case 3343:
                                                                                    if (n10.equals("hw")) {
                                                                                        c10 = 0;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                case 107876:
                                                                                    if (n10.equals(AppLovinMediationProvider.MAX)) {
                                                                                        c10 = 1;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                case 110546420:
                                                                                    if (n10.equals("topon")) {
                                                                                        c10 = 2;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            switch (c10) {
                                                                                case 0:
                                                                                    if (l.f35591b.t()) {
                                                                                        NativeAdLoader.Builder builder = new NativeAdLoader.Builder(this, l.f35591b.d());
                                                                                        builder.setNativeAdLoadedListener(new s(this, this, frameLayout2)).setAdListener(new r(this));
                                                                                        builder.build().loadAds(new AdParam.Builder().build(), 5);
                                                                                        builder.setNativeAdOptions(new NativeAdConfiguration.Builder().setVideoConfiguration(new VideoConfiguration.Builder().setStartMuted(true).build()).build());
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                case 1:
                                                                                    MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(l.f35591b.k(), this);
                                                                                    this.y = maxNativeAdLoader;
                                                                                    maxNativeAdLoader.setNativeAdListener(new o(this, frameLayout2));
                                                                                    this.y.loadAd();
                                                                                    break;
                                                                                case 2:
                                                                                    String s10 = l.f35591b.s();
                                                                                    ATNativeAdView aTNativeAdView2 = bVar.f32968j;
                                                                                    ATNative aTNative = new ATNative(this, s10, new p(this, aTNativeAdView2, this, bVar.f32969k));
                                                                                    this.f21485w = aTNative;
                                                                                    aTNative.setAdSourceStatusListener(new q(aTNativeAdView2));
                                                                                    this.f21485w.makeAdRequest();
                                                                                    break;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        bVar.f32970l.setVisibility(8);
                                                                        this.f21481s.f32964e.b();
                                                                        this.f21481s.f32964e.setVisibility(8);
                                                                    }
                                                                    t8.a.e(this, this.f21481s.f32961b);
                                                                    String stringExtra = getIntent().getStringExtra("Team1Name");
                                                                    String stringExtra2 = getIntent().getStringExtra("Team2Name");
                                                                    String stringExtra3 = getIntent().getStringExtra("Team1Logo");
                                                                    String stringExtra4 = getIntent().getStringExtra("Team2Logo");
                                                                    this.f21483u = getIntent().getStringExtra("EventLink");
                                                                    String stringExtra5 = getIntent().getStringExtra("EventDescription");
                                                                    String stringExtra6 = getIntent().getStringExtra("Play_In");
                                                                    this.f21481s.f32965g.setText(stringExtra);
                                                                    this.f21481s.f32967i.setText(stringExtra2);
                                                                    this.f21481s.f32962c.setText(stringExtra5);
                                                                    com.bumptech.glide.b.c(this).d(this).k(stringExtra3).w(new a()).u(this.f21481s.f);
                                                                    com.bumptech.glide.b.c(this).d(this).k(stringExtra4).w(new b()).u(this.f21481s.f32966h);
                                                                    this.f21481s.f32971m.setOnClickListener(new m(this, stringExtra6, i10));
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        t8.a.a();
        com.anythink.nativead.api.NativeAd nativeAd = this.f21484v;
        if (nativeAd != null) {
            nativeAd.destory();
        }
        NativeAd nativeAd2 = this.A;
        if (nativeAd2 != null) {
            nativeAd2.destroy();
        }
    }
}
