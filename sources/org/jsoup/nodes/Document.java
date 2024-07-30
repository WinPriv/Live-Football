package org.jsoup.nodes;

import com.anythink.core.common.b.g;
import com.anythink.expressad.exoplayer.b;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nullable;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;

/* loaded from: classes2.dex */
public class Document extends Element {
    public static final Evaluator.Tag I = new Evaluator.Tag("title");

    @Nullable
    public Connection C;
    public OutputSettings D;
    public Parser E;
    public QuirksMode F;
    public final String G;
    public boolean H;

    /* loaded from: classes2.dex */
    public static class OutputSettings implements Cloneable {

        /* renamed from: v, reason: collision with root package name */
        @Nullable
        public int f33975v;

        /* renamed from: s, reason: collision with root package name */
        public Entities.EscapeMode f33972s = Entities.EscapeMode.base;

        /* renamed from: t, reason: collision with root package name */
        public Charset f33973t = DataUtil.UTF_8;

        /* renamed from: u, reason: collision with root package name */
        public final ThreadLocal<CharsetEncoder> f33974u = new ThreadLocal<>();

        /* renamed from: w, reason: collision with root package name */
        public boolean f33976w = true;

        /* renamed from: x, reason: collision with root package name */
        public boolean f33977x = false;
        public int y = 1;

        /* renamed from: z, reason: collision with root package name */
        public int f33978z = 30;
        public Syntax A = Syntax.html;

        /* loaded from: classes2.dex */
        public enum Syntax {
            html,
            xml
        }

        public final CharsetEncoder a() {
            int i10;
            CharsetEncoder newEncoder = this.f33973t.newEncoder();
            this.f33974u.set(newEncoder);
            String name = newEncoder.charset().name();
            if (name.equals(b.f7301i)) {
                i10 = 1;
            } else if (name.startsWith("UTF-")) {
                i10 = 2;
            } else {
                i10 = 3;
            }
            this.f33975v = i10;
            return newEncoder;
        }

        public Charset charset() {
            return this.f33973t;
        }

        public Entities.EscapeMode escapeMode() {
            return this.f33972s;
        }

        public int indentAmount() {
            return this.y;
        }

        public int maxPaddingWidth() {
            return this.f33978z;
        }

        public boolean outline() {
            return this.f33977x;
        }

        public boolean prettyPrint() {
            return this.f33976w;
        }

        public Syntax syntax() {
            return this.A;
        }

        public OutputSettings charset(Charset charset) {
            this.f33973t = charset;
            return this;
        }

        public OutputSettings clone() {
            try {
                OutputSettings outputSettings = (OutputSettings) super.clone();
                outputSettings.charset(this.f33973t.name());
                outputSettings.f33972s = Entities.EscapeMode.valueOf(this.f33972s.name());
                return outputSettings;
            } catch (CloneNotSupportedException e10) {
                throw new RuntimeException(e10);
            }
        }

        public OutputSettings escapeMode(Entities.EscapeMode escapeMode) {
            this.f33972s = escapeMode;
            return this;
        }

        public OutputSettings indentAmount(int i10) {
            Validate.isTrue(i10 >= 0);
            this.y = i10;
            return this;
        }

        public OutputSettings maxPaddingWidth(int i10) {
            Validate.isTrue(i10 >= -1);
            this.f33978z = i10;
            return this;
        }

        public OutputSettings outline(boolean z10) {
            this.f33977x = z10;
            return this;
        }

        public OutputSettings prettyPrint(boolean z10) {
            this.f33976w = z10;
            return this;
        }

        public OutputSettings syntax(Syntax syntax) {
            this.A = syntax;
            return this;
        }

