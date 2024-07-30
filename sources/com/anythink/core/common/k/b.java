package com.anythink.core.common.k;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.io.FileDescriptor;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class b {
    public static int[] a(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            return new int[]{options.outWidth, options.outHeight};
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    private static Bitmap a(String str, int i10, int i11) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = a(options.outWidth, options.outHeight, i10, i11);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public static Bitmap a(FileDescriptor fileDescriptor, int i10, int i11) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            options.inSampleSize = a(options.outWidth, options.outHeight, i10, i11);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        } catch (OutOfMemoryError e10) {
            e10.printStackTrace();
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static int a(int i10, int i11, int i12, int i13) {
        int i14 = 1;
        if (i12 <= 0 && i13 <= 0) {
            return 1;
        }
        while (i10 / i14 > i12 && i11 / i14 > i13) {
            i14 *= 2;
        }
        return i14;
    }

    public static Bitmap a(Context context, Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            com.anythink.core.common.j.c.a("Error", "Error, cannot access an invalid/free'd bitmap here!", com.anythink.core.common.b.n.a().r());
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() / 3, bitmap.getHeight() / 3, Bitmap.Config.ARGB_8888);
            RenderScript create = RenderScript.create(context);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(25.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            new Canvas(createBitmap).drawColor(855638016);
            create.destroy();
            return createBitmap;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static Bitmap a(Bitmap bitmap) {
        int i10;
        int[] iArr;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i11 = width * height;
        int[] iArr2 = new int[i11];
        bitmap.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i12 = width - 1;
        int i13 = height - 1;
        int[] iArr3 = new int[i11];
        int[] iArr4 = new int[i11];
        int[] iArr5 = new int[i11];
        int[] iArr6 = new int[Math.max(width, height)];
        int[] iArr7 = new int[173056];
        for (int i14 = 0; i14 < 173056; i14++) {
            iArr7[i14] = i14 / 676;
        }
        int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 51, 3);
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            if (i15 >= height) {
                break;
            }
            int i18 = -25;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            for (int i28 = 25; i18 <= i28; i28 = 25) {
                int i29 = height;
                int i30 = iArr2[Math.min(i12, Math.max(i18, 0)) + i16];
                int[] iArr9 = iArr8[i18 + 25];
                iArr9[0] = (i30 & 16711680) >> 16;
                iArr9[1] = (i30 & 65280) >> 8;
                iArr9[2] = i30 & com.anythink.expressad.exoplayer.k.p.f9095b;
                int abs = 26 - Math.abs(i18);
                int i31 = iArr9[0];
                i19 = (i31 * abs) + i19;
                int i32 = iArr9[1];
                i20 = (i32 * abs) + i20;
                int i33 = iArr9[2];
                i21 = (abs * i33) + i21;
                if (i18 > 0) {
                    i25 += i31;
                    i26 += i32;
                    i27 += i33;
                } else {
                    i22 += i31;
                    i23 += i32;
                    i24 += i33;
                }
                i18++;
                height = i29;
            }
            int i34 = height;
            int i35 = 25;
            int i36 = 0;
            while (i36 < width) {
                iArr3[i16] = iArr7[i19];
                iArr4[i16] = iArr7[i20];
                iArr5[i16] = iArr7[i21];
                int i37 = i19 - i22;
                int i38 = i20 - i23;
                int i39 = i21 - i24;
                int[] iArr10 = iArr8[((i35 - 25) + 51) % 51];
                int i40 = i22 - iArr10[0];
                int i41 = i23 - iArr10[1];
                int i42 = i24 - iArr10[2];
                if (i15 == 0) {
                    iArr = iArr7;
                    iArr6[i36] = Math.min(i36 + 25 + 1, i12);
                } else {
                    iArr = iArr7;
                }
                int i43 = iArr2[iArr6[i36] + i17];
                int i44 = (i43 & 16711680) >> 16;
                iArr10[0] = i44;
                int i45 = (i43 & 65280) >> 8;
                iArr10[1] = i45;
                int i46 = i43 & com.anythink.expressad.exoplayer.k.p.f9095b;
                iArr10[2] = i46;
                int i47 = i25 + i44;
                int i48 = i26 + i45;
                int i49 = i27 + i46;
                i19 = i37 + i47;
                i20 = i38 + i48;
                i21 = i39 + i49;
                i35 = (i35 + 1) % 51;
                int[] iArr11 = iArr8[i35 % 51];
                int i50 = iArr11[0];
                i22 = i40 + i50;
                int i51 = iArr11[1];
                i23 = i41 + i51;
                int i52 = iArr11[2];
                i24 = i42 + i52;
                i25 = i47 - i50;
                i26 = i48 - i51;
                i27 = i49 - i52;
                i16++;
                i36++;
                iArr7 = iArr;
            }
            i17 += width;
            i15++;
            height = i34;
        }
        int[] iArr12 = iArr7;
        int i53 = height;
        int i54 = 0;
        while (i54 < width) {
            int i55 = width * (-25);
            int[] iArr13 = iArr6;
            int[] iArr14 = iArr2;
            int i56 = -25;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            int i63 = 0;
            int i64 = 0;
            int i65 = 0;
            for (int i66 = 25; i56 <= i66; i66 = 25) {
                int max = Math.max(0, i55) + i54;
                int[] iArr15 = iArr8[i56 + 25];
                iArr15[0] = iArr3[max];
                iArr15[1] = iArr4[max];
                iArr15[2] = iArr5[max];
                int abs2 = 26 - Math.abs(i56);
                i57 = (iArr3[max] * abs2) + i57;
                i58 = (iArr4[max] * abs2) + i58;
                i59 = (iArr5[max] * abs2) + i59;
                if (i56 > 0) {
                    i63 += iArr15[0];
                    i64 += iArr15[1];
                    i65 += iArr15[2];
                } else {
                    i60 += iArr15[0];
                    i61 += iArr15[1];
                    i62 += iArr15[2];
                }
                if (i56 < i13) {
                    i55 += width;
                }
                i56++;
            }
            int i67 = i54;
            int i68 = i53;
            int i69 = 0;
            int i70 = 25;
            while (i69 < i68) {
                iArr14[i67] = (iArr14[i67] & (-16777216)) | (iArr12[i57] << 16) | (iArr12[i58] << 8) | iArr12[i59];
                int i71 = i57 - i60;
                int i72 = i58 - i61;
                int i73 = i59 - i62;
                int[] iArr16 = iArr8[((i70 - 25) + 51) % 51];
                int i74 = i60 - iArr16[0];
                int i75 = i61 - iArr16[1];
                int i76 = i62 - iArr16[2];
                if (i54 == 0) {
                    i10 = i68;
                    iArr13[i69] = Math.min(i69 + 26, i13) * width;
                } else {
                    i10 = i68;
                }
                int i77 = iArr13[i69] + i54;
                int i78 = iArr3[i77];
                iArr16[0] = i78;
                int i79 = iArr4[i77];
                iArr16[1] = i79;
                int i80 = iArr5[i77];
                iArr16[2] = i80;
                int i81 = i63 + i78;
                int i82 = i64 + i79;
                int i83 = i65 + i80;
                i57 = i71 + i81;
                i58 = i72 + i82;
                i59 = i73 + i83;
                i70 = (i70 + 1) % 51;
                int[] iArr17 = iArr8[i70];
                int i84 = iArr17[0];
                i60 = i74 + i84;
                int i85 = iArr17[1];
                i61 = i75 + i85;
                int i86 = iArr17[2];
                i62 = i76 + i86;
                i63 = i81 - i84;
                i64 = i82 - i85;
                i65 = i83 - i86;
                i67 += width;
                i69++;
                i68 = i10;
            }
            i53 = i68;
            i54++;
            iArr6 = iArr13;
            iArr2 = iArr14;
        }
        bitmap.setPixels(iArr2, 0, width, 0, 0, width, i53);
        return bitmap;
    }
}
