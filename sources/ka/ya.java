package ka;

/* loaded from: classes2.dex */
public final class ya extends ua<Integer> {
    @Override // ka.ua
    public final Integer b(String str) {
        String str2;
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            str2 = "convertStringToData NumberFormatException";
            n7.g("IntegerDataConverter", str2);
            return 0;
        } catch (Exception unused2) {
            str2 = "convertStringToData Exception";
            n7.g("IntegerDataConverter", str2);
            return 0;
        }
    }
}
