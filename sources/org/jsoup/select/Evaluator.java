package org.jsoup.select;

import java.util.Iterator;
import java.util.regex.Pattern;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

/* loaded from: classes2.dex */
public abstract class Evaluator {

    /* loaded from: classes2.dex */
    public static final class AllElements extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return true;
        }

        public String toString() {
            return "*";
        }
    }

    /* loaded from: classes2.dex */
    public static final class Attribute extends Evaluator {

        /* renamed from: a, reason: collision with root package name */
        public final String f34186a;

        public Attribute(String str) {
            this.f34186a = str;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.f34186a);
        }

        public String toString() {
            return String.format("[%s]", this.f34186a);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class AttributeKeyPair extends Evaluator {

        /* renamed from: a, reason: collision with root package name */
        public final String f34187a;

        /* renamed from: b, reason: collision with root package name */
        public final String f34188b;

        public AttributeKeyPair(String str, String str2) {
            this(str, str2, true);
        }

        public AttributeKeyPair(String str, String str2, boolean z10) {
            Validate.notEmpty(str);
            Validate.notEmpty(str2);
            this.f34187a = Normalizer.normalize(str);
            boolean z11 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
            str2 = z11 ? str2.substring(1, str2.length() - 1) : str2;
            this.f34188b = z10 ? Normalizer.normalize(str2) : Normalizer.normalize(str2, z11);
        }
    }

    /* loaded from: classes2.dex */
    public static final class AttributeStarting extends Evaluator {

        /* renamed from: a, reason: collision with root package name */
        public final String f34189a;

        public AttributeStarting(String str) {
            Validate.notEmpty(str);
            this.f34189a = Normalizer.lowerCase(str);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            Iterator<org.jsoup.nodes.Attribute> it = element2.attributes().asList().iterator();
            while (it.hasNext()) {
                if (Normalizer.lowerCase(it.next().getKey()).startsWith(this.f34189a)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("[^%s]", this.f34189a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class AttributeWithValue extends AttributeKeyPair {
        public AttributeWithValue(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            String str = this.f34187a;
            if (element2.hasAttr(str)) {
                if (this.f34188b.equalsIgnoreCase(element2.attr(str).trim())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("[%s=%s]", this.f34187a, this.f34188b);
        }
    }

    /* loaded from: classes2.dex */
    public static final class AttributeWithValueContaining extends AttributeKeyPair {
        public AttributeWithValueContaining(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            String str = this.f34187a;
            if (element2.hasAttr(str) && Normalizer.lowerCase(element2.attr(str)).contains(this.f34188b)) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format("[%s*=%s]", this.f34187a, this.f34188b);
        }
    }

    /* loaded from: classes2.dex */
    public static final class AttributeWithValueEnding extends AttributeKeyPair {
        public AttributeWithValueEnding(String str, String str2) {
            super(str, str2, false);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            String str = this.f34187a;
            if (element2.hasAttr(str) && Normalizer.lowerCase(element2.attr(str)).endsWith(this.f34188b)) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format("[%s$=%s]", this.f34187a, this.f34188b);
        }
    }

    /* loaded from: classes2.dex */
    public static final class AttributeWithValueMatching extends Evaluator {

        /* renamed from: a, reason: collision with root package name */
        public final String f34190a;

        /* renamed from: b, reason: collision with root package name */
        public final Pattern f34191b;

        public AttributeWithValueMatching(String str, Pattern pattern) {
            this.f34190a = Normalizer.normalize(str);
            this.f34191b = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            String str = this.f34190a;
            if (element2.hasAttr(str) && this.f34191b.matcher(element2.attr(str)).find()) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format("[%s~=%s]", this.f34190a, this.f34191b.toString());
        }
    }

    /* loaded from: classes2.dex */
    public static final class AttributeWithValueNot extends AttributeKeyPair {
        public AttributeWithValueNot(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return !this.f34188b.equalsIgnoreCase(element2.attr(this.f34187a));
        }

        public String toString() {
            return String.format("[%s!=%s]", this.f34187a, this.f34188b);
        }
    }

    /* loaded from: classes2.dex */
    public static final class AttributeWithValueStarting extends AttributeKeyPair {
        public AttributeWithValueStarting(String str, String str2) {
            super(str, str2, false);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            String str = this.f34187a;
            if (element2.hasAttr(str) && Normalizer.lowerCase(element2.attr(str)).startsWith(this.f34188b)) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format("[%s^=%s]", this.f34187a, this.f34188b);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Class extends Evaluator {

        /* renamed from: a, reason: collision with root package name */
        public final String f34192a;

        public Class(String str) {
            this.f34192a = str;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return element2.hasClass(this.f34192a);
        }

        public String toString() {
            return String.format(".%s", this.f34192a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ContainsData extends Evaluator {

        /* renamed from: a, reason: collision with root package name */
        public final String f34193a;

        public ContainsData(String str) {
            this.f34193a = Normalizer.lowerCase(str);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return Normalizer.lowerCase(element2.data()).contains(this.f34193a);
        }

        public String toString() {
            return String.format(":containsData(%s)", this.f34193a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ContainsOwnText extends Evaluator {

        /* renamed from: a, reason: collision with root package name */
        public final String f34194a;

        public ContainsOwnText(String str) {
            this.f34194a = Normalizer.lowerCase(StringUtil.normaliseWhitespace(str));
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return Normalizer.lowerCase(element2.ownText()).contains(this.f34194a);
        }

        public String toString() {
            return String.format(":containsOwn(%s)", this.f34194a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ContainsText extends Evaluator {

        /* renamed from: a, reason: collision with root package name */
        public final String f34195a;

        public ContainsText(String str) {
            this.f34195a = Normalizer.lowerCase(StringUtil.normaliseWhitespace(str));
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return Normalizer.lowerCase(element2.text()).contains(this.f34195a);
        }

        public String toString() {
            return String.format(":contains(%s)", this.f34195a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ContainsWholeOwnText extends Evaluator {

        /* renamed from: a, reason: collision with root package name */
        public final String f34196a;

        public ContainsWholeOwnText(String str) {
            this.f34196a = str;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return element2.wholeOwnText().contains(this.f34196a);
        }

        public String toString() {
            return String.format(":containsWholeOwnText(%s)", this.f34196a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ContainsWholeText extends Evaluator {

        /* renamed from: a, reason: collision with root package name */
        public final String f34197a;

        public ContainsWholeText(String str) {
            this.f34197a = str;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return element2.wholeText().contains(this.f34197a);
        }

        public String toString() {
            return String.format(":containsWholeText(%s)", this.f34197a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Id extends Evaluator {

        /* renamed from: a, reason: collision with root package name */
        public final String f34200a;

        public Id(String str) {
            this.f34200a = str;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return this.f34200a.equals(element2.id());
        }

        public String toString() {
            return String.format("#%s", this.f34200a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class IndexEquals extends IndexEvaluator {
        public IndexEquals(int i10) {
            super(i10);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            if (element2.elementSiblingIndex() == this.f34201a) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format(":eq(%d)", Integer.valueOf(this.f34201a));
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class IndexEvaluator extends Evaluator {

        /* renamed from: a, reason: collision with root package name */
        public final int f34201a;

        public IndexEvaluator(int i10) {
            this.f34201a = i10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class IndexGreaterThan extends IndexEvaluator {
        public IndexGreaterThan(int i10) {
            super(i10);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            if (element2.elementSiblingIndex() > this.f34201a) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format(":gt(%d)", Integer.valueOf(this.f34201a));
        }
    }

    /* loaded from: classes2.dex */
    public static final class IndexLessThan extends IndexEvaluator {
        public IndexLessThan(int i10) {
            super(i10);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            if (element != element2 && element2.elementSiblingIndex() < this.f34201a) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format(":lt(%d)", Integer.valueOf(this.f34201a));
        }
    }

    /* loaded from: classes2.dex */
    public static final class IsEmpty extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            for (Node node : element2.childNodes()) {
                if (!(node instanceof Comment) && !(node instanceof XmlDeclaration) && !(node instanceof DocumentType)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return ":empty";
        }
    }

    /* loaded from: classes2.dex */
    public static final class IsFirstChild extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            if (parent != null && !(parent instanceof Document) && element2.elementSiblingIndex() == 0) {
                return true;
            }
            return false;
        }

        public String toString() {
            return ":first-child";
        }
    }

    /* loaded from: classes2.dex */
    public static final class IsFirstOfType extends IsNthOfType {
        public IsFirstOfType() {
            super(0, 1);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public String toString() {
            return ":first-of-type";
        }
    }

    /* loaded from: classes2.dex */
    public static final class IsLastChild extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            if (parent != null && !(parent instanceof Document) && element2.elementSiblingIndex() == parent.children().size() - 1) {
                return true;
            }
            return false;
        }

        public String toString() {
            return ":last-child";
        }
    }

    /* loaded from: classes2.dex */
    public static final class IsLastOfType extends IsNthLastOfType {
        public IsLastOfType() {
            super(0, 1);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public String toString() {
            return ":last-of-type";
        }
    }

    /* loaded from: classes2.dex */
    public static final class IsNthChild extends CssNthEvaluator {
        public IsNthChild(int i10, int i11) {
            super(i10, i11);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public final int a(Element element) {
            return element.elementSiblingIndex() + 1;
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public final String b() {
            return "nth-child";
        }
    }

    /* loaded from: classes2.dex */
    public static final class IsNthLastChild extends CssNthEvaluator {
        public IsNthLastChild(int i10, int i11) {
            super(i10, i11);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public final int a(Element element) {
            if (element.parent() == null) {
                return 0;
            }
            return element.parent().children().size() - element.elementSiblingIndex();
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public final String b() {
            return "nth-last-child";
        }
    }

    /* loaded from: classes2.dex */
    public static class IsNthLastOfType extends CssNthEvaluator {
        public IsNthLastOfType(int i10, int i11) {
            super(i10, i11);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public final int a(Element element) {
            int i10 = 0;
            if (element.parent() == null) {
                return 0;
            }
            Elements children = element.parent().children();
            for (int elementSiblingIndex = element.elementSiblingIndex(); elementSiblingIndex < children.size(); elementSiblingIndex++) {
                if (children.get(elementSiblingIndex).tag().equals(element.tag())) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public final String b() {
            return "nth-last-of-type";
        }
    }

    /* loaded from: classes2.dex */
    public static class IsNthOfType extends CssNthEvaluator {
        public IsNthOfType(int i10, int i11) {
            super(i10, i11);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public final int a(Element element) {
            int i10 = 0;
            if (element.parent() == null) {
                return 0;
            }
            Iterator<Element> it = element.parent().children().iterator();
            while (it.hasNext()) {
                Element next = it.next();
                if (next.tag().equals(element.tag())) {
                    i10++;
                }
                if (next == element) {
                    break;
                }
            }
            return i10;
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public final String b() {
            return "nth-of-type";
        }
    }

    /* loaded from: classes2.dex */
    public static final class IsOnlyChild extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            if (parent != null && !(parent instanceof Document) && element2.siblingElements().isEmpty()) {
                return true;
            }
            return false;
        }

        public String toString() {
            return ":only-child";
        }
    }

    /* loaded from: classes2.dex */
    public static final class IsOnlyOfType extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            if (parent == null || (parent instanceof Document)) {
                return false;
            }
            Iterator<Element> it = parent.children().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (it.next().tag().equals(element2.tag())) {
                    i10++;
                }
            }
            if (i10 != 1) {
                return false;
            }
            return true;
        }

        public String toString() {
            return ":only-of-type";
        }
    }

    /* loaded from: classes2.dex */
    public static final class IsRoot extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            if (element instanceof Document) {
                element = element.child(0);
            }
            if (element2 != element) {
                return false;
            }
            return true;
        }

        public String toString() {
            return ":root";
        }
    }

    /* loaded from: classes2.dex */
    public static final class MatchText extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            if (element2 instanceof PseudoTextElement) {
                return true;
            }
            for (TextNode textNode : element2.textNodes()) {
                PseudoTextElement pseudoTextElement = new PseudoTextElement(org.jsoup.parser.Tag.valueOf(element2.tagName()), element2.baseUri(), element2.attributes());
                textNode.replaceWith(pseudoTextElement);
                pseudoTextElement.appendChild(textNode);
            }
            return false;
        }

        public String toString() {
            return ":matchText";
        }
    }

    /* loaded from: classes2.dex */
    public static final class Matches extends Evaluator {

        /* renamed from: a, reason: collision with root package name */
        public final Pattern f34202a;

        public Matches(Pattern pattern) {
            this.f34202a = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return this.f34202a.matcher(element2.text()).find();
        }

        public String toString() {
            return String.format(":matches(%s)", this.f34202a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class MatchesOwn extends Evaluator {

        /* renamed from: a, reason: collision with root package name */
        public final Pattern f34203a;

        public MatchesOwn(Pattern pattern) {
            this.f34203a = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return this.f34203a.matcher(element2.ownText()).find();
        }

        public String toString() {
            return String.format(":matchesOwn(%s)", this.f34203a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class MatchesWholeOwnText extends Evaluator {

        /* renamed from: a, reason: collision with root package name */
        public final Pattern f34204a;

        public MatchesWholeOwnText(Pattern pattern) {
            this.f34204a = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return this.f34204a.matcher(element2.wholeOwnText()).find();
        }

        public String toString() {
            return String.format(":matchesWholeOwnText(%s)", this.f34204a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class MatchesWholeText extends Evaluator {

        /* renamed from: a, reason: collision with root package name */
        public final Pattern f34205a;

        public MatchesWholeText(Pattern pattern) {
            this.f34205a = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return this.f34205a.matcher(element2.wholeText()).find();
        }

        public String toString() {
            return String.format(":matchesWholeText(%s)", this.f34205a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Tag extends Evaluator {

        /* renamed from: a, reason: collision with root package name */
        public final String f34206a;

        public Tag(String str) {
            this.f34206a = str;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return element2.normalName().equals(this.f34206a);
        }

        public String toString() {
            return String.format("%s", this.f34206a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class TagEndsWith extends Evaluator {

        /* renamed from: a, reason: collision with root package name */
        public final String f34207a;

        public TagEndsWith(String str) {
            this.f34207a = str;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return element2.normalName().endsWith(this.f34207a);
        }

        public String toString() {
            return String.format("%s", this.f34207a);
        }
    }

    public abstract boolean matches(Element element, Element element2);

    /* loaded from: classes2.dex */
    public static abstract class CssNthEvaluator extends Evaluator {

        /* renamed from: a, reason: collision with root package name */
        public final int f34198a;

        /* renamed from: b, reason: collision with root package name */
        public final int f34199b;

        public CssNthEvaluator(int i10, int i11) {
            this.f34198a = i10;
            this.f34199b = i11;
        }

        public abstract int a(Element element);

        public abstract String b();

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            if (parent == null || (parent instanceof Document)) {
                return false;
            }
            int a10 = a(element2);
            int i10 = this.f34199b;
            int i11 = this.f34198a;
            if (i11 == 0) {
                if (a10 != i10) {
                    return false;
                }
                return true;
            }
            int i12 = a10 - i10;
            if (i12 * i11 < 0 || i12 % i11 != 0) {
                return false;
            }
            return true;
        }

        public String toString() {
            int i10 = this.f34199b;
            int i11 = this.f34198a;
            if (i11 == 0) {
                return String.format(":%s(%d)", b(), Integer.valueOf(i10));
            }
            if (i10 == 0) {
                return String.format(":%s(%dn)", b(), Integer.valueOf(i11));
            }
            return String.format(":%s(%dn%+d)", b(), Integer.valueOf(i11), Integer.valueOf(i10));
        }

        public CssNthEvaluator(int i10) {
            this(0, i10);
        }
    }
}
