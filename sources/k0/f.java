package k0;

import android.util.Base64;
import java.util.List;

/* compiled from: FontRequest.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f30251a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30252b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30253c;

    /* renamed from: d, reason: collision with root package name */
    public final List<List<byte[]>> f30254d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30255e;

    public f(String str, String str2, String str3, List<List<byte[]>> list) {
        str.getClass();
        this.f30251a = str;
        str2.getClass();
        this.f30252b = str2;
        this.f30253c = str3;
        list.getClass();
        this.f30254d = list;
        this.f30255e = e0.i.g(str, "-", str2, "-", str3);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f30251a + ", mProviderPackage: " + this.f30252b + ", mQuery: " + this.f30253c + ", mCertificates:");
        int i10 = 0;
        while (true) {
            List<List<byte[]>> list = this.f30254d;
            if (i10 < list.size()) {
                sb2.append(" [");
                List<byte[]> list2 = list.get(i10);
                for (int i11 = 0; i11 < list2.size(); i11++) {
                    sb2.append(" \"");
                    sb2.append(Base64.encodeToString(list2.get(i11), 0));
                    sb2.append("\"");
                }
                sb2.append(" ]");
                i10++;
            } else {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
        }
    }
}
