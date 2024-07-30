package x3;

import androidx.activity.n;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import z3.l;

/* compiled from: CCTDestination.java */
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: c, reason: collision with root package name */
    public static final String f36312c = n.G0("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d, reason: collision with root package name */
    public static final Set<w3.b> f36313d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f36314e;

    /* renamed from: a, reason: collision with root package name */
    public final String f36315a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36316b;

    static {
        String G0 = n.G0("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String G02 = n.G0("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f36313d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new w3.b("proto"), new w3.b("json"))));
        f36314e = new a(G0, G02);
    }

    public a(String str, String str2) {
        this.f36315a = str;
        this.f36316b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public final byte[] b() {
        String str = this.f36315a;
        String str2 = this.f36316b;
        if (str2 == null && str == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = str;
        objArr[2] = "\\";
        if (str2 == null) {
            str2 = "";
        }
        objArr[3] = str2;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
