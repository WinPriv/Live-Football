package m8;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* compiled from: JsonPrimitive.java */
/* loaded from: classes2.dex */
public final class s extends n {

    /* renamed from: s, reason: collision with root package name */
    public final Serializable f32943s;

    public s(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f32943s = bool;
    }

    public static boolean o(s sVar) {
        Serializable serializable = sVar.f32943s;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    @Override // m8.n
    public final boolean e() {
        Serializable serializable = this.f32943s;
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).booleanValue();
        }
        return Boolean.parseBoolean(m());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        Serializable serializable = this.f32943s;
        Serializable serializable2 = sVar.f32943s;
        if (serializable == null) {
            if (serializable2 == null) {
                return true;
            }
            return false;
        }
        if (o(this) && o(sVar)) {
            if (n().longValue() == sVar.n().longValue()) {
                return true;
            }
            return false;
        }
        if ((serializable instanceof Number) && (serializable2 instanceof Number)) {
            double doubleValue = n().doubleValue();
            double doubleValue2 = sVar.n().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                return true;
            }
            return false;
        }
        return serializable.equals(serializable2);
    }

    @Override // m8.n
    public final double f() {
        if (this.f32943s instanceof Number) {
            return n().doubleValue();
        }
        return Double.parseDouble(m());
    }

    @Override // m8.n
    public final float g() {
        if (this.f32943s instanceof Number) {
            return n().floatValue();
        }
        return Float.parseFloat(m());
    }

    @Override // m8.n
    public final int h() {
        if (this.f32943s instanceof Number) {
            return n().intValue();
        }
        return Integer.parseInt(m());
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f32943s;
        if (serializable == null) {
            return 31;
        }
        if (o(this)) {
            doubleToLongBits = n().longValue();
        } else if (serializable instanceof Number) {
            doubleToLongBits = Double.doubleToLongBits(n().doubleValue());
        } else {
            return serializable.hashCode();
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    @Override // m8.n
    public final long l() {
        if (this.f32943s instanceof Number) {
            return n().longValue();
        }
        return Long.parseLong(m());
    }

    @Override // m8.n
    public final String m() {
        Serializable serializable = this.f32943s;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return n().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final Number n() {
        Serializable serializable = this.f32943s;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new o8.q((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public s(Number number) {
        Objects.requireNonNull(number);
        this.f32943s = number;
    }

    public s(String str) {
        Objects.requireNonNull(str);
        this.f32943s = str;
    }

    @Override // m8.n
    public final n d() {
        return this;
    }
}
