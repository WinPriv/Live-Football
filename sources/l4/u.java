package l4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.ads.AdError;
import d6.g0;
import j5.u;
import java.util.HashMap;
import k4.b1;
import k4.i0;
import k4.n0;
import k4.q1;
import l4.b;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: MediaMetricsListener.java */
/* loaded from: classes2.dex */
public final class u implements l4.b, v {
    public boolean A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f32453a;

    /* renamed from: b, reason: collision with root package name */
    public final t f32454b;

    /* renamed from: c, reason: collision with root package name */
    public final PlaybackSession f32455c;

    /* renamed from: i, reason: collision with root package name */
    public String f32460i;

    /* renamed from: j, reason: collision with root package name */
    public PlaybackMetrics.Builder f32461j;

    /* renamed from: k, reason: collision with root package name */
    public int f32462k;

    /* renamed from: n, reason: collision with root package name */
    public b1 f32465n;
    public b o;

    /* renamed from: p, reason: collision with root package name */
    public b f32466p;

    /* renamed from: q, reason: collision with root package name */
    public b f32467q;

    /* renamed from: r, reason: collision with root package name */
    public i0 f32468r;

    /* renamed from: s, reason: collision with root package name */
    public i0 f32469s;

    /* renamed from: t, reason: collision with root package name */
    public i0 f32470t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f32471u;

    /* renamed from: v, reason: collision with root package name */
    public int f32472v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f32473w;

    /* renamed from: x, reason: collision with root package name */
    public int f32474x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public int f32475z;

    /* renamed from: e, reason: collision with root package name */
    public final q1.c f32457e = new q1.c();
    public final q1.b f = new q1.b();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap<String, Long> f32459h = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap<String, Long> f32458g = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final long f32456d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    public int f32463l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f32464m = 0;

    /* compiled from: MediaMetricsListener.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f32476a;

        /* renamed from: b, reason: collision with root package name */
        public final int f32477b;

