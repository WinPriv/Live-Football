package b5;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b5.e;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
/* loaded from: classes2.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f2906a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Looper looper) {
        super(looper);
        this.f2906a = eVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        e eVar = this.f2906a;
        eVar.getClass();
        int i10 = message.what;
        e.a aVar = null;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    AtomicReference<RuntimeException> atomicReference = eVar.f2912d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                    while (!atomicReference.compareAndSet(null, illegalStateException) && atomicReference.get() == null) {
                    }
                } else {
                    eVar.f2913e.a();
                }
            } else {
                e.a aVar2 = (e.a) message.obj;
                int i11 = aVar2.f2914a;
                int i12 = aVar2.f2915b;
                MediaCodec.CryptoInfo cryptoInfo = aVar2.f2917d;
                long j10 = aVar2.f2918e;
                int i13 = aVar2.f;
                try {
                    synchronized (e.f2908h) {
                        eVar.f2909a.queueSecureInputBuffer(i11, i12, cryptoInfo, j10, i13);
                    }
                } catch (RuntimeException e10) {
                    AtomicReference<RuntimeException> atomicReference2 = eVar.f2912d;
                    while (!atomicReference2.compareAndSet(null, e10) && atomicReference2.get() == null) {
                    }
                }
                aVar = aVar2;
            }
        } else {
            e.a aVar3 = (e.a) message.obj;
            try {
                eVar.f2909a.queueInputBuffer(aVar3.f2914a, aVar3.f2915b, aVar3.f2916c, aVar3.f2918e, aVar3.f);
            } catch (RuntimeException e11) {
                AtomicReference<RuntimeException> atomicReference3 = eVar.f2912d;
                while (!atomicReference3.compareAndSet(null, e11) && atomicReference3.get() == null) {
                }
            }
            aVar = aVar3;
        }
        if (aVar != null) {
            ArrayDeque<e.a> arrayDeque = e.f2907g;
            synchronized (arrayDeque) {
                arrayDeque.add(aVar);
            }
        }
    }
}
