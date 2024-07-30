package okhttp3;

import com.huawei.openalliance.ad.constant.w;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

/* loaded from: classes2.dex */
public final class Address {

    @Nullable
    final CertificatePinner certificatePinner;
    final List<ConnectionSpec> connectionSpecs;
    final Dns dns;

    @Nullable
    final HostnameVerifier hostnameVerifier;
    final List<Protocol> protocols;

    @Nullable
    final Proxy proxy;
    final Authenticator proxyAuthenticator;
    final ProxySelector proxySelector;
    final SocketFactory socketFactory;

    @Nullable
    final SSLSocketFactory sslSocketFactory;
    final HttpUrl url;

    public Address(String str, int i10, Dns dns, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable CertificatePinner certificatePinner, Authenticator authenticator, @Nullable Proxy proxy, List<Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector) {
        String str2;
        HttpUrl.Builder builder = new HttpUrl.Builder();
        if (sSLSocketFactory != null) {
            str2 = "https";
        } else {
            str2 = "http";
        }
        this.url = builder.scheme(str2).host(str).port(i10).build();
        if (dns != null) {
            this.dns = dns;
            if (socketFactory != null) {
                this.socketFactory = socketFactory;
                if (authenticator != null) {
                    this.proxyAuthenticator = authenticator;
                    if (list != null) {
                        this.protocols = Util.immutableList(list);
                        if (list2 != null) {
                            this.connectionSpecs = Util.immutableList(list2);
                            if (proxySelector != null) {
                                this.proxySelector = proxySelector;
                                this.proxy = proxy;
                                this.sslSocketFactory = sSLSocketFactory;
                                this.hostnameVerifier = hostnameVerifier;
                                this.certificatePinner = certificatePinner;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    @Nullable
    public CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public Dns dns() {
        return this.dns;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            if (this.url.equals(address.url) && equalsNonHost(address)) {
                return true;
            }
        }
        return false;
    }

    public boolean equalsNonHost(Address address) {
        if (this.dns.equals(address.dns) && this.proxyAuthenticator.equals(address.proxyAuthenticator) && this.protocols.equals(address.protocols) && this.connectionSpecs.equals(address.connectionSpecs) && this.proxySelector.equals(address.proxySelector) && Objects.equals(this.proxy, address.proxy) && Objects.equals(this.sslSocketFactory, address.sslSocketFactory) && Objects.equals(this.hostnameVerifier, address.hostnameVerifier) && Objects.equals(this.certificatePinner, address.certificatePinner) && url().port() == address.url().port()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.certificatePinner) + ((Objects.hashCode(this.hostnameVerifier) + ((Objects.hashCode(this.sslSocketFactory) + ((Objects.hashCode(this.proxy) + ((this.proxySelector.hashCode() + ((this.connectionSpecs.hashCode() + ((this.protocols.hashCode() + ((this.proxyAuthenticator.hashCode() + ((this.dns.hashCode() + ((this.url.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Nullable
    public HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public List<Protocol> protocols() {
        return this.protocols;
    }

    @Nullable
    public Proxy proxy() {
        return this.proxy;
    }

    public Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public SocketFactory socketFactory() {
        return this.socketFactory;
    }

    @Nullable
    public SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Address{");
        sb2.append(this.url.host());
        sb2.append(w.bE);
        sb2.append(this.url.port());
        if (this.proxy != null) {
            sb2.append(", proxy=");
            sb2.append(this.proxy);
        } else {
            sb2.append(", proxySelector=");
            sb2.append(this.proxySelector);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public HttpUrl url() {
        return this.url;
    }
}
