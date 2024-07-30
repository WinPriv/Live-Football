package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.b;
import com.huawei.openalliance.ad.constant.w;
import java.nio.charset.Charset;
import o1.a;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1577a = aVar.j(iconCompat.f1577a, 1);
        byte[] bArr = iconCompat.f1579c;
        if (aVar.h(2)) {
            bArr = aVar.f();
        }
        iconCompat.f1579c = bArr;
        iconCompat.f1580d = aVar.l(iconCompat.f1580d, 3);
        iconCompat.f1581e = aVar.j(iconCompat.f1581e, 4);
        iconCompat.f = aVar.j(iconCompat.f, 5);
        iconCompat.f1582g = (ColorStateList) aVar.l(iconCompat.f1582g, 6);
        String str = iconCompat.f1584i;
        if (aVar.h(7)) {
            str = aVar.m();
        }
        iconCompat.f1584i = str;
        String str2 = iconCompat.f1585j;
        if (aVar.h(8)) {
            str2 = aVar.m();
        }
        iconCompat.f1585j = str2;
        iconCompat.f1583h = PorterDuff.Mode.valueOf(iconCompat.f1584i);
        switch (iconCompat.f1577a) {
            case -1:
                Parcelable parcelable = iconCompat.f1580d;
                if (parcelable != null) {
                    iconCompat.f1578b = parcelable;
                    return iconCompat;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1580d;
                if (parcelable2 != null) {
                    iconCompat.f1578b = parcelable2;
                } else {
                    byte[] bArr2 = iconCompat.f1579c;
                    iconCompat.f1578b = bArr2;
                    iconCompat.f1577a = 3;
                    iconCompat.f1581e = 0;
                    iconCompat.f = bArr2.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1579c, Charset.forName(b.f7303k));
                iconCompat.f1578b = str3;
                if (iconCompat.f1577a == 2 && iconCompat.f1585j == null) {
                    iconCompat.f1585j = str3.split(w.bE, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1578b = iconCompat.f1579c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f1584i = iconCompat.f1583h.name();
        switch (iconCompat.f1577a) {
            case -1:
                iconCompat.f1580d = (Parcelable) iconCompat.f1578b;
                break;
            case 1:
            case 5:
                iconCompat.f1580d = (Parcelable) iconCompat.f1578b;
                break;
            case 2:
                iconCompat.f1579c = ((String) iconCompat.f1578b).getBytes(Charset.forName(b.f7303k));
                break;
            case 3:
                iconCompat.f1579c = (byte[]) iconCompat.f1578b;
                break;
            case 4:
            case 6:
                iconCompat.f1579c = iconCompat.f1578b.toString().getBytes(Charset.forName(b.f7303k));
                break;
        }
        int i10 = iconCompat.f1577a;
        if (-1 != i10) {
            aVar.t(i10, 1);
        }
        byte[] bArr = iconCompat.f1579c;
        if (bArr != null) {
            aVar.o(2);
            aVar.q(bArr);
        }
        Parcelable parcelable = iconCompat.f1580d;
        if (parcelable != null) {
            aVar.o(3);
            aVar.u(parcelable);
        }
        int i11 = iconCompat.f1581e;
        if (i11 != 0) {
            aVar.t(i11, 4);
        }
        int i12 = iconCompat.f;
        if (i12 != 0) {
            aVar.t(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f1582g;
        if (colorStateList != null) {
            aVar.o(6);
            aVar.u(colorStateList);
        }
        String str = iconCompat.f1584i;
        if (str != null) {
            aVar.o(7);
            aVar.v(str);
        }
        String str2 = iconCompat.f1585j;
        if (str2 != null) {
            aVar.o(8);
            aVar.v(str2);
        }
    }
}
