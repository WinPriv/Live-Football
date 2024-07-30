package com.anythink.expressad.video.module;

import a3.k;
import a3.l;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.core.common.b.n;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.anythink.expressad.atsignalcommon.mraid.MraidVolumeChangeReceiver;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.foundation.h.w;
import com.anythink.expressad.foundation.webview.BrowserView;
import com.anythink.expressad.video.signal.h;
import com.anythink.expressad.videocommon.b.i;
import com.anythink.expressad.widget.FeedBackButton;
import com.huawei.hms.ads.ep;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AnythinkH5EndCardView extends AnythinkBaseView implements IMraidJSBridge, com.anythink.expressad.video.signal.f, h {
    private static final String A = "anythink_reward_endcard_h5";
    private static final String B = "portrait";
    private static final String C = "landscape";
    private static final int D = 1;
    private static final int E = 2;
    private static final int F = 20;
    private static final int G = 15;
    private static final int Q = 100;

    /* renamed from: n, reason: collision with root package name */
    protected static final String f11731n = "orientation";
    protected static final String o = "webviewshow";
    private FeedBackButton H;
    private boolean I;
    private boolean J;
    private int K;
    private int L;
    private boolean M;
    private boolean N;
    private int O;
    private long P;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;

    /* renamed from: aa, reason: collision with root package name */
    private boolean f11732aa;

    /* renamed from: ab, reason: collision with root package name */
    private boolean f11733ab;

    /* renamed from: ac, reason: collision with root package name */
    private String f11734ac;

    /* renamed from: ad, reason: collision with root package name */
    private com.anythink.expressad.video.signal.factory.b f11735ad;
    private boolean ae;
    private boolean af;

    /* renamed from: p, reason: collision with root package name */
    protected View f11736p;

    /* renamed from: q, reason: collision with root package name */
    protected RelativeLayout f11737q;

    /* renamed from: r, reason: collision with root package name */
    protected ImageView f11738r;

    /* renamed from: s, reason: collision with root package name */
    protected WindVaneWebView f11739s;

    /* renamed from: t, reason: collision with root package name */
    protected Handler f11740t;

    /* renamed from: u, reason: collision with root package name */
    protected String f11741u;

    /* renamed from: v, reason: collision with root package name */
    protected boolean f11742v;

    /* renamed from: w, reason: collision with root package name */
    protected boolean f11743w;

    /* renamed from: x, reason: collision with root package name */
    protected String f11744x;
    Handler y;

    /* renamed from: z, reason: collision with root package name */
    boolean f11745z;

    /* renamed from: com.anythink.expressad.video.module.AnythinkH5EndCardView$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements Runnable {
        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView.this.H.setVisibility(0);
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkH5EndCardView$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements com.anythink.expressad.foundation.f.a {
        public AnonymousClass6() {
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void a() {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                if (n.a().g() != null) {
                    jSONObject.put("status", 1);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                o.b(AnythinkBaseView.TAG, th.getMessage(), th);
                str = "";
            }
            String encodeToString = Base64.encodeToString(str.getBytes(), 2);
            j.a();
            j.a((WebView) AnythinkH5EndCardView.this.f11739s, AbsFeedBackForH5.f7027a, encodeToString);
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void b() {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                if (n.a().g() != null) {
                    jSONObject.put("status", 2);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                o.b(AnythinkBaseView.TAG, th.getMessage(), th);
                str = "";
            }
            String encodeToString = Base64.encodeToString(str.getBytes(), 2);
            j.a();
            j.a((WebView) AnythinkH5EndCardView.this.f11739s, AbsFeedBackForH5.f7027a, encodeToString);
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void c() {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                if (n.a().g() != null) {
                    jSONObject.put("status", 2);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                o.b(AnythinkBaseView.TAG, th.getMessage(), th);
                str = "";
            }
            String encodeToString = Base64.encodeToString(str.getBytes(), 2);
            j.a();
            j.a((WebView) AnythinkH5EndCardView.this.f11739s, AbsFeedBackForH5.f7027a, encodeToString);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private AnythinkH5EndCardView f11753b;

        public a(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f11753b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Handler handler;
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            AnythinkH5EndCardView anythinkH5EndCardView = this.f11753b;
            if (anythinkH5EndCardView != null && (handler = anythinkH5EndCardView.y) != null) {
                handler.sendEmptyMessage(100);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private AnythinkH5EndCardView f11755b;

        public b(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f11755b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f11755b;
            if (anythinkH5EndCardView != null && !anythinkH5EndCardView.N) {
                AnythinkH5EndCardView.d(this.f11755b);
                this.f11755b.f11742v = false;
                AnythinkH5EndCardView.this.reportRenderResult("timeout", 5);
                this.f11755b.f11689e.a(com.anythink.expressad.video.module.a.a.R, "");
                o.a(AnythinkBaseView.TAG, "notify TYPE_NOTIFY_SHOW_NATIVE_ENDCARD");
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private AnythinkH5EndCardView f11756a;

        /* renamed from: b, reason: collision with root package name */
        private int f11757b;

        public c(AnythinkH5EndCardView anythinkH5EndCardView, int i10) {
            this.f11756a = anythinkH5EndCardView;
            this.f11757b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f11756a;
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.f11686b != null) {
                try {
                    if (anythinkH5EndCardView.M) {
                        o.b(AnythinkBaseView.TAG, "insertEndCardReadyState hasInsertLoadEndCardReport true return");
                        return;
                    }
                    AnythinkH5EndCardView.n(this.f11756a);
                    if (w.b(this.f11756a.f11686b.I())) {
                        this.f11756a.f11686b.I().contains(".zip");
                    }
                } catch (Throwable th) {
                    o.b(AnythinkBaseView.TAG, th.getMessage(), th);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private AnythinkH5EndCardView f11759b;

        public d(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f11759b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f11759b;
            if (anythinkH5EndCardView != null) {
                AnythinkH5EndCardView.e(anythinkH5EndCardView);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private AnythinkH5EndCardView f11761b;

        public e(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f11761b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f11761b;
            if (anythinkH5EndCardView != null) {
                AnythinkH5EndCardView.f(anythinkH5EndCardView);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private AnythinkH5EndCardView f11763b;

        public f(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f11763b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f11763b;
            if (anythinkH5EndCardView != null) {
                if (!anythinkH5EndCardView.f11732aa) {
                    AnythinkH5EndCardView.this.setCloseVisible(0);
                }
                AnythinkH5EndCardView.l(this.f11763b);
            }
        }
    }

    public AnythinkH5EndCardView(Context context) {
        super(context);
        this.I = false;
        this.f11740t = new Handler();
        this.f11742v = false;
        this.f11743w = false;
        this.J = false;
        this.K = 1;
        this.L = 1;
        this.M = false;
        this.N = false;
        this.O = 1;
        this.P = 0L;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.f11732aa = false;
        this.f11733ab = false;
        this.f11734ac = "";
        this.y = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what == 100) {
                    if (AnythinkH5EndCardView.this.R) {
                        AnythinkH5EndCardView.this.f11689e.a(122, "");
                    }
                    AnythinkH5EndCardView.this.f11689e.a(103, "");
                }
            }
        };
        this.ae = false;
        this.af = false;
        this.f11745z = false;
    }

    public static /* synthetic */ boolean d(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.N = true;
        return true;
    }

    public static /* synthetic */ boolean e(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.V = true;
        return true;
    }

    public static /* synthetic */ boolean f(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.W = true;
        return true;
    }

    private void g() {
        if (this.ae || this.T) {
            return;
        }
        this.ae = true;
        int i10 = this.K;
        if (i10 == 0) {
            this.V = true;
            return;
        }
        this.V = false;
        if (i10 >= 0) {
            this.f11740t.postDelayed(new d(this), this.K * 1000);
        }
    }

    private void i() {
        try {
            if (com.anythink.expressad.foundation.f.b.a().b()) {
                com.anythink.expressad.foundation.f.b.a().c(this.f11744x + "_1");
                FeedBackButton b10 = com.anythink.expressad.foundation.f.b.a().b(this.f11744x + "_2");
                this.H = b10;
                if (b10 != null) {
                    ViewGroup viewGroup = (ViewGroup) b10.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(this.H);
                    }
                    this.f11737q.addView(this.H);
                    this.f11737q.postDelayed(new AnonymousClass5(), 200L);
                }
                this.f11686b.l(this.f11744x);
                com.anythink.expressad.foundation.f.b.a().a(this.f11744x + "_2", this.f11686b);
                com.anythink.expressad.foundation.f.b.a().a(this.f11744x + "_2", new AnonymousClass6());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void k() {
    }

    public static /* synthetic */ boolean l(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.S = true;
        return true;
    }

    public static /* synthetic */ boolean n(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.M = true;
        return true;
    }

    public boolean canBackPress() {
        ImageView imageView = this.f11738r;
        if (imageView != null && imageView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void close() {
        o.d("EndCard_MRAID", "close");
        try {
            onCloseViewClick();
        } catch (Exception e10) {
            o.d(AnythinkBaseView.TAG, e10.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    public void excuteEndCardShowTask(int i10) {
        this.f11740t.postDelayed(new c(this, i10), i10 * 1000);
    }

    public void excuteTask() {
        if (!this.J && this.K >= 0) {
            this.f11740t.postDelayed(new f(this), this.K * 1000);
        }
    }

    public void executeEndCardShow(int i10) {
        this.f11740t.postDelayed(new b(this), i10 * 1000);
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public com.anythink.expressad.foundation.d.c getMraidCampaign() {
        return this.f11686b;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void handlerPlayableException(String str) {
        o.d("========", "===========handlerPlayableException");
        if (!this.f11743w) {
            this.f11743w = true;
            this.f11742v = false;
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        int findLayout = findLayout(A);
        if (findLayout >= 0) {
            View inflate = this.f11687c.inflate(findLayout, (ViewGroup) null);
            this.f11736p = inflate;
            try {
                this.f11738r = (ImageView) inflate.findViewById(findID("anythink_windwv_close"));
                this.f11737q = (RelativeLayout) inflate.findViewById(findID("anythink_windwv_content_rl"));
                this.f11739s = new WindVaneWebView(getContext());
                this.f11739s.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.f11737q.addView(this.f11739s);
                this.f = isNotNULL(this.f11738r, this.f11739s);
            } catch (Exception unused) {
                this.f = false;
            }
            addView(this.f11736p, b());
            c();
            e();
        }
    }

    public boolean isLoadSuccess() {
        return this.f11742v;
    }

    public boolean isPlayable() {
        return this.J;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void notifyCloseBtn(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                this.U = true;
                return;
            }
            return;
        }
        this.T = true;
    }

    public void onBackPress() {
        boolean z10;
        if (this.S || (((z10 = this.T) && this.U) || ((!z10 && this.V && !this.f11745z) || (!z10 && this.W && this.f11745z)))) {
            onCloseViewClick();
        }
    }

    public void onCloseViewClick() {
        try {
            if (this.f11739s != null) {
                j.a();
                j.a((WebView) this.f11739s, "onSystemDestory", "");
                new Thread(new a(this)).start();
            } else {
                this.f11689e.a(103, "");
                this.f11689e.a(119, "webview is null when closing webview");
            }
        } catch (Exception e10) {
            this.f11689e.a(103, "");
            this.f11689e.a(119, "close webview exception" + e10.getMessage());
            o.a(AnythinkBaseView.TAG, e10.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        orientation(configuration);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 == 0 && !this.f11733ab) {
            this.f11733ab = true;
            setFocusableInTouchMode(true);
            requestFocus();
            requestFocusFromTouch();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        com.anythink.expressad.foundation.d.c cVar = this.f11686b;
        if (cVar != null && cVar.H()) {
            if (z10) {
                CallMraidJS.getInstance().fireSetIsViewable(this.f11739s, ep.Code);
            } else {
                CallMraidJS.getInstance().fireSetIsViewable(this.f11739s, ep.V);
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void open(String str) {
        l.B(str, "open : ", "EndCard_MRAID");
        try {
            String ad2 = this.f11686b.ad();
            if (!TextUtils.isEmpty(str)) {
                this.f11686b.p(str);
            }
            new com.anythink.expressad.a.a(getContext(), this.f11744x);
            this.f11686b.p(ad2);
            this.f11689e.a(126, "");
        } catch (Exception e10) {
            try {
                o.d(AnythinkBaseView.TAG, e10.getMessage());
            } catch (Exception e11) {
                o.d(AnythinkBaseView.TAG, e11.getMessage());
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.h
    public void orientation(Configuration configuration) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", C);
            } else {
                jSONObject.put("orientation", B);
            }
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            j.a();
            j.a((WebView) this.f11739s, "orientation", encodeToString);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void preLoadData(com.anythink.expressad.video.signal.factory.b bVar) {
        int o6;
        this.f11735ad = bVar;
        String a10 = a();
        if (this.f && this.f11686b != null && !TextUtils.isEmpty(a10)) {
            this.P = System.currentTimeMillis();
            BrowserView.DownloadListener downloadListener = new BrowserView.DownloadListener(this.f11686b);
            downloadListener.setTitle(this.f11686b.bb());
            this.f11739s.setDownloadListener(downloadListener);
            this.f11739s.setCampaignId(this.f11686b.aZ());
            setCloseVisible(8);
            this.f11739s.setApiManagerJSFactory(bVar);
            if (this.f11686b.H()) {
                this.f11739s.setMraidObject(this);
            }
            this.f11739s.setWebViewListener(new com.anythink.expressad.atsignalcommon.a.b() { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.3
                @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                public final void loadingResourceStatus(WebView webView, int i10) {
                    super.loadingResourceStatus(webView, i10);
                    AnythinkH5EndCardView.this.O = i10;
                    if (!AnythinkH5EndCardView.this.N) {
                        AnythinkH5EndCardView.d(AnythinkH5EndCardView.this);
                        if (i10 == 1) {
                            AnythinkH5EndCardView.this.reportRenderResult("success", 4);
                        } else {
                            AnythinkH5EndCardView.this.f11689e.a(com.anythink.expressad.video.module.a.a.R, "");
                            AnythinkH5EndCardView.this.reportRenderResult("failed", 6);
                        }
                    }
                }

                @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                public final void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    l.B(str, "===========finish+", "========");
                    if (!AnythinkH5EndCardView.this.f11743w) {
                        o.d("========", "===========finish  loadSuccess：" + AnythinkH5EndCardView.this.f11742v);
                        AnythinkH5EndCardView.this.f11742v = true;
                        l.C(str, "onPageFinished,url:", AnythinkBaseView.TAG);
                        AnythinkH5EndCardView.this.f11689e.a(100, "");
                        AnythinkH5EndCardView.this.f11689e.a(120, "");
                    }
                }

                @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                public final void onReceivedError(WebView webView, int i10, String str, String str2) {
                    super.onReceivedError(webView, i10, str, str2);
                    o.d("========", "===========onReceivedError");
                    if (!AnythinkH5EndCardView.this.f11743w) {
                        l.C(str2, "onReceivedError,url:", AnythinkBaseView.TAG);
                        AnythinkH5EndCardView.this.f11689e.a(118, "onReceivedError " + i10 + str);
                        AnythinkH5EndCardView.this.reportRenderResult(str, 3);
                        AnythinkH5EndCardView.this.f11689e.a(com.anythink.expressad.video.module.a.a.R, "");
                        AnythinkH5EndCardView.this.f11689e.a(com.anythink.expressad.video.module.a.a.T, "");
                        AnythinkH5EndCardView.this.f11743w = true;
                    }
                }

                @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                public final void readyState(WebView webView, int i10) {
                    super.readyState(webView, i10);
                    StringBuilder n10 = k.n("h5EncardView readyStatus:", i10, "- isError");
                    n10.append(AnythinkH5EndCardView.this.f11743w);
                    o.b("WindVaneWebView", n10.toString());
                    AnythinkH5EndCardView.this.O = i10;
                    if (!AnythinkH5EndCardView.this.f11743w) {
                        AnythinkH5EndCardView.a(AnythinkH5EndCardView.this, System.currentTimeMillis() - AnythinkH5EndCardView.this.P);
                    }
                }
            });
            if (TextUtils.isEmpty(this.f11686b.G())) {
                try {
                    this.P = System.currentTimeMillis();
                    String I = this.f11686b.I();
                    com.anythink.expressad.videocommon.e.d a11 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.f11744x);
                    if (this.J && w.b(I) && (I.contains("wfr=1") || (a11 != null && a11.o() > 0))) {
                        o.d(AnythinkBaseView.TAG, "需要上报endcard加载时间");
                        if (I.contains("wfr=1")) {
                            String[] split = I.split(ContainerUtils.FIELD_DELIMITER);
                            if (split != null && split.length > 0) {
                                for (String str : split) {
                                    if (w.b(str) && str.contains("to") && str.split(ContainerUtils.KEY_VALUE_DELIMITER) != null && str.split(ContainerUtils.KEY_VALUE_DELIMITER).length > 0) {
                                        o6 = t.a((Object) str.split(ContainerUtils.KEY_VALUE_DELIMITER)[1]);
                                        o.b(AnythinkBaseView.TAG, "从url获取的waitingtime:".concat(String.valueOf(o6)));
                                        break;
                                    }
                                }
                            }
                            o6 = 20;
                        } else {
                            if (a11 != null && a11.o() > 0) {
                                o6 = a11.o();
                            }
                            o6 = 20;
                        }
                        if (o6 >= 0) {
                            excuteEndCardShowTask(o6);
                            o.b(AnythinkBaseView.TAG, "开启excuteEndCardShowTask:".concat(String.valueOf(o6)));
                        } else {
                            excuteEndCardShowTask(20);
                            o.b(AnythinkBaseView.TAG, "开启excuteEndCardShowTask: 20s def");
                        }
                    }
                } catch (Throwable th) {
                    o.b(AnythinkBaseView.TAG, th.getMessage(), th);
                }
            }
            setHtmlSource(com.anythink.expressad.videocommon.b.j.a().b(a10));
            if (TextUtils.isEmpty(this.f11741u)) {
                l.C(a10, "load url:", AnythinkBaseView.TAG);
                this.f11739s.loadUrl(a10);
            } else {
                o.a(AnythinkBaseView.TAG, "load html...");
                this.f11739s.loadDataWithBaseURL(a10, this.f11741u, "text/html", "UTF-8", null);
            }
        } else {
            reportRenderResult("PL URL IS NULL", 3);
            this.f11689e.a(com.anythink.expressad.video.module.a.a.R, "");
            this.f11689e.a(com.anythink.expressad.video.module.a.a.T, "");
        }
        this.f11745z = false;
    }

    public void release() {
        Handler handler = this.f11740t;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f11740t = null;
        }
        Handler handler2 = this.y;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.y = null;
        }
        this.f11737q.removeAllViews();
        this.f11739s.release();
        this.f11739s = null;
    }

    public void setCloseDelayShowTime(int i10) {
        this.K = i10;
    }

    public void setCloseVisible(int i10) {
        if (this.f) {
            this.f11738r.setVisibility(i10);
        }
    }

    public void setCloseVisibleForMraid(int i10) {
        if (this.f) {
            this.f11732aa = true;
            if (i10 == 4) {
                this.f11738r.setImageDrawable(new ColorDrawable(16711680));
            } else {
                this.f11738r.setImageResource(findDrawable("anythink_reward_close"));
            }
            this.f11738r.setVisibility(0);
        }
    }

    public void setError(boolean z10) {
        this.f11743w = z10;
    }

    public void setHtmlSource(String str) {
        this.f11741u = str;
    }

    public void setLoadPlayable(boolean z10) {
        this.f11745z = z10;
    }

    public void setNotchValue(String str, int i10, int i11, int i12, int i13) {
        com.anythink.expressad.foundation.d.c cVar = this.f11686b;
        if (cVar != null && cVar.f() != 2) {
            this.f11734ac = str;
            o.d(AnythinkBaseView.TAG, "NOTCH H5ENDCARD " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f11738r.getLayoutParams();
            int b10 = t.b(getContext(), 20.0f);
            int i14 = i12 + b10;
            layoutParams.setMargins(i10 + b10, i14, i11 + b10, i13 + b10);
            o.d(AnythinkBaseView.TAG, "NOTCH H5ENDCARD " + i14);
            this.f11738r.setLayoutParams(layoutParams);
        }
    }

    public void setPlayCloseBtnTm(int i10) {
        this.L = i10;
    }

    public void setUnitId(String str) {
        this.f11744x = str;
    }

    public void startCounterEndCardShowTimer() {
        try {
            String I = this.f11686b.I();
            if (w.b(I) && I.contains("wfl=1")) {
                String[] split = I.split(ContainerUtils.FIELD_DELIMITER);
                int i10 = 15;
                if (split != null && split.length > 0) {
                    for (String str : split) {
                        if (w.b(str) && str.contains("timeout") && str.split(ContainerUtils.KEY_VALUE_DELIMITER) != null && str.split(ContainerUtils.KEY_VALUE_DELIMITER).length > 0) {
                            i10 = t.a((Object) str.split(ContainerUtils.KEY_VALUE_DELIMITER)[1]);
                            o.b(AnythinkBaseView.TAG, "从url获取的wfl timeout :".concat(String.valueOf(i10)));
                        }
                    }
                }
                executeEndCardShow(i10);
            }
        } catch (Throwable th) {
            o.a(AnythinkBaseView.TAG, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.h
    public void toggleCloseBtn(int i10) {
        int visibility = this.f11738r.getVisibility();
        if (i10 != 1) {
            if (i10 == 2) {
                this.S = false;
                if (this.f11745z) {
                    if (!this.af && !this.T) {
                        this.af = true;
                        int i11 = this.L;
                        if (i11 == 0) {
                            this.W = true;
                        } else {
                            this.W = false;
                            if (i11 >= 0) {
                                this.f11740t.postDelayed(new e(this), this.L * 1000);
                            }
                        }
                    }
                } else if (!this.ae && !this.T) {
                    this.ae = true;
                    int i12 = this.K;
                    if (i12 == 0) {
                        this.V = true;
                    } else {
                        this.V = false;
                        if (i12 >= 0) {
                            this.f11740t.postDelayed(new d(this), this.K * 1000);
                        }
                    }
                }
                visibility = 8;
            }
        } else {
            this.S = true;
            visibility = 0;
        }
        setCloseVisible(visibility);
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void unload() {
        o.d("EndCard_MRAID", "unload");
        close();
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void useCustomClose(boolean z10) {
        int i10;
        o.d("EndCard_MRAID", "useCustomClose : ".concat(String.valueOf(z10)));
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        try {
            setCloseVisibleForMraid(i10);
        } catch (Exception e10) {
            o.d(AnythinkBaseView.TAG, e10.getMessage());
        }
    }

    public void volumeChange(double d10) {
        CallMraidJS.getInstance().fireAudioVolumeChange(this.f11739s, d10);
    }

    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f11739s;
        if (windVaneWebView != null) {
            windVaneWebView.post(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.4
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    try {
                        o.a(AnythinkBaseView.TAG, AnythinkH5EndCardView.o);
                        try {
                            int[] iArr = new int[2];
                            AnythinkH5EndCardView.this.f11739s.getLocationOnScreen(iArr);
                            o.d(AnythinkBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                            JSONObject jSONObject = new JSONObject();
                            Context g6 = n.a().g();
                            if (g6 != null) {
                                jSONObject.put("startX", t.a(g6, iArr[0]));
                                jSONObject.put("startY", t.a(g6, iArr[1]));
                                jSONObject.put(com.anythink.expressad.foundation.g.a.ch, t.c(g6));
                            }
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            o.b(AnythinkBaseView.TAG, th.getMessage(), th);
                            str = "";
                        }
                        String encodeToString = Base64.encodeToString(str.toString().getBytes(), 2);
                        j.a();
                        j.a((WebView) AnythinkH5EndCardView.this.f11739s, AnythinkH5EndCardView.o, encodeToString);
                        AnythinkH5EndCardView.this.f11689e.a(109, "");
                        AnythinkH5EndCardView.g(AnythinkH5EndCardView.this);
                        AnythinkH5EndCardView.this.startCounterEndCardShowTimer();
                        j.a();
                        AnythinkH5EndCardView anythinkH5EndCardView = AnythinkH5EndCardView.this;
                        j.a((WebView) anythinkH5EndCardView.f11739s, "oncutoutfetched", Base64.encodeToString(anythinkH5EndCardView.f11734ac.getBytes(), 0));
                        AnythinkH5EndCardView.i(AnythinkH5EndCardView.this);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            });
        }
    }

    private void f() {
        int o6;
        try {
            this.P = System.currentTimeMillis();
            String I = this.f11686b.I();
            com.anythink.expressad.videocommon.e.d a10 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.f11744x);
            if (this.J && w.b(I)) {
                if (I.contains("wfr=1") || (a10 != null && a10.o() > 0)) {
                    o.d(AnythinkBaseView.TAG, "需要上报endcard加载时间");
                    if (I.contains("wfr=1")) {
                        String[] split = I.split(ContainerUtils.FIELD_DELIMITER);
                        if (split != null && split.length > 0) {
                            for (String str : split) {
                                if (w.b(str) && str.contains("to") && str.split(ContainerUtils.KEY_VALUE_DELIMITER) != null && str.split(ContainerUtils.KEY_VALUE_DELIMITER).length > 0) {
                                    o6 = t.a((Object) str.split(ContainerUtils.KEY_VALUE_DELIMITER)[1]);
                                    o.b(AnythinkBaseView.TAG, "从url获取的waitingtime:".concat(String.valueOf(o6)));
                                    break;
                                }
                            }
                        }
                        o6 = 20;
                    } else {
                        if (a10 != null && a10.o() > 0) {
                            o6 = a10.o();
                        }
                        o6 = 20;
                    }
                    if (o6 >= 0) {
                        excuteEndCardShowTask(o6);
                        o.b(AnythinkBaseView.TAG, "开启excuteEndCardShowTask:".concat(String.valueOf(o6)));
                    } else {
                        excuteEndCardShowTask(20);
                        o.b(AnythinkBaseView.TAG, "开启excuteEndCardShowTask: 20s def");
                    }
                }
            }
        } catch (Throwable th) {
            o.b(AnythinkBaseView.TAG, th.getMessage(), th);
        }
    }

    private void h() {
        if (this.af || this.T) {
            return;
        }
        this.af = true;
        int i10 = this.L;
        if (i10 == 0) {
            this.W = true;
            return;
        }
        this.W = false;
        if (i10 >= 0) {
            this.f11740t.postDelayed(new e(this), this.L * 1000);
        }
    }

    private void j() {
        com.anythink.expressad.foundation.d.c cVar = this.f11686b;
        if (cVar == null || !cVar.H()) {
            return;
        }
        int i10 = getResources().getConfiguration().orientation;
        String str = "undefined";
        if (i10 != 0) {
            if (i10 == 1) {
                str = B;
            } else if (i10 == 2) {
                str = C;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", ep.Code);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(CallMraidJS.f7000a, "Interstitial");
        hashMap.put("state", CallMraidJS.f);
        hashMap.put(CallMraidJS.f7002c, ep.Code);
        hashMap.put(CallMraidJS.f7003d, jSONObject);
        if (getContext() instanceof Activity) {
            float e11 = com.anythink.expressad.foundation.h.k.e(getContext());
            float f10 = com.anythink.expressad.foundation.h.k.f(getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f11 = displayMetrics.widthPixels;
            float f12 = displayMetrics.heightPixels;
            CallMraidJS.getInstance().fireSetScreenSize(this.f11739s, e11, f10);
            CallMraidJS.getInstance().fireSetMaxSize(this.f11739s, f11, f12);
        }
        CallMraidJS.getInstance().fireSetDefaultPosition(this.f11739s, r7.getLeft(), this.f11739s.getTop(), this.f11739s.getWidth(), this.f11739s.getHeight());
        CallMraidJS.getInstance().fireSetCurrentPosition(this.f11739s, r13.getLeft(), this.f11739s.getTop(), this.f11739s.getWidth(), this.f11739s.getHeight());
        CallMraidJS.getInstance().fireChangeEventForPropertys(this.f11739s, hashMap);
        CallMraidJS.getInstance().fireAudioVolumeChange(this.f11739s, MraidVolumeChangeReceiver.f7015a);
        CallMraidJS.getInstance().fireReadyEvent(this.f11739s);
    }

    public RelativeLayout.LayoutParams b() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        super.c();
        if (this.f) {
            this.f11738r.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnythinkH5EndCardView.this.onCloseViewClick();
                }
            });
        }
    }

    public void e() {
        if (this.f) {
            setMatchParent();
        }
    }

    public String a() {
        com.anythink.expressad.foundation.d.c cVar = this.f11686b;
        if (cVar != null) {
            this.R = true;
            if (cVar.H()) {
                this.J = false;
                String G2 = this.f11686b.G();
                if (!TextUtils.isEmpty(G2)) {
                    File file = new File(G2);
                    try {
                        if (file.exists() && file.isFile() && file.canRead()) {
                            o.b(AnythinkBaseView.TAG, "Mraid file ".concat(String.valueOf(G2)));
                            G2 = "file:////".concat(String.valueOf(G2));
                        } else {
                            o.b(AnythinkBaseView.TAG, "Mraid file not found. Will use endcard url.");
                            G2 = this.f11686b.P();
                        }
                        return G2;
                    } catch (Throwable th) {
                        if (!com.anythink.expressad.a.f6552a) {
                            return G2;
                        }
                        th.printStackTrace();
                        return G2;
                    }
                }
                String P = this.f11686b.P();
                l.B(P, "getURL playable=false endscreenurl兜底:", AnythinkBaseView.TAG);
                return P;
            }
            String I = this.f11686b.I();
            if (!w.a(I)) {
                this.J = true;
                String c10 = i.a().c(I);
                if (TextUtils.isEmpty(c10)) {
                    try {
                        String path = Uri.parse(I).getPath();
                        if (!TextUtils.isEmpty(path) && path.toLowerCase().endsWith(".zip")) {
                            String P2 = this.f11686b.P();
                            if (TextUtils.isEmpty(P2)) {
                                return null;
                            }
                            this.J = false;
                            excuteTask();
                            return P2;
                        }
                    } catch (Throwable th2) {
                        o.d(AnythinkBaseView.TAG, th2.getMessage());
                    }
                    o.b(AnythinkBaseView.TAG, "getURL playable=true endcard本地资源地址为空拿服务端地址:".concat(String.valueOf(I)));
                    return I + "&native_adtype=" + this.f11686b.w();
                }
                o.b(AnythinkBaseView.TAG, "getURL playable=true 资源不为空endcard地址:".concat(String.valueOf(c10)));
                return c10 + "&native_adtype=" + this.f11686b.w();
            }
            this.J = false;
            String P3 = this.f11686b.P();
            l.B(P3, "getURL playable=false endscreenurl兜底:", AnythinkBaseView.TAG);
            return P3;
        }
        this.R = false;
        o.d(AnythinkBaseView.TAG, "getURL playable=false url为空");
        return null;
    }

    public static /* synthetic */ void g(AnythinkH5EndCardView anythinkH5EndCardView) {
        com.anythink.expressad.foundation.d.c cVar = anythinkH5EndCardView.f11686b;
        if (cVar == null || !cVar.H()) {
            return;
        }
        int i10 = anythinkH5EndCardView.getResources().getConfiguration().orientation;
        String str = "undefined";
        if (i10 != 0) {
            if (i10 == 1) {
                str = B;
            } else if (i10 == 2) {
                str = C;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", ep.Code);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(CallMraidJS.f7000a, "Interstitial");
        hashMap.put("state", CallMraidJS.f);
        hashMap.put(CallMraidJS.f7002c, ep.Code);
        hashMap.put(CallMraidJS.f7003d, jSONObject);
        if (anythinkH5EndCardView.getContext() instanceof Activity) {
            float e11 = com.anythink.expressad.foundation.h.k.e(anythinkH5EndCardView.getContext());
            float f10 = com.anythink.expressad.foundation.h.k.f(anythinkH5EndCardView.getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) anythinkH5EndCardView.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f11 = displayMetrics.widthPixels;
            float f12 = displayMetrics.heightPixels;
            CallMraidJS.getInstance().fireSetScreenSize(anythinkH5EndCardView.f11739s, e11, f10);
            CallMraidJS.getInstance().fireSetMaxSize(anythinkH5EndCardView.f11739s, f11, f12);
        }
        CallMraidJS.getInstance().fireSetDefaultPosition(anythinkH5EndCardView.f11739s, r7.getLeft(), anythinkH5EndCardView.f11739s.getTop(), anythinkH5EndCardView.f11739s.getWidth(), anythinkH5EndCardView.f11739s.getHeight());
        CallMraidJS.getInstance().fireSetCurrentPosition(anythinkH5EndCardView.f11739s, r13.getLeft(), anythinkH5EndCardView.f11739s.getTop(), anythinkH5EndCardView.f11739s.getWidth(), anythinkH5EndCardView.f11739s.getHeight());
        CallMraidJS.getInstance().fireChangeEventForPropertys(anythinkH5EndCardView.f11739s, hashMap);
        CallMraidJS.getInstance().fireAudioVolumeChange(anythinkH5EndCardView.f11739s, MraidVolumeChangeReceiver.f7015a);
        CallMraidJS.getInstance().fireReadyEvent(anythinkH5EndCardView.f11739s);
    }

    public static /* synthetic */ void i(AnythinkH5EndCardView anythinkH5EndCardView) {
        try {
            if (com.anythink.expressad.foundation.f.b.a().b()) {
                com.anythink.expressad.foundation.f.b.a().c(anythinkH5EndCardView.f11744x + "_1");
                FeedBackButton b10 = com.anythink.expressad.foundation.f.b.a().b(anythinkH5EndCardView.f11744x + "_2");
                anythinkH5EndCardView.H = b10;
                if (b10 != null) {
                    ViewGroup viewGroup = (ViewGroup) b10.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(anythinkH5EndCardView.H);
                    }
                    anythinkH5EndCardView.f11737q.addView(anythinkH5EndCardView.H);
                    anythinkH5EndCardView.f11737q.postDelayed(new AnonymousClass5(), 200L);
                }
                anythinkH5EndCardView.f11686b.l(anythinkH5EndCardView.f11744x);
                com.anythink.expressad.foundation.f.b.a().a(anythinkH5EndCardView.f11744x + "_2", anythinkH5EndCardView.f11686b);
                com.anythink.expressad.foundation.f.b.a().a(anythinkH5EndCardView.f11744x + "_2", new AnonymousClass6());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public AnythinkH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I = false;
        this.f11740t = new Handler();
        this.f11742v = false;
        this.f11743w = false;
        this.J = false;
        this.K = 1;
        this.L = 1;
        this.M = false;
        this.N = false;
        this.O = 1;
        this.P = 0L;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.f11732aa = false;
        this.f11733ab = false;
        this.f11734ac = "";
        this.y = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what == 100) {
                    if (AnythinkH5EndCardView.this.R) {
                        AnythinkH5EndCardView.this.f11689e.a(122, "");
                    }
                    AnythinkH5EndCardView.this.f11689e.a(103, "");
                }
            }
        };
        this.ae = false;
        this.af = false;
        this.f11745z = false;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void install(com.anythink.expressad.foundation.d.c cVar) {
    }

    @Override // com.anythink.expressad.video.signal.h
    public void readyStatus(int i10) {
    }

    private boolean a(View view) {
        this.f11738r = (ImageView) view.findViewById(findID("anythink_windwv_close"));
        this.f11737q = (RelativeLayout) view.findViewById(findID("anythink_windwv_content_rl"));
        this.f11739s = new WindVaneWebView(getContext());
        this.f11739s.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f11737q.addView(this.f11739s);
        return isNotNULL(this.f11738r, this.f11739s);
    }

    private void a(long j10, boolean z10) {
        int i10;
        try {
            if (this.M) {
                o.b(AnythinkBaseView.TAG, "insertEndCardReadyState hasInsertLoadEndCardReport true return");
                return;
            }
            this.M = true;
            String str = "2";
            if (w.b(this.f11686b.I()) && this.f11686b.I().contains(".zip")) {
                str = "1";
            }
            String str2 = "ready yes";
            if (z10) {
                str2 = "ready timeout";
                i10 = 12;
            } else if (this.O == 2) {
                str2 = "ready no";
                i10 = 11;
            } else {
                i10 = 10;
            }
            o.b(AnythinkBaseView.TAG, "insertEndCardReadyState result:" + i10 + " endCardLoadTime:" + j10 + " endcardurl:" + this.f11686b.I() + "  id:" + this.f11686b.aZ() + "  unitid:" + this.f11744x + "  reason:" + str2 + "  type:" + str);
        } catch (Throwable th) {
            o.b(AnythinkBaseView.TAG, th.getMessage(), th);
        }
    }

    private void a(String str) {
        try {
            String ad2 = this.f11686b.ad();
            if (!TextUtils.isEmpty(str)) {
                this.f11686b.p(str);
            }
            new com.anythink.expressad.a.a(getContext(), this.f11744x);
            this.f11686b.p(ad2);
            this.f11689e.a(126, "");
        } catch (Exception e10) {
            o.d(AnythinkBaseView.TAG, e10.getMessage());
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void expand(String str, boolean z10) {
    }

    public void reportRenderResult(String str, int i10) {
    }

    public static /* synthetic */ void a(AnythinkH5EndCardView anythinkH5EndCardView, long j10) {
        int i10;
        try {
            if (anythinkH5EndCardView.M) {
                o.b(AnythinkBaseView.TAG, "insertEndCardReadyState hasInsertLoadEndCardReport true return");
                return;
            }
            anythinkH5EndCardView.M = true;
            String str = "2";
            if (w.b(anythinkH5EndCardView.f11686b.I()) && anythinkH5EndCardView.f11686b.I().contains(".zip")) {
                str = "1";
            }
            String str2 = "ready yes";
            if (anythinkH5EndCardView.O == 2) {
                str2 = "ready no";
                i10 = 11;
            } else {
                i10 = 10;
            }
            o.b(AnythinkBaseView.TAG, "insertEndCardReadyState result:" + i10 + " endCardLoadTime:" + j10 + " endcardurl:" + anythinkH5EndCardView.f11686b.I() + "  id:" + anythinkH5EndCardView.f11686b.aZ() + "  unitid:" + anythinkH5EndCardView.f11744x + "  reason:" + str2 + "  type:" + str);
        } catch (Throwable th) {
            o.b(AnythinkBaseView.TAG, th.getMessage(), th);
        }
    }
}
