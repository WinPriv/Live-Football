package com.huawei.hms.framework.common;

import android.database.Cursor;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/* loaded from: classes2.dex */
public class IoUtils {
    private static final int BUFF_SIZE = 4096;
    private static final int MAX_SIZE = 16777216;

    private IoUtils() {
    }

    public static void close(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    public static void closeSecure(Reader reader) {
        closeSecure((Closeable) reader);
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        String str;
        if (ContextHolder.getAppContext() != null) {
            str = ContextHolder.getAppContext().getPackageName();
        } else {
            str = "";
        }
        byte[] bArr = new byte[BUFF_SIZE];
        long j10 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                if (j10 > 16777216 && !"com.huawei.health".equals(str)) {
                    throw new IOException("input data too large for byte.");
                }
                outputStream.write(bArr, 0, read);
                j10 += read;
            } else {
                return j10;
            }
        }
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static void closeSecure(Writer writer) {
        closeSecure((Closeable) writer);
    }

    public static void closeSecure(InputStream inputStream) {
        closeSecure((Closeable) inputStream);
    }

    public static void closeSecure(OutputStream outputStream) {
        closeSecure((Closeable) outputStream);
    }

    public static void closeSecure(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
                return;
            } catch (IOException e10) {
                Logger.w("IOUtil", "closeSecure IOException", e10);
                return;
            }
        }
        Logger.w("IOUtil", "closeable is null");
    }
}
