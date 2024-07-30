package com.huawei.openalliance.ad.inter.data;

import com.huawei.hms.ads.ex;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public interface e extends d, Serializable {

    /* loaded from: classes2.dex */
    public static class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r0v8, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
        /* JADX WARN: Type inference failed for: r0v9 */
        public static String a(e eVar) {
            ObjectOutputStream objectOutputStream;
            ObjectOutputStream objectOutputStream2 = null;
            byte[] bArr = null;
            objectOutputStream2 = null;
            if (!(eVar instanceof j)) {
                return null;
            }
            AdContentData adContentData = ((j) eVar).Code;
            ?? r02 = a0.a.f10g0;
            try {
                if (adContentData == null) {
                    return "";
                }
                try {
                    r02 = new ByteArrayOutputStream();
                    try {
                        objectOutputStream = new ObjectOutputStream(r02);
                        try {
                            objectOutputStream.writeObject(adContentData);
                            objectOutputStream.flush();
                            bArr = r02.toByteArray();
                            r02 = r02;
                        } catch (IOException unused) {
                            ex.Z("a", "fail to get sequence");
                            r02 = r02;
                            androidx.transition.n.g(objectOutputStream);
                            androidx.transition.n.g(r02);
                            return androidx.transition.n.f(bArr);
                        }
                    } catch (IOException unused2) {
                        objectOutputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        androidx.transition.n.g(objectOutputStream2);
                        androidx.transition.n.g(r02);
                        throw th;
                    }
                } catch (IOException unused3) {
                    r02 = 0;
                    objectOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    r02 = 0;
                }
                androidx.transition.n.g(objectOutputStream);
                androidx.transition.n.g(r02);
                return androidx.transition.n.f(bArr);
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream2 = objectOutputStream;
            }
        }
    }

    p B();

    h I();

    List<h> Z();

    boolean d_();

    List<FeedbackInfo> f_();

    List<String> l();

    List<String> o();
}
