package com.hamkho.livefoot.Activities;

import a0.a;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import com.anythink.nativead.api.ATNative;
import com.anythink.nativead.api.ATNativeAdView;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.api.NativeAd;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.sdk.AppLovinMediationProvider;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.hamkho.livefoot.Activities.MainActivity;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.VideoConfiguration;
import com.huawei.hms.ads.nativead.NativeAdConfiguration;
import com.huawei.hms.ads.nativead.NativeAdLoader;
import com.onesignal.e3;
import m9.e;
import m9.j;
import r6.b;
import t8.l;
import u8.d;
import u8.f;
import u8.g;
import u8.h;

/* loaded from: classes2.dex */
public class MainActivity extends AppCompatActivity {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f21463z = 0;

    /* renamed from: s, reason: collision with root package name */
    public e f21464s;

    /* renamed from: t, reason: collision with root package name */
    public NativeAd f21465t;

    /* renamed from: u, reason: collision with root package name */
    public ATNative f21466u;

    /* renamed from: v, reason: collision with root package name */
    public ATNativePrepareInfo f21467v;

    /* renamed from: w, reason: collision with root package name */
    public MaxNativeAdLoader f21468w;

    /* renamed from: x, reason: collision with root package name */
    public MaxAd f21469x;
    public com.huawei.hms.ads.nativead.NativeAd y;

    public final void c() {
        b bVar = new b(this);
        bVar.setTitle("Quit App");
        AlertController.b bVar2 = bVar.f647a;
        bVar2.f = "Are you sure you want to quit the app?";
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: u8.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                int i11 = MainActivity.f21463z;
                MainActivity.this.finishAffinity();
            }
        };
        bVar2.f576g = "Yes";
        bVar2.f577h = onClickListener;
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: u8.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                int i11 = MainActivity.f21463z;
                dialogInterface.dismiss();
            }
        };
        bVar2.f578i = "No";
        bVar2.f579j = onClickListener2;
        bVar.create().show();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        c();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
        int i10 = R.id.Back;
        ImageView imageView = (ImageView) a.H0(R.id.Back, inflate);
        if (imageView != null) {
            i10 = R.id.Banner;
            LinearLayout linearLayout = (LinearLayout) a.H0(R.id.Banner, inflate);
            if (linearLayout != null) {
                i10 = R.id.LiveEvents;
                CardView cardView = (CardView) a.H0(R.id.LiveEvents, inflate);
                if (cardView != null) {
                    i10 = R.id.NativeContainer;
                    FrameLayout frameLayout = (FrameLayout) a.H0(R.id.NativeContainer, inflate);
                    if (frameLayout != null) {
                        i10 = R.id.Shimmer;
                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) a.H0(R.id.Shimmer, inflate);
                        if (shimmerFrameLayout != null) {
                            i10 = R.id.Watch;
                            AppCompatButton appCompatButton = (AppCompatButton) a.H0(R.id.Watch, inflate);
                            if (appCompatButton != null) {
                                i10 = R.id.native_ad_view;
                                ATNativeAdView aTNativeAdView = (ATNativeAdView) a.H0(R.id.native_ad_view, inflate);
                                if (aTNativeAdView != null) {
                                    i10 = R.id.native_selfrender_view;
                                    View H0 = a.H0(R.id.native_selfrender_view, inflate);
                                    if (H0 != null) {
                                        j a10 = j.a(H0);
                                        i10 = R.id.ntv;
                                        CardView cardView2 = (CardView) a.H0(R.id.ntv, inflate);
                                        if (cardView2 != null) {
                                            RelativeLayout relativeLayout = (RelativeLayout) inflate;
                                            this.f21464s = new e(relativeLayout, imageView, linearLayout, cardView, frameLayout, shimmerFrameLayout, appCompatButton, aTNativeAdView, a10, cardView2);
                                            setContentView(relativeLayout);
                                            t8.a.e(this, this.f21464s.f32989b);
                                            e eVar = this.f21464s;
                                            FrameLayout frameLayout2 = eVar.f32991d;
                                            i9.a aVar = l.f35591b;
                                            int i11 = 2;
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
                                                                builder.setNativeAdLoadedListener(new h(this, this, frameLayout2)).setAdListener(new g(this));
                                                                builder.build().loadAds(new AdParam.Builder().build(), 5);
                                                                builder.setNativeAdOptions(new NativeAdConfiguration.Builder().setVideoConfiguration(new VideoConfiguration.Builder().setStartMuted(true).build()).build());
                                                                break;
                                                            }
                                                            break;
                                                        case 1:
                                                            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(l.f35591b.k(), this);
                                                            this.f21468w = maxNativeAdLoader;
                                                            maxNativeAdLoader.setNativeAdListener(new d(this, frameLayout2));
                                                            this.f21468w.loadAd();
                                                            break;
                                                        case 2:
                                                            String s10 = l.f35591b.s();
                                                            ATNativeAdView aTNativeAdView2 = eVar.f32993g;
                                                            ATNative aTNative = new ATNative(this, s10, new u8.e(this, aTNativeAdView2, this, eVar.f32994h));
                                                            this.f21466u = aTNative;
                                                            aTNative.setAdSourceStatusListener(new f(aTNativeAdView2));
                                                            this.f21466u.makeAdRequest();
                                                            break;
                                                    }
                                                }
                                            } else {
                                                eVar.f32995i.setVisibility(8);
                                                this.f21464s.f32992e.b();
                                                this.f21464s.f32992e.setVisibility(8);
                                            }
                                            this.f21464s.f32990c.setVisibility(0);
                                            this.f21464s.f.setOnClickListener(new x8.b(this, i11));
                                            this.f21464s.f32990c.setOnClickListener(new com.anythink.basead.ui.d(this, 3));
                                            e3.f26757g = 7;
                                            e3.f = 1;
                                            e3.y(this);
                                            e3.P(l.f35592c.a());
                                            e3.G(false, null);
                                            this.f21464s.f32988a.setOnClickListener(new com.anythink.basead.ui.e(this, 4));
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
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        t8.a.a();
        NativeAd nativeAd = this.f21465t;
        if (nativeAd != null) {
            nativeAd.destory();
        }
        com.huawei.hms.ads.nativead.NativeAd nativeAd2 = this.y;
        if (nativeAd2 != null) {
            nativeAd2.destroy();
        }
    }
}
