package com.applovin.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.applovin.exoplayer2.b.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class n implements au {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16560a;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16563d;
    private boolean f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16565g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16566h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16567i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16568j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16569k;

    /* renamed from: b, reason: collision with root package name */
    private int f16561b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f16562c = com.anythink.expressad.exoplayer.f.f7962a;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.exoplayer2.f.k f16564e = com.applovin.exoplayer2.f.k.f15074a;

    public n(Context context) {
        this.f16560a = context;
    }

    public void a(Context context, Handler handler, int i10, ArrayList<ar> arrayList) {
    }

    @Override // com.applovin.exoplayer2.au
    public ar[] a(Handler handler, com.applovin.exoplayer2.m.n nVar, com.applovin.exoplayer2.b.g gVar, com.applovin.exoplayer2.i.l lVar, com.applovin.exoplayer2.g.e eVar) {
        ArrayList<ar> arrayList = new ArrayList<>();
        a(this.f16560a, this.f16561b, this.f16564e, this.f16563d, handler, nVar, this.f16562c, arrayList);
        com.applovin.exoplayer2.b.h a10 = a(this.f16560a, this.f16567i, this.f16568j, this.f16569k);
        if (a10 != null) {
            a(this.f16560a, this.f16561b, this.f16564e, this.f16563d, a10, handler, gVar, arrayList);
        }
        a(this.f16560a, lVar, handler.getLooper(), this.f16561b, arrayList);
        a(this.f16560a, eVar, handler.getLooper(), this.f16561b, arrayList);
        a(this.f16560a, this.f16561b, arrayList);
        a(this.f16560a, handler, this.f16561b, arrayList);
        return (ar[]) arrayList.toArray(new ar[0]);
    }

    public void a(Context context, int i10, com.applovin.exoplayer2.f.k kVar, boolean z10, Handler handler, com.applovin.exoplayer2.m.n nVar, long j10, ArrayList<ar> arrayList) {
        int i11;
        com.applovin.exoplayer2.m.h hVar = new com.applovin.exoplayer2.m.h(context, kVar, j10, z10, handler, nVar, 50);
        hVar.a(this.f);
        hVar.b(this.f16565g);
        hVar.c(this.f16566h);
        arrayList.add(hVar);
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
                try {
                    arrayList.add(size, (ar) Class.forName("com.applovin.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, com.applovin.exoplayer2.m.n.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, nVar, 50));
                    com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                    try {
                        int i12 = i11 + 1;
                        try {
                            arrayList.add(i11, (ar) Class.forName("com.applovin.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, com.applovin.exoplayer2.m.n.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, nVar, 50));
                            com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                        } catch (ClassNotFoundException unused2) {
                            i11 = i12;
                            i12 = i11;
                            arrayList.add(i12, (ar) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, com.applovin.exoplayer2.m.n.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, nVar, 50));
                            com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                        }
                        arrayList.add(i12, (ar) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, com.applovin.exoplayer2.m.n.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, nVar, 50));
                        com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating AV1 extension", e10);
                    }
                }
            } catch (ClassNotFoundException unused3) {
            }
            try {
                int i122 = i11 + 1;
                arrayList.add(i11, (ar) Class.forName("com.applovin.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, com.applovin.exoplayer2.m.n.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, nVar, 50));
                com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused4) {
            }
            try {
                arrayList.add(i122, (ar) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, com.applovin.exoplayer2.m.n.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, nVar, 50));
                com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e11);
            }
        } catch (Exception e12) {
            throw new RuntimeException("Error instantiating VP9 extension", e12);
        }
    }

    public void a(Context context, int i10, com.applovin.exoplayer2.f.k kVar, boolean z10, com.applovin.exoplayer2.b.h hVar, Handler handler, com.applovin.exoplayer2.b.g gVar, ArrayList<ar> arrayList) {
        int i11;
        com.applovin.exoplayer2.b.q qVar = new com.applovin.exoplayer2.b.q(context, kVar, z10, handler, gVar, hVar);
        qVar.a(this.f);
        qVar.b(this.f16565g);
        qVar.c(this.f16566h);
        arrayList.add(qVar);
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
            } catch (ClassNotFoundException unused) {
            }
            try {
                arrayList.add(size, (ar) Class.forName("com.applovin.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, com.applovin.exoplayer2.b.g.class, com.applovin.exoplayer2.b.h.class).newInstance(handler, gVar, hVar));
                com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
            } catch (ClassNotFoundException unused2) {
                size = i11;
                i11 = size;
                try {
                    int i12 = i11 + 1;
                    try {
                        arrayList.add(i11, (ar) Class.forName("com.applovin.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, com.applovin.exoplayer2.b.g.class, com.applovin.exoplayer2.b.h.class).newInstance(handler, gVar, hVar));
                        com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i11 = i12;
                        i12 = i11;
                        arrayList.add(i12, (ar) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.applovin.exoplayer2.b.g.class, com.applovin.exoplayer2.b.h.class).newInstance(handler, gVar, hVar));
                        com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    }
                    arrayList.add(i12, (ar) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.applovin.exoplayer2.b.g.class, com.applovin.exoplayer2.b.h.class).newInstance(handler, gVar, hVar));
                    com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating FLAC extension", e10);
                }
            }
            try {
                int i122 = i11 + 1;
                arrayList.add(i11, (ar) Class.forName("com.applovin.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, com.applovin.exoplayer2.b.g.class, com.applovin.exoplayer2.b.h.class).newInstance(handler, gVar, hVar));
                com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
            } catch (ClassNotFoundException unused4) {
            }
            try {
                arrayList.add(i122, (ar) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.applovin.exoplayer2.b.g.class, com.applovin.exoplayer2.b.h.class).newInstance(handler, gVar, hVar));
                com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e11);
            }
        } catch (Exception e12) {
            throw new RuntimeException("Error instantiating Opus extension", e12);
        }
    }

    public void a(Context context, com.applovin.exoplayer2.i.l lVar, Looper looper, int i10, ArrayList<ar> arrayList) {
        arrayList.add(new com.applovin.exoplayer2.i.m(lVar, looper));
    }

    public void a(Context context, com.applovin.exoplayer2.g.e eVar, Looper looper, int i10, ArrayList<ar> arrayList) {
        arrayList.add(new com.applovin.exoplayer2.g.f(eVar, looper));
    }

    public void a(Context context, int i10, ArrayList<ar> arrayList) {
        arrayList.add(new com.applovin.exoplayer2.m.a.b());
    }

    public com.applovin.exoplayer2.b.h a(Context context, boolean z10, boolean z11, boolean z12) {
        return new com.applovin.exoplayer2.b.n(com.applovin.exoplayer2.b.e.a(context), new n.c(new com.applovin.exoplayer2.b.f[0]), z10, z11, z12 ? 1 : 0);
    }
}
