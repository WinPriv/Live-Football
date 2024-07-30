package com.huawei.openalliance.ad.ppskit.utils;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class u implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (Pattern.matches("cpu[0-9]", file.getName())) {
            return true;
        }
        return false;
    }
}
