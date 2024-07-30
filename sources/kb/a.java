package kb;

import androidx.activity.n;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes2.dex */
public final class a implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            x509Certificate.getSubjectDN().getName();
            c.a(str, x509Certificate);
            return true;
        } catch (SSLException e10) {
            n.e0("", "SSLException : " + e10.getMessage());
            return false;
        }
    }
}
