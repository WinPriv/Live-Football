package xb;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class b implements Callable<com.ironsource.sdk.k.b> {

    /* renamed from: a, reason: collision with root package name */
    public final a f36518a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36519b;

    /* renamed from: c, reason: collision with root package name */
    public long f36520c = 3;

    public b(a aVar, String str) {
        this.f36518a = aVar;
        this.f36519b = str;
    }

    public static byte[] b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0130 A[Catch: all -> 0x012c, TRY_LEAVE, TryCatch #11 {all -> 0x012c, blocks: (B:108:0x0128, B:100:0x0130), top: B:107:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0195 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0105 A[Catch: all -> 0x0120, TRY_LEAVE, TryCatch #0 {all -> 0x0120, blocks: (B:144:0x00fb, B:146:0x0105), top: B:143:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0116 A[Catch: all -> 0x0112, TRY_LEAVE, TryCatch #31 {all -> 0x0112, blocks: (B:152:0x010e, B:149:0x0116), top: B:151:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019a A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ironsource.sdk.k.b call() {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.b.call():com.ironsource.sdk.k.b");
    }
}
