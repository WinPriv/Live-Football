package com.applovin.exoplayer2.common.a;

import com.anythink.core.api.ATAdConst;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class k {
    public static boolean a(Collection<?> collection, @NullableDecl Object obj) {
        Preconditions.checkNotNull(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static StringBuilder a(int i10) {
        j.a(i10, ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE);
        return new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
    }
}
