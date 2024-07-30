package com.anythink.basead.d;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.anythink.basead.a.a;
import com.anythink.basead.a.c;
import com.anythink.basead.ui.BaseMediaAdView;
import com.anythink.basead.ui.MediaAdView;
import com.anythink.basead.ui.MraidMediaView;
import com.anythink.basead.ui.OwnNativeAdView;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.aa;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.z;
import com.anythink.expressad.advanced.view.ATOutNativeAdvancedViewGroup;
import com.anythink.expressad.out.o;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    Context f3931a;

    /* renamed from: b, reason: collision with root package name */
    com.anythink.basead.e.a f3932b;

    /* renamed from: c, reason: collision with root package name */
    com.anythink.core.common.k.a.c f3933c;

    /* renamed from: d, reason: collision with root package name */
    com.anythink.basead.a.c f3934d;

    /* renamed from: e, reason: collision with root package name */
    View f3935e;
    volatile boolean f;

    /* renamed from: g, reason: collision with root package name */
    aa f3936g;

    /* renamed from: h, reason: collision with root package name */
    j f3937h;

    /* renamed from: i, reason: collision with root package name */
    boolean f3938i;

    /* renamed from: j, reason: collision with root package name */
    String f3939j;

    /* renamed from: k, reason: collision with root package name */
    com.anythink.expressad.advanced.d.c f3940k;

    /* renamed from: l, reason: collision with root package name */
    BaseMediaAdView f3941l;

    /* renamed from: n, reason: collision with root package name */
    int f3943n;
    int o;

    /* renamed from: p, reason: collision with root package name */
    com.anythink.basead.a.a f3944p;

    /* renamed from: q, reason: collision with root package name */
    OwnNativeAdView f3945q;

    /* renamed from: r, reason: collision with root package name */
    private final String f3946r = getClass().getSimpleName();

    /* renamed from: m, reason: collision with root package name */
    View.OnClickListener f3942m = new View.OnClickListener() { // from class: com.anythink.basead.d.h.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            h.this.a(view, 1);
        }
    };

    /* loaded from: classes.dex */
    public static class a implements BaseMediaAdView.a {

        /* renamed from: a, reason: collision with root package name */
        private final BaseMediaAdView.a f3956a;

        public a(BaseMediaAdView.a aVar) {
            this.f3956a = aVar;
        }

        @Override // com.anythink.basead.ui.BaseMediaAdView.a
        public final void onClickCloseView() {
            BaseMediaAdView.a aVar = this.f3956a;
            if (aVar != null) {
                aVar.onClickCloseView();
            }
        }
    }

    public h(Context context, aa aaVar, j jVar, com.anythink.core.common.a.g gVar) {
        this.f3931a = context.getApplicationContext();
        this.f3936g = aaVar;
        this.f3937h = jVar;
        if (gVar instanceof com.anythink.expressad.advanced.d.c) {
            com.anythink.expressad.advanced.d.c cVar = (com.anythink.expressad.advanced.d.c) gVar;
            this.f3940k = cVar;
            cVar.a(new o() { // from class: com.anythink.basead.d.h.3
                @Override // com.anythink.expressad.out.o
                public final void a() {
                }

                @Override // com.anythink.expressad.out.o
                public final void b() {
                    com.anythink.basead.e.a aVar = h.this.f3932b;
                    if (aVar != null) {
                        aVar.onAdShow();
                    }
                }

                @Override // com.anythink.expressad.out.o
                public final void f() {
                    com.anythink.basead.e.a aVar = h.this.f3932b;
                    if (aVar != null) {
                        aVar.onAdClosed();
                    }
                }

                @Override // com.anythink.expressad.out.o
                public final void a(String str) {
                }

                @Override // com.anythink.expressad.out.o
                public final void a(com.anythink.expressad.foundation.d.c cVar2) {
                    Context g6 = n.a().g();
                    h hVar = h.this;
                    if (hVar.f3934d == null) {
                        hVar.f3934d = new com.anythink.basead.a.c(g6, hVar.f3937h, hVar.f3936g);
                        h.this.f3934d.a(new c.b() { // from class: com.anythink.basead.d.h.3.1
                            @Override // com.anythink.basead.a.c.b
                            public final void a() {
                                com.anythink.basead.e.a aVar = h.this.f3932b;
                                if (aVar != null) {
                                    aVar.onAdClick(1);
                                }
                            }

                            @Override // com.anythink.basead.a.c.b
                            public final void a(boolean z10) {
                                com.anythink.basead.e.a aVar = h.this.f3932b;
                                if (aVar != null) {
                                    aVar.onDeeplinkCallback(z10);
                                }
                            }

                            @Override // com.anythink.basead.a.c.b
                            public final void b() {
                            }
                        });
                    }
                    com.anythink.basead.d.a.b.a(h.this.f3934d.b(), cVar2);
                    com.anythink.expressad.advanced.d.c cVar3 = h.this.f3940k;
                    ATOutNativeAdvancedViewGroup c10 = cVar3 != null ? cVar3.c() : null;
                    com.anythink.basead.c.i iVar = new com.anythink.basead.c.i(h.this.f3937h.f5656d, "");
                    if (c10 != null) {
                        iVar.f = c10.getHeight();
                        iVar.f3787e = c10.getWidth();
                    }
                    iVar.f3788g = new com.anythink.basead.c.a();
                    h.this.f3934d.a(iVar);
                }

                @Override // com.anythink.expressad.out.o
                public final void c() {
                }

                @Override // com.anythink.expressad.out.o
                public final void d() {
                }

                @Override // com.anythink.expressad.out.o
                public final void e() {
                }
            });
        }
    }

    private static com.anythink.basead.c.a c(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        int a10 = a(width);
        int a11 = a(height);
        com.anythink.basead.c.a aVar = new com.anythink.basead.c.a();
        int i12 = i10 + a10;
        aVar.f3725a = i12;
        aVar.f3726b = i11 + a11;
        aVar.f3729e = a10;
        aVar.f = a11;
        aVar.f3727c = i12 + ((int) (Math.random() * 15.0d));
        int random = aVar.f3726b + ((int) (Math.random() * 15.0d));
        aVar.f3728d = random;
        aVar.f3730g = aVar.f3727c - i10;
        aVar.f3731h = random - i11;
        return aVar;
    }

    private void m() {
        com.anythink.basead.a.a aVar = this.f3944p;
        if (aVar != null) {
            aVar.a();
        }
    }

    private void n() {
        com.anythink.basead.a.a aVar = this.f3944p;
        if (aVar != null) {
            aVar.b();
            this.f3944p = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        View view;
        if (this.f) {
            return;
        }
        this.f = true;
        if (this.f3938i && this.f3936g.g()) {
            BaseMediaAdView baseMediaAdView = this.f3941l;
            if (baseMediaAdView instanceof MraidMediaView) {
                ((MraidMediaView) baseMediaAdView).fireAudioVolumeChange(this.f3938i);
            }
        }
        if (this.f3936g instanceof z) {
            com.anythink.basead.d.c.c a10 = com.anythink.basead.d.c.c.a();
            Context context = this.f3931a;
            j jVar = this.f3937h;
            a10.a(context, com.anythink.basead.d.c.c.a(jVar.f5654b, jVar.f5655c), this.f3936g, this.f3937h.f5664m);
        }
        com.anythink.expressad.advanced.d.c cVar = this.f3940k;
        if (cVar != null) {
            view = cVar.c();
        } else {
            view = this.f3945q;
        }
        if (this.f3936g.g()) {
            view = this.f3941l;
        }
        if (view != null) {
            com.anythink.basead.c.i iVar = new com.anythink.basead.c.i(this.f3937h.f5656d, "");
            iVar.f = view.getHeight();
            iVar.f3787e = view.getWidth();
            com.anythink.basead.a.b.a(8, this.f3936g, iVar);
            com.anythink.basead.e.a aVar = this.f3932b;
            if (aVar != null) {
                aVar.onAdShow();
            }
        }
        m();
    }

    private View p() {
        View monitorClickView;
        BaseMediaAdView baseMediaAdView = this.f3941l;
        if (baseMediaAdView != null && (monitorClickView = baseMediaAdView.getMonitorClickView()) != null) {
            return monitorClickView;
        }
        View[] viewArr = new View[1];
        a(this.f3945q, viewArr);
        View view = viewArr[0];
        if (view != null) {
            return view;
        }
        return this.f3945q;
    }

    private void q() {
        k kVar;
        j jVar = this.f3937h;
        if (jVar != null && (kVar = jVar.f5664m) != null && kVar.F() == 2) {
            final View p10 = p();
            this.f3944p = new com.anythink.basead.a.a(p10, this.f3937h, new a.InterfaceC0048a() { // from class: com.anythink.basead.d.h.6
                @Override // com.anythink.basead.a.a.InterfaceC0048a
                public final void a(int i10) {
                    h.this.a(p10, 2);
                }
            });
        }
    }

    public final String b() {
        aa aaVar = this.f3936g;
        return aaVar != null ? aaVar.r() : "";
    }

    public final String d() {
        aa aaVar = this.f3936g;
        return aaVar != null ? aaVar.w() : "";
    }

    public final String e() {
        aa aaVar = this.f3936g;
        if (aaVar != null) {
            return aaVar.t();
        }
        return "";
    }

    public final String f() {
        aa aaVar = this.f3936g;
        if (aaVar != null) {
            return aaVar.u();
        }
        return "";
    }

    public final String g() {
        aa aaVar = this.f3936g;
        if (aaVar != null) {
            return aaVar.v();
        }
        return "";
    }

    public final boolean h() {
        if (this.f3940k != null) {
            return true;
        }
        return false;
    }

    public final void i() {
        com.anythink.core.common.k.a.c cVar = this.f3933c;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void j() {
        i();
        n();
        this.f3935e = null;
        this.f3945q = null;
        this.f3932b = null;
        try {
            com.anythink.expressad.advanced.d.c cVar = this.f3940k;
            if (cVar != null) {
                cVar.e();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        com.anythink.basead.a.c cVar2 = this.f3934d;
        if (cVar2 != null) {
            cVar2.d();
            this.f3934d = null;
        }
        com.anythink.core.common.k.a.c cVar3 = this.f3933c;
        if (cVar3 != null) {
            cVar3.b();
            this.f3933c = null;
        }
        BaseMediaAdView baseMediaAdView = this.f3941l;
        if (baseMediaAdView != null) {
            baseMediaAdView.destroy();
        }
    }

    public final void k() {
        com.anythink.expressad.advanced.d.c cVar = this.f3940k;
        if (cVar != null) {
            cVar.d(3);
        }
    }

    public final void l() {
        com.anythink.expressad.advanced.d.c cVar = this.f3940k;
        if (cVar != null) {
            cVar.e(3);
        }
    }

    public final void a(View view, final int i10) {
        com.anythink.basead.c.a adClickRecord;
        if (this.f3945q != null) {
            n();
            o();
            if (this.f3934d == null) {
                this.f3934d = new com.anythink.basead.a.c(n.a().g(), this.f3937h, this.f3936g);
            }
            if (this.f3934d.a()) {
                return;
            }
            this.f3934d.a(new c.b() { // from class: com.anythink.basead.d.h.2
                @Override // com.anythink.basead.a.c.b
                public final void a() {
                    BaseMediaAdView baseMediaAdView = h.this.f3941l;
                    if (baseMediaAdView != null) {
                        baseMediaAdView.notifyClick();
                    }
                    com.anythink.basead.e.a aVar = h.this.f3932b;
                    if (aVar != null) {
                        aVar.onAdClick(i10);
                    }
                }

                @Override // com.anythink.basead.a.c.b
                public final void a(boolean z10) {
                    com.anythink.basead.e.a aVar = h.this.f3932b;
                    if (aVar != null) {
                        aVar.onDeeplinkCallback(z10);
                    }
                }

                @Override // com.anythink.basead.a.c.b
                public final void b() {
                }
            });
            com.anythink.basead.c.i iVar = new com.anythink.basead.c.i(this.f3937h.f5656d, "");
            iVar.f = this.f3945q.getHeight();
            iVar.f3787e = this.f3945q.getWidth();
            if (i10 != 2) {
                adClickRecord = this.f3945q.getAdClickRecord();
            } else if (view == null) {
                adClickRecord = null;
            } else {
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int i11 = iArr[0];
                int i12 = iArr[1];
                int width = view.getWidth();
                int height = view.getHeight();
                int a10 = a(width);
                int a11 = a(height);
                com.anythink.basead.c.a aVar = new com.anythink.basead.c.a();
                int i13 = i11 + a10;
                aVar.f3725a = i13;
                aVar.f3726b = i12 + a11;
                aVar.f3729e = a10;
                aVar.f = a11;
                aVar.f3727c = i13 + ((int) (Math.random() * 15.0d));
                int random = aVar.f3726b + ((int) (Math.random() * 15.0d));
                aVar.f3728d = random;
                aVar.f3730g = aVar.f3727c - i11;
                aVar.f3731h = random - i12;
                adClickRecord = aVar;
            }
            iVar.f3788g = adClickRecord;
            this.f3934d.a(iVar);
        }
    }

    private View b(Context context, boolean z10, boolean z11, BaseMediaAdView.a aVar) {
        a aVar2 = new a(aVar);
        OwnNativeAdView ownNativeAdView = new OwnNativeAdView(this.f3931a);
        if (z10) {
            this.f3945q = ownNativeAdView;
            MraidMediaView mraidMediaView = new MraidMediaView(context, this.f3936g, this.f3937h, z11, aVar2);
            this.f3941l = mraidMediaView;
            mraidMediaView.setMraidWebViewListener(new MraidMediaView.a() { // from class: com.anythink.basead.d.h.4
                @Override // com.anythink.basead.ui.MraidMediaView.a
                public final void a(String str) {
                    aa aaVar = h.this.f3936g;
                    if (aaVar != null) {
                        aaVar.v(str);
                    }
                    h hVar = h.this;
                    hVar.a(hVar.f3941l, 1);
                }

                @Override // com.anythink.basead.ui.MraidMediaView.a
                public final void a() {
                    h hVar = h.this;
                    OwnNativeAdView ownNativeAdView2 = hVar.f3945q;
                    if (ownNativeAdView2 != null) {
                        hVar.b(ownNativeAdView2);
                    }
                }
            });
        } else {
            this.f3941l = new MediaAdView(context, this.f3936g, this.f3937h, z11, aVar2);
        }
        this.f3941l.init(this.f3943n, this.o);
        ownNativeAdView.addView(this.f3941l, new FrameLayout.LayoutParams(this.f3941l.getMediaViewWidth(), this.f3941l.getMediaViewHeight()));
        if (z10) {
            q();
        } else {
            a(ownNativeAdView, this.f3941l.getClickViews());
        }
        return ownNativeAdView;
    }

    private boolean d(View view) {
        OwnNativeAdView[] ownNativeAdViewArr = new OwnNativeAdView[1];
        a(ownNativeAdViewArr, view);
        OwnNativeAdView ownNativeAdView = ownNativeAdViewArr[0];
        if (ownNativeAdView == null) {
            Log.i("anythink", "Register View don't contain OwnNativeAdView.");
            return false;
        }
        if (ownNativeAdView.getChildCount() == 0) {
            Log.i("anythink", "OwnNativeAdView View don't contain any child views.");
            return false;
        }
        this.f3945q = ownNativeAdViewArr[0];
        q();
        return true;
    }

    public final void b(View view) {
        this.f3935e = view;
        com.anythink.core.common.k.a.a aVar = new com.anythink.core.common.k.a.a() { // from class: com.anythink.basead.d.h.5
            @Override // com.anythink.core.common.k.a.a, com.anythink.core.common.k.a.b
            public final void recordImpression(View view2) {
                h.this.o();
            }
        };
        if (this.f3933c == null) {
            view.getContext();
            this.f3933c = new com.anythink.core.common.k.a.c(this.f3937h.f5664m.R() <= 0 ? 100 : this.f3937h.f5664m.R());
        }
        this.f3933c.a(view, aVar);
    }

    public final String c() {
        aa aaVar = this.f3936g;
        return aaVar != null ? aaVar.s() : "";
    }

    private static int a(int i10) {
        Random random = new Random();
        if (i10 <= 0) {
            return 0;
        }
        double d10 = i10;
        int i11 = (int) (0.1d * d10);
        return random.nextInt((((int) (d10 * 0.9d)) - i11) + 1) + i11;
    }

    public final void a(int i10, int i11) {
        this.f3943n = i10;
        this.o = i11;
        com.anythink.expressad.advanced.d.c cVar = this.f3940k;
        if (cVar != null) {
            cVar.a(i11, i10);
        }
    }

    public final com.anythink.core.common.e.i a() {
        return this.f3936g;
    }

    public final View a(Context context, boolean z10, boolean z11, BaseMediaAdView.a aVar) {
        aa aaVar = this.f3936g;
        if (aaVar != null && aaVar.g() && z10) {
            return b(context, true, z11, aVar);
        }
        com.anythink.expressad.advanced.d.c cVar = this.f3940k;
        if (cVar != null) {
            cVar.a(z11 ? 1 : 0);
            return this.f3940k.c();
        }
        aa aaVar2 = this.f3936g;
        if (aaVar2 != null && !TextUtils.isEmpty(aaVar2.u()) && z10 && (this.f3936g instanceof com.anythink.core.common.e.g)) {
            return b(context, false, z11, aVar);
        }
        return null;
    }

    public final void a(com.anythink.basead.e.a aVar) {
        this.f3932b = aVar;
    }

    public final void a(boolean z10) {
        this.f3938i = z10;
        com.anythink.expressad.advanced.d.c cVar = this.f3940k;
        if (cVar != null) {
            cVar.b(z10 ? 1 : 2);
        }
    }

    public final void a(String str) {
        this.f3939j = str;
        if (this.f3940k != null) {
            if (!TextUtils.isEmpty(str)) {
                String str2 = this.f3939j;
                str2.getClass();
                char c10 = 65535;
                switch (str2.hashCode()) {
                    case 49:
                        if (str2.equals("1")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 50:
                        if (str2.equals("2")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 51:
                        if (str2.equals("3")) {
                            c10 = 2;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        this.f3940k.c(3);
                        return;
                    case 1:
                        this.f3940k.c(1);
                        return;
                    case 2:
                        this.f3940k.c(2);
                        return;
                    default:
                        return;
                }
            }
            this.f3940k.c(3);
        }
    }

    public final void a(View view, List<View> list) {
        if (d(view)) {
            aa aaVar = this.f3936g;
            if (aaVar != null && !aaVar.g()) {
                b(view);
            }
            if (list != null) {
                for (View view2 : list) {
                    if (view2 != null) {
                        view2.setOnClickListener(this.f3942m);
                    }
                }
                return;
            }
            view.setOnClickListener(this.f3942m);
        }
    }

    public final void a(View view) {
        if (d(view)) {
            aa aaVar = this.f3936g;
            if (aaVar != null && !aaVar.g()) {
                b(view);
            }
            a(view, this.f3942m);
        }
    }

    private void a(OwnNativeAdView[] ownNativeAdViewArr, View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof OwnNativeAdView) {
                ownNativeAdViewArr[0] = (OwnNativeAdView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                a(ownNativeAdViewArr, viewGroup.getChildAt(i10));
            }
        }
    }

    private void a(View view, View.OnClickListener onClickListener) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                a(viewGroup.getChildAt(i10), onClickListener);
            }
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    private void a(View view, View[] viewArr) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                a(viewGroup.getChildAt(i10), viewArr);
            }
            return;
        }
        if (((view instanceof Button) || (view instanceof TextView)) && TextUtils.equals(((TextView) view).getText().toString(), this.f3936g.w())) {
            viewArr[0] = view;
        }
    }

    public final boolean a(boolean z10, boolean z11) {
        if (this.f3936g.n() != 67) {
            return false;
        }
        return this.f3936g.a(z10, z11);
    }
}
