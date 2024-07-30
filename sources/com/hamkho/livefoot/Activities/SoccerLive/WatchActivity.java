package com.hamkho.livefoot.Activities.SoccerLive;

import android.app.Dialog;
import android.app.PictureInPictureParams;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Rational;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import b9.b0;
import b9.v;
import b9.x;
import b9.y;
import cn.iwgang.countdownview.CountdownView;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.anythink.basead.ui.e;
import com.anythink.expressad.exoplayer.f;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.hamkho.livefoot.Activities.SoccerLive.WatchActivity;
import com.hamkho.livefoot.R;
import d0.a;
import d6.g0;
import d6.p;
import io.paperdb.Paper;
import j5.h0;
import j5.u;
import j7.j0;
import j7.v1;
import java.util.ArrayList;
import java.util.HashSet;
import k4.a0;
import k4.c;
import k4.c1;
import k4.d0;
import k4.e1;
import k4.f0;
import k4.g1;
import k4.k0;
import k4.n0;
import k4.o1;
import k4.s;
import k4.y0;
import m9.d;
import x8.b;
import y1.g;

/* loaded from: classes2.dex */
public class WatchActivity extends AppCompatActivity {
    public static final /* synthetic */ int I = 0;
    public d B;
    public Dialog C;
    public Handler D;
    public boolean E;
    public SharedPreferences F;
    public SharedPreferences.Editor G;

    /* renamed from: s, reason: collision with root package name */
    public g f21492s;

    /* renamed from: t, reason: collision with root package name */
    public String f21493t;

    /* renamed from: u, reason: collision with root package name */
    public a0 f21494u;

    /* renamed from: w, reason: collision with root package name */
    public PlayerView f21496w;

    /* renamed from: v, reason: collision with root package name */
    public boolean f21495v = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f21497x = false;
    public String y = "";

    /* renamed from: z, reason: collision with root package name */
    public String f21498z = "";
    public int A = 0;
    public boolean H = false;

    /* loaded from: classes2.dex */
    public class a implements e1.c {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ProgressBar f21499s;

        public a(CircularProgressIndicator circularProgressIndicator) {
            this.f21499s = circularProgressIndicator;
        }

        @Override // k4.e1.c
        public final void F(int i10) {
            ProgressBar progressBar = this.f21499s;
            if (i10 == 2) {
                progressBar.setVisibility(0);
            } else if (i10 == 3) {
                progressBar.setVisibility(8);
            }
        }
    }

