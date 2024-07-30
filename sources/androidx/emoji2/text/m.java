package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

/* compiled from: MetadataListReader.java */
/* loaded from: classes.dex */
public final class m {

    /* compiled from: MetadataListReader.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f1664a;

        public a(ByteBuffer byteBuffer) {
            this.f1664a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final long a() throws IOException {
            return this.f1664a.getInt() & 4294967295L;
        }

        public final void b(int i10) throws IOException {
            ByteBuffer byteBuffer = this.f1664a;
            byteBuffer.position(byteBuffer.position() + i10);
        }
    }

    public static v0.b a(MappedByteBuffer mappedByteBuffer) throws IOException {
        ByteBuffer byteBuffer;
        long j10;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        a aVar = new a(duplicate);
        aVar.b(4);
        int i10 = duplicate.getShort() & 65535;
        if (i10 <= 100) {
            aVar.b(6);
            int i11 = 0;
            while (true) {
                byteBuffer = aVar.f1664a;
                if (i11 < i10) {
                    int i12 = byteBuffer.getInt();
                    aVar.b(4);
                    j10 = aVar.a();
                    aVar.b(4);
                    if (1835365473 == i12) {
                        break;
                    }
                    i11++;
                } else {
                    j10 = -1;
                    break;
                }
            }
            if (j10 != -1) {
                aVar.b((int) (j10 - duplicate.position()));
                aVar.b(12);
                long a10 = aVar.a();
                for (int i13 = 0; i13 < a10; i13++) {
                    int i14 = byteBuffer.getInt();
                    long a11 = aVar.a();
                    aVar.a();
                    if (1164798569 == i14 || 1701669481 == i14) {
                        duplicate.position((int) (a11 + j10));
                        v0.b bVar = new v0.b();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        bVar.b(duplicate.position() + duplicate.getInt(duplicate.position()), duplicate);
                        return bVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }
}
