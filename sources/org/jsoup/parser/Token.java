package org.jsoup.parser;

import a3.l;
import javax.annotation.Nullable;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Attributes;

/* loaded from: classes2.dex */
public abstract class Token {

    /* renamed from: a, reason: collision with root package name */
    public TokenType f34051a;

    /* renamed from: b, reason: collision with root package name */
    public int f34052b;

    /* renamed from: c, reason: collision with root package name */
    public int f34053c = -1;

    /* loaded from: classes2.dex */
    public enum TokenType {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    /* loaded from: classes2.dex */
    public static final class a extends b {
        public a(String str) {
            this.f34055d = str;
        }

        @Override // org.jsoup.parser.Token.b
        public final String toString() {
            return l.p(new StringBuilder("<![CDATA["), this.f34055d, "]]>");
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends Token {

        /* renamed from: d, reason: collision with root package name */
        public String f34055d;

        public b() {
            this.f34051a = TokenType.Character;
        }

        @Override // org.jsoup.parser.Token
        public final void f() {
            this.f34052b = -1;
            this.f34053c = -1;
            this.f34055d = null;
        }

        public String toString() {
            return this.f34055d;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends Token {

        /* renamed from: e, reason: collision with root package name */
        public String f34057e;

        /* renamed from: d, reason: collision with root package name */
        public final StringBuilder f34056d = new StringBuilder();
        public boolean f = false;

        public c() {
            this.f34051a = TokenType.Comment;
        }

        @Override // org.jsoup.parser.Token
        public final void f() {
            this.f34052b = -1;
            this.f34053c = -1;
            Token.g(this.f34056d);
            this.f34057e = null;
            this.f = false;
        }

        public final void h(char c10) {
            String str = this.f34057e;
            StringBuilder sb2 = this.f34056d;
            if (str != null) {
                sb2.append(str);
                this.f34057e = null;
            }
            sb2.append(c10);
        }

        public final void i(String str) {
            String str2 = this.f34057e;
            StringBuilder sb2 = this.f34056d;
            if (str2 != null) {
                sb2.append(str2);
                this.f34057e = null;
            }
            if (sb2.length() == 0) {
                this.f34057e = str;
            } else {
                sb2.append(str);
            }
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("<!--");
            String str = this.f34057e;
            if (str == null) {
                str = this.f34056d.toString();
            }
            return l.p(sb2, str, "-->");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends Token {

        /* renamed from: d, reason: collision with root package name */
        public final StringBuilder f34058d = new StringBuilder();

        /* renamed from: e, reason: collision with root package name */
        public String f34059e = null;
        public final StringBuilder f = new StringBuilder();

        /* renamed from: g, reason: collision with root package name */
        public final StringBuilder f34060g = new StringBuilder();

        /* renamed from: h, reason: collision with root package name */
        public boolean f34061h = false;

        public d() {
            this.f34051a = TokenType.Doctype;
        }

        @Override // org.jsoup.parser.Token
        public final void f() {
            this.f34052b = -1;
            this.f34053c = -1;
            Token.g(this.f34058d);
            this.f34059e = null;
            Token.g(this.f);
            Token.g(this.f34060g);
            this.f34061h = false;
        }

        public final String toString() {
            return "<!doctype " + this.f34058d.toString() + ">";
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends Token {
        public e() {
            this.f34051a = TokenType.EOF;
        }

        @Override // org.jsoup.parser.Token
        public final void f() {
            this.f34052b = -1;
            this.f34053c = -1;
        }

        public final String toString() {
            return "";
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends h {
        public f() {
            this.f34051a = TokenType.EndTag;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("</");
            String str = this.f34062d;
            if (str == null) {
                str = "[unset]";
            }
            return l.p(sb2, str, ">");
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends h {
        public g() {
            this.f34051a = TokenType.StartTag;
        }

        @Override // org.jsoup.parser.Token.h, org.jsoup.parser.Token
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final h f() {
            super.f();
            this.f34071n = null;
            return this;
        }

        public final String toString() {
            String str = "[unset]";
            if (l() && this.f34071n.size() > 0) {
                StringBuilder sb2 = new StringBuilder("<");
                String str2 = this.f34062d;
                if (str2 != null) {
                    str = str2;
                }
                sb2.append(str);
                sb2.append(" ");
                sb2.append(this.f34071n.toString());
                sb2.append(">");
                return sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder("<");
            String str3 = this.f34062d;
            if (str3 != null) {
                str = str3;
            }
            return l.p(sb3, str, ">");
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class h extends Token {

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        public String f34062d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        public String f34063e;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        public String f34064g;

        /* renamed from: j, reason: collision with root package name */
        @Nullable
        public String f34067j;

        /* renamed from: n, reason: collision with root package name */
        @Nullable
        public Attributes f34071n;
        public final StringBuilder f = new StringBuilder();

        /* renamed from: h, reason: collision with root package name */
        public boolean f34065h = false;

        /* renamed from: i, reason: collision with root package name */
        public final StringBuilder f34066i = new StringBuilder();

        /* renamed from: k, reason: collision with root package name */
        public boolean f34068k = false;

        /* renamed from: l, reason: collision with root package name */
        public boolean f34069l = false;

        /* renamed from: m, reason: collision with root package name */
        public boolean f34070m = false;

        public final void h(char c10) {
            this.f34068k = true;
            String str = this.f34067j;
            StringBuilder sb2 = this.f34066i;
            if (str != null) {
                sb2.append(str);
                this.f34067j = null;
            }
            sb2.append(c10);
        }

        public final void i(String str) {
            this.f34068k = true;
            String str2 = this.f34067j;
            StringBuilder sb2 = this.f34066i;
            if (str2 != null) {
                sb2.append(str2);
                this.f34067j = null;
            }
            if (sb2.length() == 0) {
                this.f34067j = str;
            } else {
                sb2.append(str);
            }
        }

        public final void j(int[] iArr) {
            this.f34068k = true;
            String str = this.f34067j;
            StringBuilder sb2 = this.f34066i;
            if (str != null) {
                sb2.append(str);
                this.f34067j = null;
            }
            for (int i10 : iArr) {
                sb2.appendCodePoint(i10);
            }
        }

        public final void k(String str) {
            String replace = str.replace((char) 0, (char) 65533);
            String str2 = this.f34062d;
            if (str2 != null) {
                replace = str2.concat(replace);
            }
            this.f34062d = replace;
            ParseSettings parseSettings = ParseSettings.htmlDefault;
            this.f34063e = Normalizer.lowerCase(replace.trim());
        }

        public final boolean l() {
            if (this.f34071n != null) {
                return true;
            }
            return false;
        }

        public final String m() {
            boolean z10;
            String str = this.f34062d;
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            Validate.isFalse(z10);
            return this.f34062d;
        }

        public final void n(String str) {
            this.f34062d = str;
            ParseSettings parseSettings = ParseSettings.htmlDefault;
            this.f34063e = Normalizer.lowerCase(str.trim());
        }

        public final void o() {
            String str;
            String str2;
            if (this.f34071n == null) {
                this.f34071n = new Attributes();
            }
            boolean z10 = this.f34065h;
            StringBuilder sb2 = this.f34066i;
            StringBuilder sb3 = this.f;
            if (z10 && this.f34071n.size() < 512) {
                if (sb3.length() > 0) {
                    str = sb3.toString();
                } else {
                    str = this.f34064g;
                }
                String trim = str.trim();
                if (trim.length() > 0) {
                    if (this.f34068k) {
                        if (sb2.length() > 0) {
                            str2 = sb2.toString();
                        } else {
                            str2 = this.f34067j;
                        }
                    } else if (this.f34069l) {
                        str2 = "";
                    } else {
                        str2 = null;
                    }
                    this.f34071n.add(trim, str2);
                }
            }
            Token.g(sb3);
            this.f34064g = null;
            this.f34065h = false;
            Token.g(sb2);
            this.f34067j = null;
            this.f34068k = false;
            this.f34069l = false;
        }

        @Override // org.jsoup.parser.Token
        /* renamed from: p */
        public h f() {
            this.f34052b = -1;
            this.f34053c = -1;
            this.f34062d = null;
            this.f34063e = null;
            Token.g(this.f);
            this.f34064g = null;
            this.f34065h = false;
            Token.g(this.f34066i);
            this.f34067j = null;
            this.f34069l = false;
            this.f34068k = false;
            this.f34070m = false;
            this.f34071n = null;
            return this;
        }
    }

    public static void g(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    public final boolean a() {
        if (this.f34051a == TokenType.Comment) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f34051a == TokenType.Doctype) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f34051a == TokenType.EOF) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f34051a == TokenType.EndTag) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f34051a == TokenType.StartTag) {
            return true;
        }
        return false;
    }

    public abstract void f();
}
