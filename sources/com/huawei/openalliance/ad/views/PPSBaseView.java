package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.hms.ads.ec;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.fs;
import com.huawei.hms.ads.fx;
import com.huawei.hms.ads.go;
import com.huawei.hms.ads.ha;
import com.huawei.hms.ads.hw;
import com.huawei.hms.ads.ig;
import com.huawei.hms.ads.iw;
import com.huawei.hms.ads.jf;
import com.huawei.hms.ads.jm;
import com.huawei.hms.ads.kc;
import com.huawei.openalliance.ad.beans.metadata.InteractCfg;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;

/* loaded from: classes2.dex */
public abstract class PPSBaseView<P extends iw> extends RelativeLayout implements kc {
    public static final /* synthetic */ int I = 0;
    public int A;
    public int B;
    public int C;
    public MaterialClickInfo D;
    public final a E;
    public final b F;
    public final c G;
    public final d H;

    /* renamed from: s, reason: collision with root package name */
    public ig f23814s;

    /* renamed from: t, reason: collision with root package name */
    public ha f23815t;

    /* renamed from: u, reason: collision with root package name */
    public AdContentData f23816u;

    /* renamed from: v, reason: collision with root package name */
    public int f23817v;

    /* renamed from: w, reason: collision with root package name */
    public fs f23818w;

    /* renamed from: x, reason: collision with root package name */
    public Long f23819x;
    public View y;

    /* renamed from: z, reason: collision with root package name */
    public jm f23820z;

    /* loaded from: classes2.dex */
    public class a extends fx {

