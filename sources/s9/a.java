package s9;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class a {
    public Context f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f35285g;

    /* renamed from: h, reason: collision with root package name */
    public int f35286h;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f35280a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f35281b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f35282c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f35283d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f35284e = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final String f35287i = "verify_match_property";

    public final void a(String str, String str2) {
        HashMap hashMap = this.f35280a;
        String[] strArr = (String[]) hashMap.get(str);
        if (strArr == null) {
            strArr = new String[]{str2};
        } else {
            int length = strArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    if (TextUtils.equals(strArr[i10], str2)) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    String[] strArr2 = new String[length + 1];
                    System.arraycopy(strArr, 0, strArr2, 0, length);
                    strArr2[length] = str2;
                    strArr = strArr2;
                    break;
                }
            }
        }
        hashMap.put(str, strArr);
        this.f35282c.put(str, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x04be, code lost:
    
        r19 = r2;
        r2 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0470 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0372 A[LOOP:12: B:279:0x034c->B:286:0x0372, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0398 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x05fe  */
    /* JADX WARN: Type inference failed for: r0v124, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v125, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b() {
        /*
            Method dump skipped, instructions count: 1747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.a.b():java.lang.String");
    }
}
