package org.jsoup.parser;

import com.anythink.expressad.foundation.d.f;
import com.huawei.openalliance.ad.constant.bd;
import com.vungle.warren.ui.contract.AdContract;
import java.io.Reader;
import java.util.ArrayList;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Token;
import org.jsoup.parser.a;

/* loaded from: classes2.dex */
public class HtmlTreeBuilder extends d {
    public static final String[] A = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
    public static final String[] B = {"ol", "ul"};
    public static final String[] C = {"button"};
    public static final String[] D = {"html", "table"};
    public static final String[] E = {"optgroup", "option"};
    public static final String[] F = {"dd", "dt", "li", "optgroup", "option", com.anythink.core.common.g.c.W, "rb", "rp", "rt", "rtc"};
    public static final String[] G = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", com.anythink.core.common.g.c.W, "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] H = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", AdContract.AdvertisementBus.COMMAND, "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", f.f9576j, "hgroup", "hr", "html", "iframe", bd.Code, "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", com.anythink.core.common.g.c.W, "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};
    public static final int MaxScopeSearchDepth = 100;

    /* renamed from: m, reason: collision with root package name */
    public a f34021m;

    /* renamed from: n, reason: collision with root package name */
    public a f34022n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public Element f34023p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public FormElement f34024q;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public Element f34025r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList<Element> f34026s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList<a> f34027t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f34028u;

    /* renamed from: v, reason: collision with root package name */
    public Token.f f34029v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f34030w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f34031x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public final String[] f34032z = {null};

    public static boolean L(ArrayList<Element> arrayList, Element element) {
        int i10;
        int size = arrayList.size() - 1;
        if (size >= 256) {
            i10 = size - 256;
        } else {
            i10 = 0;
        }
        while (size >= i10) {
            if (arrayList.get(size) == element) {
                return true;
            }
            size--;
        }
        return false;
    }

    public final boolean A(String str) {
        for (int size = this.f34160e.size() - 1; size >= 0; size--) {
            String normalName = this.f34160e.get(size).normalName();
            if (normalName.equals(str)) {
                return true;
            }
            if (!StringUtil.inSorted(normalName, E)) {
                return false;
            }
        }
        Validate.fail("Should not be reachable");
        return false;
    }

    public final boolean B(String[] strArr, String[] strArr2, String[] strArr3) {
        int i10;
        int size = this.f34160e.size() - 1;
        if (size > 100) {
            i10 = size - 100;
        } else {
            i10 = 0;
        }
        while (size >= i10) {
            String normalName = this.f34160e.get(size).normalName();
            if (StringUtil.inSorted(normalName, strArr)) {
                return true;
            }
            if (StringUtil.inSorted(normalName, strArr2)) {
                return false;
            }
            if (strArr3 != null && StringUtil.inSorted(normalName, strArr3)) {
                return false;
            }
            size--;
        }
        return false;
    }

    public final boolean C(String str) {
        String[] strArr = D;
        String[] strArr2 = this.f34032z;
        strArr2[0] = str;
        return B(strArr2, strArr, null);
    }

    public final Element D(Token.g gVar) {
        if (gVar.l() && !gVar.f34071n.isEmpty() && gVar.f34071n.deduplicate(this.f34162h) > 0) {
            Object[] objArr = {gVar.f34063e};
            ParseErrorList errors = this.f34156a.getErrors();
            if (errors.p()) {
                errors.add(new ParseError(this.f34157b, "Dropped duplicate attribute(s) in tag [%s]", objArr));
            }
        }
        if (gVar.f34070m) {
            Element G2 = G(gVar);
            this.f34160e.add(G2);
            this.f34158c.o(c.f34142s);
            b bVar = this.f34158c;
            Token.f fVar = this.f34029v;
            fVar.f();
            fVar.n(G2.tagName());
            bVar.h(fVar);
            return G2;
        }
        Tag m10 = m(gVar.m(), this.f34162h);
        ParseSettings parseSettings = this.f34162h;
        Attributes attributes = gVar.f34071n;
        if (attributes != null) {
            if (!parseSettings.f34039b) {
                attributes.normalize();
            }
        } else {
            parseSettings.getClass();
        }
        Element element = new Element(m10, null, attributes);
        J(element, gVar);
        this.f34160e.add(element);
        return element;
    }

    public final void E(Token.b bVar) {
        Node textNode;
        Element a10 = a();
        String normalName = a10.normalName();
        String str = bVar.f34055d;
        if (bVar instanceof Token.a) {
            textNode = new CDataNode(str);
        } else if (e(normalName)) {
            textNode = new DataNode(str);
        } else {
            textNode = new TextNode(str);
        }
        a10.appendChild(textNode);
        n(textNode, bVar, true);
    }

    public final void F(Token.c cVar) {
        String str = cVar.f34057e;
        if (str == null) {
            str = cVar.f34056d.toString();
        }
        J(new Comment(str), cVar);
    }

    public final Element G(Token.g gVar) {
        Tag m10 = m(gVar.m(), this.f34162h);
        ParseSettings parseSettings = this.f34162h;
        Attributes attributes = gVar.f34071n;
        if (attributes != null) {
            if (!parseSettings.f34039b) {
                attributes.normalize();
            }
        } else {
            parseSettings.getClass();
        }
        Element element = new Element(m10, null, attributes);
        J(element, gVar);
        if (gVar.f34070m) {
            if (m10.isKnownTag()) {
                if (!m10.isEmpty()) {
                    b bVar = this.f34158c;
                    Object[] objArr = {m10.normalName()};
                    ParseErrorList parseErrorList = bVar.f34109b;
                    if (parseErrorList.p()) {
                        parseErrorList.add(new ParseError(bVar.f34108a, "Tag [%s] cannot be self closing; not a void tag", objArr));
                    }
                }
            } else {
                m10.f34049x = true;
            }
        }
        return element;
    }

    public final void H(Token.g gVar, boolean z10, boolean z11) {
        Tag m10 = m(gVar.m(), this.f34162h);
        ParseSettings parseSettings = this.f34162h;
        Attributes attributes = gVar.f34071n;
        if (attributes != null) {
            if (!parseSettings.f34039b) {
                attributes.normalize();
            }
        } else {
            parseSettings.getClass();
        }
        FormElement formElement = new FormElement(m10, null, attributes);
        if (z11) {
            if (!K("template")) {
                this.f34024q = formElement;
            }
        } else {
            this.f34024q = formElement;
        }
        J(formElement, gVar);
        if (z10) {
            this.f34160e.add(formElement);
        }
    }

    public final void I(Node node) {
        Element element;
        Element x10 = x("table");
        boolean z10 = false;
        if (x10 != null) {
            if (x10.parent() != null) {
                element = x10.parent();
                z10 = true;
            } else {
                element = o(x10);
            }
        } else {
            element = this.f34160e.get(0);
        }
        if (z10) {
            Validate.notNull(x10);
            x10.before(node);
        } else {
            element.appendChild(node);
        }
    }

    public final void J(Node node, @Nullable Token token) {
        FormElement formElement;
        if (this.f34160e.isEmpty()) {
            this.f34159d.appendChild(node);
        } else if (this.f34031x && StringUtil.inSorted(a().normalName(), a.z.A)) {
            I(node);
        } else {
            a().appendChild(node);
        }
        if (node instanceof Element) {
            Element element = (Element) node;
            if (element.tag().isFormListed() && (formElement = this.f34024q) != null) {
                formElement.addElement(element);
            }
        }
        n(node, token, true);
    }

    public final boolean K(String str) {
        if (x(str) != null) {
            return true;
        }
        return false;
    }

    public final void M() {
        this.f34160e.remove(this.f34160e.size() - 1);
    }

    @Nullable
    public final void N(String str) {
        Element element;
        int size = this.f34160e.size();
        do {
            size--;
            if (size >= 0) {
                element = this.f34160e.get(size);
                this.f34160e.remove(size);
            } else {
                return;
            }
        } while (!element.normalName().equals(str));
        Token token = this.f34161g;
        if (token instanceof Token.f) {
            n(element, token, false);
        }
    }

    @Nullable
    public final void O() {
        if (this.f34027t.size() > 0) {
            this.f34027t.remove(r0.size() - 1);
        }
    }

    public final boolean P(Token token, a aVar) {
        this.f34161g = token;
        return aVar.c(token, this);
    }

    public final void Q(a aVar) {
        this.f34027t.add(aVar);
    }

    public final void R() {
        Element element;
        HtmlTreeBuilder htmlTreeBuilder;
        if (this.f34160e.size() > 256) {
            return;
        }
        if (this.f34026s.size() > 0) {
            element = this.f34026s.get(r0.size() - 1);
        } else {
            element = null;
        }
        if (element != null && !L(this.f34160e, element)) {
            int size = this.f34026s.size();
            int i10 = size - 12;
            if (i10 < 0) {
                i10 = 0;
            }
            boolean z10 = true;
            int i11 = size - 1;
            int i12 = i11;
            while (i12 != i10) {
                i12--;
                element = this.f34026s.get(i12);
                if (element == null || L(this.f34160e, element)) {
                    htmlTreeBuilder = this;
                    z10 = false;
                    break;
                }
            }
            htmlTreeBuilder = this;
            while (true) {
                if (!z10) {
                    i12++;
                    element = htmlTreeBuilder.f34026s.get(i12);
                }
                Validate.notNull(element);
                Element element2 = new Element(htmlTreeBuilder.m(element.normalName(), htmlTreeBuilder.f34162h), null, element.attributes().clone());
                htmlTreeBuilder.J(element2, null);
                htmlTreeBuilder.f34160e.add(element2);
                htmlTreeBuilder.f34026s.set(i12, element2);
                if (i12 != i11) {
                    z10 = false;
                } else {
                    return;
                }
            }
        }
    }

    public final void S(Element element) {
        int size = this.f34026s.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (this.f34026s.get(size) != element);
        this.f34026s.remove(size);
    }

    public final void T(Element element) {
        for (int size = this.f34160e.size() - 1; size >= 0; size--) {
            if (this.f34160e.get(size) == element) {
                this.f34160e.remove(size);
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0102. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0142 A[LOOP:0: B:8:0x0020->B:34:0x0142, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean U() {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilder.U():boolean");
    }

    @Override // org.jsoup.parser.d
    public final ParseSettings c() {
        return ParseSettings.htmlDefault;
    }

    @Override // org.jsoup.parser.d
    @ParametersAreNonnullByDefault
    public final void d(Reader reader, String str, Parser parser) {
        super.d(reader, str, parser);
        this.f34021m = a.f34075s;
        this.f34022n = null;
        this.o = false;
        this.f34023p = null;
        this.f34024q = null;
        this.f34025r = null;
        this.f34026s = new ArrayList<>();
        this.f34027t = new ArrayList<>();
        this.f34028u = new ArrayList();
        this.f34029v = new Token.f();
        this.f34030w = true;
        this.f34031x = false;
        this.y = false;
    }

    @Override // org.jsoup.parser.d
    public final boolean e(String str) {
        if (!str.equals("script") && !str.equals("style")) {
            return false;
        }
        return true;
    }

    @Override // org.jsoup.parser.d
    public final d f() {
        return new HtmlTreeBuilder();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a6, code lost:
    
        if (r0.equals("iframe") == false) goto L9;
     */
    @Override // org.jsoup.parser.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<org.jsoup.nodes.Node> h(java.lang.String r3, @javax.annotation.Nullable org.jsoup.nodes.Element r4, java.lang.String r5, org.jsoup.parser.Parser r6) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilder.h(java.lang.String, org.jsoup.nodes.Element, java.lang.String, org.jsoup.parser.Parser):java.util.List");
    }

    @Override // org.jsoup.parser.d
    public final boolean i(Token token) {
        this.f34161g = token;
        return this.f34021m.c(token, this);
    }

    @Nullable
    public final Element o(Element element) {
        for (int size = this.f34160e.size() - 1; size >= 0; size--) {
            if (this.f34160e.get(size) == element) {
                return this.f34160e.get(size - 1);
            }
        }
        return null;
    }

    public final void p(Element element) {
        boolean z10;
        int size = this.f34026s.size() - 1;
        int i10 = size - 12;
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = 0;
        while (size >= i10) {
            Element element2 = this.f34026s.get(size);
            if (element2 != null) {
                if (element.normalName().equals(element2.normalName()) && element.attributes().equals(element2.attributes())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i11++;
                }
                if (i11 == 3) {
                    this.f34026s.remove(size);
                    return;
                }
                size--;
            } else {
                return;
            }
        }
    }

    @Override // org.jsoup.parser.d
    public /* bridge */ /* synthetic */ boolean processStartTag(String str, Attributes attributes) {
        return super.processStartTag(str, attributes);
    }

    public final void q() {
        Element element;
        while (!this.f34026s.isEmpty()) {
            int size = this.f34026s.size();
            if (size > 0) {
                element = this.f34026s.remove(size - 1);
            } else {
                element = null;
            }
            if (element == null) {
                return;
            }
        }
    }

    public final void r(String... strArr) {
        int size = this.f34160e.size();
        while (true) {
            size--;
            if (size >= 0) {
                Element element = this.f34160e.get(size);
                if (!StringUtil.in(element.normalName(), strArr) && !element.normalName().equals("html")) {
                    this.f34160e.remove(size);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void s() {
        r("table", "template");
    }

    public final void t(a aVar) {
        if (this.f34156a.getErrors().p()) {
            this.f34156a.getErrors().add(new ParseError(this.f34157b, "Unexpected %s token [%s] when in state [%s]", this.f34161g.getClass().getSimpleName(), this.f34161g, aVar));
        }
    }

    public String toString() {
        return "TreeBuilder{currentToken=" + this.f34161g + ", state=" + this.f34021m + ", currentElement=" + a() + '}';
    }

    public final void u(String str) {
        while (StringUtil.inSorted(a().normalName(), F)) {
            if (str == null || !b(str)) {
                M();
            } else {
                return;
            }
        }
    }

    public final void v(boolean z10) {
        String[] strArr;
        if (z10) {
            strArr = G;
        } else {
            strArr = F;
        }
        while (StringUtil.inSorted(a().normalName(), strArr)) {
            M();
        }
    }

    public final Element w(String str) {
        for (int size = this.f34026s.size() - 1; size >= 0; size--) {
            Element element = this.f34026s.get(size);
            if (element != null) {
                if (element.normalName().equals(str)) {
                    return element;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    @Nullable
    public final Element x(String str) {
        int i10;
        int size = this.f34160e.size() - 1;
        if (size >= 256) {
            i10 = size - 256;
        } else {
            i10 = 0;
        }
        while (size >= i10) {
            Element element = this.f34160e.get(size);
            if (element.normalName().equals(str)) {
                return element;
            }
            size--;
        }
        return null;
    }

    public final boolean y(String str) {
        return z(str, C);
    }

    public final boolean z(String str, String[] strArr) {
        String[] strArr2 = A;
        String[] strArr3 = this.f34032z;
        strArr3[0] = str;
        return B(strArr3, strArr2, strArr);
    }
}
