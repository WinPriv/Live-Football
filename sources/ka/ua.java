package ka;

import android.util.Pair;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
public abstract class ua<R> implements ab<R> {

    /* renamed from: a, reason: collision with root package name */
    public long f31942a;

    @Override // ka.ab
    public final long a() {
        return this.f31942a;
    }

    public abstract R b(String str);

    @Override // ka.ab
    public final Pair a(int i10, BufferedInputStream bufferedInputStream, long j10, na naVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (-1 == read) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
        this.f31942a = System.currentTimeMillis();
        R b10 = b(byteArrayOutputStream2);
        if (naVar != null) {
            naVar.a(b10);
        }
        return new Pair(b10, byteArrayOutputStream2);
    }
}
