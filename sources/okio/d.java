package okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: BufferedSource.java */
/* loaded from: classes2.dex */
public interface d extends z, ReadableByteChannel {
    long A() throws IOException;

    String B(long j10) throws IOException;

    long D(b bVar) throws IOException;

    String I(Charset charset) throws IOException;

    boolean L(long j10) throws IOException;

    String M() throws IOException;

    byte[] N(long j10) throws IOException;

    void T(long j10) throws IOException;

    long V() throws IOException;

    int W(r rVar) throws IOException;

    e a(long j10) throws IOException;

    InputStream inputStream();

    @Deprecated
    b n();

    u peek();

    byte[] r() throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    void skip(long j10) throws IOException;

    b t();

    boolean u() throws IOException;

    void w(b bVar, long j10) throws IOException;

    long y(e eVar) throws IOException;
}
