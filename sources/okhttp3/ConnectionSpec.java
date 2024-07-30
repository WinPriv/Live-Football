package okhttp3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.Util;

/* loaded from: classes2.dex */
public final class ConnectionSpec {
    private static final CipherSuite[] APPROVED_CIPHER_SUITES;
    public static final ConnectionSpec CLEARTEXT;
    public static final ConnectionSpec COMPATIBLE_TLS;
    public static final ConnectionSpec MODERN_TLS;
    private static final CipherSuite[] RESTRICTED_CIPHER_SUITES;
    public static final ConnectionSpec RESTRICTED_TLS;

    @Nullable
    final String[] cipherSuites;
    final boolean supportsTlsExtensions;
    final boolean tls;

    @Nullable
    final String[] tlsVersions;

    static {
        CipherSuite cipherSuite = CipherSuite.TLS_AES_128_GCM_SHA256;
        CipherSuite cipherSuite2 = CipherSuite.TLS_AES_256_GCM_SHA384;
        CipherSuite cipherSuite3 = CipherSuite.TLS_CHACHA20_POLY1305_SHA256;
        CipherSuite cipherSuite4 = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
        CipherSuite cipherSuite5 = CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
        CipherSuite cipherSuite6 = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
        CipherSuite cipherSuite7 = CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
        CipherSuite cipherSuite8 = CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
        CipherSuite cipherSuite9 = CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
        CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9};
        RESTRICTED_CIPHER_SUITES = cipherSuiteArr;
        CipherSuite[] cipherSuiteArr2 = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        APPROVED_CIPHER_SUITES = cipherSuiteArr2;
        Builder cipherSuites = new Builder(true).cipherSuites(cipherSuiteArr);
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        RESTRICTED_TLS = cipherSuites.tlsVersions(tlsVersion, tlsVersion2).supportsTlsExtensions(true).build();
        MODERN_TLS = new Builder(true).cipherSuites(cipherSuiteArr2).tlsVersions(tlsVersion, tlsVersion2).supportsTlsExtensions(true).build();
        COMPATIBLE_TLS = new Builder(true).cipherSuites(cipherSuiteArr2).tlsVersions(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).supportsTlsExtensions(true).build();
        CLEARTEXT = new Builder(false).build();
    }

    public ConnectionSpec(Builder builder) {
        this.tls = builder.tls;
        this.cipherSuites = builder.cipherSuites;
        this.tlsVersions = builder.tlsVersions;
        this.supportsTlsExtensions = builder.supportsTlsExtensions;
    }

    private ConnectionSpec supportedSpec(SSLSocket sSLSocket, boolean z10) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.cipherSuites != null) {
            enabledCipherSuites = Util.intersect(CipherSuite.ORDER_BY_NAME, sSLSocket.getEnabledCipherSuites(), this.cipherSuites);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.tlsVersions != null) {
            enabledProtocols = Util.intersect(Util.NATURAL_ORDER, sSLSocket.getEnabledProtocols(), this.tlsVersions);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int indexOf = Util.indexOf(CipherSuite.ORDER_BY_NAME, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z10 && indexOf != -1) {
            enabledCipherSuites = Util.concat(enabledCipherSuites, supportedCipherSuites[indexOf]);
        }
        return new Builder(this).cipherSuites(enabledCipherSuites).tlsVersions(enabledProtocols).build();
    }

    public void apply(SSLSocket sSLSocket, boolean z10) {
        ConnectionSpec supportedSpec = supportedSpec(sSLSocket, z10);
        String[] strArr = supportedSpec.tlsVersions;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = supportedSpec.cipherSuites;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    @Nullable
    public List<CipherSuite> cipherSuites() {
        String[] strArr = this.cipherSuites;
        if (strArr != null) {
            return CipherSuite.forJavaNames(strArr);
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        boolean z10 = this.tls;
        if (z10 != connectionSpec.tls) {
            return false;
        }
        if (z10 && (!Arrays.equals(this.cipherSuites, connectionSpec.cipherSuites) || !Arrays.equals(this.tlsVersions, connectionSpec.tlsVersions) || this.supportsTlsExtensions != connectionSpec.supportsTlsExtensions)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.tls) {
            return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.cipherSuites)) * 31) + Arrays.hashCode(this.tlsVersions)) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
        }
        return 17;
    }

    public boolean isCompatible(SSLSocket sSLSocket) {
        if (!this.tls) {
            return false;
        }
        String[] strArr = this.tlsVersions;
        if (strArr != null && !Util.nonEmptyIntersection(Util.NATURAL_ORDER, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.cipherSuites;
        if (strArr2 != null && !Util.nonEmptyIntersection(CipherSuite.ORDER_BY_NAME, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return false;
        }
        return true;
    }

    public boolean isTls() {
        return this.tls;
    }

    public boolean supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    @Nullable
    public List<TlsVersion> tlsVersions() {
        String[] strArr = this.tlsVersions;
        if (strArr != null) {
            return TlsVersion.forJavaNames(strArr);
        }
        return null;
    }

    public String toString() {
        if (!this.tls) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(cipherSuites(), "[all enabled]") + ", tlsVersions=" + Objects.toString(tlsVersions(), "[all enabled]") + ", supportsTlsExtensions=" + this.supportsTlsExtensions + ")";
    }

    /* loaded from: classes2.dex */
    public static final class Builder {

        @Nullable
        String[] cipherSuites;
        boolean supportsTlsExtensions;
        boolean tls;

        @Nullable
        String[] tlsVersions;

        public Builder(boolean z10) {
            this.tls = z10;
        }

        public Builder allEnabledCipherSuites() {
            if (this.tls) {
                this.cipherSuites = null;
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public Builder allEnabledTlsVersions() {
            if (this.tls) {
                this.tlsVersions = null;
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public ConnectionSpec build() {
            return new ConnectionSpec(this);
        }

        public Builder cipherSuites(CipherSuite... cipherSuiteArr) {
            if (this.tls) {
                String[] strArr = new String[cipherSuiteArr.length];
                for (int i10 = 0; i10 < cipherSuiteArr.length; i10++) {
                    strArr[i10] = cipherSuiteArr[i10].javaName;
                }
                return cipherSuites(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public Builder supportsTlsExtensions(boolean z10) {
            if (this.tls) {
                this.supportsTlsExtensions = z10;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public Builder tlsVersions(TlsVersion... tlsVersionArr) {
            if (this.tls) {
                String[] strArr = new String[tlsVersionArr.length];
                for (int i10 = 0; i10 < tlsVersionArr.length; i10++) {
                    strArr[i10] = tlsVersionArr[i10].javaName;
                }
                return tlsVersions(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public Builder(ConnectionSpec connectionSpec) {
            this.tls = connectionSpec.tls;
            this.cipherSuites = connectionSpec.cipherSuites;
            this.tlsVersions = connectionSpec.tlsVersions;
            this.supportsTlsExtensions = connectionSpec.supportsTlsExtensions;
        }

        public Builder cipherSuites(String... strArr) {
            if (this.tls) {
                if (strArr.length != 0) {
                    this.cipherSuites = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public Builder tlsVersions(String... strArr) {
            if (this.tls) {
                if (strArr.length != 0) {
                    this.tlsVersions = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }
}
