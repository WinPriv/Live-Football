package com.hamkho.livefoot.Activities.FootballScores.AllScores;

import android.os.AsyncTask;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.anythink.nativead.api.ATNative;
import com.anythink.nativead.api.ATNativeAdView;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.api.NativeAd;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.sdk.AppLovinMediationProvider;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.VideoConfiguration;
import com.huawei.hms.ads.nativead.NativeAdConfiguration;
import com.huawei.hms.ads.nativead.NativeAdLoader;
import java.io.IOException;
import java.util.ArrayList;
import m9.f;
import m9.j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import t8.l;
import z8.c;
import z8.d;
import z8.e;

/* loaded from: classes2.dex */
public class MatchDetails extends AppCompatActivity {
    public static final /* synthetic */ int I = 0;
    public String A;
    public String B;
    public NativeAd C;
    public ATNative D;
    public ATNativePrepareInfo E;
    public MaxNativeAdLoader F;
    public MaxAd G;
    public com.huawei.hms.ads.nativead.NativeAd H;

    /* renamed from: s, reason: collision with root package name */
    public f f21452s;

    /* renamed from: v, reason: collision with root package name */
    public String f21455v;

    /* renamed from: w, reason: collision with root package name */
    public f9.b f21456w;
    public String y;

    /* renamed from: z, reason: collision with root package name */
    public String f21458z;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21453t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21454u = false;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f21457x = new ArrayList();

