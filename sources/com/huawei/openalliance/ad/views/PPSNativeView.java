package com.huawei.openalliance.ad.views;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.hms.ads.AdFeedbackListener;
import com.huawei.hms.ads.ChoicesView;
import com.huawei.hms.ads.annotation.AllApi;
import com.huawei.hms.ads.cf;
import com.huawei.hms.ads.cl;
import com.huawei.hms.ads.dh;
import com.huawei.hms.ads.dynamic.ObjectWrapper;
import com.huawei.hms.ads.er;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.ft;
import com.huawei.hms.ads.fu;
import com.huawei.hms.ads.gk;
import com.huawei.hms.ads.gl;
import com.huawei.hms.ads.go;
import com.huawei.hms.ads.ha;
import com.huawei.hms.ads.hk;
import com.huawei.hms.ads.hl;
import com.huawei.hms.ads.hw;
import com.huawei.hms.ads.hy;
import com.huawei.hms.ads.hz;
import com.huawei.hms.ads.ie;
import com.huawei.hms.ads.ir;
import com.huawei.hms.ads.je;
import com.huawei.hms.ads.jf;
import com.huawei.hms.ads.jr;
import com.huawei.hms.ads.js;
import com.huawei.hms.ads.jt;
import com.huawei.hms.ads.ju;
import com.huawei.hms.ads.jy;
import com.huawei.hms.ads.kn;
import com.huawei.hms.ads.nativead.DislikeAdListener;
import com.huawei.hms.ads.nativead.R;
import com.huawei.hms.ads.uiengine.IRemoteCreator;
import com.huawei.hms.ads.whythisad.CusWhyThisAdView;
import com.huawei.openalliance.ad.activity.ComplianceActivity;
import com.huawei.openalliance.ad.activity.FeedbackActivity;
import com.huawei.openalliance.ad.activity.a;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.constant.bj;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class PPSNativeView extends RelativeLayout implements ft, gk, jy {
    public static final /* synthetic */ int A = 0;
    private ir B;
    private fu C;
    protected ha Code;
    private ChoicesView D;
    private View F;
    private boolean I;
    private int L;
    private com.huawei.openalliance.ad.inter.data.j S;

    /* renamed from: a, reason: collision with root package name */
    private CusWhyThisAdView f23848a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f23849b;

    /* renamed from: c, reason: collision with root package name */
    private j f23850c;

    /* renamed from: d, reason: collision with root package name */
    private l f23851d;

    /* renamed from: e, reason: collision with root package name */
    private m f23852e;
    private k f;

    /* renamed from: g, reason: collision with root package name */
    private jt f23853g;

    /* renamed from: h, reason: collision with root package name */
    private ju f23854h;

    /* renamed from: i, reason: collision with root package name */
    private js f23855i;

    /* renamed from: j, reason: collision with root package name */
    private List<View> f23856j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f23857k;

    /* renamed from: l, reason: collision with root package name */
    private final String f23858l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f23859m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f23860n;
    private DislikeAdListener o;

    /* renamed from: p, reason: collision with root package name */
    private String f23861p;

    /* renamed from: q, reason: collision with root package name */
    private String f23862q;

    /* renamed from: r, reason: collision with root package name */
    private MaterialClickInfo f23863r;

    /* renamed from: s, reason: collision with root package name */
    private CusWhyThisAdView.a f23864s;

    /* renamed from: t, reason: collision with root package name */
    private hl f23865t;

    /* renamed from: u, reason: collision with root package name */
    private AdFeedbackListener f23866u;

    /* renamed from: v, reason: collision with root package name */
    private IRemoteCreator f23867v;

    /* renamed from: w, reason: collision with root package name */
    private cf f23868w;

    /* renamed from: x, reason: collision with root package name */
    private View f23869x;
    private ImageView y;

    /* renamed from: z, reason: collision with root package name */
    private View.OnClickListener f23870z;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PPSNativeView pPSNativeView = PPSNativeView.this;
            if (!pPSNativeView.Code() && pPSNativeView.S != null) {
                if (pPSNativeView.S.m() == null) {
                    ex.V("PPSNativeView", "adInfo is null");
                } else if (androidx.transition.n.h(pPSNativeView.S.m().i0())) {
                    gb.z.e(pPSNativeView.getContext(), pPSNativeView.S);
                } else {
                    ComplianceActivity.m(pPSNativeView.getContext(), view, pPSNativeView.S.m(), true);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PPSNativeView pPSNativeView = PPSNativeView.this;
            if (!pPSNativeView.f23860n && pPSNativeView.S != null) {
                ComplianceActivity.m(pPSNativeView.getContext(), view, pPSNativeView.S.m(), false);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements com.huawei.hms.ads.whythisad.b {
        public c() {
        }

        @Override // com.huawei.hms.ads.whythisad.b
        public final void Code() {
            PPSNativeView.this.d();
        }

        @Override // com.huawei.hms.ads.whythisad.b
        public final List<String> I() {
            PPSNativeView pPSNativeView = PPSNativeView.this;
            if (pPSNativeView.S == null) {
                ex.I("PPSNativeView", "getKeyWords nativaAd is null");
                return null;
            }
            return pPSNativeView.S.l();
        }

        @Override // com.huawei.hms.ads.whythisad.b
        public final void V() {
            PPSNativeView pPSNativeView = PPSNativeView.this;
            if (pPSNativeView.S != null) {
                gb.z.e(pPSNativeView.getContext(), pPSNativeView.S);
            } else {
                ex.I("PPSNativeView", "processWhyThisAdEvent nativaAd is null");
            }
        }

        @Override // com.huawei.hms.ads.whythisad.b
        public final void Code(String str) {
            PPSNativeView pPSNativeView = PPSNativeView.this;
            pPSNativeView.d();
            ArrayList arrayList = new ArrayList();
            if (str == null || str.isEmpty()) {
                arrayList = null;
            } else {
                arrayList.add(str);
            }
            pPSNativeView.setWhyAdViewStatus(CusWhyThisAdView.a.DISLIKED);
            pPSNativeView.Code(arrayList);
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSNativeView pPSNativeView = PPSNativeView.this;
            com.huawei.openalliance.ad.inter.data.j jVar = pPSNativeView.S;
            if (jVar != null) {
                pPSNativeView.Code(Long.valueOf(jVar.s()), Integer.valueOf(pPSNativeView.C.I()), null, false);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PPSNativeView.this.Code(view, 7);
        }
    }

    /* loaded from: classes2.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSNativeView.this.I = true;
        }
    }

    /* loaded from: classes2.dex */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSNativeView.this.f23855i.cancel();
        }
    }

    /* loaded from: classes2.dex */
    public interface j {
        void Code(View view);
    }

    /* loaded from: classes2.dex */
    public interface k {
    }

    /* loaded from: classes2.dex */
    public interface l {
    }

    /* loaded from: classes2.dex */
    public interface m {
        void B();

        void I();

        void V();

        void Z();
    }

    public PPSNativeView(Context context) {
        super(context);
        this.I = true;
        this.Code = new go();
        this.f23857k = false;
        this.f23858l = com.huawei.openalliance.ad.constant.w.ah + hashCode();
        this.f23859m = false;
        this.f23864s = CusWhyThisAdView.a.NONE;
        this.f23870z = new f();
        Code(context);
    }

    private void L() {
        ex.Code("PPSNativeView", "initChoicesView start");
        if (this.D == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.hiad_choices_wrapper, (ViewGroup) null);
            this.F = inflate;
            this.D = (ChoicesView) inflate.findViewById(R.id.hiad_choices_icon);
            this.y = (ImageView) this.F.findViewById(R.id.compliance_icon);
            addView(this.F);
            View view = this.F;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        setChoiceViewPosition(1);
        this.D.setOnClickListener(new a());
        this.y.setOnClickListener(new b());
    }

    public static /* synthetic */ l S(PPSNativeView pPSNativeView) {
        pPSNativeView.getClass();
        return null;
    }

    private void a() {
        ex.Code("PPSNativeView", "update choiceView start.");
        if (this.D == null) {
            ex.Code("PPSNativeView", "do not need update choiceView");
            return;
        }
        if (this.f23848a == null) {
            Z();
        }
        if (!this.f23860n && this.f23848a != null) {
            ex.Code("PPSNativeView", "cusWhyView is not null, set choiceView as close.");
            this.D.V();
        } else if (!TextUtils.isEmpty(this.f23861p)) {
            ex.Code("PPSNativeView", "update choiceView.");
            if (TextUtils.isEmpty(this.f23862q)) {
                this.D.I();
            } else {
                this.D.setAdChoiceIcon(this.f23862q);
            }
        }
    }

    private boolean b() {
        Integer num = this.S.L;
        if (num != null && 3 == num.intValue()) {
            V(getContext());
            return true;
        }
        return false;
    }

    private boolean c() {
        com.huawei.openalliance.ad.inter.data.j jVar;
        if (this.y == null || this.f23860n || (jVar = this.S) == null || jVar.m() == null || androidx.transition.n.h(this.S.m().i0())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        CusWhyThisAdView cusWhyThisAdView = this.f23848a;
        if (cusWhyThisAdView != null) {
            ViewGroup viewGroup = (ViewGroup) cusWhyThisAdView.getParent();
            if (viewGroup != null) {
                V(viewGroup, 4);
            }
            this.f23848a.setVisibility(0);
            setBackgroundColor(getResources().getColor(R.color.hiad_whythisad_root_bg));
        }
    }

    private void e() {
        Code(this.L);
        V(this.D);
        if (!this.f23849b && f()) {
            setWhyAdViewStatus(CusWhyThisAdView.a.NONE);
            this.I = true;
            V(this, 0);
        }
    }

    private boolean f() {
        if (getWhyAdViewStatus() != CusWhyThisAdView.a.NONE && getWhyAdViewStatus() == CusWhyThisAdView.a.INIT) {
            return true;
        }
        return false;
    }

    private void g() {
        View view;
        IRemoteCreator iRemoteCreator = this.f23867v;
        if (iRemoteCreator != null && (view = this.f23869x) != null) {
            try {
                iRemoteCreator.destroyView(ObjectWrapper.wrap(view));
            } catch (Throwable th) {
                ex.V("PPSNativeView", "destory remote view err: %s", th.getClass().getSimpleName());
            }
        }
        this.f23867v = null;
        this.f23869x = null;
        this.f23868w = null;
    }

    private CusWhyThisAdView.a getWhyAdViewStatus() {
        return this.f23864s;
    }

    private void h() {
        er.Code(getContext()).V();
        this.C.V();
        jt jtVar = this.f23853g;
        if (jtVar != null) {
            jtVar.S();
            this.f23853g.setPpsNativeView(null);
        }
        this.f23853g = null;
        this.o = null;
        this.f23866u = null;
        k();
    }

    @AllApi
    public static void hideFeedback(Context context) {
        if (context != null) {
            a0.a.n(context, new Intent("com.huawei.ads.feedback.action.FINISH_FEEDBACK_ACTIVITY"));
        }
    }

    private void i() {
        js jsVar = this.f23855i;
        if (jsVar != null) {
            jsVar.setClickActionListener(new e());
        }
    }

    private void j() {
        com.huawei.openalliance.ad.inter.data.j jVar;
        if (C() && (jVar = this.S) != null && !jVar.E) {
            ex.V("PPSNativeView", " maybe report show start.");
            I();
        }
    }

    private void k() {
        List<View> list = this.f23856j;
        if (list != null && !list.isEmpty()) {
            for (View view : this.f23856j) {
                if (view != null) {
                    view.setOnClickListener(null);
                }
            }
            setOnClickListener(null);
        }
    }

    private void l() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        this.f23856j = arrayList;
        V(arrayList);
    }

    private void m() {
        n();
        Code((Integer) 3, false);
        ha haVar = this.Code;
        if (haVar != null) {
            haVar.d();
            this.Code.I();
        }
        jt jtVar = this.f23853g;
        if (jtVar != null) {
            jtVar.S();
        }
        DislikeAdListener dislikeAdListener = this.o;
        if (dislikeAdListener != null) {
            dislikeAdListener.onAdDisliked();
        }
        h();
    }

    private void n() {
        if (this.f23855i != null) {
            gb.w.b(new h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        n();
        ha haVar = this.Code;
        if (haVar != null) {
            haVar.d();
            this.Code.I();
        }
        jt jtVar = this.f23853g;
        if (jtVar != null) {
            jtVar.S();
        }
        DislikeAdListener dislikeAdListener = this.o;
        if (dislikeAdListener != null) {
            dislikeAdListener.onAdDisliked();
        }
        h();
    }

    private void setNativeVideoViewClickable(jt jtVar) {
        if (jtVar instanceof NativeVideoView) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((NativeVideoView) jtVar);
            V(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWhyAdViewStatus(CusWhyThisAdView.a aVar) {
        this.f23864s = aVar;
    }

    private void setWindowImageViewClickable(ju juVar) {
        if (juVar instanceof NativeWindowImageView) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((NativeWindowImageView) juVar);
            V(arrayList);
        }
    }

    @Override // com.huawei.hms.ads.jy
    public void D() {
        ha haVar = this.Code;
        if (haVar != null) {
            haVar.Code(hw.CLICK);
        }
    }

    @Override // com.huawei.hms.ads.ft
    public void I() {
        m mVar;
        this.f23857k = false;
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf(currentTimeMillis);
        com.huawei.openalliance.ad.inter.data.j jVar = this.S;
        if (jVar == null) {
            ex.V("PPSNativeView", "nativeAd is null, please register first");
            return;
        }
        jVar.A = false;
        jVar.Z(false);
        com.huawei.openalliance.ad.inter.data.j jVar2 = this.S;
        jVar2.E = true;
        jVar2.l(valueOf);
        this.S.S(currentTimeMillis);
        if (this.f23859m && (mVar = this.f23852e) != null) {
            this.f23859m = false;
            mVar.Z();
        }
        com.huawei.openalliance.ad.inter.data.j jVar3 = this.S;
        if (!jVar3.f22278z) {
            jVar3.f22278z = true;
        }
        this.B.Code(valueOf);
        this.B.Code(currentTimeMillis);
        jt jtVar = this.f23853g;
        if (jtVar != null) {
            jtVar.Code(valueOf);
            this.f23853g.Code(currentTimeMillis);
        }
        js jsVar = this.f23855i;
        if (jsVar != null) {
            jsVar.Z(valueOf);
            this.f23855i.Code(currentTimeMillis);
        }
        cf cfVar = this.f23868w;
        if (cfVar != null) {
            cfVar.Code(valueOf);
            this.f23868w.Code(currentTimeMillis);
        }
        ha haVar = this.Code;
        if (haVar != null) {
            haVar.L();
        }
        this.B.Code();
    }

    @Override // com.huawei.hms.ads.ft
    public void V(long j10, int i10) {
        gb.w.d(this.f23858l);
        com.huawei.openalliance.ad.inter.data.j jVar = this.S;
        if (jVar != null) {
            jVar.E = false;
        }
        this.B.Code(j10, i10);
    }

    @Override // com.huawei.hms.ads.ft
    public void a_() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.S;
        if (jVar != null) {
            gb.w.c(new d(), this.f23858l, jVar.s());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int Code = jr.Code(motionEvent);
            if (Code == 0) {
                MaterialClickInfo Code2 = jr.Code(this, motionEvent);
                this.f23863r = Code2;
                js jsVar = this.f23855i;
                if (jsVar != null) {
                    ((AppDownloadButton) jsVar).setClickInfo(Code2);
                }
            }
            if (1 == Code) {
                jr.Code(this, motionEvent, null, this.f23863r);
                js jsVar2 = this.f23855i;
                if (jsVar2 != null) {
                    ((AppDownloadButton) jsVar2).setClickInfo(this.f23863r);
                }
            }
        } catch (Throwable th) {
            ex.I("PPSNativeView", "dispatchTouchEvent exception : %s", th.getClass().getSimpleName());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public hl getAdSessionAgent() {
        return this.f23865t;
    }

    @AllApi
    public View getFeedBackView() {
        try {
            com.huawei.hms.ads.uiengine.d V = com.huawei.hms.ads.g.V();
            View view = this.f23869x;
            if (view != null && V != null) {
                return (View) ObjectWrapper.unwrap(V.Code(ObjectWrapper.wrap(view)));
            }
            return null;
        } catch (Throwable th) {
            ex.I("PPSNativeView", "get anchor view err: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    public com.huawei.openalliance.ad.inter.data.j getNativeAd() {
        return this.S;
    }

    @AllApi
    public void gotoWhyThisAdPage() {
        if (this.f23849b) {
            ex.I("PPSNativeView", "china rom should not call gotoWhyThisAdPage method");
        } else if (this.S != null) {
            gb.z.e(getContext(), this.S);
        } else {
            ex.I("PPSNativeView", "skipWhyThisAdPage nativaAd is null");
        }
    }

    @AllApi
    public void hideAdvertiserInfoDialog() {
        hideFeedback(getContext());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        fu fuVar = this.C;
        if (fuVar != null) {
            fuVar.D();
        }
        com.huawei.openalliance.ad.inter.data.j jVar = this.S;
        if (jVar != null) {
            Code((com.huawei.openalliance.ad.inter.data.d) jVar);
        }
        je.Code(getContext()).V(getContext());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ex.V("PPSNativeView", "onDetechedFromWindow");
        fu fuVar = this.C;
        if (fuVar != null) {
            fuVar.L();
        }
        ha haVar = this.Code;
        if (haVar != null) {
            haVar.I();
        }
    }

    public void onViewUpdate() {
        if (ex.Code()) {
            ex.Code("PPSNativeView", "manual updateView");
        }
        this.C.onGlobalLayout();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        fu fuVar = this.C;
        if (fuVar != null) {
            fuVar.a();
        }
    }

    @AllApi
    public void pause() {
        try {
            com.huawei.hms.ads.uiengine.d V = com.huawei.hms.ads.g.V();
            View view = this.f23869x;
            if (view != null && V != null) {
                V.Code(ObjectWrapper.wrap(view), (Bundle) null);
            }
        } catch (Throwable th) {
            ex.I("PPSNativeView", "pauseVideo err: %s", th.getClass().getSimpleName());
        }
    }

    @AllApi
    public void resume() {
        try {
            com.huawei.hms.ads.uiengine.d V = com.huawei.hms.ads.g.V();
            View view = this.f23869x;
            if (view != null && V != null) {
                V.V(ObjectWrapper.wrap(view), (Bundle) null);
            }
        } catch (Throwable th) {
            ex.I("PPSNativeView", "resumeVideo err: %s", th.getClass().getSimpleName());
        }
    }

    public void setAdContainerSizeMatched(String str) {
        this.B.V(str);
    }

    @AllApi
    public void setAdFeedbackListener(AdFeedbackListener adFeedbackListener) {
        this.f23866u = adFeedbackListener;
    }

    public void setChoiceViewPosition(int i10) {
        ex.Code("PPSNativeView", "setChoiceViewPosition option = " + i10);
        if (this.S == null) {
            this.L = i10;
        } else {
            Code(i10);
        }
    }

    public void setDislikeAdListener(DislikeAdListener dislikeAdListener) {
        if (this.f23849b) {
            ex.I("PPSNativeView", "china rom should not call setChoiceViewPosition method");
        } else {
            this.o = dislikeAdListener;
        }
    }

    public void setIsCustomDislikeThisAdEnabled(boolean z10) {
        if (this.f23849b) {
            ex.I("PPSNativeView", "china rom should not call this method and isCustomDislikeThisAdEnabled = " + z10);
            return;
        }
        this.f23860n = z10;
        if (!z10) {
            ex.Code("PPSNativeView", "like default feedback!");
            ChoicesView choicesView = this.D;
            if (choicesView != null) {
                choicesView.V();
                ex.Code("PPSNativeView", "setCustomLikeBackgroundResource");
            }
            Z();
            return;
        }
        ex.Code("PPSNativeView", "dont like default feedback!");
    }

    public void setMaterialClickInfo(MaterialClickInfo materialClickInfo) {
        this.f23863r = materialClickInfo;
    }

    public void setOnNativeAdClickListener(j jVar) {
        this.f23850c = jVar;
    }

    public void setOnNativeAdImpressionListener(k kVar) {
        this.f = kVar;
    }

    public void setOnNativeAdStatusTrackingListener(m mVar) {
        this.f23852e = mVar;
        this.B.Code(mVar);
    }

    @AllApi
    public void showAdvertiserInfoDialog(View view, boolean z10) {
        if (view == null) {
            ex.I("PPSNativeView", "anchorView is null");
        }
        try {
            com.huawei.openalliance.ad.inter.data.j jVar = this.S;
            if (jVar == null) {
                ex.I("PPSNativeView", "adInfo is null");
                return;
            }
            AdContentData m10 = jVar.m();
            if (androidx.transition.n.h(m10.i0())) {
                ex.I("PPSNativeView", "advertiser Info is null");
            } else {
                ComplianceActivity.m(getContext(), view, m10, z10);
            }
        } catch (Throwable th) {
            ex.I("PPSNativeView", "showAdvertiserInfoDialog has exception %s", th.getClass().getSimpleName());
        }
    }

    @AllApi
    public void showFeedback(View view) {
        String str;
        AdFeedbackListener adFeedbackListener = this.f23866u;
        i iVar = new i(this);
        dh.Code(this.S);
        Context context = getContext();
        HashMap hashMap = FeedbackActivity.M;
        if (androidx.activity.n.o()) {
            str = "fast click";
        } else {
            com.huawei.openalliance.ad.inter.data.j Code = dh.Code();
            if (Code == null) {
                str = "nativeAd is null";
            } else {
                AdContentData m10 = Code.m();
                if (m10 != null && view != null && androidx.activity.n.r(m10.d0())) {
                    int nextInt = FeedbackActivity.P.nextInt(Integer.MAX_VALUE);
                    FeedbackActivity.M.put(Integer.valueOf(nextInt), iVar);
                    FeedbackActivity.N.put(Integer.valueOf(nextInt), adFeedbackListener);
                    try {
                        int[] iArr = new int[2];
                        FeedbackActivity.O = new WeakReference<>(view.getContext());
                        view.getLocationInWindow(iArr);
                        ex.V("FeedbackActivity", "startFeedbackActivity, anchorView.getLocationInWindow [x,y]= %d, %d", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
                        int[] iArr2 = new int[2];
                        view.getLocationOnScreen(iArr2);
                        int[] iArr3 = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                        view.getViewTreeObserver().addOnGlobalLayoutListener(new a.b(view, context, iArr2));
                        Intent intent = new Intent(context, (Class<?>) FeedbackActivity.class);
                        intent.putExtra(ba.as, iArr);
                        intent.putExtra(ba.at, iArr3);
                        intent.setFlags(com.anythink.expressad.exoplayer.b.aX);
                        intent.putExtra("instanceId", nextInt);
                        if (!(context instanceof Activity)) {
                            intent.addFlags(268435456);
                        }
                        intent.setClipData(com.huawei.openalliance.ad.constant.w.cH);
                        context.startActivity(intent);
                        return;
                    } catch (Throwable th) {
                        ex.I("FeedbackActivity", "startFeedbackActivity error: %s", th.getClass().getSimpleName());
                        if (adFeedbackListener != null) {
                            adFeedbackListener.onAdFeedbackShowFailed();
                        }
                        FeedbackActivity.M.remove(Integer.valueOf(nextInt));
                        FeedbackActivity.N.remove(Integer.valueOf(nextInt));
                        return;
                    }
                }
                ex.Z("FeedbackActivity", "startFeedbackActivity fail: invalid parameter.");
                if (adFeedbackListener != null) {
                    adFeedbackListener.onAdFeedbackShowFailed();
                    return;
                }
                return;
            }
        }
        ex.V("FeedbackActivity", str);
    }

    public PPSNativeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I = true;
        this.Code = new go();
        this.f23857k = false;
        this.f23858l = com.huawei.openalliance.ad.constant.w.ah + hashCode();
        this.f23859m = false;
        this.f23864s = CusWhyThisAdView.a.NONE;
        this.f23870z = new f();
        Code(context);
    }

    public void B() {
        h();
        er.Code(getContext()).V();
        if (!this.f23849b) {
            Code(this.F);
            this.F = null;
            this.D = null;
            Code(this.f23848a);
            this.f23848a = null;
        }
        ha haVar = this.Code;
        if (haVar != null) {
            haVar.I();
        }
        g();
    }

    public boolean C() {
        fu fuVar = this.C;
        if (fuVar != null) {
            return fuVar.d();
        }
        return false;
    }

    public void Code(int i10) {
        ex.Code("PPSNativeView", "changeChoiceViewPosition option = " + i10);
        if (this.f23849b) {
            ex.I("PPSNativeView", "china rom should not call this method");
            return;
        }
        if (this.F == null) {
            ex.Code("PPSNativeView", "choicesView is null, error");
            return;
        }
        if (c()) {
            this.y.setVisibility(0);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.F.getLayoutParams());
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.hiad_10_dp);
        if (i10 != 0) {
            if (i10 == 2) {
                layoutParams.addRule(12);
            } else if (i10 == 3) {
                layoutParams.addRule(12);
            } else {
                if (i10 == 4) {
                    if (this.f23860n) {
                        ex.Code("PPSNativeView", "ADCHOICES_INVISIBLE is called and not default feedback!");
                        V(this.F, 8);
                        return;
                    }
                    this.F.setVisibility(0);
                    this.F.setLayoutParams(layoutParams);
                    this.F.bringToFront();
                }
                layoutParams.addRule(10);
            }
            layoutParams.addRule(21);
            layoutParams.setMargins(0, 0, dimensionPixelOffset, 0);
            layoutParams.setMarginEnd(dimensionPixelOffset);
            this.F.setVisibility(0);
            this.F.setLayoutParams(layoutParams);
            this.F.bringToFront();
        }
        layoutParams.addRule(10);
        layoutParams.addRule(20);
        layoutParams.setMargins(dimensionPixelOffset, 0, 0, 0);
        layoutParams.setMarginStart(dimensionPixelOffset);
        this.F.setScaleX(-1.0f);
        this.D.setScaleX(-1.0f);
        this.F.setVisibility(0);
        this.F.setLayoutParams(layoutParams);
        this.F.bringToFront();
    }

    public void F() {
        ex.V("PPSNativeView", "onClose");
        Code((List<String>) null);
    }

    public void S() {
        ha haVar = this.Code;
        if (haVar != null) {
            haVar.I();
        }
    }

    public void Z() {
        if (this.f23848a == null || getWhyAdViewStatus() != CusWhyThisAdView.a.INIT) {
            View view = this.f23848a;
            if (view != null) {
                Code(view);
                this.f23848a = null;
            }
            setWhyAdViewStatus(CusWhyThisAdView.a.INIT);
            CusWhyThisAdView cusWhyThisAdView = new CusWhyThisAdView(getContext(), this);
            this.f23848a = cusWhyThisAdView;
            addView(cusWhyThisAdView);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f23848a.getLayoutParams());
            layoutParams.addRule(13);
            this.f23848a.setLayoutParams(layoutParams);
        }
        this.f23848a.setOnCloseCallBack(new c());
    }

    public PPSNativeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.I = true;
        this.Code = new go();
        this.f23857k = false;
        this.f23858l = com.huawei.openalliance.ad.constant.w.ah + hashCode();
        this.f23859m = false;
        this.f23864s = CusWhyThisAdView.a.NONE;
        this.f23870z = new f();
        Code(context);
    }

    private void V(Context context) {
        ex.V("PPSNativeView", "showV3Ad");
        IRemoteCreator Code = com.huawei.hms.ads.g.Code(getContext().getApplicationContext());
        this.f23867v = Code;
        if (Code == null) {
            ex.V("PPSNativeView", "Creator is null");
            return;
        }
        this.f23868w = new cf(context, this, this.S);
        String p10 = gb.b.p(this.S.m());
        Bundle bundle = new Bundle();
        bundle.putBinder(bj.f.o, (IBinder) ObjectWrapper.wrap(getContext()));
        bundle.putString("content", p10);
        bundle.putInt(bj.f.Code, com.huawei.hms.ads.base.a.B);
        boolean s10 = gb.u.s(getContext().getApplicationContext());
        if (ex.Code()) {
            ex.Code("PPSNativeView", "emui9 dark %s", Boolean.valueOf(s10));
        }
        bundle.putBoolean(bj.f.f22090q, s10);
        try {
            View view = (View) ObjectWrapper.unwrap(this.f23867v.newNativeTemplateView(bundle, this.f23868w));
            this.f23869x = view;
            if (view == null) {
                ex.I("PPSNativeView", "templateView is null");
                return;
            }
            this.Code = null;
            removeAllViews();
            addView(this.f23869x);
            this.f23867v.bindData(ObjectWrapper.wrap(this.f23869x), p10);
        } catch (Throwable th) {
            ex.I("PPSNativeView", "create newNativeTemplateView err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.hms.ads.ft
    public void Code(long j10, int i10) {
        gb.w.d(this.f23858l);
        if (!this.C.Code(j10) || this.f23857k) {
            return;
        }
        this.f23857k = true;
        Code(Long.valueOf(j10), Integer.valueOf(i10), null, false);
    }

    @SuppressLint({"NewApi"})
    public PPSNativeView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.I = true;
        this.Code = new go();
        this.f23857k = false;
        this.f23858l = com.huawei.openalliance.ad.constant.w.ah + hashCode();
        this.f23859m = false;
        this.f23864s = CusWhyThisAdView.a.NONE;
        this.f23870z = new f();
    }

    private void Code(Context context) {
        this.B = new ie(context, this);
        this.C = new fu(this, this);
        boolean V = cl.Code(context).V();
        this.f23849b = V;
        if (V) {
            return;
        }
        L();
    }

    private void V(View view) {
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        view.bringToFront();
    }

    private void Code(View view) {
        ViewGroup viewGroup;
        if (view == null || (viewGroup = (ViewGroup) view.getParent()) == null) {
            return;
        }
        viewGroup.removeView(view);
    }

    private void V(View view, int i10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                viewGroup.getChildAt(i11).setVisibility(i10);
            }
        }
    }

    public void Code(View view, int i10) {
        com.huawei.openalliance.ad.inter.data.j jVar;
        if (this.I) {
            this.I = false;
            ex.V("PPSNativeView", "onClick");
            this.f23859m = true;
            j jVar2 = this.f23850c;
            if (jVar2 != null) {
                jVar2.Code(view);
            }
            er.Code(getContext()).Code();
            Code((Integer) 1, true);
            androidx.activity.n.G0 = System.currentTimeMillis();
            if (this.B.Code(this.f23863r, Integer.valueOf(i10))) {
                ha haVar = this.Code;
                if (haVar != null) {
                    haVar.Code(hw.CLICK);
                }
            } else {
                js jsVar = this.f23855i;
                if (jsVar instanceof AppDownloadButton) {
                    if (da.n.DOWNLOAD == ((AppDownloadButton) jsVar).getStatus() && (jVar = this.S) != null && jVar.l_() && jf.I(this.S.A())) {
                        ex.V("PPSNativeView", "download app directly");
                        ((AppDownloadButton) this.f23855i).performClick();
                    }
                }
            }
            this.f23863r = null;
            gb.w.a(500L, new g());
        }
    }

    public void V(js jsVar) {
        js jsVar2;
        if (jsVar == null || jsVar != (jsVar2 = this.f23855i)) {
            return;
        }
        jsVar2.setPpsNativeView(null);
        this.f23855i.Code((com.huawei.openalliance.ad.inter.data.e) null);
        this.f23855i = null;
    }

    private void V(List<View> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (View view : list) {
            if (view instanceof NativeVideoView) {
                ((NativeVideoView) view).setCoverClickListener(this.f23870z);
            } else if (view != null) {
                view.setOnClickListener(this.f23870z);
            }
        }
    }

    private void Code(ha haVar, com.huawei.openalliance.ad.inter.data.j jVar) {
        jt jtVar = this.f23853g;
        if (jtVar instanceof NativeVideoView) {
            NativeVideoView nativeVideoView = (NativeVideoView) jtVar;
            nativeVideoView.f23722g0 = haVar;
            if (jVar.B() != null) {
                nativeVideoView.f23722g0.Code(hz.Code(gl.Code, nativeVideoView.p(), hy.STANDALONE));
            }
        }
    }

    public void Code(com.huawei.openalliance.ad.inter.data.d dVar) {
        ha haVar;
        if (dVar instanceof com.huawei.openalliance.ad.inter.data.j) {
            com.huawei.openalliance.ad.inter.data.j jVar = (com.huawei.openalliance.ad.inter.data.j) dVar;
            AdContentData m10 = jVar.m();
            if (m10.f0() == 3 || (haVar = this.Code) == null) {
                return;
            }
            haVar.Code(getContext(), m10, this, true);
            this.Code.Code(false);
            this.Code.Z();
            hl V = this.Code.V();
            this.f23865t = V;
            if (V != null) {
                ChoicesView choicesView = this.D;
                hk hkVar = hk.OTHER;
                V.Code(choicesView, hkVar, null);
                this.f23865t.Code(this.f23848a, hkVar, null);
                this.f23865t.Code(this.F, hkVar, null);
            }
            Code(this.Code, jVar);
        }
    }

    public void Code(com.huawei.openalliance.ad.inter.data.e eVar) {
        this.I = true;
        if (eVar == null) {
            return;
        }
        ex.Code("PPSNativeView", "register nativeAd");
        this.S = (com.huawei.openalliance.ad.inter.data.j) eVar;
        e();
        if (!b()) {
            this.f23861p = eVar.i();
            this.f23862q = eVar.j();
            a();
        }
        this.C.V(this.S.s(), this.S.t());
        this.B.Code(this.S);
        this.B.V();
        Code((com.huawei.openalliance.ad.inter.data.d) eVar);
        j();
        l();
    }

    public void Code(com.huawei.openalliance.ad.inter.data.e eVar, List<View> list) {
        this.I = true;
        if (eVar == null) {
            return;
        }
        ex.Code("PPSNativeView", "register nativeAd");
        this.S = (com.huawei.openalliance.ad.inter.data.j) eVar;
        e();
        if (!b()) {
            this.f23861p = eVar.i();
            this.f23862q = eVar.j();
            a();
        }
        this.C.V(this.S.s(), this.S.t());
        this.B.Code(this.S);
        this.B.V();
        j();
        this.f23856j = list;
        V(list);
        Code((com.huawei.openalliance.ad.inter.data.d) eVar);
    }

    public void Code(com.huawei.openalliance.ad.inter.data.e eVar, List<View> list, jt jtVar) {
        this.f23853g = jtVar;
        Code(eVar);
        if (jtVar != null) {
            jtVar.setPpsNativeView(this);
            jtVar.setNativeAd(eVar);
            setNativeVideoViewClickable(jtVar);
        }
        this.f23856j = list;
        V(list);
    }

    public void Code(com.huawei.openalliance.ad.inter.data.e eVar, List<View> list, ju juVar) {
        Code(eVar);
        this.f23854h = juVar;
        if (juVar != null) {
            juVar.setNativeAd(eVar);
            setWindowImageViewClickable(this.f23854h);
        }
        this.f23856j = list;
        V(list);
    }

    @Override // com.huawei.hms.ads.jy
    public void Code(Integer num, boolean z10) {
        Code(Long.valueOf(System.currentTimeMillis() - this.C.Z()), Integer.valueOf(this.C.I()), num, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code(Long l10, Integer num, Integer num2, boolean z10) {
        boolean Code;
        com.huawei.openalliance.ad.inter.data.j jVar = this.S;
        if (jVar == null) {
            return;
        }
        boolean b10 = gb.y.b(jVar.b_(), num2);
        com.huawei.openalliance.ad.inter.data.j jVar2 = this.S;
        if (!jVar2.A || (b10 && !jVar2.U())) {
            this.B.Code(l10, num, num2, z10);
            if (b10) {
                this.S.Z(true);
            }
            com.huawei.openalliance.ad.inter.data.j jVar3 = this.S;
            if (jVar3.A) {
                return;
            }
            jVar3.A = true;
            m mVar = this.f23852e;
            if (mVar != null) {
                mVar.B();
            }
            ha haVar = this.Code;
            if (haVar != null) {
                haVar.D();
            }
            k kVar = this.f;
            if (kVar != null) {
                com.huawei.openalliance.ad.views.c cVar = (com.huawei.openalliance.ad.views.c) kVar;
                PPSBannerView pPSBannerView = cVar.f24134b;
                if (pPSBannerView.f23775j0 == com.huawei.openalliance.ad.constant.w.aK) {
                    Code = pPSBannerView.T;
                } else {
                    Code = pPSBannerView.f23780s.Code(pPSBannerView.y, pPSBannerView.f23776k0);
                }
                cVar.f24133a.setAdContainerSizeMatched(Code ? "1" : "0");
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class i implements AdFeedbackListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<PPSNativeView> f23879a;

        public i(PPSNativeView pPSNativeView) {
            this.f23879a = new WeakReference<>(pPSNativeView);
        }

        @Override // com.huawei.hms.ads.AdFeedbackListener
        public final void onAdDisliked() {
            PPSNativeView pPSNativeView = this.f23879a.get();
            if (pPSNativeView != null) {
                pPSNativeView.o();
            }
        }

        @Override // com.huawei.hms.ads.AdFeedbackListener
        public final void onAdFeedbackShowFailed() {
        }

        @Override // com.huawei.hms.ads.AdFeedbackListener
        public final void onAdLiked() {
        }
    }

    @Override // com.huawei.hms.ads.gk
    public View getOpenMeasureView() {
        return this;
    }

    /* loaded from: classes2.dex */
    public class e implements kn {
        public e() {
        }

        @Override // com.huawei.hms.ads.kn
        public final void Code(AppDownloadButton appDownloadButton) {
            PPSNativeView.this.B.Code((MaterialClickInfo) null, (Integer) null);
        }

        @Override // com.huawei.hms.ads.kn
        public final void I(AppDownloadButton appDownloadButton) {
            PPSNativeView pPSNativeView = PPSNativeView.this;
            if (pPSNativeView.f23852e != null) {
                pPSNativeView.f23852e.V();
                pPSNativeView.f23852e.I();
            }
        }

        @Override // com.huawei.hms.ads.kn
        public final void V(AppDownloadButton appDownloadButton) {
        }
    }

    public void setOnNativeAdStatusChangedListener(l lVar) {
    }

    public void Code(List<String> list) {
        ex.V("PPSNativeView", "onClose keyWords");
        this.B.Code(list);
        m();
    }

    public boolean Code() {
        if (this.f23860n || this.f23848a == null) {
            return false;
        }
        setWhyAdViewStatus(CusWhyThisAdView.a.SHOWN);
        d();
        this.f23848a.V();
        k();
        this.I = false;
        return true;
    }

    public boolean Code(js jsVar) {
        boolean z10;
        if (this.S == null) {
            throw new IllegalStateException("Register INativeAd first");
        }
        this.f23855i = jsVar;
        if (jsVar != null) {
            jsVar.setPpsNativeView(this);
            z10 = jsVar.Code(this.S);
            i();
        } else {
            z10 = false;
        }
        if (ex.Code()) {
            ex.Code("PPSNativeView", "register downloadbutton, succ:" + z10);
        }
        return z10;
    }
}