        /* renamed from: com.huawei.openalliance.ad.views.PPSBaseView$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0305a implements Runnable {
            public RunnableC0305a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                PPSBaseView.this.f23815t.I();
            }
        }

        public a(View view) {
            super(view);
        }

        @Override // com.huawei.hms.ads.fx
        public final void Code() {
            fs fsVar = PPSBaseView.this.f23818w;
            if (fsVar != null) {
                fsVar.L();
            }
        }

        @Override // com.huawei.hms.ads.fx
        public final void Code(long j10, int i10) {
            PPSBaseView pPSBaseView = PPSBaseView.this;
            pPSBaseView.S();
            if (pPSBaseView.f23819x == null) {
                ex.I("PPSBaseView", "onViewShowEnd - no adShowStartTime");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - pPSBaseView.f23819x.longValue();
            ig igVar = pPSBaseView.f23814s;
            if (igVar != null) {
                igVar.Code(pPSBaseView.f23816u, currentTimeMillis, 100);
                pPSBaseView.f23814s.C();
            }
            pPSBaseView.f23819x = null;
            gb.w.a(150L, new RunnableC0305a());
        }
    }

    /* loaded from: classes2.dex */
    public class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int i10;
            int i11 = PPSBaseView.I;
            PPSBaseView pPSBaseView = PPSBaseView.this;
            pPSBaseView.getClass();
            if (motionEvent.getAction() == 0) {
                pPSBaseView.setOnTouchListener(null);
                view.setEnabled(false);
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                if (ex.Code()) {
                    ex.Code("PPSBaseView", "touch down image x=%f, y=%f", Float.valueOf(rawX), Float.valueOf(rawY));
                }
                MaterialClickInfo a10 = j7.r.a(view, motionEvent);
                pPSBaseView.D = a10;
                if (a10 != null) {
                    a10.e(com.huawei.openalliance.ad.constant.w.cW);
                    pPSBaseView.D.d(Float.valueOf(gb.z.l(pPSBaseView.getContext())));
                }
                ig igVar = pPSBaseView.f23814s;
                int i12 = (int) rawX;
                int i13 = (int) rawY;
                AdContentData adContentData = pPSBaseView.f23816u;
                Long l10 = pPSBaseView.f23819x;
                MaterialClickInfo materialClickInfo = pPSBaseView.D;
                if (2 == jf.C(adContentData.a1())) {
                    i10 = 17;
                } else {
                    i10 = 7;
                }
                igVar.Code(i12, i13, adContentData, l10, materialClickInfo, i10);
                pPSBaseView.f23815t.Code(hw.CLICK);
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class c implements View.OnTouchListener {

        /* renamed from: s, reason: collision with root package name */
        public float f23824s;

        /* renamed from: t, reason: collision with root package name */
        public float f23825t;

        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            MaterialClickInfo a10;
            int action = motionEvent.getAction();
            boolean z10 = false;
            PPSBaseView pPSBaseView = PPSBaseView.this;
            if (action == 0) {
                this.f23824s = motionEvent.getX();
                this.f23825t = motionEvent.getY();
                if (ex.Code()) {
                    ex.Code("PPSBaseView", "startX = %s, startY = %s", Float.valueOf(this.f23824s), Float.valueOf(this.f23825t));
                }
                pPSBaseView.D = j7.r.a(pPSBaseView, motionEvent);
            }
            if (2 == motionEvent.getAction()) {
                float x10 = motionEvent.getX();
                float y = motionEvent.getY();
                if (ex.Code()) {
                    ex.Code("PPSBaseView", " endX= %s, endY = %s, startX - endX= %s, startY - endY= %s", Float.valueOf(x10), Float.valueOf(y), Float.valueOf(this.f23824s - x10), Float.valueOf(this.f23825t - y));
                }
                float f = this.f23824s - x10;
                float f10 = this.f23825t - y;
                int i10 = pPSBaseView.C;
                if ((i10 == 0 && f10 >= pPSBaseView.A) || (1 == i10 && Math.sqrt((f10 * f10) + (f * f)) >= pPSBaseView.A)) {
                    z10 = true;
                }
                if (z10) {
                    pPSBaseView.setOnTouchListener(null);
                    Integer num = com.huawei.openalliance.ad.constant.w.cX;
                    MaterialClickInfo materialClickInfo = pPSBaseView.D;
                    if (materialClickInfo != null) {
                        materialClickInfo.d(Float.valueOf(gb.z.l(pPSBaseView.getContext())));
                        if (num != null) {
                            materialClickInfo.e(num);
                        }
                        if (materialClickInfo.k() == null) {
                            materialClickInfo.e(com.huawei.openalliance.ad.constant.w.cW);
                        }
                        if (materialClickInfo.k() == com.huawei.openalliance.ad.constant.w.cW && (a10 = j7.r.a(pPSBaseView, motionEvent)) != null) {
                            materialClickInfo.j(a10.c());
                            materialClickInfo.g(a10.i());
                        }
                    }
                    pPSBaseView.f23814s.Code(0, 0, pPSBaseView.f23816u, pPSBaseView.f23819x, pPSBaseView.D, 18);
                    pPSBaseView.D = null;
                    pPSBaseView.f23815t.Code(hw.CLICK);
                }
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class d implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class e implements jm.a {
        public e() {
        }

        @Override // com.huawei.hms.ads.jm.a
        public final void Code(float f, float f10, float f11) {
            float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10) + (f * f));
            boolean Code = ex.Code();
            PPSBaseView pPSBaseView = PPSBaseView.this;
            if (Code) {
                ex.Code("PPSBaseView", "accLimitNew: %s, xAcc: %s yAcc: %s zAcc: %s, sqrtAcc: %s", Integer.valueOf(pPSBaseView.B), Float.valueOf(f), Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(sqrt));
            }
            if (pPSBaseView.f23819x != null) {
                int i10 = pPSBaseView.B;
                if (sqrt >= i10) {
                    ex.V("PPSBaseView", "meet, accLimitNew: %s, sqrtAcc: %s", Integer.valueOf(i10), Float.valueOf(sqrt));
                    pPSBaseView.f23820z.V();
                    String str = pPSBaseView.getWidth() + "*" + pPSBaseView.getHeight();
                    MaterialClickInfo.a aVar = new MaterialClickInfo.a();
                    aVar.f22252d = com.huawei.openalliance.ad.constant.w.cY;
                    aVar.f22251c = str;
                    aVar.f22254g = Float.valueOf(gb.z.l(pPSBaseView.getContext()));
                    MaterialClickInfo materialClickInfo = new MaterialClickInfo(aVar);
                    pPSBaseView.D = materialClickInfo;
                    pPSBaseView.f23814s.Code(0, 0, pPSBaseView.f23816u, pPSBaseView.f23819x, materialClickInfo, 19);
                    pPSBaseView.f23815t.Code(hw.CLICK);
                }
            }
        }
    }

    public PPSBaseView(Context context) {
        super(context);
        this.f23815t = new go();
        this.f23819x = null;
        this.E = new a(this);
        b bVar = new b();
        this.F = bVar;
        this.G = new c();
        this.H = new d();
        setOnTouchListener(bVar);
    }

    @Override // com.huawei.hms.ads.kc
    public final void B() {
        this.f23818w.F();
    }

    @Override // com.huawei.hms.ads.kc
    public boolean C() {
        return this instanceof PPSImageView;
    }

    @Override // com.huawei.hms.ads.kc
    public final void Code(int i10) {
        this.f23818w.V(i10);
    }

    @Override // com.huawei.hms.ads.kc
    public void D() {
        ig igVar = this.f23814s;
        if (igVar != null) {
            igVar.V(this.f23819x);
        }
    }

    @Override // com.huawei.hms.ads.kc
    public void F() {
        ig igVar = this.f23814s;
        if (igVar != null) {
            igVar.Code(this.f23819x);
        }
    }

    @Override // com.huawei.hms.ads.kc
    public final void I(int i10) {
        this.f23818w.C(i10);
    }

    @Override // com.huawei.hms.ads.kc
    public final void V() {
        ex.V("PPSBaseView", "show ad");
        this.f23814s.Code(this.f23816u);
    }

    @Override // com.huawei.hms.ads.kc
    public final void Z() {
        ex.V("PPSBaseView", "notifyAdLoaded");
        this.f23819x = Long.valueOf(System.currentTimeMillis());
        this.f23818w.Code(this.f23816u);
    }

    @Override // com.huawei.hms.ads.km
    public final void destroyView() {
        jm jmVar = this.f23820z;
        if (jmVar != null) {
            jmVar.V();
        }
    }

    @Override // com.huawei.hms.ads.kc
    public fs getAdMediator() {
        return this.f23818w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.E;
        if (aVar != null) {
            aVar.D();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ex.V("PPSBaseView", "detached from window");
        a aVar = this.E;
        if (aVar != null) {
            aVar.L();
        }
        this.f23815t.I();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        a aVar = this.E;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.huawei.hms.ads.kc
    public void setAdContent(AdContentData adContentData) {
        int A;
        int H;
        this.f23816u = adContentData;
        if (adContentData.G0() != null) {
            InteractCfg G0 = adContentData.G0();
            if (G0.x() != null && G0.x().intValue() > 0) {
                A = G0.x().intValue();
            } else {
                A = ec.Code(getContext()).A();
            }
            this.A = A;
            if (G0.u() != null && G0.u().intValue() > 0) {
                H = G0.u().intValue();
            } else {
                H = ec.Code(getContext()).H();
            }
            this.B = H;
            if (G0.A() != null && G0.A().intValue() > 0) {
                G0.A().intValue();
            } else {
                ec.Code(getContext()).G();
            }
            this.C = G0.p().intValue();
            return;
        }
        this.A = ec.Code(getContext()).A();
        this.B = ec.Code(getContext()).H();
        ec.Code(getContext()).G();
    }

    @Override // com.huawei.hms.ads.kc
    public void setAdMediator(fs fsVar) {
        this.f23818w = fsVar;
    }

    @Override // com.huawei.hms.ads.kc
    public void setDisplayDuration(int i10) {
        this.f23817v = i10;
    }

    @Override // com.huawei.hms.ads.kc
    public void Code(int i10, int i11) {
        ex.V("PPSBaseView", "user click skip button");
        this.f23814s.Code(i10, i11, this.f23819x);
        this.f23815t.d();
        this.f23815t.I();
    }

    @Override // com.huawei.hms.ads.kc
    public final void Code(View view, Integer num) {
        this.y = view;
        if (view != null) {
            view.setOnTouchListener(this.F);
        }
        AdContentData adContentData = this.f23816u;
        String a12 = adContentData == null ? null : adContentData.a1();
        int C = jf.C(a12);
        if (ex.Code()) {
            ex.Code("PPSBaseView", "ctrlswitch:%s", a12);
            ex.Code("PPSBaseView", "splashpro mode:%s, splashInteractCfg: %s", Integer.valueOf(C), num);
        }
        if (C == 2) {
            setOnTouchListener(null);
            if (num == null) {
                return;
            }
            if (1 == num.intValue() || 4 == num.intValue()) {
                setOnTouchListener(this.G);
                if (this.y == null || 1 != num.intValue()) {
                    return;
                }
                this.y.setOnTouchListener(null);
                return;
            }
            if (2 == num.intValue() || 3 == num.intValue()) {
                setOnTouchListener(this.H);
                jm jmVar = new jm(getContext());
                this.f23820z = jmVar;
                jmVar.Code(new e());
                this.f23820z.Code();
                if (this.y == null || 2 != num.intValue()) {
                    return;
                }
                this.y.setOnTouchListener(null);
            }
        }
    }

    @Override // com.huawei.hms.ads.kc
    public final void Code(ha haVar) {
        if (haVar != null) {
            this.f23815t = haVar;
        }
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
    public final void resumeView() {
    }

    @Override // com.huawei.hms.ads.kc
    public void setAudioFocusType(int i10) {
    }
}
