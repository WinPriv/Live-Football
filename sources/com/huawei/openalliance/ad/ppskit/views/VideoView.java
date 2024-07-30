package com.huawei.openalliance.ad.ppskit.views;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import ka.e9;
import ka.f9;
import ka.g8;
import ka.g9;
import ka.h9;
import ka.i8;
import ka.i9;
import ka.j8;
import ka.j9;
import ka.k6;
import ka.k9;
import ka.m6;
import ka.m8;
import ka.n7;
import ka.n8;
import ka.o8;
import ka.r8;
import ka.s8;
import ka.v7;
import ka.w7;
import ka.x7;

/* loaded from: classes2.dex */
public class VideoView extends AutoScaleSizeRelativeLayout implements TextureView.SurfaceTextureListener {

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f23348r0 = 0;
    public w7 A;
    public w7 B;
    public s8 C;
    public final CopyOnWriteArraySet D;
    public final CopyOnWriteArraySet E;
    public final CopyOnWriteArraySet F;
    public final CopyOnWriteArraySet G;
    public final CopyOnWriteArraySet H;
    public final CopyOnWriteArraySet I;
    public final CopyOnWriteArraySet J;
    public final CopyOnWriteArraySet K;
    public boolean L;
    public boolean M;
    public boolean N;
    public String O;
    public String[] P;
    public int Q;
    public final SparseBooleanArray R;
    public p S;
    public Surface T;
    public SurfaceTexture U;
    public boolean V;
    public int W;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f23349c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f23350d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f23351e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f23352f0;

    /* renamed from: g0, reason: collision with root package name */
    public q f23353g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f23354h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f23355i0;

    /* renamed from: j0, reason: collision with root package name */
    public final r f23356j0;

    /* renamed from: k0, reason: collision with root package name */
    public final l f23357k0;

    /* renamed from: l0, reason: collision with root package name */
    public final i f23358l0;

    /* renamed from: m0, reason: collision with root package name */
    public final o f23359m0;

    /* renamed from: n0, reason: collision with root package name */
    public final j f23360n0;

    /* renamed from: o0, reason: collision with root package name */
    public final m f23361o0;

    /* renamed from: p0, reason: collision with root package name */
    public final k f23362p0;

    /* renamed from: q0, reason: collision with root package name */
    public final h f23363q0;

    /* renamed from: x, reason: collision with root package name */
    public TextureView f23364x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f23365z;

    /* loaded from: classes2.dex */
    public class a implements h9 {
        public a() {
        }

        @Override // ka.h9
        public final void a(int i10, int i11) {
            VideoView videoView = VideoView.this;
            VideoView.t(videoView, i10, i11);
            Iterator it = videoView.E.iterator();
            while (it.hasNext()) {
                ((h9) it.next()).a(i10, i11);
            }
        }

        @Override // ka.h9
        public final void h(w7 w7Var, int i10) {
            VideoView videoView = VideoView.this;
            if (videoView.N) {
                videoView.setKeepScreenOn(false);
            }
            VideoView.z(videoView, i10);
            Iterator it = videoView.E.iterator();
            while (it.hasNext()) {
                ((h9) it.next()).h(w7Var, i10);
            }
        }

        @Override // ka.h9
        public final void j(w7 w7Var, int i10) {
            VideoView videoView = VideoView.this;
            if (videoView.N) {
                videoView.setKeepScreenOn(true);
            }
            VideoView.y(videoView);
            VideoView.s(videoView, i10);
            Iterator it = videoView.E.iterator();
            while (it.hasNext()) {
                ((h9) it.next()).j(w7Var, i10);
            }
        }

        @Override // ka.h9
        public final void m(w7 w7Var, int i10) {
            VideoView videoView = VideoView.this;
            VideoView.B(videoView, i10);
            if (VideoView.C(videoView)) {
                return;
            }
            if (videoView.N) {
                videoView.setKeepScreenOn(false);
            }
            Iterator it = videoView.E.iterator();
            while (it.hasNext()) {
                ((h9) it.next()).m(w7Var, i10);
            }
        }

