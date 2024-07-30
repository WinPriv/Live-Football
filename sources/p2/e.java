package p2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: NetworkCache.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final d f34235a;

    public e(g2.c cVar) {
        this.f34235a = cVar;
    }

    public static String a(String str, c cVar, boolean z10) {
        StringBuilder sb2 = new StringBuilder("lottie_cache_");
        sb2.append(str.replaceAll("\\W+", ""));
        String str2 = cVar.f34234s;
        if (z10) {
            str2 = ".temp" + str2;
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public final File b() {
        g2.c cVar = (g2.c) this.f34235a;
        cVar.getClass();
        File file = new File(cVar.f28369a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File c(String str, InputStream inputStream, c cVar) throws IOException {
        File file = new File(b(), a(str, cVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        return file;
                    }
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }
}
