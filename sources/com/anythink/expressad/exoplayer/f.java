package com.anythink.expressad.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f implements ab {

    /* renamed from: a, reason: collision with root package name */
    public static final long f7962a = 5000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7963b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7964c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7965d = 2;

    /* renamed from: e, reason: collision with root package name */
    protected static final int f7966e = 50;
    private static final String f = "DefaultRenderersFactory";

    /* renamed from: g, reason: collision with root package name */
    private final Context f7967g;

    /* renamed from: h, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.d.g<com.anythink.expressad.exoplayer.d.k> f7968h;

    /* renamed from: i, reason: collision with root package name */
    private final int f7969i;

    /* renamed from: j, reason: collision with root package name */
    private final long f7970j;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    public f(Context context) {
        this(context, 0);
    }

    private static void a() {
    }

    private static com.anythink.expressad.exoplayer.b.f[] b() {
        return new com.anythink.expressad.exoplayer.b.f[0];
    }

    @Deprecated
    private f(Context context, com.anythink.expressad.exoplayer.d.g<com.anythink.expressad.exoplayer.d.k> gVar) {
        this(context, gVar, (byte) 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:19|(1:21)|22|23|24|25|26|27|(2:28|29)|31|32|33|34|35|(2:37|38)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:28|29)|31|32|33|34|35|(2:37|38)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0125, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0130, code lost:
    
        r3 = r5;
     */
    @Override // com.anythink.expressad.exoplayer.ab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.anythink.expressad.exoplayer.y[] a(android.os.Handler r22, com.anythink.expressad.exoplayer.l.h r23, com.anythink.expressad.exoplayer.b.g r24, com.anythink.expressad.exoplayer.g.f r25, com.anythink.expressad.exoplayer.d.g<com.anythink.expressad.exoplayer.d.k> r26) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.f.a(android.os.Handler, com.anythink.expressad.exoplayer.l.h, com.anythink.expressad.exoplayer.b.g, com.anythink.expressad.exoplayer.g.f, com.anythink.expressad.exoplayer.d.g):com.anythink.expressad.exoplayer.y[]");
    }

    public f(Context context, int i10) {
        this(context, null, i10, f7962a);
    }

    @Deprecated
    private f(Context context, com.anythink.expressad.exoplayer.d.g<com.anythink.expressad.exoplayer.d.k> gVar, byte b10) {
        this(context, gVar, 0, f7962a);
    }

    public f(Context context, int i10, long j10) {
        this(context, null, i10, j10);
    }

    @Deprecated
    private f(Context context, com.anythink.expressad.exoplayer.d.g<com.anythink.expressad.exoplayer.d.k> gVar, int i10, long j10) {
        this.f7967g = context;
        this.f7969i = i10;
        this.f7970j = j10;
        this.f7968h = gVar;
    }

    private static void a(Context context, com.anythink.expressad.exoplayer.d.g<com.anythink.expressad.exoplayer.d.k> gVar, long j10, Handler handler, com.anythink.expressad.exoplayer.l.h hVar, int i10, ArrayList<y> arrayList) {
        arrayList.add(new com.anythink.expressad.exoplayer.l.e(context, com.anythink.expressad.exoplayer.f.c.f8000a, j10, gVar, handler, hVar, 50));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            arrayList.add(size, (y) Class.forName("com.anythink.expressad.exoplayer.ext.vp9.LibvpxVideoRenderer").getConstructor(Boolean.TYPE, Long.TYPE, Handler.class, com.anythink.expressad.exoplayer.l.h.class, Integer.TYPE).newInstance(Boolean.TRUE, Long.valueOf(j10), handler, hVar, 50));
            Log.i(f, "Loaded LibvpxVideoRenderer.");
        } catch (ClassNotFoundException unused) {
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating VP9 extension", e10);
        }
    }

    private static void a(Context context, com.anythink.expressad.exoplayer.d.g<com.anythink.expressad.exoplayer.d.k> gVar, com.anythink.expressad.exoplayer.b.f[] fVarArr, Handler handler, com.anythink.expressad.exoplayer.b.g gVar2, int i10, ArrayList<y> arrayList) {
        int i11;
        arrayList.add(new com.anythink.expressad.exoplayer.b.o(context, com.anythink.expressad.exoplayer.f.c.f8000a, gVar, handler, gVar2, com.anythink.expressad.exoplayer.b.c.a(context), fVarArr));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating Opus extension", e10);
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            arrayList.add(size, (y) Class.forName("com.anythink.expressad.exoplayer.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, com.anythink.expressad.exoplayer.b.g.class, com.anythink.expressad.exoplayer.b.f[].class).newInstance(handler, gVar2, fVarArr));
            Log.i(f, "Loaded LibopusAudioRenderer.");
        } catch (ClassNotFoundException unused2) {
            size = i11;
            i11 = size;
            try {
                int i12 = i11 + 1;
                try {
                    arrayList.add(i11, (y) Class.forName("com.anythink.expressad.exoplayer.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, com.anythink.expressad.exoplayer.b.g.class, com.anythink.expressad.exoplayer.b.f[].class).newInstance(handler, gVar2, fVarArr));
                    Log.i(f, "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused3) {
                    i11 = i12;
                    i12 = i11;
                    arrayList.add(i12, (y) Class.forName("com.anythink.expressad.exoplayer.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.anythink.expressad.exoplayer.b.g.class, com.anythink.expressad.exoplayer.b.f[].class).newInstance(handler, gVar2, fVarArr));
                    Log.i(f, "Loaded FfmpegAudioRenderer.");
                }
                arrayList.add(i12, (y) Class.forName("com.anythink.expressad.exoplayer.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.anythink.expressad.exoplayer.b.g.class, com.anythink.expressad.exoplayer.b.f[].class).newInstance(handler, gVar2, fVarArr));
                Log.i(f, "Loaded FfmpegAudioRenderer.");
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating FLAC extension", e11);
            }
        }
        try {
            int i122 = i11 + 1;
            arrayList.add(i11, (y) Class.forName("com.anythink.expressad.exoplayer.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, com.anythink.expressad.exoplayer.b.g.class, com.anythink.expressad.exoplayer.b.f[].class).newInstance(handler, gVar2, fVarArr));
            Log.i(f, "Loaded LibflacAudioRenderer.");
        } catch (ClassNotFoundException unused4) {
        }
        try {
            arrayList.add(i122, (y) Class.forName("com.anythink.expressad.exoplayer.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.anythink.expressad.exoplayer.b.g.class, com.anythink.expressad.exoplayer.b.f[].class).newInstance(handler, gVar2, fVarArr));
            Log.i(f, "Loaded FfmpegAudioRenderer.");
        } catch (ClassNotFoundException unused5) {
        } catch (Exception e12) {
            throw new RuntimeException("Error instantiating FFmpeg extension", e12);
        }
    }

    private static void a(com.anythink.expressad.exoplayer.g.f fVar, Looper looper, ArrayList<y> arrayList) {
        arrayList.add(new com.anythink.expressad.exoplayer.g.g(fVar, looper));
    }
}
