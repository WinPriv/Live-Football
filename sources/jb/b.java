package jb;

import android.os.Build;
import androidx.activity.n;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public final class b extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    public final SSLContext f30196a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f30197b;

    public b(c cVar) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        SSLContext sSLContext;
        this.f30196a = null;
        if (Build.VERSION.SDK_INT >= 29) {
            sSLContext = SSLContext.getInstance("TLSv1.3");
        } else {
            sSLContext = SSLContext.getInstance("TLSv1.2");
        }
        this.f30196a = sSLContext;
        sSLContext.init(null, new X509TrustManager[]{cVar}, null);
    }

    public static void a(Socket socket) {
        n.j0("b", "set default protocols");
        a.b((SSLSocket) socket);
        n.j0("b", "set default cipher suites");
        SSLSocket sSLSocket = (SSLSocket) socket;
        if (sSLSocket != null && !a.c(sSLSocket, a.f30194a)) {
            a.a(sSLSocket, a.f30195b);
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10) throws IOException {
        n.j0("b", "createSocket: host , port");
        Socket createSocket = this.f30196a.getSocketFactory().createSocket(str, i10);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            this.f30197b = (String[]) ((SSLSocket) createSocket).getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] strArr = this.f30197b;
        if (strArr != null) {
            return strArr;
        }
        return new String[0];
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i10);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException, UnknownHostException {
        return createSocket(str, i10);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i10);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        n.j0("b", "createSocket s host port autoClose");
        Socket createSocket = this.f30196a.getSocketFactory().createSocket(socket, str, i10, z10);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            this.f30197b = (String[]) ((SSLSocket) createSocket).getEnabledCipherSuites().clone();
        }
        return createSocket;
    }
}
