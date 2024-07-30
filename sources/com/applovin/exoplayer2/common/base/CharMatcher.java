package com.applovin.exoplayer2.common.base;

import java.util.Arrays;
import java.util.BitSet;

/* loaded from: classes.dex */
public abstract class CharMatcher implements Predicate<Character> {

    /* loaded from: classes.dex */
    public static final class a extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        final CharMatcher f13851a;

        /* renamed from: b, reason: collision with root package name */
        final CharMatcher f13852b;

        public a(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f13851a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.f13852b = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            if (this.f13851a.matches(c10) && this.f13852b.matches(c10)) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f13851a.setBits(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.f13852b.setBits(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.and(" + this.f13851a + ", " + this.f13852b + ")";
        }
    }

    /* loaded from: classes.dex */
    public static final class aa extends t {

        /* renamed from: a, reason: collision with root package name */
        static final int f13853a = Integer.numberOfLeadingZeros(31);

        /* renamed from: b, reason: collision with root package name */
        static final aa f13854b = new aa();

        public aa() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            if ("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c10) >>> f13853a) == c10) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            for (int i10 = 0; i10 < 32; i10++) {
                bitSet.set("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt(i10));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends t {

        /* renamed from: a, reason: collision with root package name */
        static final b f13855a = new b();

        private b() {
            super("CharMatcher.any()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c10) {
            if (charSequence.length() == 0) {
                return "";
            }
            return String.valueOf(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            if (charSequence.length() == 0) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.none();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c10) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c10);
            return new String(cArr);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i10) {
            int length = charSequence.length();
            Preconditions.checkPositionIndex(i10, length);
            if (i10 == length) {
                return -1;
            }
            return i10;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb2 = new StringBuilder(charSequence2.length() * charSequence.length());
            for (int i10 = 0; i10 < charSequence.length(); i10++) {
                sb2.append(charSequence2);
            }
            return sb2.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        private final char[] f13856a;

        public c(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f13856a = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            if (Arrays.binarySearch(this.f13856a, c10) >= 0) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            for (char c10 : this.f13856a) {
                bitSet.set(c10);
            }
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c10 : this.f13856a) {
                sb2.append(CharMatcher.showCharacter(c10));
            }
            sb2.append("\")");
            return sb2.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends t {

        /* renamed from: a, reason: collision with root package name */
        static final d f13857a = new d();

        public d() {
            super("CharMatcher.ascii()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            if (c10 <= 127) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        static final CharMatcher f13858a = new e();

        private e() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            if (c10 != ' ' && c10 != 133 && c10 != 5760) {
                if (c10 == 8199) {
                    return false;
                }
                if (c10 != 8287 && c10 != 12288 && c10 != 8232 && c10 != 8233) {
                    switch (c10) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            if (c10 >= 8192 && c10 <= 8202) {
                                return true;
                            }
                            return false;
                    }
                }
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends y {

        /* renamed from: a, reason: collision with root package name */
        static final f f13859a = new f();

        private f() {
            super("CharMatcher.digit()", a(), b());
        }

        private static char[] a() {
            return "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray();
        }

        private static char[] b() {
            char[] cArr = new char[37];
            for (int i10 = 0; i10 < 37; i10++) {
                cArr[i10] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i10) + '\t');
            }
            return cArr;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g extends CharMatcher {
        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return new v(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        private final Predicate<? super Character> f13860a;

        public h(Predicate<? super Character> predicate) {
            this.f13860a = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return this.f13860a.apply(Character.valueOf(c10));
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.forPredicate(" + this.f13860a + ")";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Character ch) {
            return this.f13860a.apply(Preconditions.checkNotNull(ch));
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends g {

        /* renamed from: a, reason: collision with root package name */
        private final char f13861a;

        /* renamed from: b, reason: collision with root package name */
        private final char f13862b;

        public i(char c10, char c11) {
            boolean z10;
            if (c11 >= c10) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkArgument(z10);
            this.f13861a = c10;
            this.f13862b = c11;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            if (this.f13861a <= c10 && c10 <= this.f13862b) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            bitSet.set(this.f13861a, this.f13862b + 1);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.inRange('" + CharMatcher.showCharacter(this.f13861a) + "', '" + CharMatcher.showCharacter(this.f13862b) + "')";
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends y {

        /* renamed from: a, reason: collision with root package name */
        static final j f13863a = new j();

        private j() {
            super("CharMatcher.invisible()", "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9".toCharArray(), "  \u00ad\u0605\u061c\u06dd\u070f\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb".toCharArray());
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends g {

        /* renamed from: a, reason: collision with root package name */
        private final char f13864a;

        public k(char c10) {
            this.f13864a = c10;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            if (charMatcher.matches(this.f13864a)) {
                return this;
            }
            return CharMatcher.none();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            if (c10 == this.f13864a) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.isNot(this.f13864a);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            if (!charMatcher.matches(this.f13864a)) {
                return super.or(charMatcher);
            }
            return charMatcher;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c10) {
            return charSequence.toString().replace(this.f13864a, c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            bitSet.set(this.f13864a);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.is('" + CharMatcher.showCharacter(this.f13864a) + "')";
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends g {

        /* renamed from: a, reason: collision with root package name */
        private final char f13865a;

        /* renamed from: b, reason: collision with root package name */
        private final char f13866b;

        public l(char c10, char c11) {
            this.f13865a = c10;
            this.f13866b = c11;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            if (c10 != this.f13865a && c10 != this.f13866b) {
                return false;
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            bitSet.set(this.f13865a);
            bitSet.set(this.f13866b);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.anyOf(\"" + CharMatcher.showCharacter(this.f13865a) + CharMatcher.showCharacter(this.f13866b) + "\")";
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends g {

        /* renamed from: a, reason: collision with root package name */
        private final char f13867a;

        public m(char c10) {
            this.f13867a = c10;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            if (charMatcher.matches(this.f13867a)) {
                return super.and(charMatcher);
            }
            return charMatcher;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            if (c10 != this.f13867a) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.is(this.f13867a);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            if (charMatcher.matches(this.f13867a)) {
                return CharMatcher.any();
            }
            return this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            bitSet.set(0, this.f13867a);
            bitSet.set(this.f13867a + 1, com.anythink.expressad.exoplayer.b.aX);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.isNot('" + CharMatcher.showCharacter(this.f13867a) + "')";
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        static final n f13868a = new n();

        private n() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return Character.isDigit(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends t {

        /* renamed from: a, reason: collision with root package name */
        static final o f13869a = new o();

        private o() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            if (c10 > 31 && (c10 < 127 || c10 > 159)) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        static final p f13870a = new p();

        private p() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return Character.isLetter(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        static final q f13871a = new q();

        private q() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return Character.isLetterOrDigit(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        static final r f13872a = new r();

        private r() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return Character.isLowerCase(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        static final s f13873a = new s();

        private s() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return Character.isUpperCase(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    /* loaded from: classes.dex */
    public static abstract class t extends g {

        /* renamed from: a, reason: collision with root package name */
        private final String f13874a;

        public t(String str) {
            this.f13874a = (String) Preconditions.checkNotNull(str);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public final String toString() {
            return this.f13874a;
        }
    }

    /* loaded from: classes.dex */
    public static class u extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        final CharMatcher f13875a;

        public u(CharMatcher charMatcher) {
            this.f13875a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length() - this.f13875a.countIn(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return !this.f13875a.matches(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            return this.f13875a.matchesNoneOf(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            return this.f13875a.matchesAllOf(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return this.f13875a;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f13875a.setBits(bitSet2);
            bitSet2.flip(0, com.anythink.expressad.exoplayer.b.aX);
            bitSet.or(bitSet2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return this.f13875a + ".negate()";
        }
    }

    /* loaded from: classes.dex */
    public static class v extends u {
        public v(CharMatcher charMatcher) {
            super(charMatcher);
        }
    }

    /* loaded from: classes.dex */
    public static final class w extends t {

        /* renamed from: a, reason: collision with root package name */
        static final w f13876a = new w();

        private w() {
            super("CharMatcher.none()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c10) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            if (charSequence.length() == 0) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.any();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c10) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimLeadingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimTrailingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i10) {
            Preconditions.checkPositionIndex(i10, charSequence.length());
            return -1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            Preconditions.checkNotNull(charSequence2);
            return charSequence.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class x extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        final CharMatcher f13877a;

        /* renamed from: b, reason: collision with root package name */
        final CharMatcher f13878b;

        public x(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f13877a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.f13878b = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            if (!this.f13877a.matches(c10) && !this.f13878b.matches(c10)) {
                return false;
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            this.f13877a.setBits(bitSet);
            this.f13878b.setBits(bitSet);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.or(" + this.f13877a + ", " + this.f13878b + ")";
        }
    }

    /* loaded from: classes.dex */
    public static class y extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        private final String f13879a;

        /* renamed from: b, reason: collision with root package name */
        private final char[] f13880b;

        /* renamed from: c, reason: collision with root package name */
        private final char[] f13881c;

        public y(String str, char[] cArr, char[] cArr2) {
            boolean z10;
            boolean z11;
            boolean z12;
            this.f13879a = str;
            this.f13880b = cArr;
            this.f13881c = cArr2;
            if (cArr.length == cArr2.length) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkArgument(z10);
            int i10 = 0;
            while (i10 < cArr.length) {
                if (cArr[i10] <= cArr2[i10]) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Preconditions.checkArgument(z11);
                int i11 = i10 + 1;
                if (i11 < cArr.length) {
                    if (cArr2[i10] < cArr[i11]) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    Preconditions.checkArgument(z12);
                }
                i10 = i11;
            }
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            int binarySearch = Arrays.binarySearch(this.f13880b, c10);
            if (binarySearch >= 0) {
                return true;
            }
            int i10 = (~binarySearch) - 1;
            if (i10 >= 0 && c10 <= this.f13881c[i10]) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return this.f13879a;
        }
    }

    /* loaded from: classes.dex */
    public static final class z extends y {

        /* renamed from: a, reason: collision with root package name */
        static final z f13882a = new z();

        private z() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    public static CharMatcher any() {
        return b.f13855a;
    }

    public static CharMatcher anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            if (length != 1) {
                if (length != 2) {
                    return new c(charSequence);
                }
                return isEither(charSequence.charAt(0), charSequence.charAt(1));
            }
            return is(charSequence.charAt(0));
        }
        return none();
    }

    public static CharMatcher ascii() {
        return d.f13857a;
    }

    public static CharMatcher breakingWhitespace() {
        return e.f13858a;
    }

    @Deprecated
    public static CharMatcher digit() {
        return f.f13859a;
    }

    private String finishCollapseFrom(CharSequence charSequence, int i10, int i11, char c10, StringBuilder sb2, boolean z10) {
        while (i10 < i11) {
            char charAt = charSequence.charAt(i10);
            if (matches(charAt)) {
                if (!z10) {
                    sb2.append(c10);
                    z10 = true;
                }
            } else {
                sb2.append(charAt);
                z10 = false;
            }
            i10++;
        }
        return sb2.toString();
    }

    public static CharMatcher forPredicate(Predicate<? super Character> predicate) {
        if (predicate instanceof CharMatcher) {
            return (CharMatcher) predicate;
        }
        return new h(predicate);
    }

    public static CharMatcher inRange(char c10, char c11) {
        return new i(c10, c11);
    }

    @Deprecated
    public static CharMatcher invisible() {
        return j.f13863a;
    }

    public static CharMatcher is(char c10) {
        return new k(c10);
    }

    private static l isEither(char c10, char c11) {
        return new l(c10, c11);
    }

    public static CharMatcher isNot(char c10) {
        return new m(c10);
    }

    @Deprecated
    public static CharMatcher javaDigit() {
        return n.f13868a;
    }

    public static CharMatcher javaIsoControl() {
        return o.f13869a;
    }

    @Deprecated
    public static CharMatcher javaLetter() {
        return p.f13870a;
    }

    @Deprecated
    public static CharMatcher javaLetterOrDigit() {
        return q.f13871a;
    }

    @Deprecated
    public static CharMatcher javaLowerCase() {
        return r.f13872a;
    }

    @Deprecated
    public static CharMatcher javaUpperCase() {
        return s.f13873a;
    }

    public static CharMatcher none() {
        return w.f13876a;
    }

    public static CharMatcher noneOf(CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String showCharacter(char c10) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public static CharMatcher singleWidth() {
        return z.f13882a;
    }

    public static CharMatcher whitespace() {
        return aa.f13854b;
    }

    public CharMatcher and(CharMatcher charMatcher) {
        return new a(this, charMatcher);
    }

    public String collapseFrom(CharSequence charSequence, char c10) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = charSequence.charAt(i10);
            if (matches(charAt)) {
                if (charAt == c10 && (i10 == length - 1 || !matches(charSequence.charAt(i10 + 1)))) {
                    i10++;
                } else {
                    StringBuilder sb2 = new StringBuilder(length);
                    sb2.append(charSequence, 0, i10);
                    sb2.append(c10);
                    return finishCollapseFrom(charSequence, i10 + 1, length, c10, sb2, true);
                }
            }
            i10++;
        }
        return charSequence.toString();
    }

    public int countIn(CharSequence charSequence) {
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (matches(charSequence.charAt(i11))) {
                i10++;
            }
        }
        return i10;
    }

    public int indexIn(CharSequence charSequence) {
        return indexIn(charSequence, 0);
    }

    public int lastIndexIn(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (matches(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean matches(char c10);

    public boolean matchesAllOf(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAnyOf(CharSequence charSequence) {
        return !matchesNoneOf(charSequence);
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        if (indexIn(charSequence) == -1) {
            return true;
        }
        return false;
    }

    public CharMatcher negate() {
        return new u(this);
    }

    public CharMatcher or(CharMatcher charMatcher) {
        return new x(this, charMatcher);
    }

    public String removeFrom(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int indexIn = indexIn(charSequence2);
        if (indexIn == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        int i10 = 1;
        while (true) {
            indexIn++;
            while (indexIn != charArray.length) {
                if (matches(charArray[indexIn])) {
                    break;
                }
                charArray[indexIn - i10] = charArray[indexIn];
                indexIn++;
            }
            return new String(charArray, 0, indexIn - i10);
            i10++;
        }
    }

    public String replaceFrom(CharSequence charSequence, char c10) {
        String charSequence2 = charSequence.toString();
        int indexIn = indexIn(charSequence2);
        if (indexIn == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        charArray[indexIn] = c10;
        while (true) {
            indexIn++;
            if (indexIn < charArray.length) {
                if (matches(charArray[indexIn])) {
                    charArray[indexIn] = c10;
                }
            } else {
                return new String(charArray);
            }
        }
    }

    public String retainFrom(CharSequence charSequence) {
        return negate().removeFrom(charSequence);
    }

    public void setBits(BitSet bitSet) {
        for (int i10 = 65535; i10 >= 0; i10--) {
            if (matches((char) i10)) {
                bitSet.set(i10);
            }
        }
    }

    public String toString() {
        return super.toString();
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c10) {
        int length = charSequence.length();
        int i10 = length - 1;
        int i11 = 0;
        while (i11 < length && matches(charSequence.charAt(i11))) {
            i11++;
        }
        int i12 = i10;
        while (i12 > i11 && matches(charSequence.charAt(i12))) {
            i12--;
        }
        if (i11 == 0 && i12 == i10) {
            return collapseFrom(charSequence, c10);
        }
        int i13 = i12 + 1;
        return finishCollapseFrom(charSequence, i11, i13, c10, new StringBuilder(i13 - i11), false);
    }

    public String trimFrom(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && matches(charSequence.charAt(i10))) {
            i10++;
        }
        int i11 = length - 1;
        while (i11 > i10 && matches(charSequence.charAt(i11))) {
            i11--;
        }
        return charSequence.subSequence(i10, i11 + 1).toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!matches(charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, length).toString();
            }
        }
        return "";
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    @Override // com.applovin.exoplayer2.common.base.Predicate
    @Deprecated
    public boolean apply(Character ch) {
        return matches(ch.charValue());
    }

    public int indexIn(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        Preconditions.checkPositionIndex(i10, length);
        while (i10 < length) {
            if (matches(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i10 = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        String charSequence3 = charSequence.toString();
        int indexIn = indexIn(charSequence3);
        if (indexIn == -1) {
            return charSequence3;
        }
        int length2 = charSequence3.length();
        StringBuilder sb2 = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb2.append((CharSequence) charSequence3, i10, indexIn);
            sb2.append(charSequence2);
            i10 = indexIn + 1;
            indexIn = indexIn(charSequence3, i10);
        } while (indexIn != -1);
        sb2.append((CharSequence) charSequence3, i10, length2);
        return sb2.toString();
    }
}
