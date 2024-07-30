package com.anythink.expressad.b;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7095a = "UnzipUtility";

    /* renamed from: b, reason: collision with root package name */
    private static final int f7096b = 4096;

    /* JADX WARN: Code restructure failed: missing block: B:103:0x00eb, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00ef, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00f0, code lost:
    
        com.anythink.expressad.foundation.h.o.d(com.anythink.expressad.b.c.f7095a, r13.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0108, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x010c, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x010d, code lost:
    
        com.anythink.expressad.foundation.h.o.d(com.anythink.expressad.b.c.f7095a, r13.getMessage());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.b.c.a(java.lang.String, java.lang.String):int");
    }

    private static void a(ZipInputStream zipInputStream, String str) {
        BufferedOutputStream bufferedOutputStream;
        File file = new File(str);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e10) {
            e = e10;
        }
        try {
            byte[] bArr = new byte[f7096b];
            while (true) {
                int read = zipInputStream.read(bArr);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    bufferedOutputStream.close();
                    return;
                }
            }
        } catch (IOException e11) {
            e = e11;
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
            }
            throw th;
        }
    }
}
