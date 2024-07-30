package o8;

import java.math.BigDecimal;

/* compiled from: LazilyParsedNumber.java */
/* loaded from: classes2.dex */
public final class q extends Number {

    /* renamed from: s, reason: collision with root package name */
    public final String f33750s;

    public q(String str) {
        this.f33750s = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f33750s);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        Object obj2 = ((q) obj).f33750s;
        String str = this.f33750s;
        if (str == obj2 || str.equals(obj2)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f33750s);
    }

    public final int hashCode() {
        return this.f33750s.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f33750s;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f33750s;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f33750s;
    }
}
