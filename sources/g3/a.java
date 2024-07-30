package g3;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import h3.l;
import h3.m;
import h3.r;
import y2.f;
import y2.g;
import y2.h;

/* compiled from: DefaultOnHeaderDecodedListener.java */
/* loaded from: classes.dex */
public final class a implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final r f28472a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28473b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28474c;

    /* renamed from: d, reason: collision with root package name */
    public final y2.b f28475d;

    /* renamed from: e, reason: collision with root package name */
    public final l f28476e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final h f28477g;

    /* compiled from: DefaultOnHeaderDecodedListener.java */
    /* renamed from: g3.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0386a implements ImageDecoder.OnPartialImageListener {
        @Override // android.graphics.ImageDecoder.OnPartialImageListener
        public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public a(int i10, int i11, g gVar) {
        boolean z10;
        if (r.f28725j == null) {
            synchronized (r.class) {
                if (r.f28725j == null) {
                    r.f28725j = new r();
                }
            }
        }
        this.f28472a = r.f28725j;
        this.f28473b = i10;
        this.f28474c = i11;
        this.f28475d = (y2.b) gVar.c(m.f);
        this.f28476e = (l) gVar.c(l.f);
        f<Boolean> fVar = m.f28710i;
        if (gVar.c(fVar) != null && ((Boolean) gVar.c(fVar)).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f = z10;
        this.f28477g = (h) gVar.c(m.f28708g);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        boolean z10 = false;
        if (this.f28472a.a(this.f28473b, this.f28474c, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f28475d == y2.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C0386a());
        size = imageInfo.getSize();
        int i10 = this.f28473b;
        if (i10 == Integer.MIN_VALUE) {
            i10 = size.getWidth();
        }
        int i11 = this.f28474c;
        if (i11 == Integer.MIN_VALUE) {
            i11 = size.getHeight();
        }
        float b10 = this.f28476e.b(size.getWidth(), size.getHeight(), i10, i11);
        int round = Math.round(size.getWidth() * b10);
        int round2 = Math.round(size.getHeight() * b10);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b10);
        }
        imageDecoder.setTargetSize(round, round2);
        h hVar = this.f28477g;
        if (hVar != null) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                if (hVar == h.DISPLAY_P3) {
                    colorSpace3 = imageInfo.getColorSpace();
                    if (colorSpace3 != null) {
                        colorSpace4 = imageInfo.getColorSpace();
                        isWideGamut = colorSpace4.isWideGamut();
                        if (isWideGamut) {
                            z10 = true;
                        }
                    }
                }
                colorSpace2 = ColorSpace.get(z10 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                imageDecoder.setTargetColorSpace(colorSpace2);
                return;
            }
            if (i12 >= 26) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                imageDecoder.setTargetColorSpace(colorSpace);
            }
        }
    }
}
