package n5;

import java.util.Locale;

/* compiled from: UrlTemplate.java */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f33428a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f33429b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f33430c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33431d;

    public m(String[] strArr, int[] iArr, String[] strArr2, int i10) {
        this.f33428a = strArr;
        this.f33429b = iArr;
        this.f33430c = strArr2;
        this.f33431d = i10;
    }

    public final String a(int i10, long j10, long j11, String str) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            String[] strArr = this.f33428a;
            int i12 = this.f33431d;
            if (i11 < i12) {
                sb2.append(strArr[i11]);
                int i13 = this.f33429b[i11];
                if (i13 == 1) {
                    sb2.append(str);
                } else {
                    String[] strArr2 = this.f33430c;
                    if (i13 == 2) {
                        sb2.append(String.format(Locale.US, strArr2[i11], Long.valueOf(j10)));
                    } else if (i13 == 3) {
                        sb2.append(String.format(Locale.US, strArr2[i11], Integer.valueOf(i10)));
                    } else if (i13 == 4) {
                        sb2.append(String.format(Locale.US, strArr2[i11], Long.valueOf(j11)));
                    }
                }
                i11++;
            } else {
                sb2.append(strArr[i12]);
                return sb2.toString();
            }
        }
    }
}