        public a(int i10, int i11) {
            this.f32476a = i10;
            this.f32477b = i11;
        }
    }

    /* compiled from: MediaMetricsListener.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final i0 f32478a;

        /* renamed from: b, reason: collision with root package name */
        public final int f32479b;

        /* renamed from: c, reason: collision with root package name */
        public final String f32480c;

        public b(i0 i0Var, int i10, String str) {
            this.f32478a = i0Var;
            this.f32479b = i10;
            this.f32480c = str;
        }
    }

    public u(Context context, PlaybackSession playbackSession) {
        this.f32453a = context.getApplicationContext();
        this.f32455c = playbackSession;
        t tVar = new t();
        this.f32454b = tVar;
        tVar.f32445d = this;
    }

    @SuppressLint({"SwitchIntDef"})
    public static int j(int i10) {
        switch (g0.r(i10)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    @Override // l4.b
    public final void a(e6.n nVar) {
        b bVar = this.o;
        if (bVar != null) {
            i0 i0Var = bVar.f32478a;
            if (i0Var.J == -1) {
                i0.a aVar = new i0.a(i0Var);
                aVar.f30538p = nVar.f27845s;
                aVar.f30539q = nVar.f27846t;
                this.o = new b(new i0(aVar), bVar.f32479b, bVar.f32480c);
            }
        }
    }

    @Override // l4.b
    public final void b(n4.e eVar) {
        this.f32474x += eVar.f33315g;
        this.y += eVar.f33314e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0510 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // l4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(k4.e1 r21, l4.b.C0437b r22) {
        /*
            Method dump skipped, instructions count: 1606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.u.c(k4.e1, l4.b$b):void");
    }

    @Override // l4.b
    public final void d(b.a aVar, j5.r rVar) {
        String str;
        if (aVar.f32397d == null) {
            return;
        }
        i0 i0Var = rVar.f29831c;
        i0Var.getClass();
        t tVar = this.f32454b;
        u.b bVar = aVar.f32397d;
        bVar.getClass();
        q1 q1Var = aVar.f32395b;
        synchronized (tVar) {
            str = tVar.a(q1Var.g(bVar.f29835a, tVar.f32443b).f30756u, bVar).f32447a;
        }
        b bVar2 = new b(i0Var, rVar.f29832d, str);
        int i10 = rVar.f29830b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        this.f32467q = bVar2;
                        return;
                    }
                    return;
                }
            } else {
                this.f32466p = bVar2;
                return;
            }
        }
        this.o = bVar2;
    }

    @Override // l4.b
    public final void e(j5.r rVar) {
        this.f32472v = rVar.f29829a;
    }

    @Override // l4.b
    public final void f(b.a aVar, int i10, long j10) {
        String str;
        long longValue;
        u.b bVar = aVar.f32397d;
        if (bVar != null) {
            t tVar = this.f32454b;
            q1 q1Var = aVar.f32395b;
            synchronized (tVar) {
                str = tVar.a(q1Var.g(bVar.f29835a, tVar.f32443b).f30756u, bVar).f32447a;
            }
            HashMap<String, Long> hashMap = this.f32459h;
            Long l10 = hashMap.get(str);
            HashMap<String, Long> hashMap2 = this.f32458g;
            Long l11 = hashMap2.get(str);
            long j11 = 0;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            hashMap.put(str, Long.valueOf(longValue + j10));
            if (l11 != null) {
                j11 = l11.longValue();
            }
            hashMap2.put(str, Long.valueOf(j11 + i10));
        }
    }

    @Override // l4.b
    public final void g(b1 b1Var) {
        this.f32465n = b1Var;
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public final boolean h(b bVar) {
        String str;
        if (bVar != null) {
            String str2 = bVar.f32480c;
            t tVar = this.f32454b;
            synchronized (tVar) {
                str = tVar.f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        long longValue;
        long longValue2;
        int i10;
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f32461j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f32475z);
            this.f32461j.setVideoFramesDropped(this.f32474x);
            this.f32461j.setVideoFramesPlayed(this.y);
            Long l10 = this.f32458g.get(this.f32460i);
            PlaybackMetrics.Builder builder2 = this.f32461j;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l11 = this.f32459h.get(this.f32460i);
            PlaybackMetrics.Builder builder3 = this.f32461j;
            if (l11 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l11.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.f32461j;
            if (l11 != null && l11.longValue() > 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            builder4.setStreamSource(i10);
            build = this.f32461j.build();
            this.f32455c.reportPlaybackMetrics(build);
        }
        this.f32461j = null;
        this.f32460i = null;
        this.f32475z = 0;
        this.f32474x = 0;
        this.y = 0;
        this.f32468r = null;
        this.f32469s = null;
        this.f32470t = null;
        this.A = false;
    }

    @RequiresNonNull({"metricsBuilder"})
    public final void k(q1 q1Var, u.b bVar) {
        int b10;
        PlaybackMetrics.Builder builder = this.f32461j;
        if (bVar == null || (b10 = q1Var.b(bVar.f29835a)) == -1) {
            return;
        }
        q1.b bVar2 = this.f;
        int i10 = 0;
        q1Var.f(b10, bVar2, false);
        int i11 = bVar2.f30756u;
        q1.c cVar = this.f32457e;
        q1Var.m(i11, cVar);
        n0.g gVar = cVar.f30762u.f30575t;
        int i12 = 2;
        if (gVar != null) {
            int D = g0.D(gVar.f30629a, gVar.f30630b);
            if (D != 0) {
                if (D != 1) {
                    if (D != 2) {
                        i10 = 1;
                    } else {
                        i10 = 4;
                    }
                } else {
                    i10 = 5;
                }
            } else {
                i10 = 3;
            }
        }
        builder.setStreamType(i10);
        if (cVar.F != com.anythink.expressad.exoplayer.b.f7291b && !cVar.D && !cVar.A && !cVar.a()) {
            builder.setMediaDurationMillis(g0.S(cVar.F));
        }
        if (!cVar.a()) {
            i12 = 1;
        }
        builder.setPlaybackType(i12);
        this.A = true;
    }

    public final void l(b.a aVar, String str) {
        u.b bVar = aVar.f32397d;
        if (bVar != null && bVar.a()) {
            return;
        }
        i();
        this.f32460i = str;
        this.f32461j = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.4");
        k(aVar.f32395b, bVar);
    }

    public final void m(b.a aVar, String str) {
        u.b bVar = aVar.f32397d;
        if ((bVar == null || !bVar.a()) && str.equals(this.f32460i)) {
            i();
        }
        this.f32458g.remove(str);
        this.f32459h.remove(str);
    }

    public final void n(int i10, long j10, i0 i0Var, int i11) {
        int i12;
        String str;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.f32456d);
        if (i0Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i11 != 1) {
                i12 = 3;
                if (i11 != 2) {
                    if (i11 != 3) {
                        i12 = 1;
                    } else {
                        i12 = 4;
                    }
                }
            } else {
                i12 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str2 = i0Var.C;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = i0Var.D;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = i0Var.A;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i13 = i0Var.f30524z;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = i0Var.I;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = i0Var.J;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = i0Var.Q;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = i0Var.R;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str5 = i0Var.f30520u;
            if (str5 != null) {
                int i18 = g0.f27302a;
                String[] split = str5.split("-", -1);
                String str6 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str6, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = i0Var.K;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.f32455c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @Override // l4.b
    public final void onPositionDiscontinuity(int i10) {
        if (i10 == 1) {
            this.f32471u = true;
        }
        this.f32462k = i10;
    }
}
