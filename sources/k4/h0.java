package k4;

/* compiled from: ExoTimeoutException.java */
/* loaded from: classes2.dex */
public class h0 extends RuntimeException {
    public /* synthetic */ h0() {
    }

    public /* synthetic */ h0(String str) {
        super(str);
    }

    public /* synthetic */ h0(int i10) {
        super(i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
    }
}
