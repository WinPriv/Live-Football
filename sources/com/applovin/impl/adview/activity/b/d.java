package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.graphics.PointF;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.impl.adview.j;
import com.applovin.impl.adview.u;
import com.applovin.impl.adview.v;
import com.applovin.impl.c.a;
import com.applovin.impl.c.k;
import com.applovin.impl.c.l;
import com.applovin.impl.c.m;
import com.applovin.impl.c.n;
import com.applovin.impl.c.o;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.huawei.openalliance.ad.constant.cp;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class d extends f {
    private final com.applovin.impl.c.a G;
    private final Set<k> H;

    public d(com.applovin.impl.sdk.ad.e eVar, final Activity activity, Map<String, Object> map, final p pVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.H = hashSet;
        com.applovin.impl.c.a aVar = (com.applovin.impl.c.a) eVar;
        this.G = aVar;
        if (aVar.aS()) {
            ImageView a10 = com.applovin.impl.c.g.a(aVar.aR().a(), activity, pVar);
            ((f) this).B = a10;
            a10.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.activity.b.d.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Uri b10 = d.this.G.aR().b();
                    if (b10 != null) {
                        y yVar = d.this.f16984c;
                        if (y.a()) {
                            d.this.f16984c.b("AppLovinFullscreenActivity", "Industry Icon clicked, opening URL: " + b10);
                        }
                        d.this.a(a.c.INDUSTRY_ICON_CLICK);
                        Utils.openUri(activity, b10, pVar);
                    }
                }
            });
        }
        a.c cVar = a.c.VIDEO;
        hashSet.addAll(aVar.a(cVar, l.f17444a));
        a(a.c.IMPRESSION);
        a(cVar, "creativeView");
        aVar.o().d();
    }

    private void C() {
        if (r() && !this.H.isEmpty()) {
            if (y.a()) {
                this.f16984c.d("AppLovinFullscreenActivity", "Firing " + this.H.size() + " un-fired video progress trackers when video was completed.");
            }
            a(this.H);
        }
    }

    private boolean D() {
        if (((f) this).B != null && this.G.aS()) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void A() {
        C();
        if (m.c(this.G)) {
            if (!((f) this).F) {
                a(a.c.COMPANION, "creativeView");
                this.G.o().i();
                super.A();
                return;
            }
            return;
        }
        if (y.a()) {
            this.f16984c.b("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
        }
        h();
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void c(long j10) {
        super.c(j10);
        this.G.o().a((float) TimeUnit.MILLISECONDS.toSeconds(j10), Utils.isVideoMutedInitially(this.f16983b));
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void e() {
        ((f) this).C.c();
        super.e();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void f() {
        a.c cVar;
        super.f();
        if (((f) this).F) {
            cVar = a.c.COMPANION;
        } else {
            cVar = a.c.VIDEO;
        }
        a(cVar, "resume");
        this.G.o().k();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void g() {
        a.c cVar;
        super.g();
        if (((f) this).F) {
            cVar = a.c.COMPANION;
        } else {
            cVar = a.c.VIDEO;
        }
        a(cVar, com.anythink.expressad.foundation.d.c.f9459cb);
        this.G.o().j();
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void h() {
        if (this.G != null) {
            a(a.c.VIDEO, "close");
            a(a.c.COMPANION, "close");
        }
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void u() {
        long ae;
        int t10;
        long j10 = 0;
        if (this.G.ad() >= 0 || this.G.ae() >= 0) {
            if (this.G.ad() >= 0) {
                ae = this.G.ad();
            } else {
                com.applovin.impl.c.a aVar = this.G;
                n aO = aVar.aO();
                if (aO != null && aO.b() > 0) {
                    j10 = 0 + TimeUnit.SECONDS.toMillis(aO.b());
                } else {
                    long j11 = ((f) this).E;
                    if (j11 > 0) {
                        j10 = 0 + j11;
                    }
                }
                if (aVar.af() && (t10 = (int) aVar.t()) > 0) {
                    j10 += TimeUnit.SECONDS.toMillis(t10);
                }
                ae = (long) ((this.G.ae() / 100.0d) * j10);
            }
            b(ae);
        }
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void x() {
        super.x();
        com.applovin.impl.c.a aVar = this.G;
        if (aVar != null) {
            aVar.o().l();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void y() {
        super.y();
        com.applovin.impl.c.a aVar = this.G;
        if (aVar != null) {
            aVar.o().m();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void z() {
        String str;
        super.z();
        a.c cVar = a.c.VIDEO;
        if (((f) this).D) {
            str = "mute";
        } else {
            str = "unmute";
        }
        a(cVar, str);
        this.G.o().a(((f) this).D);
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void c() {
        a(a.c.VIDEO, cp.F);
        this.G.o().n();
        super.c();
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        if (D()) {
            a(a.c.INDUSTRY_ICON_IMPRESSION);
            ((f) this).B.setVisibility(0);
        }
        ((f) this).C.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new j.a() { // from class: com.applovin.impl.adview.activity.b.d.2
            @Override // com.applovin.impl.adview.j.a
            public void a() {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(((f) d.this).E - (((f) d.this).f17054v.getDuration() - ((f) d.this).f17054v.getCurrentPosition()));
                int B = d.this.B();
                HashSet hashSet = new HashSet();
                Iterator it = new HashSet(d.this.H).iterator();
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    if (kVar.a(seconds, B)) {
                        hashSet.add(kVar);
                        d.this.H.remove(kVar);
                    }
                }
                d.this.a(hashSet);
                if (B >= 25 && B < 50) {
                    d.this.G.o().f();
                    return;
                }
                if (B >= 50 && B < 75) {
                    d.this.G.o().g();
                } else if (B >= 75) {
                    d.this.G.o().h();
                }
            }

            @Override // com.applovin.impl.adview.j.a
            public boolean b() {
                return !((f) d.this).F;
            }
        });
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.a aVar = ((f) this).f17055w;
        if (aVar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(aVar, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        com.applovin.impl.adview.m mVar = ((f) this).f17056x;
        if (mVar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(mVar, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        ProgressBar progressBar = ((f) this).A;
        if (progressBar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ImageView imageView = ((f) this).y;
        if (imageView != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        v vVar = ((f) this).f17057z;
        if (vVar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(vVar, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        u uVar = this.f16987g;
        if (uVar != null && uVar.b()) {
            u uVar2 = this.f16987g;
            arrayList.add(new com.applovin.impl.sdk.a.d(uVar2, FriendlyObstructionPurpose.NOT_VISIBLE, uVar2.getIdentifier()));
        }
        this.G.o().a(((f) this).f17054v, arrayList);
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void c(String str) {
        a(a.c.ERROR, com.applovin.impl.c.f.MEDIA_FILE_ERROR);
        this.G.o().a(str);
        super.c(str);
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void a(PointF pointF) {
        a(a.c.VIDEO_CLICK);
        this.G.o().o();
        super.a(pointF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set<k> set) {
        a(set, com.applovin.impl.c.f.UNSPECIFIED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a.c cVar) {
        a(cVar, com.applovin.impl.c.f.UNSPECIFIED);
    }

    private void a(a.c cVar, String str) {
        a(cVar, str, com.applovin.impl.c.f.UNSPECIFIED);
    }

    private void a(a.c cVar, com.applovin.impl.c.f fVar) {
        a(cVar, "", fVar);
    }

    private void a(a.c cVar, String str, com.applovin.impl.c.f fVar) {
        a(this.G.a(cVar, str), fVar);
    }

    private void a(Set<k> set, com.applovin.impl.c.f fVar) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(((f) this).f17054v.getCurrentPosition());
        o aP = this.G.aP();
        Uri a10 = aP != null ? aP.a() : null;
        if (y.a()) {
            this.f16984c.b("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        m.a(set, seconds, a10, fVar, this.f16983b);
    }
}
