package ka;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31623a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31624b;

    public /* synthetic */ p4(String str, int i10) {
        this.f31623a = i10;
        this.f31624b = str;
    }

    public static String a(String str) {
        try {
            return com.ironsource.sdk.utils.c.a(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                byte[] digest = messageDigest.digest();
                StringBuilder sb2 = new StringBuilder();
                for (byte b10 : digest) {
                    String hexString = Integer.toHexString(b10 & DefaultClassResolver.NAME);
                    if (hexString.length() < 2) {
                        hexString = "0" + hexString;
                    }
                    sb2.append(hexString);
                }
                return sb2.toString();
            } catch (Exception e11) {
                e11.printStackTrace();
                return "";
            }
        }
    }

    public final String toString() {
        switch (this.f31623a) {
            case 2:
                return "<" + this.f31624b + '>';
            default:
                return super.toString();
        }
    }
}
