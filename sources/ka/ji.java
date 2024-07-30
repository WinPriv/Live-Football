package ka;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;

/* loaded from: classes2.dex */
public final class ji {
    public static boolean a(Context context, String str, String str2, RSAPublicKey rSAPublicKey) {
        String str3;
        boolean z10 = true;
        if (context != null && com.huawei.openalliance.ad.ppskit.utils.m.Z(context)) {
            return true;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (rSAPublicKey == null || rSAPublicKey.getModulus().bitLength() < 3072) {
                z10 = false;
            }
            if (z10) {
                try {
                    Signature signature = Signature.getInstance("SHA256withRSA/PSS");
                    signature.initVerify(rSAPublicKey);
                    signature.update(str.getBytes("UTF-8"));
                    return signature.verify(Base64.decode(str2, 0));
                } catch (Throwable th) {
                    str3 = "check sign exception: ".concat(th.getClass().getSimpleName());
                }
            }
        }
        str3 = "content or public key or sign value is null";
        n7.g("RSAEncryptUtil", str3);
        return false;
    }

    public static boolean b(String str, String str2, String str3, PublicKey publicKey) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && publicKey != null) {
            try {
                Signature signature = Signature.getInstance(str3);
                signature.initVerify(publicKey);
                signature.update(androidx.transition.n.O(str));
                return signature.verify(Base64.decode(str2.getBytes("UTF-8"), 2));
            } catch (Throwable th) {
                n7.j("RSAEncryptUtil", "verify error: %s", th.getClass().getSimpleName());
            }
        }
        return false;
    }

    public static boolean c(String str, String str2, RSAPublicKey rSAPublicKey) {
        String str3;
        boolean z10;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (rSAPublicKey != null && rSAPublicKey.getModulus().bitLength() >= 3072) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                try {
                    Signature signature = Signature.getInstance("SHA256WithRSA");
                    signature.initVerify(rSAPublicKey);
                    signature.update(str.getBytes("UTF-8"));
                    return signature.verify(Base64.decode(str2, 0));
                } catch (Throwable th) {
                    str3 = "check sign exception: ".concat(th.getClass().getSimpleName());
                }
            }
        }
        str3 = "content or public key or sign value is null";
        n7.g("RSAEncryptUtil", str3);
        return false;
    }
}
