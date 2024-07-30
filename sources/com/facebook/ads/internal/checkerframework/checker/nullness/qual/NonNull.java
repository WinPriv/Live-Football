package com.facebook.ads.internal.checkerframework.checker.nullness.qual;

import com.facebook.ads.internal.checkerframework.framework.qual.DefaultFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultInUncheckedCodeFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import com.facebook.ads.internal.checkerframework.framework.qual.QualifierForLiterals;
import com.facebook.ads.internal.checkerframework.framework.qual.SubtypeOf;
import com.facebook.ads.internal.checkerframework.framework.qual.UpperBoundFor;
import com.facebook.ads.redexgen.X.C7A;
import com.facebook.ads.redexgen.X.C7B;
import com.facebook.ads.redexgen.X.EnumC06846w;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@SubtypeOf({MonotonicNonNull.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@UpperBoundFor(typeKinds = {C7A.A0I, C7A.A0C, C7A.A04, C7A.A06, C7A.A08, C7A.A0B, C7A.A0E, C7A.A0J, C7A.A05})
@Retention(RetentionPolicy.RUNTIME)
@QualifierForLiterals({EnumC06846w.A0B})
@DefaultFor({C7B.A05})
@DefaultQualifierInHierarchy
@DefaultInUncheckedCodeFor({C7B.A0E, C7B.A0C})
@Documented
/* loaded from: assets/audience_network.dex */
public @interface NonNull {
}
