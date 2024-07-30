package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.Intent;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.hms.ads.ec;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.fg;
import com.huawei.hms.ads.fh;
import com.huawei.hms.ads.fj;
import com.huawei.hms.ads.fl;
import com.huawei.hms.ads.fm;
import com.huawei.hms.ads.fn;
import com.huawei.hms.ads.ft;
import com.huawei.hms.ads.fu;
import com.huawei.hms.ads.gl;
import com.huawei.hms.ads.go;
import com.huawei.hms.ads.ha;
import com.huawei.hms.ads.hk;
import com.huawei.hms.ads.hl;
import com.huawei.hms.ads.hw;
import com.huawei.hms.ads.hy;
import com.huawei.hms.ads.hz;
import com.huawei.hms.ads.ik;
import com.huawei.hms.ads.ix;
import com.huawei.hms.ads.je;
import com.huawei.hms.ads.jr;
import com.huawei.hms.ads.jz;
import com.huawei.hms.ads.ke;
import com.huawei.hms.ads.kf;
import com.huawei.hms.ads.km;
import com.huawei.openalliance.ad.activity.ComplianceActivity;
import com.huawei.openalliance.ad.constant.bm;
import com.huawei.openalliance.ad.constant.bw;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class PPSPlacementView extends AutoScaleSizeRelativeLayout implements fl, fn, ft, jz, km {
    private boolean A;
    protected ha Code;
    private fu D;
    private boolean E;
    private ix F;
    private boolean G;
    private boolean H;
    protected ha I;
    private MaterialClickInfo J;
    private List<View> K;
    private List<com.huawei.openalliance.ad.inter.data.k> L;
    private boolean M;
    private long N;
    private fj O;
    private int P;
    private boolean Q;
    private AudioManager R;
    private boolean S;
    private Object T;
    private bm U;
    protected ha V;
    private fm W;

    /* renamed from: a, reason: collision with root package name */
    private com.huawei.openalliance.ad.inter.data.k f23880a;

    /* renamed from: aa, reason: collision with root package name */
    private Handler f23881aa;

    /* renamed from: ab, reason: collision with root package name */
    private fn f23882ab;

    /* renamed from: ac, reason: collision with root package name */
    private View.OnClickListener f23883ac;

    /* renamed from: ad, reason: collision with root package name */
    private AudioManager.OnAudioFocusChangeListener f23884ad;

    /* renamed from: b, reason: collision with root package name */
    private com.huawei.openalliance.ad.inter.data.k f23885b;

    /* renamed from: c, reason: collision with root package name */
    private int f23886c;

    /* renamed from: d, reason: collision with root package name */
    private s f23887d;

    /* renamed from: e, reason: collision with root package name */
    private List<View> f23888e;
    private boolean f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f23889g;

    /* renamed from: h, reason: collision with root package name */
    private PlacementMediaView f23890h;

    /* renamed from: i, reason: collision with root package name */
    private PlacementMediaView f23891i;

    /* renamed from: j, reason: collision with root package name */
    private PlacementMediaView f23892j;

    /* renamed from: k, reason: collision with root package name */
    private fg f23893k;

    /* renamed from: l, reason: collision with root package name */
    private fl f23894l;

    /* renamed from: m, reason: collision with root package name */
    private fh f23895m;

    /* renamed from: n, reason: collision with root package name */
    private kf f23896n;
    private ke o;

    /* renamed from: p, reason: collision with root package name */
    private int[] f23897p;

    /* renamed from: q, reason: collision with root package name */
    private PlacementMediaView f23898q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f23899r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f23900s;

    /* renamed from: t, reason: collision with root package name */
    private int f23901t;

    /* renamed from: u, reason: collision with root package name */
    private int f23902u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f23903v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f23904w;

    /* renamed from: x, reason: collision with root package name */
    private int f23905x;

    /* renamed from: z, reason: collision with root package name */
    private ImageView f23906z;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ex.V("PPSPlacementView", "pauseView");
            PPSPlacementView pPSPlacementView = PPSPlacementView.this;
            if (pPSPlacementView.f23898q != null) {
                pPSPlacementView.f23898q.pauseView();
                pPSPlacementView.f23898q.C();
                pPSPlacementView.i();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ex.V("PPSPlacementView", "destroyView");
            PPSPlacementView pPSPlacementView = PPSPlacementView.this;
            if (pPSPlacementView.f23898q != null) {
                pPSPlacementView.f23898q.S();
                pPSPlacementView.f23898q.destroyView();
            }
            pPSPlacementView.F();
            pPSPlacementView.D();
            pPSPlacementView.i();
            pPSPlacementView.Code.I();
            pPSPlacementView.V.I();
            pPSPlacementView.I.I();
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            String str;
            int i10;
            PPSPlacementView pPSPlacementView = PPSPlacementView.this;
            com.huawei.openalliance.ad.inter.data.k currentAd = pPSPlacementView.getCurrentAd();
            com.huawei.openalliance.ad.inter.data.l currentMediaFile = pPSPlacementView.getCurrentMediaFile();
            String str2 = "";
            if (currentAd == null) {
                str = "";
            } else {
                str = currentAd.L();
            }
            if (currentMediaFile != null) {
                str2 = currentMediaFile.f22283t;
                i10 = (int) currentMediaFile.A;
            } else {
                i10 = 0;
            }
            ex.V("PPSPlacementView", "callback timeout: %s", str);
            if (pPSPlacementView.f23898q != null) {
                ex.V("PPSPlacementView", "notify Error");
                pPSPlacementView.B(str, str2, i10);
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSPlacementView pPSPlacementView = PPSPlacementView.this;
            if (pPSPlacementView.f23906z == null) {
                return;
            }
            try {
                ex.V("PPSPlacementView", "hide last frame.");
                pPSPlacementView.f23906z.setVisibility(8);
                pPSPlacementView.removeView(pPSPlacementView.f23906z);
                pPSPlacementView.f23906z = null;
                pPSPlacementView.A = true;
            } catch (Throwable unused) {
                ex.I("PPSPlacementView", "hideLastFrame error.");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f23911s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f23912t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f23913u;

        public e(String str, String str2, int i10) {
            this.f23911s = str;
            this.f23912t = str2;
            this.f23913u = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSPlacementView.this.Code(this.f23911s, this.f23912t, this.f23913u, -1, -1);
        }
    }

    /* loaded from: classes2.dex */
    public class f implements fn {
        public f() {
        }

        @Override // com.huawei.hms.ads.fn
        public final void Code(String str, String str2, int i10) {
            ha haVar;
            ha haVar2;
            if (ex.Code()) {
                ex.Code("PPSPlacementView", "OM onSegmentMediaStart");
            }
            PPSPlacementView pPSPlacementView = PPSPlacementView.this;
            pPSPlacementView.M = false;
            if (pPSPlacementView.f23898q instanceof PlacementVideoView) {
                bm bmVar = pPSPlacementView.U;
                if (i10 > 0) {
                    if (bmVar.V(bm.a.SINGLE_INST)) {
                        haVar2 = pPSPlacementView.I;
                    } else {
                        haVar2 = pPSPlacementView.U.V(bm.a.MAIN_VIEW) ? pPSPlacementView.Code : pPSPlacementView.V;
                    }
                    haVar2.f();
                    return;
                }
                if (bmVar.V(bm.a.SINGLE_INST)) {
                    haVar = pPSPlacementView.I;
                } else {
                    haVar = pPSPlacementView.U.V(bm.a.MAIN_VIEW) ? pPSPlacementView.Code : pPSPlacementView.V;
                }
                pPSPlacementView.Code(haVar);
            }
        }

        @Override // com.huawei.hms.ads.fn
        public final void I(String str, String str2, int i10) {
            ha haVar;
            if (ex.Code()) {
                ex.Code("PPSPlacementView", "OM onSegmentMediaStop");
            }
            PPSPlacementView pPSPlacementView = PPSPlacementView.this;
            if (str != null && !str.equalsIgnoreCase(pPSPlacementView.getCurrentContentId())) {
                ex.V("PPSPlacementView", "OM onSegmentMediaStop not equals");
                return;
            }
            if (!pPSPlacementView.M) {
                pPSPlacementView.M = true;
                if (pPSPlacementView.f23898q instanceof PlacementVideoView) {
                    if (pPSPlacementView.U.V(bm.a.SINGLE_INST)) {
                        haVar = pPSPlacementView.I;
                    } else if (pPSPlacementView.U.V(bm.a.MAIN_VIEW)) {
                        haVar = pPSPlacementView.Code;
                    } else {
                        haVar = pPSPlacementView.V;
                    }
                    haVar.a();
                }
            }
        }

        @Override // com.huawei.hms.ads.fn
        public final void V(String str, String str2, int i10) {
            ha haVar;
            if (ex.Code()) {
                ex.Code("PPSPlacementView", "OM onSegmentMediaPause");
            }
            PPSPlacementView pPSPlacementView = PPSPlacementView.this;
            if ((str == null || str.equalsIgnoreCase(pPSPlacementView.getCurrentContentId())) && (pPSPlacementView.f23898q instanceof PlacementVideoView)) {
                if (pPSPlacementView.U.V(bm.a.SINGLE_INST)) {
                    haVar = pPSPlacementView.I;
                } else if (pPSPlacementView.U.V(bm.a.MAIN_VIEW)) {
                    haVar = pPSPlacementView.Code;
                } else {
                    haVar = pPSPlacementView.V;
                }
                haVar.e();
            }
        }

        @Override // com.huawei.hms.ads.fn
        public final void Z(String str, String str2, int i10) {
            ha haVar;
            if (ex.Code()) {
                ex.Code("PPSPlacementView", "OM onSegmentMediaCompletion");
            }
            PPSPlacementView pPSPlacementView = PPSPlacementView.this;
            if (str != null && !str.equalsIgnoreCase(pPSPlacementView.getCurrentContentId())) {
                ex.V("PPSPlacementView", "OM onSegmentMediaCompletion not equals");
                return;
            }
            if (!pPSPlacementView.M) {
                pPSPlacementView.M = true;
                if (pPSPlacementView.f23898q instanceof PlacementVideoView) {
                    if (pPSPlacementView.U.V(bm.a.SINGLE_INST)) {
                        haVar = pPSPlacementView.I;
                    } else if (pPSPlacementView.U.V(bm.a.MAIN_VIEW)) {
                        haVar = pPSPlacementView.Code;
                    } else {
                        haVar = pPSPlacementView.V;
                    }
                    haVar.a();
                }
            }
        }

        @Override // com.huawei.hms.ads.fn
        public final void Code(String str, String str2, int i10, int i11) {
            ha haVar;
            PPSPlacementView pPSPlacementView = PPSPlacementView.this;
            if ((str == null || str.equalsIgnoreCase(pPSPlacementView.getCurrentContentId())) && !pPSPlacementView.M && (pPSPlacementView.f23898q instanceof PlacementVideoView)) {
                if (pPSPlacementView.U.V(bm.a.SINGLE_INST)) {
                    haVar = pPSPlacementView.I;
                } else {
                    haVar = pPSPlacementView.U.V(bm.a.MAIN_VIEW) ? pPSPlacementView.Code : pPSPlacementView.V;
                }
                haVar.Code(i10);
            }
        }

        @Override // com.huawei.hms.ads.fn
        public final void Code(String str, String str2, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes2.dex */
    public class g implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ List f23916s;

        public g(List list) {
            this.f23916s = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int size;
            StringBuilder sb2 = new StringBuilder("register:");
            List list = this.f23916s;
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            sb2.append(size);
            ex.V("PPSPlacementView", sb2.toString());
            PPSPlacementView pPSPlacementView = PPSPlacementView.this;
            pPSPlacementView.I((List<com.huawei.openalliance.ad.inter.data.f>) list);
            if (!androidx.transition.n.h(list) && !androidx.transition.n.h(pPSPlacementView.L)) {
                pPSPlacementView.f23886c = 0;
                pPSPlacementView.f23880a = pPSPlacementView.getCurrentAd();
                pPSPlacementView.f23885b = pPSPlacementView.getNextAd();
                pPSPlacementView.a();
                pPSPlacementView.e();
                PlacementMediaView placementMediaView = pPSPlacementView.U.V(bm.a.SINGLE_INST) ? pPSPlacementView.f23892j : pPSPlacementView.f23890h;
                pPSPlacementView.b();
                pPSPlacementView.Code(placementMediaView);
                if (pPSPlacementView.f23904w) {
                    pPSPlacementView.L();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class h implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ViewParent f23918s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ PlacementMediaView f23919t;

        public h(ViewParent viewParent, PlacementMediaView placementMediaView) {
            this.f23918s = viewParent;
            this.f23919t = placementMediaView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent viewParent = this.f23918s;
            if (viewParent != null) {
                ((ViewGroup) viewParent).removeView(this.f23919t);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class i implements fm {
        public i() {
        }

        @Override // com.huawei.hms.ads.fm
        public final void Code() {
            ex.V("PPSPlacementView", "videoRenderStart");
            PPSPlacementView pPSPlacementView = PPSPlacementView.this;
            pPSPlacementView.k();
            if (pPSPlacementView.E && pPSPlacementView.f23896n != null) {
                pPSPlacementView.E = false;
                pPSPlacementView.G = true;
                ex.V("PPSPlacementView", "onMediaStart callback, playTime: %s", Integer.valueOf(pPSPlacementView.f23901t));
                pPSPlacementView.f23896n.Code(pPSPlacementView.f23901t);
                pPSPlacementView.l();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class j implements View.OnClickListener {

        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                PPSPlacementView.this.c();
            }
        }

        public j() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            gb.w.b(new a());
        }
    }

    /* loaded from: classes2.dex */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSPlacementView.this.S = true;
        }
    }

    /* loaded from: classes2.dex */
    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ha haVar;
            ex.V("PPSPlacementView", "onClose");
            PPSPlacementView pPSPlacementView = PPSPlacementView.this;
            pPSPlacementView.F.Code();
            if (pPSPlacementView.U.V(bm.a.SINGLE_INST)) {
                haVar = pPSPlacementView.I;
            } else if (pPSPlacementView.U.V(bm.a.MAIN_VIEW)) {
                haVar = pPSPlacementView.Code;
            } else {
                haVar = pPSPlacementView.V;
            }
            haVar.d();
            pPSPlacementView.Code.I();
            pPSPlacementView.V.I();
            pPSPlacementView.I.I();
        }
    }

    /* loaded from: classes2.dex */
    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ex.V("PPSPlacementView", com.anythink.expressad.foundation.d.c.f9459cb);
            PPSPlacementView pPSPlacementView = PPSPlacementView.this;
            if (pPSPlacementView.f23898q != null) {
                pPSPlacementView.f23898q.C();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ex.V("PPSPlacementView", "stop");
            PPSPlacementView pPSPlacementView = PPSPlacementView.this;
            if (pPSPlacementView.f23898q != null) {
                pPSPlacementView.f23898q.S();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            ex.V("PPSPlacementView", "muteSound");
            PPSPlacementView pPSPlacementView = PPSPlacementView.this;
            boolean z11 = true;
            pPSPlacementView.f23899r = true;
            if (pPSPlacementView.f23905x == 1) {
                pPSPlacementView.m();
            }
            if (pPSPlacementView.f23890h != null) {
                pPSPlacementView.f23890h.I();
                z10 = true;
            } else {
                z10 = false;
            }
            if (pPSPlacementView.f23891i != null) {
                pPSPlacementView.f23891i.I();
                z10 = true;
            }
            if (pPSPlacementView.f23892j != null) {
                pPSPlacementView.f23892j.I();
            } else {
                z11 = z10;
            }
            if (z11) {
                pPSPlacementView.F.Code(pPSPlacementView.f23899r);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class p implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ float f23928s;

        public p(float f) {
            this.f23928s = f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ha haVar;
            float f = this.f23928s;
            ex.V("PPSPlacementView", "set sound volume: %s", Float.valueOf(f));
            PPSPlacementView pPSPlacementView = PPSPlacementView.this;
            if (pPSPlacementView.f23898q != null) {
                pPSPlacementView.f23898q.setSoundVolume(f);
                if (pPSPlacementView.U.V(bm.a.SINGLE_INST)) {
                    haVar = pPSPlacementView.I;
                } else if (pPSPlacementView.U.V(bm.a.MAIN_VIEW)) {
                    haVar = pPSPlacementView.Code;
                } else {
                    haVar = pPSPlacementView.V;
                }
                haVar.V(f);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class q implements Runnable {
        public q() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ex.V("PPSPlacementView", "unmuteSound");
            PPSPlacementView pPSPlacementView = PPSPlacementView.this;
            boolean z10 = false;
            pPSPlacementView.f23899r = false;
            boolean z11 = true;
            if (pPSPlacementView.f23905x == 1) {
                pPSPlacementView.l();
            }
            if (pPSPlacementView.f23890h != null) {
                pPSPlacementView.f23890h.B();
                z10 = true;
            }
            if (pPSPlacementView.f23891i != null) {
                pPSPlacementView.f23891i.B();
                z10 = true;
            }
            if (pPSPlacementView.f23892j != null) {
                pPSPlacementView.f23892j.B();
            } else {
                z11 = z10;
            }
            if (z11) {
                pPSPlacementView.F.Code(pPSPlacementView.f23899r);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class r implements Runnable {
        public r() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ex.V("PPSPlacementView", "resumeView");
            PPSPlacementView pPSPlacementView = PPSPlacementView.this;
            if (pPSPlacementView.f23898q != null) {
                pPSPlacementView.f23898q.resumeView();
                pPSPlacementView.f23898q.f(pPSPlacementView.f23899r);
                pPSPlacementView.Code(pPSPlacementView.getCurrentAdDuration() * 2);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface s {
        void Code();
    }

    /* loaded from: classes2.dex */
    public static class t implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<PPSPlacementView> f23932a;

        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ int f23933s;

            public a(int i10) {
                this.f23933s = i10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                PPSPlacementView pPSPlacementView = t.this.f23932a.get();
                if (pPSPlacementView == null) {
                    return;
                }
                int i10 = this.f23933s;
                ex.V("PPSPlacementView", "onAudioFocusChange %d previous: %d", Integer.valueOf(i10), Integer.valueOf(pPSPlacementView.P));
                if (i10 != -3) {
                    if (i10 != -2 && i10 != -1) {
                        if (i10 == 1 || i10 == 2) {
                            ex.V("PPSPlacementView", "handleAudioFocusGain.");
                            if (pPSPlacementView.Q && pPSPlacementView.f23898q != null) {
                                pPSPlacementView.f23898q.B();
                            }
                        }
                    } else {
                        t.a(pPSPlacementView);
                    }
                } else {
                    t.a(pPSPlacementView);
                }
                pPSPlacementView.P = i10;
            }
        }

        public t(PPSPlacementView pPSPlacementView) {
            this.f23932a = new WeakReference<>(pPSPlacementView);
        }

        public static void a(PPSPlacementView pPSPlacementView) {
            ex.V("PPSPlacementView", "handleAudioFocusLossTransientCanDuck soundMuted: " + pPSPlacementView.f23899r);
            if (!pPSPlacementView.f23899r && pPSPlacementView.f23898q != null) {
                pPSPlacementView.f23898q.I();
                pPSPlacementView.Q = true;
            }
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i10) {
            gb.w.b(new a(i10));
        }
    }

    public PPSPlacementView(Context context) {
        super(context);
        this.S = true;
        this.Code = new go();
        this.V = new go();
        this.I = new go();
        this.L = new ArrayList(4);
        this.f23886c = 0;
        this.f = false;
        this.f23889g = false;
        this.f23893k = null;
        this.f23894l = null;
        this.f23895m = null;
        this.f23896n = null;
        this.o = null;
        this.f23897p = null;
        this.f23899r = false;
        this.f23900s = false;
        this.f23901t = -1;
        this.f23902u = -1;
        this.f23903v = false;
        this.f23904w = false;
        this.f23905x = -1;
        this.f23906z = null;
        this.A = false;
        this.E = false;
        this.G = false;
        this.H = false;
        this.P = 0;
        this.Q = false;
        this.U = new bm();
        this.W = new i();
        this.f23881aa = new Handler(Looper.myLooper(), new c());
        this.f23882ab = new f();
        this.f23883ac = new j();
        this.f23884ad = new t(this);
        Code(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        if (this.f23903v) {
            return;
        }
        this.f23903v = true;
        this.F.V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        this.f23888e = arrayList;
        V(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.huawei.openalliance.ad.inter.data.k getCurrentAd() {
        if (this.f23886c < this.L.size()) {
            return this.L.get(this.f23886c);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getCurrentAdDuration() {
        com.huawei.openalliance.ad.inter.data.l S;
        com.huawei.openalliance.ad.inter.data.k currentAd = getCurrentAd();
        if (currentAd != null && (S = currentAd.S()) != null) {
            return S.A;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCurrentContentId() {
        com.huawei.openalliance.ad.inter.data.k currentAd = getCurrentAd();
        if (currentAd == null) {
            return null;
        }
        return currentAd.L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.huawei.openalliance.ad.inter.data.l getCurrentMediaFile() {
        if (getCurrentAd() != null) {
            return getCurrentAd().S();
        }
        return null;
    }

    private ia.b getCurrentMediaState() {
        PlacementMediaView placementMediaView = this.f23898q;
        if (placementMediaView == null) {
            return null;
        }
        return placementMediaView.getMediaState();
    }

    private int getCurrentPlayTime() {
        int i10 = this.f23886c;
        if (i10 < 1) {
            return 0;
        }
        return this.f23897p[i10 - 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.huawei.openalliance.ad.inter.data.k getNextAd() {
        if (this.f23886c < this.L.size() - 1) {
            return this.L.get(this.f23886c + 1);
        }
        return null;
    }

    private void h() {
        PlacementMediaView placementMediaView;
        com.huawei.openalliance.ad.inter.data.k nextAd = getNextAd();
        if (nextAd != null) {
            this.D.V(nextAd.s(), nextAd.t());
        }
        this.F.Code(nextAd);
        this.F.Z();
        bm bmVar = this.U;
        bm.a aVar = bm.a.SINGLE_INST;
        if (bmVar.V(aVar)) {
            this.f23892j = V(this.f23892j, nextAd);
            Code(new bm(aVar), nextAd, this.f23892j);
            Code(this.f23892j);
        } else {
            if (Math.abs(this.f23890h.getAlpha() - 1.0f) < 0.01f) {
                this.U.Code(bm.a.BACKUP_VIEW);
                Code(this.f23891i);
                placementMediaView = this.f23890h;
            } else {
                this.U.Code(bm.a.MAIN_VIEW);
                Code(this.f23890h);
                placementMediaView = this.f23891i;
            }
            Code(placementMediaView, false);
        }
        this.D.b();
        ex.V("PPSPlacementView", "show " + this.f23886c + " ad");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.H = false;
        ex.V("PPSPlacementView", "timeout, cancel.");
        this.f23881aa.removeMessages(1001);
    }

    private void j() {
        if (this.f23906z == null) {
            return;
        }
        try {
            ex.V("PPSPlacementView", "showLastFrame");
            this.A = false;
            this.f23906z.setVisibility(0);
            this.f23906z.setScaleType(ImageView.ScaleType.FIT_CENTER);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            addView(this.f23906z, layoutParams);
        } catch (Throwable unused) {
            ex.I("PPSPlacementView", "showLastFrame error.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        String concat;
        if (!n()) {
            ex.I("PPSPlacementView", "audio focus is not needed");
            return;
        }
        try {
            ex.V("PPSPlacementView", "requestAudioFocus");
            if (Build.VERSION.SDK_INT < 26) {
                this.R.requestAudioFocus(this.f23884ad, 3, 2);
            } else {
                AudioFocusRequest build = new AudioFocusRequest.Builder(2).setOnAudioFocusChangeListener(this.f23884ad).build();
                this.T = build;
                this.R.requestAudioFocus(build);
            }
        } catch (IllegalStateException unused) {
            concat = "requestAudioFocus IllegalStateException";
            ex.I("PPSPlacementView", concat);
        } catch (Exception e10) {
            concat = "requestAudioFocus ".concat(e10.getClass().getSimpleName());
            ex.I("PPSPlacementView", concat);
        }
    }

    private boolean n() {
        ex.V("PPSPlacementView", "isNeedAudioFocus type: %s soundMute: %s", Integer.valueOf(this.f23905x), Boolean.valueOf(this.f23899r));
        int i10 = this.f23905x;
        if (i10 == 0) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        if (i10 == 1 && this.f23899r) {
            return false;
        }
        return true;
    }

    @Override // com.huawei.hms.ads.ft
    public void a_() {
        this.f23901t = -1;
        this.f23900s = false;
    }

    @Override // com.huawei.hms.ads.km
    public void destroyView() {
        gb.w.b(new b());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int Code = jr.Code(motionEvent);
            if (Code == 0) {
                this.J = jr.Code(this, motionEvent);
            }
            if (1 == Code) {
                jr.Code(this, motionEvent, null, this.J);
            }
        } catch (Throwable th) {
            ex.I("PPSPlacementView", "dispatchTouchEvent exception : %s", th.getClass().getSimpleName());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void hideAdvertiserInfoDialog() {
        a0.a.n(getContext(), new Intent("com.huawei.ads.feedback.action.FINISH_FEEDBACK_ACTIVITY"));
    }

    public boolean isPlaying() {
        PlacementMediaView placementMediaView = this.f23898q;
        if (placementMediaView != null) {
            return placementMediaView.o();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ex.Code("PPSPlacementView", "onAttachedToWindow");
        this.D.D();
        je.Code(getContext()).V(getContext());
    }

    public void onClose() {
        gb.w.b(new l());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ex.V("PPSPlacementView", "onDetechedFromWindow");
        this.D.L();
        this.Code.I();
        this.V.I();
        this.I.I();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        this.D.a();
    }

    public void pause() {
        gb.w.b(new m());
    }

    @Override // com.huawei.hms.ads.km
    public void pauseView() {
        gb.w.b(new a());
    }

    @Override // com.huawei.hms.ads.km
    public void resumeView() {
        gb.w.b(new r());
    }

    public void setAudioFocusType(int i10) {
        this.f23905x = i10;
    }

    public void setMediaPlayerReleaseListener(fj fjVar) {
        if (fjVar == null) {
            return;
        }
        this.O = fjVar;
    }

    public void setOnPlacementAdClickListener(s sVar) {
        this.f23887d = sVar;
    }

    public void setOverlays(List<View> list) {
        this.K = list;
    }

    public void setSoundVolume(float f10) {
        gb.w.b(new p(f10));
    }

    public void showAdvertiserInfoDialog(View view, boolean z10) {
        if (view == null) {
            ex.I("PPSPlacementView", "anchorView is null");
        }
        try {
            com.huawei.openalliance.ad.inter.data.k currentAd = getCurrentAd();
            if (currentAd == null) {
                ex.I("PPSPlacementView", "adInfo is null");
                return;
            }
            AdContentData m10 = currentAd.m();
            if (androidx.transition.n.h(m10.i0())) {
                ex.I("PPSPlacementView", "advertiser Info is null");
            } else {
                ComplianceActivity.m(getContext(), view, m10, z10);
            }
        } catch (Throwable th) {
            ex.I("PPSPlacementView", "showAdvertiserInfoDialog has exception %s", th.getClass().getSimpleName());
        }
    }

    public void stop() {
        gb.w.b(new n());
    }

    public PPSPlacementView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.S = true;
        this.Code = new go();
        this.V = new go();
        this.I = new go();
        this.L = new ArrayList(4);
        this.f23886c = 0;
        this.f = false;
        this.f23889g = false;
        this.f23893k = null;
        this.f23894l = null;
        this.f23895m = null;
        this.f23896n = null;
        this.o = null;
        this.f23897p = null;
        this.f23899r = false;
        this.f23900s = false;
        this.f23901t = -1;
        this.f23902u = -1;
        this.f23903v = false;
        this.f23904w = false;
        this.f23905x = -1;
        this.f23906z = null;
        this.A = false;
        this.E = false;
        this.G = false;
        this.H = false;
        this.P = 0;
        this.Q = false;
        this.U = new bm();
        this.W = new i();
        this.f23881aa = new Handler(Looper.myLooper(), new c());
        this.f23882ab = new f();
        this.f23883ac = new j();
        this.f23884ad = new t(this);
        Code(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(String str, String str2, int i10) {
        gb.w.b(new e(str, str2, i10));
    }

    private void Z(ha haVar) {
        List<View> list;
        hl V = haVar.V();
        if (V == null || (list = this.K) == null || list.size() <= 0) {
            return;
        }
        Iterator<View> it = this.K.iterator();
        while (it.hasNext()) {
            V.Code(it.next(), hk.OTHER, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        bm bmVar;
        com.huawei.openalliance.ad.inter.data.k kVar;
        PlacementMediaView placementMediaView;
        bm bmVar2 = this.U;
        bm.a aVar = bm.a.SINGLE_INST;
        ex.Code("PPSPlacementView", "initPlacementView, singlePlayerInst: %s", Boolean.valueOf(bmVar2.V(aVar)));
        this.D.V(this.f23880a.s(), this.f23880a.t());
        this.F.Code(this.f23880a);
        if (this.U.V(aVar)) {
            PlacementMediaView V = V(this.f23892j, this.f23880a);
            this.f23892j = V;
            V.setMediaPlayerReleaseListener(this.O);
            bmVar = new bm(aVar);
            kVar = this.f23880a;
            placementMediaView = this.f23892j;
        } else {
            this.f23890h = V(this.f23890h, this.f23880a);
            Code(new bm(bm.a.MAIN_VIEW), this.f23880a, this.f23890h);
            this.f23891i = V(this.f23891i, this.f23885b);
            bmVar = new bm(bm.a.BACKUP_VIEW);
            kVar = this.f23885b;
            placementMediaView = this.f23891i;
        }
        Code(bmVar, kVar, placementMediaView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        String valueOf = String.valueOf(this.N);
        this.F.Code(valueOf);
        this.F.Code(this.N);
        PlacementMediaView placementMediaView = this.f23892j;
        if (placementMediaView != null) {
            placementMediaView.Code(valueOf);
            this.f23892j.Code(this.N);
        }
        PlacementMediaView placementMediaView2 = this.f23890h;
        if (placementMediaView2 != null) {
            placementMediaView2.Code(valueOf);
            this.f23890h.Code(this.N);
        }
        PlacementMediaView placementMediaView3 = this.f23891i;
        if (placementMediaView3 != null) {
            placementMediaView3.Code(valueOf);
            this.f23891i.Code(this.N);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.S) {
            androidx.activity.n.G0 = System.currentTimeMillis();
            this.S = false;
            ex.V("PPSPlacementView", "onClick");
            Code((Integer) 1);
            this.F.Code(this.J);
            this.J = null;
            V(this.U.V(bm.a.SINGLE_INST) ? this.I : this.U.V(bm.a.MAIN_VIEW) ? this.Code : this.V);
            s sVar = this.f23887d;
            if (sVar != null) {
                sVar.Code();
            }
            gb.w.a(500L, new k());
        }
    }

    private boolean f() {
        return this.f23886c == this.L.size() - 1;
    }

    private void g() {
        bm bmVar;
        com.huawei.openalliance.ad.inter.data.k kVar;
        PlacementMediaView placementMediaView;
        this.f23886c++;
        ex.V("PPSPlacementView", "load " + this.f23886c + " ad");
        if (getNextAd() == null || this.U.V(bm.a.SINGLE_INST)) {
            return;
        }
        if (Math.abs(this.f23890h.getAlpha() - 1.0f) < 0.01f) {
            com.huawei.openalliance.ad.inter.data.k nextAd = getNextAd();
            this.f23885b = nextAd;
            this.f23891i = V(this.f23891i, nextAd);
            bmVar = new bm(bm.a.BACKUP_VIEW);
            kVar = this.f23885b;
            placementMediaView = this.f23891i;
        } else {
            com.huawei.openalliance.ad.inter.data.k nextAd2 = getNextAd();
            this.f23880a = nextAd2;
            this.f23890h = V(this.f23890h, nextAd2);
            bmVar = new bm(bm.a.MAIN_VIEW);
            kVar = this.f23880a;
            placementMediaView = this.f23890h;
        }
        Code(bmVar, kVar, placementMediaView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        gb.w.b(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void m() {
        String concat;
        try {
            try {
                ex.V("PPSPlacementView", "abandonAudioFocus");
                if (Build.VERSION.SDK_INT < 26) {
                    this.R.abandonAudioFocus(this.f23884ad);
                } else {
                    Object obj = this.T;
                    if (obj instanceof AudioFocusRequest) {
                        this.R.abandonAudioFocusRequest((AudioFocusRequest) obj);
                    }
                    this.T = null;
                }
            } catch (IllegalStateException unused) {
                concat = "abandonAudioFocus IllegalStateException";
                ex.I("PPSPlacementView", concat);
            } catch (Exception e10) {
                concat = "abandonAudioFocus ".concat(e10.getClass().getSimpleName());
                ex.I("PPSPlacementView", concat);
            }
        } finally {
            this.Q = false;
            this.P = 0;
        }
    }

    public void C() {
        gb.w.b(new o());
    }

    public void D() {
        this.f23896n = null;
    }

    public void F() {
        this.o = null;
    }

    @Override // com.huawei.hms.ads.ft
    public void I() {
        this.f23904w = true;
        this.f = false;
        this.f23889g = false;
        long currentTimeMillis = System.currentTimeMillis();
        this.N = currentTimeMillis;
        ex.Code("PPSPlacementView", "onViewPhysicalShowStart: %s", Long.valueOf(currentTimeMillis));
        com.huawei.openalliance.ad.inter.data.k currentAd = getCurrentAd();
        if (currentAd != null) {
            currentAd.f22281u = false;
            currentAd.Z(false);
        }
        b();
        if (this.f23880a != null) {
            L();
            (this.U.V(bm.a.SINGLE_INST) ? this.I : this.U.V(bm.a.MAIN_VIEW) ? this.Code : this.V).L();
        }
    }

    public void S() {
        gb.w.b(new q());
    }

    public PPSPlacementView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.S = true;
        this.Code = new go();
        this.V = new go();
        this.I = new go();
        this.L = new ArrayList(4);
        this.f23886c = 0;
        this.f = false;
        this.f23889g = false;
        this.f23893k = null;
        this.f23894l = null;
        this.f23895m = null;
        this.f23896n = null;
        this.o = null;
        this.f23897p = null;
        this.f23899r = false;
        this.f23900s = false;
        this.f23901t = -1;
        this.f23902u = -1;
        this.f23903v = false;
        this.f23904w = false;
        this.f23905x = -1;
        this.f23906z = null;
        this.A = false;
        this.E = false;
        this.G = false;
        this.H = false;
        this.P = 0;
        this.Q = false;
        this.U = new bm();
        this.W = new i();
        this.f23881aa = new Handler(Looper.myLooper(), new c());
        this.f23882ab = new f();
        this.f23883ac = new j();
        this.f23884ad = new t(this);
        Code(context);
    }

    private ha Code(bm bmVar) {
        if (bmVar.V(bm.a.SINGLE_INST)) {
            this.I.I();
            go goVar = new go();
            this.I = goVar;
            return goVar;
        }
        if (bmVar.V(bm.a.MAIN_VIEW)) {
            this.Code.I();
            go goVar2 = new go();
            this.Code = goVar2;
            return goVar2;
        }
        this.V.I();
        go goVar3 = new go();
        this.V = goVar3;
        return goVar3;
    }

    private PlacementMediaView V(PlacementMediaView placementMediaView, com.huawei.openalliance.ad.inter.data.k kVar) {
        if (kVar == null) {
            return null;
        }
        boolean z10 = true;
        ex.Code("PPSPlacementView", "init media view for content:%s", kVar.L());
        if (Code(placementMediaView, kVar)) {
            Code(placementMediaView, false);
        } else {
            Code(placementMediaView, true);
            placementMediaView = null;
        }
        if (placementMediaView == null) {
            placementMediaView = Code(kVar);
        } else {
            z10 = false;
        }
        if (placementMediaView != null) {
            ex.V("PPSPlacementView", "meida view created");
            placementMediaView.e(this);
            fg fgVar = this.f23893k;
            if (fgVar != null) {
                placementMediaView.b(fgVar);
            }
            fm fmVar = this.W;
            if (fmVar != null) {
                placementMediaView.d(fmVar);
            }
            fl flVar = this.f23894l;
            if (flVar != null) {
                placementMediaView.Code(flVar);
            }
            placementMediaView.Code(this);
            fh fhVar = this.f23895m;
            if (fhVar != null) {
                placementMediaView.c(fhVar);
            }
            fn fnVar = this.f23882ab;
            if (fnVar != null) {
                placementMediaView.p(fnVar);
            }
            if (z10) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(13);
                addView(placementMediaView, layoutParams);
            }
            placementMediaView.setAlpha(gl.Code);
            placementMediaView.setPlacementAd(kVar);
            placementMediaView.setAudioFocusType(2);
        }
        return placementMediaView;
    }

    @Override // com.huawei.hms.ads.fn
    public void Z(String str, String str2, int i10) {
        PlacementMediaView placementMediaView;
        String currentContentId = getCurrentContentId();
        if (str != null && !str.equalsIgnoreCase(currentContentId)) {
            ex.V("PPSPlacementView", "onCompletion, %s not match current contentId: %s.", str, currentContentId);
            return;
        }
        boolean f10 = f();
        if (!f10) {
            PlacementMediaView placementMediaView2 = this.f23898q;
            if (placementMediaView2 instanceof PlacementVideoView) {
                this.f23906z = placementMediaView2.getLastFrame();
                j();
            }
        }
        i();
        ex.V("PPSPlacementView", "onSegmentMediaCompletion, contentId: %s, url: %s", str, androidx.transition.n.e(str2));
        Code(i10);
        this.D.c();
        this.f23898q.Code(i10);
        V(f10);
        if (this.f23896n != null && f10) {
            int currentPlayTime = getCurrentPlayTime() + i10;
            ex.V("PPSPlacementView", "mediaCompletion callback, playedTime: %s", Integer.valueOf(currentPlayTime));
            this.f23896n.Z(currentPlayTime);
            if (this.U.V(bm.a.SINGLE_INST) && (placementMediaView = this.f23892j) != null) {
                placementMediaView.V();
            }
        }
        ix ixVar = this.F;
        if (ixVar != null) {
            long j10 = i10;
            ixVar.Code(getContext(), j10, j10);
        }
    }

    @Override // com.huawei.hms.ads.fl
    public void V() {
        ex.V("PPSPlacementView", "onUnmute");
        this.f23899r = false;
    }

    private PlacementMediaView Code(com.huawei.openalliance.ad.inter.data.k kVar) {
        if (kVar == null) {
            ex.I("PPSPlacementView", "create media view with null ad");
            return null;
        }
        ex.Code("PPSPlacementView", "create media view for content:%s", kVar.L());
        if (kVar.V()) {
            ex.V("PPSPlacementView", "create video view");
            return new PlacementVideoView(getContext());
        }
        if (kVar.E()) {
            ex.V("PPSPlacementView", "create image view");
            return new PlacementImageView(getContext());
        }
        ex.V("PPSPlacementView", "return image view for default");
        return new PlacementImageView(getContext());
    }

    @Override // com.huawei.hms.ads.ft
    public void V(long j10, int i10) {
        if (!this.f23889g) {
            this.f23889g = true;
            this.F.Code(j10, i10);
        }
        this.f23904w = false;
        this.f23903v = false;
    }

    private void I(long j10, int i10) {
        com.huawei.openalliance.ad.inter.data.k currentAd = getCurrentAd();
        if (currentAd == null || this.f || j10 <= currentAd.s()) {
            return;
        }
        this.f = true;
        Code(Long.valueOf(j10), Integer.valueOf(i10), (Integer) null);
    }

    @Override // com.huawei.hms.ads.fl
    public void Code() {
        ex.V("PPSPlacementView", "onMute");
        this.f23899r = true;
    }

    public void V(fl flVar) {
        if (flVar == null) {
            return;
        }
        PlacementMediaView placementMediaView = this.f23890h;
        if (placementMediaView != null) {
            placementMediaView.V(flVar);
        } else {
            this.f23894l = null;
        }
    }

    private void Code(int i10) {
        int i11;
        if (this.f23900s && (i11 = this.f23901t) >= 0) {
            this.f23902u = i10 - i11;
            this.f23900s = false;
        }
        this.f23901t = -1;
    }

    private void I(ha haVar) {
        if (haVar != null) {
            haVar.D();
        }
    }

    private void V(ha haVar) {
        if (haVar != null) {
            haVar.Code(hw.CLICK);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code(long j10) {
        if (this.H) {
            return;
        }
        this.H = true;
        ex.V("PPSPlacementView", "timeout, submit: %s", Long.valueOf(j10));
        this.f23881aa.sendEmptyMessageDelayed(1001, j10);
    }

    @Override // com.huawei.hms.ads.fn
    public void I(String str, String str2, int i10) {
        ex.V("PPSPlacementView", "onSegmentMediaStop, contentId: %s, url: %s", str, androidx.transition.n.e(str2));
        if (str != null && str.equalsIgnoreCase(getCurrentContentId())) {
            Code(i10);
        }
        if (this.f23896n != null && str.equalsIgnoreCase(getCurrentContentId())) {
            int currentPlayTime = getCurrentPlayTime() + i10;
            ex.V("PPSPlacementView", "mediaStop callback, playedTime: %s", Integer.valueOf(currentPlayTime));
            this.f23896n.I(currentPlayTime);
        } else {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(this.f23896n == null);
            objArr[1] = getCurrentContentId();
            ex.V("PPSPlacementView", "skip mediaStop callback, listener null ? %s, currentContentId: %s", objArr);
        }
    }

    @Override // com.huawei.hms.ads.fn
    public void V(String str, String str2, int i10) {
        ex.V("PPSPlacementView", "onSegmentMediaPause:" + androidx.transition.n.e(str2));
        if (str != null && str.equalsIgnoreCase(getCurrentContentId())) {
            Code(i10);
        }
        if (this.f23896n != null) {
            int currentPlayTime = getCurrentPlayTime() + i10;
            ex.V("PPSPlacementView", "mediaPause callback, playedTime: %s", Integer.valueOf(currentPlayTime));
            this.f23896n.V(currentPlayTime);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(List<com.huawei.openalliance.ad.inter.data.f> list) {
        com.huawei.openalliance.ad.inter.data.l S;
        com.huawei.openalliance.ad.inter.data.l S2;
        if (androidx.transition.n.h(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        this.L.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.huawei.openalliance.ad.inter.data.f fVar = (com.huawei.openalliance.ad.inter.data.f) arrayList.get(i10);
            if ((fVar instanceof com.huawei.openalliance.ad.inter.data.k) && (S2 = fVar.S()) != null) {
                String str = S2.f22283t;
                if (2 == S2.f22288z || (str != null && str.startsWith(bw.CONTENT.toString()))) {
                    this.L.add((com.huawei.openalliance.ad.inter.data.k) fVar);
                } else {
                    ex.V("PPSPlacementView", "has no cache, discard " + fVar.L());
                }
            }
        }
        int size2 = this.L.size();
        this.f23897p = new int[size2];
        if (androidx.transition.n.h(this.L)) {
            return;
        }
        Collections.sort(this.L);
        for (int i11 = 0; i11 < size2; i11++) {
            com.huawei.openalliance.ad.inter.data.k kVar = this.L.get(i11);
            int i12 = (kVar == null || (S = kVar.S()) == null) ? 0 : (int) S.A;
            int[] iArr = this.f23897p;
            if (i11 == 0) {
                iArr[i11] = i12;
            } else {
                iArr[i11] = i12 + iArr[i11 - 1];
            }
        }
    }

    @Override // com.huawei.hms.ads.ft
    public void Code(long j10, int i10) {
        I(this.f23902u, i10);
    }

    public void V(List<View> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (View view : list) {
            if (view instanceof PlacementVideoView) {
                view = (PlacementVideoView) view;
            }
            view.setOnClickListener(this.f23883ac);
        }
    }

    private void Code(Context context) {
        bm bmVar;
        bm.a aVar;
        setBackgroundColor(-16777216);
        setUseRatioInMatchParentMode(false);
        this.F = new ik(context, this);
        this.D = new fu(this, this);
        this.R = (AudioManager) context.getSystemService(com.anythink.expressad.exoplayer.k.o.f9069b);
        if (ec.Code(context).aj()) {
            bmVar = this.U;
            aVar = bm.a.SINGLE_INST;
        } else {
            bmVar = this.U;
            aVar = bm.a.MAIN_VIEW;
        }
        bmVar.Code(aVar);
    }

    private void V(boolean z10) {
        if (this.f23886c < this.L.size() - 1) {
            h();
            if (z10) {
                return;
            }
            g();
        }
    }

    public void Code(fl flVar) {
        if (flVar == null) {
            return;
        }
        PlacementMediaView placementMediaView = this.f23890h;
        if (placementMediaView != null) {
            placementMediaView.Code(flVar);
        } else {
            this.f23894l = flVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code(ha haVar) {
        if (haVar == null || getCurrentAd() == null || getCurrentAd().S() == null) {
            return;
        }
        ex.V("PPSPlacementView", "om start");
        haVar.Code((float) getCurrentAd().S().A, !"y".equals(getCurrentAd().S().f22287x));
    }

    private void Code(ha haVar, PlacementMediaView placementMediaView) {
        if (placementMediaView instanceof PlacementVideoView) {
            haVar.Code(hz.Code(gl.Code, true, hy.STANDALONE));
            ((PlacementVideoView) placementMediaView).C0 = haVar;
        } else if (placementMediaView instanceof PlacementImageView) {
            haVar.L();
        }
    }

    public void Code(ke keVar) {
        if (keVar == null) {
            return;
        }
        this.o = keVar;
    }

    public void Code(kf kfVar) {
        if (kfVar == null) {
            return;
        }
        this.f23896n = kfVar;
    }

    private void Code(bm bmVar, com.huawei.openalliance.ad.inter.data.d dVar, PlacementMediaView placementMediaView) {
        if (dVar instanceof com.huawei.openalliance.ad.inter.data.k) {
            AdContentData m10 = ((com.huawei.openalliance.ad.inter.data.k) dVar).m();
            ha Code = Code(bmVar);
            Code.Code(getContext(), m10, placementMediaView, true);
            Z(Code);
            Code.Z();
            Code(Code, placementMediaView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code(PlacementMediaView placementMediaView) {
        if (placementMediaView == null) {
            ex.I("PPSPlacementView", "show ad with null media view");
            return;
        }
        this.f23902u = -1;
        ex.Code("PPSPlacementView", "showAd:%s", Integer.valueOf(this.f23886c));
        this.f23898q = placementMediaView;
        placementMediaView.setAlpha(1.0f);
        placementMediaView.f(this.f23899r);
        if (!isShown()) {
            ex.I("PPSPlacementView", "view not visible, pause.");
            pauseView();
        }
        Code(placementMediaView.getDuration() * 2);
    }

    private void Code(PlacementMediaView placementMediaView, boolean z10) {
        if (placementMediaView != null) {
            com.huawei.openalliance.ad.inter.data.f placementAd = placementMediaView.getPlacementAd();
            ex.V("PPSPlacementView", "unloadMediaView, contentId: %s, remove: %s", placementAd != null ? placementAd.L() : null, Boolean.valueOf(z10));
            placementMediaView.S();
            placementMediaView.setPlacementAd(null);
            ViewParent parent = placementMediaView.getParent();
            if (parent == null || !(parent instanceof ViewGroup)) {
                return;
            }
            placementMediaView.setAlpha(gl.Code);
            if (z10) {
                gb.w.b(new h(parent, placementMediaView));
            }
        }
    }

    public void Code(Integer num) {
        Code(Long.valueOf(System.currentTimeMillis() - this.D.Z()), Integer.valueOf(this.D.I()), num);
    }

    private void Code(Long l10, Integer num, Integer num2) {
        com.huawei.openalliance.ad.inter.data.k currentAd = getCurrentAd();
        if (currentAd == null) {
            return;
        }
        boolean b10 = gb.y.b(currentAd.b_(), num2);
        if (!currentAd.f22281u || (b10 && !currentAd.U())) {
            ix ixVar = this.F;
            Object valueOf = Long.valueOf(this.N);
            ixVar.Code(valueOf instanceof String ? (String) valueOf : valueOf != null ? String.valueOf(valueOf) : null);
            this.F.Code(this.N);
            this.F.Code(l10.longValue(), num.intValue(), num2);
            if (b10) {
                currentAd.Z(true);
            }
            if (currentAd.f22281u) {
                return;
            }
            currentAd.f22281u = true;
            I(this.U.V(bm.a.SINGLE_INST) ? this.I : this.U.V(bm.a.MAIN_VIEW) ? this.Code : this.V);
        }
    }

    @Override // com.huawei.hms.ads.fn
    public void Code(String str, String str2, int i10) {
        ex.V("PPSPlacementView", "onSegmentMediaStart, contentId: %s, url: %s", str, androidx.transition.n.e(str2));
        this.f23900s = true;
        this.f23901t = i10;
        PlacementMediaView placementMediaView = this.f23898q;
        if (placementMediaView != null) {
            placementMediaView.setAlpha(1.0f);
        }
        if (this.f23896n != null && this.f23886c == 0) {
            ex.V("PPSPlacementView", "need notify media start.");
            this.E = true;
        }
        if (this.o == null || this.f23898q == null) {
            return;
        }
        ex.V("PPSPlacementView", "mediaChange callback.");
        this.o.Code(this.f23898q.getPlacementAd());
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    @Override // com.huawei.hms.ads.fn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Code(java.lang.String r12, java.lang.String r13, int r14, int r15) {
        /*
            r11 = this;
            ia.b r14 = r11.getCurrentMediaState()
            java.lang.String r0 = "PPSPlacementView"
            if (r14 == 0) goto L16
            ia.d r1 = ia.d.PLAYING
            boolean r14 = r14.d(r1)
            if (r14 == 0) goto L16
            java.lang.String r12 = "progress callback on nonPlaying state."
            com.huawei.hms.ads.ex.I(r0, r12)
            return
        L16:
            java.lang.String r14 = r11.getCurrentContentId()
            if (r12 == 0) goto L23
            boolean r14 = r12.equalsIgnoreCase(r14)
            if (r14 != 0) goto L23
            return
        L23:
            long r7 = r11.getCurrentAdDuration()
            boolean r14 = r11.f23900s
            r9 = 0
            r10 = 1
            if (r14 != 0) goto L36
            int r1 = r11.f23901t
            if (r1 >= 0) goto L36
            r11.f23901t = r15
            r11.f23900s = r10
            goto L66
        L36:
            if (r14 == 0) goto L66
            int r14 = r11.f23901t
            if (r14 < 0) goto L66
            int r14 = r15 - r14
            r11.f23902u = r14
            long r1 = (long) r14
            com.huawei.hms.ads.fu r14 = r11.D
            int r14 = r14.I()
            r11.I(r1, r14)
            int r14 = r11.f23902u
            long r1 = (long) r14
            long r3 = r11.getCurrentAdDuration()
            int r14 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r14 < 0) goto L57
            r14 = r10
            goto L58
        L57:
            r14 = r9
        L58:
            com.huawei.hms.ads.ix r1 = r11.F
            if (r1 == 0) goto L67
            android.content.Context r2 = r11.getContext()
            long r3 = (long) r15
            r5 = r7
            r1.Code(r2, r3, r5)
            goto L67
        L66:
            r14 = r9
        L67:
            com.huawei.hms.ads.kf r1 = r11.f23896n
            if (r1 != 0) goto L71
            boolean r1 = r11.f23900s
            if (r1 != 0) goto L71
            if (r15 <= 0) goto L91
        L71:
            long r1 = (long) r15
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 <= 0) goto L7d
            r1 = 0
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L7d
            int r15 = (int) r7
        L7d:
            int r1 = r11.getCurrentPlayTime()
            int r1 = r1 + r15
            int[] r2 = r11.f23897p
            int r3 = r2.length
            int r3 = r3 - r10
            r2 = r2[r3]
            int r2 = r1 / r2
            com.huawei.hms.ads.kf r3 = r11.f23896n
            if (r3 == 0) goto L91
            r3.Code(r2, r1)
        L91:
            if (r15 <= 0) goto L9a
            boolean r1 = r11.A
            if (r1 != 0) goto L9a
            r11.k()
        L9a:
            if (r15 <= 0) goto Lb0
            boolean r1 = r11.E
            if (r1 == 0) goto Lb0
            com.huawei.hms.ads.kf r1 = r11.f23896n
            if (r1 == 0) goto Lb0
            r11.E = r9
            r11.G = r10
            int r2 = r11.f23901t
            r1.Code(r2)
            r11.l()
        Lb0:
            if (r14 == 0) goto Lc6
            java.lang.String r14 = "time countdown finish, manual stop."
            com.huawei.hms.ads.ex.V(r0, r14)
            com.huawei.openalliance.ad.views.PlacementMediaView r14 = r11.f23898q
            r14.S()
            com.huawei.hms.ads.fn r14 = r11.f23882ab
            if (r14 == 0) goto Lc3
            r14.Z(r12, r13, r15)
        Lc3:
            r11.Z(r12, r13, r15)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.views.PPSPlacementView.Code(java.lang.String, java.lang.String, int, int):void");
    }

    @Override // com.huawei.hms.ads.fn
    public void Code(String str, String str2, int i10, int i11, int i12) {
        PlacementMediaView placementMediaView;
        com.huawei.openalliance.ad.inter.data.l S;
        ex.V("PPSPlacementView", "onSegmentMediaError, contentId: %s, url: %s", str, androidx.transition.n.e(str2));
        String currentContentId = getCurrentContentId();
        if (str != null && !str.equalsIgnoreCase(currentContentId)) {
            ex.V("PPSPlacementView", "onError, contentId not match, currentConentId: %s", currentContentId);
            return;
        }
        k();
        i();
        ex.I("PPSPlacementView", "onSegmentMediaError:" + androidx.transition.n.e(str2) + ", playTime:" + i10 + ",errorCode:" + i11 + ",extra:" + i12);
        Code(i10);
        if (this.f23896n != null) {
            int currentPlayTime = getCurrentPlayTime() + i10;
            ex.V("PPSPlacementView", "mediaError callback, playedTime: %s", Integer.valueOf(currentPlayTime));
            this.f23896n.Code(currentPlayTime, i11, i12);
        }
        if (!this.G) {
            ex.V("PPSPlacementView", "error before start callback.");
            this.E = true;
        }
        this.D.c();
        this.f23898q.Code(i10);
        com.huawei.openalliance.ad.inter.data.k currentAd = getCurrentAd();
        if (currentAd != null && (S = currentAd.S()) != null) {
            this.F.Code(S.f22283t, i11, i12, currentAd);
        }
        boolean f10 = f();
        V(f10);
        if (this.f23896n == null || !f10 || this.f23897p.length <= 0) {
            return;
        }
        ex.V("PPSPlacementView", "last ad play error");
        kf kfVar = this.f23896n;
        int[] iArr = this.f23897p;
        kfVar.Z(iArr[iArr.length - 1]);
        if (!this.U.V(bm.a.SINGLE_INST) || (placementMediaView = this.f23892j) == null) {
            return;
        }
        placementMediaView.V();
    }

    public void Code(List<com.huawei.openalliance.ad.inter.data.f> list) {
        gb.w.b(new g(list));
    }

    private boolean Code(PlacementMediaView placementMediaView, com.huawei.openalliance.ad.inter.data.k kVar) {
        return ((placementMediaView instanceof PlacementVideoView) && kVar.V()) || ((placementMediaView instanceof PlacementImageView) && kVar.E());
    }
}
