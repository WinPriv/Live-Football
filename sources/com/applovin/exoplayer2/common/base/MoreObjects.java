package com.applovin.exoplayer2.common.base;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class MoreObjects {

    /* loaded from: classes.dex */
    public static final class ToStringHelper {
        private final String className;
        private final a holderHead;
        private a holderTail;
        private boolean omitNullValues;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            @NullableDecl
            String f13897a;

            /* renamed from: b, reason: collision with root package name */
            @NullableDecl
            Object f13898b;

            /* renamed from: c, reason: collision with root package name */
            @NullableDecl
            a f13899c;

            private a() {
            }
        }

        private a addHolder() {
            a aVar = new a();
            this.holderTail.f13899c = aVar;
            this.holderTail = aVar;
            return aVar;
        }

        public ToStringHelper add(String str, @NullableDecl Object obj) {
            return addHolder(str, obj);
        }

        public ToStringHelper addValue(@NullableDecl Object obj) {
            return addHolder(obj);
        }

        public ToStringHelper omitNullValues() {
            this.omitNullValues = true;
            return this;
        }

        public String toString() {
            boolean z10 = this.omitNullValues;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.className);
            sb2.append('{');
            String str = "";
            for (a aVar = this.holderHead.f13899c; aVar != null; aVar = aVar.f13899c) {
                Object obj = aVar.f13898b;
                if (!z10 || obj != null) {
                    sb2.append(str);
                    String str2 = aVar.f13897a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    str = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        private ToStringHelper(String str) {
            a aVar = new a();
            this.holderHead = aVar;
            this.holderTail = aVar;
            this.omitNullValues = false;
            this.className = (String) Preconditions.checkNotNull(str);
        }

        public ToStringHelper add(String str, boolean z10) {
            return addHolder(str, String.valueOf(z10));
        }

        public ToStringHelper addValue(boolean z10) {
            return addHolder(String.valueOf(z10));
        }

        private ToStringHelper addHolder(@NullableDecl Object obj) {
            addHolder().f13898b = obj;
            return this;
        }

        public ToStringHelper add(String str, char c10) {
            return addHolder(str, String.valueOf(c10));
        }

        public ToStringHelper addValue(char c10) {
            return addHolder(String.valueOf(c10));
        }

        public ToStringHelper add(String str, double d10) {
            return addHolder(str, String.valueOf(d10));
        }

        public ToStringHelper addValue(double d10) {
            return addHolder(String.valueOf(d10));
        }

        private ToStringHelper addHolder(String str, @NullableDecl Object obj) {
            a addHolder = addHolder();
            addHolder.f13898b = obj;
            addHolder.f13897a = (String) Preconditions.checkNotNull(str);
            return this;
        }

        public ToStringHelper add(String str, float f) {
            return addHolder(str, String.valueOf(f));
        }

        public ToStringHelper addValue(float f) {
            return addHolder(String.valueOf(f));
        }

        public ToStringHelper add(String str, int i10) {
            return addHolder(str, String.valueOf(i10));
        }

        public ToStringHelper addValue(int i10) {
            return addHolder(String.valueOf(i10));
        }

        public ToStringHelper add(String str, long j10) {
            return addHolder(str, String.valueOf(j10));
        }

        public ToStringHelper addValue(long j10) {
            return addHolder(String.valueOf(j10));
        }
    }

    private MoreObjects() {
    }

    public static <T> T firstNonNull(@NullableDecl T t10, @NullableDecl T t11) {
        if (t10 != null) {
            return t10;
        }
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }

    public static ToStringHelper toStringHelper(Class<?> cls) {
        return new ToStringHelper(cls.getSimpleName());
    }

    public static ToStringHelper toStringHelper(String str) {
        return new ToStringHelper(str);
    }
}
