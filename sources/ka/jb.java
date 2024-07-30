package ka;

/* loaded from: classes2.dex */
public final class jb {
    public static boolean a(String str) {
        try {
            Class.forName(str);
            n7.e("OMSDKCheckUtil", str);
            return true;
        } catch (ClassNotFoundException unused) {
            n7.e("OMSDKCheckUtil", str.concat(" is not avaliable"));
            return false;
        }
    }
}
