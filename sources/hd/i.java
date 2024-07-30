package hd;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f28902a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28903b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28904c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28905d;

    public i(int i10, String str, String str2, String str3) {
        this.f28902a = i10;
        this.f28903b = str;
        this.f28904c = str2;
        this.f28905d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f28902a == iVar.f28902a && this.f28903b.equals(iVar.f28903b) && this.f28904c.equals(iVar.f28904c) && this.f28905d.equals(iVar.f28905d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f28905d.hashCode() * this.f28904c.hashCode() * this.f28903b.hashCode()) + this.f28902a;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f28903b);
        stringBuffer.append('.');
        stringBuffer.append(this.f28904c);
        stringBuffer.append(this.f28905d);
        stringBuffer.append(" (");
        stringBuffer.append(this.f28902a);
        stringBuffer.append(')');
        return stringBuffer.toString();
    }
}
