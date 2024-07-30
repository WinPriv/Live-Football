package ka;

import android.content.Context;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public final class cb implements X509TrustManager {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f31038a = new ArrayList();

    public cb(Context context) {
        if (context != null) {
            InputStream inputStream = null;
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
                KeyStore keyStore = KeyStore.getInstance("bks");
                inputStream = context.getAssets().open("hiadrootcas.bks");
                inputStream.reset();
                keyStore.load(inputStream, "".toCharArray());
                trustManagerFactory.init(keyStore);
                for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                    if (trustManager instanceof X509TrustManager) {
                        this.f31038a.add((X509TrustManager) trustManager);
                    }
                }
                if (!this.f31038a.isEmpty()) {
                    return;
                } else {
                    throw new CertificateException("X509TrustManager is empty");
                }
            } finally {
                androidx.transition.n.D(inputStream);
            }
        }
        throw new IllegalArgumentException(com.anythink.expressad.foundation.g.b.b.f9831a);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        ArrayList arrayList = this.f31038a;
        if (!arrayList.isEmpty()) {
            ((X509TrustManager) arrayList.get(0)).checkClientTrusted(x509CertificateArr, str);
            return;
        }
        throw new CertificateException("checkClientTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        ArrayList arrayList = this.f31038a;
        if (!arrayList.isEmpty()) {
            ((X509TrustManager) arrayList.get(0)).checkServerTrusted(x509CertificateArr, str);
            return;
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f31038a.iterator();
            while (it.hasNext()) {
                arrayList.addAll(Arrays.asList(((X509TrustManager) it.next()).getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e10) {
            n7.i("SecureX509TrustManager", "getAcceptedIssuers exception : ".concat(e10.getClass().getSimpleName()));
            return new X509Certificate[0];
        }
    }
}
