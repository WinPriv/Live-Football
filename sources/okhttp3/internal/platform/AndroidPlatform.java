package okhttp3.internal.platform;

import android.os.Build;
import android.util.Log;
import com.huawei.openalliance.ad.constant.av;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.Util;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class AndroidPlatform extends Platform {
    private static final int MAX_LOG_LENGTH = 4000;
    private final CloseGuard closeGuard = CloseGuard.get();
    private final Method getAlpnSelectedProtocol;
    private final Method setAlpnProtocols;
    private final Method setHostname;
    private final Method setUseSessionTickets;
    private final Class<?> sslParametersClass;
    private final Class<?> sslSocketClass;

    /* loaded from: classes2.dex */
    public static final class AndroidCertificateChainCleaner extends CertificateChainCleaner {
        private final Method checkServerTrusted;
        private final Object x509TrustManagerExtensions;

        public AndroidCertificateChainCleaner(Object obj, Method method) {
            this.x509TrustManagerExtensions = obj;
            this.checkServerTrusted = method;
        }

        @Override // okhttp3.internal.tls.CertificateChainCleaner
        public List<Certificate> clean(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.checkServerTrusted.invoke(this.x509TrustManagerExtensions, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e11.getMessage());
                sSLPeerUnverifiedException.initCause(e11);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof AndroidCertificateChainCleaner;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* loaded from: classes2.dex */
    public static final class CloseGuard {
        private final Method getMethod;
        private final Method openMethod;
        private final Method warnIfOpenMethod;

        public CloseGuard(Method method, Method method2, Method method3) {
            this.getMethod = method;
            this.openMethod = method2;
            this.warnIfOpenMethod = method3;
        }

        public static CloseGuard get() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod(av.ai, String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new CloseGuard(method, method3, method2);
        }

        public Object createAndOpen(String str) {
            Method method = this.getMethod;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[0]);
                    this.openMethod.invoke(invoke, str);
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        public boolean warnIfOpen(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.warnIfOpenMethod.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class CustomTrustRootIndex implements TrustRootIndex {
        private final Method findByIssuerAndSignatureMethod;
        private final X509TrustManager trustManager;

        public CustomTrustRootIndex(X509TrustManager x509TrustManager, Method method) {
            this.findByIssuerAndSignatureMethod = method;
            this.trustManager = x509TrustManager;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) obj;
            if (this.trustManager.equals(customTrustRootIndex.trustManager) && this.findByIssuerAndSignatureMethod.equals(customTrustRootIndex.findByIssuerAndSignatureMethod)) {
                return true;
            }
            return false;
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        public X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.findByIssuerAndSignatureMethod.invoke(this.trustManager, x509Certificate);
                if (trustAnchor == null) {
                    return null;
                }
                return trustAnchor.getTrustedCert();
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public int hashCode() {
            return (this.findByIssuerAndSignatureMethod.hashCode() * 31) + this.trustManager.hashCode();
        }
    }

    public AndroidPlatform(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.sslParametersClass = cls;
        this.sslSocketClass = cls2;
        this.setUseSessionTickets = method;
        this.setHostname = method2;
        this.getAlpnSelectedProtocol = method3;
        this.setAlpnProtocols = method4;
    }

    private boolean api23IsCleartextTrafficPermitted(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.isCleartextTrafficPermitted(str);
        }
    }

    private boolean api24IsCleartextTrafficPermitted(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return api23IsCleartextTrafficPermitted(str, cls, obj);
        }
    }

    @Nullable
    public static Platform buildIfSupported() {
        if (!Platform.isAndroid()) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            try {
                return new AndroidPlatform(cls, cls2, cls2.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE), cls2.getMethod("setHostname", String.class), cls2.getMethod("getAlpnSelectedProtocol", new Class[0]), cls2.getMethod("setAlpnProtocols", byte[].class));
            } catch (NoSuchMethodException unused) {
                throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
            }
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    public static int getSdkInt() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new AndroidCertificateChainCleaner(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.buildCertificateChainCleaner(x509TrustManager);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public TrustRootIndex buildTrustRootIndex(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new CustomTrustRootIndex(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.buildTrustRootIndex(x509TrustManager);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) throws IOException {
        if (!this.sslSocketClass.isInstance(sSLSocket)) {
            return;
        }
        if (str != null) {
            try {
                this.setUseSessionTickets.invoke(sSLSocket, Boolean.TRUE);
                this.setHostname.invoke(sSLSocket, str);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new AssertionError(e10);
            }
        }
        this.setAlpnProtocols.invoke(sSLSocket, Platform.concatLengthPrefixed(list));
    }

    @Override // okhttp3.internal.platform.Platform
    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (AssertionError e10) {
            if (Util.isAndroidGetsocknameError(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        } catch (ClassCastException e11) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e11);
            }
            throw e11;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public SSLContext getSSLContext() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException("No TLS provider", e10);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    @Nullable
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        if (!this.sslSocketClass.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.getAlpnSelectedProtocol.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, StandardCharsets.UTF_8);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    @Nullable
    public Object getStackTraceForCloseable(String str) {
        return this.closeGuard.createAndOpen(str);
    }

    @Override // okhttp3.internal.platform.Platform
    public boolean isCleartextTrafficPermitted(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return api24IsCleartextTrafficPermitted(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.isCleartextTrafficPermitted(str);
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e11) {
            e = e11;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (InvocationTargetException e12) {
            e = e12;
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void log(int i10, String str, @Nullable Throwable th) {
        int min;
        int i11 = 5;
        if (i10 != 5) {
            i11 = 3;
        }
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i12 = 0;
        while (i12 < length) {
            int indexOf = str.indexOf(10, i12);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i12 + MAX_LOG_LENGTH);
                Log.println(i11, "OkHttp", str.substring(i12, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i12 = min;
                }
            }
            i12 = min + 1;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void logCloseableLeak(String str, Object obj) {
        if (!this.closeGuard.warnIfOpen(obj)) {
            log(5, str, null);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    @Nullable
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        Object readFieldOrNull = Platform.readFieldOrNull(sSLSocketFactory, this.sslParametersClass, "sslParameters");
        if (readFieldOrNull == null) {
            try {
                readFieldOrNull = Platform.readFieldOrNull(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.trustManager(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) Platform.readFieldOrNull(readFieldOrNull, X509TrustManager.class, "x509TrustManager");
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        return (X509TrustManager) Platform.readFieldOrNull(readFieldOrNull, X509TrustManager.class, "trustManager");
    }
}
