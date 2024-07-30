package com.anythink.core.common.k;

import com.anythink.core.common.e.ai;
import java.util.List;

/* loaded from: classes.dex */
public final class t {
    public static boolean a(List<ai> list) {
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ai aiVar = list.get(i10);
                if (aiVar != null && aiVar.aa()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean b(ai aiVar) {
        if (aiVar == null) {
            return false;
        }
        if (aiVar.c() != 66 && aiVar.c() != 6) {
            return false;
        }
        return true;
    }

    public static boolean a(ai aiVar) {
        return aiVar.c() == 15 && !aiVar.j();
    }

    public static boolean a(String str, ai aiVar) {
        if (aiVar == null) {
            return false;
        }
        if (com.anythink.core.common.a.a().a(str, aiVar) != null) {
            return true;
        }
        com.anythink.core.common.e.m a10 = com.anythink.core.b.f.a().a(aiVar);
        return (a10 == null || a10.a()) ? false : true;
    }
}
