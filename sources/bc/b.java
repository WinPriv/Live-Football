package bc;

/* compiled from: OSInfluenceType.kt */
/* loaded from: classes2.dex */
public enum b {
    DIRECT,
    INDIRECT,
    UNATTRIBUTED,
    DISABLED;

    /* compiled from: OSInfluenceType.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static b a(String str) {
            b bVar;
            boolean equalsIgnoreCase;
            if (str != null) {
                b[] values = b.values();
                int length = values.length;
                while (true) {
                    length--;
                    if (length >= 0) {
                        bVar = values[length];
                        String name = bVar.name();
                        if (name == null) {
                            equalsIgnoreCase = false;
                        } else {
                            equalsIgnoreCase = name.equalsIgnoreCase(str);
                        }
                        if (equalsIgnoreCase) {
                            break;
                        }
                    } else {
                        bVar = null;
                        break;
                    }
                }
                if (bVar != null) {
                    return bVar;
                }
            }
            return b.UNATTRIBUTED;
        }
    }

    public final boolean k() {
        boolean z10;
        if (p()) {
            return true;
        }
        if (this == INDIRECT) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if (this == DIRECT) {
            return true;
        }
        return false;
    }
}
