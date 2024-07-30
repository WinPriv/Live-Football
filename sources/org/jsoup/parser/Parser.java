package org.jsoup.parser;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

/* loaded from: classes2.dex */
public class Parser {

    /* renamed from: a, reason: collision with root package name */
    public d f34040a;

    /* renamed from: b, reason: collision with root package name */
    public ParseErrorList f34041b;

    /* renamed from: c, reason: collision with root package name */
    public ParseSettings f34042c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f34043d;

    public Parser(d dVar) {
        this.f34043d = false;
        this.f34040a = dVar;
        this.f34042c = dVar.c();
        this.f34041b = ParseErrorList.noTracking();
    }

    public static Parser htmlParser() {
        return new Parser(new HtmlTreeBuilder());
    }

    public static Document parse(String str, String str2) {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        return htmlTreeBuilder.g(new StringReader(str), str2, new Parser(htmlTreeBuilder));
    }

    public static Document parseBodyFragment(String str, String str2) {
        Document createShell = Document.createShell(str2);
        Element body = createShell.body();
        List<Node> parseFragment = parseFragment(str, body, str2);
        Node[] nodeArr = (Node[]) parseFragment.toArray(new Node[0]);
        for (int length = nodeArr.length - 1; length > 0; length--) {
            nodeArr[length].remove();
        }
        for (Node node : nodeArr) {
            body.appendChild(node);
        }
        return createShell;
    }

    public static List<Node> parseFragment(String str, Element element, String str2) {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        return htmlTreeBuilder.h(str, element, str2, new Parser(htmlTreeBuilder));
    }

    public static List<Node> parseXmlFragment(String str, String str2) {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.d(new StringReader(str), str2, new Parser(xmlTreeBuilder));
        xmlTreeBuilder.l();
        return xmlTreeBuilder.f34159d.childNodes();
    }

    public static String unescapeEntities(String str, boolean z10) {
        b bVar = new b(new CharacterReader(str), ParseErrorList.noTracking());
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        while (true) {
            CharacterReader characterReader = bVar.f34108a;
            if (!characterReader.isEmpty()) {
                borrowBuilder.append(characterReader.consumeTo('&'));
                if (characterReader.n('&')) {
                    characterReader.d();
                    int[] b10 = bVar.b(null, z10);
                    if (b10 != null && b10.length != 0) {
                        borrowBuilder.appendCodePoint(b10[0]);
                        if (b10.length == 2) {
                            borrowBuilder.appendCodePoint(b10[1]);
                        }
                    } else {
                        borrowBuilder.append('&');
                    }
                }
            } else {
                return StringUtil.releaseBuilder(borrowBuilder);
            }
        }
    }

    public static Parser xmlParser() {
        return new Parser(new XmlTreeBuilder());
    }

    public ParseErrorList getErrors() {
        return this.f34041b;
    }

    public d getTreeBuilder() {
        return this.f34040a;
    }

    public boolean isContentForTagData(String str) {
        return getTreeBuilder().e(str);
    }

    public boolean isTrackErrors() {
        if (this.f34041b.f34037t > 0) {
            return true;
        }
        return false;
    }

    public boolean isTrackPosition() {
        return this.f34043d;
    }

    public Parser newInstance() {
        return new Parser(this);
    }

    public List<Node> parseFragmentInput(String str, Element element, String str2) {
        return this.f34040a.h(str, element, str2, this);
    }

    public Document parseInput(String str, String str2) {
        return this.f34040a.g(new StringReader(str), str2, this);
    }

    public Parser setTrackErrors(int i10) {
        ParseErrorList noTracking;
        if (i10 > 0) {
            noTracking = ParseErrorList.tracking(i10);
        } else {
            noTracking = ParseErrorList.noTracking();
        }
        this.f34041b = noTracking;
        return this;
    }

    public Parser setTrackPosition(boolean z10) {
        this.f34043d = z10;
        return this;
    }

    public Parser setTreeBuilder(d dVar) {
        this.f34040a = dVar;
        dVar.f34156a = this;
        return this;
    }

    public Parser settings(ParseSettings parseSettings) {
        this.f34042c = parseSettings;
        return this;
    }

    public Document parseInput(Reader reader, String str) {
        return this.f34040a.g(reader, str, this);
    }

    public ParseSettings settings() {
        return this.f34042c;
    }

    public static List<Node> parseFragment(String str, Element element, String str2, ParseErrorList parseErrorList) {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        Parser parser = new Parser(htmlTreeBuilder);
        parser.f34041b = parseErrorList;
        return htmlTreeBuilder.h(str, element, str2, parser);
    }

    public Parser(Parser parser) {
        this.f34043d = false;
        this.f34040a = parser.f34040a.f();
        ParseErrorList parseErrorList = parser.f34041b;
        this.f34041b = new ParseErrorList(parseErrorList.f34036s, parseErrorList.f34037t);
        ParseSettings parseSettings = parser.f34042c;
        this.f34042c = new ParseSettings(parseSettings.f34038a, parseSettings.f34039b);
        this.f34043d = parser.f34043d;
    }
}
