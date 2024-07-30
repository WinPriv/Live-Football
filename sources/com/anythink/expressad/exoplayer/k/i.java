package com.anythink.expressad.exoplayer.k;

import android.net.NetworkInfo;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.exoplayer.a.b;
import com.anythink.expressad.exoplayer.ae;
import com.anythink.expressad.exoplayer.h.t;
import com.anythink.expressad.exoplayer.i.e;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public final class i implements com.anythink.expressad.exoplayer.a.b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9045a = "EventLogger";

    /* renamed from: b, reason: collision with root package name */
    private static final int f9046b = 3;

    /* renamed from: c, reason: collision with root package name */
    private static final NumberFormat f9047c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.i.e f9048d;

    /* renamed from: e, reason: collision with root package name */
    private final ae.b f9049e = new ae.b();
    private final ae.a f = new ae.a();

    /* renamed from: g, reason: collision with root package name */
    private final long f9050g = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f9047c = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    private i(com.anythink.expressad.exoplayer.i.e eVar) {
        this.f9048d = eVar;
    }

    private static String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE";
    }

    private static String b(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "?" : "YES" : "NO_EXCEEDS_CAPABILITIES" : "NO_UNSUPPORTED_DRM" : "NO_UNSUPPORTED_TYPE" : "NO";
    }

    private static String c(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : "ALL" : "ONE" : "OFF";
    }

    private static String d(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "?" : "INTERNAL" : "AD_INSERTION" : "SEEK_ADJUSTMENT" : "SEEK" : "PERIOD_TRANSITION";
    }

    private static String e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : "DYNAMIC" : "RESET" : "PREPARED";
    }

    private static String f(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 >= 10000 ? a3.l.j("custom (", i10, ")") : "?" : "none" : "metadata" : o.f9070c : "video" : o.f9069b : CallMraidJS.f;
    }

    private String i(b.a aVar) {
        String str = "window=" + aVar.f7255c;
        if (aVar.f7256d != null) {
            StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str, ", period=");
            l10.append(aVar.f7256d.f8484a);
            str = l10.toString();
            if (aVar.f7256d.a()) {
                StringBuilder l11 = com.ironsource.adapters.facebook.a.l(str, ", adGroup=");
                l11.append(aVar.f7256d.f8485b);
                StringBuilder l12 = com.ironsource.adapters.facebook.a.l(l11.toString(), ", ad=");
                l12.append(aVar.f7256d.f8486c);
                str = l12.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a(aVar.f7253a - this.f9050g));
        sb2.append(", ");
        return a3.k.m(sb2, a(aVar.f), ", ", str);
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void g(b.a aVar, int i10) {
        a(aVar, "droppedFrames", Integer.toString(i10));
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void h(b.a aVar) {
        a(aVar, "drmKeysRemoved");
    }

    private static String a(int i10, int i11) {
        return i10 < 2 ? "N/A" : i11 != 0 ? i11 != 8 ? i11 != 16 ? "?" : "YES" : "YES_NOT_SEAMLESS" : "NO";
    }

    private String b(b.a aVar, String str) {
        return a3.l.p(com.ironsource.adapters.facebook.a.l(str, " ["), i(aVar), "]");
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void c() {
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void d() {
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void e(b.a aVar, int i10) {
        a(aVar, "decoderDisabled", f(i10));
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void g(b.a aVar) {
        a(aVar, "drmKeysRestored");
    }

    private static String a(boolean z10) {
        return z10 ? "[X]" : "[ ]";
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void c(b.a aVar, int i10) {
        a(aVar, "repeatMode", i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : "ALL" : "ONE" : "OFF");
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void d(b.a aVar, int i10) {
        a(aVar, "decoderEnabled", f(i10));
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void e(b.a aVar) {
        a(aVar, "mediaPeriodReadingStarted");
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void a() {
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void c(b.a aVar) {
        a(aVar, "mediaPeriodCreated");
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void d(b.a aVar) {
        a(aVar, "mediaPeriodReleased");
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void a(b.a aVar, boolean z10, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10);
        sb2.append(", ");
        sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE");
        a(aVar, "state", sb2.toString());
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void a(b.a aVar, boolean z10) {
        a(aVar, "shuffleModeEnabled", Boolean.toString(z10));
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void a(b.a aVar) {
        a(aVar, "seekStarted");
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void f(b.a aVar, int i10) {
        a(aVar, "audioSessionId", Integer.toString(i10));
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void a(b.a aVar, com.anythink.expressad.exoplayer.v vVar) {
        a(aVar, "playbackParameters", af.a("speed=%.2f, pitch=%.2f, skipSilence=%s", Float.valueOf(vVar.f9346b), Float.valueOf(vVar.f9347c), Boolean.valueOf(vVar.f9348d)));
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void f(b.a aVar) {
        a(aVar, "drmKeysLoaded");
    }

    private String b(b.a aVar, String str, String str2) {
        return a3.l.q(com.ironsource.adapters.facebook.a.l(str, " ["), i(aVar), ", ", str2, "]");
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void a(b.a aVar, int i10) {
        int c10 = aVar.f7254b.c();
        int b10 = aVar.f7254b.b();
        StringBuilder sb2 = new StringBuilder("timelineChanged [");
        sb2.append(i(aVar));
        sb2.append(", periodCount=");
        sb2.append(c10);
        sb2.append(", windowCount=");
        sb2.append(b10);
        sb2.append(", reason=");
        sb2.append(i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : "DYNAMIC" : "RESET" : "PREPARED");
        Log.d(f9045a, sb2.toString());
        for (int i11 = 0; i11 < Math.min(c10, 3); i11++) {
            aVar.f7254b.a(i11, this.f, false);
            Log.d(f9045a, "  period [" + a(com.anythink.expressad.exoplayer.b.a(this.f.f7275d)) + "]");
        }
        if (c10 > 3) {
            Log.d(f9045a, "  ...");
        }
        for (int i12 = 0; i12 < Math.min(b10, 3); i12++) {
            aVar.f7254b.a(i12, this.f9049e, false);
            Log.d(f9045a, "  window [" + a(com.anythink.expressad.exoplayer.b.a(this.f9049e.f7284i)) + ", " + this.f9049e.f7280d + ", " + this.f9049e.f7281e + "]");
        }
        if (b10 > 3) {
            Log.d(f9045a, "  ...");
        }
        Log.d(f9045a, "]");
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void b() {
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void b(b.a aVar, boolean z10) {
        a(aVar, CallMraidJS.f7004e, Boolean.toString(z10));
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void b(b.a aVar, int i10) {
        a(aVar, "positionDiscontinuity", i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "?" : "INTERNAL" : "AD_INSERTION" : "SEEK_ADJUSTMENT" : "SEEK" : "PERIOD_TRANSITION");
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void b(b.a aVar) {
        a(aVar, "seekProcessed");
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void b(b.a aVar, int i10, int i11) {
        a(aVar, "videoSizeChanged", i10 + ", " + i11);
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void b(b.a aVar, t.c cVar) {
        a(aVar, "upstreamDiscarded", com.anythink.expressad.exoplayer.m.c(cVar.f8529c));
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void a(b.a aVar, com.anythink.expressad.exoplayer.i.g gVar) {
        int i10;
        com.anythink.expressad.exoplayer.i.e eVar = this.f9048d;
        e.a a10 = eVar != null ? eVar.a() : null;
        if (a10 == null) {
            a(aVar, "tracksChanged", ContentRecord.XRINFOLIST_NULL);
            return;
        }
        Log.d(f9045a, "tracksChanged [" + i(aVar) + ", ");
        int a11 = a10.a();
        int i11 = 0;
        while (true) {
            String str = "  ]";
            String str2 = " [";
            if (i11 >= a11) {
                break;
            }
            com.anythink.expressad.exoplayer.h.af b10 = a10.b(i11);
            com.anythink.expressad.exoplayer.i.f a12 = gVar.a(i11);
            if (b10.f8256b > 0) {
                i10 = a11;
                Log.d(f9045a, "  Renderer:" + i11 + " [");
                int i12 = 0;
                while (i12 < b10.f8256b) {
                    com.anythink.expressad.exoplayer.h.ae a13 = b10.a(i12);
                    com.anythink.expressad.exoplayer.h.af afVar = b10;
                    int i13 = a13.f8252a;
                    int a14 = a10.a(i11, i12);
                    String str3 = str;
                    Log.d(f9045a, "    Group:" + i12 + ", adaptive_supported=" + (i13 < 2 ? "N/A" : a14 != 0 ? a14 != 8 ? a14 != 16 ? "?" : "YES" : "YES_NOT_SEAMLESS" : "NO") + str2);
                    int i14 = 0;
                    while (i14 < a13.f8252a) {
                        Log.d(f9045a, "      " + a((a12 == null || a12.f() != a13 || a12.c(i14) == -1) ? false : true) + " Track:" + i14 + ", " + com.anythink.expressad.exoplayer.m.c(a13.a(i14)) + ", supported=" + b(a10.a(i11, i12, i14)));
                        i14++;
                        str2 = str2;
                    }
                    Log.d(f9045a, "    ]");
                    i12++;
                    b10 = afVar;
                    str = str3;
                }
                String str4 = str;
                if (a12 != null) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= a12.g()) {
                            break;
                        }
                        com.anythink.expressad.exoplayer.g.a aVar2 = a12.a(i15).f;
                        if (aVar2 != null) {
                            Log.d(f9045a, "    Metadata [");
                            a(aVar2, "      ");
                            Log.d(f9045a, "    ]");
                            break;
                        }
                        i15++;
                    }
                }
                Log.d(f9045a, str4);
            } else {
                i10 = a11;
            }
            i11++;
            a11 = i10;
        }
        String str5 = " [";
        com.anythink.expressad.exoplayer.h.af b11 = a10.b();
        if (b11.f8256b > 0) {
            Log.d(f9045a, "  Renderer:None [");
            int i16 = 0;
            while (i16 < b11.f8256b) {
                StringBuilder sb2 = new StringBuilder("    Group:");
                sb2.append(i16);
                String str6 = str5;
                sb2.append(str6);
                Log.d(f9045a, sb2.toString());
                com.anythink.expressad.exoplayer.h.ae a15 = b11.a(i16);
                for (int i17 = 0; i17 < a15.f8252a; i17++) {
                    Log.d(f9045a, "      " + a(false) + " Track:" + i17 + ", " + com.anythink.expressad.exoplayer.m.c(a15.a(i17)) + ", supported=" + b(0));
                }
                Log.d(f9045a, "    ]");
                i16++;
                str5 = str6;
            }
            Log.d(f9045a, "  ]");
        }
        Log.d(f9045a, "]");
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void a(b.a aVar, com.anythink.expressad.exoplayer.g.a aVar2) {
        Log.d(f9045a, "metadata [" + i(aVar) + ", ");
        a(aVar2, "  ");
        Log.d(f9045a, "]");
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void a(b.a aVar, int i10, String str) {
        a(aVar, "decoderInitialized", a3.k.m(new StringBuilder(), f(i10), ", ", str));
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void a(b.a aVar, int i10, com.anythink.expressad.exoplayer.m mVar) {
        a(aVar, "decoderInputFormatChanged", f(i10) + ", " + com.anythink.expressad.exoplayer.m.c(mVar));
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void a(b.a aVar, int i10, long j10, long j11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(j10);
        sb2.append(", ");
        a(aVar, "audioTrackUnderrun", a3.l.n(sb2, j11, "]"), (Throwable) null);
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void a(b.a aVar, Surface surface) {
        a(aVar, "renderedFirstFrame", surface.toString());
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void a(b.a aVar, IOException iOException) {
        a(aVar, "loadError", (Exception) iOException);
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void a(b.a aVar, int i10, int i11) {
        a(aVar, "viewportSizeChanged", i10 + ", " + i11);
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void a(b.a aVar, NetworkInfo networkInfo) {
        a(aVar, "networkTypeChanged", networkInfo == null ? "none" : networkInfo.toString());
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void a(b.a aVar, t.c cVar) {
        a(aVar, "downstreamFormatChanged", com.anythink.expressad.exoplayer.m.c(cVar.f8529c));
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void a(b.a aVar, Exception exc) {
        a(aVar, "drmSessionManagerError", exc);
    }

    private static void a(String str) {
        Log.d(f9045a, str);
    }

    private static void a(String str, Throwable th) {
        Log.e(f9045a, str, th);
    }

    private void a(b.a aVar, String str) {
        Log.d(f9045a, b(aVar, str));
    }

    private void a(b.a aVar, String str, String str2) {
        Log.d(f9045a, b(aVar, str, str2));
    }

    private void a(b.a aVar, String str, Throwable th) {
        a(b(aVar, str), th);
    }

    private void a(b.a aVar, String str, String str2, Throwable th) {
        a(b(aVar, str, str2), th);
    }

    private void a(b.a aVar, String str, Exception exc) {
        a(aVar, "internalError", str, exc);
    }

    private static void a(com.anythink.expressad.exoplayer.g.a aVar, String str) {
        for (int i10 = 0; i10 < aVar.a(); i10++) {
            StringBuilder j10 = com.ironsource.adapters.facebook.a.j(str);
            j10.append(aVar.a(i10));
            Log.d(f9045a, j10.toString());
        }
    }

    private static String a(long j10) {
        return j10 == com.anythink.expressad.exoplayer.b.f7291b ? "?" : f9047c.format(((float) j10) / 1000.0f);
    }

    private static String a(com.anythink.expressad.exoplayer.i.f fVar, com.anythink.expressad.exoplayer.h.ae aeVar, int i10) {
        return a((fVar == null || fVar.f() != aeVar || fVar.c(i10) == -1) ? false : true);
    }

    @Override // com.anythink.expressad.exoplayer.a.b
    public final void a(b.a aVar, com.anythink.expressad.exoplayer.g gVar) {
        a(b(aVar, "playerFailed"), gVar);
    }
}
