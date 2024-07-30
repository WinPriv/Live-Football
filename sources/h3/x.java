package h3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: TransformationUtils.java */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final Paint f28754a = new Paint(6);

    /* renamed from: b, reason: collision with root package name */
    public static final Lock f28755b;

    /* compiled from: TransformationUtils.java */
    /* loaded from: classes.dex */
    public static final class a implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public final Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public final boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public final boolean tryLock(long j10, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public final void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public final void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        public final void unlock() {
        }
    }

    static {
        Lock aVar;
        new Paint(7);
        if (new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079")).contains(Build.MODEL)) {
            aVar = new ReentrantLock();
        } else {
            aVar = new a();
        }
        f28755b = aVar;
        new Paint(7).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f28755b;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f28754a);
            canvas.setBitmap(null);
        } finally {
            lock.unlock();
        }
    }

    public static Bitmap b(b3.d dVar, Bitmap bitmap, int i10, int i11) {
        Bitmap.Config config;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
        int round = Math.round(bitmap.getWidth() * min);
        int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        int width = (int) (bitmap.getWidth() * min);
        int height = (int) (bitmap.getHeight() * min);
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap e10 = dVar.e(width, height, config);
        e10.setHasAlpha(bitmap.hasAlpha());
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i10 + "x" + i11);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + e10.getWidth() + "x" + e10.getHeight());
            StringBuilder sb2 = new StringBuilder("minPct:   ");
            sb2.append(min);
            Log.v("TransformationUtils", sb2.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, e10, matrix);
        return e10;
    }
}
