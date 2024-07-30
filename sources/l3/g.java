package l3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.n;
import com.bumptech.glide.o;
import java.util.ArrayList;
import t3.l;
import y2.k;

/* compiled from: GifFrameLoader.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final x2.a f32369a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f32370b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f32371c;

    /* renamed from: d, reason: collision with root package name */
    public final o f32372d;

    /* renamed from: e, reason: collision with root package name */
    public final b3.d f32373e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f32374g;

    /* renamed from: h, reason: collision with root package name */
    public n<Bitmap> f32375h;

    /* renamed from: i, reason: collision with root package name */
    public a f32376i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f32377j;

    /* renamed from: k, reason: collision with root package name */
    public a f32378k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f32379l;

    /* renamed from: m, reason: collision with root package name */
    public k<Bitmap> f32380m;

    /* renamed from: n, reason: collision with root package name */
    public a f32381n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public int f32382p;

    /* renamed from: q, reason: collision with root package name */
    public int f32383q;

    /* compiled from: GifFrameLoader.java */
    /* loaded from: classes.dex */
    public static class a extends q3.c<Bitmap> {

        /* renamed from: v, reason: collision with root package name */
        public final Handler f32384v;

        /* renamed from: w, reason: collision with root package name */
        public final int f32385w;

        /* renamed from: x, reason: collision with root package name */
        public final long f32386x;
        public Bitmap y;

        public a(Handler handler, int i10, long j10) {
            this.f32384v = handler;
            this.f32385w = i10;
            this.f32386x = j10;
        }

        @Override // q3.g
        public final void a(Object obj) {
            this.y = (Bitmap) obj;
            Handler handler = this.f32384v;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f32386x);
        }

        @Override // q3.g
        public final void g(Drawable drawable) {
            this.y = null;
        }
    }

    /* compiled from: GifFrameLoader.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* compiled from: GifFrameLoader.java */
    /* loaded from: classes.dex */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            g gVar = g.this;
            if (i10 == 1) {
                gVar.b((a) message.obj);
                return true;
            }
            if (i10 == 2) {
                gVar.f32372d.i((a) message.obj);
                return false;
            }
            return false;
        }
    }

    public g(com.bumptech.glide.b bVar, x2.e eVar, int i10, int i11, g3.b bVar2, Bitmap bitmap) {
        b3.d dVar = bVar.f19717s;
        com.bumptech.glide.h hVar = bVar.f19719u;
        Context baseContext = hVar.getBaseContext();
        o c10 = com.bumptech.glide.b.c(baseContext).c(baseContext);
        Context baseContext2 = hVar.getBaseContext();
        o c11 = com.bumptech.glide.b.c(baseContext2).c(baseContext2);
        c11.getClass();
        n<Bitmap> r10 = new n(c11.f19836s, c11, Bitmap.class, c11.f19837t).r(o.C).r(((p3.g) ((p3.g) new p3.g().d(a3.n.f154a).p()).m()).g(i10, i11));
        this.f32371c = new ArrayList();
        this.f32372d = c10;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f32373e = dVar;
        this.f32370b = handler;
        this.f32375h = r10;
        this.f32369a = eVar;
        c(bVar2, bitmap);
    }

    public final void a() {
        if (this.f && !this.f32374g) {
            a aVar = this.f32381n;
            if (aVar != null) {
                this.f32381n = null;
                b(aVar);
                return;
            }
            this.f32374g = true;
            x2.a aVar2 = this.f32369a;
            long uptimeMillis = SystemClock.uptimeMillis() + aVar2.d();
            aVar2.b();
            this.f32378k = new a(this.f32370b, aVar2.e(), uptimeMillis);
            n<Bitmap> x10 = this.f32375h.r(new p3.g().l(new s3.d(Double.valueOf(Math.random())))).x(aVar2);
            x10.v(this.f32378k, x10);
        }
    }

    public final void b(a aVar) {
        this.f32374g = false;
        boolean z10 = this.f32377j;
        Handler handler = this.f32370b;
        if (z10) {
            handler.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f) {
            this.f32381n = aVar;
            return;
        }
        if (aVar.y != null) {
            Bitmap bitmap = this.f32379l;
            if (bitmap != null) {
                this.f32373e.d(bitmap);
                this.f32379l = null;
            }
            a aVar2 = this.f32376i;
            this.f32376i = aVar;
            ArrayList arrayList = this.f32371c;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((b) arrayList.get(size)).a();
                }
            }
            if (aVar2 != null) {
                handler.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(k<Bitmap> kVar, Bitmap bitmap) {
        androidx.activity.n.n0(kVar);
        this.f32380m = kVar;
        androidx.activity.n.n0(bitmap);
        this.f32379l = bitmap;
        this.f32375h = this.f32375h.r(new p3.g().o(kVar, true));
        this.o = l.c(bitmap);
        this.f32382p = bitmap.getWidth();
        this.f32383q = bitmap.getHeight();
    }
}