    /* loaded from: classes2.dex */
    public class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) {
            MatchDetails matchDetails = MatchDetails.this;
            try {
                Document document = Jsoup.connect("https://azscore.com" + matchDetails.f21455v.replace("football/game/", "football/predictions/").replaceAll("\\s+", "")).userAgent("chrome").timeout(10000).get();
                try {
                    if (!document.select("section.newPredictions__textSection").first().select("div.seoText").text().isEmpty() && document.select("section.newPredictions__textSection").first().select("div.seoText").text() != null) {
                        matchDetails.B = document.select("section.newPredictions__textSection").first().select("div.seoText").text();
                        return null;
                    }
                    matchDetails.B = "";
                    return null;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    matchDetails.f21454u = true;
                    return null;
                }
            } catch (IOException e11) {
                e11.printStackTrace();
                matchDetails.f21454u = true;
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r32) {
            super.onPostExecute(r32);
            MatchDetails matchDetails = MatchDetails.this;
            matchDetails.f21452s.f33001g.setText(matchDetails.B);
            matchDetails.f21452s.f32996a.b();
            matchDetails.f21452s.f32996a.setVisibility(8);
            if (matchDetails.f21454u) {
                matchDetails.f21452s.f33007m.setVisibility(8);
                matchDetails.f21452s.f33008n.setVisibility(8);
            }
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            MatchDetails matchDetails = MatchDetails.this;
            matchDetails.f21455v = matchDetails.getIntent().getStringExtra("MatchLink");
            super.onPreExecute();
        }
    }

    /* loaded from: classes2.dex */
    public class b extends AsyncTask<Void, Void, Void> {
        public b() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(17:6|7|8|(12:13|14|(9:19|20|(1:22)(2:33|(1:35)(2:36|(1:38)(2:39|(1:41)(2:42|(1:44)(1:45)))))|23|24|25|26|28|29)|46|20|(0)(0)|23|24|25|26|28|29)|47|14|(10:16|19|20|(0)(0)|23|24|25|26|28|29)|46|20|(0)(0)|23|24|25|26|28|29|4) */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0125, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x012a, code lost:
        
            r0.printStackTrace();
            r9.f21453t = true;
            android.util.Log.d("Amehry1998", "second crash");
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b0 A[Catch: Exception -> 0x0127, TryCatch #0 {Exception -> 0x0127, blocks: (B:8:0x0054, B:10:0x0062, B:13:0x006d, B:14:0x007a, B:16:0x0088, B:19:0x0093, B:20:0x00a0, B:22:0x00b0, B:23:0x0107, B:33:0x00b5, B:35:0x00c5, B:36:0x00ca, B:38:0x00da, B:39:0x00df, B:41:0x00ef, B:42:0x00f4, B:44:0x0102, B:45:0x0105, B:46:0x009e, B:47:0x0078), top: B:7:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b5 A[Catch: Exception -> 0x0127, TryCatch #0 {Exception -> 0x0127, blocks: (B:8:0x0054, B:10:0x0062, B:13:0x006d, B:14:0x007a, B:16:0x0088, B:19:0x0093, B:20:0x00a0, B:22:0x00b0, B:23:0x0107, B:33:0x00b5, B:35:0x00c5, B:36:0x00ca, B:38:0x00da, B:39:0x00df, B:41:0x00ef, B:42:0x00f4, B:44:0x0102, B:45:0x0105, B:46:0x009e, B:47:0x0078), top: B:7:0x0054 }] */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Void doInBackground(java.lang.Void[] r18) {
            /*
                Method dump skipped, instructions count: 324
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hamkho.livefoot.Activities.FootballScores.AllScores.MatchDetails.b.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r62) {
            super.onPostExecute(r62);
            MatchDetails matchDetails = MatchDetails.this;
            matchDetails.f21456w = new f9.b(matchDetails, matchDetails.f21457x);
            if (matchDetails.f21453t) {
                matchDetails.f21452s.f32999d.setVisibility(0);
                matchDetails.f21452s.f.b();
                matchDetails.f21452s.f.setVisibility(8);
                matchDetails.f21452s.f33000e.setVisibility(8);
                return;
            }
            matchDetails.f21452s.f.b();
            matchDetails.f21452s.f.setVisibility(8);
            matchDetails.f21452s.f33000e.setVisibility(0);
            matchDetails.f21452s.f33000e.setLayoutManager(new LinearLayoutManager(1));
            matchDetails.f21452s.f33000e.setAdapter(matchDetails.f21456w);
            if (matchDetails.f21456w.getItemCount() == 0) {
                matchDetails.f21452s.f32999d.setVisibility(0);
            } else {
                matchDetails.f21452s.f32999d.setVisibility(8);
            }
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            MatchDetails matchDetails = MatchDetails.this;
            matchDetails.f21455v = matchDetails.getIntent().getStringExtra("MatchLink");
            super.onPreExecute();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finishAndRemoveTask();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_match_details, (ViewGroup) null, false);
        int i10 = R.id.ABoutShimmer;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) a0.a.H0(R.id.ABoutShimmer, inflate);
        if (shimmerFrameLayout != null) {
            i10 = R.id.Back;
            ImageView imageView = (ImageView) a0.a.H0(R.id.Back, inflate);
            if (imageView != null) {
                i10 = R.id.Banner;
                LinearLayout linearLayout = (LinearLayout) a0.a.H0(R.id.Banner, inflate);
                if (linearLayout != null) {
                    i10 = R.id.Empty1;
                    LinearLayout linearLayout2 = (LinearLayout) a0.a.H0(R.id.Empty1, inflate);
                    if (linearLayout2 != null) {
                        i10 = R.id.FirstHalfItems;
                        RecyclerView recyclerView = (RecyclerView) a0.a.H0(R.id.FirstHalfItems, inflate);
                        if (recyclerView != null) {
                            i10 = R.id.FirstHalfShimmer;
                            ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) a0.a.H0(R.id.FirstHalfShimmer, inflate);
                            if (shimmerFrameLayout2 != null) {
                                i10 = R.id.MatchDetails;
                                TextView textView = (TextView) a0.a.H0(R.id.MatchDetails, inflate);
                                if (textView != null) {
                                    i10 = R.id.NativeContainer;
                                    FrameLayout frameLayout = (FrameLayout) a0.a.H0(R.id.NativeContainer, inflate);
                                    if (frameLayout != null) {
                                        i10 = R.id.Shimmer;
                                        ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) a0.a.H0(R.id.Shimmer, inflate);
                                        if (shimmerFrameLayout3 != null) {
                                            i10 = R.id.native_ad_view;
                                            ATNativeAdView aTNativeAdView = (ATNativeAdView) a0.a.H0(R.id.native_ad_view, inflate);
                                            if (aTNativeAdView != null) {
                                                i10 = R.id.native_selfrender_view;
                                                View H0 = a0.a.H0(R.id.native_selfrender_view, inflate);
                                                if (H0 != null) {
                                                    j a10 = j.a(H0);
                                                    i10 = R.id.ntv;
                                                    CardView cardView = (CardView) a0.a.H0(R.id.ntv, inflate);
                                                    if (cardView != null) {
                                                        i10 = R.id.t12;
                                                        TextView textView2 = (TextView) a0.a.H0(R.id.t12, inflate);
                                                        if (textView2 != null) {
                                                            i10 = R.id.t13;
                                                            RelativeLayout relativeLayout = (RelativeLayout) a0.a.H0(R.id.t13, inflate);
                                                            if (relativeLayout != null) {
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) inflate;
                                                                this.f21452s = new f(relativeLayout2, shimmerFrameLayout, imageView, linearLayout, linearLayout2, recyclerView, shimmerFrameLayout2, textView, frameLayout, shimmerFrameLayout3, aTNativeAdView, a10, cardView, textView2, relativeLayout);
                                                                setContentView(relativeLayout2);
                                                                this.f21452s.f32997b.setOnClickListener(new b7.a(this, 3));
                                                                t8.a.e(this, this.f21452s.f32998c);
                                                                f fVar = this.f21452s;
                                                                FrameLayout frameLayout2 = fVar.f33002h;
                                                                i9.a aVar = l.f35591b;
                                                                int i11 = 1;
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
                                                                                    builder.setNativeAdLoadedListener(new z8.f(this, this, frameLayout2)).setAdListener(new e(this));
                                                                                    builder.build().loadAds(new AdParam.Builder().build(), 5);
                                                                                    builder.setNativeAdOptions(new NativeAdConfiguration.Builder().setVideoConfiguration(new VideoConfiguration.Builder().setStartMuted(true).build()).build());
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 1:
                                                                                MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(l.f35591b.k(), this);
                                                                                this.F = maxNativeAdLoader;
                                                                                maxNativeAdLoader.setNativeAdListener(new z8.b(this, frameLayout2));
                                                                                this.F.loadAd();
                                                                                break;
                                                                            case 2:
                                                                                String s10 = l.f35591b.s();
                                                                                ATNativeAdView aTNativeAdView2 = fVar.f33004j;
                                                                                ATNative aTNative = new ATNative(this, s10, new c(this, aTNativeAdView2, this, fVar.f33005k));
                                                                                this.D = aTNative;
                                                                                aTNative.setAdSourceStatusListener(new d(aTNativeAdView2));
                                                                                this.D.makeAdRequest();
                                                                                break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    fVar.f33006l.setVisibility(8);
                                                                    this.f21452s.f33003i.b();
                                                                    this.f21452s.f33003i.setVisibility(8);
                                                                }
                                                                this.f21452s.f32997b.setOnClickListener(new x8.b(this, i11));
                                                                new b().execute(new Void[0]);
                                                                new a().execute(new Void[0]);
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
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        t8.a.a();
        NativeAd nativeAd = this.C;
        if (nativeAd != null) {
            nativeAd.destory();
        }
        com.huawei.hms.ads.nativead.NativeAd nativeAd2 = this.H;
        if (nativeAd2 != null) {
            nativeAd2.destroy();
        }
    }
}
