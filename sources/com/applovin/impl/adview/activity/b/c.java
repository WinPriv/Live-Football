package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.graphics.PointF;
import android.net.Uri;
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
public class c extends e {
    private final com.applovin.impl.c.a I;
    private final Set<k> J;

    public c(com.applovin.impl.sdk.ad.e eVar, Activity activity, Map<String, Object> map, p pVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.J = hashSet;
        com.applovin.impl.c.a aVar = (com.applovin.impl.c.a) eVar;
        this.I = aVar;
        a.c cVar = a.c.VIDEO;
        hashSet.addAll(aVar.a(cVar, l.f17444a));
        a(a.c.IMPRESSION);
        a(cVar, "creativeView");
        aVar.o().d();
    }

    private void G() {
        if (r() && !this.J.isEmpty()) {
            if (y.a()) {
                this.f16984c.d("AppLovinFullscreenActivity", "Firing " + this.J.size() + " un-fired video progress trackers when video was completed.");
            }
            a(this.J);
        }
    }

    @Override // com.applovin.impl.adview.activity.b.e
    public void A() {
        G();
        if (m.c(this.I)) {
            if (!((e) this).G) {
                a(a.c.COMPANION, "creativeView");
                this.I.o().i();
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

    @Override // com.applovin.impl.adview.activity.b.e
    public void c(long j10) {
        super.c(j10);
        this.I.o().a((float) TimeUnit.MILLISECONDS.toSeconds(j10), Utils.isVideoMutedInitially(this.f16983b));
    }

    @Override // com.applovin.impl.adview.activity.b.e, com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.e, com.applovin.impl.adview.activity.b.a
    public void e() {
        ((e) this).C.c();
        super.e();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void f() {
        a.c cVar;
        super.f();
        if (((e) this).G) {
            cVar = a.c.COMPANION;
        } else {
            cVar = a.c.VIDEO;
        }
        a(cVar, "resume");
        this.I.o().k();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void g() {
        a.c cVar;
        super.g();
        if (((e) this).G) {
            cVar = a.c.COMPANION;
        } else {
            cVar = a.c.VIDEO;
        }
        a(cVar, com.anythink.expressad.foundation.d.c.f9459cb);
        this.I.o().j();
    }

    @Override // com.applovin.impl.adview.activity.b.e, com.applovin.impl.adview.activity.b.a
    public void h() {
        if (this.I != null) {
            a(a.c.VIDEO, "close");
            a(a.c.COMPANION, "close");
        }
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.e, com.applovin.impl.adview.activity.b.a
    public void u() {
        long ae;
        int t10;
        long j10 = 0;
        if (this.I.ad() >= 0 || this.I.ae() >= 0) {
            if (this.I.ad() >= 0) {
                ae = this.I.ad();
            } else {
                com.applovin.impl.c.a aVar = this.I;
                n aO = aVar.aO();
                if (aO != null && aO.b() > 0) {
                    j10 = 0 + TimeUnit.SECONDS.toMillis(aO.b());
                } else {
                    long j11 = ((e) this).E;
                    if (j11 > 0) {
                        j10 = 0 + j11;
                    }
                }
                if (aVar.af() && (t10 = (int) aVar.t()) > 0) {
                    j10 += TimeUnit.SECONDS.toMillis(t10);
                }
                ae = (long) ((this.I.ae() / 100.0d) * j10);
            }
            b(ae);
        }
    }

    @Override // com.applovin.impl.adview.activity.b.e
    public void x() {
        super.x();
        com.applovin.impl.c.a aVar = this.I;
        if (aVar != null) {
            aVar.o().l();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.e
    public void y() {
        super.y();
        com.applovin.impl.c.a aVar = this.I;
        if (aVar != null) {
            aVar.o().m();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.e
    public void z() {
        String str;
        super.z();
        a.c cVar = a.c.VIDEO;
        if (((e) this).D) {
            str = "mute";
        } else {
            str = "unmute";
        }
        a(cVar, str);
        this.I.o().a(((e) this).D);
    }

    @Override // com.applovin.impl.adview.activity.b.e, com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        ((e) this).C.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new j.a() { // from class: com.applovin.impl.adview.activity.b.c.1
            @Override // com.applovin.impl.adview.j.a
            public void a() {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(((e) c.this).E - (((e) c.this).f17037w.H() - ((e) c.this).f17037w.I()));
                int F = c.this.F();
                HashSet hashSet = new HashSet();
                Iterator it = new HashSet(c.this.J).iterator();
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    if (kVar.a(seconds, F)) {
                        hashSet.add(kVar);
                        c.this.J.remove(kVar);
                    }
                }
                c.this.a(hashSet);
                if (F >= 25 && F < 50) {
                    c.this.I.o().f();
                    return;
                }
                if (F >= 50 && F < 75) {
                    c.this.I.o().g();
                } else if (F >= 75) {
                    c.this.I.o().h();
                }
            }

            @Override // com.applovin.impl.adview.j.a
            public boolean b() {
                return !((e) c.this).G;
            }
        });
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.a aVar = ((e) this).f17038x;
        if (aVar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(aVar, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        com.applovin.impl.adview.m mVar = ((e) this).y;
        if (mVar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(mVar, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        ProgressBar progressBar = ((e) this).B;
        if (progressBar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ImageView imageView = ((e) this).f17039z;
        if (imageView != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        v vVar = ((e) this).A;
        if (vVar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(vVar, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        u uVar = this.f16987g;
        if (uVar != null && uVar.b()) {
            u uVar2 = this.f16987g;
            arrayList.add(new com.applovin.impl.sdk.a.d(uVar2, FriendlyObstructionPurpose.NOT_VISIBLE, uVar2.getIdentifier()));
        }
        this.I.o().a(((e) this).f17036v, arrayList);
    }

    @Override // com.applovin.impl.adview.activity.b.e
    public void c() {
        a(a.c.VIDEO, cp.F);
        this.I.o().n();
        super.c();
    }

    @Override // com.applovin.impl.adview.activity.b.e
    public void c(String str) {
        a(a.c.ERROR, com.applovin.impl.c.f.MEDIA_FILE_ERROR);
        this.I.o().a(str);
        super.c(str);
    }

    @Override // com.applovin.impl.adview.activity.b.e
    public void a(PointF pointF) {
        a(a.c.VIDEO_CLICK);
        this.I.o().o();
        super.a(pointF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set<k> set) {
        a(set, com.applovin.impl.c.f.UNSPECIFIED);
    }

    private void a(a.c cVar) {
        a(cVar, com.applovin.impl.c.f.UNSPECIFIED);
    }

    private void a(a.c cVar, String str) {
        a(cVar, str, com.applovin.impl.c.f.UNSPECIFIED);
    }

    private void a(a.c cVar, com.applovin.impl.c.f fVar) {
        a(cVar, "", fVar);
    }

    private void a(a.c cVar, String str, com.applovin.impl.c.f fVar) {
        a(this.I.a(cVar, str), fVar);
    }

    private void a(Set<k> set, com.applovin.impl.c.f fVar) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(((e) this).f17037w.I());
        o aP = this.I.aP();
        Uri a10 = aP != null ? aP.a() : null;
        if (y.a()) {
            this.f16984c.b("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        m.a(set, seconds, a10, fVar, this.f16983b);
    }
}
