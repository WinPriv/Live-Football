package r1;

/* compiled from: WorkInfo.java */
/* loaded from: classes.dex */
public enum l {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public final boolean k() {
        if (this != SUCCEEDED && this != FAILED && this != CANCELLED) {
            return false;
        }
        return true;
    }
}
