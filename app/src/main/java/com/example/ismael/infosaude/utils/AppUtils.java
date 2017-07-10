package com.example.ismael.infosaude.utils;

import android.text.Editable;

/**
 * Created by Ismael on 09/07/2017.
 */

public class AppUtils {
    public static boolean isEmpty(Editable text) {
        if(text == null)
            return true;

        if(text.toString().isEmpty())
            return true;

        return false;

    }
}
