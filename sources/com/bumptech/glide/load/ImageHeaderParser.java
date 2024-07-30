package com.bumptech.glide.load;

import b3.b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface ImageHeaderParser {

    /* loaded from: classes.dex */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        UNKNOWN(false);


        /* renamed from: s, reason: collision with root package name */
        public final boolean f19752s;

        ImageType(boolean z10) {
            this.f19752s = z10;
        }

        public boolean hasAlpha() {
            return this.f19752s;
        }

        public boolean isWebp() {
            int i10 = a.f19753a[ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19753a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f19753a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19753a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19753a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    ImageType a(ByteBuffer byteBuffer) throws IOException;

    ImageType b(InputStream inputStream) throws IOException;

    int c(InputStream inputStream, b bVar) throws IOException;

    int d(ByteBuffer byteBuffer, b bVar) throws IOException;
}
