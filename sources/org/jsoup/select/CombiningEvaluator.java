package org.jsoup.select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Element;

/* loaded from: classes2.dex */
public abstract class CombiningEvaluator extends Evaluator {

    /* renamed from: b, reason: collision with root package name */
    public int f34185b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<Evaluator> f34184a = new ArrayList<>();

    /* loaded from: classes2.dex */
    public static final class And extends CombiningEvaluator {
        public And(List list) {
            this.f34184a.addAll(list);
            this.f34185b = this.f34184a.size();
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            for (int i10 = this.f34185b - 1; i10 >= 0; i10--) {
                if (!this.f34184a.get(i10).matches(element, element2)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return StringUtil.join(this.f34184a, "");
        }

        public And(Evaluator... evaluatorArr) {
            this(Arrays.asList(evaluatorArr));
        }
    }

    /* loaded from: classes2.dex */
    public static final class Or extends CombiningEvaluator {
        public Or(Evaluator... evaluatorArr) {
            List asList = Arrays.asList(evaluatorArr);
            if (this.f34185b > 1) {
                this.f34184a.add(new And(asList));
            } else {
                this.f34184a.addAll(asList);
            }
            this.f34185b = this.f34184a.size();
        }

        public void add(Evaluator evaluator) {
            ArrayList<Evaluator> arrayList = this.f34184a;
            arrayList.add(evaluator);
            this.f34185b = arrayList.size();
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            for (int i10 = 0; i10 < this.f34185b; i10++) {
                if (this.f34184a.get(i10).matches(element, element2)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return StringUtil.join(this.f34184a, ", ");
        }

        public Or() {
        }
    }
}