        public OutputSettings charset(String str) {
            charset(Charset.forName(str));
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public enum QuirksMode {
        noQuirks,
        quirks,
        limitedQuirks
    }

    public Document(String str) {
        super(Tag.valueOf("#root", ParseSettings.htmlDefault), str);
        this.D = new OutputSettings();
        this.F = QuirksMode.noQuirks;
        this.H = false;
        this.G = str;
        this.E = Parser.htmlParser();
    }

    public static Document createShell(String str) {
        Validate.notNull(str);
        Document document = new Document(str);
        document.E = document.parser();
        Element appendElement = document.appendElement("html");
        appendElement.appendElement("head");
        appendElement.appendElement("body");
        return document;
    }

    public Element body() {
        Element v3 = v();
        for (Element element : v3.q()) {
            if ("body".equals(element.normalName()) || "frameset".equals(element.normalName())) {
                return element;
            }
        }
        return v3.appendElement("body");
    }

    public void charset(Charset charset) {
        updateMetaCharsetElement(true);
        this.D.charset(charset);
        u();
    }

    public Connection connection() {
        Connection connection = this.C;
        return connection == null ? Jsoup.newSession() : connection;
    }

    public Element createElement(String str) {
        return new Element(Tag.valueOf(str, ParseSettings.preserveCase), baseUri());
    }

    @Nullable
    public DocumentType documentType() {
        for (Node node : this.f33984x) {
            if (node instanceof DocumentType) {
                return (DocumentType) node;
            }
            if (!(node instanceof gd.a)) {
                return null;
            }
        }
        return null;
    }

    public Element head() {
        Element v3 = v();
        for (Element element : v3.q()) {
            if (element.normalName().equals("head")) {
                return element;
            }
        }
        return v3.prependElement("head");
    }

    public String location() {
        return this.G;
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    public String nodeName() {
        return "#document";
    }

    public Document normalise() {
        Element v3 = v();
        Element head = head();
        body();
        x(head);
        x(v3);
        x(this);
        w("head", v3);
        w("body", v3);
        u();
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public String outerHtml() {
        return super.html();
    }

    public OutputSettings outputSettings() {
        return this.D;
    }

    public Parser parser() {
        return this.E;
    }

    public QuirksMode quirksMode() {
        return this.F;
    }

    @Override // org.jsoup.nodes.Element
    public Element text(String str) {
        body().text(str);
        return this;
    }

    public String title() {
        Element selectFirst = head().selectFirst(I);
        return selectFirst != null ? StringUtil.normaliseWhitespace(selectFirst.text()).trim() : "";
    }

    public final void u() {
        if (this.H) {
            OutputSettings.Syntax syntax = outputSettings().syntax();
            if (syntax == OutputSettings.Syntax.html) {
                Element selectFirst = selectFirst("meta[charset]");
                if (selectFirst != null) {
                    selectFirst.attr("charset", charset().displayName());
                } else {
                    head().appendElement("meta").attr("charset", charset().displayName());
                }
                select("meta[name=charset]").remove();
                return;
            }
            if (syntax == OutputSettings.Syntax.xml) {
                Node node = e().get(0);
                if (node instanceof XmlDeclaration) {
                    XmlDeclaration xmlDeclaration = (XmlDeclaration) node;
                    if (xmlDeclaration.name().equals("xml")) {
                        xmlDeclaration.attr("encoding", charset().displayName());
                        if (xmlDeclaration.hasAttr("version")) {
                            xmlDeclaration.attr("version", g.c.f5034a);
                            return;
                        }
                        return;
                    }
                    XmlDeclaration xmlDeclaration2 = new XmlDeclaration("xml", false);
                    xmlDeclaration2.attr("version", g.c.f5034a);
                    xmlDeclaration2.attr("encoding", charset().displayName());
                    prependChild(xmlDeclaration2);
                    return;
                }
                XmlDeclaration xmlDeclaration3 = new XmlDeclaration("xml", false);
                xmlDeclaration3.attr("version", g.c.f5034a);
                xmlDeclaration3.attr("encoding", charset().displayName());
                prependChild(xmlDeclaration3);
            }
        }
    }

    public void updateMetaCharsetElement(boolean z10) {
        this.H = z10;
    }

    public final Element v() {
        for (Element element : q()) {
            if (element.normalName().equals("html")) {
                return element;
            }
        }
        return appendElement("html");
    }

    public final void w(String str, Element element) {
        Elements elementsByTag = getElementsByTag(str);
        Element first = elementsByTag.first();
        if (elementsByTag.size() > 1) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 1; i10 < elementsByTag.size(); i10++) {
                Element element2 = elementsByTag.get(i10);
                arrayList.addAll(element2.e());
                element2.remove();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                first.appendChild((Node) it.next());
            }
        }
        if (first.parent() != null && !first.parent().equals(element)) {
            element.appendChild(first);
        }
    }

    public final void x(Element element) {
        ArrayList arrayList = new ArrayList();
        for (Node node : element.f33984x) {
            if (node instanceof TextNode) {
                TextNode textNode = (TextNode) node;
                if (!textNode.isBlank()) {
                    arrayList.add(textNode);
                }
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Node node2 = (Node) arrayList.get(size);
            element.l(node2);
            body().prependChild(new TextNode(" "));
            body().prependChild(node2);
        }
    }

    public Document outputSettings(OutputSettings outputSettings) {
        Validate.notNull(outputSettings);
        this.D = outputSettings;
        return this;
    }

    public Document parser(Parser parser) {
        this.E = parser;
        return this;
    }

    public Document quirksMode(QuirksMode quirksMode) {
        this.F = quirksMode;
        return this;
    }

    public boolean updateMetaCharsetElement() {
        return this.H;
    }

    public Document connection(Connection connection) {
        Validate.notNull(connection);
        this.C = connection;
        return this;
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    public Document shallowClone() {
        Document document = new Document(baseUri());
        Attributes attributes = this.y;
        if (attributes != null) {
            document.y = attributes.clone();
        }
        document.D = this.D.clone();
        return document;
    }

    public void title(String str) {
        Validate.notNull(str);
        Element selectFirst = head().selectFirst(I);
        if (selectFirst == null) {
            selectFirst = head().appendElement("title");
        }
        selectFirst.text(str);
    }

    public Charset charset() {
        return this.D.charset();
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Document mo10clone() {
        Document document = (Document) super.mo10clone();
        document.D = this.D.clone();
        return document;
    }
}
