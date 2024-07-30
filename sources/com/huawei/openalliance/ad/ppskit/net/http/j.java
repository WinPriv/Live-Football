package com.huawei.openalliance.ad.ppskit.net.http;

import com.huawei.openalliance.ad.ppskit.utils.s1;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import ka.n7;

/* loaded from: classes2.dex */
public final class j extends SSLSocketFactory {

    /* renamed from: c, reason: collision with root package name */
    public static j f22786c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f22787d = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final SSLContext f22788a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22789b;

    public j(boolean z10) {
        SSLContext sSLContext;
        this.f22789b = true;
        if (z10) {
            sSLContext = s1.a();
        } else {
            sSLContext = SSLContext.getInstance("TLS");
        }
        this.f22788a = sSLContext;
        this.f22789b = z10;
        this.f22788a.init(null, null, null);
    }

    public static SSLSocketFactory a(boolean z10) {
        String str;
        String str2;
        synchronized (f22787d) {
            try {
                try {
                    if (f22786c == null) {
                        f22786c = new j(z10);
                    }
                    return f22786c;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (IOException unused) {
                str = "j";
                str2 = "Failed to new SSLSocketFactory instance. IOException";
                n7.g(str, str2);
                return null;
            } catch (KeyManagementException unused2) {
                str = "j";
                str2 = "Failed to new SSLSocketFactory instance. KeyManagementException";
                n7.g(str, str2);
                return null;
            } catch (KeyStoreException unused3) {
                str = "j";
                str2 = "Failed to new SSLSocketFactory instance. KeyStoreException";
                n7.g(str, str2);
                return null;
            } catch (NoSuchAlgorithmException unused4) {
                str = "j";
                str2 = "Failed to new SSLSocketFactory instance. NoSuchAlgorithmException";
                n7.g(str, str2);
                return null;
            } catch (GeneralSecurityException unused5) {
                str = "j";
                str2 = "Failed to new SSLSocketFactory instance. GeneralSecurityException";
                n7.g(str, str2);
                return null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.net.Socket r9) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.net.http.j.b(java.net.Socket):void");
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10) {
        Socket createSocket = this.f22788a.getSocketFactory().createSocket(str, i10);
        b(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        Socket createSocket = this.f22788a.getSocketFactory().createSocket(str, i10, inetAddress, i11);
        b(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10) {
        Socket createSocket = this.f22788a.getSocketFactory().createSocket(inetAddress, i10);
        b(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        Socket createSocket = this.f22788a.getSocketFactory().createSocket(inetAddress, i10, inetAddress2, i11);
        b(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i10, boolean z10) {
        Socket createSocket = this.f22788a.getSocketFactory().createSocket(socket, str, i10, z10);
        b(createSocket);
        return createSocket;
    }
}
