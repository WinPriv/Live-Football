package com.huawei.hms.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import com.huawei.hms.ads.dt;
import com.huawei.openalliance.ad.beans.inner.AnalysisEventReport;
import com.huawei.openalliance.ad.beans.inner.SourceParam;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.views.PPSBannerView;
import ga.d;
import gb.c0;
import gb.h0;
import gb.r0;
import gb.w0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ia extends fz<jv> implements iq<jv> {
    private int B;
    private fa.k C;
    private RequestOptions D;
    private com.huawei.openalliance.ad.inter.data.e F;
    private Location L;
    private Context S;

    /* renamed from: a, reason: collision with root package name */
    private com.huawei.openalliance.ad.inter.data.n f21716a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f21717b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f21718c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f21719d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21720e = false;
    private String f;

    public ia(Context context, jv jvVar) {
        Code((ia) jvVar);
        this.S = context != null ? context.getApplicationContext() : context;
    }

    private SourceParam Code(com.huawei.openalliance.ad.inter.data.h hVar) {
        if (hVar == null) {
            return null;
        }
        ec Code = ec.Code(this.S);
        SourceParam sourceParam = new SourceParam();
        sourceParam.i(hVar.f22260s);
        sourceParam.k(hVar.f22263v);
        sourceParam.l(hVar.f22264w);
        sourceParam.h();
        sourceParam.c(Code == null ? 52428800 : Code.q());
        return sourceParam;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        com.huawei.openalliance.ad.inter.data.e eVar = this.F;
        if (eVar == null) {
            ex.I("BannerPresenter", "downLoadBitmap nativeAd is null");
            Code(499);
            return;
        }
        List<com.huawei.openalliance.ad.inter.data.h> Z = eVar.Z();
        if (androidx.transition.n.h(Z)) {
            ex.I("BannerPresenter", "downLoadBitmap imageInfo is null");
            Code(499);
            return;
        }
        final com.huawei.openalliance.ad.inter.data.h hVar = Z.get(0);
        Code(this.F);
        SourceParam Code = Code(hVar);
        Code.d(this.Code);
        w0.f(this.S, Code, new gb.j() { // from class: com.huawei.hms.ads.ia.5
            @Override // gb.j
            public void Code() {
                ex.I("BannerPresenter", "loadImage onFail");
                ia.this.Code(499);
            }

            @Override // gb.j
            public void Code(String str, final Drawable drawable) {
                if (TextUtils.equals(str, hVar.f22260s)) {
                    gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.ia.5.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ia.this.I().Code(drawable, ia.this.F);
                        }
                    });
                }
            }
        }, this.F.L(), this.F.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        com.huawei.openalliance.ad.inter.data.e eVar;
        String str;
        final long parseLong;
        if (this.B != 1 && (eVar = this.F) != null) {
            if (eVar instanceof com.huawei.openalliance.ad.inter.data.j) {
                str = ((com.huawei.openalliance.ad.inter.data.j) eVar).a0();
            } else {
                str = null;
            }
            ex.V("BannerPresenter", "setBannerRefresh: %s", str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if ("N".equalsIgnoreCase(str)) {
                parseLong = 0;
            } else if ("Y".equalsIgnoreCase(str)) {
                parseLong = ec.Code(this.S).o();
            } else {
                try {
                    parseLong = Long.parseLong(str);
                } catch (NumberFormatException e10) {
                    ex.I("BannerPresenter", "parseIntOrDefault exception: ".concat(e10.getClass().getSimpleName()));
                    return;
                }
            }
            gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.ia.4
                @Override // java.lang.Runnable
                public void run() {
                    ia.this.I().Code(parseLong);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(final Context context, final ImageView imageView, final Drawable drawable) {
        c0.c(new Runnable() { // from class: com.huawei.hms.ads.ia.8
            @Override // java.lang.Runnable
            public void run() {
                final BitmapDrawable g6 = a0.a.g(context, drawable);
                gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.ia.8.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setBackground(g6);
                    }
                });
            }
        });
    }

    @Override // com.huawei.hms.ads.iq
    public boolean C() {
        if (!r0.c(this.S)) {
            return false;
        }
        return true;
    }

    @Override // com.huawei.hms.ads.iq
    public void I(Integer num) {
        this.f21719d = num;
    }

    @Override // com.huawei.hms.ads.iq
    public void V(Integer num) {
        this.f21718c = num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.huawei.openalliance.ad.inter.data.e Code(Map<String, List<com.huawei.openalliance.ad.inter.data.e>> map) {
        if (map == null) {
            return null;
        }
        Iterator<Map.Entry<String, List<com.huawei.openalliance.ad.inter.data.e>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<com.huawei.openalliance.ad.inter.data.e> it2 = it.next().getValue().iterator();
            if (it2.hasNext()) {
                return it2.next();
            }
        }
        return null;
    }

    @Override // com.huawei.hms.ads.iq
    public void V(String str) {
        this.f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code(final int i10) {
        gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.ia.6
            @Override // java.lang.Runnable
            public void run() {
                ia.this.I().Code(i10);
                if (i10 == 499) {
                    ia.this.I().B();
                }
            }
        });
    }

    @Override // com.huawei.hms.ads.iq
    public void Code(final Context context, final ImageView imageView, Drawable drawable) {
        if (this.f21720e) {
            try {
                if (drawable instanceof BitmapDrawable) {
                    imageView.setBackground(a0.a.g(context, drawable));
                } else if (drawable instanceof dt) {
                    ((dt) drawable).Code(new dt.a() { // from class: com.huawei.hms.ads.ia.7
                        @Override // com.huawei.hms.ads.dt.a
                        public void Code(Bitmap bitmap) {
                            ia.this.V(context, imageView, new BitmapDrawable(context.getResources(), bitmap));
                        }
                    });
                }
            } catch (Throwable th) {
                e0.i.q(th, "set banner background encounter exception: ", "BannerPresenter");
            }
        }
    }

    @Override // com.huawei.hms.ads.iq
    public void Code(Location location) {
        this.L = location;
    }

    @Override // com.huawei.hms.ads.iq
    public void Code(RequestOptions requestOptions) {
        this.D = requestOptions;
    }

    private void Code(com.huawei.openalliance.ad.inter.data.e eVar) {
        this.f21720e = eVar.d_();
    }

    @Override // com.huawei.hms.ads.iq
    public void Code(com.huawei.openalliance.ad.inter.data.j jVar) {
        this.F = jVar;
        this.Code = jVar != null ? jVar.m() : null;
    }

    @Override // com.huawei.hms.ads.iq
    public void Code(com.huawei.openalliance.ad.inter.data.n nVar) {
        this.f21716a = nVar;
    }

    @Override // com.huawei.hms.ads.iq
    public void Code(Integer num) {
        this.f21717b = num;
    }

    @Override // com.huawei.hms.ads.iq
    public void Code(String str, int i10, List<String> list, int i11) {
        if (str == null || str.isEmpty()) {
            ex.I("BannerPresenter", "adId is null or empty when load ad");
            gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.ia.1
                @Override // java.lang.Runnable
                public void run() {
                    ia.this.I().Code(com.huawei.openalliance.ad.constant.ag.O);
                }
            });
            return;
        }
        ex.Code("BannerPresenter", "loadAd ,adId:%s", str);
        this.B = i11;
        fa.o oVar = new fa.o(this.S, new String[]{str}, i10, list);
        this.C = oVar;
        oVar.o = this.L;
        oVar.f28274p = Integer.valueOf(this.B);
        fa.k kVar = this.C;
        RequestOptions Code = cj.Code(this.D);
        fa.o oVar2 = (fa.o) kVar;
        oVar2.f28273n = Code;
        App app = Code.getApp();
        if (app != null) {
            oVar2.D = app;
        }
        ((fa.o) this.C).f28280v = this.f21717b;
        com.huawei.openalliance.ad.inter.data.b bannerSize = (I() == null || !(I() instanceof PPSBannerView)) ? null : ((PPSBannerView) I()).getBannerSize();
        if (bannerSize != null) {
            ((fa.o) this.C).f28281w = Integer.valueOf(bannerSize.f22258c);
            ((fa.o) this.C).f28282x = Integer.valueOf(bannerSize.f22259d);
        } else {
            fa.o oVar3 = (fa.o) this.C;
            oVar3.f28281w = this.f21718c;
            oVar3.f28282x = this.f21719d;
        }
        String str2 = this.f;
        if (str2 != null) {
            ((fa.o) this.C).G = str2;
        }
        com.huawei.openalliance.ad.inter.data.n nVar = this.f21716a;
        if (nVar != null) {
            fa.o oVar4 = (fa.o) this.C;
            oVar4.f28278t = nVar.f22296a;
            oVar4.f28275q = nVar.f22297b;
            oVar4.f28276r = nVar.f22298c;
            oVar4.f28277s = nVar.f22299d;
        }
        ((fa.o) this.C).f28265e = new ga.j() { // from class: com.huawei.hms.ads.ia.2
            @Override // ga.j
            public void Code(final int i12) {
                ex.Code("BannerPresenter", "loadAd onAdFailed");
                gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.ia.2.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ia.this.I().Code(i12);
                    }
                });
            }

            @Override // ga.j
            public void Code(Map<String, List<com.huawei.openalliance.ad.inter.data.e>> map) {
                ex.Code("BannerPresenter", "loadAd onAdsLoaded");
                ia iaVar = ia.this;
                iaVar.F = iaVar.Code(map);
                c0.d(new Runnable() { // from class: com.huawei.hms.ads.ia.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ia.this.F();
                    }
                });
                ia.this.S();
            }
        };
        ((fa.o) this.C).f28262b = new d() { // from class: com.huawei.hms.ads.ia.3
            @Override // ga.d
            public void Code(final List<String> list2) {
                ex.Code("BannerPresenter", "loadAd onInValidContentIdsGot");
                gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.ia.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ia.this.I().Code(list2);
                    }
                });
            }
        };
        ((fa.o) this.C).a(h0.c(this.S));
    }

    @Override // com.huawei.hms.ads.iq
    public void Code(String str, com.huawei.openalliance.ad.inter.data.e eVar, long j10) {
        if (eVar instanceof com.huawei.openalliance.ad.inter.data.j) {
            AdContentData m10 = ((com.huawei.openalliance.ad.inter.data.j) eVar).m();
            AnalysisEventReport analysisEventReport = new AnalysisEventReport();
            analysisEventReport.n(str);
            analysisEventReport.e(m10);
            analysisEventReport.d(j10);
            if (m10 != null) {
                analysisEventReport.k(m10.e0());
                analysisEventReport.g(m10.D());
                analysisEventReport.b(m10.L());
                analysisEventReport.h(m10.f0());
            }
            ha.i.e(this.S).d("rptAdInvalidEvt", gb.b.p(analysisEventReport), null, null);
        }
    }

    @Override // com.huawei.hms.ads.iq
    public boolean Code(com.huawei.openalliance.ad.inter.data.b bVar, float f) {
        if (!(I() instanceof PPSBannerView)) {
            return false;
        }
        PPSBannerView pPSBannerView = (PPSBannerView) I();
        Context applicationContext = pPSBannerView.getContext().getApplicationContext();
        int width = pPSBannerView.getWidth();
        int height = pPSBannerView.getHeight();
        if (ex.Code()) {
            ex.Code("BannerPresenter", "banner view width: %s, height: %s", Integer.valueOf(width), Integer.valueOf(height));
        }
        DisplayMetrics b10 = gb.z.b(this.S);
        if (width > b10.widthPixels || height > b10.heightPixels) {
            ex.I("BannerPresenter", "Ad view is off screen");
            return false;
        }
        int i10 = bVar.f22256a;
        float f10 = i10 - width;
        float f11 = i10;
        float f12 = f10 / f11;
        int i11 = bVar.f22257b;
        float f13 = i11 - height;
        float f14 = i11;
        boolean z10 = f12 < f && f13 / f14 < f;
        if (!z10) {
            float l10 = gb.z.l(applicationContext);
            if (l10 > gl.Code) {
                ex.I("BannerPresenter", "Not enough space to show ad. Needs %s×%s dp, but only has %s×%s dp", Integer.valueOf(Math.round(f11 / l10)), Integer.valueOf(Math.round(f14 / l10)), Integer.valueOf(Math.round(width / l10)), Integer.valueOf(Math.round(height / l10)));
            }
        }
        return z10;
    }
}
