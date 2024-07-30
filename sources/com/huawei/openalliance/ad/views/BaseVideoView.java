package com.huawei.openalliance.ad.views;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.TextureView;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.fg;
import com.huawei.hms.ads.fh;
import com.huawei.hms.ads.fi;
import com.huawei.hms.ads.fj;
import com.huawei.hms.ads.fk;
import com.huawei.hms.ads.fl;
import com.huawei.hms.ads.fm;
import com.huawei.hms.ads.fn;
import com.huawei.hms.ads.gl;
import com.huawei.hms.ads.km;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.media.IMultiMediaPlayingManager;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public abstract class BaseVideoView extends AutoScaleSizeRelativeLayout implements TextureView.SurfaceTextureListener, km {
    public static final /* synthetic */ int U0 = 0;
    public Surface A0;
    public SurfaceTexture B0;
    public boolean C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public p I0;
    public final n J0;
    public int K0;
    public int L0;
    public String M0;
    public final q N0;
    public final l O0;
    public final i P0;
    public final j Q0;
    public final m R0;
    public final k S0;
    public final h T0;

    /* renamed from: c0, reason: collision with root package name */
    public TextureView f23662c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f23663d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f23664e0;

    /* renamed from: f0, reason: collision with root package name */
    public ia.a f23665f0;

    /* renamed from: g0, reason: collision with root package name */
    public ia.a f23666g0;

    /* renamed from: h0, reason: collision with root package name */
    public IMultiMediaPlayingManager f23667h0;

    /* renamed from: i0, reason: collision with root package name */
    public final CopyOnWriteArraySet f23668i0;

    /* renamed from: j0, reason: collision with root package name */
    public final CopyOnWriteArraySet f23669j0;

    /* renamed from: k0, reason: collision with root package name */
    public final CopyOnWriteArraySet f23670k0;

    /* renamed from: l0, reason: collision with root package name */
    public final CopyOnWriteArraySet f23671l0;

    /* renamed from: m0, reason: collision with root package name */
    public final CopyOnWriteArraySet f23672m0;

    /* renamed from: n0, reason: collision with root package name */
    public final CopyOnWriteArraySet f23673n0;

    /* renamed from: o0, reason: collision with root package name */
    public final CopyOnWriteArraySet f23674o0;

    /* renamed from: p0, reason: collision with root package name */
    public final CopyOnWriteArraySet f23675p0;

    /* renamed from: q0, reason: collision with root package name */
    public final CopyOnWriteArraySet f23676q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f23677r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f23678s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f23679t0;

    /* renamed from: u0, reason: collision with root package name */
    public String f23680u0;

    /* renamed from: v0, reason: collision with root package name */
    public String[] f23681v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f23682w0;

    /* renamed from: x0, reason: collision with root package name */
    public final SparseBooleanArray f23683x0;
    public int y;
    public o y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f23684z0;

    /* loaded from: classes2.dex */
    public class a implements fm {
        public a() {
        }

        @Override // com.huawei.hms.ads.fm
        public final void Code() {
            Iterator it = BaseVideoView.this.f23676q0.iterator();
            while (it.hasNext()) {
                ((fm) it.next()).Code();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements fh {
        public d() {
        }

        @Override // com.huawei.hms.ads.fh
        public final void Code(ia.a aVar, int i10, int i11, int i12) {
            BaseVideoView baseVideoView = BaseVideoView.this;
            if (baseVideoView.f23679t0) {
                baseVideoView.setKeepScreenOn(false);
            }
            BaseVideoView.g(baseVideoView, i10, i11, i12);
            Iterator it = baseVideoView.f23672m0.iterator();
            while (it.hasNext()) {
                ((fh) it.next()).Code(aVar, i10, i11, i12);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements fl {
        public e() {
        }

        @Override // com.huawei.hms.ads.fl
        public final void Code() {
            BaseVideoView baseVideoView = BaseVideoView.this;
            baseVideoView.G0 = true;
            Iterator it = baseVideoView.f23671l0.iterator();
            while (it.hasNext()) {
                ((fl) it.next()).Code();
            }
        }

        @Override // com.huawei.hms.ads.fl
        public final void V() {
            BaseVideoView baseVideoView = BaseVideoView.this;
            baseVideoView.G0 = false;
            Iterator it = baseVideoView.f23671l0.iterator();
            while (it.hasNext()) {
                ((fl) it.next()).V();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f implements fi {
        public f() {
        }

        @Override // com.huawei.hms.ads.fi
        public final void Code(int i10) {
            Iterator it = BaseVideoView.this.f23673n0.iterator();
            while (it.hasNext()) {
                ((fi) it.next()).Code(i10);
            }
        }

        @Override // com.huawei.hms.ads.fi
        public final void V(int i10) {
            Iterator it = BaseVideoView.this.f23673n0.iterator();
            while (it.hasNext()) {
                ((fi) it.next()).V(i10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseVideoView baseVideoView = BaseVideoView.this;
            baseVideoView.N0.a(baseVideoView.K0, baseVideoView.L0);
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
                BaseVideoView baseVideoView = BaseVideoView.this;
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    boolean s10 = a0.a.s(context);
                    int i10 = BaseVideoView.U0;
                    baseVideoView.getClass();
                    if (ex.Code()) {
                        ex.Code("BaseVideoView", "notifyNetworkConnectedOrChanged wifi: %s", Boolean.valueOf(s10));
                    }
                    Iterator it = baseVideoView.f23668i0.iterator();
                    while (it.hasNext()) {
                        ((v) it.next()).Code(s10);
                    }
                    return;
                }
                int i11 = BaseVideoView.U0;
                baseVideoView.getClass();
                if (ex.Code()) {
                    ex.Code("BaseVideoView", "notifyNetworkDisconnected");
                }
                Iterator it2 = baseVideoView.f23668i0.iterator();
                while (it2.hasNext()) {
                    ((v) it2.next()).Z();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class i implements fg {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<fg> f23693a;

        public i(c cVar) {
            this.f23693a = new WeakReference<>(cVar);
        }

        @Override // com.huawei.hms.ads.fg
        public final void Code() {
            fg fgVar = this.f23693a.get();
            if (fgVar != null) {
                fgVar.Code();
            }
        }

        @Override // com.huawei.hms.ads.fg
        public final void V() {
            fg fgVar = this.f23693a.get();
            if (fgVar != null) {
                fgVar.V();
            }
        }

        @Override // com.huawei.hms.ads.fg
        public final void Code(int i10) {
            fg fgVar = this.f23693a.get();
            if (fgVar != null) {
                fgVar.Code(i10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class j implements fh {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<fh> f23694a;

        public j(d dVar) {
            this.f23694a = new WeakReference<>(dVar);
        }

        @Override // com.huawei.hms.ads.fh
        public final void Code(ia.a aVar, int i10, int i11, int i12) {
            fh fhVar = this.f23694a.get();
            if (fhVar != null) {
                fhVar.Code(aVar, i10, i11, i12);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class k implements fi {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<fi> f23695a;

        public k(f fVar) {
            this.f23695a = new WeakReference<>(fVar);
        }

        @Override // com.huawei.hms.ads.fi
        public final void Code(int i10) {
            fi fiVar = this.f23695a.get();
            if (fiVar != null) {
                fiVar.Code(i10);
            }
        }

        @Override // com.huawei.hms.ads.fi
        public final void V(int i10) {
            fi fiVar = this.f23695a.get();
            if (fiVar != null) {
                fiVar.V(i10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class l implements fk {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<fk> f23696a;

        public l(b bVar) {
            this.f23696a = new WeakReference<>(bVar);
        }

        @Override // com.huawei.hms.ads.fk
        public final void Code(int i10, int i11) {
            fk fkVar = this.f23696a.get();
            if (fkVar != null) {
                fkVar.Code(i10, i11);
            }
        }

        @Override // com.huawei.hms.ads.fk
        public final void I(ia.a aVar, int i10) {
            int i11 = BaseVideoView.U0;
            ex.Code("BaseVideoView", "onMediaStop %s", Integer.valueOf(i10));
            fk fkVar = this.f23696a.get();
            if (fkVar != null) {
                fkVar.I(aVar, i10);
            }
        }

        @Override // com.huawei.hms.ads.fk
        public final void V(ia.a aVar, int i10) {
            int i11 = BaseVideoView.U0;
            ex.Code("BaseVideoView", "onMediaPause %s", Integer.valueOf(i10));
            fk fkVar = this.f23696a.get();
            if (fkVar != null) {
                fkVar.V(aVar, i10);
            }
        }

        @Override // com.huawei.hms.ads.fk
        public final void Z(ia.a aVar, int i10) {
            int i11 = BaseVideoView.U0;
            ex.Code("BaseVideoView", "onMediaCompletion %s", Integer.valueOf(i10));
            fk fkVar = this.f23696a.get();
            if (fkVar != null) {
                fkVar.Z(aVar, i10);
            }
        }

        @Override // com.huawei.hms.ads.fk
        public final void Code(ia.a aVar, int i10) {
            int i11 = BaseVideoView.U0;
            ex.Code("BaseVideoView", "onMediaStart %s", Integer.valueOf(i10));
            fk fkVar = this.f23696a.get();
            if (fkVar != null) {
                fkVar.Code(aVar, i10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class m implements fl {

        /* renamed from: s, reason: collision with root package name */
        public final WeakReference<fl> f23697s;

        public m(e eVar) {
            this.f23697s = new WeakReference<>(eVar);
        }

        @Override // com.huawei.hms.ads.fl
        public final void Code() {
            fl flVar = this.f23697s.get();
            if (flVar != null) {
                flVar.Code();
            }
        }

        @Override // com.huawei.hms.ads.fl
        public final void V() {
            fl flVar = this.f23697s.get();
            if (flVar != null) {
                flVar.V();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class n implements fm {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<fm> f23698a;

        public n(a aVar) {
            this.f23698a = new WeakReference<>(aVar);
        }

        @Override // com.huawei.hms.ads.fm
        public final void Code() {
            fm fmVar = this.f23698a.get();
            if (fmVar != null) {
                fmVar.Code();
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface o {
    }

    /* loaded from: classes2.dex */
    public static class p implements MediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<MediaPlayer.OnVideoSizeChangedListener> f23699a;

        public p(q qVar) {
            this.f23699a = new WeakReference<>(qVar);
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener = this.f23699a.get();
            if (onVideoSizeChangedListener != null) {
                onVideoSizeChangedListener.onVideoSizeChanged(mediaPlayer, i10, i11);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class q implements MediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a, reason: collision with root package name */
        public float f23700a = gl.Code;

        /* renamed from: b, reason: collision with root package name */
        public float f23701b = gl.Code;

        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ int f23703s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ int f23704t;

            public a(int i10, int i11) {
                this.f23703s = i10;
                this.f23704t = i11;
            }

            @Override // java.lang.Runnable
            public final void run() {
                q.this.a(this.f23703s, this.f23704t);
            }
        }

        public q() {
        }

        public final void a(int i10, int i11) {
            int i12 = BaseVideoView.U0;
            ex.V("BaseVideoView", "video size changed - w: %d h: %d", Integer.valueOf(i10), Integer.valueOf(i11));
            if (i10 != 0 && i11 != 0) {
                BaseVideoView baseVideoView = BaseVideoView.this;
                baseVideoView.K0 = i10;
                baseVideoView.L0 = i11;
                float f = (i10 * 1.0f) / i11;
                float abs = Math.abs(f - this.f23700a);
                if (ex.Code()) {
                    ex.Code("BaseVideoView", "video ratio: %f oldRatio: %f diff: %f", Float.valueOf(f), Float.valueOf(this.f23700a), Float.valueOf(abs));
                }
                this.f23700a = f;
                if (baseVideoView.E0) {
                    if (abs > 0.01f) {
                        baseVideoView.setRatio(Float.valueOf(f));
                        baseVideoView.requestLayout();
                        return;
                    }
                    return;
                }
                int width = baseVideoView.getWidth();
                int height = baseVideoView.getHeight();
                ex.V("BaseVideoView", "resizeVideo view width: %d height: %d", Integer.valueOf(width), Integer.valueOf(height));
                if (height != 0 && width != 0) {
                    float f10 = (width * 1.0f) / height;
                    float abs2 = Math.abs(f10 - this.f23701b);
                    if (ex.Code()) {
                        ex.Code("BaseVideoView", "view ratio: %f oldRatio: %f diff: %f", Float.valueOf(f10), Float.valueOf(this.f23701b), Float.valueOf(abs2));
                    }
                    this.f23701b = f10;
                    if (abs2 > 0.01f) {
                        baseVideoView.c(f, f10, width, height);
                    }
                }
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            gb.w.b(new a(i10, i11));
        }
    }

    public BaseVideoView(Context context) {
        super(context);
        ia.c cVar;
        a aVar = new a();
        this.y = 0;
        this.f23668i0 = new CopyOnWriteArraySet();
        this.f23669j0 = new CopyOnWriteArraySet();
        this.f23670k0 = new CopyOnWriteArraySet();
        this.f23671l0 = new CopyOnWriteArraySet();
        this.f23672m0 = new CopyOnWriteArraySet();
        this.f23673n0 = new CopyOnWriteArraySet();
        this.f23674o0 = new CopyOnWriteArraySet();
        this.f23675p0 = new CopyOnWriteArraySet();
        this.f23676q0 = new CopyOnWriteArraySet();
        this.f23677r0 = true;
        this.f23678s0 = false;
        this.f23679t0 = false;
        this.f23683x0 = new SparseBooleanArray(3);
        this.f23684z0 = false;
        this.D0 = 1;
        this.E0 = true;
        this.F0 = true;
        this.G0 = false;
        this.J0 = new n(aVar);
        this.N0 = new q();
        b bVar = new b();
        c cVar2 = new c();
        d dVar = new d();
        e eVar = new e();
        f fVar = new f();
        this.O0 = new l(bVar);
        this.P0 = new i(cVar2);
        this.Q0 = new j(dVar);
        this.R0 = new m(eVar);
        this.S0 = new k(fVar);
        this.T0 = new h();
        setBackgroundColor(-16777216);
        Code(context);
        HiAd c10 = HiAd.c(context);
        IMultiMediaPlayingManager iMultiMediaPlayingManager = c10.f22220d;
        if (iMultiMediaPlayingManager == null) {
            Context context2 = c10.f22217a;
            synchronized (ia.c.f29445h) {
                if (ia.c.f29444g == null) {
                    ia.c.f29444g = new ia.c(context2);
                }
                cVar = ia.c.f29444g;
            }
            iMultiMediaPlayingManager = cVar;
        }
        this.f23667h0 = iMultiMediaPlayingManager;
        setMediaPlayerAgent(new ia.a(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code() {
        String nextVideoUrl = getNextVideoUrl();
        if (nextVideoUrl == null) {
            ex.V("BaseVideoView", "no next video url need to prepare, current: %d", Integer.valueOf(this.f23682w0));
            return;
        }
        int i10 = this.f23682w0 + 1;
        SparseBooleanArray sparseBooleanArray = this.f23683x0;
        if (sparseBooleanArray.get(i10)) {
            ex.V("BaseVideoView", "player for url %d is already set", Integer.valueOf(i10));
            return;
        }
        ex.V("BaseVideoView", "prepare to set next player[%d]", Integer.valueOf(i10));
        ia.a nextPlayerAgent = getNextPlayerAgent();
        nextPlayerAgent.Z(nextVideoUrl);
        nextPlayerAgent.I();
        sparseBooleanArray.put(i10, true);
    }

    public static boolean a(BaseVideoView baseVideoView) {
        String nextVideoUrl;
        int i10 = baseVideoView.f23682w0 + 1;
        if (baseVideoView.f23683x0.get(i10) && (nextVideoUrl = baseVideoView.getNextVideoUrl()) != null) {
            baseVideoView.f23680u0 = nextVideoUrl;
            baseVideoView.f23666g0 = baseVideoView.b(baseVideoView.getNextPlayerAgent());
            if (!TextUtils.equals(nextVideoUrl, baseVideoView.f23665f0.F())) {
                baseVideoView.f23665f0.Z(nextVideoUrl);
            }
            if (baseVideoView.G0) {
                baseVideoView.f23665f0.D();
            } else {
                baseVideoView.f23665f0.L();
            }
            baseVideoView.f23665f0.V();
            baseVideoView.f23682w0 = i10;
            ex.V("BaseVideoView", "switch to next player [%d] and play", Integer.valueOf(i10));
            return true;
        }
        ex.V("BaseVideoView", "no next player to switch, current: %d", Integer.valueOf(baseVideoView.f23682w0));
        return false;
    }

    public static void e(BaseVideoView baseVideoView, int i10) {
        Iterator it = baseVideoView.f23675p0.iterator();
        while (it.hasNext()) {
            ((fn) it.next()).Code(baseVideoView.getContentId(), baseVideoView.getCurrentVideoUrl(), i10);
        }
        Iterator it2 = baseVideoView.f23674o0.iterator();
        while (it2.hasNext()) {
            ((fn) it2.next()).Code(baseVideoView.getContentId(), baseVideoView.getCurrentVideoUrl(), i10);
        }
    }

    public static void f(BaseVideoView baseVideoView, int i10, int i11) {
        Iterator it = baseVideoView.f23675p0.iterator();
        while (it.hasNext()) {
            ((fn) it.next()).Code(baseVideoView.getContentId(), baseVideoView.getCurrentVideoUrl(), i10, i11);
        }
        Iterator it2 = baseVideoView.f23674o0.iterator();
        while (it2.hasNext()) {
            ((fn) it2.next()).Code(baseVideoView.getContentId(), baseVideoView.getCurrentVideoUrl(), i10, i11);
        }
    }

    public static void g(BaseVideoView baseVideoView, int i10, int i11, int i12) {
        Iterator it = baseVideoView.f23674o0.iterator();
        while (it.hasNext()) {
            ((fn) it.next()).Code(baseVideoView.getContentId(), baseVideoView.getCurrentVideoUrl(), i10, i11, i12);
        }
    }

    private String getCurrentVideoUrl() {
        if (this.f23682w0 < getVideoFileUrlArrayLength()) {
            return this.f23681v0[this.f23682w0];
        }
        return null;
    }

    private ia.a getNextPlayerAgent() {
        if (this.f23666g0 == null) {
            ia.a aVar = new ia.a(getContext());
            this.f23666g0 = aVar;
            aVar.c();
        }
        return this.f23666g0;
    }

    private String getNextVideoUrl() {
        int i10 = this.f23682w0 + 1;
        if (i10 < getVideoFileUrlArrayLength()) {
            return this.f23681v0[i10];
        }
        return null;
    }

    private int getVideoFileUrlArrayLength() {
        String[] strArr = this.f23681v0;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    public static void j(BaseVideoView baseVideoView, int i10) {
        Iterator it = baseVideoView.f23675p0.iterator();
        while (it.hasNext()) {
            ((fn) it.next()).I(baseVideoView.getContentId(), baseVideoView.getCurrentVideoUrl(), i10);
        }
        Iterator it2 = baseVideoView.f23674o0.iterator();
        while (it2.hasNext()) {
            ((fn) it2.next()).I(baseVideoView.getContentId(), baseVideoView.getCurrentVideoUrl(), i10);
        }
    }

    public static void k(BaseVideoView baseVideoView, int i10) {
        Iterator it = baseVideoView.f23675p0.iterator();
        while (it.hasNext()) {
            ((fn) it.next()).V(baseVideoView.getContentId(), baseVideoView.getCurrentVideoUrl(), i10);
        }
        Iterator it2 = baseVideoView.f23674o0.iterator();
        while (it2.hasNext()) {
            ((fn) it2.next()).V(baseVideoView.getContentId(), baseVideoView.getCurrentVideoUrl(), i10);
        }
    }

    public static void l(BaseVideoView baseVideoView, int i10) {
        Iterator it = baseVideoView.f23675p0.iterator();
        while (it.hasNext()) {
            ((fn) it.next()).Z(baseVideoView.getContentId(), baseVideoView.getCurrentVideoUrl(), i10);
        }
        Iterator it2 = baseVideoView.f23674o0.iterator();
        while (it2.hasNext()) {
            ((fn) it2.next()).Z(baseVideoView.getContentId(), baseVideoView.getCurrentVideoUrl(), i10);
        }
    }

    public final void D() {
        ex.V("BaseVideoView", "stop standalone " + this.f23677r0);
        this.f23663d0 = false;
        if (this.f23677r0) {
            this.f23665f0.Code();
            return;
        }
        this.f23667h0.f(this.f23665f0, this.f23680u0);
    }

    public final void L() {
        ex.V("BaseVideoView", "pause standalone " + this.f23677r0);
        this.f23663d0 = false;
        if (this.f23677r0) {
            this.f23665f0.Z();
            return;
        }
        this.f23667h0.e(this.f23665f0, this.f23680u0);
    }

    @Override // com.huawei.openalliance.ad.views.AutoScaleSizeRelativeLayout
    public final boolean Z() {
        return this.f23684z0;
    }

    public final ia.a b(ia.a aVar) {
        if (aVar == null) {
            ex.I("BaseVideoView", "no agent to switch");
            return null;
        }
        ia.a aVar2 = this.f23665f0;
        k kVar = this.S0;
        n nVar = this.J0;
        m mVar = this.R0;
        j jVar = this.Q0;
        i iVar = this.P0;
        l lVar = this.O0;
        if (aVar2 != null) {
            aVar2.V(lVar);
            aVar2.V(iVar);
            aVar2.V(jVar);
            aVar2.V(mVar);
            aVar2.I(nVar);
            aVar2.V(kVar);
            aVar2.Code((Surface) null);
        }
        aVar.Code(lVar);
        aVar.Code(iVar);
        aVar.Code(jVar);
        aVar.Code(mVar);
        aVar.V(nVar);
        aVar.Code(kVar);
        aVar.Code(this.H0);
        aVar.Z(this.y);
        Surface surface = this.A0;
        if (surface != null) {
            aVar.Code(surface);
        }
        this.f23665f0 = aVar;
        return aVar2;
    }

    public void c(float f10, float f11, int i10, int i11) {
        Matrix matrix;
        float f12;
        float f13 = 1.0f;
        float f14 = (i10 * 1.0f) / 2.0f;
        float f15 = (i11 * 1.0f) / 2.0f;
        int i12 = this.D0;
        if (i12 == 1) {
            ex.V("BaseVideoView", "set video scale mode as fit");
            matrix = new Matrix();
            matrix.setScale(1.0f, 1.0f, f14, f15);
        } else {
            if (i12 != 2) {
                return;
            }
            ex.V("BaseVideoView", "set video scale mode as fit with cropping");
            if (f11 < f10) {
                float f16 = f10 / f11;
                f12 = 1.0f;
                f13 = f16;
            } else {
                f12 = f11 / f10;
            }
            ex.Code("BaseVideoView", "calculateScaleMatrix scaleX: %s scaleY: %s pivotPointX: %s pivotPointY: %s", Float.valueOf(f13), Float.valueOf(f12), Float.valueOf(f14), Float.valueOf(f15));
            matrix = new Matrix();
            matrix.setScale(f13, f12, f14, f15);
        }
        this.f23662c0.setTransform(matrix);
    }

    public final void d(fh fhVar) {
        if (fhVar == null) {
            return;
        }
        this.f23672m0.add(fhVar);
    }

    public void destroyView() {
        this.f23665f0.I(this.I0);
        if (!this.f23677r0) {
            this.f23667h0.c(this.f23665f0);
        }
        this.f23665f0.a();
        ia.a aVar = this.f23666g0;
        if (aVar != null) {
            aVar.a();
        }
    }

    public String getContentId() {
        return this.M0;
    }

    public int getCurrentPosition() {
        return this.f23665f0.B();
    }

    public ia.b getCurrentState() {
        return this.f23665f0.C();
    }

    public ia.a getMediaPlayerAgent() {
        return this.f23665f0;
    }

    public ia.b getMediaState() {
        ia.a aVar = this.f23665f0;
        if (aVar == null) {
            return null;
        }
        return aVar.C();
    }

    public int getVideoHeight() {
        return this.L0;
    }

    public int getVideoWidth() {
        return this.K0;
    }

    public final void h(boolean z10) {
        if (this.f23678s0) {
            ex.I("BaseVideoView", "play action is not performed - view paused");
            return;
        }
        ex.V("BaseVideoView", "play auto: %s surfaceAvailable: %s standalone: %s url: %s", Boolean.valueOf(z10), Boolean.valueOf(this.f23664e0), Boolean.valueOf(this.f23677r0), androidx.transition.n.e(this.f23680u0));
        if (this.f23664e0) {
            Surface surface = this.A0;
            if (surface != null) {
                this.f23665f0.Code(surface);
            }
            if (this.f23677r0) {
                this.f23665f0.V();
                return;
            } else if (z10) {
                this.f23667h0.d(this.f23665f0, this.f23680u0);
                return;
            } else {
                this.f23667h0.b(this.f23665f0, this.f23680u0);
                return;
            }
        }
        this.f23663d0 = true;
        this.C0 = z10;
    }

    public final boolean o() {
        return this.f23665f0.S();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            ex.Z("BaseVideoView", "hardware acceleration is off");
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        HiAd c10 = HiAd.c(getContext());
        h hVar = this.T0;
        if (hVar == null) {
            c10.getClass();
        } else {
            c10.f22219c.put(hVar, intentFilter);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        String str;
        super.onDetachedFromWindow();
        try {
            HiAd c10 = HiAd.c(getContext());
            h hVar = this.T0;
            if (hVar == null) {
                c10.getClass();
            } else {
                c10.f22219c.remove(hVar);
            }
        } catch (IllegalStateException unused) {
            str = "unregisterReceiver IllegalArgumentException";
            ex.I("BaseVideoView", str);
        } catch (Exception unused2) {
            str = "unregisterReceiver Exception";
            ex.I("BaseVideoView", str);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (ex.Code()) {
            ex.Code("BaseVideoView", "onSurfaceTextureSizeChanged width: %d height: %d", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        gb.w.b(new g());
    }

    @Override // com.huawei.hms.ads.km
    public final void pauseView() {
        this.f23678s0 = true;
        this.f23665f0.e();
    }

    @Override // com.huawei.hms.ads.km
    public final void resumeView() {
        this.f23678s0 = false;
    }

    public void setAudioFocusType(int i10) {
        this.y = i10;
        this.f23665f0.Z(i10);
    }

    public void setAutoScaleResizeLayoutOnVideoSizeChange(boolean z10) {
        this.E0 = z10;
    }

    public void setContentId(String str) {
        this.M0 = str;
    }

    public void setDefaultDuration(int i10) {
        this.f23665f0.V(i10);
    }

    public void setMediaPlayerAgent(ia.a aVar) {
        if (aVar == null) {
            return;
        }
        aVar.c();
        ia.a b10 = b(aVar);
        if (b10 != null) {
            b10.a();
        }
    }

    public void setMediaPlayerReleaseListener(fj fjVar) {
        ia.a aVar = this.f23665f0;
        if (aVar != null) {
            aVar.Code(fjVar);
        }
    }

    public void setMuteOnlyOnLostAudioFocus(boolean z10) {
        this.H0 = z10;
        this.f23665f0.Code(z10);
    }

    public void setNeedPauseOnSurfaceDestory(boolean z10) {
        this.F0 = z10;
    }

    public void setPreferStartPlayTime(int i10) {
        this.f23665f0.I(i10);
    }

    public void setRemediate(boolean z10) {
        this.f23684z0 = z10;
    }

    public void setScreenOnWhilePlaying(boolean z10) {
        boolean z11;
        this.f23679t0 = z10;
        if (z10 && getCurrentState().b(ia.d.PLAYING)) {
            z11 = true;
        } else {
            z11 = false;
        }
        setKeepScreenOn(z11);
    }

    public void setSoundVolume(float f10) {
        this.f23665f0.Code(f10);
    }

    public void setStandalone(boolean z10) {
        this.f23677r0 = z10;
    }

    public void setSurfaceListener(o oVar) {
        this.y0 = oVar;
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
        this.f23681v0 = strArr2;
        this.f23682w0 = 0;
        this.f23683x0.clear();
        if (strArr2 != null && strArr2.length > 0) {
            ex.V("BaseVideoView", "setVideoFileUrls - size: %d", Integer.valueOf(strArr2.length));
            String str = strArr2[this.f23682w0];
            this.f23680u0 = str;
            this.f23665f0.Z(str);
            return;
        }
        this.f23680u0 = null;
        ex.I("BaseVideoView", "setVideoFileUrls - url array is empty");
    }

    public void setVideoScaleMode(int i10) {
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(a3.l.i("Not supported video scale mode: ", i10));
        }
        this.D0 = i10;
    }

    /* loaded from: classes2.dex */
    public class b implements fk {
        public b() {
        }

        @Override // com.huawei.hms.ads.fk
        public final void Code(int i10, int i11) {
            BaseVideoView baseVideoView = BaseVideoView.this;
            BaseVideoView.f(baseVideoView, i10, i11);
            Iterator it = baseVideoView.f23669j0.iterator();
            while (it.hasNext()) {
                ((fk) it.next()).Code(i10, i11);
            }
        }

        @Override // com.huawei.hms.ads.fk
        public final void I(ia.a aVar, int i10) {
            BaseVideoView baseVideoView = BaseVideoView.this;
            if (baseVideoView.f23679t0) {
                baseVideoView.setKeepScreenOn(false);
            }
            BaseVideoView.j(baseVideoView, i10);
            Iterator it = baseVideoView.f23669j0.iterator();
            while (it.hasNext()) {
                ((fk) it.next()).I(aVar, i10);
            }
        }

        @Override // com.huawei.hms.ads.fk
        public final void V(ia.a aVar, int i10) {
            BaseVideoView baseVideoView = BaseVideoView.this;
            if (baseVideoView.f23679t0) {
                baseVideoView.setKeepScreenOn(false);
            }
            BaseVideoView.k(baseVideoView, i10);
            Iterator it = baseVideoView.f23669j0.iterator();
            while (it.hasNext()) {
                ((fk) it.next()).V(aVar, i10);
            }
        }

        @Override // com.huawei.hms.ads.fk
        public final void Z(ia.a aVar, int i10) {
            BaseVideoView baseVideoView = BaseVideoView.this;
            BaseVideoView.l(baseVideoView, i10);
            if (BaseVideoView.a(baseVideoView)) {
                return;
            }
            if (baseVideoView.f23679t0) {
                baseVideoView.setKeepScreenOn(false);
            }
            Iterator it = baseVideoView.f23669j0.iterator();
            while (it.hasNext()) {
                ((fk) it.next()).Z(aVar, i10);
            }
        }

        @Override // com.huawei.hms.ads.fk
        public final void Code(ia.a aVar, int i10) {
            BaseVideoView baseVideoView = BaseVideoView.this;
            if (baseVideoView.f23679t0) {
                baseVideoView.setKeepScreenOn(true);
            }
            baseVideoView.Code();
            BaseVideoView.e(baseVideoView, i10);
            Iterator it = baseVideoView.f23669j0.iterator();
            while (it.hasNext()) {
                ((fk) it.next()).Code(aVar, i10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements fg {
        public c() {
        }

        @Override // com.huawei.hms.ads.fg
        public final void Code() {
            Iterator it = BaseVideoView.this.f23670k0.iterator();
            while (it.hasNext()) {
                ((fg) it.next()).Code();
            }
        }

        @Override // com.huawei.hms.ads.fg
        public final void V() {
            Iterator it = BaseVideoView.this.f23670k0.iterator();
            while (it.hasNext()) {
                ((fg) it.next()).V();
            }
        }

        @Override // com.huawei.hms.ads.fg
        public final void Code(int i10) {
            Iterator it = BaseVideoView.this.f23670k0.iterator();
            while (it.hasNext()) {
                ((fg) it.next()).Code(i10);
            }
        }
    }

    public void Code(Context context) {
    }

    public final void b() {
        ex.V("BaseVideoView", "mute");
        this.f23665f0.D();
    }

    public final void c() {
        ex.V("BaseVideoView", "unmute");
        this.f23665f0.L();
    }

    public BaseVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ia.c cVar;
        a aVar = new a();
        this.y = 0;
        this.f23668i0 = new CopyOnWriteArraySet();
        this.f23669j0 = new CopyOnWriteArraySet();
        this.f23670k0 = new CopyOnWriteArraySet();
        this.f23671l0 = new CopyOnWriteArraySet();
        this.f23672m0 = new CopyOnWriteArraySet();
        this.f23673n0 = new CopyOnWriteArraySet();
        this.f23674o0 = new CopyOnWriteArraySet();
        this.f23675p0 = new CopyOnWriteArraySet();
        this.f23676q0 = new CopyOnWriteArraySet();
        this.f23677r0 = true;
        this.f23678s0 = false;
        this.f23679t0 = false;
        this.f23683x0 = new SparseBooleanArray(3);
        this.f23684z0 = false;
        this.D0 = 1;
        this.E0 = true;
        this.F0 = true;
        this.G0 = false;
        this.J0 = new n(aVar);
        this.N0 = new q();
        b bVar = new b();
        c cVar2 = new c();
        d dVar = new d();
        e eVar = new e();
        f fVar = new f();
        this.O0 = new l(bVar);
        this.P0 = new i(cVar2);
        this.Q0 = new j(dVar);
        this.R0 = new m(eVar);
        this.S0 = new k(fVar);
        this.T0 = new h();
        setBackgroundColor(-16777216);
        Code(context);
        HiAd c10 = HiAd.c(context);
        IMultiMediaPlayingManager iMultiMediaPlayingManager = c10.f22220d;
        if (iMultiMediaPlayingManager == null) {
            Context context2 = c10.f22217a;
            synchronized (ia.c.f29445h) {
                if (ia.c.f29444g == null) {
                    ia.c.f29444g = new ia.c(context2);
                }
                cVar = ia.c.f29444g;
            }
            iMultiMediaPlayingManager = cVar;
        }
        this.f23667h0 = iMultiMediaPlayingManager;
        setMediaPlayerAgent(new ia.a(context));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
    }
}
