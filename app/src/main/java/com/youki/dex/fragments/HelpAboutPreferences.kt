package com.youki.dex.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.youki.dex.R

class HelpAboutPreferences : PreferenceFragmentCompat() {
    override fun onCreatePreferences(arg0: Bundle?, arg1: String?) {
        setPreferencesFromResource(R.xml.preferences_help_about, arg1)

        // الضغط على صورة المطور → يفتح GitHub Profile
        findPreference<Preference>("open_github_profile")?.setOnPreferenceClickListener {
            openUrl("https://github.com/mrYouki")
            true
        }

        // الضغط على GitHub في قسم About Project → يفتح رابط المشروع
        findPreference<Preference>("open_github_project")?.setOnPreferenceClickListener {
            openUrl("https://github.com/mrYouki/YoukiDex-Android-Desktop")
            true
        }

        // زر المساعدة
        findPreference<Preference>("show_help")?.setOnPreferenceClickListener {
            MaterialAlertDialogBuilder(requireContext())
                .setTitle(R.string.help)
                .setView(R.layout.dialog_help)
                .setPositiveButton(R.string.ok, null)
                .show()
            false
        }
    }

    private fun openUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
