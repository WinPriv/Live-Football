package com.anythink.basead.ui;

import a3.l;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.n0;
import com.anythink.basead.a.b.g;
import com.anythink.core.common.k.h;
import com.anythink.expressad.exoplayer.ad;
import com.anythink.expressad.exoplayer.h.s;
import com.anythink.expressad.exoplayer.i;
import com.anythink.expressad.exoplayer.w;
import com.huawei.hms.ads.gl;
import java.io.File;

/* loaded from: classes.dex */
public class PlayerView extends RelativeLayout {
    public static final String TAG = "PlayerView";
    private Handler A;
    private boolean B;
    private Thread C;
    private int D;
    private int E;
    private boolean F;
    private boolean G;
    private View H;
    private w.c I;
    private com.anythink.expressad.exoplayer.l.g J;

    /* renamed from: a */
    int f4374a;

    /* renamed from: b */
    int f4375b;

    /* renamed from: c */
    int f4376c;

    /* renamed from: d */
    boolean f4377d;

    /* renamed from: e */
    String f4378e;
    private ad f;

    /* renamed from: g */
    private s f4379g;

    /* renamed from: h */
    private TextureView f4380h;

    /* renamed from: i */
    private String f4381i;

    /* renamed from: j */
    private String f4382j;

    /* renamed from: k */
    private int f4383k;

    /* renamed from: l */
    private int f4384l;

    /* renamed from: m */
    private int f4385m;

    /* renamed from: n */
    private int f4386n;
    private int o;

    /* renamed from: p */
    private int f4387p;

    /* renamed from: q */
    private int f4388q;

    /* renamed from: r */
    private boolean f4389r;

    /* renamed from: s */
    private boolean f4390s;

    /* renamed from: t */
    private boolean f4391t;

    /* renamed from: u */
    private boolean f4392u;

    /* renamed from: v */
    private boolean f4393v;

    /* renamed from: w */
    private boolean f4394w;

    /* renamed from: x */
    private boolean f4395x;
    private boolean y;

    /* renamed from: z */
    private a f4396z;

    /* renamed from: com.anythink.basead.ui.PlayerView$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends Handler {
        public AnonymousClass1(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            PlayerView.this.f4385m = message.what;
            if (PlayerView.this.f4385m <= 0) {
                return;
            }
            if (!PlayerView.this.f4393v && !PlayerView.this.f4394w) {
                PlayerView.d(PlayerView.this);
                if (PlayerView.this.f4396z != null) {
                    PlayerView.this.f4396z.a();
                }
            }
            if (PlayerView.this.f4396z != null) {
                PlayerView.this.f4396z.a(PlayerView.this.f4385m);
            }
            if (!PlayerView.this.f4389r && PlayerView.this.f4385m >= PlayerView.this.o) {
                PlayerView.h(PlayerView.this);
                if (PlayerView.this.f4396z != null) {
                    PlayerView.this.f4396z.b(25);
                }
            } else if (!PlayerView.this.f4390s && PlayerView.this.f4385m >= PlayerView.this.f4387p) {
                PlayerView.k(PlayerView.this);
                if (PlayerView.this.f4396z != null) {
                    PlayerView.this.f4396z.b(50);
                }
            } else if (!PlayerView.this.f4391t && PlayerView.this.f4385m >= PlayerView.this.f4388q) {
                PlayerView.n(PlayerView.this);
                if (PlayerView.this.f4396z != null) {
                    PlayerView.this.f4396z.b(75);
                }
            }
            if (PlayerView.this.G) {
                int i10 = PlayerView.this.f4385m;
                PlayerView playerView = PlayerView.this;
                if (i10 >= playerView.f4374a && playerView.f4396z != null) {
                    PlayerView.this.G = false;
                    PlayerView.this.f4396z.g();
                }
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.PlayerView$2 */
    /* loaded from: classes.dex */
    public class AnonymousClass2 extends w.a {
        public AnonymousClass2() {
        }

