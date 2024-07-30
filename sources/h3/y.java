package h3;

import android.graphics.Bitmap;
import java.io.IOException;

/* compiled from: UnitBitmapDecoder.java */
/* loaded from: classes.dex */
public final class y implements y2.i<Bitmap, Bitmap> {
    @Override // y2.i
    public final /* bridge */ /* synthetic */ boolean a(Bitmap bitmap, y2.g gVar) throws IOException {
        return true;
    }

    @Override // y2.i
    public final a3.x<Bitmap> b(Bitmap bitmap, int i10, int i11, y2.g gVar) throws IOException {
        return new a(bitmap);
    }

    /* compiled from: UnitBitmapDecoder.java */
    /* loaded from: classes.dex */
    public static final class a implements a3.x<Bitmap> {

        /* renamed from: s, reason: collision with root package name */
        public final Bitmap f28756s;

        public a(Bitmap bitmap) {
            this.f28756s = bitmap;
        }

        @Override // a3.x
        public final Class<Bitmap> c() {
            return Bitmap.class;
        }

        @Override // a3.x
        public final Bitmap get() {
            return this.f28756s;
        }

        @Override // a3.x
        public final int getSize() {
            return t3.l.c(this.f28756s);
        }

        @Override // a3.x
        public final void a() {
        }
    }
}
