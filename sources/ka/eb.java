package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Om;
import com.iab.omid.library.huawei.adsession.AdSessionContext;
import com.iab.omid.library.huawei.adsession.media.VastProperties;
import java.util.List;

/* loaded from: classes2.dex */
public final class eb implements ob {

    /* renamed from: s, reason: collision with root package name */
    public hb f31126s;

    /* renamed from: t, reason: collision with root package name */
    public ob f31127t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f31128u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f31129v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f31130w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f31131x = false;
    public boolean y = false;

    public final void a(float f) {
        int i10;
        if (n7.d()) {
            n7.c("OmPresent", "onProgress, isAllowRepeat= %s, isVideoComplete= %s", Boolean.valueOf(this.f31128u), Boolean.valueOf(this.f31129v));
        }
        if (!this.f31128u && this.f31129v) {
            return;
        }
        hb hbVar = this.f31126s;
        if (hbVar instanceof ib) {
            ib ibVar = (ib) hbVar;
            float f10 = ibVar.y;
            if (f >= 75.0f && f10 < 75.0f) {
                i10 = 75;
            } else if (f >= 50.0f && f10 < 50.0f) {
                i10 = 50;
            } else if (f >= 25.0f && f10 < 25.0f) {
                i10 = 25;
            } else {
                i10 = 0;
            }
            if (n7.d()) {
                n7.c(ibVar.K(), "onProgress %s", Integer.valueOf(i10));
            }
            if (i10 != 25) {
                if (i10 != 50) {
                    if (i10 == 75) {
                        ibVar.y = i10;
                        ibVar.x();
                        return;
                    }
                    return;
                }
                ibVar.y = i10;
                ibVar.c();
                return;
            }
            ibVar.y = i10;
            ibVar.v();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Context context, AdContentData adContentData, db dbVar) {
        l3.d dVar;
        String str;
        hb ibVar;
        if (adContentData.k() == null) {
            n7.e("OmPresent", "om is null, no initialization is required");
            return;
        }
        if (this.f31131x) {
            return;
        }
        n7.e("OmPresent", "init omPresent");
        if (context == null) {
            n7.e("AdSessionAgentFactory", "adContentData or context is null");
            dVar = new l3.d();
        } else if (dbVar == null || dbVar.getOpenMeasureView() == null) {
            n7.e("AdSessionAgentFactory", "MeasureView is null");
            dVar = new l3.d();
        } else {
            boolean z10 = fb.f31173u;
            if (z10) {
                n7.b("AdSessionAgentFactory", "AdSessionAgent is avalible");
                fb fbVar = new fb();
                List<Om> k10 = adContentData.k();
                if (k10 == null) {
                    n7.e("AdSessionAgentFactory", "Oms is null");
                } else {
                    lb lbVar = null;
                    if (adContentData.x() != null && (adContentData.x().K() != null || (adContentData.x().o0() != null && "video/mp4".equals(adContentData.x().o0().a())))) {
                        n7.e("AdSessionAgentFactory", "Video adsession");
                        nb nbVar = nb.VIDEO;
                        boolean z11 = pb.f31645t;
                        qb qbVar = qb.NATIVE;
                        if (lb.f31416b) {
                            lbVar = new lb(nbVar, qbVar);
                        }
                    } else {
                        nb nbVar2 = nb.NATIVE_DISPLAY;
                        boolean z12 = pb.f31645t;
                        qb qbVar2 = qb.NONE;
                        if (lb.f31416b) {
                            lbVar = new lb(nbVar2, qbVar2);
                        }
                    }
                    if (lbVar != null) {
                        n7.e("AdSessionAgentFactory", "init adSessionAgent");
                        if (!z10) {
                            str = "not available, not init";
                        } else if (k10.isEmpty()) {
                            str = "oms is empty or sessionWrapper is null, not init";
                        } else {
                            n7.e("AdsessionAgent", "begin init");
                            fbVar.f31175t = context;
                            if (rb.f31754b) {
                                for (Om om : k10) {
                                    n7.e("AdsessionAgent", "Init Verfication Script");
                                    rb rbVar = new rb();
                                    rbVar.b(om);
                                    if (mb.f31460b) {
                                        AdSessionContext a10 = new mb(fbVar.f31175t).a(rbVar);
                                        if (a10 == null) {
                                            n7.e("AdsessionAgent", "adSessionContext is null");
                                        } else {
                                            fbVar.b(a10, lbVar);
                                        }
                                    }
                                }
                            } else {
                                n7.e("AdsessionAgent", "init VerficationScriptResourceWrapper failed");
                            }
                            fbVar.a(dbVar.getOpenMeasureView());
                        }
                        n7.e("AdsessionAgent", str);
                        fbVar.a(dbVar.getOpenMeasureView());
                    }
                }
                dVar = fbVar;
            } else {
                n7.b("AdSessionAgentFactory", "AdSessionAgent is not avalible");
                dVar = new l3.d();
            }
        }
        this.f31127t = dVar;
        if (adContentData.x() == null) {
            ibVar = new androidx.activity.n();
        } else if (adContentData.x().K() == null && (adContentData.x().o0() == null || !"video/mp4".equals(adContentData.x().o0().a()))) {
            if (gb.f31210w) {
                ibVar = new gb();
            }
            ibVar = new androidx.activity.n();
        } else {
            if (ib.f31275z) {
                ibVar = new ib();
            }
            ibVar = new androidx.activity.n();
        }
        this.f31126s = ibVar;
        ibVar.f(this.f31127t);
        this.f31131x = true;
        this.y = false;
        this.f31130w = false;
    }

    public final void c(xb xbVar) {
        VastProperties vastProperties;
        if (!this.f31128u && this.f31129v) {
            n7.g("OmPresent", "loaded: Video completed");
            return;
        }
        if (this.y) {
            if (n7.d()) {
                n7.b("OmPresent", "Already loaded");
                return;
            }
            return;
        }
        hb hbVar = this.f31126s;
        if (hbVar instanceof ib) {
            ib ibVar = (ib) hbVar;
            ibVar.getClass();
            if (xb.f32184b && (vastProperties = xbVar.f32185a) != null) {
                ibVar.u(vastProperties);
            }
        }
        this.y = true;
    }

    public final void d() {
        if (this.f31131x) {
            this.f31128u = true;
            this.f31129v = false;
            this.f31130w = false;
            hb hbVar = this.f31126s;
            if (hbVar != null) {
                hbVar.b();
            }
            ob obVar = this.f31127t;
            if (obVar != null) {
                obVar.c();
            }
            this.f31131x = false;
        }
    }

    public final void e(float f) {
        if (!this.f31128u && this.f31129v) {
            n7.g("OmPresent", "volumeChange: Video completed");
            return;
        }
        hb hbVar = this.f31126s;
        if (hbVar instanceof ib) {
            ((ib) hbVar).w(f);
        }
    }

    public final void f() {
        if (this.f31130w) {
            return;
        }
        hb hbVar = this.f31126s;
        if (hbVar instanceof gb) {
            ((gb) hbVar).i();
            this.f31130w = true;
        }
        hb hbVar2 = this.f31126s;
        if (hbVar2 instanceof ib) {
            ((ib) hbVar2).e();
            this.f31130w = true;
        }
    }

    public final void g() {
        n7.b("OmPresent", "complete");
        if (!this.f31128u && this.f31129v) {
            return;
        }
        hb hbVar = this.f31126s;
        if (hbVar instanceof ib) {
            ((ib) hbVar).A();
            this.f31129v = true;
        }
    }

    public final void h() {
        if (n7.d()) {
            n7.b("OmPresent", com.anythink.expressad.foundation.d.c.f9459cb);
        }
        if (!this.f31128u && this.f31129v) {
            n7.g("OmPresent", "pause: Video completed");
            return;
        }
        hb hbVar = this.f31126s;
        if (hbVar instanceof ib) {
            ((ib) hbVar).G();
        }
    }

    @Override // ka.ob
    public final void c() {
        ob obVar = this.f31127t;
        if (obVar == null) {
            return;
        }
        obVar.c();
    }

    @Override // ka.ob
    public final void b() {
        ob obVar = this.f31127t;
        if (obVar == null) {
            n7.e("OmPresent", "AdSessionAgent is null");
        } else {
            obVar.b();
        }
    }
}
