package jb;

import androidx.activity.n;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public final class c implements X509TrustManager {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f30198a = new ArrayList();

    public c(InputStream inputStream) throws IllegalArgumentException {
        if (inputStream != null) {
            System.currentTimeMillis();
            try {
                try {
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
                    KeyStore keyStore = KeyStore.getInstance("bks");
                    keyStore.load(inputStream, "".toCharArray());
                    trustManagerFactory.init(keyStore);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    for (TrustManager trustManager : trustManagers) {
                        if (trustManager instanceof X509TrustManager) {
                            this.f30198a.add((X509TrustManager) trustManager);
                        }
                    }
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        n.e0("IOUtil", "closeSecure IOException");
                    }
                } catch (Throwable th) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                        n.e0("IOUtil", "closeSecure IOException");
                    }
                    throw th;
                }
            } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e10) {
                n.e0("c", "loadInputStream: exception : " + e10.getMessage());
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                    n.e0("IOUtil", "closeSecure IOException");
                }
            }
            System.currentTimeMillis();
            return;
        }
        throw new IllegalArgumentException("inputstream or trustPwd is null");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        n.j0("c", "checkClientTrusted: ");
        Iterator it = this.f30198a.iterator();
        while (it.hasNext()) {
            try {
                ((X509TrustManager) it.next()).checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e10) {
                n.e0("c", "checkServerTrusted CertificateException" + e10.getMessage());
            }
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        n.j0("c", "checkServerTrusted begin ,server ca chain size is : " + x509CertificateArr.length + " ,auth type is : " + str);
        System.currentTimeMillis();
        int length = x509CertificateArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            X509Certificate x509Certificate = x509CertificateArr[i10];
            Objects.toString(x509Certificate.getSubjectDN());
            Objects.toString(x509Certificate.getIssuerDN());
            Objects.toString(x509Certificate.getSerialNumber());
        }
        ArrayList arrayList = this.f30198a;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                n.j0("c", "check server i : " + i11);
                X509TrustManager x509TrustManager = (X509TrustManager) arrayList.get(i11);
                X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                if (acceptedIssuers != null) {
                    n.j0("c", "client root ca size is : " + acceptedIssuers.length);
                    for (int i12 = 0; i12 < acceptedIssuers.length; i12++) {
                        Objects.toString(acceptedIssuers[i12].getIssuerDN());
                    }
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                n.j0("c", "checkServerTrusted succeed ,root ca issuer is : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                return;
            } catch (CertificateException e10) {
                n.e0("c", "checkServerTrusted error :" + e10.getMessage() + " , time : " + i11);
                if (i11 == size - 1) {
                    if (x509CertificateArr.length > 0) {
                        n.e0("c", "root ca issuer : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                    }
                    throw e10;
                }
            }
        }
        System.currentTimeMillis();
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f30198a.iterator();
            while (it.hasNext()) {
                arrayList.addAll(Arrays.asList(((X509TrustManager) it.next()).getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e10) {
            n.e0("c", "getAcceptedIssuers exception : " + e10.getMessage());
            return new X509Certificate[0];
        }
    }
}
