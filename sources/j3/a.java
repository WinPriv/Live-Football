package j3;

import a3.x;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import t3.l;
import y2.g;
import y2.i;

/* compiled from: AnimatedWebpDecoder.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List<ImageHeaderParser> f29630a;

    /* renamed from: b, reason: collision with root package name */
    public final b3.b f29631b;

    /* compiled from: AnimatedWebpDecoder.java */
    /* renamed from: j3.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0405a implements x<Drawable> {

        /* renamed from: s, reason: collision with root package name */
        public final AnimatedImageDrawable f29632s;

        public C0405a(AnimatedImageDrawable animatedImageDrawable) {
            this.f29632s = animatedImageDrawable;
        }

        @Override // a3.x
        public final void a() {
            AnimatedImageDrawable animatedImageDrawable = this.f29632s;
            animatedImageDrawable.stop();
            animatedImageDrawable.clearAnimationCallbacks();
        }

        @Override // a3.x
        public final Class<Drawable> c() {
            return Drawable.class;
        }

        @Override // a3.x
        public final Drawable get() {
            return this.f29632s;
        }

        @Override // a3.x
        public final int getSize() {
            int intrinsicWidth;
            int intrinsicHeight;
            AnimatedImageDrawable animatedImageDrawable = this.f29632s;
            intrinsicWidth = animatedImageDrawable.getIntrinsicWidth();
            intrinsicHeight = animatedImageDrawable.getIntrinsicHeight();
            int i10 = intrinsicHeight * intrinsicWidth;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            char[] cArr = l.f35429a;
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            int i11 = l.a.f35432a[config.ordinal()];
            int i12 = 1;
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    i12 = 4;
                    if (i11 == 4) {
                        i12 = 8;
                    }
                } else {
                    i12 = 2;
                }
            }
            return i12 * i10 * 2;
        }
    }

    /* compiled from: AnimatedWebpDecoder.java */
    /* loaded from: classes.dex */
    public static final class b implements i<ByteBuffer, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        public final a f29633a;

        public b(a aVar) {
            this.f29633a = aVar;
        }

        @Override // y2.i
        public final boolean a(ByteBuffer byteBuffer, g gVar) throws IOException {
            if (com.bumptech.glide.load.a.c(this.f29633a.f29630a, byteBuffer) == ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return true;
            }
            return false;
        }

        @Override // y2.i
        public final x<Drawable> b(ByteBuffer byteBuffer, int i10, int i11, g gVar) throws IOException {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(byteBuffer);
            this.f29633a.getClass();
            return a.a(createSource, i10, i11, gVar);
        }
    }

    /* compiled from: AnimatedWebpDecoder.java */
    /* loaded from: classes.dex */
    public static final class c implements i<InputStream, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        public final a f29634a;

        public c(a aVar) {
            this.f29634a = aVar;
        }

        @Override // y2.i
        public final boolean a(InputStream inputStream, g gVar) throws IOException {
            a aVar = this.f29634a;
            List<ImageHeaderParser> list = aVar.f29630a;
            if (com.bumptech.glide.load.a.b(aVar.f29631b, inputStream, list) == ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return true;
            }
            return false;
        }

        @Override // y2.i
        public final x<Drawable> b(InputStream inputStream, int i10, int i11, g gVar) throws IOException {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(t3.a.b(inputStream));
            this.f29634a.getClass();
            return a.a(createSource, i10, i11, gVar);
        }
    }

    public a(List<ImageHeaderParser> list, b3.b bVar) {
        this.f29630a = list;
        this.f29631b = bVar;
    }

    public static C0405a a(ImageDecoder.Source source, int i10, int i11, g gVar) throws IOException {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new g3.a(i10, i11, gVar));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return new C0405a((AnimatedImageDrawable) decodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + decodeDrawable);
    }
}
