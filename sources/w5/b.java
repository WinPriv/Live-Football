package w5;

import android.text.TextUtils;
import com.anythink.expressad.exoplayer.k.o;
import i7.g;

/* compiled from: SsaDialogueFormat.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f36116a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36117b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36118c;

    /* renamed from: d, reason: collision with root package name */
    public final int f36119d;

    /* renamed from: e, reason: collision with root package name */
    public final int f36120e;

    public b(int i10, int i11, int i12, int i13, int i14) {
        this.f36116a = i10;
        this.f36117b = i11;
        this.f36118c = i12;
        this.f36119d = i13;
        this.f36120e = i14;
    }

    public static b a(String str) {
        char c10;
        d6.a.a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < split.length; i14++) {
            String c11 = g.c(split[i14].trim());
            c11.getClass();
            switch (c11.hashCode()) {
                case 100571:
                    if (c11.equals("end")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (c11.equals(o.f9070c)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 109757538:
                    if (c11.equals("start")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109780401:
                    if (c11.equals("style")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    i11 = i14;
                    break;
                case 1:
                    i13 = i14;
                    break;
                case 2:
                    i10 = i14;
                    break;
                case 3:
                    i12 = i14;
                    break;
            }
        }
        if (i10 != -1 && i11 != -1 && i13 != -1) {
            return new b(i10, i11, i12, i13, split.length);
        }
        return null;
    }
}
