package b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: ITrustedWebActivityService.java */
/* loaded from: classes.dex */
public abstract class b extends Binder implements IInterface {
    public b() {
        attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityService");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b1, code lost:
    
        r8 = r9.f1298s.getNotificationChannel(androidx.browser.trusted.TrustedWebActivityService.a(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
    
        if (r8 != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0197, code lost:
    
        if (r8 != false) goto L56;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTransact(int r8, android.os.Parcel r9, android.os.Parcel r10, int r11) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
