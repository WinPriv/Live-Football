package ka;

import android.content.Context;
import android.os.Build;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;

/* loaded from: classes2.dex */
public final class bb extends SSLSocketFactory {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f30979b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile bb f30980c;

    /* renamed from: d, reason: collision with root package name */
    public static String[] f30981d;

    /* renamed from: a, reason: collision with root package name */
    public final SSLContext f30982a;

    static {
        new BrowserCompatHostnameVerifier();
        new StrictHostnameVerifier();
        f30979b = new String[]{"TEA", "SHA0", "MD2", "MD4", "RIPEMD", "NULL", "RC4", "DES", "DESX", "DES40", "RC2", "MD5", "ANON", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", "TLS_RSA", "aNULL", "eNULL", "CBC"};
        f30980c = null;
        f30981d = null;
    }

    public bb(Context context) {
        this.f30982a = null;
        SSLContext a10 = com.huawei.openalliance.ad.ppskit.utils.s1.a();
        this.f30982a = a10;
        a10.init(null, new X509TrustManager[]{new cb(context)}, null);
    }

    public static void a(Socket socket) {
        boolean z10;
        if (socket != null && (socket instanceof SSLSocket)) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                sSLSocket.setEnabledProtocols(new String[]{"TLSv1.3", "TLSv1.2"});
            } else if (i10 < 29) {
                sSLSocket.setEnabledProtocols(new String[]{"TLSv1.2"});
            }
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            ArrayList arrayList = new ArrayList();
            for (String str : enabledCipherSuites) {
                String upperCase = str.toUpperCase(Locale.ENGLISH);
                String[] strArr = f30979b;
                int length = strArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        if (upperCase.contains(strArr[i11].toUpperCase(Locale.ENGLISH))) {
                            z10 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    arrayList.add(str);
                }
            }
            String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
            f30981d = strArr2;
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10) {
        Socket createSocket = this.f30982a.getSocketFactory().createSocket(str, i10);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        String[] strArr = f30981d;
        if (strArr != null) {
            return (String[]) strArr.clone();
        }
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        return createSocket(str, i10);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10) {
        return createSocket(inetAddress.getHostAddress(), i10);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        return createSocket(inetAddress.getHostAddress(), i10);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i10, boolean z10) {
        Socket createSocket = this.f30982a.getSocketFactory().createSocket(socket, str, i10, z10);
        a(createSocket);
        return createSocket;
    }
}
