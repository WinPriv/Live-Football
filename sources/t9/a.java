package t9;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Locale;
import q.e;
import u9.b;

/* loaded from: classes2.dex */
public final class a {
    public static X509Certificate a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] a10 = e.a(str);
        if (a10.length == 0) {
            return null;
        }
        try {
            Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(a10));
            if (!(generateCertificate instanceof X509Certificate)) {
                return null;
            }
            return (X509Certificate) generateCertificate;
        } catch (CertificateException e10) {
            b.f35806b.a("X509CertUtil", "Failed to get cert: " + e10.getMessage());
            return null;
        }
    }

    public static boolean b(X509Certificate x509Certificate, String str, String str2) {
        String substring;
        if (x509Certificate != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String name = x509Certificate.getSubjectDN().getName();
            int indexOf = name.toUpperCase(Locale.getDefault()).indexOf(str.concat(ContainerUtils.KEY_VALUE_DELIMITER));
            if (indexOf == -1) {
                substring = null;
            } else {
                int indexOf2 = name.indexOf(",", indexOf);
                int length = str.length() + indexOf + 1;
                if (indexOf2 != -1) {
                    substring = name.substring(length, indexOf2);
                } else {
                    substring = name.substring(length);
                }
            }
            return str2.equals(substring);
        }
        return false;
    }
}
