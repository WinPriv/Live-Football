package p4;

import java.io.IOException;

/* compiled from: ExtractorInput.java */
/* loaded from: classes2.dex */
public interface i extends c6.h {
    boolean a(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    boolean c(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    long d();

    void e(int i10) throws IOException;

    long getLength();

    long getPosition();

    void h();

    void i(int i10) throws IOException;

    void j(byte[] bArr, int i10, int i11) throws IOException;

    @Override // c6.h
    int read(byte[] bArr, int i10, int i11) throws IOException;

    void readFully(byte[] bArr, int i10, int i11) throws IOException;
}
