package l3;

import a3.x;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import l3.c;
import t3.l;

/* compiled from: ByteBufferGifDecoder.java */
/* loaded from: classes.dex */
public final class a implements y2.i<ByteBuffer, c> {
    public static final C0436a f = new C0436a();

    /* renamed from: g, reason: collision with root package name */
    public static final b f32349g = new b();

    /* renamed from: a, reason: collision with root package name */
    public final Context f32350a;

    /* renamed from: b, reason: collision with root package name */
    public final List<ImageHeaderParser> f32351b;

    /* renamed from: c, reason: collision with root package name */
    public final b f32352c;

    /* renamed from: d, reason: collision with root package name */
    public final C0436a f32353d;

    /* renamed from: e, reason: collision with root package name */
    public final l3.b f32354e;

    /* compiled from: ByteBufferGifDecoder.java */
    /* renamed from: l3.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0436a {
    }

    /* compiled from: ByteBufferGifDecoder.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayDeque f32355a;

        public b() {
            char[] cArr = l.f35429a;
            this.f32355a = new ArrayDeque(0);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, b3.d dVar, b3.b bVar) {
        C0436a c0436a = f;
        this.f32350a = context.getApplicationContext();
        this.f32351b = list;
        this.f32353d = c0436a;
        this.f32354e = new l3.b(dVar, bVar);
        this.f32352c = f32349g;
    }

    public static int d(x2.c cVar, int i10, int i11) {
        int highestOneBit;
        int min = Math.min(cVar.f36285g / i11, cVar.f / i10);
        if (min == 0) {
            highestOneBit = 0;
        } else {
            highestOneBit = Integer.highestOneBit(min);
        }
        int max = Math.max(1, highestOneBit);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder r10 = a3.l.r("Downsampling GIF, sampleSize: ", max, ", target dimens: [", i10, "x");
            r10.append(i11);
            r10.append("], actual dimens: [");
            r10.append(cVar.f);
            r10.append("x");
            r10.append(cVar.f36285g);
            r10.append("]");
            Log.v("BufferGifDecoder", r10.toString());
        }
        return max;
    }

    @Override // y2.i
    public final boolean a(ByteBuffer byteBuffer, y2.g gVar) throws IOException {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (!((Boolean) gVar.c(i.f32390b)).booleanValue() && com.bumptech.glide.load.a.c(this.f32351b, byteBuffer2) == ImageHeaderParser.ImageType.GIF) {
            return true;
        }
        return false;
    }

    @Override // y2.i
    public final x<c> b(ByteBuffer byteBuffer, int i10, int i11, y2.g gVar) throws IOException {
        x2.d dVar;
        ByteBuffer byteBuffer2 = byteBuffer;
        b bVar = this.f32352c;
        synchronized (bVar) {
            x2.d dVar2 = (x2.d) bVar.f32355a.poll();
            if (dVar2 == null) {
                dVar2 = new x2.d();
            }
            dVar = dVar2;
            dVar.f36291b = null;
            Arrays.fill(dVar.f36290a, (byte) 0);
            dVar.f36292c = new x2.c();
            dVar.f36293d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
            dVar.f36291b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.f36291b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            e c10 = c(byteBuffer2, i10, i11, dVar, gVar);
            b bVar2 = this.f32352c;
            synchronized (bVar2) {
                dVar.f36291b = null;
                dVar.f36292c = null;
                bVar2.f32355a.offer(dVar);
            }
            return c10;
        } catch (Throwable th) {
            b bVar3 = this.f32352c;
            synchronized (bVar3) {
                dVar.f36291b = null;
                dVar.f36292c = null;
                bVar3.f32355a.offer(dVar);
                throw th;
            }
        }
    }

    public final e c(ByteBuffer byteBuffer, int i10, int i11, x2.d dVar, y2.g gVar) {
        Bitmap.Config config;
        int i12 = t3.h.f35419b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            x2.c b10 = dVar.b();
            if (b10.f36282c > 0 && b10.f36281b == 0) {
                if (gVar.c(i.f32389a) == y2.b.PREFER_RGB_565) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                int d10 = d(b10, i10, i11);
                C0436a c0436a = this.f32353d;
                l3.b bVar = this.f32354e;
                c0436a.getClass();
                x2.e eVar = new x2.e(bVar, b10, byteBuffer, d10);
                eVar.h(config);
                eVar.b();
                Bitmap a10 = eVar.a();
                if (a10 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + t3.h.a(elapsedRealtimeNanos));
                    }
                    return null;
                }
                return new e(new c(new c.a(new g(com.bumptech.glide.b.b(this.f32350a), eVar, i10, i11, g3.b.f28478b, a10))));
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + t3.h.a(elapsedRealtimeNanos));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + t3.h.a(elapsedRealtimeNanos));
            }
        }
    }
}
