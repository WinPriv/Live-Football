package h3;

import android.graphics.Bitmap;
import h3.m;
import h3.s;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* compiled from: StreamBitmapDecoder.java */
/* loaded from: classes.dex */
public final class w implements y2.i<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final m f28750a;

    /* renamed from: b, reason: collision with root package name */
    public final b3.b f28751b;

    /* compiled from: StreamBitmapDecoder.java */
    /* loaded from: classes.dex */
    public static class a implements m.b {

        /* renamed from: a, reason: collision with root package name */
        public final u f28752a;

        /* renamed from: b, reason: collision with root package name */
        public final t3.d f28753b;

        public a(u uVar, t3.d dVar) {
            this.f28752a = uVar;
            this.f28753b = dVar;
        }

        @Override // h3.m.b
        public final void a() {
            u uVar = this.f28752a;
            synchronized (uVar) {
                uVar.f28744u = uVar.f28742s.length;
            }
        }

        @Override // h3.m.b
        public final void b(Bitmap bitmap, b3.d dVar) throws IOException {
            IOException iOException = this.f28753b.f35413t;
            if (iOException != null) {
                if (bitmap != null) {
                    dVar.d(bitmap);
                    throw iOException;
                }
                throw iOException;
            }
        }
    }

    public w(m mVar, b3.b bVar) {
        this.f28750a = mVar;
        this.f28751b = bVar;
    }

    @Override // y2.i
    public final boolean a(InputStream inputStream, y2.g gVar) throws IOException {
        this.f28750a.getClass();
        return true;
    }

    @Override // y2.i
    public final a3.x<Bitmap> b(InputStream inputStream, int i10, int i11, y2.g gVar) throws IOException {
        u uVar;
        boolean z10;
        t3.d dVar;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof u) {
            z10 = false;
            uVar = (u) inputStream2;
        } else {
            uVar = new u(inputStream2, this.f28751b);
            z10 = true;
        }
        ArrayDeque arrayDeque = t3.d.f35411u;
        synchronized (arrayDeque) {
            dVar = (t3.d) arrayDeque.poll();
        }
        if (dVar == null) {
            dVar = new t3.d();
        }
        t3.d dVar2 = dVar;
        dVar2.f35412s = uVar;
        t3.j jVar = new t3.j(dVar2);
        a aVar = new a(uVar, dVar2);
        try {
            m mVar = this.f28750a;
            e a10 = mVar.a(new s.b(mVar.f28715c, jVar, mVar.f28716d), i10, i11, gVar, aVar);
            dVar2.f35413t = null;
            dVar2.f35412s = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(dVar2);
            }
            if (z10) {
                uVar.release();
            }
            return a10;
        } catch (Throwable th) {
            dVar2.f35413t = null;
            dVar2.f35412s = null;
            ArrayDeque arrayDeque2 = t3.d.f35411u;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(dVar2);
                if (z10) {
                    uVar.release();
                }
                throw th;
            }
        }
    }
}
