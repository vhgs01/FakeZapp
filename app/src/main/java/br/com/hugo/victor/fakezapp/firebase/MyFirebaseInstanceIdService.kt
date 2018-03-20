package br.com.hugo.victor.fakezapp.ui.util.firebase.fcm

import com.google.firebase.iid.FirebaseInstanceIdService
import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.orhanobut.hawk.Hawk


class MyFirebaseInstanceIdService : FirebaseInstanceIdService() {
    override fun onTokenRefresh() {

        // HAWK É UMA LIB QUE USA SHARE PREFERENCES
        Hawk.put("TOKENFIREBASE", FirebaseInstanceId.getInstance().token)
        // eNn2hAaVU-I:APA91bG9Wz9pUNoCWPZfhPBxgzAj1QeDgLb0ZT-_h25u3tYGNdrC_mfIqKwGVXVUzShFxjKTM3tihitKOvCZQ215o4YoQfFkUpj7hdX8baqrHYYWLLbIX4yRzIdKw4i6QiPlr42hlrmH
    }
}