        @Override // com.anythink.expressad.exoplayer.w.a, com.anythink.expressad.exoplayer.w.c
        public final void onPlayerError(com.anythink.expressad.exoplayer.g gVar) {
            boolean z10;
            long j10;
            String str;
            super.onPlayerError(gVar);
            String str2 = "Play error and ExoPlayer have not message.";
            if (gVar != null) {
                int i10 = gVar.f8021d;
                z10 = true;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            str2 = "Play error, because have a UnexpectedException.";
                        }
                    } else {
                        str2 = "Play error, because have a RendererException.";
                    }
                    z10 = false;
                } else {
                    str2 = "Play error, because have a SourceException.";
                }
                if (gVar.getCause() != null && !TextUtils.isEmpty(gVar.getCause().getMessage())) {
                    StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str2, ",eception:");
                    l10.append(gVar.getCause().getMessage());
                    str2 = l10.toString();
                }
            } else {
                z10 = false;
            }
            PlayerView playerView = PlayerView.this;
            if (!playerView.f4377d || !z10) {
                playerView.e();
                if (PlayerView.this.f4396z != null) {
                    try {
                        j10 = PlayerView.this.f.t();
                    } catch (Throwable unused) {
                        j10 = 0;
                    }
                    if (j10 <= 0) {
                        str = com.anythink.basead.c.f.o;
                    } else {
                        str = com.anythink.basead.c.f.f3754k;
                    }
                    StringBuilder sb2 = new StringBuilder("videoUrl:");
                    sb2.append(PlayerView.this.f4382j);
                    sb2.append(",readyRate:");
                    sb2.append(PlayerView.this.f4376c);
                    sb2.append(",cdRate:");
                    sb2.append(PlayerView.this.f4375b);
                    sb2.append(",play process:");
                    sb2.append(j10);
                    String p10 = l.p(sb2, ",errorMessage:", str2);
                    if (PlayerView.this.f4395x) {
                        PlayerView.this.f4396z.a(com.anythink.basead.c.f.a(str, com.anythink.basead.c.f.C.concat(String.valueOf(p10))));
                        return;
                    } else {
                        PlayerView.this.f4396z.a(com.anythink.basead.c.f.a(str, com.anythink.basead.c.f.K.concat(String.valueOf(p10))));
                        return;
                    }
                }
                return;
            }
            String str3 = PlayerView.TAG;
            playerView.f4377d = false;
            PlayerView.p(playerView);
        }

        @Override // com.anythink.expressad.exoplayer.w.a, com.anythink.expressad.exoplayer.w.c
        public final void onPlayerStateChanged(boolean z10, int i10) {
            super.onPlayerStateChanged(z10, i10);
            String str = PlayerView.TAG;
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        PlayerView.this.e();
                        PlayerView.y(PlayerView.this);
                        PlayerView playerView = PlayerView.this;
                        playerView.f4385m = playerView.f4386n;
                        if (PlayerView.this.f4396z != null) {
                            PlayerView.this.f4396z.c();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!PlayerView.this.f4395x) {
                    PlayerView.w(PlayerView.this);
                    PlayerView.this.y = false;
                    PlayerView playerView2 = PlayerView.this;
                    playerView2.f4386n = (int) playerView2.f.s();
                    if (PlayerView.this.f4396z != null) {
                        PlayerView.this.f4396z.c(PlayerView.this.f4386n);
                    }
                    PlayerView.this.o = Math.round(r6.f4386n * 0.25f);
                    PlayerView.this.f4387p = Math.round(r6.f4386n * 0.5f);
                    PlayerView.this.f4388q = Math.round(r6.f4386n * 0.75f);
                    PlayerView playerView3 = PlayerView.this;
                    int i11 = playerView3.f4376c;
                    if (i11 <= 0 || i11 >= 100) {
                        playerView3.G = false;
                    } else {
                        if (playerView3.f4375b > i11) {
                            playerView3.f4375b = i11 / 2;
                        }
                        playerView3.f4374a = Math.round(((playerView3.f4375b * 1.0f) / 100.0f) * playerView3.f4386n);
                        r6.f4374a -= 2000;
                        PlayerView.this.G = true;
                    }
                }
                if (PlayerView.this.f4385m > 0 && PlayerView.this.f4385m != PlayerView.this.f.t()) {
                    PlayerView.this.f.a(PlayerView.this.f4385m);
                    return;
                }
                return;
            }
            if (!PlayerView.this.y) {
                PlayerView.this.y = true;
                PlayerView.v(PlayerView.this);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.PlayerView$3 */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements com.anythink.expressad.exoplayer.l.g {
        public AnonymousClass3() {
        }

        @Override // com.anythink.expressad.exoplayer.l.g
        public final void a() {
        }

        @Override // com.anythink.expressad.exoplayer.l.g
        public final void a(int i10, int i11) {
            PlayerView playerView = PlayerView.this;
            playerView.autoFitVideoSize(i10, i11, playerView.f4380h);
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(int i10);

        void a(com.anythink.basead.c.e eVar);

        void b();

        void b(int i10);

        void c();

        void c(int i10);

        void d();

        void e();

        void f();

        void g();
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4381i = "";
        this.f4382j = "";
        this.f4385m = -1;
        this.f4392u = false;
        this.f4393v = false;
        this.f4394w = false;
        this.f4395x = false;
        this.y = false;
        this.f4375b = 0;
        this.f4376c = 0;
        this.f4377d = false;
        this.f4378e = "";
        setSaveEnabled(true);
        this.A = new Handler(Looper.getMainLooper()) { // from class: com.anythink.basead.ui.PlayerView.1
            public AnonymousClass1(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                PlayerView.this.f4385m = message.what;
                if (PlayerView.this.f4385m <= 0) {
                    return;
                }
                if (!PlayerView.this.f4393v && !PlayerView.this.f4394w) {
                    PlayerView.d(PlayerView.this);
                    if (PlayerView.this.f4396z != null) {
                        PlayerView.this.f4396z.a();
                    }
                }
                if (PlayerView.this.f4396z != null) {
                    PlayerView.this.f4396z.a(PlayerView.this.f4385m);
                }
                if (!PlayerView.this.f4389r && PlayerView.this.f4385m >= PlayerView.this.o) {
                    PlayerView.h(PlayerView.this);
                    if (PlayerView.this.f4396z != null) {
                        PlayerView.this.f4396z.b(25);
                    }
                } else if (!PlayerView.this.f4390s && PlayerView.this.f4385m >= PlayerView.this.f4387p) {
                    PlayerView.k(PlayerView.this);
                    if (PlayerView.this.f4396z != null) {
                        PlayerView.this.f4396z.b(50);
                    }
                } else if (!PlayerView.this.f4391t && PlayerView.this.f4385m >= PlayerView.this.f4388q) {
                    PlayerView.n(PlayerView.this);
                    if (PlayerView.this.f4396z != null) {
                        PlayerView.this.f4396z.b(75);
                    }
                }
                if (PlayerView.this.G) {
                    int i10 = PlayerView.this.f4385m;
                    PlayerView playerView = PlayerView.this;
                    if (i10 >= playerView.f4374a && playerView.f4396z != null) {
                        PlayerView.this.G = false;
                        PlayerView.this.f4396z.g();
                    }
                }
            }
        };
        setBackgroundColor(-16777216);
    }

    public static /* synthetic */ boolean h(PlayerView playerView) {
        playerView.f4389r = true;
        return true;
    }

    public static /* synthetic */ boolean k(PlayerView playerView) {
        playerView.f4390s = true;
        return true;
    }

    public static /* synthetic */ boolean n(PlayerView playerView) {
        playerView.f4391t = true;
        return true;
    }

    public static /* synthetic */ void p(PlayerView playerView) {
        a aVar = playerView.f4396z;
        if (aVar != null) {
            aVar.g();
        }
        playerView.f.a(playerView.f4379g);
    }

    public static /* synthetic */ void v(PlayerView playerView) {
        View view = playerView.H;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public static /* synthetic */ boolean w(PlayerView playerView) {
        playerView.f4395x = true;
        return true;
    }

    public static /* synthetic */ boolean y(PlayerView playerView) {
        playerView.f4394w = true;
        return true;
    }

    public void autoFitVideoSize(int i10, int i11, View view) {
        float max = Math.max(i10 / view.getMeasuredWidth(), i11 / view.getMeasuredHeight());
        int ceil = (int) Math.ceil(r4 / max);
        int ceil2 = (int) Math.ceil(r5 / max);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = ceil;
        layoutParams.height = ceil2;
        view.setLayoutParams(layoutParams);
    }

    public int getCurrentPosition() {
        return Math.max(this.f4385m, 0);
    }

    public int getVideoLength() {
        return this.f4386n;
    }

    public boolean hasVideo() {
        return this.F;
    }

    public void initMuteStatus(boolean z10) {
        this.B = z10;
    }

    public boolean isComplete() {
        return this.f4394w;
    }

    public boolean isMute() {
        return this.B;
    }

    public boolean isPlaying() {
        ad adVar = this.f;
        if (adVar != null && adVar.J()) {
            return true;
        }
        return false;
    }

    public void load(String str, boolean z10) {
        boolean z11;
        int i10;
        this.f4382j = str;
        com.anythink.basead.a.f.a();
        this.f4381i = com.anythink.basead.a.f.a(4, str);
        int i11 = 0;
        if (!new File(this.f4381i).exists() && TextUtils.isEmpty(this.f4382j)) {
            z11 = true;
        } else {
            this.F = true;
            z11 = false;
        }
        if (z11) {
            a aVar = this.f4396z;
            if (aVar != null) {
                aVar.a(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3754k, com.anythink.basead.c.f.J));
                return;
            }
            return;
        }
        float f = 1.0f;
        if (this.f4383k == 0 || this.f4384l == 0) {
            try {
                String g6 = g();
                int i12 = this.D;
                int i13 = this.E;
                g.a a10 = com.anythink.basead.a.b.g.a(g6);
                if (a10 == null) {
                    a10 = null;
                } else {
                    float f10 = (a10.f3607a * 1.0f) / a10.f3608b;
                    if (f10 < (i12 * 1.0f) / i13) {
                        a10.f3608b = i13;
                        a10.f3607a = (int) (i13 * f10);
                    } else {
                        a10.f3607a = i12;
                        a10.f3608b = (int) (i12 / f10);
                    }
                }
                if (a10 != null) {
                    this.f4383k = a10.f3607a;
                    this.f4384l = a10.f3608b;
                }
                int i14 = this.D;
                int i15 = this.E;
                int i16 = this.f4383k;
                int i17 = this.f4384l;
                if (i14 == i16) {
                    if (i15 - i17 <= h.a(getContext(), 1.0f)) {
                        this.f4384l = this.E;
                    }
                } else if (i15 == i17 && i14 - i16 <= h.a(getContext(), 1.0f)) {
                    this.f4383k = this.D;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (this.f4380h == null) {
            TextureView textureView = new TextureView(getContext());
            this.f4380h = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            int i18 = this.f4383k;
            if (i18 != 0 && (i10 = this.f4384l) != 0) {
                layoutParams.width = i18;
                layoutParams.height = i10;
            }
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f4380h, layoutParams);
        }
        if (this.f == null) {
            this.f = i.a(new com.anythink.expressad.exoplayer.f(getContext()), new com.anythink.expressad.exoplayer.i.c(), new com.anythink.expressad.exoplayer.d());
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            this.I = anonymousClass2;
            this.f.a(anonymousClass2);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3();
            this.J = anonymousClass3;
            this.f.a(anonymousClass3);
            ad adVar = this.f;
            if (this.B) {
                f = gl.Code;
            }
            adVar.a(f);
            this.f.a(z10);
            a(g(), false);
        }
        setOnClickListener(new e(this, i11));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        float f;
        b bVar = (b) parcelable;
        bVar.a();
        super.onRestoreInstanceState(bVar.getSuperState());
        this.f4385m = bVar.f4400a;
        this.f4389r = bVar.f4401b;
        this.f4390s = bVar.f4402c;
        this.f4391t = bVar.f4403d;
        this.f4393v = bVar.f4404e;
        this.f4394w = bVar.f;
        boolean z10 = bVar.f4405g;
        this.B = z10;
        this.G = bVar.f4406h;
        ad adVar = this.f;
        if (adVar != null) {
            if (z10) {
                f = gl.Code;
            } else {
                f = 1.0f;
            }
            adVar.a(f);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f4400a = this.f4385m;
        bVar.f4401b = this.f4389r;
        bVar.f4402c = this.f4390s;
        bVar.f4403d = this.f4391t;
        bVar.f4404e = this.f4393v;
        bVar.f = this.f4394w;
        bVar.f4405g = this.B;
        bVar.f4406h = this.G;
        bVar.a();
        return bVar;
    }

    public void pause() {
        e();
        ad adVar = this.f;
        if (adVar != null) {
            adVar.a(false);
        }
    }

    public void release() {
        e();
        if (!this.f4395x) {
            return;
        }
        ad adVar = this.f;
        if (adVar != null) {
            if (adVar.J()) {
                this.f.m();
            }
            w.c cVar = this.I;
            if (cVar != null) {
                this.f.b(cVar);
            }
            com.anythink.expressad.exoplayer.l.g gVar = this.J;
            if (gVar != null) {
                this.f.b(gVar);
            }
            this.f.n();
            this.f = null;
        }
        Handler handler = this.A;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f4395x = false;
    }

    public void setListener(a aVar) {
        this.f4396z = aVar;
    }

    public void setLoadingView(View view) {
        this.H = view;
    }

    public void setMute(boolean z10) {
        this.B = z10;
        if (z10) {
            ad adVar = this.f;
            if (adVar != null) {
                adVar.a(gl.Code);
            }
            a aVar = this.f4396z;
            if (aVar != null) {
                aVar.e();
                return;
            }
            return;
        }
        ad adVar2 = this.f;
        if (adVar2 != null) {
            adVar2.a(1.0f);
        }
        a aVar2 = this.f4396z;
        if (aVar2 != null) {
            aVar2.f();
        }
    }

    public void setVideoRateConfig(int i10, int i11) {
        this.f4376c = i10;
        this.f4375b = i11;
    }

    public void setVideoSize(int i10, int i11) {
        this.D = i10;
        this.E = i11;
    }

    public void start() {
        View view = this.H;
        if (view != null) {
            view.setVisibility(8);
        }
        ad adVar = this.f;
        if (adVar != null) {
            adVar.a(true);
        }
        if (this.C == null) {
            this.f4392u = true;
            Thread thread = new Thread(new c(this, 1));
            this.C = thread;
            thread.start();
        }
    }

    public void stop() {
        ad adVar = this.f;
        if (adVar != null) {
            adVar.m();
        }
        a aVar = this.f4396z;
        if (aVar != null) {
            aVar.b();
        }
    }

    public static /* synthetic */ boolean d(PlayerView playerView) {
        playerView.f4393v = true;
        return true;
    }

    private boolean f() {
        if (!new File(this.f4381i).exists() && TextUtils.isEmpty(this.f4382j)) {
            return true;
        }
        this.F = true;
        return false;
    }

    private String g() {
        if (new File(this.f4381i).exists()) {
            return this.f4381i;
        }
        return this.f4382j;
    }

    private void h() {
        int i10;
        if (this.f4380h == null) {
            TextureView textureView = new TextureView(getContext());
            this.f4380h = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            int i11 = this.f4383k;
            if (i11 != 0 && (i10 = this.f4384l) != 0) {
                layoutParams.width = i11;
                layoutParams.height = i10;
            }
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f4380h, layoutParams);
        }
    }

    private void i() {
        a aVar = this.f4396z;
        if (aVar != null) {
            aVar.g();
        }
        this.f.a(this.f4379g);
    }

    public /* synthetic */ void j() {
        Handler handler;
        while (this.f4392u) {
            if (!this.f4394w && isPlaying() && (handler = this.A) != null) {
                try {
                    handler.sendEmptyMessage((int) this.f.t());
                } catch (Throwable unused) {
                }
                try {
                    Thread.sleep(200L);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } else {
                try {
                    Thread.sleep(10L);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
    }

    private void c() {
        View view = this.H;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void d() {
        if (this.C != null) {
            return;
        }
        this.f4392u = true;
        Thread thread = new Thread(new n0(this, 4));
        this.C = thread;
        thread.start();
    }

    public void e() {
        this.f4392u = false;
        this.C = null;
    }

    public /* synthetic */ void a(View view) {
        a aVar = this.f4396z;
        if (aVar != null) {
            aVar.d();
        }
    }

    private void b() {
        View view = this.H;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void a() {
        if (this.f4383k == 0 || this.f4384l == 0) {
            try {
                String g6 = g();
                int i10 = this.D;
                int i11 = this.E;
                g.a a10 = com.anythink.basead.a.b.g.a(g6);
                if (a10 == null) {
                    a10 = null;
                } else {
                    float f = (a10.f3607a * 1.0f) / a10.f3608b;
                    if (f < (i10 * 1.0f) / i11) {
                        a10.f3608b = i11;
                        a10.f3607a = (int) (i11 * f);
                    } else {
                        a10.f3607a = i10;
                        a10.f3608b = (int) (i10 / f);
                    }
                }
                if (a10 != null) {
                    this.f4383k = a10.f3607a;
                    this.f4384l = a10.f3608b;
                }
                int i12 = this.D;
                int i13 = this.E;
                int i14 = this.f4383k;
                int i15 = this.f4384l;
                if (i12 == i14) {
                    if (i13 - i15 <= h.a(getContext(), 1.0f)) {
                        this.f4384l = this.E;
                    }
                } else {
                    if (i13 != i15 || i12 - i14 > h.a(getContext(), 1.0f)) {
                        return;
                    }
                    this.f4383k = this.D;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void b(boolean z10) {
        if (this.f == null) {
            this.f = i.a(new com.anythink.expressad.exoplayer.f(getContext()), new com.anythink.expressad.exoplayer.i.c(), new com.anythink.expressad.exoplayer.d());
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            this.I = anonymousClass2;
            this.f.a(anonymousClass2);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3();
            this.J = anonymousClass3;
            this.f.a(anonymousClass3);
            this.f.a(this.B ? gl.Code : 1.0f);
            this.f.a(z10);
            a(g(), false);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.anythink.basead.ui.PlayerView.b.1
            private static b a(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ b[] newArray(int i10) {
                return new b[i10];
            }

            private static b[] a(int i10) {
                return new b[i10];
            }
        };

        /* renamed from: a */
        int f4400a;

        /* renamed from: b */
        boolean f4401b;

        /* renamed from: c */
        boolean f4402c;

        /* renamed from: d */
        boolean f4403d;

        /* renamed from: e */
        boolean f4404e;
        boolean f;

        /* renamed from: g */
        boolean f4405g;

        /* renamed from: h */
        boolean f4406h;

        /* renamed from: com.anythink.basead.ui.PlayerView$b$1 */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements Parcelable.Creator<b> {
            private static b a(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ b[] newArray(int i10) {
                return new b[i10];
            }

            private static b[] a(int i10) {
                return new b[i10];
            }
        }

        public b(Parcel parcel) {
            super(parcel);
            this.f4400a = parcel.readInt();
            boolean[] zArr = new boolean[7];
            parcel.readBooleanArray(zArr);
            this.f4401b = zArr[0];
            this.f4402c = zArr[1];
            this.f4403d = zArr[2];
            this.f4404e = zArr[3];
            this.f = zArr[4];
            this.f4405g = zArr[5];
            this.f4406h = zArr[6];
        }

        public final String a() {
            return "SavedState(\nsavePosition - " + this.f4400a + "\nsaveVideoPlay25 - " + this.f4401b + "\nsaveVideoPlay50 - " + this.f4402c + "\nsaveVideoPlay75 - " + this.f4403d + "\nsaveIsVideoStart - " + this.f4404e + "\nsaveIsVideoPlayCompletion - " + this.f + "\nsaveIsMute - " + this.f4405g + "\nsaveVideoNeedResumeByCdRate - " + this.f4406h + "\n)";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f4400a);
            parcel.writeBooleanArray(new boolean[]{this.f4401b, this.f4402c, this.f4403d, this.f4404e, this.f, this.f4405g, this.f4406h});
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.String r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.ui.PlayerView.a(java.lang.String, boolean):void");
    }

    private void a(boolean z10) {
        boolean z11;
        int i10;
        if (new File(this.f4381i).exists() || !TextUtils.isEmpty(this.f4382j)) {
            this.F = true;
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            a aVar = this.f4396z;
            if (aVar != null) {
                aVar.a(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3754k, com.anythink.basead.c.f.J));
                return;
            }
            return;
        }
        if (this.f4383k == 0 || this.f4384l == 0) {
            try {
                String g6 = g();
                int i11 = this.D;
                int i12 = this.E;
                g.a a10 = com.anythink.basead.a.b.g.a(g6);
                if (a10 == null) {
                    a10 = null;
                } else {
                    float f = (a10.f3607a * 1.0f) / a10.f3608b;
                    if (f < (i11 * 1.0f) / i12) {
                        a10.f3608b = i12;
                        a10.f3607a = (int) (i12 * f);
                    } else {
                        a10.f3607a = i11;
                        a10.f3608b = (int) (i11 / f);
                    }
                }
                if (a10 != null) {
                    this.f4383k = a10.f3607a;
                    this.f4384l = a10.f3608b;
                }
                int i13 = this.D;
                int i14 = this.E;
                int i15 = this.f4383k;
                int i16 = this.f4384l;
                if (i13 == i15) {
                    if (i14 - i16 <= h.a(getContext(), 1.0f)) {
                        this.f4384l = this.E;
                    }
                } else if (i14 == i16 && i13 - i15 <= h.a(getContext(), 1.0f)) {
                    this.f4383k = this.D;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (this.f4380h == null) {
            TextureView textureView = new TextureView(getContext());
            this.f4380h = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            int i17 = this.f4383k;
            if (i17 != 0 && (i10 = this.f4384l) != 0) {
                layoutParams.width = i17;
                layoutParams.height = i10;
            }
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f4380h, layoutParams);
        }
        if (this.f == null) {
            this.f = i.a(new com.anythink.expressad.exoplayer.f(getContext()), new com.anythink.expressad.exoplayer.i.c(), new com.anythink.expressad.exoplayer.d());
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            this.I = anonymousClass2;
            this.f.a(anonymousClass2);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3();
            this.J = anonymousClass3;
            this.f.a(anonymousClass3);
            this.f.a(this.B ? gl.Code : 1.0f);
            this.f.a(z10);
            a(g(), false);
        }
        setOnClickListener(new d(this, 0));
    }
}
