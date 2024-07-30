package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import o1.a;
import o1.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f1564a;
        if (aVar.h(1)) {
            cVar = aVar.n();
        }
        remoteActionCompat.f1564a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1565b;
        if (aVar.h(2)) {
            charSequence = aVar.g();
        }
        remoteActionCompat.f1565b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1566c;
        if (aVar.h(3)) {
            charSequence2 = aVar.g();
        }
        remoteActionCompat.f1566c = charSequence2;
        remoteActionCompat.f1567d = (PendingIntent) aVar.l(remoteActionCompat.f1567d, 4);
        boolean z10 = remoteActionCompat.f1568e;
        if (aVar.h(5)) {
            z10 = aVar.e();
        }
        remoteActionCompat.f1568e = z10;
        boolean z11 = remoteActionCompat.f;
        if (aVar.h(6)) {
            z11 = aVar.e();
        }
        remoteActionCompat.f = z11;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1564a;
        aVar.o(1);
        aVar.w(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1565b;
        aVar.o(2);
        aVar.r(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f1566c;
        aVar.o(3);
        aVar.r(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f1567d;
        aVar.o(4);
        aVar.u(pendingIntent);
        boolean z10 = remoteActionCompat.f1568e;
        aVar.o(5);
        aVar.p(z10);
        boolean z11 = remoteActionCompat.f;
        aVar.o(6);
        aVar.p(z11);
    }
}
