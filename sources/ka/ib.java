package ka;

import android.content.Context;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.constant.cp;
import com.iab.omid.library.huawei.adsession.AdEvents;
import com.iab.omid.library.huawei.adsession.AdSession;
import com.iab.omid.library.huawei.adsession.media.InteractionType;
import com.iab.omid.library.huawei.adsession.media.MediaEvents;
import com.iab.omid.library.huawei.adsession.media.VastProperties;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ib extends z6.f implements hb {

    /* renamed from: z, reason: collision with root package name */
    public static final boolean f31275z;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f31276t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f31277u;

    /* renamed from: v, reason: collision with root package name */
    public kb f31278v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f31279w;

    /* renamed from: x, reason: collision with root package name */
    public int f31280x;
    public float y;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ib ibVar = ib.this;
            ibVar.f31276t.clear();
            ibVar.f31277u.clear();
        }
    }

    static {
        boolean z10;
        if (jb.a("com.iab.omid.library.huawei.adsession.media.MediaEvents") && jb.a(com.huawei.hms.ads.hb.f21700e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        f31275z = z10;
    }

    public ib() {
        super(4);
        this.f31276t = new ArrayList();
        this.f31277u = new ArrayList();
        this.f31279w = false;
        this.f31280x = 0;
        this.y = gl.Code;
    }

    public final void A() {
        this.y = gl.Code;
        this.f31280x = 0;
        ArrayList arrayList = this.f31276t;
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MediaEvents mediaEvents = (MediaEvents) it.next();
                if (mediaEvents != null) {
                    if (n7.d()) {
                        n7.b(K(), "complete ");
                    }
                    mediaEvents.complete();
                }
            }
        } catch (IllegalStateException unused) {
            n7.e(K(), "complete, fail");
        }
    }

    public final void C() {
        ArrayList arrayList = this.f31276t;
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MediaEvents mediaEvents = (MediaEvents) it.next();
                if (mediaEvents != null) {
                    if (n7.d()) {
                        n7.b(K(), "bufferStart ");
                    }
                    mediaEvents.bufferStart();
                }
            }
        } catch (IllegalStateException unused) {
            n7.e(K(), "bufferStart, fail");
        }
    }

    public final void E() {
        ArrayList arrayList = this.f31276t;
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MediaEvents mediaEvents = (MediaEvents) it.next();
                if (mediaEvents != null) {
                    if (n7.d()) {
                        n7.b(K(), "bufferFinish ");
                    }
                    mediaEvents.bufferFinish();
                }
            }
        } catch (IllegalStateException unused) {
            n7.e(K(), "bufferFinish, fail");
        }
    }

    public final void F() {
        this.f31280x = 0;
        ArrayList arrayList = this.f31276t;
        if (arrayList.isEmpty()) {
            n7.g(K(), "skipped, mVideoEventsList isEmpty");
            return;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MediaEvents mediaEvents = (MediaEvents) it.next();
                if (mediaEvents != null) {
                    if (n7.d()) {
                        n7.b(K(), "skipped ");
                    }
                    mediaEvents.skipped();
                }
            }
        } catch (IllegalStateException unused) {
            n7.e(K(), "skipped, fail");
        }
    }

    public final void G() {
        ArrayList arrayList = this.f31276t;
        if (!arrayList.isEmpty() && 1 == this.f31280x) {
            try {
                this.f31280x = 2;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    MediaEvents mediaEvents = (MediaEvents) it.next();
                    if (mediaEvents != null) {
                        if (n7.d()) {
                            n7.b(K(), "pause ");
                        }
                        mediaEvents.pause();
                    }
                }
            } catch (IllegalStateException unused) {
                n7.e(K(), "pause, fail");
            }
        }
    }

    public final void H() {
        this.f31280x = 1;
        ArrayList arrayList = this.f31276t;
        if (arrayList.isEmpty()) {
            n7.g(K(), "resume, mVideoEventsList isEmpty");
            return;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MediaEvents mediaEvents = (MediaEvents) it.next();
                if (mediaEvents != null) {
                    if (n7.d()) {
                        n7.b(K(), "resume ");
                    }
                    mediaEvents.resume();
                }
            }
        } catch (IllegalStateException unused) {
            n7.e(K(), "resume, fail");
        }
    }

    public final String K() {
        return "VideoEventAgent" + hashCode();
    }

    @Override // ka.hb
    public final void b() {
        this.f31280x = 0;
        if (n7.d()) {
            n7.b(K(), "release ");
        }
        com.huawei.openalliance.ad.ppskit.utils.f1.a(new a(), 200L);
    }

    public final void c() {
        ArrayList arrayList = this.f31276t;
        if (arrayList.isEmpty()) {
            n7.g(K(), "midpoint, mVideoEventsList isEmpty");
            return;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MediaEvents mediaEvents = (MediaEvents) it.next();
                if (mediaEvents != null) {
                    n7.e(K(), "midpoint ");
                    mediaEvents.midpoint();
                }
            }
        } catch (IllegalStateException unused) {
            n7.e(K(), "midpoint, fail");
        }
    }

    public final void e() {
        ArrayList arrayList = this.f31277u;
        if (arrayList.isEmpty()) {
            n7.g(K(), "impressionOccurred, mAdEventList isEmpty");
            return;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AdEvents) it.next()).impressionOccurred();
            }
        } catch (IllegalStateException unused) {
            n7.e(K(), "impressionOccurred, fail");
        }
    }

    @Override // ka.hb
    public final void f(ob obVar) {
        n7.e(K(), "setAdSessionAgent");
        boolean z10 = f31275z;
        if (!z10) {
            return;
        }
        if ((obVar instanceof fb) && z10) {
            fb fbVar = (fb) obVar;
            Context e10 = fbVar.e();
            if (e10 != null) {
                n7.e(K(), "Set VolumeChange observer");
                this.f31278v = new kb(e10);
            }
            ArrayList<AdSession> d10 = fbVar.d();
            if (!d10.isEmpty()) {
                for (AdSession adSession : d10) {
                    if (adSession != null) {
                        this.f31276t.add(MediaEvents.createMediaEvents(adSession));
                        this.f31277u.add(AdEvents.createAdEvents(adSession));
                    }
                }
                return;
            }
            return;
        }
        n7.e(K(), "adsessionAgent is null");
    }

    public final void s(float f, float f10) {
        ArrayList arrayList = this.f31276t;
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MediaEvents mediaEvents = (MediaEvents) it.next();
                if (mediaEvents != null) {
                    if (n7.d()) {
                        n7.c(K(), "start，duration %s", Float.valueOf(f));
                    }
                    mediaEvents.start(f, f10);
                }
            }
        } catch (IllegalStateException unused) {
            n7.e(K(), "start, fail");
        }
    }

    public final void t(InteractionType interactionType) {
        ArrayList arrayList = this.f31276t;
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MediaEvents mediaEvents = (MediaEvents) it.next();
                if (mediaEvents != null) {
                    if (n7.d()) {
                        n7.b(K(), "adUserInteraction ");
                    }
                    mediaEvents.adUserInteraction(interactionType);
                }
            }
        } catch (IllegalStateException unused) {
            n7.e(K(), "adUserInteraction, fail");
        }
    }

    public final void u(VastProperties vastProperties) {
        ArrayList arrayList = this.f31277u;
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AdEvents adEvents = (AdEvents) it.next();
                if (adEvents != null) {
                    if (n7.d()) {
                        n7.b(K(), "loaded ");
                    }
                    adEvents.loaded(vastProperties);
                }
            }
        } catch (IllegalStateException unused) {
            n7.e(K(), "loaded, fail");
        }
    }

    public final void v() {
        ArrayList arrayList = this.f31276t;
        if (arrayList.isEmpty()) {
            n7.g(K(), "firstQuartile, mVideoEventsList isEmpty");
            return;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MediaEvents mediaEvents = (MediaEvents) it.next();
                if (mediaEvents != null) {
                    n7.e(K(), cp.V);
                    mediaEvents.firstQuartile();
                }
            }
        } catch (IllegalStateException unused) {
            n7.e(K(), "firstQuartile, fail");
        }
    }

    public final void w(float f) {
        kb kbVar;
        boolean z10 = false;
        n7.f(K(), "volumeChange %s", Float.valueOf(f));
        if (Math.abs(f - gl.Code) < 1.0E-8f) {
            z10 = true;
        }
        this.f31279w = z10;
        ArrayList arrayList = this.f31276t;
        if (!arrayList.isEmpty() && this.f31280x == 1) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    MediaEvents mediaEvents = (MediaEvents) it.next();
                    if (mediaEvents != null && (kbVar = this.f31278v) != null) {
                        if (f == -1.0f) {
                            mediaEvents.volumeChange(kbVar.a(this.f31279w));
                        } else {
                            mediaEvents.volumeChange(f);
                        }
                    }
                }
            } catch (IllegalStateException unused) {
                n7.e(K(), "volumeChange, fail");
            }
        }
    }

    public final void x() {
        ArrayList arrayList = this.f31276t;
        if (arrayList.isEmpty()) {
            n7.g(K(), "thirdQuartile, mVideoEventsList isEmpty");
            return;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MediaEvents mediaEvents = (MediaEvents) it.next();
                if (mediaEvents != null) {
                    n7.e(K(), "thirdQuartile ");
                    mediaEvents.thirdQuartile();
                }
            }
        } catch (IllegalStateException unused) {
            n7.e(K(), "thirdQuartile, fail");
        }
    }
}
