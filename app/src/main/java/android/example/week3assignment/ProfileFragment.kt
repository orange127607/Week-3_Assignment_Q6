package android.example.week3assignment

import android.example.week3assignment.database.ProfileDatabaseDao
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_profile.view.*

class ProfileFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        view!!.saveButton.setOnClickListener { listOf<ProfileDatabaseDao>() }
        return view
    }
}