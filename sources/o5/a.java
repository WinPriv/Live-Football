package o5;

import android.net.Uri;
import c6.h0;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Aes128DataSource.java */
/* loaded from: classes2.dex */
public final class a implements c6.j {

    /* renamed from: a, reason: collision with root package name */
    public final c6.j f33625a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f33626b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f33627c;

    /* renamed from: d, reason: collision with root package name */
    public CipherInputStream f33628d;

    public a(c6.j jVar, byte[] bArr, byte[] bArr2) {
        this.f33625a = jVar;
        this.f33626b = bArr;
        this.f33627c = bArr2;
    }

    @Override // c6.j
    public final void b(h0 h0Var) {
        h0Var.getClass();
        this.f33625a.b(h0Var);
    }

    @Override // c6.j
    public final void close() throws IOException {
        if (this.f33628d != null) {
            this.f33628d = null;
            this.f33625a.close();
        }
    }

    @Override // c6.j
    public final long f(c6.m mVar) throws IOException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f33626b, "AES"), new IvParameterSpec(this.f33627c));
                c6.l lVar = new c6.l(this.f33625a, mVar);
                this.f33628d = new CipherInputStream(lVar, cipher);
                lVar.b();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // c6.j
    public final Map<String, List<String>> g() {
        return this.f33625a.g();
    }

    @Override // c6.j
    public final Uri getUri() {
        return this.f33625a.getUri();
    }

    @Override // c6.h
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        this.f33628d.getClass();
        int read = this.f33628d.read(bArr, i10, i11);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
