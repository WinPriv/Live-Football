package okhttp3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.Util;

/* loaded from: classes2.dex */
public final class Handshake {
    private final CipherSuite cipherSuite;
    private final List<Certificate> localCertificates;
    private final List<Certificate> peerCertificates;
    private final TlsVersion tlsVersion;

    private Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<Certificate> list, List<Certificate> list2) {
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.peerCertificates = list;
        this.localCertificates = list2;
    }

    public static Handshake get(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        List emptyList;
        List emptyList2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
                CipherSuite forJavaName = CipherSuite.forJavaName(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol != null) {
                    if (!"NONE".equals(protocol)) {
                        TlsVersion forJavaName2 = TlsVersion.forJavaName(protocol);
                        try {
                            certificateArr = sSLSession.getPeerCertificates();
                        } catch (SSLPeerUnverifiedException unused) {
                            certificateArr = null;
                        }
                        if (certificateArr != null) {
                            emptyList = Util.immutableList(certificateArr);
                        } else {
                            emptyList = Collections.emptyList();
                        }
                        Certificate[] localCertificates = sSLSession.getLocalCertificates();
                        if (localCertificates != null) {
                            emptyList2 = Util.immutableList(localCertificates);
                        } else {
                            emptyList2 = Collections.emptyList();
                        }
                        return new Handshake(forJavaName2, forJavaName, emptyList, emptyList2);
                    }
                    throw new IOException("tlsVersion == NONE");
                }
                throw new IllegalStateException("tlsVersion == null");
            }
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    private List<String> names(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate certificate : list) {
            if (certificate instanceof X509Certificate) {
                arrayList.add(String.valueOf(((X509Certificate) certificate).getSubjectDN()));
            } else {
                arrayList.add(certificate.getType());
            }
        }
        return arrayList;
    }

    public CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        if (!this.tlsVersion.equals(handshake.tlsVersion) || !this.cipherSuite.equals(handshake.cipherSuite) || !this.peerCertificates.equals(handshake.peerCertificates) || !this.localCertificates.equals(handshake.localCertificates)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.localCertificates.hashCode() + ((this.peerCertificates.hashCode() + ((this.cipherSuite.hashCode() + ((this.tlsVersion.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31);
    }

    public List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    @Nullable
    public Principal localPrincipal() {
        if (!this.localCertificates.isEmpty()) {
            return ((X509Certificate) this.localCertificates.get(0)).getSubjectX500Principal();
        }
        return null;
    }

    public List<Certificate> peerCertificates() {
        return this.peerCertificates;
    }

    @Nullable
    public Principal peerPrincipal() {
        if (!this.peerCertificates.isEmpty()) {
            return ((X509Certificate) this.peerCertificates.get(0)).getSubjectX500Principal();
        }
        return null;
    }

    public TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    public String toString() {
        return "Handshake{tlsVersion=" + this.tlsVersion + " cipherSuite=" + this.cipherSuite + " peerCertificates=" + names(this.peerCertificates) + " localCertificates=" + names(this.localCertificates) + '}';
    }

    public static Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<Certificate> list, List<Certificate> list2) {
        if (tlsVersion == null) {
            throw new NullPointerException("tlsVersion == null");
        }
        if (cipherSuite != null) {
            return new Handshake(tlsVersion, cipherSuite, Util.immutableList(list), Util.immutableList(list2));
        }
        throw new NullPointerException("cipherSuite == null");
    }
}
