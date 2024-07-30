package com.hamkho.livefoot.Activities.SoccerLive;

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
import b9.c;
import b9.f;
import b9.g;
import b9.h;
import b9.i;
import com.anythink.basead.ui.d;
import com.anythink.nativead.api.ATNative;
import com.anythink.nativead.api.ATNativeAdView;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bumptech.glide.b;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.VideoConfiguration;
import com.huawei.hms.ads.nativead.NativeAd;
import com.huawei.hms.ads.nativead.NativeAdConfiguration;
import com.huawei.hms.ads.nativead.NativeAdLoader;
import com.huawei.hms.ads.reward.RewardAd;
import m9.a;
import m9.j;
import t8.l;

/* loaded from: classes2.dex */
public class ChannelDetailActivity extends AppCompatActivity {
    public static final /* synthetic */ int B = 0;
    public NativeAd A;

    /* renamed from: s, reason: collision with root package name */
    public a f21470s;

    /* renamed from: t, reason: collision with root package name */
    public RewardAd f21471t;

    /* renamed from: u, reason: collision with root package name */
    public String f21472u;

    /* renamed from: v, reason: collision with root package name */
    public com.anythink.nativead.api.NativeAd f21473v;

    /* renamed from: w, reason: collision with root package name */
    public ATNative f21474w;

    /* renamed from: x, reason: collision with root package name */
    public ATNativePrepareInfo f21475x;
    public MaxNativeAdLoader y;

    /* renamed from: z, reason: collision with root package name */
    public MaxAd f21476z;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finishAndRemoveTask();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = 0;
        View inflate = getLayoutInflater().inflate(R.layout.activity_channel_detail, (ViewGroup) null, false);
        int i11 = R.id.Back;
        ImageView imageView = (ImageView) a0.a.H0(R.id.Back, inflate);
        if (imageView != null) {
            i11 = R.id.Banner;
            LinearLayout linearLayout = (LinearLayout) a0.a.H0(R.id.Banner, inflate);
            if (linearLayout != null) {
                i11 = R.id.ChannelDescription;
                TextView textView = (TextView) a0.a.H0(R.id.ChannelDescription, inflate);
                if (textView != null) {
                    i11 = R.id.ChannelImage;
                    ImageView imageView2 = (ImageView) a0.a.H0(R.id.ChannelImage, inflate);
                    if (imageView2 != null) {
                        i11 = R.id.ChannelName;
                        TextView textView2 = (TextView) a0.a.H0(R.id.ChannelName, inflate);
                        if (textView2 != null) {
                            i11 = R.id.NativeContainer;
                            FrameLayout frameLayout = (FrameLayout) a0.a.H0(R.id.NativeContainer, inflate);
                            if (frameLayout != null) {
                                i11 = R.id.Shimmer;
                                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) a0.a.H0(R.id.Shimmer, inflate);
                                if (shimmerFrameLayout != null) {
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
                                                    this.f21470s = new a(relativeLayout2, imageView, linearLayout, textView, imageView2, textView2, frameLayout, shimmerFrameLayout, aTNativeAdView, a10, cardView, relativeLayout);
                                                    setContentView(relativeLayout2);
                                                    if (this.f21471t == null) {
                                                        this.f21471t = new RewardAd(this, l.f35591b.e());
                                                    }
                                                    this.f21471t.loadAd(new AdParam.Builder().build(), new c());
                                                    this.f21470s.f32950a.setOnClickListener(new d(this, 4));
                                                    t8.a.e(this, this.f21470s.f32951b);
                                                    a aVar = this.f21470s;
                                                    FrameLayout frameLayout2 = aVar.f;
                                                    i9.a aVar2 = l.f35591b;
                                                    if (aVar2 != null) {
                                                        if (aVar2.t()) {
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
                                                                        builder.setNativeAdLoadedListener(new b9.j(this, this, frameLayout2)).setAdListener(new i(this));
                                                                        builder.build().loadAds(new AdParam.Builder().build(), 5);
                                                                        builder.setNativeAdOptions(new NativeAdConfiguration.Builder().setVideoConfiguration(new VideoConfiguration.Builder().setStartMuted(true).build()).build());
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(l.f35591b.k(), this);
                                                                    this.y = maxNativeAdLoader;
                                                                    maxNativeAdLoader.setNativeAdListener(new f(this, frameLayout2));
                                                                    this.y.loadAd();
                                                                    break;
                                                                case 2:
                                                                    String s10 = l.f35591b.s();
                                                                    ATNativeAdView aTNativeAdView2 = aVar.f32956h;
                                                                    ATNative aTNative = new ATNative(this, s10, new g(this, aTNativeAdView2, this, aVar.f32957i));
                                                                    this.f21474w = aTNative;
                                                                    aTNative.setAdSourceStatusListener(new h(aTNativeAdView2));
                                                                    this.f21474w.makeAdRequest();
                                                                    break;
                                                            }
                                                        }
                                                    } else {
                                                        aVar.f32958j.setVisibility(8);
                                                        this.f21470s.f32955g.b();
                                                        this.f21470s.f32955g.setVisibility(8);
                                                    }
                                                    String stringExtra = getIntent().getStringExtra("ChannelName");
                                                    this.f21472u = getIntent().getStringExtra("ChannelLink");
                                                    String stringExtra2 = getIntent().getStringExtra("ChannelLogo");
                                                    String stringExtra3 = getIntent().getStringExtra("ChannelDescription");
                                                    String stringExtra4 = getIntent().getStringExtra("Play_In");
                                                    this.f21470s.f32954e.setText(stringExtra);
                                                    this.f21470s.f32952c.setText(stringExtra3);
                                                    b.c(this).d(this).k(stringExtra2).u(this.f21470s.f32953d);
                                                    this.f21470s.f32959k.setOnClickListener(new b9.a(this, stringExtra4, i10));
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
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        t8.a.a();
        com.anythink.nativead.api.NativeAd nativeAd = this.f21473v;
        if (nativeAd != null) {
            nativeAd.destory();
        }
        NativeAd nativeAd2 = this.A;
        if (nativeAd2 != null) {
            nativeAd2.destroy();
        }
    }
}
