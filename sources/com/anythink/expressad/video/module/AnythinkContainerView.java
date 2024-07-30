package com.anythink.expressad.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.foundation.h.x;
import com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView;
import com.anythink.expressad.video.module.a.a;
import com.anythink.expressad.video.module.a.a.g;
import com.anythink.expressad.video.module.a.a.i;
import com.anythink.expressad.video.module.a.a.k;
import com.anythink.expressad.video.module.a.a.l;
import com.anythink.expressad.video.signal.e;
import com.anythink.expressad.video.signal.factory.b;
import com.anythink.expressad.video.signal.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AnythinkContainerView extends AnythinkBaseView implements e, h {
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private int H;
    private boolean I;
    private boolean J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private String P;
    private b Q;
    private AnyThinkOrderCampView R;
    private boolean S;
    private boolean T;
    private List<c> U;

    /* renamed from: n, reason: collision with root package name */
    private AnythinkPlayableView f11714n;
    private AnythinkClickCTAView o;

    /* renamed from: p, reason: collision with root package name */
    private AnythinkClickMiniCardView f11715p;

    /* renamed from: q, reason: collision with root package name */
    private AnythinkNativeEndCardView f11716q;

    /* renamed from: r, reason: collision with root package name */
    private AnythinkH5EndCardView f11717r;

    /* renamed from: s, reason: collision with root package name */
    private AnythinkVideoEndCoverView f11718s;

    /* renamed from: t, reason: collision with root package name */
    private AnythinkVastEndCardView f11719t;

    /* renamed from: u, reason: collision with root package name */
    private AnythinkLandingPageView f11720u;

    /* renamed from: v, reason: collision with root package name */
    private AnythinkAlertWebview f11721v;

    /* renamed from: w, reason: collision with root package name */
    private String f11722w;

    /* renamed from: x, reason: collision with root package name */
    private int f11723x;
    private int y;

    /* renamed from: z, reason: collision with root package name */
    private int f11724z;

    /* renamed from: com.anythink.expressad.video.module.AnythinkContainerView$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass4 extends i {
        public AnonymousClass4(a aVar) {
            super(aVar);
        }

        @Override // com.anythink.expressad.video.module.a.a.i, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
        public final void a(int i10, Object obj) {
            super.a(i10, obj);
            if (i10 == 100) {
                AnythinkContainerView.this.webviewshow();
                AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                anythinkContainerView.onConfigurationChanged(anythinkContainerView.getResources().getConfiguration());
            }
        }
    }

    public AnythinkContainerView(Context context) {
        super(context);
        this.y = 1;
        this.f11724z = 1;
        this.A = 1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = true;
        this.G = false;
        this.I = false;
        this.J = false;
        this.S = false;
        this.T = false;
        this.U = new ArrayList();
    }

    private void b() {
        setWrapContent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
        }
    }

    private void e() {
        c cVar = this.f11686b;
        if (cVar != null) {
            boolean j10 = cVar.j();
            boolean f = t.f(this.f11686b.I());
            if (j10 && !f) {
                i();
                return;
            }
        }
        if (this.y == 2 && !this.I) {
            h();
        } else {
            i();
        }
    }

    private void f() {
        if (this.f11719t == null) {
            a(this.Q, (Integer) 3);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        addView(this.f11719t, layoutParams);
        this.f11719t.notifyShowListener();
    }

    private void g() {
        if (this.f11720u == null) {
            a(this.Q, (Integer) 4);
        }
        this.f11720u.setUnitId(this.f11722w);
        this.f11720u.preLoadData(this.Q);
        addView(this.f11720u);
    }

    private void h() {
        if (this.f11717r == null) {
            a(this.Q, (Integer) 2);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f11717r;
        if (anythinkH5EndCardView != null && anythinkH5EndCardView.isLoadSuccess()) {
            this.I = true;
            addView(this.f11717r);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.f11717r.excuteTask();
            this.f11717r.setNotchValue(this.P, this.K, this.L, this.M, this.N);
        } else {
            i();
            AnythinkH5EndCardView anythinkH5EndCardView2 = this.f11717r;
            if (anythinkH5EndCardView2 != null) {
                anythinkH5EndCardView2.reportRenderResult("timeout", 3);
                this.f11717r.setError(true);
            }
        }
        AnythinkH5EndCardView anythinkH5EndCardView3 = this.f11717r;
        if (anythinkH5EndCardView3 != null) {
            anythinkH5EndCardView3.setUnitId(this.f11722w);
        }
    }

    private void i() {
        this.y = 1;
        if (this.f11716q == null) {
            a(this.Q, (Integer) 2);
        }
        addView(this.f11716q);
        onConfigurationChanged(getResources().getConfiguration());
        this.f11716q.notifyShowListener();
        this.T = true;
        bringToFront();
    }

    private void j() {
        AnythinkVideoEndCoverView anythinkVideoEndCoverView = this.f11718s;
        if (anythinkVideoEndCoverView == null) {
            b bVar = this.Q;
            this.Q = bVar;
            if (anythinkVideoEndCoverView == null) {
                AnythinkVideoEndCoverView anythinkVideoEndCoverView2 = new AnythinkVideoEndCoverView(this.f11685a);
                this.f11718s = anythinkVideoEndCoverView2;
                anythinkVideoEndCoverView2.setCampaign(this.f11686b);
                this.f11718s.setNotifyListener(new i(this.f11689e));
                this.f11718s.preLoadData(bVar);
            }
        }
        addView(this.f11718s);
        onConfigurationChanged(getResources().getConfiguration());
        this.T = true;
        bringToFront();
    }

    private void k() {
        if (this.f11714n == null) {
            preLoadData(this.Q);
        }
        addView(this.f11714n);
        AnythinkPlayableView anythinkPlayableView = this.f11714n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.setUnitId(this.f11722w);
            c cVar = this.f11686b;
            if (cVar != null && cVar.H() && this.f11686b.J() == 2) {
                this.f11714n.setCloseVisible(0);
            }
            this.f11714n.setNotchValue(this.P, this.K, this.L, this.M, this.N);
        }
    }

    private void l() {
        if (this.o == null) {
            b(-1);
        }
        if (this.o != null) {
            c cVar = this.f11686b;
            if (cVar != null && cVar.j()) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(12, -1);
            addView(this.o, 0, layoutParams);
        }
    }

    private void m() {
        if (this.f11715p == null) {
            b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.D && this.F) {
            this.F = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.f11715p, layoutParams);
    }

    private void n() {
        if (this.f11721v == null) {
            o();
        }
        AnythinkAlertWebview anythinkAlertWebview = this.f11721v;
        if (anythinkAlertWebview != null && anythinkAlertWebview.getParent() != null) {
            removeView(this.f11721v);
        }
        addView(this.f11721v);
    }

    private void o() {
        if (this.f11721v == null) {
            AnythinkAlertWebview anythinkAlertWebview = new AnythinkAlertWebview(this.f11685a);
            this.f11721v = anythinkAlertWebview;
            anythinkAlertWebview.setUnitId(this.f11722w);
            this.f11721v.setCampaign(this.f11686b);
        }
        this.f11721v.preLoadData(this.Q);
    }

    private void p() {
        this.C = false;
        this.T = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i10 = 0;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i10);
                if (!(childAt instanceof AnythinkContainerView)) {
                    viewGroup.bringChildToFront(childAt);
                } else {
                    i10++;
                }
            }
        }
    }

    private void q() {
        boolean z10;
        c cVar = this.f11686b;
        if (cVar == null) {
            return;
        }
        String I = cVar.I();
        boolean isEmpty = TextUtils.isEmpty(I);
        int i10 = com.anythink.expressad.video.dynview.a.a.f11399v;
        if (!isEmpty) {
            try {
                i10 = Integer.parseInt(x.a(I, "ecid"));
            } catch (Throwable th) {
                o.d(AnythinkBaseView.TAG, th.getMessage());
            }
        }
        int i11 = i10;
        Context context = this.f11685a;
        if (this.f11686b.f() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11716q = new AnythinkNativeEndCardView(context, null, true, i11, z10, this.f11695l, this.f11686b.as());
        if (this.f11686b.k() == 5) {
            a aVar = this.f11689e;
            if (aVar != null && (aVar instanceof k)) {
                ((k) aVar).a(this.f11686b);
            }
            this.f11716q.setCampaign(this.f11686b);
            return;
        }
        this.f11716q.setCampaign(this.f11686b);
    }

    public void addOrderViewData(List<c> list) {
        if (list == null) {
            return;
        }
        this.U = list;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (view != null) {
            a(view);
            super.addView(view);
        } else {
            o.d(AnythinkBaseView.TAG, "view is null");
        }
    }

    public boolean canBackPress() {
        if (this.f11716q != null) {
            return false;
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f11717r;
        if (anythinkH5EndCardView != null) {
            return anythinkH5EndCardView.canBackPress();
        }
        AnythinkLandingPageView anythinkLandingPageView = this.f11720u;
        if (anythinkLandingPageView != null) {
            return anythinkLandingPageView.canBackPress();
        }
        AnythinkPlayableView anythinkPlayableView = this.f11714n;
        if (anythinkPlayableView == null) {
            return false;
        }
        return anythinkPlayableView.canBackPress();
    }

    @Override // com.anythink.expressad.video.signal.e
    public void configurationChanged(int i10, int i11, int i12) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f11715p;
        if (anythinkClickMiniCardView != null && anythinkClickMiniCardView.getVisibility() == 0) {
            this.f11715p.resizeMiniCard(i10, i11);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean endCardShowing() {
        return this.B;
    }

    public boolean endcardIsPlayable() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f11717r;
        if (anythinkH5EndCardView != null && anythinkH5EndCardView.isPlayable()) {
            return true;
        }
        return false;
    }

    public AnythinkH5EndCardView getH5EndCardView() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f11717r;
        if (anythinkH5EndCardView == null) {
            return this.f11714n;
        }
        return anythinkH5EndCardView;
    }

    public c getReSetCampaign() {
        if (!this.f11686b.j() || !TextUtils.isEmpty(this.f11686b.I())) {
            return null;
        }
        int size = this.U.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (this.U.get(i11) != null && this.U.get(i11).aZ() == this.f11686b.aZ()) {
                    i10 = i11 - 1;
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        if (i10 < 0 || i10 >= size || this.U.get(i10) == null) {
            return null;
        }
        return this.U.get(i10);
    }

    public boolean getShowingTransparent() {
        return this.D;
    }

    public String getUnitID() {
        return this.f11722w;
    }

    public int getVideoInteractiveType() {
        return this.f11723x;
    }

    public int getVideoSkipTime() {
        return this.H;
    }

    @Override // com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h
    public void handlerPlayableException(String str) {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f11717r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.handlerPlayableException(str);
            if (!this.I) {
                return;
            }
        }
        e();
    }

    @Override // com.anythink.expressad.video.signal.e
    public void hideAlertWebview() {
        if (!isLast()) {
            if (this.S && !this.T) {
                p();
                this.S = false;
            }
            AnythinkAlertWebview anythinkAlertWebview = this.f11721v;
            if (anythinkAlertWebview != null && anythinkAlertWebview.getParent() != null) {
                removeView(this.f11721v);
                AnythinkClickCTAView anythinkClickCTAView = this.o;
                if (anythinkClickCTAView != null && anythinkClickCTAView.getParent() != null) {
                    setWrapContent();
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    if (layoutParams instanceof RelativeLayout.LayoutParams) {
                        ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
                    }
                }
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        setVisibility(0);
    }

    @Override // com.anythink.expressad.video.signal.h
    public void install(c cVar) {
        this.f11689e.a(105, cVar);
    }

    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null || viewGroup.indexOfChild(this) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void ivRewardAdsWithoutVideo(String str) {
        this.f11689e.a(103, str);
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean miniCardLoaded() {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f11715p;
        if (anythinkClickMiniCardView != null && anythinkClickMiniCardView.isLoadSuccess()) {
            return true;
        }
        return false;
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean miniCardShowing() {
        return this.C;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void notifyCloseBtn(int i10) {
        AnythinkPlayableView anythinkPlayableView = this.f11714n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.notifyCloseBtn(i10);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f11717r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.notifyCloseBtn(i10);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnythinkBaseView[] anythinkBaseViewArr = {this.f11714n, this.o, this.f11715p, this.f11716q, this.f11717r, this.f11719t, this.f11720u, this.f11718s};
        for (int i10 = 0; i10 < 8; i10++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i10];
            if (anythinkBaseView != null && (anythinkBaseView instanceof AnythinkClickMiniCardView)) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            } else if (anythinkBaseView != null && anythinkBaseView.getVisibility() == 0 && anythinkBaseView.getParent() != null && !isLast()) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    public void onEndcardBackPress() {
        if (this.f11716q == null && this.f11719t == null) {
            if (this.f11720u != null) {
                this.f11689e.a(103, "");
                return;
            }
            AnythinkH5EndCardView anythinkH5EndCardView = this.f11717r;
            if (anythinkH5EndCardView != null) {
                anythinkH5EndCardView.onBackPress();
                return;
            }
            return;
        }
        this.f11689e.a(104, "");
    }

    public void onMiniEndcardBackPress() {
        if (this.C) {
            this.f11689e.a(107, "");
        }
    }

    public void onPlayableBackPress() {
        AnythinkPlayableView anythinkPlayableView = this.f11714n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.onBackPress();
        }
    }

    @Override // com.anythink.expressad.video.signal.h
    public void orientation(Configuration configuration) {
        AnythinkH5EndCardView[] anythinkH5EndCardViewArr = {this.f11714n, this.f11715p, this.f11717r, this.f11721v};
        for (int i10 = 0; i10 < 4; i10++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i10];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0) {
                anythinkH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(final b bVar) {
        this.Q = bVar;
        c cVar = this.f11686b;
        if (cVar != null) {
            if (cVar.J() == 2) {
                if (this.f11714n == null) {
                    this.f11714n = new AnythinkPlayableView(this.f11685a);
                }
                this.f11714n.setCloseDelayShowTime(this.f11724z);
                this.f11714n.setPlayCloseBtnTm(this.A);
                this.f11714n.setCampaign(this.f11686b);
                this.f11714n.setNotifyListener(new AnonymousClass4(this.f11689e));
                this.f11714n.preLoadData(bVar);
            } else {
                b(this.f11723x);
                if (this.f11686b.j()) {
                    try {
                        a(bVar, Integer.valueOf(this.f11686b.F()));
                    } catch (Throwable th) {
                        o.d(AnythinkBaseView.TAG, th.getMessage());
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkContainerView.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                                anythinkContainerView.a(bVar, Integer.valueOf(anythinkContainerView.f11686b.F()));
                            }
                        });
                    }
                    t.f(this.f11686b.I());
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkContainerView.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                            anythinkContainerView.a(bVar, Integer.valueOf(anythinkContainerView.f11686b.F()));
                        }
                    }, getVideoSkipTime());
                }
            }
            o();
        }
    }

    @Override // com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h
    public void readyStatus(int i10) {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f11717r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.readyStatus(i10);
        }
    }

    public void release() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f11717r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.release();
            this.f11717r = null;
        }
        AnythinkPlayableView anythinkPlayableView = this.f11714n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.release();
        }
        AnythinkLandingPageView anythinkLandingPageView = this.f11720u;
        if (anythinkLandingPageView != null) {
            anythinkLandingPageView.release();
        }
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f11716q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.clearMoreOfferBitmap();
            this.f11716q.release();
        }
        if (this.f11689e != null) {
            this.f11689e = null;
        }
    }

    @Override // com.anythink.expressad.video.signal.e
    public void resizeMiniCard(int i10, int i11, int i12) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f11715p;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.resizeMiniCard(i10, i11);
            this.f11715p.setRadius(i12);
            removeAllViews();
            setMatchParent();
            this.T = true;
            bringToFront();
            m();
        }
    }

    public void setAnythinkClickMiniCardViewTransparent() {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f11715p;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.setAnythinkClickMiniCardViewTransparent();
            this.f11715p.setAnythinkClickMiniCardViewClickable(false);
        }
    }

    public void setCloseDelayTime(int i10) {
        this.f11724z = i10;
    }

    public void setEndscreenType(int i10) {
        this.y = i10;
    }

    public void setJSFactory(b bVar) {
        this.Q = bVar;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13, int i14) {
        o.d(AnythinkBaseView.TAG, "NOTCH ContainerView " + String.format("%1s-%2s-%3s-%4s-%5s", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i10)));
        this.O = i10;
        this.K = i11;
        this.L = i12;
        this.M = i13;
        this.N = i14;
        this.P = com.anythink.expressad.foundation.h.h.a(i10, i11, i12, i13, i14);
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f11716q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setNotchPadding(i11, i12, i13, i14);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f11717r;
        if (anythinkH5EndCardView != null && anythinkH5EndCardView.f11739s != null) {
            anythinkH5EndCardView.setNotchValue(this.P, i11, i12, i13, i14);
            j.a();
            j.a((WebView) this.f11717r.f11739s, "oncutoutfetched", Base64.encodeToString(this.P.getBytes(), 0));
        }
        AnythinkPlayableView anythinkPlayableView = this.f11714n;
        if (anythinkPlayableView != null && anythinkPlayableView.f11739s != null) {
            anythinkPlayableView.setNotchValue(this.P, i11, i12, i13, i14);
            j.a();
            j.a((WebView) this.f11714n.f11739s, "oncutoutfetched", Base64.encodeToString(this.P.getBytes(), 0));
        }
        AnyThinkOrderCampView anyThinkOrderCampView = this.R;
        if (anyThinkOrderCampView != null) {
            anyThinkOrderCampView.setNotchPadding(i11, i12, i13, i14);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void setNotifyListener(a aVar) {
        super.setNotifyListener(aVar);
        AnythinkBaseView[] anythinkBaseViewArr = {this.f11714n, this.o, this.f11715p, this.f11716q, this.f11717r, this.f11719t, this.f11720u, this.f11718s};
        for (int i10 = 0; i10 < 8; i10++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i10];
            if (anythinkBaseView != null) {
                if (anythinkBaseView instanceof AnythinkClickMiniCardView) {
                    anythinkBaseView.setNotifyListener(new g(this.f11715p, aVar));
                } else {
                    anythinkBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    public void setOnPause() {
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f11716q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setOnPause();
        }
    }

    public void setOnResume() {
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f11716q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setOnResume();
        }
    }

    public void setPlayCloseBtnTm(int i10) {
        this.A = i10;
    }

    public void setRewardStatus(boolean z10) {
        this.J = z10;
    }

    public void setShowingTransparent(boolean z10) {
        this.D = z10;
    }

    public void setUnitID(String str) {
        this.f11722w = str;
    }

    public void setVideoInteractiveType(int i10) {
        c cVar = this.f11686b;
        if (cVar != null && cVar.j()) {
            int a10 = com.anythink.expressad.video.dynview.i.c.a(this.f11686b);
            if (a10 == 100) {
                this.f11723x = i10;
                return;
            } else {
                this.f11723x = a10;
                return;
            }
        }
        this.f11723x = i10;
    }

    public void setVideoSkipTime(int i10) {
        this.H = i10;
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean showAlertWebView() {
        boolean z10;
        AnythinkAlertWebview anythinkAlertWebview = this.f11721v;
        if (anythinkAlertWebview == null || !anythinkAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup.indexOfChild(this) == viewGroup.getChildCount() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && !this.T) {
            removeAllViews();
            bringToFront();
            this.S = true;
        }
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f11715p;
        if (anythinkClickMiniCardView != null && anythinkClickMiniCardView.getParent() != null) {
            return false;
        }
        if (this.f11721v == null) {
            o();
        }
        AnythinkAlertWebview anythinkAlertWebview2 = this.f11721v;
        if (anythinkAlertWebview2 != null && anythinkAlertWebview2.getParent() != null) {
            removeView(this.f11721v);
        }
        addView(this.f11721v);
        setBackgroundColor(0);
        this.f11721v.webviewshow();
        return true;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showEndcard(int i10) {
        c cVar = this.f11686b;
        if (cVar != null) {
            if (i10 != 1) {
                if (i10 != 100) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                removeAllViews();
                                setMatchParent();
                                this.T = true;
                                bringToFront();
                                e();
                                this.f11689e.a(117, "");
                            } else {
                                this.f11689e.a(106, "");
                            }
                        } else {
                            this.f11689e.a(113, "");
                            removeAllViews();
                            setMatchParent();
                            if (this.f11720u == null) {
                                a(this.Q, (Integer) 4);
                            }
                            this.f11720u.setUnitId(this.f11722w);
                            this.f11720u.preLoadData(this.Q);
                            addView(this.f11720u);
                            this.T = true;
                            bringToFront();
                        }
                    } else {
                        removeAllViews();
                        setMatchParent();
                        if (this.f11719t == null) {
                            a(this.Q, (Integer) 3);
                        }
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        layoutParams.addRule(13, -1);
                        addView(this.f11719t, layoutParams);
                        this.f11719t.notifyShowListener();
                        this.T = true;
                        bringToFront();
                    }
                } else {
                    if (cVar.J() == 2) {
                        this.E = true;
                    }
                    a(this.f11714n);
                    setMatchParent();
                    i();
                    o.a(AnythinkBaseView.TAG, "showEndcard addNativeEndcard");
                }
            } else {
                this.f11689e.a(104, "");
            }
        }
        this.B = true;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showMiniCard(int i10, int i11, int i12, int i13, int i14) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f11715p;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.setMiniCardLocation(i10, i11, i12, i13);
            this.f11715p.setRadius(i14);
            this.f11715p.setCloseVisible(8);
            this.f11715p.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.T = true;
            bringToFront();
            m();
            if (!this.G) {
                this.G = true;
                this.f11689e.a(109, "");
                this.f11689e.a(117, "");
            }
        }
    }

    public void showOrderCampView() {
        AnyThinkOrderCampView anyThinkOrderCampView = new AnyThinkOrderCampView(this.f11685a);
        this.R = anyThinkOrderCampView;
        anyThinkOrderCampView.setCampaignExes(this.U);
        a aVar = this.f11689e;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.U);
        }
        this.R.setNotifyListener(new i(this.f11689e));
        this.R.setRewarded(this.J);
        this.R.setNotchPadding(this.K, this.L, this.M, this.N);
        this.R.setCampOrderViewBuildCallback(new com.anythink.expressad.video.dynview.f.b() { // from class: com.anythink.expressad.video.module.AnythinkContainerView.3
            @Override // com.anythink.expressad.video.dynview.f.b
            public final void a() {
                a aVar2 = AnythinkContainerView.this.f11689e;
                if (aVar2 != null) {
                    aVar2.a(117, "");
                }
            }

            @Override // com.anythink.expressad.video.dynview.f.b
            public final void b() {
                if (AnythinkContainerView.this.f11686b.f() == 2) {
                    AnythinkContainerView.this.showVideoEndCover();
                } else {
                    AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                    anythinkContainerView.showEndcard(anythinkContainerView.f11686b.F());
                }
            }
        });
        this.R.createView(this);
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showPlayableView() {
        if (this.f11686b != null && !this.E) {
            removeAllViews();
            setMatchParent();
            if (this.f11714n == null) {
                preLoadData(this.Q);
            }
            addView(this.f11714n);
            AnythinkPlayableView anythinkPlayableView = this.f11714n;
            if (anythinkPlayableView != null) {
                anythinkPlayableView.setUnitId(this.f11722w);
                c cVar = this.f11686b;
                if (cVar != null && cVar.H() && this.f11686b.J() == 2) {
                    this.f11714n.setCloseVisible(0);
                }
                this.f11714n.setNotchValue(this.P, this.K, this.L, this.M, this.N);
            }
            this.T = true;
            bringToFront();
        }
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showVideoClickView(int i10) {
        c cVar;
        if (this.f11686b != null) {
            if (i10 != -1) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        AnythinkClickCTAView anythinkClickCTAView = this.o;
                        if (anythinkClickCTAView != null && anythinkClickCTAView.getParent() != null) {
                            removeView(this.o);
                        }
                        AnythinkAlertWebview anythinkAlertWebview = this.f11721v;
                        if (anythinkAlertWebview != null && anythinkAlertWebview.getParent() != null) {
                            return;
                        }
                        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f11715p;
                        if (anythinkClickMiniCardView == null || anythinkClickMiniCardView.getParent() == null) {
                            try {
                                c cVar2 = this.f11686b;
                                if (cVar2 != null && cVar2.J() == 1) {
                                    setMatchParent();
                                    m();
                                }
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                        }
                        if (miniCardLoaded()) {
                            AnythinkH5EndCardView anythinkH5EndCardView = this.f11717r;
                            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getParent() != null) {
                                removeView(this.f11717r);
                            }
                            this.f11689e.a(112, "");
                            c cVar3 = this.f11686b;
                            if (cVar3 != null && !cVar3.aw()) {
                                this.f11686b.ax();
                                com.anythink.expressad.video.module.b.a.e(this.f11685a, this.f11686b);
                            }
                            if (this.D) {
                                this.f11689e.a(115, "");
                            } else {
                                this.T = true;
                                bringToFront();
                                webviewshow();
                                onConfigurationChanged(getResources().getConfiguration());
                            }
                            this.C = true;
                            return;
                        }
                        p();
                        return;
                    }
                    return;
                }
                if (this.B) {
                    return;
                }
                AnythinkH5EndCardView anythinkH5EndCardView2 = this.f11717r;
                if (anythinkH5EndCardView2 != null && anythinkH5EndCardView2.getParent() != null) {
                    removeView(this.f11717r);
                }
                AnythinkClickMiniCardView anythinkClickMiniCardView2 = this.f11715p;
                if (anythinkClickMiniCardView2 != null && anythinkClickMiniCardView2.getParent() != null) {
                    removeView(this.f11715p);
                }
                AnythinkClickCTAView anythinkClickCTAView2 = this.o;
                if (anythinkClickCTAView2 == null || anythinkClickCTAView2.getParent() == null) {
                    try {
                        c cVar4 = this.f11686b;
                        if (cVar4 != null && cVar4.J() == 1) {
                            this.T = true;
                            if (this.o == null) {
                                b(-1);
                            }
                            if (this.o != null && ((cVar = this.f11686b) == null || !cVar.j())) {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                                layoutParams.addRule(12, -1);
                                addView(this.o, 0, layoutParams);
                            }
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                if (isLast()) {
                    bringToFront();
                    return;
                }
                return;
            }
            if (!isLast() && !endCardShowing()) {
                p();
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showVideoEndCover() {
        removeAllViews();
        setMatchParent();
        AnythinkVideoEndCoverView anythinkVideoEndCoverView = this.f11718s;
        if (anythinkVideoEndCoverView == null) {
            b bVar = this.Q;
            this.Q = bVar;
            if (anythinkVideoEndCoverView == null) {
                AnythinkVideoEndCoverView anythinkVideoEndCoverView2 = new AnythinkVideoEndCoverView(this.f11685a);
                this.f11718s = anythinkVideoEndCoverView2;
                anythinkVideoEndCoverView2.setCampaign(this.f11686b);
                this.f11718s.setNotifyListener(new i(this.f11689e));
                this.f11718s.preLoadData(bVar);
            }
        }
        addView(this.f11718s);
        onConfigurationChanged(getResources().getConfiguration());
        this.T = true;
        bringToFront();
    }

    @Override // com.anythink.expressad.video.signal.h
    public void toggleCloseBtn(int i10) {
        AnythinkPlayableView anythinkPlayableView = this.f11714n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.toggleCloseBtn(i10);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f11717r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.toggleCloseBtn(i10);
        }
    }

    public void triggerCloseBtn(String str) {
        if (this.f11686b != null) {
            this.f11689e.a(122, "");
            this.f11689e.a(104, "");
        }
    }

    @Override // com.anythink.expressad.video.signal.h
    public void webviewshow() {
        AnythinkH5EndCardView[] anythinkH5EndCardViewArr = {this.f11714n, this.f11715p, this.f11717r, this.f11721v};
        for (int i10 = 0; i10 < 4; i10++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i10];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0 && anythinkH5EndCardView.getParent() != null && !isLast()) {
                anythinkH5EndCardView.webviewshow();
            }
        }
    }

    private boolean a() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup.indexOfChild(this) == viewGroup.getChildCount() - 1;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            a(view);
            super.addView(view, layoutParams);
        } else {
            o.d(AnythinkBaseView.TAG, "view is null");
        }
    }

    private static void a(View view) {
        if (view != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            } catch (Throwable th) {
                o.b(AnythinkBaseView.TAG, th.getMessage(), th);
            }
        }
    }

    private void b(b bVar) {
        this.Q = bVar;
        if (this.f11718s == null) {
            AnythinkVideoEndCoverView anythinkVideoEndCoverView = new AnythinkVideoEndCoverView(this.f11685a);
            this.f11718s = anythinkVideoEndCoverView;
            anythinkVideoEndCoverView.setCampaign(this.f11686b);
            this.f11718s.setNotifyListener(new i(this.f11689e));
            this.f11718s.preLoadData(bVar);
        }
    }

    private void a(b bVar) {
        if (this.f11714n == null) {
            this.f11714n = new AnythinkPlayableView(this.f11685a);
        }
        this.f11714n.setCloseDelayShowTime(this.f11724z);
        this.f11714n.setPlayCloseBtnTm(this.A);
        this.f11714n.setCampaign(this.f11686b);
        this.f11714n.setNotifyListener(new AnonymousClass4(this.f11689e));
        this.f11714n.preLoadData(bVar);
    }

    private void b(int i10) {
        if (i10 != -3) {
            if (i10 != -2) {
                if (this.o == null) {
                    this.o = new AnythinkClickCTAView(this.f11685a);
                }
                this.o.setCampaign(this.f11686b);
                this.o.setUnitId(this.f11722w);
                this.o.setNotifyListener(new i(this.f11689e));
                this.o.preLoadData(this.Q);
                return;
            }
            c cVar = this.f11686b;
            if (cVar == null || cVar.F() != 2) {
                return;
            }
            if (this.f11715p == null) {
                this.f11715p = new AnythinkClickMiniCardView(this.f11685a);
            }
            this.f11715p.setCampaign(this.f11686b);
            AnythinkClickMiniCardView anythinkClickMiniCardView = this.f11715p;
            anythinkClickMiniCardView.setNotifyListener(new g(anythinkClickMiniCardView, this.f11689e));
            this.f11715p.preLoadData(this.Q);
            setMatchParent();
            m();
            p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar, Integer num) {
        a aVar;
        this.Q = bVar;
        c cVar = this.f11686b;
        if (cVar != null) {
            if (num == null) {
                num = Integer.valueOf(cVar.F());
            }
            if (!isLast()) {
                p();
            }
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue == 3) {
                    if (this.f11719t == null) {
                        this.f11719t = new AnythinkVastEndCardView(this.f11685a);
                    }
                    this.f11719t.setCampaign(this.f11686b);
                    this.f11719t.setNotifyListener(new l(this.f11689e));
                    this.f11719t.preLoadData(bVar);
                    return;
                }
                if (intValue == 4) {
                    if (this.f11720u == null) {
                        this.f11720u = new AnythinkLandingPageView(this.f11685a);
                    }
                    this.f11720u.setCampaign(this.f11686b);
                    this.f11720u.setNotifyListener(new i(this.f11689e));
                    return;
                }
                if (intValue != 5) {
                    if (this.y == 2) {
                        boolean j10 = this.f11686b.j();
                        boolean f = t.f(this.f11686b.I());
                        c cVar2 = this.f11686b;
                        if ((cVar2 == null || !j10 || f) && cVar2.f() != 2) {
                            if (this.f11717r == null) {
                                this.f11717r = new AnythinkH5EndCardView(this.f11685a);
                            }
                            if (this.f11686b.k() == 5 && (aVar = this.f11689e) != null && (aVar instanceof k)) {
                                ((k) aVar).a(this.f11686b);
                            }
                            this.f11717r.setCampaign(this.f11686b);
                            this.f11717r.setCloseDelayShowTime(this.f11724z);
                            this.f11717r.setNotifyListener(new i(this.f11689e));
                            this.f11717r.setUnitId(this.f11722w);
                            this.f11717r.setNotchValue(this.P, this.K, this.L, this.M, this.N);
                            this.f11717r.preLoadData(bVar);
                            o.a(AnythinkBaseView.TAG, "preload H5Endcard");
                            if (this.D) {
                                return;
                            }
                            o.a(AnythinkBaseView.TAG, "showTransparent = " + this.D + " addview");
                            addView(this.f11717r);
                            return;
                        }
                        return;
                    }
                    c cVar3 = this.f11686b;
                    int c10 = (cVar3 == null || cVar3.M() == null) ? 0 : this.f11686b.M().c();
                    AnythinkNativeEndCardView anythinkNativeEndCardView = this.f11716q;
                    if (anythinkNativeEndCardView == null && anythinkNativeEndCardView == null) {
                        if (this.f11686b.j()) {
                            q();
                        } else {
                            AnythinkNativeEndCardView anythinkNativeEndCardView2 = new AnythinkNativeEndCardView(this.f11685a, null, false, -1, this.f11686b.f() == 2, c10, this.f11686b.as());
                            this.f11716q = anythinkNativeEndCardView2;
                            anythinkNativeEndCardView2.setCampaign(this.f11686b);
                        }
                    }
                    this.f11716q.setLayout();
                    this.f11716q.setCampaign(this.f11686b);
                    this.f11716q.setUnitId(this.f11722w);
                    this.f11716q.setCloseBtnDelay(this.f11724z);
                    this.f11716q.setNotifyListener(new i(this.f11689e));
                    this.f11716q.preLoadData(bVar);
                    this.f11716q.setNotchPadding(this.K, this.L, this.M, this.N);
                }
            }
        }
    }

    public AnythinkContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = 1;
        this.f11724z = 1;
        this.A = 1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = true;
        this.G = false;
        this.I = false;
        this.J = false;
        this.S = false;
        this.T = false;
        this.U = new ArrayList();
    }

    private void b(AnythinkH5EndCardView... anythinkH5EndCardViewArr) {
        for (int i10 = 0; i10 < 4; i10++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i10];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0) {
                anythinkH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    private void a(a aVar, AnythinkBaseView... anythinkBaseViewArr) {
        for (int i10 = 0; i10 < 8; i10++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i10];
            if (anythinkBaseView != null) {
                if (anythinkBaseView instanceof AnythinkClickMiniCardView) {
                    anythinkBaseView.setNotifyListener(new g(this.f11715p, aVar));
                } else {
                    anythinkBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    private void a(Configuration configuration, AnythinkBaseView... anythinkBaseViewArr) {
        for (int i10 = 0; i10 < 8; i10++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i10];
            if (anythinkBaseView != null && (anythinkBaseView instanceof AnythinkClickMiniCardView)) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            } else if (anythinkBaseView != null && anythinkBaseView.getVisibility() == 0 && anythinkBaseView.getParent() != null && !isLast()) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    private void a(AnythinkH5EndCardView... anythinkH5EndCardViewArr) {
        for (int i10 = 0; i10 < 4; i10++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i10];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0 && anythinkH5EndCardView.getParent() != null && !isLast()) {
                anythinkH5EndCardView.webviewshow();
            }
        }
    }
}
