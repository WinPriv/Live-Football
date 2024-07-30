package okhttp3.internal.platform;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public class Android10Platform extends AndroidPlatform {
    public Android10Platform(Class<?> cls) {
        super(cls, null, null, null, null, null);
    }

    @Nullable
    public static Platform buildIfSupported() {
        if (!Platform.isAndroid()) {
            return null;
        }
        try {
            if (AndroidPlatform.getSdkInt() >= 29) {
                return new Android10Platform(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            }
        } catch (ReflectiveOperationException unused) {
        }
        return null;
    }

    private void enableSessionTickets(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        if (isSupportedSocket) {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
        }
    }

    @Override // okhttp3.internal.platform.AndroidPlatform, okhttp3.internal.platform.Platform
    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) throws IOException {
        try {
            enableSessionTickets(sSLSocket);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) Platform.alpnProtocolNames(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }

    @Override // okhttp3.internal.platform.AndroidPlatform, okhttp3.internal.platform.Platform
    @Nullable
    @IgnoreJRERequirement
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        String applicationProtocol;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol != null && !applicationProtocol.isEmpty()) {
            return applicationProtocol;
        }
        return null;
    }
}
