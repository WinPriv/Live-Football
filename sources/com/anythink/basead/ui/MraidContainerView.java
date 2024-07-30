package com.anythink.basead.ui;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.anythink.basead.mraid.MraidWebView;
import com.anythink.basead.mraid.d;
import com.anythink.basead.ui.ClickToReLoadView;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.k.h;
import com.anythink.core.common.k.u;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;

/* loaded from: classes.dex */
public class MraidContainerView extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    private static final String f4304h = "MraidContainerView";

    /* renamed from: a, reason: collision with root package name */
    protected i f4305a;

    /* renamed from: b, reason: collision with root package name */
    protected k f4306b;

    /* renamed from: c, reason: collision with root package name */
    protected j f4307c;

    /* renamed from: d, reason: collision with root package name */
    protected b f4308d;

    /* renamed from: e, reason: collision with root package name */
    protected ClickToReLoadView f4309e;
    protected MraidWebView f;

    /* renamed from: g, reason: collision with root package name */
    protected a f4310g;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4311i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f4312j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4313k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4314l;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(String str);

        void b();
    }

    public MraidContainerView(Context context) {
        super(context);
    }

    private void e() {
        b bVar = this.f4308d;
        if (bVar != null) {
            bVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        b bVar = this.f4308d;
        if (bVar != null) {
            bVar.c();
        }
    }

    private void g() {
        if (this.f4306b.V()) {
            return;
        }
        loadMraidWebView();
    }

    public void fireAudioVolumeChange(boolean z10) {
        try {
            if (this.f4314l && this.f != null) {
                if (z10) {
                    CallMraidJS.getInstance().fireAudioVolumeChange(this.f, 0.0d);
                } else {
                    CallMraidJS.getInstance().fireAudioVolumeChange(this.f, 1.0d);
                }
            }
        } catch (Exception unused) {
        }
    }

    public void fireMraidIsViewable(boolean z10) {
        MraidWebView mraidWebView;
        try {
            if (this.f4314l && (mraidWebView = this.f) != null) {
                if (z10) {
                    com.anythink.expressad.mbbanner.a.a.a.a(mraidWebView, true);
                } else {
                    com.anythink.expressad.mbbanner.a.a.a.a(mraidWebView, false);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void init() {
        if (this.f4306b.V()) {
            b();
            return;
        }
        b bVar = new b(this);
        this.f4308d = bVar;
        bVar.a();
    }

    public void loadMraidWebView() {
        if (this.f4313k || this.f4314l) {
            return;
        }
        this.f4313k = true;
        ClickToReLoadView clickToReLoadView = this.f4309e;
        if (clickToReLoadView != null) {
            removeView(clickToReLoadView);
        }
        b bVar = this.f4308d;
        if (bVar != null) {
            bVar.b();
        }
        final String a10 = com.anythink.basead.mraid.d.a(this.f4307c, this.f4305a);
        if (TextUtils.isEmpty(a10)) {
            this.f4313k = false;
            c();
            f();
        } else {
            final String a11 = com.anythink.basead.a.b.c.a(this.f4307c, this.f4305a);
            n.a().a(new Runnable() { // from class: com.anythink.basead.ui.MraidContainerView.2
                @Override // java.lang.Runnable
                public final void run() {
                    MraidContainerView.this.f = new MraidWebView(n.a().g());
                    com.anythink.basead.mraid.d.a(a11, a10, MraidContainerView.this.f, new d.a() { // from class: com.anythink.basead.ui.MraidContainerView.2.1
                        @Override // com.anythink.basead.mraid.d.a
                        public final void a() {
                            String unused = MraidContainerView.f4304h;
                            MraidContainerView.a(MraidContainerView.this);
                            MraidContainerView.this.b();
                            MraidContainerView.this.f();
                        }

                        @Override // com.anythink.basead.mraid.d.a
                        public final void a(com.anythink.basead.c.e eVar) {
                            MraidContainerView.a(MraidContainerView.this);
                            String unused = MraidContainerView.f4304h;
                            eVar.c();
                            MraidContainerView.this.c();
                            MraidContainerView.this.f();
                        }
                    });
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4311i = true;
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4311i = false;
    }

    public void release() {
        MraidWebView mraidWebView;
        try {
            if (this.f4314l && (mraidWebView = this.f) != null) {
                u.a(mraidWebView);
                this.f.release();
                com.anythink.core.common.res.d.a(n.a().g()).a(this.f4307c, this.f4305a);
            }
            u.a(this);
        } catch (Throwable unused) {
        }
    }

    public void setNeedRegisterVolumeChangeReceiver(boolean z10) {
        this.f4312j = z10;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (this.f4311i) {
            g();
        }
    }

    public MraidContainerView(Context context, i iVar, j jVar, a aVar) {
        super(context);
        this.f4305a = iVar;
        this.f4306b = jVar.f5664m;
        this.f4307c = jVar;
        this.f4310g = aVar;
        setBackgroundColor(getResources().getColor(h.a(context, "color_99000000", com.anythink.expressad.foundation.h.i.f10126d)));
    }

    public static /* synthetic */ boolean a(MraidContainerView mraidContainerView) {
        mraidContainerView.f4313k = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        MraidWebView b10 = com.anythink.basead.a.b.c.b(com.anythink.basead.a.b.c.a(this.f4307c, this.f4305a));
        this.f = b10;
        if (b10 != null) {
            this.f4314l = true;
            if (this.f4312j) {
                b10.setNeedRegisterVolumeChangeReceiver(true);
            }
            this.f.prepare(getContext(), new com.anythink.basead.mraid.b() { // from class: com.anythink.basead.ui.MraidContainerView.1
                @Override // com.anythink.basead.mraid.b
                public final void a() {
                    a aVar = MraidContainerView.this.f4310g;
                    if (aVar != null) {
                        aVar.b();
                    }
                }

                @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
                public final void open(String str) {
                    a aVar = MraidContainerView.this.f4310g;
                    if (aVar != null) {
                        aVar.a(str);
                    }
                }

                @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
                public final void close() {
                }
            });
            addView(this.f, new FrameLayout.LayoutParams(-1, -1));
            a aVar = this.f4310g;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f4309e == null) {
            ClickToReLoadView clickToReLoadView = new ClickToReLoadView(getContext());
            this.f4309e = clickToReLoadView;
            clickToReLoadView.setListener(new ClickToReLoadView.a() { // from class: com.anythink.basead.ui.MraidContainerView.3
                @Override // com.anythink.basead.ui.ClickToReLoadView.a
                public final void a() {
                    MraidContainerView.this.loadMraidWebView();
                }
            });
        }
        addView(this.f4309e, new FrameLayout.LayoutParams(-1, -1));
    }

    private void d() {
        ClickToReLoadView clickToReLoadView = this.f4309e;
        if (clickToReLoadView != null) {
            removeView(clickToReLoadView);
        }
    }
}
