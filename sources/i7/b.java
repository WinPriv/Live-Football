package i7;

/* compiled from: CharMatcher.java */
/* loaded from: classes2.dex */
public abstract class b implements h<Character> {

    /* compiled from: CharMatcher.java */
    /* loaded from: classes2.dex */
    public static abstract class a extends b {
        @Override // i7.h
        @Deprecated
        public final boolean apply(Character ch) {
            return b(ch.charValue());
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: i7.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0398b extends a {

        /* renamed from: s, reason: collision with root package name */
        public final char f29197s;

        public C0398b(char c10) {
            this.f29197s = c10;
        }

        @Override // i7.b
        public final boolean b(char c10) {
            if (c10 == this.f29197s) {
                return true;
            }
            return false;
        }

        public final String toString() {
            char[] cArr = {'\\', 'u', 0, 0, 0, 0};
            char c10 = this.f29197s;
            for (int i10 = 0; i10 < 4; i10++) {
                cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
                c10 = (char) (c10 >> 4);
            }
            String copyValueOf = String.copyValueOf(cArr);
            StringBuilder sb2 = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
            sb2.append("CharMatcher.is('");
            sb2.append(copyValueOf);
            sb2.append("')");
            return sb2.toString();
        }
    }

    /* compiled from: CharMatcher.java */
    /* loaded from: classes2.dex */
    public static abstract class c extends a {

        /* renamed from: s, reason: collision with root package name */
        public final String f29198s = "CharMatcher.none()";

        public final String toString() {
            return this.f29198s;
        }
    }

    /* compiled from: CharMatcher.java */
    /* loaded from: classes2.dex */
    public static final class d extends c {

        /* renamed from: t, reason: collision with root package name */
        public static final d f29199t = new d();

        @Override // i7.b
        public final int a(CharSequence charSequence, int i10) {
            f.d(i10, charSequence.length());
            return -1;
        }

        @Override // i7.b
        public final boolean b(char c10) {
            return false;
        }
    }

    public int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        f.d(i10, length);
        while (i10 < length) {
            if (b(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean b(char c10);
}
