package y3;

import android.util.SparseArray;
import com.google.auto.value.AutoValue;

/* compiled from: NetworkConnectionInfo.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class o {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 y3.o$a, still in use, count: 1, list:
      (r0v0 y3.o$a) from 0x011f: INVOKE (r2v11 android.util.SparseArray<y3.o$a>), (0 int), (r0v0 y3.o$a) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:288)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:238)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: NetworkConnectionInfo.java */
    /* loaded from: classes.dex */
    public static final class a {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN_MOBILE_SUBTYPE(0),
        /* JADX INFO: Fake field, exist only in values array */
        GPRS(1),
        /* JADX INFO: Fake field, exist only in values array */
        EDGE(2),
        /* JADX INFO: Fake field, exist only in values array */
        UMTS(3),
        /* JADX INFO: Fake field, exist only in values array */
        CDMA(4),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_0(5),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_A(6),
        /* JADX INFO: Fake field, exist only in values array */
        RTT(7),
        /* JADX INFO: Fake field, exist only in values array */
        HSDPA(8),
        /* JADX INFO: Fake field, exist only in values array */
        HSUPA(9),
        /* JADX INFO: Fake field, exist only in values array */
        HSPA(10),
        /* JADX INFO: Fake field, exist only in values array */
        IDEN(11),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_B(12),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(13),
        /* JADX INFO: Fake field, exist only in values array */
        TD_SCDMA(14),
        /* JADX INFO: Fake field, exist only in values array */
        IWLAN(15),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(16),
        /* JADX INFO: Fake field, exist only in values array */
        TD_SCDMA(17),
        /* JADX INFO: Fake field, exist only in values array */
        IWLAN(18),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(19),
        /* JADX INFO: Fake field, exist only in values array */
        COMBINED(100);


        /* renamed from: s, reason: collision with root package name */
        public static final SparseArray<a> f36642s;

        static {
            SparseArray<a> sparseArray = new SparseArray<>();
            f36642s = sparseArray;
            sparseArray.put(0, r0);
            sparseArray.put(1, r1);
            sparseArray.put(2, r3);
            sparseArray.put(3, r5);
            sparseArray.put(4, r7);
            sparseArray.put(5, r9);
            sparseArray.put(6, r11);
            sparseArray.put(7, r13);
            sparseArray.put(8, r15);
            sparseArray.put(9, r14);
            sparseArray.put(10, r12);
            sparseArray.put(11, r10);
            sparseArray.put(12, r8);
            sparseArray.put(13, r6);
            sparseArray.put(14, r4);
            sparseArray.put(15, r2);
            sparseArray.put(16, r6);
            sparseArray.put(17, r4);
            sparseArray.put(18, r2);
            sparseArray.put(19, r6);
        }

        public a(int i10) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f36643t.clone();
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 y3.o$b, still in use, count: 1, list:
      (r0v0 y3.o$b) from 0x0108: INVOKE (r4v8 android.util.SparseArray<y3.o$b>), (0 int), (r0v0 y3.o$b) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:265)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:238)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: NetworkConnectionInfo.java */
    /* loaded from: classes.dex */
    public static final class b {
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE(0),
        /* JADX INFO: Fake field, exist only in values array */
        WIFI(1),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_MMS(2),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_SUPL(3),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_DUN(4),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_HIPRI(5),
        /* JADX INFO: Fake field, exist only in values array */
        WIMAX(6),
        /* JADX INFO: Fake field, exist only in values array */
        BLUETOOTH(7),
        /* JADX INFO: Fake field, exist only in values array */
        DUMMY(8),
        /* JADX INFO: Fake field, exist only in values array */
        ETHERNET(9),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_FOTA(10),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_IMS(11),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_CBS(12),
        /* JADX INFO: Fake field, exist only in values array */
        PROXY(13),
        /* JADX INFO: Fake field, exist only in values array */
        VPN(14),
        /* JADX INFO: Fake field, exist only in values array */
        NONE(15),
        /* JADX INFO: Fake field, exist only in values array */
        PROXY(16),
        /* JADX INFO: Fake field, exist only in values array */
        VPN(17),
        /* JADX INFO: Fake field, exist only in values array */
        NONE(-1);


        /* renamed from: s, reason: collision with root package name */
        public static final SparseArray<b> f36644s;

        static {
            SparseArray<b> sparseArray = new SparseArray<>();
            f36644s = sparseArray;
            sparseArray.put(0, r0);
            sparseArray.put(1, r1);
            sparseArray.put(2, r3);
            sparseArray.put(3, r5);
            sparseArray.put(4, r7);
            sparseArray.put(5, r9);
            sparseArray.put(6, r11);
            sparseArray.put(7, r13);
            sparseArray.put(8, r15);
            sparseArray.put(9, r14);
            sparseArray.put(10, r12);
            sparseArray.put(11, r10);
            sparseArray.put(12, r8);
            sparseArray.put(13, r6);
            sparseArray.put(14, r4);
            sparseArray.put(15, r2);
            sparseArray.put(16, r6);
            sparseArray.put(17, r4);
            sparseArray.put(-1, r2);
        }

        public b(int i10) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f36645t.clone();
        }
    }

    public abstract a a();

    public abstract b b();
}
