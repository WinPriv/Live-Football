package com.bumptech.glide.load;

import b3.b;
import com.bumptech.glide.load.ImageHeaderParser;
import h3.u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: classes.dex */
public final class a {
    public static int a(b bVar, InputStream inputStream, List list) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new u(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                int c10 = ((ImageHeaderParser) list.get(i10)).c(inputStream, bVar);
                if (c10 != -1) {
                    return c10;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType b(b bVar, InputStream inputStream, List list) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new u(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ImageHeaderParser.ImageType b10 = ((ImageHeaderParser) list.get(i10)).b(inputStream);
                inputStream.reset();
                if (b10 != ImageHeaderParser.ImageType.UNKNOWN) {
                    return b10;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static ImageHeaderParser.ImageType c(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ImageHeaderParser.ImageType a10 = list.get(i10).a(byteBuffer);
                t3.a.c(byteBuffer);
                if (a10 != ImageHeaderParser.ImageType.UNKNOWN) {
                    return a10;
                }
            } catch (Throwable th) {
                t3.a.c(byteBuffer);
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
