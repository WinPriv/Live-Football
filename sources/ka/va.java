package ka;

/* loaded from: classes2.dex */
public final class va extends ua {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31996b;

    public /* synthetic */ va(int i10) {
        this.f31996b = i10;
    }

    @Override // ka.ua
    public final Object b(String str) {
        String str2 = "convertStringToData Exception";
        switch (this.f31996b) {
            case 0:
                try {
                    return Double.valueOf(Double.parseDouble(str));
                } catch (NumberFormatException unused) {
                    str2 = "convertStringToData NumberFormatException";
                    n7.g("DoubleDataConverter", str2);
                    return Double.valueOf(0.0d);
                } catch (Exception unused2) {
                    n7.g("DoubleDataConverter", str2);
                    return Double.valueOf(0.0d);
                }
            default:
                try {
                    return Long.valueOf(Long.parseLong(str));
                } catch (NumberFormatException unused3) {
                    str2 = "convertStringToData NumberFormatException";
                    n7.b("LongDataConverter", str2);
                    return 0L;
                } catch (Exception unused4) {
                    n7.b("LongDataConverter", str2);
                    return 0L;
                }
        }
    }
}
