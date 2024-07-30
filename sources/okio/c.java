package okio;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* compiled from: BufferedSink.java */
/* loaded from: classes2.dex */
public interface c extends y, WritableByteChannel {
    c G(String str) throws IOException;

    long J(z zVar) throws IOException;

    c K(long j10) throws IOException;

    c O(e eVar) throws IOException;

    c U(long j10) throws IOException;

    @Override // okio.y, java.io.Flushable
    void flush() throws IOException;

    b n();

    c q() throws IOException;

    c write(byte[] bArr) throws IOException;

    c write(byte[] bArr, int i10, int i11) throws IOException;

    c writeByte(int i10) throws IOException;

    c writeInt(int i10) throws IOException;

    c writeShort(int i10) throws IOException;

    c z() throws IOException;
}
