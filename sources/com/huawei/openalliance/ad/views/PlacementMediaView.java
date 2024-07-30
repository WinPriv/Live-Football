package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.fg;
import com.huawei.hms.ads.fh;
import com.huawei.hms.ads.fj;
import com.huawei.hms.ads.fl;
import com.huawei.hms.ads.fm;
import com.huawei.hms.ads.fn;
import com.huawei.hms.ads.gk;
import com.huawei.hms.ads.kg;
import com.huawei.hms.ads.km;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public abstract class PlacementMediaView extends AutoScaleSizeRelativeLayout implements gk, kg, km {

    /* renamed from: c0, reason: collision with root package name */
    public final CopyOnWriteArraySet f24030c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f24031d0;

    /* renamed from: e0, reason: collision with root package name */
    public long f24032e0;

    /* renamed from: f0, reason: collision with root package name */
    public long f24033f0;

    /* renamed from: g0, reason: collision with root package name */
    public long f24034g0;

    /* renamed from: h0, reason: collision with root package name */
    public long f24035h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f24036i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f24037j0;

    /* renamed from: k0, reason: collision with root package name */
    public String f24038k0;

    /* renamed from: l0, reason: collision with root package name */
    public String f24039l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f24040m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f24041n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f24042o0;

    /* renamed from: p0, reason: collision with root package name */
    public final a f24043p0;
    public com.huawei.openalliance.ad.inter.data.k y;

    /* loaded from: classes2.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            String concat;
            boolean z10;
            PlacementMediaView placementMediaView = PlacementMediaView.this;
            try {
                if (1 == message.what) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = placementMediaView.f24032e0;
                    a aVar = placementMediaView.f24043p0;
                    int i10 = (int) ((currentTimeMillis - j10) - placementMediaView.f24035h0);
                    placementMediaView.f24031d0 = i10;
                    if (i10 >= placementMediaView.f24033f0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        PlacementMediaView.q(placementMediaView);
                    } else {
                        PlacementMediaView.a(placementMediaView);
                        aVar.removeMessages(1);
                        aVar.sendEmptyMessageDelayed(1, 100L);
                    }
                }
            } catch (IllegalStateException unused) {
                concat = "handleMessage IllegalStateException";
                ex.I("PlacementMediaView", concat);
            } catch (Throwable th) {
                concat = "handleMessage ".concat(th.getClass().getSimpleName());
                ex.I("PlacementMediaView", concat);
            }
        }
    }

    public PlacementMediaView(Context context) {
        super(context);
        this.f24030c0 = new CopyOnWriteArraySet();
        this.f24031d0 = 0;
        this.f24032e0 = 0L;
        this.f24033f0 = 0L;
        this.f24034g0 = 0L;
        this.f24036i0 = false;
        this.f24037j0 = false;
        this.f24040m0 = false;
        this.f24041n0 = false;
        this.f24042o0 = false;
        this.f24043p0 = new a(Looper.myLooper());
    }

    public static void a(PlacementMediaView placementMediaView) {
        if (placementMediaView.f24033f0 > 0 && !placementMediaView.f24037j0) {
            Iterator it = placementMediaView.f24030c0.iterator();
            while (it.hasNext()) {
                fn fnVar = (fn) it.next();
                String str = placementMediaView.f24039l0;
                String str2 = placementMediaView.f24038k0;
                int i10 = placementMediaView.f24031d0;
                fnVar.Code(str, str2, (int) (i10 / placementMediaView.f24033f0), i10);
            }
        }
    }

    public static void q(PlacementMediaView placementMediaView) {
        placementMediaView.f24036i0 = false;
        Iterator it = placementMediaView.f24030c0.iterator();
        while (it.hasNext()) {
            ((fn) it.next()).Z(placementMediaView.f24039l0, placementMediaView.f24038k0, placementMediaView.f24031d0);
        }
    }

    public void C() {
        this.f24043p0.removeMessages(1);
        this.f24034g0 = System.currentTimeMillis();
        Iterator it = this.f24030c0.iterator();
        while (it.hasNext()) {
            ((fn) it.next()).V(this.f24039l0, this.f24038k0, this.f24031d0);
        }
    }

    abstract void Code();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void Code(int i10);

    public void Code(long j10) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void V();

    public void destroyView() {
        this.f24043p0.removeMessages(1);
        this.f24030c0.clear();
        Code();
    }

    public void e(fn fnVar) {
        if (fnVar != null) {
            this.f24030c0.add(fnVar);
        }
    }

    public void f(boolean z10) {
        ex.V("PlacementMediaView", "play, mediaCached: %s, mediaAvalible: %s", Boolean.valueOf(this.f24040m0), Boolean.valueOf(this.f24041n0));
        gb.w.a(1L, new n(this));
    }

    public long getDuration() {
        com.huawei.openalliance.ad.inter.data.l S;
        com.huawei.openalliance.ad.inter.data.k kVar = this.y;
        if (kVar != null && (S = kVar.S()) != null) {
            return S.A;
        }
        return 0L;
    }

    public abstract ImageView getLastFrame();

    public abstract ia.b getMediaState();

    public com.huawei.openalliance.ad.inter.data.f getPlacementAd() {
        return this.y;
    }

    public boolean o() {
        return false;
    }

    public abstract void setMediaPlayerReleaseListener(fj fjVar);

    public void setPlacementAd(com.huawei.openalliance.ad.inter.data.f fVar) {
        String str;
        this.f24031d0 = 0;
        this.f24032e0 = 0L;
        this.f24034g0 = 0L;
        this.f24033f0 = 0L;
        this.f24035h0 = 0L;
        this.f24036i0 = false;
        this.f24037j0 = false;
        this.f24041n0 = false;
        this.f24040m0 = false;
        this.f24042o0 = false;
        if (fVar instanceof com.huawei.openalliance.ad.inter.data.k) {
            com.huawei.openalliance.ad.inter.data.k kVar = (com.huawei.openalliance.ad.inter.data.k) fVar;
            this.y = kVar;
            com.huawei.openalliance.ad.inter.data.l S = kVar.S();
            this.f24033f0 = S.A;
            this.f24038k0 = S.f22283t;
            str = fVar.L();
        } else {
            this.y = null;
            this.f24043p0.removeMessages(1);
            str = "";
            this.f24038k0 = "";
        }
        this.f24039l0 = str;
    }

    public void Code(fl flVar) {
    }

    public void Code(String str) {
    }

    public void B() {
    }

    public void I() {
    }

    public void S() {
    }

    @Override // com.huawei.hms.ads.gk
    public View getOpenMeasureView() {
        return this;
    }

    @Override // com.huawei.hms.ads.km
    public void pauseView() {
    }

    @Override // com.huawei.hms.ads.km
    public void resumeView() {
    }

    public void V(fl flVar) {
    }

    public void b(fg fgVar) {
    }

    public void c(fh fhVar) {
    }

    public void d(fm fmVar) {
    }

    public void p(fn fnVar) {
    }

    public void setAudioFocusType(int i10) {
    }

    public void setSoundVolume(float f) {
    }
}
