package org.jsoup.nodes;

import com.huawei.openalliance.ad.constant.w;
import org.jsoup.helper.Validate;

/* loaded from: classes2.dex */
public class Range {

    /* renamed from: c, reason: collision with root package name */
    public static final String f34000c = Attributes.e("jsoup.sourceRange");

    /* renamed from: d, reason: collision with root package name */
    public static final String f34001d = Attributes.e("jsoup.endSourceRange");

    /* renamed from: e, reason: collision with root package name */
    public static final Position f34002e;
    public static final Range f;

    /* renamed from: a, reason: collision with root package name */
    public final Position f34003a;

    /* renamed from: b, reason: collision with root package name */
    public final Position f34004b;

    /* loaded from: classes2.dex */
    public static class Position {

        /* renamed from: a, reason: collision with root package name */
        public final int f34005a;

        /* renamed from: b, reason: collision with root package name */
        public final int f34006b;

        /* renamed from: c, reason: collision with root package name */
        public final int f34007c;

        public Position(int i10, int i11, int i12) {
            this.f34005a = i10;
            this.f34006b = i11;
            this.f34007c = i12;
        }

        public int columnNumber() {
            return this.f34007c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Position position = (Position) obj;
            if (this.f34005a == position.f34005a && this.f34006b == position.f34006b && this.f34007c == position.f34007c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f34005a * 31) + this.f34006b) * 31) + this.f34007c;
        }

        public boolean isTracked() {
            if (this != Range.f34002e) {
                return true;
            }
            return false;
        }

        public int lineNumber() {
            return this.f34006b;
        }

        public int pos() {
            return this.f34005a;
        }

        public String toString() {
            return this.f34006b + "," + this.f34007c + w.bE + this.f34005a;
        }
    }

    static {
        Position position = new Position(-1, -1, -1);
        f34002e = position;
        f = new Range(position, position);
    }

    public Range(Position position, Position position2) {
        this.f34003a = position;
        this.f34004b = position2;
    }

    public static Range a(Node node, boolean z10) {
        String str;
        Object obj;
        if (z10) {
            str = f34000c;
        } else {
            str = f34001d;
        }
        if (!node.hasAttr(str)) {
            return f;
        }
        Attributes attributes = node.attributes();
        attributes.getClass();
        Validate.notNull(str);
        if (!Attributes.f(str)) {
            str = Attributes.e(str);
        }
        int d10 = attributes.d(str);
        if (d10 == -1) {
            obj = null;
        } else {
            obj = attributes.f33964u[d10];
        }
        return (Range) Validate.ensureNotNull(obj);
    }

    public Position end() {
        return this.f34004b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Range range = (Range) obj;
        if (!this.f34003a.equals(range.f34003a)) {
            return false;
        }
        return this.f34004b.equals(range.f34004b);
    }

    public int hashCode() {
        return this.f34004b.hashCode() + (this.f34003a.hashCode() * 31);
    }

    public boolean isTracked() {
        if (this != f) {
            return true;
        }
        return false;
    }

    public Position start() {
        return this.f34003a;
    }

    public String toString() {
        return this.f34003a + "-" + this.f34004b;
    }

    public void track(Node node, boolean z10) {
        String str;
        Attributes attributes = node.attributes();
        if (z10) {
            str = f34000c;
        } else {
            str = f34001d;
        }
        attributes.getClass();
        Validate.notNull(str);
        if (!Attributes.f(str)) {
            str = Attributes.e(str);
        }
        Validate.notNull(this);
        int c10 = attributes.c(str);
        if (c10 != -1) {
            attributes.f33964u[c10] = this;
            return;
        }
        attributes.a(attributes.f33962s + 1);
        String[] strArr = attributes.f33963t;
        int i10 = attributes.f33962s;
        strArr[i10] = str;
        attributes.f33964u[i10] = this;
        attributes.f33962s = i10 + 1;
    }
}
