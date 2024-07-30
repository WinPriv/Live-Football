package org.jsoup.nodes;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import s.f;

/* loaded from: classes2.dex */
public class Attributes implements Iterable<Attribute>, Cloneable {

    /* renamed from: s, reason: collision with root package name */
    public int f33962s = 0;

    /* renamed from: t, reason: collision with root package name */
    public String[] f33963t = new String[3];

    /* renamed from: u, reason: collision with root package name */
    public Object[] f33964u = new Object[3];

    /* loaded from: classes2.dex */
    public class a implements Iterator<Attribute> {

        /* renamed from: s, reason: collision with root package name */
        public int f33965s = 0;

        public a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Attributes attributes;
            while (true) {
                int i10 = this.f33965s;
                attributes = Attributes.this;
                if (i10 >= attributes.f33962s || !Attributes.f(attributes.f33963t[i10])) {
                    break;
                }
                this.f33965s++;
            }
            if (this.f33965s < attributes.f33962s) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Attribute next() {
            Attributes attributes = Attributes.this;
            String[] strArr = attributes.f33963t;
            int i10 = this.f33965s;
            Attribute attribute = new Attribute(strArr[i10], (String) attributes.f33964u[i10], attributes);
            this.f33965s++;
            return attribute;
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i10 = this.f33965s - 1;
            this.f33965s = i10;
            Attributes.this.h(i10);
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends AbstractMap<String, String> {

        /* renamed from: s, reason: collision with root package name */
        public final Attributes f33967s;

        /* loaded from: classes2.dex */
        public class a implements Iterator<Map.Entry<String, String>> {

            /* renamed from: s, reason: collision with root package name */
            public final Iterator<Attribute> f33968s;

            /* renamed from: t, reason: collision with root package name */
            public Attribute f33969t;

            public a() {
                this.f33968s = b.this.f33967s.iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                boolean z10;
                do {
                    Iterator<Attribute> it = this.f33968s;
                    z10 = false;
                    if (!it.hasNext()) {
                        return false;
                    }
                    Attribute next = it.next();
                    this.f33969t = next;
                    String str = next.f33959s;
                    if (str.startsWith("data-") && str.length() > 5) {
                        z10 = true;
                    }
                } while (!z10);
                return true;
            }

            @Override // java.util.Iterator
            public final Map.Entry<String, String> next() {
                return new Attribute(this.f33969t.getKey().substring(5), this.f33969t.getValue());
            }

            @Override // java.util.Iterator
            public final void remove() {
                b.this.f33967s.remove(this.f33969t.getKey());
            }
        }

        /* renamed from: org.jsoup.nodes.Attributes$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0453b extends AbstractSet<Map.Entry<String, String>> {
            public C0453b() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<String, String>> iterator() {
                return new a();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                boolean z10;
                boolean z11;
                Iterator<Attribute> it = b.this.f33967s.iterator();
                int i10 = 0;
                while (true) {
                    if (it.hasNext()) {
                        String str = it.next().f33959s;
                        z10 = true;
                        if (str.startsWith("data-") && str.length() > 5) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            continue;
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10++;
                    } else {
                        return i10;
                    }
                }
            }
        }

        public b(Attributes attributes) {
            this.f33967s = attributes;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<String, String>> entrySet() {
            return new C0453b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            String str;
            String str2 = (String) obj2;
            String b10 = f.b("data-", (String) obj);
            Attributes attributes = this.f33967s;
            if (attributes.hasKey(b10)) {
                str = attributes.get(b10);
            } else {
                str = null;
            }
            attributes.put(b10, str2);
            return str;
        }
    }

    public static String e(String str) {
        return f.b("/", str);
    }

    public static boolean f(String str) {
        if (str == null || str.length() <= 1 || str.charAt(0) != '/') {
            return false;
        }
        return true;
    }

    public final void a(int i10) {
        boolean z10;
        if (i10 >= this.f33962s) {
            z10 = true;
        } else {
            z10 = false;
        }
        Validate.isTrue(z10);
        String[] strArr = this.f33963t;
        int length = strArr.length;
        if (length >= i10) {
            return;
        }
        int i11 = 3;
        if (length >= 3) {
            i11 = this.f33962s * 2;
        }
        if (i10 <= i11) {
            i10 = i11;
        }
        this.f33963t = (String[]) Arrays.copyOf(strArr, i10);
        this.f33964u = Arrays.copyOf(this.f33964u, i10);
    }

    public Attributes add(String str, @Nullable String str2) {
        a(this.f33962s + 1);
        String[] strArr = this.f33963t;
        int i10 = this.f33962s;
        strArr[i10] = str;
        this.f33964u[i10] = str2;
        this.f33962s = i10 + 1;
        return this;
    }

    public void addAll(Attributes attributes) {
        boolean z10;
        if (attributes.size() == 0) {
            return;
        }
        a(this.f33962s + attributes.f33962s);
        if (this.f33962s != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Iterator<Attribute> it = attributes.iterator();
        while (it.hasNext()) {
            Attribute next = it.next();
            if (z10) {
                put(next);
            } else {
                add(next.getKey(), next.getValue());
            }
        }
    }

    public List<Attribute> asList() {
        ArrayList arrayList = new ArrayList(this.f33962s);
        for (int i10 = 0; i10 < this.f33962s; i10++) {
            if (!f(this.f33963t[i10])) {
                arrayList.add(new Attribute(this.f33963t[i10], (String) this.f33964u[i10], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final void b(Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        String validKey;
        int i10 = this.f33962s;
        for (int i11 = 0; i11 < i10; i11++) {
            if (!f(this.f33963t[i11]) && (validKey = Attribute.getValidKey(this.f33963t[i11], outputSettings.syntax())) != null) {
                Attribute.a(validKey, (String) this.f33964u[i11], appendable.append(' '), outputSettings);
            }
        }
    }

    public final int c(String str) {
        Validate.notNull(str);
        for (int i10 = 0; i10 < this.f33962s; i10++) {
            if (str.equals(this.f33963t[i10])) {
                return i10;
            }
        }
        return -1;
    }

    public final int d(String str) {
        Validate.notNull(str);
        for (int i10 = 0; i10 < this.f33962s; i10++) {
            if (str.equalsIgnoreCase(this.f33963t[i10])) {
                return i10;
            }
        }
        return -1;
    }

    public Map<String, String> dataset() {
        return new b(this);
    }

    public int deduplicate(ParseSettings parseSettings) {
        String str;
        int i10 = 0;
        if (isEmpty()) {
            return 0;
        }
        boolean preserveAttributeCase = parseSettings.preserveAttributeCase();
        int i11 = 0;
        while (i10 < this.f33963t.length) {
            int i12 = i10 + 1;
            int i13 = i12;
            while (true) {
                String[] strArr = this.f33963t;
                if (i13 < strArr.length && (str = strArr[i13]) != null) {
                    if (!preserveAttributeCase || !strArr[i10].equals(str)) {
                        if (!preserveAttributeCase) {
                            String[] strArr2 = this.f33963t;
                            if (!strArr2[i10].equalsIgnoreCase(strArr2[i13])) {
                            }
                        }
                        i13++;
                    }
                    i11++;
                    h(i13);
                    i13--;
                    i13++;
                }
            }
            i10 = i12;
        }
        return i11;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Attributes attributes = (Attributes) obj;
        if (this.f33962s != attributes.f33962s) {
            return false;
        }
        for (int i10 = 0; i10 < this.f33962s; i10++) {
            int c10 = attributes.c(this.f33963t[i10]);
            if (c10 == -1) {
                return false;
            }
            Object obj2 = this.f33964u[i10];
            Object obj3 = attributes.f33964u[c10];
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }

    public final void g(String str, @Nullable String str2) {
        int d10 = d(str);
        if (d10 != -1) {
            this.f33964u[d10] = str2;
            if (!this.f33963t[d10].equals(str)) {
                this.f33963t[d10] = str;
                return;
            }
            return;
        }
        add(str, str2);
    }

    public String get(String str) {
        Object obj;
        int c10 = c(str);
        if (c10 == -1 || (obj = this.f33964u[c10]) == null) {
            return "";
        }
        return (String) obj;
    }

    public String getIgnoreCase(String str) {
        Object obj;
        int d10 = d(str);
        if (d10 == -1 || (obj = this.f33964u[d10]) == null) {
            return "";
        }
        return (String) obj;
    }

    public final void h(int i10) {
        boolean z10;
        if (i10 >= this.f33962s) {
            z10 = true;
        } else {
            z10 = false;
        }
        Validate.isFalse(z10);
        int i11 = (this.f33962s - i10) - 1;
        if (i11 > 0) {
            String[] strArr = this.f33963t;
            int i12 = i10 + 1;
            System.arraycopy(strArr, i12, strArr, i10, i11);
            Object[] objArr = this.f33964u;
            System.arraycopy(objArr, i12, objArr, i10, i11);
        }
        int i13 = this.f33962s - 1;
        this.f33962s = i13;
        this.f33963t[i13] = null;
        this.f33964u[i13] = null;
    }

    public boolean hasDeclaredValueForKey(String str) {
        int c10 = c(str);
        if (c10 != -1 && this.f33964u[c10] != null) {
            return true;
        }
        return false;
    }

    public boolean hasDeclaredValueForKeyIgnoreCase(String str) {
        int d10 = d(str);
        if (d10 != -1 && this.f33964u[d10] != null) {
            return true;
        }
        return false;
    }

    public boolean hasKey(String str) {
        if (c(str) != -1) {
            return true;
        }
        return false;
    }

    public boolean hasKeyIgnoreCase(String str) {
        if (d(str) != -1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f33964u) + (((this.f33962s * 31) + Arrays.hashCode(this.f33963t)) * 31);
    }

    public String html() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        try {
            b(borrowBuilder, new Document("").outputSettings());
            return StringUtil.releaseBuilder(borrowBuilder);
        } catch (IOException e10) {
            throw new SerializationException(e10);
        }
    }

    public boolean isEmpty() {
        if (this.f33962s == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<Attribute> iterator() {
        return new a();
    }

    public void normalize() {
        for (int i10 = 0; i10 < this.f33962s; i10++) {
            String[] strArr = this.f33963t;
            strArr[i10] = Normalizer.lowerCase(strArr[i10]);
        }
    }

    public Attributes put(String str, @Nullable String str2) {
        Validate.notNull(str);
        int c10 = c(str);
        if (c10 != -1) {
            this.f33964u[c10] = str2;
        } else {
            add(str, str2);
        }
        return this;
    }

    public void remove(String str) {
        int c10 = c(str);
        if (c10 != -1) {
            h(c10);
        }
    }

    public void removeIgnoreCase(String str) {
        int d10 = d(str);
        if (d10 != -1) {
            h(d10);
        }
    }

    public int size() {
        return this.f33962s;
    }

    public String toString() {
        return html();
    }

    public Attributes clone() {
        try {
            Attributes attributes = (Attributes) super.clone();
            attributes.f33962s = this.f33962s;
            attributes.f33963t = (String[]) Arrays.copyOf(this.f33963t, this.f33962s);
            attributes.f33964u = Arrays.copyOf(this.f33964u, this.f33962s);
            return attributes;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Attributes put(String str, boolean z10) {
        if (z10) {
            g(str, null);
        } else {
            remove(str);
        }
        return this;
    }

    public Attributes put(Attribute attribute) {
        Validate.notNull(attribute);
        put(attribute.getKey(), attribute.getValue());
        attribute.f33961u = this;
        return this;
    }
}