        @Override // ka.h9
        public final void o(w7 w7Var, int i10) {
            VideoView videoView = VideoView.this;
            if (videoView.N) {
                videoView.setKeepScreenOn(false);
            }
            VideoView.A(videoView, i10);
            Iterator it = videoView.E.iterator();
            while (it.hasNext()) {
                ((h9) it.next()).o(w7Var, i10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements j9 {
        public c() {
        }

        @Override // ka.j9
        public final void a() {
            Iterator it = VideoView.this.G.iterator();
            while (it.hasNext()) {
                ((j9) it.next()).a();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements f9 {
        public d() {
        }

        @Override // ka.f9
        public final void g(w7 w7Var, int i10, int i11, int i12) {
            VideoView videoView = VideoView.this;
            if (videoView.N) {
                videoView.setKeepScreenOn(false);
            }
            VideoView.u(videoView, i10, i11, i12);
            Iterator it = videoView.I.iterator();
            while (it.hasNext()) {
                ((f9) it.next()).g(w7Var, i10, i11, i12);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements i9 {
        public e() {
        }

        @Override // ka.i9
        public final void a() {
            VideoView videoView = VideoView.this;
            videoView.f23351e0 = true;
            Iterator it = videoView.H.iterator();
            while (it.hasNext()) {
                ((i9) it.next()).a();
            }
        }

        @Override // ka.i9
        public final void b() {
            VideoView videoView = VideoView.this;
            videoView.f23351e0 = false;
            Iterator it = videoView.H.iterator();
            while (it.hasNext()) {
                ((i9) it.next()).b();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f implements g9 {
        public f() {
        }

        @Override // ka.g9
        public final void a(int i10) {
            Iterator it = VideoView.this.J.iterator();
            while (it.hasNext()) {
                ((g9) it.next()).a(i10);
            }
        }

        @Override // ka.g9
        public final void b(int i10) {
            Iterator it = VideoView.this.J.iterator();
            while (it.hasNext()) {
                ((g9) it.next()).b(i10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            VideoView videoView = VideoView.this;
            videoView.f23356j0.a(videoView.f23354h0, videoView.f23355i0);
        }
    }

    /* loaded from: classes2.dex */
    public class h extends BroadcastReceiver {
        public h() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            ConnectivityManager connectivityManager;
            if (TextUtils.equals("android.net.conn.CONNECTIVITY_CHANGE", intent.getAction()) && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                VideoView videoView = VideoView.this;
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    boolean e10 = com.huawei.openalliance.ad.ppskit.utils.k1.e(context);
                    int i10 = VideoView.f23348r0;
                    videoView.getClass();
                    if (n7.d()) {
                        n7.c("VideoView", "notifyNetworkConnectedOrChanged wifi: %s", Boolean.valueOf(e10));
                    }
                    Iterator it = videoView.D.iterator();
                    while (it.hasNext()) {
                        ((n) it.next()).b(e10);
                    }
                    return;
                }
                int i11 = VideoView.f23348r0;
                videoView.getClass();
                if (n7.d()) {
                    n7.b("VideoView", "notifyNetworkDisconnected");
                }
                Iterator it2 = videoView.D.iterator();
                while (it2.hasNext()) {
                    ((n) it2.next()).l();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class i implements e9 {

        /* renamed from: s, reason: collision with root package name */
        public final WeakReference<e9> f23374s;

        public i(b bVar) {
            this.f23374s = new WeakReference<>(bVar);
        }

        @Override // ka.e9
        public final void a() {
            e9 e9Var = this.f23374s.get();
            if (e9Var != null) {
                e9Var.a();
            }
        }

        @Override // ka.e9
        public final void b() {
            e9 e9Var = this.f23374s.get();
            if (e9Var != null) {
                e9Var.b();
            }
        }

        @Override // ka.e9
        public final void a(int i10) {
            e9 e9Var = this.f23374s.get();
            if (e9Var != null) {
                e9Var.a(i10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class j implements f9 {

        /* renamed from: s, reason: collision with root package name */
        public final WeakReference<f9> f23375s;

        public j(d dVar) {
            this.f23375s = new WeakReference<>(dVar);
        }

        @Override // ka.f9
        public final void g(w7 w7Var, int i10, int i11, int i12) {
            f9 f9Var = this.f23375s.get();
            if (f9Var != null) {
                f9Var.g(w7Var, i10, i11, i12);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class k implements g9 {

        /* renamed from: s, reason: collision with root package name */
        public final WeakReference<g9> f23376s;

        public k(f fVar) {
            this.f23376s = new WeakReference<>(fVar);
        }

        @Override // ka.g9
        public final void a(int i10) {
            g9 g9Var = this.f23376s.get();
            if (g9Var != null) {
                g9Var.a(i10);
            }
        }

        @Override // ka.g9
        public final void b(int i10) {
            g9 g9Var = this.f23376s.get();
            if (g9Var != null) {
                g9Var.b(i10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class l implements h9 {

        /* renamed from: s, reason: collision with root package name */
        public final WeakReference<h9> f23377s;

        public l(a aVar) {
            this.f23377s = new WeakReference<>(aVar);
        }

        @Override // ka.h9
        public final void a(int i10, int i11) {
            h9 h9Var = this.f23377s.get();
            if (h9Var != null) {
                h9Var.a(i10, i11);
            }
        }

        @Override // ka.h9
        public final void h(w7 w7Var, int i10) {
            h9 h9Var = this.f23377s.get();
            if (h9Var != null) {
                h9Var.h(w7Var, i10);
            }
        }

        @Override // ka.h9
        public final void j(w7 w7Var, int i10) {
            h9 h9Var = this.f23377s.get();
            if (h9Var != null) {
                h9Var.j(w7Var, i10);
            }
        }

        @Override // ka.h9
        public final void m(w7 w7Var, int i10) {
            h9 h9Var = this.f23377s.get();
            if (h9Var != null) {
                h9Var.m(w7Var, i10);
            }
        }

        @Override // ka.h9
        public final void o(w7 w7Var, int i10) {
            h9 h9Var = this.f23377s.get();
            if (h9Var != null) {
                h9Var.o(w7Var, i10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class m implements i9 {

        /* renamed from: s, reason: collision with root package name */
        public final WeakReference<i9> f23378s;

        public m(e eVar) {
            this.f23378s = new WeakReference<>(eVar);
        }

        @Override // ka.i9
        public final void a() {
            i9 i9Var = this.f23378s.get();
            if (i9Var != null) {
                i9Var.a();
            }
        }

        @Override // ka.i9
        public final void b() {
            i9 i9Var = this.f23378s.get();
            if (i9Var != null) {
                i9Var.b();
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface n {
        void b(boolean z10);

        void l();
    }

    /* loaded from: classes2.dex */
    public static class o implements j9 {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<j9> f23379a;

        public o(c cVar) {
            this.f23379a = new WeakReference<>(cVar);
        }

        @Override // ka.j9
        public final void a() {
            j9 j9Var = this.f23379a.get();
            if (j9Var != null) {
                j9Var.a();
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface p {
    }

    /* loaded from: classes2.dex */
    public static class q implements MediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<MediaPlayer.OnVideoSizeChangedListener> f23380a;

        public q(r rVar) {
            this.f23380a = new WeakReference<>(rVar);
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener = this.f23380a.get();
            if (onVideoSizeChangedListener != null) {
                onVideoSizeChangedListener.onVideoSizeChanged(mediaPlayer, i10, i11);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class r implements MediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a, reason: collision with root package name */
        public float f23381a = gl.Code;

        /* renamed from: b, reason: collision with root package name */
        public float f23382b = gl.Code;

        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ int f23384s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ int f23385t;

            public a(int i10, int i11) {
                this.f23384s = i10;
                this.f23385t = i11;
            }

            @Override // java.lang.Runnable
            public final void run() {
                r.this.a(this.f23384s, this.f23385t);
            }
        }

        public r() {
        }

        public final void a(int i10, int i11) {
            Matrix matrix;
            float f;
            int i12 = VideoView.f23348r0;
            n7.f("VideoView", "video size changed - w: %d h: %d", Integer.valueOf(i10), Integer.valueOf(i11));
            if (i10 != 0 && i11 != 0) {
                VideoView videoView = VideoView.this;
                videoView.f23354h0 = i10;
                videoView.f23355i0 = i11;
                float f10 = 1.0f;
                float f11 = (i10 * 1.0f) / i11;
                float abs = Math.abs(f11 - this.f23381a);
                if (n7.d()) {
                    n7.c("VideoView", "video ratio: %f oldRatio: %f diff: %f", Float.valueOf(f11), Float.valueOf(this.f23381a), Float.valueOf(abs));
                }
                this.f23381a = f11;
                if (videoView.f23349c0) {
                    if (abs > 0.01f) {
                        videoView.setRatio(Float.valueOf(f11));
                        videoView.requestLayout();
                        return;
                    }
                    return;
                }
                int width = videoView.getWidth();
                int height = videoView.getHeight();
                n7.f("VideoView", "resizeVideo view width: %d height: %d", Integer.valueOf(width), Integer.valueOf(height));
                if (height != 0 && width != 0) {
                    float f12 = width * 1.0f;
                    float f13 = height;
                    float f14 = f12 / f13;
                    float abs2 = Math.abs(f14 - this.f23382b);
                    if (n7.d()) {
                        n7.c("VideoView", "view ratio: %f oldRatio: %f diff: %f", Float.valueOf(f14), Float.valueOf(this.f23382b), Float.valueOf(abs2));
                    }
                    this.f23382b = f14;
                    if (abs2 > 0.01f) {
                        float f15 = f12 / 2.0f;
                        float f16 = (f13 * 1.0f) / 2.0f;
                        int i13 = videoView.W;
                        if (i13 != 1) {
                            if (i13 == 2) {
                                n7.e("VideoView", "set video scale mode as fit with cropping");
                                if (f14 < f11) {
                                    float f17 = f11 / f14;
                                    f = 1.0f;
                                    f10 = f17;
                                } else {
                                    f = f14 / f11;
                                }
                                n7.c("VideoView", "calculateScaleMatrix scaleX: %s scaleY: %s pivotPointX: %s pivotPointY: %s", Float.valueOf(f10), Float.valueOf(f), Float.valueOf(f15), Float.valueOf(f16));
                                matrix = new Matrix();
                                matrix.setScale(f10, f, f15, f16);
                            } else {
                                return;
                            }
                        } else {
                            n7.e("VideoView", "set video scale mode as fit");
                            matrix = new Matrix();
                            matrix.setScale(1.0f, 1.0f, f15, f16);
                        }
                        videoView.f23364x.setTransform(matrix);
                    }
                }
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            d2.a(new a(i10, i11));
        }
    }

    public VideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s8 s8Var;
        this.D = new CopyOnWriteArraySet();
        this.E = new CopyOnWriteArraySet();
        this.F = new CopyOnWriteArraySet();
        this.G = new CopyOnWriteArraySet();
        this.H = new CopyOnWriteArraySet();
        this.I = new CopyOnWriteArraySet();
        this.J = new CopyOnWriteArraySet();
        this.K = new CopyOnWriteArraySet();
        this.L = true;
        this.M = false;
        this.N = false;
        this.R = new SparseBooleanArray(3);
        this.W = 1;
        this.f23349c0 = true;
        this.f23350d0 = true;
        this.f23351e0 = false;
        this.f23356j0 = new r();
        a aVar = new a();
        b bVar = new b();
        c cVar = new c();
        d dVar = new d();
        e eVar = new e();
        f fVar = new f();
        this.f23357k0 = new l(aVar);
        this.f23358l0 = new i(bVar);
        this.f23359m0 = new o(cVar);
        this.f23360n0 = new j(dVar);
        this.f23361o0 = new m(eVar);
        this.f23362p0 = new k(fVar);
        this.f23363q0 = new h();
        setBackgroundColor(-16777216);
        LayoutInflater.from(context).inflate(R.layout.hiad_adscore_view_video, this);
        TextureView textureView = (TextureView) findViewById(R.id.hiad_id_video_texture_view);
        this.f23364x = textureView;
        textureView.setSurfaceTextureListener(this);
        synchronized (s8.f31811h) {
            if (s8.f31810g == null) {
                s8.f31810g = new s8(context);
            }
            s8Var = s8.f31810g;
        }
        this.C = s8Var;
        setMediaPlayerAgent(new w7(context));
    }

    public static void A(VideoView videoView, int i10) {
        Iterator it = videoView.K.iterator();
        while (it.hasNext()) {
            ((k9) it.next()).i(videoView.getCurrentVideoUrl(), i10);
        }
    }

    public static void B(VideoView videoView, int i10) {
        Iterator it = videoView.K.iterator();
        while (it.hasNext()) {
            ((k9) it.next()).k(i10, videoView.getCurrentVideoUrl());
        }
    }

    public static boolean C(VideoView videoView) {
        String nextVideoUrl;
        int i10 = videoView.Q + 1;
        if (videoView.R.get(i10) && (nextVideoUrl = videoView.getNextVideoUrl()) != null) {
            videoView.O = nextVideoUrl;
            videoView.B = videoView.r(videoView.getNextPlayerAgent());
            if (!TextUtils.equals(nextVideoUrl, videoView.A.f32079d)) {
                w7 w7Var = videoView.A;
                w7Var.getClass();
                w7.k(new o8(w7Var, nextVideoUrl));
            }
            if (videoView.f23351e0) {
                videoView.A.x();
            } else {
                videoView.A.y();
            }
            w7 w7Var2 = videoView.A;
            w7Var2.getClass();
            w7.k(new i8(w7Var2));
            videoView.Q = i10;
            n7.f("VideoView", "switch to next player [%d] and play", Integer.valueOf(i10));
            return true;
        }
        n7.f("VideoView", "no next player to switch, current: %d", Integer.valueOf(videoView.Q));
        return false;
    }

    private String getCurrentVideoUrl() {
        if (this.Q < getVideoFileUrlArrayLength()) {
            return this.P[this.Q];
        }
        return null;
    }

    private w7 getNextPlayerAgent() {
        if (this.B == null) {
            w7 w7Var = new w7(getContext());
            this.B = w7Var;
            w7Var.B();
        }
        return this.B;
    }

    private String getNextVideoUrl() {
        int i10 = this.Q + 1;
        if (i10 < getVideoFileUrlArrayLength()) {
            return this.P[i10];
        }
        return null;
    }

    private int getVideoFileUrlArrayLength() {
        String[] strArr = this.P;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    public static void s(VideoView videoView, int i10) {
        Iterator it = videoView.K.iterator();
        while (it.hasNext()) {
            ((k9) it.next()).l(videoView.getCurrentVideoUrl(), i10);
        }
    }

    public static void t(VideoView videoView, int i10, int i11) {
        Iterator it = videoView.K.iterator();
        while (it.hasNext()) {
            ((k9) it.next()).a(videoView.getCurrentVideoUrl(), i11);
        }
    }

    public static void u(VideoView videoView, int i10, int i11, int i12) {
        Iterator it = videoView.K.iterator();
        while (it.hasNext()) {
            ((k9) it.next()).f(i10, videoView.getCurrentVideoUrl(), i11, i12);
        }
    }

    public static void y(VideoView videoView) {
        String nextVideoUrl = videoView.getNextVideoUrl();
        if (nextVideoUrl != null) {
            int i10 = videoView.Q + 1;
            SparseBooleanArray sparseBooleanArray = videoView.R;
            if (!sparseBooleanArray.get(i10)) {
                n7.f("VideoView", "prepare to set next player[%d]", Integer.valueOf(i10));
                w7 nextPlayerAgent = videoView.getNextPlayerAgent();
                nextPlayerAgent.getClass();
                w7.k(new o8(nextPlayerAgent, nextVideoUrl));
                nextPlayerAgent.m();
                sparseBooleanArray.put(i10, true);
                return;
            }
            n7.f("VideoView", "player for url %d is already set", Integer.valueOf(i10));
            return;
        }
        n7.f("VideoView", "no next video url need to prepare, current: %d", Integer.valueOf(videoView.Q));
    }

    public static void z(VideoView videoView, int i10) {
        Iterator it = videoView.K.iterator();
        while (it.hasNext()) {
            ((k9) it.next()).b(videoView.getCurrentVideoUrl(), i10);
        }
    }

    public final boolean D() {
        w7 w7Var = this.A;
        r8.b bVar = r8.b.END;
        r8 r8Var = w7Var.f32087m;
        if (r8Var.b(bVar)) {
            return false;
        }
        Boolean valueOf = Boolean.valueOf(r8Var.b(r8.b.PLAYING));
        int i10 = c5.e.f3284t;
        return ((Boolean) c5.e.b(w7Var.O, valueOf, 300L, TimeUnit.MILLISECONDS)).booleanValue();
    }

    public final void E() {
        n7.e("VideoView", "mute");
        this.A.x();
    }

    public final void b() {
        n7.e("VideoView", "stop standalone " + this.L);
        this.y = false;
        if (this.L) {
            w7 w7Var = this.A;
            w7Var.getClass();
            w7.k(new m8(w7Var, true));
            return;
        }
        s8 s8Var = this.C;
        String str = this.O;
        w7 w7Var2 = this.A;
        s8Var.getClass();
        if (!TextUtils.isEmpty(str) && w7Var2 != null) {
            synchronized (s8Var.f31812a) {
                if (n7.d()) {
                    n7.c("s8", "stop - url: %s player: %s", y1.j(str), w7Var2);
                }
                if (w7Var2 == s8Var.f31813b) {
                    n7.e("s8", "stop current");
                    s8Var.f31813b = null;
                    w7.k(new g8(w7Var2, str));
                } else {
                    n7.e("s8", "stop - remove from queue");
                    s8Var.f31814c.remove(new s8.c(w7Var2, str));
                    s8Var.a(w7Var2);
                }
            }
        }
    }

    public final void c() {
        n7.e("VideoView", "pause standalone " + this.L);
        this.y = false;
        if (this.L) {
            this.A.q();
            return;
        }
        s8 s8Var = this.C;
        String str = this.O;
        w7 w7Var = this.A;
        s8Var.getClass();
        if (!TextUtils.isEmpty(str) && w7Var != null) {
            synchronized (s8Var.f31812a) {
                if (n7.d()) {
                    n7.c("s8", "pause - url: %s player: %s", y1.j(str), w7Var);
                }
                if (w7Var == s8Var.f31813b) {
                    n7.e("s8", "pause current");
                    w7.k(new n8(w7Var, str));
                } else {
                    n7.e("s8", "pause - remove from queue");
                    s8Var.f31814c.remove(new s8.c(w7Var, str));
                    s8Var.a(w7Var);
                }
            }
        }
    }

    public final void f() {
        n7.e("VideoView", "unmute");
        this.A.y();
    }

    public int getCurrentPosition() {
        return this.A.r();
    }

    public r8 getCurrentState() {
        return this.A.f32087m;
    }

    public w7 getMediaPlayerAgent() {
        return this.A;
    }

    public Bitmap getSurfaceBitmap() {
        return this.f23364x.getBitmap();
    }

    public final void l() {
        if (!this.L) {
            s8 s8Var = this.C;
            w7 w7Var = this.A;
            if (w7Var == null) {
                s8Var.getClass();
            } else {
                synchronized (s8Var.f31812a) {
                    w7 w7Var2 = s8Var.f31813b;
                    if (w7Var == w7Var2) {
                        s8Var.a(w7Var2);
                        s8Var.f31813b = null;
                    }
                    Iterator it = s8Var.f31814c.iterator();
                    while (it.hasNext()) {
                        w7 w7Var3 = ((s8.c) it.next()).f31820b;
                        if (w7Var3 == w7Var) {
                            s8Var.a(w7Var3);
                            it.remove();
                        }
                    }
                }
            }
        }
        this.A.z();
        w7 w7Var4 = this.B;
        if (w7Var4 != null) {
            w7Var4.z();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            n7.i("VideoView", "hardware acceleration is off");
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        m6 a10 = m6.a(getContext());
        a10.getClass();
        h hVar = this.f23363q0;
        if (hVar != null) {
            d2.a(new k6(a10, hVar, intentFilter));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDetachedFromWindow() {
        /*
            r3 = this;
            super.onDetachedFromWindow()
            android.content.Context r0 = r3.getContext()     // Catch: java.lang.Exception -> L1c java.lang.IllegalStateException -> L21
            ka.m6 r0 = ka.m6.a(r0)     // Catch: java.lang.Exception -> L1c java.lang.IllegalStateException -> L21
            com.huawei.openalliance.ad.ppskit.views.VideoView$h r1 = r3.f23363q0     // Catch: java.lang.Exception -> L1c java.lang.IllegalStateException -> L21
            r0.getClass()     // Catch: java.lang.Exception -> L1c java.lang.IllegalStateException -> L21
            if (r1 != 0) goto L13
            goto L28
        L13:
            ka.l6 r2 = new ka.l6     // Catch: java.lang.Exception -> L1c java.lang.IllegalStateException -> L21
            r2.<init>(r0, r1)     // Catch: java.lang.Exception -> L1c java.lang.IllegalStateException -> L21
            com.huawei.openalliance.ad.ppskit.utils.d2.a(r2)     // Catch: java.lang.Exception -> L1c java.lang.IllegalStateException -> L21
            goto L28
        L1c:
            java.lang.String r0 = "VideoView"
            java.lang.String r1 = "unregisterReceiver Exception"
            goto L25
        L21:
            java.lang.String r0 = "VideoView"
            java.lang.String r1 = "unregisterReceiver IllegalArgumentException"
        L25:
            ka.n7.g(r0, r1)
        L28:
            java.lang.String r0 = "VideoView"
            java.lang.String r1 = "resetVideoView"
            ka.n7.e(r0, r1)
            ka.w7 r0 = r3.A
            byte[] r1 = r0.f32089p
            monitor-enter(r1)
            int r0 = r0.f32077b     // Catch: java.lang.Throwable -> L77
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L77
            r1 = 1
            r2 = 0
            if (r0 > r1) goto L4d
            ka.w7 r0 = r3.A
            r0.i(r2)
            ka.w7 r0 = r3.A
            r0.getClass()
            ka.h8 r1 = new ka.h8
            r1.<init>(r0)
            ka.w7.k(r1)
        L4d:
            ka.w7 r0 = r3.B
            if (r0 == 0) goto L61
            r0.i(r2)
            ka.w7 r0 = r3.B
            r0.getClass()
            ka.h8 r1 = new ka.h8
            r1.<init>(r0)
            ka.w7.k(r1)
        L61:
            android.view.Surface r0 = r3.T
            if (r0 == 0) goto L6a
            r0.release()
            r3.T = r2
        L6a:
            android.graphics.SurfaceTexture r0 = r3.U
            if (r0 == 0) goto L71
            r0.release()
        L71:
            r3.U = r2
            r0 = 0
            r3.y = r0
            return
        L77:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L77
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.VideoView.onDetachedFromWindow():void");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        n7.f("VideoView", "onSurfaceTextureAvailable width: %d height: %d", Integer.valueOf(i10), Integer.valueOf(i11));
        this.f23365z = true;
        Surface surface = this.T;
        if (surface == null || this.U != surfaceTexture) {
            if (surface != null) {
                n7.e("VideoView", "release old surface when onSurfaceTextureAvailable");
                this.T.release();
            }
            if (this.U != null) {
                n7.e("VideoView", "release old SurfaceTexture when onSurfaceTextureAvailable");
                this.U.release();
            }
            Surface surface2 = new Surface(surfaceTexture);
            this.T = surface2;
            this.A.i(surface2);
            this.U = surfaceTexture;
        }
        if (this.f23353g0 == null) {
            q qVar = new q(this.f23356j0);
            this.f23353g0 = qVar;
            w7 w7Var = this.A;
            w7Var.getClass();
            w7.k(new x7(w7Var, qVar));
        }
        if (this.y) {
            x(this.V);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        n7.e("VideoView", "onSurfaceTextureDestroyed");
        this.f23365z = false;
        if (this.f23350d0) {
            c();
        }
        p pVar = this.S;
        if (pVar != null) {
            com.huawei.openalliance.ad.ppskit.linked.view.d dVar = (com.huawei.openalliance.ad.ppskit.linked.view.d) pVar;
            dVar.e();
            dVar.L = true;
        }
        if (this.T != null) {
            n7.e("VideoView", "release old surface when onSurfaceTextureDestroyed");
            this.T.release();
            this.T = null;
        }
        if (this.U != null) {
            n7.e("VideoView", "release old surfaceTexture when onSurfaceTextureDestroyed");
            this.U.release();
            this.U = null;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (n7.d()) {
            n7.c("VideoView", "onSurfaceTextureSizeChanged width: %d height: %d", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        d2.a(new g());
    }

    public final w7 r(w7 w7Var) {
        if (w7Var == null) {
            n7.g("VideoView", "no agent to switch");
            return null;
        }
        w7 w7Var2 = this.A;
        k kVar = this.f23362p0;
        m mVar = this.f23361o0;
        j jVar = this.f23360n0;
        o oVar = this.f23359m0;
        i iVar = this.f23358l0;
        l lVar = this.f23357k0;
        if (w7Var2 != null) {
            if (lVar != null) {
                w7Var2.C.remove(lVar);
            }
            if (iVar != null) {
                w7Var2.D.remove(iVar);
            }
            if (oVar != null) {
                w7Var2.H.remove(oVar);
            }
            if (jVar != null) {
                w7Var2.E.remove(jVar);
            }
            if (mVar != null) {
                w7Var2.F.remove(mVar);
            }
            if (kVar != null) {
                w7Var2.G.remove(kVar);
            }
            w7Var2.i(null);
        }
        if (lVar != null) {
            w7Var.C.add(lVar);
        }
        if (iVar != null) {
            w7Var.D.add(iVar);
        }
        if (oVar != null) {
            w7Var.H.add(oVar);
        }
        if (jVar != null) {
            w7Var.E.add(jVar);
        }
        if (mVar != null) {
            w7Var.F.add(mVar);
        }
        if (kVar != null) {
            w7Var.G.add(kVar);
        }
        w7Var.A = this.f23352f0;
        Surface surface = this.T;
        if (surface != null) {
            w7Var.i(surface);
        }
        this.A = w7Var;
        return w7Var2;
    }

    public void setAudioFocusType(int i10) {
        this.A.f32096w = i10;
    }

    public void setAutoScaleResizeLayoutOnVideoSizeChange(boolean z10) {
        this.f23349c0 = z10;
    }

    public void setCacheType(String str) {
        n7.f("VideoView", "setsetCacheType %s", str);
        this.A.f32085k = str;
    }

    public void setDefaultDuration(int i10) {
        w7 w7Var = this.A;
        synchronized (w7Var.o) {
            w7Var.f32084j = i10;
        }
    }

    public void setMediaPlayerAgent(w7 w7Var) {
        if (w7Var == null) {
            return;
        }
        w7Var.B();
        w7 r10 = r(w7Var);
        if (r10 != null) {
            r10.z();
        }
    }

    public void setMuteOnlyOnLostAudioFocus(boolean z10) {
        this.f23352f0 = z10;
        this.A.A = z10;
    }

    public void setNeedPauseOnSurfaceDestory(boolean z10) {
        this.f23350d0 = z10;
    }

    public void setPreferStartPlayTime(int i10) {
        this.A.f32086l = i10;
    }

    public void setScreenOnWhilePlaying(boolean z10) {
        boolean z11;
        this.N = z10;
        if (z10 && getCurrentState().b(r8.b.PLAYING)) {
            z11 = true;
        } else {
            z11 = false;
        }
        setKeepScreenOn(z11);
    }

    public void setStandalone(boolean z10) {
        this.L = z10;
    }

    public void setSurfaceListener(p pVar) {
        this.S = pVar;
    }

    public void setVideoFileUrl(String str) {
        setVideoFileUrls(new String[]{str});
    }

    public void setVideoFileUrls(String[] strArr) {
        String[] strArr2;
        if (strArr != null) {
            strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        } else {
            strArr2 = null;
        }
        this.P = strArr2;
        this.Q = 0;
        this.R.clear();
        if (strArr2 != null && strArr2.length > 0) {
            n7.f("VideoView", "setVideoFileUrls - size: %d", Integer.valueOf(strArr2.length));
            String str = strArr2[this.Q];
            this.O = str;
            w7 w7Var = this.A;
            w7Var.getClass();
            w7.k(new o8(w7Var, str));
            return;
        }
        this.O = null;
        n7.g("VideoView", "setVideoFileUrls - url array is empty");
    }

    public void setVideoScaleMode(int i10) {
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(a3.l.i("Not supported video scale mode: ", i10));
        }
        this.W = i10;
    }

    public void setVolume(float f10) {
        n7.e("VideoView", NativeAdvancedJsUtils.f6918h);
        w7 w7Var = this.A;
        w7Var.getClass();
        w7.k(new v7(w7Var, f10));
    }

    public final void v(f9 f9Var) {
        if (f9Var == null) {
            return;
        }
        this.I.add(f9Var);
    }

    public final void w(i9 i9Var) {
        if (i9Var == null) {
            return;
        }
        this.H.add(i9Var);
    }

    public final void x(boolean z10) {
        String str;
        String str2;
        if (this.M) {
            n7.g("VideoView", "play action is not performed - view paused");
            return;
        }
        n7.f("VideoView", "play auto: %s surfaceAvailable: %s standalone: %s url: %s", Boolean.valueOf(z10), Boolean.valueOf(this.f23365z), Boolean.valueOf(this.L), y1.j(this.O));
        if (this.f23365z) {
            Surface surface = this.T;
            if (surface != null) {
                this.A.i(surface);
            }
            if (this.L) {
                w7 w7Var = this.A;
                w7Var.getClass();
                w7.k(new i8(w7Var));
                return;
            }
            if (z10) {
                s8 s8Var = this.C;
                String str3 = this.O;
                w7 w7Var2 = this.A;
                s8Var.getClass();
                if (!TextUtils.isEmpty(str3) && w7Var2 != null) {
                    synchronized (s8Var.f31812a) {
                        if (n7.d()) {
                            n7.c("s8", "autoPlay - url: %s player: %s", y1.j(str3), w7Var2);
                        }
                        w7 w7Var3 = s8Var.f31813b;
                        if (w7Var2 != w7Var3 && w7Var3 != null) {
                            s8.c cVar = new s8.c(w7Var2, str3);
                            s8Var.f31814c.remove(cVar);
                            s8Var.f31814c.add(cVar);
                            str = "s8";
                            str2 = "autoPlay - add to queue";
                            n7.e(str, str2);
                        }
                        s8.a aVar = s8Var.f31816e;
                        if (aVar != null) {
                            w7Var2.C.add(aVar);
                        }
                        s8.b bVar = s8Var.f;
                        if (bVar != null) {
                            w7Var2.E.add(bVar);
                        }
                        w7.k(new j8(w7Var2, str3));
                        s8Var.f31813b = w7Var2;
                        str = "s8";
                        str2 = "autoPlay - play directly";
                        n7.e(str, str2);
                    }
                    return;
                }
                return;
            }
            s8 s8Var2 = this.C;
            String str4 = this.O;
            w7 w7Var4 = this.A;
            s8Var2.getClass();
            if (!TextUtils.isEmpty(str4) && w7Var4 != null) {
                synchronized (s8Var2.f31812a) {
                    if (n7.d()) {
                        n7.c("s8", "manualPlay - url: %s player: %s", y1.j(str4), w7Var4);
                    }
                    w7 w7Var5 = s8Var2.f31813b;
                    if (w7Var5 != null && w7Var4 != w7Var5) {
                        w7.k(new m8(w7Var5, true));
                        n7.e("s8", "manualPlay - stop other");
                    }
                    n7.e("s8", "manualPlay - play new");
                    s8.a aVar2 = s8Var2.f31816e;
                    if (aVar2 != null) {
                        w7Var4.C.add(aVar2);
                    }
                    s8.b bVar2 = s8Var2.f;
                    if (bVar2 != null) {
                        w7Var4.E.add(bVar2);
                    }
                    w7.k(new j8(w7Var4, str4));
                    s8Var2.f31813b = w7Var4;
                    s8Var2.f31814c.remove(new s8.c(w7Var4, str4));
                }
                return;
            }
            return;
        }
        this.y = true;
        this.V = z10;
    }

    /* loaded from: classes2.dex */
    public class b implements e9 {
        public b() {
        }

        @Override // ka.e9
        public final void a() {
            Iterator it = VideoView.this.F.iterator();
            while (it.hasNext()) {
                ((e9) it.next()).a();
            }
        }

        @Override // ka.e9
        public final void b() {
            Iterator it = VideoView.this.F.iterator();
            while (it.hasNext()) {
                ((e9) it.next()).b();
            }
        }

        @Override // ka.e9
        public final void a(int i10) {
            Iterator it = VideoView.this.F.iterator();
            while (it.hasNext()) {
                ((e9) it.next()).a(i10);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
