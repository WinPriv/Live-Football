package com.applovin.exoplayer2.common.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Splitter {
    private final int limit;
    private final boolean omitEmptyStrings;
    private final b strategy;
    private final CharMatcher trimmer;

    /* loaded from: classes.dex */
    public static abstract class a extends com.applovin.exoplayer2.common.base.b<String> {

        /* renamed from: b, reason: collision with root package name */
        final CharSequence f13923b;

        /* renamed from: c, reason: collision with root package name */
        final CharMatcher f13924c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f13925d;

        /* renamed from: e, reason: collision with root package name */
        int f13926e = 0;
        int f;

        public a(Splitter splitter, CharSequence charSequence) {
            this.f13924c = splitter.trimmer;
            this.f13925d = splitter.omitEmptyStrings;
            this.f = splitter.limit;
            this.f13923b = charSequence;
        }

        public abstract int a(int i10);

        public abstract int b(int i10);

        @Override // com.applovin.exoplayer2.common.base.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String a() {
            int a10;
            int i10 = this.f13926e;
            while (true) {
                int i11 = this.f13926e;
                if (i11 != -1) {
                    a10 = a(i11);
                    if (a10 == -1) {
                        a10 = this.f13923b.length();
                        this.f13926e = -1;
                    } else {
                        this.f13926e = b(a10);
                    }
                    int i12 = this.f13926e;
                    if (i12 == i10) {
                        int i13 = i12 + 1;
                        this.f13926e = i13;
                        if (i13 > this.f13923b.length()) {
                            this.f13926e = -1;
                        }
                    } else {
                        while (i10 < a10 && this.f13924c.matches(this.f13923b.charAt(i10))) {
                            i10++;
                        }
                        while (a10 > i10 && this.f13924c.matches(this.f13923b.charAt(a10 - 1))) {
                            a10--;
                        }
                        if (!this.f13925d || i10 != a10) {
                            break;
                        }
                        i10 = this.f13926e;
                    }
                } else {
                    return b();
                }
            }
            int i14 = this.f;
            if (i14 == 1) {
                a10 = this.f13923b.length();
                this.f13926e = -1;
                while (a10 > i10 && this.f13924c.matches(this.f13923b.charAt(a10 - 1))) {
                    a10--;
                }
            } else {
                this.f = i14 - 1;
            }
            return this.f13923b.subSequence(i10, a10).toString();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        Iterator<String> b(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(b bVar) {
        this(bVar, false, CharMatcher.none(), Integer.MAX_VALUE);
    }

    public static Splitter fixedLength(final int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "The length may not be less than 1");
        return new Splitter(new b() { // from class: com.applovin.exoplayer2.common.base.Splitter.3
            @Override // com.applovin.exoplayer2.common.base.Splitter.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a b(Splitter splitter, CharSequence charSequence) {
                return new a(splitter, charSequence) { // from class: com.applovin.exoplayer2.common.base.Splitter.3.1
                    @Override // com.applovin.exoplayer2.common.base.Splitter.a
                    public int a(int i11) {
                        int i12 = i11 + i10;
                        if (i12 >= ((a) this).f13923b.length()) {
                            return -1;
                        }
                        return i12;
                    }

                    @Override // com.applovin.exoplayer2.common.base.Splitter.a
                    public int b(int i11) {
                        return i11;
                    }
                };
            }
        });
    }

    public static Splitter on(char c10) {
        return on(CharMatcher.is(c10));
    }

    private Iterator<String> splittingIterator(CharSequence charSequence) {
        return this.strategy.b(this, charSequence);
    }

    public Splitter limit(int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "must be greater than zero: %s", i10);
        return new Splitter(this.strategy, this.omitEmptyStrings, this.trimmer, i10);
    }

    public Splitter omitEmptyStrings() {
        return new Splitter(this.strategy, true, this.trimmer, this.limit);
    }

    public List<String> splitToList(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        Iterator<String> splittingIterator = splittingIterator(charSequence);
        ArrayList arrayList = new ArrayList();
        while (splittingIterator.hasNext()) {
            arrayList.add(splittingIterator.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Splitter trimResults() {
        return trimResults(CharMatcher.whitespace());
    }

    private Splitter(b bVar, boolean z10, CharMatcher charMatcher, int i10) {
        this.strategy = bVar;
        this.omitEmptyStrings = z10;
        this.trimmer = charMatcher;
        this.limit = i10;
    }

    public static Splitter on(final CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(new b() { // from class: com.applovin.exoplayer2.common.base.Splitter.1
            @Override // com.applovin.exoplayer2.common.base.Splitter.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a b(Splitter splitter, CharSequence charSequence) {
                return new a(splitter, charSequence) { // from class: com.applovin.exoplayer2.common.base.Splitter.1.1
                    @Override // com.applovin.exoplayer2.common.base.Splitter.a
                    public int a(int i10) {
                        return CharMatcher.this.indexIn(((a) this).f13923b, i10);
                    }

                    @Override // com.applovin.exoplayer2.common.base.Splitter.a
                    public int b(int i10) {
                        return i10 + 1;
                    }
                };
            }
        });
    }

    public Splitter trimResults(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(this.strategy, this.omitEmptyStrings, charMatcher, this.limit);
    }

    public static Splitter on(final String str) {
        Preconditions.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return on(str.charAt(0));
        }
        return new Splitter(new b() { // from class: com.applovin.exoplayer2.common.base.Splitter.2
            @Override // com.applovin.exoplayer2.common.base.Splitter.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a b(Splitter splitter, CharSequence charSequence) {
                return new a(splitter, charSequence) { // from class: com.applovin.exoplayer2.common.base.Splitter.2.1
                    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
                    
                        r6 = r6 + 1;
                     */
                    @Override // com.applovin.exoplayer2.common.base.Splitter.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public int a(int r6) {
                        /*
                            r5 = this;
                            com.applovin.exoplayer2.common.base.Splitter$2 r0 = com.applovin.exoplayer2.common.base.Splitter.AnonymousClass2.this
                            java.lang.String r0 = r1
                            int r0 = r0.length()
                            java.lang.CharSequence r1 = r5.f13923b
                            int r1 = r1.length()
                            int r1 = r1 - r0
                        Lf:
                            if (r6 > r1) goto L2d
                            r2 = 0
                        L12:
                            if (r2 >= r0) goto L2c
                            java.lang.CharSequence r3 = r5.f13923b
                            int r4 = r2 + r6
                            char r3 = r3.charAt(r4)
                            com.applovin.exoplayer2.common.base.Splitter$2 r4 = com.applovin.exoplayer2.common.base.Splitter.AnonymousClass2.this
                            java.lang.String r4 = r1
                            char r4 = r4.charAt(r2)
                            if (r3 == r4) goto L29
                            int r6 = r6 + 1
                            goto Lf
                        L29:
                            int r2 = r2 + 1
                            goto L12
                        L2c:
                            return r6
                        L2d:
                            r6 = -1
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.common.base.Splitter.AnonymousClass2.AnonymousClass1.a(int):int");
                    }

                    @Override // com.applovin.exoplayer2.common.base.Splitter.a
                    public int b(int i10) {
                        return str.length() + i10;
                    }
                };
            }
        });
    }
}