    public static void c(WatchActivity watchActivity) {
        watchActivity.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            if (i10 >= 26) {
                watchActivity.enterPictureInPictureMode(new PictureInPictureParams.Builder().setAspectRatio(new Rational(16, 9)).build());
            } else {
                Toast.makeText(watchActivity, "Your device not support Picture in Picture", 0).show();
            }
        }
    }

    public final void d() {
        ((CountdownView) this.f21492s.f36545u).setVisibility(8);
        Paper.book().delete("IS_START");
        Paper.book().delete("LAST_TIME_SAVE");
        Paper.book().delete("TIME_REMAIN");
        this.G.putBoolean("MyTime", false);
        this.G.apply();
        this.E = false;
    }

    public final void init() {
        Paper.init(this);
        boolean booleanValue = ((Boolean) Paper.book().read("IS_START", Boolean.FALSE)).booleanValue();
        this.E = booleanValue;
        if (booleanValue) {
            long currentTimeMillis = System.currentTimeMillis();
            long longValue = (((Long) Paper.book().read("LAST_TIME_SAVE")).longValue() - currentTimeMillis) + ((Long) Paper.book().read("TIME_REMAIN")).longValue();
            if (longValue > 0) {
                ((CountdownView) this.f21492s.f36545u).b(longValue);
                return;
            }
            CountdownView.a aVar = ((CountdownView) this.f21492s.f36545u).f3487t;
            if (aVar != null) {
                synchronized (aVar) {
                    aVar.f28039d = true;
                    aVar.f28040e.removeMessages(1);
                }
            }
            d();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        RelativeLayout relativeLayout;
        boolean z10;
        super.onCreate(bundle);
        int i10 = 0;
        View inflate = getLayoutInflater().inflate(R.layout.activity_watch, (ViewGroup) null, false);
        int i11 = R.id.CountDown;
        CountdownView countdownView = (CountdownView) a0.a.H0(R.id.CountDown, inflate);
        if (countdownView != null) {
            i11 = R.id.Progress;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) a0.a.H0(R.id.Progress, inflate);
            if (circularProgressIndicator != null) {
                i11 = R.id.playerView;
                PlayerView playerView = (PlayerView) a0.a.H0(R.id.playerView, inflate);
                if (playerView != null) {
                    this.f21492s = new g((RelativeLayout) inflate, countdownView, circularProgressIndicator, playerView, 4);
                    getWindow().getDecorView().setSystemUiVisibility(3846);
                    g gVar = this.f21492s;
                    int i12 = gVar.f36543s;
                    Object obj = gVar.f36544t;
                    switch (i12) {
                        case 3:
                            relativeLayout = (RelativeLayout) obj;
                            break;
                        default:
                            relativeLayout = (RelativeLayout) obj;
                            break;
                    }
                    setContentView(relativeLayout);
                    SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", 0);
                    this.F = sharedPreferences;
                    this.H = sharedPreferences.getBoolean("MyTime", false);
                    this.G = this.F.edit();
                    this.f21493t = getIntent().getStringExtra("ChannelLink");
                    this.f21496w = (PlayerView) this.f21492s.f36547w;
                    try {
                        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(0, "https://hamkho.host/linksstream/footlinks.json", null, new b9.a0(this), new b0());
                        RequestQueue newRequestQueue = Volley.newRequestQueue(this);
                        jsonObjectRequest.setRetryPolicy(new DefaultRetryPolicy(5000, 1, 1.0f));
                        newRequestQueue.add(jsonObjectRequest);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    init();
                    ((CountdownView) this.f21492s.f36545u).setOnCountdownEndListener(new x(this));
                    g gVar2 = this.f21492s;
                    CountdownView countdownView2 = (CountdownView) gVar2.f36545u;
                    y yVar = new y();
                    countdownView2.f3491x = 1000L;
                    countdownView2.f3489v = yVar;
                    CircularProgressIndicator circularProgressIndicator2 = (CircularProgressIndicator) gVar2.f36546v;
                    final ImageView imageView = (ImageView) findViewById(R.id.exo_lock);
                    final ImageView imageView2 = (ImageView) findViewById(R.id.exo_rotate);
                    final ImageView imageView3 = (ImageView) findViewById(R.id.exo_back);
                    final ImageView imageView4 = (ImageView) findViewById(R.id.exo_pip);
                    imageView4.setOnClickListener(new b(this, 5));
                    imageView3.setOnClickListener(new v(this, i10));
                    imageView2.setOnClickListener(new e(this, 6));
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: b9.w
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            WatchActivity watchActivity = WatchActivity.this;
                            boolean z11 = watchActivity.f21495v;
                            ImageView imageView5 = imageView3;
                            ImageView imageView6 = imageView4;
                            ImageView imageView7 = imageView2;
                            ImageView imageView8 = imageView;
                            if (!z11) {
                                imageView5.setVisibility(8);
                                imageView6.setVisibility(8);
                                imageView7.setVisibility(8);
                                Context applicationContext = watchActivity.getApplicationContext();
                                Object obj2 = d0.a.f27248a;
                                imageView8.setImageDrawable(a.c.b(applicationContext, R.drawable.ic_baseline_lock));
                            } else {
                                imageView5.setVisibility(0);
                                imageView6.setVisibility(0);
                                imageView7.setVisibility(0);
                                Context applicationContext2 = watchActivity.getApplicationContext();
                                Object obj3 = d0.a.f27248a;
                                imageView8.setImageDrawable(a.c.b(applicationContext2, R.drawable.ic_outline_lock_open));
                            }
                            boolean z12 = !watchActivity.f21495v;
                            watchActivity.f21495v = z12;
                            LinearLayout linearLayout = (LinearLayout) watchActivity.findViewById(R.id.sec_controlvid1);
                            LinearLayout linearLayout2 = (LinearLayout) watchActivity.findViewById(R.id.sec_controlvid2);
                            if (z12) {
                                linearLayout.setVisibility(4);
                                linearLayout2.setVisibility(4);
                            } else {
                                linearLayout.setVisibility(0);
                                linearLayout2.setVisibility(0);
                            }
                        }
                    });
                    s sVar = new s(this);
                    d6.a.d(!sVar.f30805t);
                    sVar.f30800n = f.f7962a;
                    d6.a.d(!sVar.f30805t);
                    sVar.o = f.f7962a;
                    d6.a.d(!sVar.f30805t);
                    sVar.f30805t = true;
                    a0 a0Var = new a0(sVar);
                    this.f21494u = a0Var;
                    this.f21496w.setPlayer(a0Var);
                    this.f21496w.setKeepScreenOn(true);
                    a0 a0Var2 = this.f21494u;
                    a aVar = new a(circularProgressIndicator2);
                    a0Var2.getClass();
                    a0Var2.f30338l.a(aVar);
                    Uri parse = Uri.parse(this.f21493t);
                    n0.a aVar2 = new n0.a();
                    aVar2.f30581b = parse;
                    n0 a10 = aVar2.a();
                    a0 a0Var3 = this.f21494u;
                    a0Var3.getClass();
                    v1 G = j0.G(a10);
                    a0Var3.t0();
                    ArrayList arrayList = new ArrayList();
                    for (int i13 = 0; i13 < G.f30115v; i13++) {
                        arrayList.add(a0Var3.f30342q.c((n0) G.get(i13)));
                    }
                    a0Var3.t0();
                    a0Var3.d0();
                    a0Var3.getCurrentPosition();
                    a0Var3.H++;
                    ArrayList arrayList2 = a0Var3.o;
                    if (!arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        for (int i14 = size - 1; i14 >= 0; i14--) {
                            arrayList2.remove(i14);
                        }
                        a0Var3.M = a0Var3.M.b(size);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        y0.c cVar = new y0.c((u) arrayList.get(i15), a0Var3.f30341p);
                        arrayList3.add(cVar);
                        arrayList2.add(i15 + 0, new a0.d(cVar.f30850a.G, cVar.f30851b));
                    }
                    a0Var3.M = a0Var3.M.e(arrayList3.size());
                    g1 g1Var = new g1(arrayList2, a0Var3.M);
                    boolean p10 = g1Var.p();
                    int i16 = g1Var.f30470x;
                    if (!p10 && -1 >= i16) {
                        throw new k0();
                    }
                    int a11 = g1Var.a(a0Var3.G);
                    c1 g02 = a0Var3.g0(a0Var3.f30333i0, g1Var, a0Var3.h0(g1Var, a11, com.anythink.expressad.exoplayer.b.f7291b));
                    int i17 = g02.f30386e;
                    if (a11 != -1 && i17 != 1) {
                        i17 = (g1Var.p() || a11 >= i16) ? 4 : 2;
                    }
                    c1 f = g02.f(i17);
                    long J = g0.J(com.anythink.expressad.exoplayer.b.f7291b);
                    h0 h0Var = a0Var3.M;
                    f0 f0Var = a0Var3.f30336k;
                    f0Var.getClass();
                    f0Var.f30436z.j(17, new f0.a(arrayList3, h0Var, a11, J)).a();
                    if (!a0Var3.f30333i0.f30383b.f29835a.equals(f.f30383b.f29835a) && !a0Var3.f30333i0.f30382a.p()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a0Var3.r0(f, 0, 1, false, z10, 4, a0Var3.c0(f), -1, false);
                    this.f21494u.b();
                    this.f21494u.play();
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        String str;
        boolean z10;
        AudioTrack audioTrack;
        super.onDestroy();
        a0 a0Var = this.f21494u;
        if (a0Var != null) {
            StringBuilder sb2 = new StringBuilder("Release ");
            sb2.append(Integer.toHexString(System.identityHashCode(a0Var)));
            sb2.append(" [ExoPlayerLib/2.18.4] [");
            sb2.append(g0.f27306e);
            sb2.append("] [");
            HashSet<String> hashSet = k4.g0.f30468a;
            synchronized (k4.g0.class) {
                str = k4.g0.f30469b;
            }
            sb2.append(str);
            sb2.append("]");
            p.e("ExoPlayerImpl", sb2.toString());
            a0Var.t0();
            if (g0.f27302a < 21 && (audioTrack = a0Var.P) != null) {
                audioTrack.release();
                a0Var.P = null;
            }
            a0Var.f30350z.a();
            o1 o1Var = a0Var.B;
            o1.b bVar = o1Var.f30719e;
            if (bVar != null) {
                try {
                    o1Var.f30715a.unregisterReceiver(bVar);
                } catch (RuntimeException e10) {
                    p.g("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
                }
                o1Var.f30719e = null;
            }
            a0Var.C.getClass();
            a0Var.D.getClass();
            c cVar = a0Var.A;
            cVar.f30373c = null;
            cVar.a();
            f0 f0Var = a0Var.f30336k;
            synchronized (f0Var) {
                if (!f0Var.R && f0Var.B.getThread().isAlive()) {
                    f0Var.f30436z.g(7);
                    f0Var.f0(new d0(f0Var), f0Var.N);
                    z10 = f0Var.R;
                }
                z10 = true;
            }
            if (!z10) {
                a0Var.f30338l.e(10, new com.applovin.exoplayer2.a0(16));
            }
            a0Var.f30338l.d();
            a0Var.f30332i.e();
            a0Var.f30345t.d(a0Var.f30343r);
            c1 f = a0Var.f30333i0.f(1);
            a0Var.f30333i0 = f;
            c1 a10 = f.a(f.f30383b);
            a0Var.f30333i0 = a10;
            a10.f30395p = a10.f30397r;
            a0Var.f30333i0.f30396q = 0L;
            a0Var.f30343r.release();
            a0Var.f30330h.b();
            a0Var.j0();
            Surface surface = a0Var.R;
            if (surface != null) {
                surface.release();
                a0Var.R = null;
            }
            a0Var.f30322c0 = r5.c.f34916t;
        }
        this.D.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        a0 a0Var = this.f21494u;
        if (a0Var != null) {
            a0Var.pause();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 26) {
            super.onPictureInPictureModeChanged(z10, configuration);
            if (z10) {
                this.f21496w.setUseController(false);
                this.f21494u.m0(true);
            } else {
                this.f21496w.setUseController(true);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        a0 a0Var = this.f21494u;
        if (a0Var != null) {
            a0Var.play();
        }
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        Paper.book().write("TIME_REMAIN", Long.valueOf(((CountdownView) this.f21492s.f36545u).getRemainTime()));
        Paper.book().write("LAST_TIME_SAVE", Long.valueOf(System.currentTimeMillis()));
        a0 a0Var = this.f21494u;
        a0Var.t0();
        a0Var.t0();
        a0Var.A.e(1, a0Var.g());
        a0Var.o0(null);
        a0Var.f30322c0 = new r5.c(a0Var.f30333i0.f30397r, v1.f30113w);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }
}
